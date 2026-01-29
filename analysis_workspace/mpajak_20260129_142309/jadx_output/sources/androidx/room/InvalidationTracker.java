package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.LiveData;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes22.dex */
public class InvalidationTracker {
    private static final String CREATE_TRACKING_TABLE_SQL = "CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";
    private static final String INVALIDATED_COLUMN_NAME = "invalidated";
    public static final String RESET_UPDATED_TABLES_SQL = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1";
    public static final String SELECT_UPDATED_TABLES_SQL = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";
    private static final String TABLE_ID_COLUMN_NAME = "table_id";
    private static final String UPDATE_TABLE_NAME = "room_table_modification_log";
    private AutoCloser autoCloser;
    private volatile SupportSQLiteStatement cleanupStatement;
    private final RoomDatabase database;
    private volatile boolean initialized;
    private final InvalidationLiveDataContainer invalidationLiveDataContainer;
    private MultiInstanceInvalidationClient multiInstanceInvalidationClient;
    private final ObservedTableTracker observedTableTracker;

    @GuardedBy("observerMap")
    private final SafeIterableMap<Observer, ObserverWrapper> observerMap;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    private final AtomicBoolean pendingRefresh;

    @JvmField
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final Runnable refreshRunnable;
    private final Map<String, String> shadowTablesMap;
    private final Object syncTriggersLock;
    private final Map<String, Integer> tableIdLookup;
    private final String[] tablesNames;
    private final Object trackerLock;
    private final Map<String, Set<String>> viewTables;
    public static final Companion Companion = new Companion(null);
    private static final String[] TRIGGERS = {"UPDATE", "DELETE", "INSERT"};

    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void getRESET_UPDATED_TABLES_SQL$room_runtime_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getSELECT_UPDATED_TABLES_SQL$room_runtime_release$annotations() {
        }

        public final void beginTransactionInternal$room_runtime_release(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            if (database.isWriteAheadLoggingEnabled()) {
                database.beginTransactionNonExclusive();
            } else {
                database.beginTransaction();
            }
        }

        public final String getTriggerName$room_runtime_release(String tableName, String triggerType) {
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            Intrinsics.checkNotNullParameter(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }
    }

    /* loaded from: classes12.dex */
    public static final class ObservedTableTracker {
        public static final int ADD = 1;
        public static final Companion Companion = new Companion(null);
        public static final int NO_OP = 0;
        public static final int REMOVE = 2;
        private boolean needsSync;
        private final long[] tableObservers;
        private final int[] triggerStateChanges;
        private final boolean[] triggerStates;

        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public ObservedTableTracker(int i5) {
            this.tableObservers = new long[i5];
            this.triggerStates = new boolean[i5];
            this.triggerStateChanges = new int[i5];
        }

        public final boolean getNeedsSync() {
            return this.needsSync;
        }

        public final long[] getTableObservers() {
            return this.tableObservers;
        }

        @VisibleForTesting
        @JvmName(name = "getTablesToSync")
        public final int[] getTablesToSync() {
            synchronized (this) {
                if (!this.needsSync) {
                    return null;
                }
                long[] jArr = this.tableObservers;
                int length = jArr.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length) {
                    int i7 = i6 + 1;
                    int i8 = 1;
                    boolean z4 = jArr[i5] > 0;
                    boolean[] zArr = this.triggerStates;
                    if (z4 != zArr[i6]) {
                        int[] iArr = this.triggerStateChanges;
                        if (!z4) {
                            i8 = 2;
                        }
                        iArr[i6] = i8;
                    } else {
                        this.triggerStateChanges[i6] = 0;
                    }
                    zArr[i6] = z4;
                    i5++;
                    i6 = i7;
                }
                this.needsSync = false;
                return (int[]) this.triggerStateChanges.clone();
            }
        }

