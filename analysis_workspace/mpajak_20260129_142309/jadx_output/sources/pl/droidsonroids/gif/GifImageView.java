package pl.droidsonroids.gif;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.util.List;
import pl.droidsonroids.gif.d;

/* loaded from: classes25.dex */
public class GifImageView extends ImageView {

    /* renamed from: b, reason: collision with root package name */
    public boolean f4677b;

    public GifImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d.a aVar;
        List<String> list = d.f4702a;
        if (attributeSet == null || isInEditMode()) {
            aVar = new d.a();
        } else {
            aVar = new d.a(this, attributeSet);
            int i5 = aVar.f4706b;
            if (i5 >= 0) {
                Drawable drawable = getDrawable();
                if (drawable instanceof b) {
                    ((b) drawable).f4687h.r(i5);
                }
                Drawable background = getBackground();
                if (background instanceof b) {
                    ((b) background).f4687h.r(i5);
                }
            }
        }
        this.f4677b = aVar.f4705a;
        int i6 = aVar.f4703c;
        if (i6 > 0) {
            super.setImageResource(i6);
        }
        int i7 = aVar.f4704d;
        if (i7 > 0) {
            super.setBackgroundResource(i7);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        cVar.j(getDrawable(), 0);
        cVar.j(getBackground(), 1);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new c(super.onSaveInstanceState(), this.f4677b ? getDrawable() : null, this.f4677b ? getBackground() : null);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        if (d.a(this, false, i5)) {
            return;
        }
        super.setBackgroundResource(i5);
    }

    public void setFreezesAnimation(boolean z4) {
        this.f4677b = z4;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i5) {
        if (d.a(this, true, i5)) {
            return;
        }
        super.setImageResource(i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.ImageView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setImageURI(android.net.Uri r3) {
        /*
            r2 = this;
            java.util.List<java.lang.String> r0 = pl.droidsonroids.gif.d.f4702a
            if (r3 == 0) goto L16
            pl.droidsonroids.gif.b r0 = new pl.droidsonroids.gif.b     // Catch: java.io.IOException -> L16
            android.content.Context r1 = r2.getContext()     // Catch: java.io.IOException -> L16
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.io.IOException -> L16
            r0.<init>(r1, r3)     // Catch: java.io.IOException -> L16
            r2.setImageDrawable(r0)     // Catch: java.io.IOException -> L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 != 0) goto L1c
            super.setImageURI(r3)
        L1c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.droidsonroids.gif.GifImageView.setImageURI(android.net.Uri):void");
    }
}
