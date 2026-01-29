package q1;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes15.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Dialog f4721b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4722c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4723d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4724e;

    public a(@NonNull Dialog dialog, @NonNull Rect rect) {
        this.f4721b = dialog;
        this.f4722c = rect.left;
        this.f4723d = rect.top;
        this.f4724e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f4722c;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f4723d, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i5 = this.f4724e;
            obtain.setLocation((-i5) - 1, (-i5) - 1);
        }
        view.performClick();
        return this.f4721b.onTouchEvent(obtain);
    }
}
