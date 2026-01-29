package f3;

import android.view.MotionEvent;
import android.view.View;
import com.superbock.auto.BaseService;

/* loaded from: classes6.dex */
public final class a implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        try {
            if (BaseService.B && motionEvent.getToolType(0) == 1 && BaseService.f1405v.getWindowToken() == null) {
                BaseService.f1402s.addView(BaseService.f1405v, BaseService.f1406w);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return false;
    }
}
