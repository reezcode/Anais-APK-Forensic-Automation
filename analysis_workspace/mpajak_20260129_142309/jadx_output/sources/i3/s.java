package i3;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.superbock.ui.StartupActivity;

/* loaded from: classes3.dex */
public final class s implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartupActivity f3337b;

    public s(StartupActivity startupActivity) {
        this.f3337b = startupActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", this.f3337b.getPackageName(), null));
            this.f3337b.startActivity(intent);
        } catch (Exception unused) {
        }
    }
}
