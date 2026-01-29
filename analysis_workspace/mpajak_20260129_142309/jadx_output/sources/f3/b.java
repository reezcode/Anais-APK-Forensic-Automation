package f3;

import android.view.MotionEvent;
import android.view.View;
import com.superbock.auto.BaseService;

/* loaded from: classes24.dex */
public final class b implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        try {
            if (motionEvent.getAction() == 0 && motionEvent.getToolType(0) == 0 && BaseService.f1405v.getWindowToken() != null) {
                BaseService.f1402s.removeView(BaseService.f1405v);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return false;
    }
}
