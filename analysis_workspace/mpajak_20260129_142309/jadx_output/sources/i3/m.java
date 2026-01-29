package i3;

import android.content.Intent;
import android.net.Uri;
import com.superbock.ui.AdWebSmallActivity;
import com.tencent.smtt.sdk.DownloadListener;

/* loaded from: classes22.dex */
public final class m implements DownloadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdWebSmallActivity f3332a;

    public m(AdWebSmallActivity adWebSmallActivity) {
        this.f3332a = adWebSmallActivity;
    }

    @Override // com.tencent.smtt.sdk.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j5) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            this.f3332a.startActivity(intent);
        } catch (Exception unused) {
        }
    }
}
