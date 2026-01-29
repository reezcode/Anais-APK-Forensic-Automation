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
public class AdAlertActivity extends Activity implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public CountDownTimer f1437b;

    /* renamed from: c, reason: collision with root package name */
    public AdInfo f1438c;

    /* renamed from: d, reason: collision with root package name */
    public long f1439d;

    /* loaded from: classes18.dex */
    public class a extends CountDownTimer {
        public a(long j5) {
            super(j5, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            AdAlertActivity.this.f1438c.setFeedBack(5);
            AdAlertActivity.this.finish();
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j5) {
        }
    }

    /* loaded from: classes24.dex */
    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                return;
            }
            AdAlertActivity.this.f1438c.setFeedBack(6);
            AdAlertActivity.this.finish();
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
            case R.id.ad_alert_cancel /* 2131230798 */:
                adInfo = this.f1438c;
                i5 = 3;
                break;
            case R.id.ad_alert_confirm /* 2131230799 */:
                if (!TextUtils.isEmpty(this.f1438c.getLink())) {
                    try {
                        if (this.f1438c.getLink().startsWith("openapp:")) {
                            k3.a.l(this, this.f1438c.getLink().replaceFirst("openapp:", ""));
                        } else {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse(this.f1438c.getLink()));
                            startActivity(intent);
                            AdInfo adInfo2 = this.f1438c;
                            adInfo2.setUrl(adInfo2.getLink());
                        }
                    } catch (Exception unused) {
                    }
                }
                if (this.f1438c.getAiLink() != null) {
                    e.f(this, this.f1438c.getAiLink(), this.f1438c.getAiLinkDelayMillis());
                }
                adInfo = this.f1438c;
                i5 = 2;
                break;
            default:
                return;
        }
        adInfo.setFeedBack(i5);
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0077  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superbock.ui.AdAlertActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.f1437b;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        int type = this.f1438c.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1438c, true, false);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1438c.getCustomId() > 0) {
                App.f1372b.c(this.f1438c);
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
        if (this.f1438c == null) {
            return;
        }
        App.f1373c = true;
        if (this.f1439d == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f1439d = currentTimeMillis;
            this.f1438c.setStartTime(currentTimeMillis);
        }
        if (this.f1438c.getType() == 2) {
            i.n(0, "39", null);
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        int type = this.f1438c.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1438c, true, true);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1438c.getType() == 2) {
                i.n(0, "40", null);
            }
            if (this.f1438c.getCustomId() > 0) {
                App.f1372b.c(this.f1438c);
            }
        }
    }
}
