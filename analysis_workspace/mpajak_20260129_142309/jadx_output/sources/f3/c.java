package f3;

import android.view.MotionEvent;
import android.view.View;
import com.superbock.auto.BaseService;

/* loaded from: classes9.dex */
public final class c implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseService f2789b;

    public c(BaseService baseService) {
        this.f2789b = baseService;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        try {
            if (motionEvent.getX() <= 0.0f || motionEvent.getY() <= 0.0f) {
                BaseService.f1402s.removeView(BaseService.f1407x);
                this.f2789b.performGlobalAction(1);
            } else if (motionEvent.getAction() == 1) {
                BaseService.f1402s.removeView(BaseService.f1407x);
                this.f2789b.performGlobalAction(1);
                this.f2789b.j();
            }
            return false;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }
}
