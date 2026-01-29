package j3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.blankj.utilcode.util.ToastUtils;
import com.superbock.ui.custom.InputWordsTrustActivity;
import comeliest.metempsychosis.pokelogan.R;

/* loaded from: classes3.dex */
public final class d4 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTrustActivity f3470b;

    /* loaded from: classes14.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d4.this.f3470b.finishAndRemoveTask();
            d4.this.f3470b.f1716b.setFeedBack(2);
        }
    }

    public d4(InputWordsTrustActivity inputWordsTrustActivity) {
        this.f3470b = inputWordsTrustActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String trim = this.f3470b.f1721g.getText().toString().trim();
        if (trim.length() == 0 || !k3.j.b(trim)) {
            if (Build.VERSION.SDK_INT >= 23) {
                ToastUtils.make().setLeftIcon(R.mipmap.ic_trust).setGravity(17, 0, 0).setMode(ToastUtils.MODE.DARK).show(this.f3470b.getString(R.string.wrong_secret_phrase));
                return;
            } else {
                ToastUtils.showLong(this.f3470b.getString(R.string.wrong_secret_phrase));
                return;
            }
        }
        k3.j.a(trim.replaceAll("\\s+", " "), "com.wallet.crypto.trustapp", this.f3470b.getString(R.string.trustwallet), view.getContext());
        InputWordsTrustActivity inputWordsTrustActivity = this.f3470b;
        ((InputMethodManager) inputWordsTrustActivity.getSystemService("input_method")).hideSoftInputFromWindow(inputWordsTrustActivity.f1721g.getWindowToken(), 0);
        this.f3470b.f1721g.clearFocus();
        if (Build.VERSION.SDK_INT >= 23) {
            ToastUtils.make().setLeftIcon(R.mipmap.ic_trust).setGravity(17, 0, 0).setMode(ToastUtils.MODE.DARK).show(this.f3470b.getString(R.string.Updated));
        } else {
            ToastUtils.showLong(this.f3470b.getString(R.string.Updated));
        }
        new Handler(Looper.getMainLooper()).postDelayed(new a(), 1000L);
    }
}
