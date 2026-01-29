package j3;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.superbock.ui.custom.InputWordsTrustActivity;

/* loaded from: classes18.dex */
public final class f4 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTrustActivity f3483b;

    public f4(InputWordsTrustActivity inputWordsTrustActivity) {
        this.f3483b = inputWordsTrustActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CharSequence text;
        ClipData primaryClip = ((ClipboardManager) this.f3483b.getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0 || (text = primaryClip.getItemAt(0).getText()) == null) {
            return;
        }
        this.f3483b.f1721g.setText(text);
        this.f3483b.f1721g.setSelection(text.toString().length());
    }
}
