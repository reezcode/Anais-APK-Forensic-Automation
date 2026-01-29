package i3;

import android.content.DialogInterface;
import com.superbock.ui.StartupActivity;

/* loaded from: classes8.dex */
public final class w implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartupActivity f3341b;

    public w(StartupActivity startupActivity) {
        this.f3341b = startupActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        this.f3341b.finish();
    }
}
