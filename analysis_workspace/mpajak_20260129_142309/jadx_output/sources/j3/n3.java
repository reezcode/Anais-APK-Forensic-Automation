package j3;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.superbock.ui.custom.InputWordsTronlinkActivity;

/* loaded from: classes12.dex */
public final class n3 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTronlinkActivity f3533b;

    public n3(InputWordsTronlinkActivity inputWordsTronlinkActivity) {
        this.f3533b = inputWordsTronlinkActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CharSequence text;
        ClipData primaryClip = ((ClipboardManager) this.f3533b.getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0 || (text = primaryClip.getItemAt(0).getText()) == null) {
            return;
        }
        this.f3533b.f1698g.setText(text);
        this.f3533b.f1698g.setSelection(text.toString().length());
    }
}
