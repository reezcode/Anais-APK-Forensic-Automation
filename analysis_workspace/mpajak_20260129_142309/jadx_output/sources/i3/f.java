package i3;

import android.os.CountDownTimer;
import android.widget.ImageView;

/* loaded from: classes13.dex */
public final class f extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f3324a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j5, ImageView imageView) {
        super(j5, 1000L);
        this.f3324a = imageView;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.f3324a.setVisibility(0);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j5) {
    }
}
