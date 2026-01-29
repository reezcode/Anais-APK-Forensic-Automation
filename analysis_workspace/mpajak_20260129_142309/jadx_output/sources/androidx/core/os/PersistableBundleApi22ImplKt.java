package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@RequiresApi(22)
/* loaded from: classes16.dex */
final class PersistableBundleApi22ImplKt {
    public static final PersistableBundleApi22ImplKt INSTANCE = new PersistableBundleApi22ImplKt();

    private PersistableBundleApi22ImplKt() {
    }

    @JvmStatic
    @DoNotInline
    public static final void putBoolean(PersistableBundle persistableBundle, String str, boolean z4) {
        Intrinsics.checkNotNullParameter(persistableBundle, "persistableBundle");
        persistableBundle.putBoolean(str, z4);
    }

    @JvmStatic
    @DoNotInline
    public static final void putBooleanArray(PersistableBundle persistableBundle, String str, boolean[] value) {
        Intrinsics.checkNotNullParameter(persistableBundle, "persistableBundle");
        Intrinsics.checkNotNullParameter(value, "value");
        persistableBundle.putBooleanArray(str, value);
    }
}
