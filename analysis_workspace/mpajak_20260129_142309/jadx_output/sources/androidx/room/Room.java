package androidx.room;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.apache.commons.io.FilenameUtils;

/* loaded from: classes22.dex */
public final class Room {
    private static final String CURSOR_CONV_SUFFIX = "_CursorConverter";
    public static final Room INSTANCE = new Room();
    public static final String LOG_TAG = "ROOM";
    public static final String MASTER_TABLE_NAME = "room_master_table";

    private Room() {
    }

    @JvmStatic
    public static final <T extends RoomDatabase> RoomDatabase.Builder<T> databaseBuilder(Context context, Class<T> klass, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        if (true ^ (str == null || StringsKt.isBlank(str))) {
            return new RoomDatabase.Builder<>(context, klass, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T, C> T getGeneratedImplementation(Class<C> klass, String suffix) {
        String replace$default;
        String str;
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Package r12 = klass.getPackage();
        Intrinsics.checkNotNull(r12);
        String fullPackage = r12.getName();
        String canonicalName = klass.getCanonicalName();
        Intrinsics.checkNotNull(canonicalName);
        Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
        if (!(fullPackage.length() == 0)) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        StringBuilder sb = new StringBuilder();
        replace$default = StringsKt__StringsJVMKt.replace$default(canonicalName, FilenameUtils.EXTENSION_SEPARATOR, '_', false, 4, (Object) null);
        sb.append(replace$default);
        sb.append(suffix);
        String sb2 = sb.toString();
        try {
            if (fullPackage.length() == 0) {
                str = sb2;
            } else {
                str = fullPackage + FilenameUtils.EXTENSION_SEPARATOR + sb2;
            }
            Class<?> cls = Class.forName(str, true, klass.getClassLoader());
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return (T) cls.newInstance();
        } catch (ClassNotFoundException unused) {
            StringBuilder g5 = androidx.activity.d.g("Cannot find implementation for ");
            g5.append(klass.getCanonicalName());
            g5.append(". ");
            g5.append(sb2);
            g5.append(" does not exist");
            throw new RuntimeException(g5.toString());
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + klass + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + klass + ".canonicalName");
        }
    }

    @JvmStatic
    public static final <T extends RoomDatabase> RoomDatabase.Builder<T> inMemoryDatabaseBuilder(Context context, Class<T> klass) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        return new RoomDatabase.Builder<>(context, klass, null);
    }
}
