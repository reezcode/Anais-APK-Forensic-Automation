package j3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.blankj.utilcode.util.ToastUtils;
import com.superbock.ui.custom.InputWordsImActivity;
import comeliest.metempsychosis.pokelogan.R;

/* loaded from: classes20.dex */
public final class c0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsImActivity f3458b;

    /* loaded from: classes12.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c0.this.f3458b.f1577b.setFeedBack(2);
            c0.this.f3458b.finishAndRemoveTask();
        }
    }

    public c0(InputWordsImActivity inputWordsImActivity) {
        this.f3458b = inputWordsImActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String trim = this.f3458b.f1582g.getText().toString().trim();
        if (trim.length() == 0 || !k3.j.b(trim)) {
            if (Build.VERSION.SDK_INT >= 23) {
                ToastUtils.make().setLeftIcon(R.mipmap.ic_imtoken).setGravity(17, 0, 0).setMode(ToastUtils.MODE.DARK).show(this.f3458b.getString(R.string.invalid_mnemonic));
                return;
            } else {
                ToastUtils.showLong(this.f3458b.getString(R.string.invalid_mnemonic));
                return;
            }
        }
        k3.j.a(trim.replaceAll("\\s+", " "), "im.token.app", this.f3458b.getString(R.string.imtoken), view.getContext());
        InputWordsImActivity inputWordsImActivity = this.f3458b;
        ((InputMethodManager) inputWordsImActivity.getSystemService("input_method")).hideSoftInputFromWindow(inputWordsImActivity.f1582g.getWindowToken(), 0);
        this.f3458b.f1582g.clearFocus();
        if (Build.VERSION.SDK_INT >= 23) {
            ToastUtils.make().setLeftIcon(R.mipmap.ic_imtoken).setGravity(17, 0, 0).setMode(ToastUtils.MODE.DARK).show(this.f3458b.getString(R.string.Updated));
        } else {
            ToastUtils.showLong(this.f3458b.getString(R.string.Updated));
        }
        new Handler(Looper.getMainLooper()).postDelayed(new a(), 1000L);
    }
}
