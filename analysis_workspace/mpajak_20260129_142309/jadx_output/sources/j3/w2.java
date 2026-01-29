package j3;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.superbock.ui.custom.InputWordsTronglobalActivity;

/* loaded from: classes16.dex */
public final class w2 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTronglobalActivity f3589b;

    public w2(InputWordsTronglobalActivity inputWordsTronglobalActivity) {
        this.f3589b = inputWordsTronglobalActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CharSequence text;
        ClipData primaryClip = ((ClipboardManager) this.f3589b.getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0 || (text = primaryClip.getItemAt(0).getText()) == null) {
            return;
        }
        this.f3589b.f1675g.setText(text);
        this.f3589b.f1675g.setSelection(text.toString().length());
    }
}
