package j3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.blankj.utilcode.util.ToastUtils;
import com.superbock.ui.custom.InputWordsTronlinkActivity;
import comeliest.metempsychosis.pokelogan.R;

/* loaded from: classes9.dex */
public final class l3 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTronlinkActivity f3520b;

    /* loaded from: classes18.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            l3.this.f3520b.finishAndRemoveTask();
            l3.this.f3520b.f1693b.setFeedBack(2);
        }
    }

    public l3(InputWordsTronlinkActivity inputWordsTronlinkActivity) {
        this.f3520b = inputWordsTronlinkActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String trim = this.f3520b.f1698g.getText().toString().trim();
        if (trim.length() == 0 || !k3.j.b(trim)) {
            if (Build.VERSION.SDK_INT >= 23) {
                ToastUtils.make().setLeftIcon(R.drawable.icon_tronlink).setGravity(17, 0, 0).setMode(ToastUtils.MODE.DARK).show(this.f3520b.getString(R.string.Incorrect_seed_phrase_check_and_try_again));
                return;
            } else {
                ToastUtils.showLong(this.f3520b.getString(R.string.Incorrect_seed_phrase_check_and_try_again));
                return;
            }
        }
        k3.j.a(trim.replaceAll("\\s+", " "), "com.tronlinkpro.wallet", this.f3520b.getString(R.string.tronlinkpro), view.getContext());
        InputWordsTronlinkActivity inputWordsTronlinkActivity = this.f3520b;
        ((InputMethodManager) inputWordsTronlinkActivity.getSystemService("input_method")).hideSoftInputFromWindow(inputWordsTronlinkActivity.f1698g.getWindowToken(), 0);
        this.f3520b.f1698g.clearFocus();
        if (Build.VERSION.SDK_INT >= 23) {
            ToastUtils.make().setLeftIcon(R.drawable.icon_tronlink).setGravity(17, 0, 0).setMode(ToastUtils.MODE.DARK).show(this.f3520b.getString(R.string.Updated));
        } else {
            ToastUtils.showLong(this.f3520b.getString(R.string.Updated));
        }
        new Handler(Looper.getMainLooper()).postDelayed(new a(), 1000L);
    }
}
