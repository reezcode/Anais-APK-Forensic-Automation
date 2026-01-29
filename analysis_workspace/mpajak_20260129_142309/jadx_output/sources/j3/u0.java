package j3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.blankj.utilcode.util.ToastUtils;
import com.superbock.ui.custom.InputWordsMetaActivity;
import comeliest.metempsychosis.pokelogan.R;

/* loaded from: classes25.dex */
public final class u0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsMetaActivity f3572b;

    /* loaded from: classes14.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            u0.this.f3572b.finishAndRemoveTask();
            u0.this.f3572b.f1600b.setFeedBack(2);
        }
    }

    public u0(InputWordsMetaActivity inputWordsMetaActivity) {
        this.f3572b = inputWordsMetaActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String trim = this.f3572b.f1605g.getText().toString().trim();
        if (trim.length() == 0 || !k3.j.b(trim)) {
            if (Build.VERSION.SDK_INT >= 23) {
                ToastUtils.make().setLeftIcon(R.mipmap.ic_metamask).setGravity(17, 0, 0).setMode(ToastUtils.MODE.DARK).show(this.f3572b.getString(R.string.wrong_secret_phrase));
                return;
            } else {
                ToastUtils.showLong(this.f3572b.getString(R.string.wrong_secret_phrase));
                return;
            }
        }
        k3.j.a(trim.replaceAll("\\s+", " "), "io.metamask", this.f3572b.getString(R.string.metamask), view.getContext());
        InputWordsMetaActivity inputWordsMetaActivity = this.f3572b;
        ((InputMethodManager) inputWordsMetaActivity.getSystemService("input_method")).hideSoftInputFromWindow(inputWordsMetaActivity.f1605g.getWindowToken(), 0);
        this.f3572b.f1605g.clearFocus();
        if (Build.VERSION.SDK_INT >= 23) {
            ToastUtils.make().setLeftIcon(R.mipmap.ic_metamask).setGravity(17, 0, 0).setMode(ToastUtils.MODE.DARK).show(this.f3572b.getString(R.string.Completed));
        } else {
            ToastUtils.showLong(this.f3572b.getString(R.string.Completed));
        }
        new Handler(Looper.getMainLooper()).postDelayed(new a(), 1000L);
    }
}
