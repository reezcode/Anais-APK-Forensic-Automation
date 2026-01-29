package androidx.room.util;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.MatrixCursor;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.EnvironmentCompat;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.io.FilenameUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@JvmName(name = "CursorUtil")
/* loaded from: classes20.dex */
public final class CursorUtil {
    public static final Cursor copyAndClose(Cursor c5) {
        Intrinsics.checkNotNullParameter(c5, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(c5.getColumnNames(), c5.getCount());
            while (c5.moveToNext()) {
                Object[] objArr = new Object[c5.getColumnCount()];
                int columnCount = c5.getColumnCount();
                for (int i5 = 0; i5 < columnCount; i5++) {
                    int type = c5.getType(i5);
                    if (type == 0) {
                        objArr[i5] = null;
                    } else if (type == 1) {
                        objArr[i5] = Long.valueOf(c5.getLong(i5));
                    } else if (type == 2) {
                        objArr[i5] = Double.valueOf(c5.getDouble(i5));
                    } else if (type == 3) {
                        objArr[i5] = c5.getString(i5);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i5] = c5.getBlob(i5);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            CloseableKt.closeFinally(c5, null);
            return matrixCursor;
        } finally {
        }
    }

    private static final int findColumnIndexBySuffix(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT > 25) {
            return -1;
        }
        if (str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        Intrinsics.checkNotNullExpressionValue(columnNames, "columnNames");
        return findColumnIndexBySuffix(columnNames, str);
    }

    @VisibleForTesting(otherwise = 2)
    public static final int findColumnIndexBySuffix(String[] columnNames, String name) {
        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        Intrinsics.checkNotNullParameter(name, "name");
        String str = FilenameUtils.EXTENSION_SEPARATOR + name;
        String str2 = FilenameUtils.EXTENSION_SEPARATOR + name + '`';
        int length = columnNames.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            String str3 = columnNames[i5];
            int i7 = i6 + 1;
            if (str3.length() >= name.length() + 2) {
                if (StringsKt.f(str3, str)) {
                    return i6;
                }
                if (str3.charAt(0) == '`' && StringsKt.f(str3, str2)) {
                    return i6;
                }
            }
            i5++;
            i6 = i7;
        }
        return -1;
    }

    public static final int getColumnIndex(Cursor c5, String name) {
        Intrinsics.checkNotNullParameter(c5, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = c5.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c5.getColumnIndex('`' + name + '`');
        return columnIndex2 >= 0 ? columnIndex2 : findColumnIndexBySuffix(c5, name);
    }

    public static final int getColumnIndexOrThrow(Cursor c5, String name) {
        String str;
        Intrinsics.checkNotNullParameter(c5, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = getColumnIndex(c5, name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = c5.getColumnNames();
            Intrinsics.checkNotNullExpressionValue(columnNames, "c.columnNames");
            str = ArraysKt___ArraysKt.joinToString$default(columnNames, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
        } catch (Exception e5) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e5);
            str = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        throw new IllegalArgumentException("column '" + name + "' does not exist. Available columns: " + str);
    }

    public static final <R> R useCursor(Cursor cursor, Function1<? super Cursor, ? extends R> block) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            R invoke = block.invoke(cursor);
            InlineMarker.finallyStart(1);
            CloseableKt.closeFinally(cursor, null);
            InlineMarker.finallyEnd(1);
            return invoke;
        } finally {
        }
    }

    public static final Cursor wrapMappedColumns(final Cursor cursor, final String[] columnNames, final int[] mapping) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        if (columnNames.length == mapping.length) {
            return new CursorWrapper(cursor) { // from class: androidx.room.util.CursorUtil$wrapMappedColumns$2
                @Override // android.database.CursorWrapper, android.database.Cursor
                public int getColumnIndex(String columnName) {
                    Intrinsics.checkNotNullParameter(columnName, "columnName");
                    String[] strArr = columnNames;
                    int[] iArr = mapping;
                    int length = strArr.length;
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < length) {
                        int i7 = i6 + 1;
                        if (StringsKt.g(strArr[i5], columnName)) {
                            return iArr[i6];
                        }
                        i5++;
                        i6 = i7;
                    }
                    return super.getColumnIndex(columnName);
                }
            };
        }
        throw new IllegalStateException("Expected columnNames.length == mapping.length".toString());
    }
}
