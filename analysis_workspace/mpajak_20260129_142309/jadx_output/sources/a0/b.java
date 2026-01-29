package a0;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.util.Objects;
import r.s;
import r.w;

/* loaded from: classes18.dex */
public abstract class b<T extends Drawable> implements w<T>, s {

    /* renamed from: b, reason: collision with root package name */
    public final T f22b;

    public b(T t4) {
        Objects.requireNonNull(t4, "Argument must not be null");
        this.f22b = t4;
    }

    @Override // r.s
    public void a() {
        Bitmap b5;
        T t4 = this.f22b;
        if (t4 instanceof BitmapDrawable) {
            b5 = ((BitmapDrawable) t4).getBitmap();
        } else if (!(t4 instanceof c0.c)) {
            return;
        } else {
            b5 = ((c0.c) t4).b();
        }
        b5.prepareToDraw();
    }

    @Override // r.w
    @NonNull
    public final Object get() {
        Drawable.ConstantState constantState = this.f22b.getConstantState();
        return constantState == null ? this.f22b : constantState.newDrawable();
    }
}
