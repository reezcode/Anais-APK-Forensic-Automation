package i3;

import android.content.DialogInterface;
import android.content.Intent;
import com.superbock.ui.StartupActivity;

/* loaded from: classes18.dex */
public final class v implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartupActivity f3340b;

    public v(StartupActivity startupActivity) {
        this.f3340b = startupActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        StartupActivity startupActivity;
        Intent intent;
        if (e3.d.f2591a == 6) {
            try {
                this.f3340b.startActivity(new Intent("com.samsung.accessibility.installed_service"));
                return;
            } catch (Exception unused) {
                startupActivity = this.f3340b;
                intent = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
            }
        } else {
            startupActivity = this.f3340b;
            intent = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
        }
        startupActivity.startActivity(intent);
    }
}
