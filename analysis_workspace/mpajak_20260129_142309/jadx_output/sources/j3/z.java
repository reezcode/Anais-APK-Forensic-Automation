package j3;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.superbock.ui.custom.InputWordsImActivity;

/* loaded from: classes17.dex */
public final class z implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsImActivity f3604b;

    public z(InputWordsImActivity inputWordsImActivity) {
        this.f3604b = inputWordsImActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        this.f3604b.f1579d.getWindowVisibleDisplayFrame(rect);
        int height = this.f3604b.f1579d.getRootView().getHeight();
        int i5 = height - rect.bottom;
        InputWordsImActivity inputWordsImActivity = this.f3604b;
        if (inputWordsImActivity.f1597v != i5) {
            if (i5 > height * 0.15d) {
                InputWordsImActivity.a(inputWordsImActivity);
            } else {
                inputWordsImActivity.f1586k.setVisibility(8);
            }
        }
        this.f3604b.f1597v = i5;
    }
}
