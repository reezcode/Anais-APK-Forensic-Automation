package j3;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.superbock.ui.custom.InputWordsOkxActivity;

/* loaded from: classes18.dex */
public final class n1 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsOkxActivity f3531b;

    public n1(InputWordsOkxActivity inputWordsOkxActivity) {
        this.f3531b = inputWordsOkxActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CharSequence text;
        ClipData primaryClip = ((ClipboardManager) this.f3531b.getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0 || (text = primaryClip.getItemAt(0).getText()) == null) {
            return;
        }
        this.f3531b.f1629g.setText(text);
        this.f3531b.f1629g.setSelection(text.toString().length());
    }
}
