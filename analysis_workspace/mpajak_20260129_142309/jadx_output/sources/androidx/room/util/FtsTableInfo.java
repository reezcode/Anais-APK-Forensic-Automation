package androidx.room.util;

import android.annotation.SuppressLint;
import android.database.Cursor;
import androidx.activity.d;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes16.dex */
public final class FtsTableInfo {
    public static final Companion Companion = new Companion(null);
    private static final String[] FTS_OPTIONS = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    @JvmField
    public final Set<String> columns;

    @JvmField
    public final String name;

    @JvmField
    public final Set<String> options;

    /* loaded from: classes19.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Set<String> readColumns(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
            Set createSetBuilder = SetsKt.createSetBuilder();
            Cursor query = supportSQLiteDatabase.query("PRAGMA table_info(`" + str + "`)");
            try {
                if (query.getColumnCount() > 0) {
                    int columnIndex = query.getColumnIndex("name");
                    while (query.moveToNext()) {
                        String string = query.getString(columnIndex);
                        Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(nameIndex)");
                        createSetBuilder.add(string);
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(query, null);
                return SetsKt.build(createSetBuilder);
            } finally {
            }
        }

        private final Set<String> readOptions(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
            Cursor query = supportSQLiteDatabase.query("SELECT * FROM sqlite_master WHERE `name` = '" + str + '\'');
            try {
                String sql = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("sql")) : "";
                CloseableKt.closeFinally(query, null);
                Intrinsics.checkNotNullExpressionValue(sql, "sql");
                return parseOptions(sql);
            } finally {
            }
        }

        @JvmStatic
        @VisibleForTesting
        public final Set<String> parseOptions(String createStatement) {
            int lastIndexOf$default;
            boolean z4;
            Intrinsics.checkNotNullParameter(createStatement, "createStatement");
            if (createStatement.length() == 0) {
                return SetsKt.emptySet();
            }
            int h5 = StringsKt.h(createStatement, '(', 0, 6) + 1;
            lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) createStatement, ')', 0, false, 6, (Object) null);
            String substring = createStatement.substring(h5, lastIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            ArrayList arrayList = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            int i5 = -1;
            int i6 = 0;
            int i7 = 0;
            while (i6 < substring.length()) {
                char charAt = substring.charAt(i6);
                int i8 = i7 + 1;
                if ((charAt == '\'' || charAt == '\"') || charAt == '`') {
                    if (!arrayDeque.isEmpty()) {
                        Character ch = (Character) arrayDeque.peek();
                        if (ch != null) {
                            if (ch.charValue() != charAt) {
                            }
                            arrayDeque.pop();
                        }
                    }
                    arrayDeque.push(Character.valueOf(charAt));
                } else if (charAt == '[') {
                    if (!arrayDeque.isEmpty()) {
                    }
                    arrayDeque.push(Character.valueOf(charAt));
                } else if (charAt == ']') {
                    if (!arrayDeque.isEmpty()) {
                        Character ch2 = (Character) arrayDeque.peek();
                        if (ch2 != null) {
                            if (ch2.charValue() != '[') {
                            }
                            arrayDeque.pop();
                        }
                    }
                } else if (charAt == ',' && arrayDeque.isEmpty()) {
                    String substring2 = substring.substring(i5 + 1, i7);
                    Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    int length = substring2.length() - 1;
                    int i9 = 0;
                    boolean z5 = false;
                    while (i9 <= length) {
                        boolean z6 = Intrinsics.compare((int) substring2.charAt(!z5 ? i9 : length), 32) <= 0;
                        if (z5) {
                            if (!z6) {
                                break;
                            }
                            length--;
                        } else if (z6) {
                            i9++;
                        } else {
                            z5 = true;
                        }
                    }
                    arrayList.add(substring2.subSequence(i9, length + 1).toString());
                    i5 = i7;
                }
                i6++;
                i7 = i8;
            }
            String substring3 = substring.substring(i5 + 1);
            Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String).substring(startIndex)");
            arrayList.add(StringsKt.trim((CharSequence) substring3).toString());
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String str = (String) next;
                String[] strArr = FtsTableInfo.FTS_OPTIONS;
                int length2 = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        z4 = false;
                        break;
                    }
                    if (StringsKt.u(str, strArr[i10])) {
                        z4 = true;
                        break;
                    }
                    i10++;
                }
                if (z4) {
                    arrayList2.add(next);
                }
            }
            return CollectionsKt.toSet(arrayList2);
        }

        @JvmStatic
        @SuppressLint({"SyntheticAccessor"})
        public final FtsTableInfo read(SupportSQLiteDatabase database, String tableName) {
            Intrinsics.checkNotNullParameter(database, "database");
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            return new FtsTableInfo(tableName, readColumns(database, tableName), readOptions(database, tableName));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FtsTableInfo(String name, Set<String> columns, String createSql) {
        this(name, columns, Companion.parseOptions(createSql));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(createSql, "createSql");
    }

    public FtsTableInfo(String name, Set<String> columns, Set<String> options) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(options, "options");
        this.name = name;
        this.columns = columns;
        this.options = options;
    }

    @JvmStatic
    @VisibleForTesting
    public static final Set<String> parseOptions(String str) {
        return Companion.parseOptions(str);
    }

    @JvmStatic
    @SuppressLint({"SyntheticAccessor"})
    public static final FtsTableInfo read(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        return Companion.read(supportSQLiteDatabase, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FtsTableInfo)) {
            return false;
        }
        FtsTableInfo ftsTableInfo = (FtsTableInfo) obj;
        if (Intrinsics.areEqual(this.name, ftsTableInfo.name) && Intrinsics.areEqual(this.columns, ftsTableInfo.columns)) {
            return Intrinsics.areEqual(this.options, ftsTableInfo.options);
        }
        return false;
    }

    public int hashCode() {
        return this.options.hashCode() + ((this.columns.hashCode() + (this.name.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder g5 = d.g("FtsTableInfo{name='");
        g5.append(this.name);
        g5.append("', columns=");
        g5.append(this.columns);
        g5.append(", options=");
        g5.append(this.options);
        g5.append("'}");
        return g5.toString();
    }
}
