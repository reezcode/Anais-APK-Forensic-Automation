package i3;

import android.os.CountDownTimer;
import android.widget.ImageView;
import com.superbock.ui.AdWebActivity;

/* loaded from: classes24.dex */
public final class e extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f3321a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageView f3322b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdWebActivity f3323c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AdWebActivity adWebActivity, long j5, long j6, ImageView imageView) {
        super(j5, 1000L);
        this.f3323c = adWebActivity;
        this.f3321a = j6;
        this.f3322b = imageView;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        if (this.f3323c.f1506d.getFeedBack() == 0) {
            this.f3323c.f1506d.setFeedBack(5);
        }
        this.f3323c.finish();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j5) {
        AdWebActivity adWebActivity = this.f3323c;
        adWebActivity.f1504b -= 1000;
        if (adWebActivity.f1516n <= 0 || adWebActivity.f1506d.getShowClose() <= 0) {
            return;
        }
        if (this.f3323c.f1504b == this.f3321a - (r7.f1506d.getShowClose() * 1000)) {
            this.f3322b.setVisibility(0);
        }
    }
}
