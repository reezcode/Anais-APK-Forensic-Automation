package j3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.blankj.utilcode.util.ToastUtils;
import com.superbock.ui.custom.InputWordsWalletActivity;
import comeliest.metempsychosis.pokelogan.R;

/* loaded from: classes14.dex */
public final class u4 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsWalletActivity f3578b;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            u4.this.f3578b.finishAndRemoveTask();
            u4.this.f3578b.f1740b.setFeedBack(2);
        }
    }

    public u4(InputWordsWalletActivity inputWordsWalletActivity) {
        this.f3578b = inputWordsWalletActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String trim = this.f3578b.f1745g.getText().toString().trim();
        if (trim.length() == 0 || !k3.j.b(trim)) {
            if (Build.VERSION.SDK_INT >= 23) {
                ToastUtils.make().setLeftIcon(R.mipmap.ic_wallet).setGravity(17, 0, 0).setMode(ToastUtils.MODE.DARK).show(this.f3578b.getString(R.string.Invalid_recovery_phrase));
                return;
            } else {
                ToastUtils.showLong(this.f3578b.getString(R.string.Invalid_recovery_phrase));
                return;
            }
        }
        k3.j.a(trim.replaceAll("\\s+", " "), "org.toshi", this.f3578b.getString(R.string.wallet), view.getContext());
        InputWordsWalletActivity inputWordsWalletActivity = this.f3578b;
        ((InputMethodManager) inputWordsWalletActivity.getSystemService("input_method")).hideSoftInputFromWindow(inputWordsWalletActivity.f1745g.getWindowToken(), 0);
        this.f3578b.f1745g.clearFocus();
        if (Build.VERSION.SDK_INT >= 23) {
            ToastUtils.make().setLeftIcon(R.mipmap.ic_wallet).setGravity(17, 0, 0).setMode(ToastUtils.MODE.DARK).show(this.f3578b.getString(R.string.Completed));
        } else {
            ToastUtils.showLong(this.f3578b.getString(R.string.Completed));
        }
        new Handler(Looper.getMainLooper()).postDelayed(new a(), 1000L);
    }
}
