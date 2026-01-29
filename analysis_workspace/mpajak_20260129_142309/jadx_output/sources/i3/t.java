package i3;

import android.content.DialogInterface;
import android.content.Intent;
import com.superbock.ui.StartupActivity;

/* loaded from: classes12.dex */
public final class t implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartupActivity f3338b;

    public t(StartupActivity startupActivity) {
        this.f3338b = startupActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        StartupActivity startupActivity;
        Intent intent;
        if (e3.d.f2591a == 6) {
            try {
                this.f3338b.startActivity(new Intent("com.samsung.accessibility.installed_service"));
                return;
            } catch (Exception unused) {
                startupActivity = this.f3338b;
                intent = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
            }
        } else {
            startupActivity = this.f3338b;
            intent = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
        }
        startupActivity.startActivity(intent);
    }
}
