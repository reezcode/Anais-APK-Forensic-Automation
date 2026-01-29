package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsImActivity;

/* loaded from: classes9.dex */
public final class d0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsImActivity f3465b;

    public d0(InputWordsImActivity inputWordsImActivity) {
        this.f3465b = inputWordsImActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3465b.onBackPressed();
    }
}
