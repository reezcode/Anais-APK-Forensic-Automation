package v1;

import android.graphics.PorterDuff;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes18.dex */
public final class r {

    /* loaded from: classes21.dex */
    public interface a {
    }

    /* loaded from: classes19.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f5639a;

        /* renamed from: b, reason: collision with root package name */
        public int f5640b;

        /* renamed from: c, reason: collision with root package name */
        public int f5641c;

        public b(int i5, int i6, int i7, int i8) {
            this.f5639a = i5;
            this.f5640b = i7;
            this.f5641c = i8;
        }
    }

    public static boolean a(View view) {
        return ViewCompat.getLayoutDirection(view) == 1;
    }

    public static PorterDuff.Mode b(int i5, PorterDuff.Mode mode) {
        if (i5 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i5 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i5 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i5) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
