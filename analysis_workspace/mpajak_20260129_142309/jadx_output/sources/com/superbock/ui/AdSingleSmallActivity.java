package com.superbock.ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.superbock.App;
import com.superbock.bean.AdInfo;
import comeliest.metempsychosis.pokelogan.R;
import f3.i;
import k3.e;

/* loaded from: classes.dex */
public class AdSingleSmallActivity extends Activity implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public long f1495b;

    /* renamed from: c, reason: collision with root package name */
    public CountDownTimer f1496c;

    /* renamed from: d, reason: collision with root package name */
    public AdInfo f1497d;

    /* renamed from: e, reason: collision with root package name */
    public long f1498e;

    /* loaded from: classes16.dex */
    public class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f1499a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImageView f1500b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j5, long j6, ImageView imageView) {
            super(j5, 1000L);
            this.f1499a = j6;
            this.f1500b = imageView;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            AdSingleSmallActivity.this.f1497d.setFeedBack(5);
            AdSingleSmallActivity.this.finish();
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j5) {
            AdSingleSmallActivity adSingleSmallActivity = AdSingleSmallActivity.this;
            adSingleSmallActivity.f1495b -= 1000;
            if (adSingleSmallActivity.f1497d.getShowClose() > 0) {
                if (AdSingleSmallActivity.this.f1495b == this.f1499a - (r7.f1497d.getShowClose() * 1000)) {
                    this.f1500b.setVisibility(0);
                }
            }
        }
    }

    /* loaded from: classes22.dex */
    public class b extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ImageView f1502a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j5, ImageView imageView) {
            super(j5, 1000L);
            this.f1502a = imageView;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            this.f1502a.setVisibility(0);
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j5) {
        }
    }

    /* loaded from: classes8.dex */
    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                return;
            }
            AdSingleSmallActivity.this.f1497d.setFeedBack(6);
            AdSingleSmallActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AdInfo adInfo;
        int i5;
        switch (view.getId()) {
            case R.id.ad_single_small_close /* 2131230849 */:
                adInfo = this.f1497d;
                i5 = 3;
                break;
            case R.id.ad_single_small_img /* 2131230850 */:
                if (!TextUtils.isEmpty(this.f1497d.getLink())) {
                    try {
                        if (this.f1497d.getLink().startsWith("openapp:")) {
                            k3.a.l(this, this.f1497d.getLink().replaceFirst("openapp:", ""));
                        } else {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse(this.f1497d.getLink()));
                            startActivity(intent);
                            AdInfo adInfo2 = this.f1497d;
                            adInfo2.setUrl(adInfo2.getLink());
                        }
                    } catch (Exception unused) {
                    }
                }
                if (this.f1497d.getAiLink() != null) {
                    e.f(this, this.f1497d.getAiLink(), this.f1497d.getAiLinkDelayMillis());
                }
                adInfo = this.f1497d;
                i5 = 1;
                break;
            default:
                return;
        }
        adInfo.setFeedBack(i5);
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f9  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superbock.ui.AdSingleSmallActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.f1496c;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        int type = this.f1497d.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1497d, true, false);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1497d.getCustomId() > 0) {
                App.f1372b.c(this.f1497d);
            }
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        if (this.f1497d == null) {
            return;
        }
        App.f1373c = true;
        if (this.f1498e == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f1498e = currentTimeMillis;
            this.f1497d.setStartTime(currentTimeMillis);
        }
        if (this.f1497d.getType() == 2) {
            i.n(0, "39", null);
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        int type = this.f1497d.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1497d, true, true);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1497d.getType() == 2) {
                i.n(0, "40", null);
            }
            if (this.f1497d.getCustomId() > 0) {
                App.f1372b.c(this.f1497d);
            }
        }
    }
}
