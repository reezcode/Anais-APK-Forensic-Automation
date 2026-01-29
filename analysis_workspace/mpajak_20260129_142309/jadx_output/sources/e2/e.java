package e2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes12.dex */
public final class e extends b2.g {

    /* renamed from: z, reason: collision with root package name */
    @NonNull
    public final RectF f2540z;

    public e() {
        this(null);
    }

    public e(@Nullable b2.k kVar) {
        super(kVar == null ? new b2.k() : kVar);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f2540z = new RectF();
    }

    @Override // b2.g
    public final void g(@NonNull Canvas canvas) {
        if (this.f2540z.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f2540z);
        } else {
            canvas.clipRect(this.f2540z, Region.Op.DIFFERENCE);
        }
        super.g(canvas);
        canvas.restore();
    }

    public final void x(float f5, float f6, float f7, float f8) {
        RectF rectF = this.f2540z;
        if (f5 == rectF.left && f6 == rectF.top && f7 == rectF.right && f8 == rectF.bottom) {
            return;
        }
        rectF.set(f5, f6, f7, f8);
        invalidateSelf();
    }
}
