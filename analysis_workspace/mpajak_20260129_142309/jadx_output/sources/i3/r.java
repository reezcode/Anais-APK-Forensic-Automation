package i3;

import android.content.DialogInterface;
import com.superbock.ui.StartupActivity;

/* loaded from: classes18.dex */
public final class r implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartupActivity f3336b;

    public r(StartupActivity startupActivity) {
        this.f3336b = startupActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        this.f3336b.finish();
    }
}