        public final boolean onAdded(int... tableIds) {
            boolean z4;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                z4 = false;
                for (int i5 : tableIds) {
                    long[] jArr = this.tableObservers;
                    long j5 = jArr[i5];
                    jArr[i5] = 1 + j5;
                    if (j5 == 0) {
                        this.needsSync = true;
                        z4 = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
            return z4;
        }

        public final boolean onRemoved(int... tableIds) {
            boolean z4;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                z4 = false;
                for (int i5 : tableIds) {
                    long[] jArr = this.tableObservers;
                    long j5 = jArr[i5];
                    jArr[i5] = j5 - 1;
                    if (j5 == 1) {
                        this.needsSync = true;
                        z4 = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
            return z4;
        }

        public final void resetTriggerState() {
            synchronized (this) {
                Arrays.fill(this.triggerStates, false);
                this.needsSync = true;
                Unit unit = Unit.INSTANCE;
            }
        }

        public final void setNeedsSync(boolean z4) {
            this.needsSync = z4;
        }
    }

    /* loaded from: classes15.dex */
    public static abstract class Observer {
        private final String[] tables;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Observer(java.lang.String r2, java.lang.String... r3) {
            /*
                r1 = this;
                java.lang.String r0 = "firstTable"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "rest"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.util.List r0 = kotlin.collections.CollectionsKt.createListBuilder()
                kotlin.collections.CollectionsKt.addAll(r0, r3)
                r0.add(r2)
                java.util.List r2 = kotlin.collections.CollectionsKt.build(r0)
                r3 = 0
                java.lang.String[] r3 = new java.lang.String[r3]
                java.lang.Object[] r2 = r2.toArray(r3)
                java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
                java.lang.String[] r2 = (java.lang.String[]) r2
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.InvalidationTracker.Observer.<init>(java.lang.String, java.lang.String[]):void");
        }

        public Observer(String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            this.tables = tables;
        }

        public final String[] getTables$room_runtime_release() {
            return this.tables;
        }

        public boolean isRemote$room_runtime_release() {
            return false;
        }

        public abstract void onInvalidated(Set<String> set);
    }

    /* loaded from: classes9.dex */
    public static final class ObserverWrapper {
        private final Observer observer;
        private final Set<String> singleTableSet;
        private final int[] tableIds;
        private final String[] tableNames;

        public ObserverWrapper(Observer observer, int[] tableIds, String[] tableNames) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            Intrinsics.checkNotNullParameter(tableNames, "tableNames");
            this.observer = observer;
            this.tableIds = tableIds;
            this.tableNames = tableNames;
            this.singleTableSet = (tableNames.length == 0) ^ true ? SetsKt.setOf(tableNames[0]) : SetsKt.emptySet();
            if (!(tableIds.length == tableNames.length)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        public final Observer getObserver$room_runtime_release() {
            return this.observer;
        }

        public final int[] getTableIds$room_runtime_release() {
            return this.tableIds;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void notifyByTableInvalidStatus$room_runtime_release(java.util.Set<java.lang.Integer> r9) {
            /*
                r8 = this;
                java.lang.String r0 = "invalidatedTablesIds"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                int[] r0 = r8.tableIds
                int r1 = r0.length
                r2 = 1
                if (r1 == 0) goto L45
                r3 = 0
                if (r1 == r2) goto L36
                java.util.Set r0 = kotlin.collections.SetsKt.createSetBuilder()
                int[] r1 = r8.tableIds
                int r4 = r1.length
                r5 = 0
            L16:
                if (r3 >= r4) goto L31
                r6 = r1[r3]
                int r7 = r5 + 1
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                boolean r6 = r9.contains(r6)
                if (r6 == 0) goto L2d
                java.lang.String[] r6 = r8.tableNames
                r5 = r6[r5]
                r0.add(r5)
            L2d:
                int r3 = r3 + 1
                r5 = r7
                goto L16
            L31:
                java.util.Set r9 = kotlin.collections.SetsKt.build(r0)
                goto L49
            L36:
                r0 = r0[r3]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                boolean r9 = r9.contains(r0)
                if (r9 == 0) goto L45
                java.util.Set<java.lang.String> r9 = r8.singleTableSet
                goto L49
            L45:
                java.util.Set r9 = kotlin.collections.SetsKt.emptySet()
            L49:
                boolean r0 = r9.isEmpty()
                r0 = r0 ^ r2
                if (r0 == 0) goto L55
                androidx.room.InvalidationTracker$Observer r0 = r8.observer
                r0.onInvalidated(r9)
            L55:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.InvalidationTracker.ObserverWrapper.notifyByTableInvalidStatus$room_runtime_release(java.util.Set):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void notifyByTableNames$room_runtime_release(java.lang.String[] r12) {
            /*
                r11 = this;
                java.lang.String r0 = "tables"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                java.lang.String[] r0 = r11.tableNames
                int r0 = r0.length
                r1 = 1
                if (r0 == 0) goto L4e
                r2 = 0
                if (r0 == r1) goto L34
                java.util.Set r0 = kotlin.collections.SetsKt.createSetBuilder()
                int r3 = r12.length
                r4 = 0
            L14:
                if (r4 >= r3) goto L2f
                r5 = r12[r4]
                java.lang.String[] r6 = r11.tableNames
                int r7 = r6.length
                r8 = 0
            L1c:
                if (r8 >= r7) goto L2c
                r9 = r6[r8]
                boolean r10 = kotlin.text.StringsKt.g(r9, r5)
                if (r10 == 0) goto L29
                r0.add(r9)
            L29:
                int r8 = r8 + 1
                goto L1c
            L2c:
                int r4 = r4 + 1
                goto L14
            L2f:
                java.util.Set r12 = kotlin.collections.SetsKt.build(r0)
                goto L52
            L34:
                int r0 = r12.length
                r3 = 0
            L36:
                if (r3 >= r0) goto L49
                r4 = r12[r3]
                java.lang.String[] r5 = r11.tableNames
                r5 = r5[r2]
                boolean r4 = kotlin.text.StringsKt.g(r4, r5)
                if (r4 == 0) goto L46
                r2 = 1
                goto L49
            L46:
                int r3 = r3 + 1
                goto L36
            L49:
                if (r2 == 0) goto L4e
                java.util.Set<java.lang.String> r12 = r11.singleTableSet
                goto L52
            L4e:
                java.util.Set r12 = kotlin.collections.SetsKt.emptySet()
            L52:
                boolean r0 = r12.isEmpty()
                r0 = r0 ^ r1
                if (r0 == 0) goto L5e
                androidx.room.InvalidationTracker$Observer r0 = r11.observer
                r0.onInvalidated(r12)
            L5e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.InvalidationTracker.ObserverWrapper.notifyByTableNames$room_runtime_release(java.lang.String[]):void");
        }
    }

    /* loaded from: classes16.dex */
    public static final class WeakObserver extends Observer {
        private final WeakReference<Observer> delegateRef;
        private final InvalidationTracker tracker;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WeakObserver(InvalidationTracker tracker, Observer delegate) {
            super(delegate.getTables$room_runtime_release());
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.tracker = tracker;
            this.delegateRef = new WeakReference<>(delegate);
        }

        public final WeakReference<Observer> getDelegateRef() {
            return this.delegateRef;
        }

        public final InvalidationTracker getTracker() {
            return this.tracker;
        }

        @Override // androidx.room.InvalidationTracker.Observer
        public void onInvalidated(Set<String> tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            Observer observer = this.delegateRef.get();
            if (observer == null) {
                this.tracker.removeObserver(this);
            } else {
                observer.onInvalidated(tables);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(RoomDatabase database, Map<String, String> shadowTablesMap, Map<String, Set<String>> viewTables, String... tableNames) {
        String str;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.database = database;
        this.shadowTablesMap = shadowTablesMap;
        this.viewTables = viewTables;
        this.pendingRefresh = new AtomicBoolean(false);
        this.observedTableTracker = new ObservedTableTracker(tableNames.length);
        this.invalidationLiveDataContainer = new InvalidationLiveDataContainer(database);
        this.observerMap = new SafeIterableMap<>();
        this.syncTriggersLock = new Object();
        this.trackerLock = new Object();
        this.tableIdLookup = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i5 = 0; i5 < length; i5++) {
            String str2 = tableNames[i5];
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str2.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.tableIdLookup.put(lowerCase, Integer.valueOf(i5));
            String str3 = this.shadowTablesMap.get(tableNames[i5]);
            if (str3 != null) {
                Intrinsics.checkNotNullExpressionValue(US, "US");
                str = str3.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr[i5] = lowerCase;
        }
        this.tablesNames = strArr;
        for (Map.Entry<String, String> entry : this.shadowTablesMap.entrySet()) {
            String value = entry.getValue();
            Locale US2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US2, "US");
            String lowerCase2 = value.toLowerCase(US2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.tableIdLookup.containsKey(lowerCase2)) {
                String key = entry.getKey();
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase3 = key.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map<String, Integer> map = this.tableIdLookup;
                map.put(lowerCase3, MapsKt.getValue(map, lowerCase2));
            }
        }
        this.refreshRunnable = new Runnable() { // from class: androidx.room.InvalidationTracker$refreshRunnable$1
            private final Set<Integer> checkUpdatedTable() {
                InvalidationTracker invalidationTracker = InvalidationTracker.this;
                Set createSetBuilder = SetsKt.createSetBuilder();
                Cursor query$default = RoomDatabase.query$default(invalidationTracker.getDatabase$room_runtime_release(), new SimpleSQLiteQuery(InvalidationTracker.SELECT_UPDATED_TABLES_SQL), null, 2, null);
                while (query$default.moveToNext()) {
                    try {
                        createSetBuilder.add(Integer.valueOf(query$default.getInt(0)));
                    } finally {
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(query$default, null);
                Set<Integer> build = SetsKt.build(createSetBuilder);
                if (!build.isEmpty()) {
                    if (InvalidationTracker.this.getCleanupStatement$room_runtime_release() == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    SupportSQLiteStatement cleanupStatement$room_runtime_release = InvalidationTracker.this.getCleanupStatement$room_runtime_release();
                    if (cleanupStatement$room_runtime_release == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    cleanupStatement$room_runtime_release.executeUpdateDelete();
                }
                return build;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
            
                if (r0 != null) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
            
                r0.decrementCountAndScheduleClose();
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00c2, code lost:
            
                if ((!r3.isEmpty()) == false) goto L56;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00c4, code lost:
            
                r0 = r5.this$0.getObserverMap$room_runtime_release();
                r1 = r5.this$0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00cc, code lost:
            
                monitor-enter(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00cd, code lost:
            
                r1 = r1.getObserverMap$room_runtime_release().iterator();
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00d9, code lost:
            
                if (r1.hasNext() == false) goto L66;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00db, code lost:
            
                ((androidx.room.InvalidationTracker.ObserverWrapper) ((java.util.Map.Entry) r1.next()).getValue()).notifyByTableInvalidStatus$room_runtime_release(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00eb, code lost:
            
                r1 = kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00ed, code lost:
            
                monitor-exit(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x00f2, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x00a2, code lost:
            
                if (r0 == null) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x00ba, code lost:
            
                if (r0 == null) goto L42;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 258
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.InvalidationTracker$refreshRunnable$1.run():void");
            }
        };
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(RoomDatabase database, String... tableNames) {
        this(database, MapsKt.emptyMap(), MapsKt.emptyMap(), (String[]) Arrays.copyOf(tableNames, tableNames.length));
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
    }

    @VisibleForTesting
    public static /* synthetic */ void getRefreshRunnable$annotations() {
    }

    private final String[] resolveViews(String[] strArr) {
        Set createSetBuilder = SetsKt.createSetBuilder();
        for (String str : strArr) {
            Map<String, Set<String>> map = this.viewTables;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.viewTables;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map2.get(lowerCase2);
                Intrinsics.checkNotNull(set);
                createSetBuilder.addAll(set);
            } else {
                createSetBuilder.add(str);
            }
        }
        Object[] array = SetsKt.build(createSetBuilder).toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    private final void startTrackingTable(SupportSQLiteDatabase supportSQLiteDatabase, int i5) {
        supportSQLiteDatabase.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i5 + ", 0)");
        String str = this.tablesNames[i5];
        for (String str2 : TRIGGERS) {
            StringBuilder g5 = androidx.activity.d.g("CREATE TEMP TRIGGER IF NOT EXISTS ");
            g5.append(Companion.getTriggerName$room_runtime_release(str, str2));
            g5.append(" AFTER ");
            g5.append(str2);
            g5.append(" ON `");
            g5.append(str);
            g5.append("` BEGIN UPDATE ");
            g5.append(UPDATE_TABLE_NAME);
            g5.append(" SET ");
            g5.append(INVALIDATED_COLUMN_NAME);
            g5.append(" = 1");
            g5.append(" WHERE ");
            g5.append(TABLE_ID_COLUMN_NAME);
            g5.append(" = ");
            g5.append(i5);
            g5.append(" AND ");
            g5.append(INVALIDATED_COLUMN_NAME);
            g5.append(" = 0");
            g5.append("; END");
            String sb = g5.toString();
            Intrinsics.checkNotNullExpressionValue(sb, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase.execSQL(sb);
        }
    }

    private final void stopTrackingTable(SupportSQLiteDatabase supportSQLiteDatabase, int i5) {
        String str = this.tablesNames[i5];
        for (String str2 : TRIGGERS) {
            StringBuilder g5 = androidx.activity.d.g("DROP TRIGGER IF EXISTS ");
            g5.append(Companion.getTriggerName$room_runtime_release(str, str2));
            String sb = g5.toString();
            Intrinsics.checkNotNullExpressionValue(sb, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase.execSQL(sb);
        }
    }

    private final String[] validateAndResolveTableNames(String[] strArr) {
        String[] resolveViews = resolveViews(strArr);
        for (String str : resolveViews) {
            Map<String, Integer> map = this.tableIdLookup;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!map.containsKey(lowerCase)) {
                throw new IllegalArgumentException(androidx.activity.d.f("There is no table with name ", str).toString());
            }
        }
        return resolveViews;
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public void addObserver(Observer observer) {
        ObserverWrapper putIfAbsent;
        Intrinsics.checkNotNullParameter(observer, "observer");
        String[] resolveViews = resolveViews(observer.getTables$room_runtime_release());
        ArrayList arrayList = new ArrayList(resolveViews.length);
        for (String str : resolveViews) {
            Map<String, Integer> map = this.tableIdLookup;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException(androidx.activity.d.f("There is no table with name ", str));
            }
            arrayList.add(Integer.valueOf(num.intValue()));
        }
        int[] intArray = CollectionsKt.toIntArray(arrayList);
        ObserverWrapper observerWrapper = new ObserverWrapper(observer, intArray, resolveViews);
        synchronized (this.observerMap) {
            putIfAbsent = this.observerMap.putIfAbsent(observer, observerWrapper);
        }
        if (putIfAbsent == null && this.observedTableTracker.onAdded(Arrays.copyOf(intArray, intArray.length))) {
            syncTriggers$room_runtime_release();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void addWeakObserver(Observer observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        addObserver(new WeakObserver(this, observer));
    }

    @Deprecated(message = "Use [createLiveData(String[], boolean, Callable)]")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public <T> LiveData<T> createLiveData(String[] tableNames, Callable<T> computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return createLiveData(tableNames, false, computeFunction);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public <T> LiveData<T> createLiveData(String[] tableNames, boolean z4, Callable<T> computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return this.invalidationLiveDataContainer.create(validateAndResolveTableNames(tableNames), z4, computeFunction);
    }

    public final boolean ensureInitialization$room_runtime_release() {
        if (!this.database.isOpen()) {
            return false;
        }
        if (!this.initialized) {
            this.database.getOpenHelper().getWritableDatabase();
        }
        if (this.initialized) {
            return true;
        }
        Log.e(Room.LOG_TAG, "database is not initialized even though it is open");
        return false;
    }

    public final SupportSQLiteStatement getCleanupStatement$room_runtime_release() {
        return this.cleanupStatement;
    }

    public final RoomDatabase getDatabase$room_runtime_release() {
        return this.database;
    }

    public final SafeIterableMap<Observer, ObserverWrapper> getObserverMap$room_runtime_release() {
        return this.observerMap;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final AtomicBoolean getPendingRefresh() {
        return this.pendingRefresh;
    }

    public final Map<String, Integer> getTableIdLookup$room_runtime_release() {
        return this.tableIdLookup;
    }

    public final String[] getTablesNames$room_runtime_release() {
        return this.tablesNames;
    }

    public final void internalInit$room_runtime_release(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        synchronized (this.trackerLock) {
            if (this.initialized) {
                Log.e(Room.LOG_TAG, "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.execSQL("PRAGMA temp_store = MEMORY;");
            database.execSQL("PRAGMA recursive_triggers='ON';");
            database.execSQL(CREATE_TRACKING_TABLE_SQL);
            syncTriggers$room_runtime_release(database);
            this.cleanupStatement = database.compileStatement(RESET_UPDATED_TABLES_SQL);
            this.initialized = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting(otherwise = 3)
    public final void notifyObserversByTableNames(String... tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        synchronized (this.observerMap) {
            Iterator<Map.Entry<K, V>> it = this.observerMap.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Intrinsics.checkNotNullExpressionValue(entry, "(observer, wrapper)");
                Observer observer = (Observer) entry.getKey();
                ObserverWrapper observerWrapper = (ObserverWrapper) entry.getValue();
                if (!observer.isRemote$room_runtime_release()) {
                    observerWrapper.notifyByTableNames$room_runtime_release(tables);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void onAutoCloseCallback$room_runtime_release() {
        synchronized (this.trackerLock) {
            this.initialized = false;
            this.observedTableTracker.resetTriggerState();
            Unit unit = Unit.INSTANCE;
        }
    }

    public void refreshVersionsAsync() {
        if (this.pendingRefresh.compareAndSet(false, true)) {
            AutoCloser autoCloser = this.autoCloser;
            if (autoCloser != null) {
                autoCloser.incrementCountAndEnsureDbIsOpen();
            }
            this.database.getQueryExecutor().execute(this.refreshRunnable);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @WorkerThread
    public void refreshVersionsSync() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser != null) {
            autoCloser.incrementCountAndEnsureDbIsOpen();
        }
        syncTriggers$room_runtime_release();
        this.refreshRunnable.run();
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public void removeObserver(Observer observer) {
        ObserverWrapper remove;
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.observerMap) {
            remove = this.observerMap.remove(observer);
        }
        if (remove != null) {
            ObservedTableTracker observedTableTracker = this.observedTableTracker;
            int[] tableIds$room_runtime_release = remove.getTableIds$room_runtime_release();
            if (observedTableTracker.onRemoved(Arrays.copyOf(tableIds$room_runtime_release, tableIds$room_runtime_release.length))) {
                syncTriggers$room_runtime_release();
            }
        }
    }

    public final void setAutoCloser$room_runtime_release(AutoCloser autoCloser) {
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.autoCloser = autoCloser;
        autoCloser.setAutoCloseCallback(new b(this, 0));
    }

    public final void setCleanupStatement$room_runtime_release(SupportSQLiteStatement supportSQLiteStatement) {
        this.cleanupStatement = supportSQLiteStatement;
    }

    public final void startMultiInstanceInvalidation$room_runtime_release(Context context, String name, Intent serviceIntent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        this.multiInstanceInvalidationClient = new MultiInstanceInvalidationClient(context, name, serviceIntent, this, this.database.getQueryExecutor());
    }

    public final void stopMultiInstanceInvalidation$room_runtime_release() {
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
        if (multiInstanceInvalidationClient != null) {
            multiInstanceInvalidationClient.stop();
        }
        this.multiInstanceInvalidationClient = null;
    }

    public final void syncTriggers$room_runtime_release() {
        if (this.database.isOpen()) {
            syncTriggers$room_runtime_release(this.database.getOpenHelper().getWritableDatabase());
        }
    }

    public final void syncTriggers$room_runtime_release(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (database.inTransaction()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.database.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.syncTriggersLock) {
                    int[] tablesToSync = this.observedTableTracker.getTablesToSync();
                    if (tablesToSync == null) {
                        return;
                    }
                    Companion.beginTransactionInternal$room_runtime_release(database);
                    try {
                        int length = tablesToSync.length;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < length) {
                            int i7 = tablesToSync[i5];
                            int i8 = i6 + 1;
                            if (i7 == 1) {
                                startTrackingTable(database, i6);
                            } else if (i7 == 2) {
                                stopTrackingTable(database, i6);
                            }
                            i5++;
                            i6 = i8;
                        }
                        database.setTransactionSuccessful();
                        database.endTransaction();
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        database.endTransaction();
                        throw th;
                    }
                }
            } finally {
                closeLock$room_runtime_release.unlock();
            }
        } catch (SQLiteException | IllegalStateException e5) {
            Log.e(Room.LOG_TAG, "Cannot run invalidation tracker. Is the db closed?", e5);
        }
    }
}
