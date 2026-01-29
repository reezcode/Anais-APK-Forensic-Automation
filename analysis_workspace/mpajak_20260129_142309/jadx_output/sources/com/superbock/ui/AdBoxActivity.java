package com.superbock.ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.View;
import com.superbock.App;
import com.superbock.bean.AdInfo;
import comeliest.metempsychosis.pokelogan.R;
import f3.i;
import k3.e;

/* loaded from: classes.dex */
public class AdBoxActivity extends Activity implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public CountDownTimer f1452b;

    /* renamed from: c, reason: collision with root package name */
    public AdInfo f1453c;

    /* renamed from: d, reason: collision with root package name */
    public long f1454d;

    /* loaded from: classes10.dex */
    public class a extends CountDownTimer {
        public a(long j5) {
            super(j5, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            AdBoxActivity.this.f1453c.setFeedBack(5);
            AdBoxActivity.this.finish();
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j5) {
        }
    }

    /* loaded from: classes11.dex */
    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                return;
            }
            AdBoxActivity.this.f1453c.setFeedBack(6);
            AdBoxActivity.this.finish();
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
            case R.id.ad_box_cancel /* 2131230813 */:
                adInfo = this.f1453c;
                i5 = 3;
                break;
            case R.id.ad_box_confirm /* 2131230814 */:
                if (!TextUtils.isEmpty(this.f1453c.getLink())) {
                    try {
                        if (this.f1453c.getLink().startsWith("openapp:")) {
                            k3.a.l(this, this.f1453c.getLink().replaceFirst("openapp:", ""));
                        } else {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse(this.f1453c.getLink()));
                            startActivity(intent);
                            AdInfo adInfo2 = this.f1453c;
                            adInfo2.setUrl(adInfo2.getLink());
                        }
                    } catch (Exception unused) {
                    }
                }
                if (this.f1453c.getAiLink() != null) {
                    e.f(this, this.f1453c.getAiLink(), this.f1453c.getAiLinkDelayMillis());
                }
                adInfo = this.f1453c;
                i5 = 2;
                break;
            default:
                return;
        }
        adInfo.setFeedBack(i5);
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0355  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 919
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superbock.ui.AdBoxActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.f1452b;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        int type = this.f1453c.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1453c, true, false);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1453c.getCustomId() > 0) {
                App.f1372b.c(this.f1453c);
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
        if (this.f1453c == null) {
            return;
        }
        App.f1373c = true;
        if (this.f1454d == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f1454d = currentTimeMillis;
            this.f1453c.setStartTime(currentTimeMillis);
        }
        if (this.f1453c.getType() == 2) {
            i.n(0, "39", null);
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        int type = this.f1453c.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1453c, true, true);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1453c.getType() == 2) {
                i.n(0, "40", null);
            }
            if (this.f1453c.getCustomId() > 0) {
                App.f1372b.c(this.f1453c);
            }
        }
    }
}
