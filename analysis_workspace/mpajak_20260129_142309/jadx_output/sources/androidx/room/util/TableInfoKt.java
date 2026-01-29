package androidx.room.util;

import android.database.Cursor;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class TableInfoKt {
    private static final Map<String, TableInfo.Column> readColumns(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Cursor query = supportSQLiteDatabase.query("PRAGMA table_info(`" + str + "`)");
        try {
            if (query.getColumnCount() <= 0) {
                Map<String, TableInfo.Column> emptyMap = MapsKt.emptyMap();
                CloseableKt.closeFinally(query, null);
                return emptyMap;
            }
            int columnIndex = query.getColumnIndex("name");
            int columnIndex2 = query.getColumnIndex("type");
            int columnIndex3 = query.getColumnIndex("notnull");
            int columnIndex4 = query.getColumnIndex("pk");
            int columnIndex5 = query.getColumnIndex("dflt_value");
            Map createMapBuilder = MapsKt.createMapBuilder();
            while (query.moveToNext()) {
                String name = query.getString(columnIndex);
                String type = query.getString(columnIndex2);
                boolean z4 = query.getInt(columnIndex3) != 0;
                int i5 = query.getInt(columnIndex4);
                String string = query.getString(columnIndex5);
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Intrinsics.checkNotNullExpressionValue(type, "type");
                createMapBuilder.put(name, new TableInfo.Column(name, type, z4, i5, string, 2));
            }
            Map<String, TableInfo.Column> build = MapsKt.build(createMapBuilder);
            CloseableKt.closeFinally(query, null);
            return build;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(query, th);
                throw th2;
            }
        }
    }

    private static final List<TableInfo.ForeignKeyWithSequence> readForeignKeyFieldMappings(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex(TypedValues.TransitionType.S_FROM);
        int columnIndex4 = cursor.getColumnIndex(TypedValues.TransitionType.S_TO);
        List createListBuilder = CollectionsKt.createListBuilder();
        while (cursor.moveToNext()) {
            int i5 = cursor.getInt(columnIndex);
            int i6 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(toColumnIndex)");
            createListBuilder.add(new TableInfo.ForeignKeyWithSequence(i5, i6, string, string2));
        }
        return CollectionsKt.sorted(CollectionsKt.build(createListBuilder));
    }

    private static final Set<TableInfo.ForeignKey> readForeignKeys(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Cursor query = supportSQLiteDatabase.query("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = query.getColumnIndex("id");
            int columnIndex2 = query.getColumnIndex("seq");
            int columnIndex3 = query.getColumnIndex("table");
            int columnIndex4 = query.getColumnIndex("on_delete");
            int columnIndex5 = query.getColumnIndex("on_update");
            List<TableInfo.ForeignKeyWithSequence> readForeignKeyFieldMappings = readForeignKeyFieldMappings(query);
            query.moveToPosition(-1);
            Set createSetBuilder = SetsKt.createSetBuilder();
            while (query.moveToNext()) {
                if (query.getInt(columnIndex2) == 0) {
                    int i5 = query.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<TableInfo.ForeignKeyWithSequence> arrayList3 = new ArrayList();
                    for (Object obj : readForeignKeyFieldMappings) {
                        if (((TableInfo.ForeignKeyWithSequence) obj).getId() == i5) {
                            arrayList3.add(obj);
                        }
                    }
                    for (TableInfo.ForeignKeyWithSequence foreignKeyWithSequence : arrayList3) {
                        arrayList.add(foreignKeyWithSequence.getFrom());
                        arrayList2.add(foreignKeyWithSequence.getTo());
                    }
                    String string = query.getString(columnIndex3);
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(tableColumnIndex)");
                    String string2 = query.getString(columnIndex4);
                    Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = query.getString(columnIndex5);
                    Intrinsics.checkNotNullExpressionValue(string3, "cursor.getString(onUpdateColumnIndex)");
                    createSetBuilder.add(new TableInfo.ForeignKey(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set<TableInfo.ForeignKey> build = SetsKt.build(createSetBuilder);
            CloseableKt.closeFinally(query, null);
            return build;
        } finally {
        }
    }

    private static final TableInfo.Index readIndex(SupportSQLiteDatabase supportSQLiteDatabase, String str, boolean z4) {
        Cursor query = supportSQLiteDatabase.query("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = query.getColumnIndex("seqno");
            int columnIndex2 = query.getColumnIndex("cid");
            int columnIndex3 = query.getColumnIndex("name");
            int columnIndex4 = query.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (query.moveToNext()) {
                    if (query.getInt(columnIndex2) >= 0) {
                        int i5 = query.getInt(columnIndex);
                        String columnName = query.getString(columnIndex3);
                        String str2 = query.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer valueOf = Integer.valueOf(i5);
                        Intrinsics.checkNotNullExpressionValue(columnName, "columnName");
                        treeMap.put(valueOf, columnName);
                        treeMap2.put(Integer.valueOf(i5), str2);
                    }
                }
                Collection values = treeMap.values();
                Intrinsics.checkNotNullExpressionValue(values, "columnsMap.values");
                List list = CollectionsKt.toList(values);
                Collection values2 = treeMap2.values();
                Intrinsics.checkNotNullExpressionValue(values2, "ordersMap.values");
                TableInfo.Index index = new TableInfo.Index(str, z4, list, CollectionsKt.toList(values2));
                CloseableKt.closeFinally(query, null);
                return index;
            }
            CloseableKt.closeFinally(query, null);
            return null;
        } finally {
        }
    }

    private static final Set<TableInfo.Index> readIndices(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Cursor query = supportSQLiteDatabase.query("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = query.getColumnIndex("name");
            int columnIndex2 = query.getColumnIndex("origin");
            int columnIndex3 = query.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                Set createSetBuilder = SetsKt.createSetBuilder();
                while (query.moveToNext()) {
                    if (Intrinsics.areEqual("c", query.getString(columnIndex2))) {
                        String name = query.getString(columnIndex);
                        boolean z4 = true;
                        if (query.getInt(columnIndex3) != 1) {
                            z4 = false;
                        }
                        Intrinsics.checkNotNullExpressionValue(name, "name");
                        TableInfo.Index readIndex = readIndex(supportSQLiteDatabase, name, z4);
                        if (readIndex == null) {
                            CloseableKt.closeFinally(query, null);
                            return null;
                        }
                        createSetBuilder.add(readIndex);
                    }
                }
                Set<TableInfo.Index> build = SetsKt.build(createSetBuilder);
                CloseableKt.closeFinally(query, null);
                return build;
            }
            CloseableKt.closeFinally(query, null);
            return null;
        } finally {
        }
    }

    public static final TableInfo readTableInfo(SupportSQLiteDatabase database, String tableName) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        return new TableInfo(tableName, readColumns(database, tableName), readForeignKeys(database, tableName), readIndices(database, tableName));
    }
}
