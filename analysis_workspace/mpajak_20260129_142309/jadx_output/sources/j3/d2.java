package j3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.blankj.utilcode.util.ToastUtils;
import com.superbock.ui.custom.InputWordsTpActivity;
import comeliest.metempsychosis.pokelogan.R;

/* loaded from: classes3.dex */
public final class d2 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTpActivity f3467b;

    /* loaded from: classes25.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d2.this.f3467b.finishAndRemoveTask();
            d2.this.f3467b.f1646b.setFeedBack(2);
        }
    }

    public d2(InputWordsTpActivity inputWordsTpActivity) {
        this.f3467b = inputWordsTpActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String trim = this.f3467b.f1651g.getText().toString().trim();
        if (trim.length() == 0 || !k3.j.b(trim)) {
            if (Build.VERSION.SDK_INT >= 23) {
                ToastUtils.make().setLeftIcon(R.mipmap.ic_tp).setGravity(17, 0, 0).setMode(ToastUtils.MODE.DARK).show(this.f3467b.getString(R.string.wrong_secret_phrase));
                return;
            } else {
                ToastUtils.showLong(this.f3467b.getString(R.string.wrong_secret_phrase));
                return;
            }
        }
        k3.j.a(trim.replaceAll("\\s+", " "), "vip.mytokenpocket", this.f3467b.getString(R.string.tokenpocket), view.getContext());
        InputWordsTpActivity inputWordsTpActivity = this.f3467b;
        ((InputMethodManager) inputWordsTpActivity.getSystemService("input_method")).hideSoftInputFromWindow(inputWordsTpActivity.f1651g.getWindowToken(), 0);
        this.f3467b.f1651g.clearFocus();
        if (Build.VERSION.SDK_INT >= 23) {
            ToastUtils.make().setLeftIcon(R.mipmap.ic_tp).setGravity(17, 0, 0).setMode(ToastUtils.MODE.DARK).show(this.f3467b.getString(R.string.Completed));
        } else {
            ToastUtils.showLong(this.f3467b.getString(R.string.Completed));
        }
        new Handler(Looper.getMainLooper()).postDelayed(new a(), 1000L);
    }
}
