package f3;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import com.superbock.auto.BaseService;

/* loaded from: classes23.dex */
public final class k extends AccessibilityService.GestureResultCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDescription.StrokeDescription f2823a;

    public k(GestureDescription.StrokeDescription strokeDescription) {
        this.f2823a = strokeDescription;
    }

    @Override // android.accessibilityservice.AccessibilityService.GestureResultCallback
    public final void onCancelled(GestureDescription gestureDescription) {
        super.onCancelled(gestureDescription);
    }

    @Override // android.accessibilityservice.AccessibilityService.GestureResultCallback
    public final void onCompleted(GestureDescription gestureDescription) {
        super.onCompleted(gestureDescription);
        try {
            BaseService.g().dispatchGesture(new GestureDescription.Builder().addStroke(this.f2823a).build(), null, null);
        } catch (f unused) {
        }
    }
}
