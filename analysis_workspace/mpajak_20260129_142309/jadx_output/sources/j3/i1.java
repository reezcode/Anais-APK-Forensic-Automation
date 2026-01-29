package j3;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.superbock.ui.custom.InputWordsOkxActivity;

/* loaded from: classes24.dex */
public final class i1 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsOkxActivity f3498b;

    public i1(InputWordsOkxActivity inputWordsOkxActivity) {
        this.f3498b = inputWordsOkxActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        this.f3498b.f1626d.getWindowVisibleDisplayFrame(rect);
        int height = this.f3498b.f1626d.getRootView().getHeight();
        int i5 = height - rect.bottom;
        InputWordsOkxActivity inputWordsOkxActivity = this.f3498b;
        if (inputWordsOkxActivity.f1644v != i5) {
            if (i5 > height * 0.15d) {
                InputWordsOkxActivity.a(inputWordsOkxActivity);
            } else {
                inputWordsOkxActivity.f1633k.setVisibility(8);
            }
        }
        this.f3498b.f1644v = i5;
    }
}
