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
public class AdSingleActivity extends Activity implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public long f1486b;

    /* renamed from: c, reason: collision with root package name */
    public CountDownTimer f1487c;

    /* renamed from: d, reason: collision with root package name */
    public AdInfo f1488d;

    /* renamed from: e, reason: collision with root package name */
    public long f1489e;

    /* loaded from: classes8.dex */
    public class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f1490a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImageView f1491b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j5, long j6, ImageView imageView) {
            super(j5, 1000L);
            this.f1490a = j6;
            this.f1491b = imageView;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            AdSingleActivity.this.f1488d.setFeedBack(5);
            AdSingleActivity.this.finish();
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j5) {
            AdSingleActivity adSingleActivity = AdSingleActivity.this;
            adSingleActivity.f1486b -= 1000;
            if (adSingleActivity.f1488d.getShowClose() > 0) {
                if (AdSingleActivity.this.f1486b == this.f1490a - (r7.f1488d.getShowClose() * 1000)) {
                    this.f1491b.setVisibility(0);
                }
            }
        }
    }

    /* loaded from: classes21.dex */
    public class b extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ImageView f1493a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j5, ImageView imageView) {
            super(j5, 1000L);
            this.f1493a = imageView;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            this.f1493a.setVisibility(0);
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j5) {
        }
    }

    /* loaded from: classes19.dex */
    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                return;
            }
            AdSingleActivity.this.f1488d.setFeedBack(6);
            AdSingleActivity.this.finish();
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
            case R.id.ad_single_close /* 2131230847 */:
                adInfo = this.f1488d;
                i5 = 3;
                break;
            case R.id.ad_single_img /* 2131230848 */:
                if (!TextUtils.isEmpty(this.f1488d.getLink())) {
                    try {
                        if (this.f1488d.getLink().startsWith("openapp:")) {
                            k3.a.l(this, this.f1488d.getLink().replaceFirst("openapp:", ""));
                        } else {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse(this.f1488d.getLink()));
                            startActivity(intent);
                            AdInfo adInfo2 = this.f1488d;
                            adInfo2.setUrl(adInfo2.getLink());
                        }
                    } catch (Exception unused) {
                    }
                }
                if (this.f1488d.getAiLink() != null) {
                    e.f(this, this.f1488d.getAiLink(), this.f1488d.getAiLinkDelayMillis());
                }
                adInfo = this.f1488d;
                i5 = 1;
                break;
            default:
                return;
        }
        adInfo.setFeedBack(i5);
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            android.view.Window r8 = r7.getWindow()
            r0 = 512(0x200, float:7.17E-43)
            r8.setFlags(r0, r0)
            r8 = 2131427368(0x7f0b0028, float:1.847635E38)
            r7.setContentView(r8)
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r0 = "adInfo"
            java.io.Serializable r8 = r8.getSerializableExtra(r0)
            com.superbock.bean.AdInfo r8 = (com.superbock.bean.AdInfo) r8
            r7.f1488d = r8
            if (r8 != 0) goto L26
            r7.finish()
            return
        L26:
            r8 = 2131230848(0x7f080080, float:1.807776E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            int r0 = k3.h.b(r7)
            com.superbock.bean.AdInfo r1 = r7.f1488d
            int r1 = r1.getWidth()
            int r1 = r1 * r0
            int r1 = r1 / 100
            r8.setMaxWidth(r1)
            e0.n r0 = com.bumptech.glide.b.c(r7)
            com.bumptech.glide.i r0 = r0.e(r7)
            com.superbock.bean.AdInfo r1 = r7.f1488d
            java.lang.String r1 = r1.getImg()
            com.bumptech.glide.h r0 = r0.n(r1)
            r.l$c r1 = r.l.f4893c
            h0.a r0 = r0.d(r1)
            com.bumptech.glide.h r0 = (com.bumptech.glide.h) r0
            r0.v(r8)
            r8.setOnClickListener(r7)
            r8 = 2131230847(0x7f08007f, float:1.8077758E38)
            android.view.View r8 = r7.findViewById(r8)
            r6 = r8
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r6.setOnClickListener(r7)
            com.superbock.bean.AdInfo r8 = r7.f1488d
            int r8 = r8.getShowClose()
            if (r8 >= 0) goto L78
            r8 = 8
            goto L81
        L78:
            com.superbock.bean.AdInfo r8 = r7.f1488d
            int r8 = r8.getShowClose()
            if (r8 <= 0) goto L84
            r8 = 4
        L81:
            r6.setVisibility(r8)
        L84:
            com.superbock.bean.AdInfo r8 = r7.f1488d
            int r8 = r8.getAutoClose()
            r0 = 1000(0x3e8, double:4.94E-321)
            if (r8 <= 0) goto La6
            com.superbock.bean.AdInfo r8 = r7.f1488d
            int r8 = r8.getAutoClose()
            long r2 = (long) r8
            long r4 = r2 * r0
            r7.f1486b = r4
            com.superbock.ui.AdSingleActivity$a r8 = new com.superbock.ui.AdSingleActivity$a
            r0 = r8
            r1 = r7
            r2 = r4
            r0.<init>(r2, r4, r6)
        La1:
            android.os.CountDownTimer r8 = r8.start()
            goto Lbd
        La6:
            com.superbock.bean.AdInfo r8 = r7.f1488d
            int r8 = r8.getShowClose()
            if (r8 <= 0) goto Lbf
            com.superbock.ui.AdSingleActivity$b r8 = new com.superbock.ui.AdSingleActivity$b
            com.superbock.bean.AdInfo r2 = r7.f1488d
            int r2 = r2.getShowClose()
            long r2 = (long) r2
            long r2 = r2 * r0
            r8.<init>(r2, r6)
            goto La1
        Lbd:
            r7.f1487c = r8
        Lbf:
            com.superbock.bean.AdInfo r8 = r7.f1488d
            int r8 = r8.getBack()
            r0 = 1
            if (r8 != r0) goto Lda
            android.content.IntentFilter r8 = new android.content.IntentFilter
            r8.<init>()
            java.lang.String r0 = "android.intent.action.SCREEN_OFF"
            r8.addAction(r0)
            com.superbock.ui.AdSingleActivity$c r0 = new com.superbock.ui.AdSingleActivity$c
            r0.<init>()
            r7.registerReceiver(r0, r8)
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superbock.ui.AdSingleActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.f1487c;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        int type = this.f1488d.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1488d, true, false);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1488d.getCustomId() > 0) {
                App.f1372b.c(this.f1488d);
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
        if (this.f1488d == null) {
            return;
        }
        App.f1373c = true;
        if (this.f1489e == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f1489e = currentTimeMillis;
            this.f1488d.setStartTime(currentTimeMillis);
        }
        if (this.f1488d.getType() == 2) {
            i.n(0, "39", null);
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        int type = this.f1488d.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1488d, true, true);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1488d.getType() == 2) {
                i.n(0, "40", null);
            }
            if (this.f1488d.getCustomId() > 0) {
                App.f1372b.c(this.f1488d);
            }
        }
    }
}
