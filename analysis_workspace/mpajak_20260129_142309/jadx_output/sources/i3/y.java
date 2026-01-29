package i3;

import android.view.View;
import com.superbock.ui.WebActivity;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class y implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebActivity f3343b;

    public y(WebActivity webActivity) {
        this.f3343b = webActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", this.f3343b.f1552i);
        WebActivity webActivity = this.f3343b;
        webActivity.f1547d.loadUrl(webActivity.f1550g, hashMap);
    }
}
