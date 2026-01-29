package j3;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.superbock.ui.custom.InputWordsBinanceActivity;

/* loaded from: classes19.dex */
public final class n implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsBinanceActivity f3529b;

    public n(InputWordsBinanceActivity inputWordsBinanceActivity) {
        this.f3529b = inputWordsBinanceActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CharSequence text;
        ClipData primaryClip = ((ClipboardManager) this.f3529b.getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0 || (text = primaryClip.getItemAt(0).getText()) == null) {
            return;
        }
        this.f3529b.f1560g.setText(text);
        this.f3529b.f1560g.setSelection(text.toString().length());
    }
}
