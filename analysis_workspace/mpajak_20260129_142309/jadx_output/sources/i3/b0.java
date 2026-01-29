package i3;

import android.content.Intent;
import android.net.Uri;
import com.superbock.ui.WebActivity;
import com.tencent.smtt.sdk.DownloadListener;

/* loaded from: classes18.dex */
public final class b0 implements DownloadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebActivity f3315a;

    public b0(WebActivity webActivity) {
        this.f3315a = webActivity;
    }

    @Override // com.tencent.smtt.sdk.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j5) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            this.f3315a.startActivity(intent);
        } catch (Exception unused) {
        }
    }
}
