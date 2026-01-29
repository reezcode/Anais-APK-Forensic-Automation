package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@RequiresApi(21)
/* loaded from: classes4.dex */
final class BundleApi21ImplKt {
    public static final BundleApi21ImplKt INSTANCE = new BundleApi21ImplKt();

    private BundleApi21ImplKt() {
    }

    @JvmStatic
    @DoNotInline
    public static final void putSize(Bundle bundle, String key, Size size) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putSize(key, size);
    }

    @JvmStatic
    @DoNotInline
    public static final void putSizeF(Bundle bundle, String key, SizeF sizeF) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putSizeF(key, sizeF);
    }
}
