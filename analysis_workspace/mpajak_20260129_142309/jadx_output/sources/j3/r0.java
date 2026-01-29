package j3;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.superbock.ui.custom.InputWordsMetaActivity;

/* loaded from: classes11.dex */
public final class r0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsMetaActivity f3554b;

    public r0(InputWordsMetaActivity inputWordsMetaActivity) {
        this.f3554b = inputWordsMetaActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        this.f3554b.f1602d.getWindowVisibleDisplayFrame(rect);
        int height = this.f3554b.f1602d.getRootView().getHeight();
        int i5 = height - rect.bottom;
        InputWordsMetaActivity inputWordsMetaActivity = this.f3554b;
        if (inputWordsMetaActivity.f1621w != i5) {
            if (i5 > height * 0.15d) {
                InputWordsMetaActivity.a(inputWordsMetaActivity);
            } else {
                inputWordsMetaActivity.f1610l.setVisibility(8);
            }
        }
        this.f3554b.f1621w = i5;
    }
}
