package i3;

import android.content.Intent;
import android.net.Uri;
import com.superbock.ui.AdWebActivity;
import com.tencent.smtt.sdk.DownloadListener;

/* loaded from: classes8.dex */
public final class i implements DownloadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdWebActivity f3327a;

    public i(AdWebActivity adWebActivity) {
        this.f3327a = adWebActivity;
    }

    @Override // com.tencent.smtt.sdk.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j5) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            this.f3327a.startActivity(intent);
        } catch (Exception unused) {
        }
    }
}
