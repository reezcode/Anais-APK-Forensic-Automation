package n1;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import n1.d;

/* loaded from: classes21.dex */
public class c extends FrameLayout implements d {
    @Override // n1.d
    public final void a() {
        throw null;
    }

    @Override // n1.d
    public final void b() {
        throw null;
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
    }

    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        throw null;
    }

    @Override // n1.d
    public int getCircularRevealScrimColor() {
        throw null;
    }

    @Override // n1.d
    @Nullable
    public d.C0056d getRevealInfo() {
        throw null;
    }

    @Override // android.view.View
    public final boolean isOpaque() {
        return super.isOpaque();
    }

    @Override // n1.d
    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
        throw null;
    }

    @Override // n1.d
    public void setCircularRevealScrimColor(@ColorInt int i5) {
        throw null;
    }

    @Override // n1.d
    public void setRevealInfo(@Nullable d.C0056d c0056d) {
        throw null;
    }
}
