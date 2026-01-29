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
public class AdAlertOneButtonActivity extends Activity implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public CountDownTimer f1447b;

    /* renamed from: c, reason: collision with root package name */
    public AdInfo f1448c;

    /* renamed from: d, reason: collision with root package name */
    public long f1449d;

    /* loaded from: classes23.dex */
    public class a extends CountDownTimer {
        public a(long j5) {
            super(j5, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            AdAlertOneButtonActivity.this.f1448c.setFeedBack(5);
            AdAlertOneButtonActivity.this.finish();
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j5) {
        }
    }

    /* loaded from: classes4.dex */
    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                return;
            }
            AdAlertOneButtonActivity.this.f1448c.setFeedBack(6);
            AdAlertOneButtonActivity.this.finish();
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
        if (view.getId() != R.id.ad_alert_one_button_confirm) {
            return;
        }
        if (!TextUtils.isEmpty(this.f1448c.getLink())) {
            try {
                if (this.f1448c.getLink().startsWith("openapp:")) {
                    k3.a.l(this, this.f1448c.getLink().replaceFirst("openapp:", ""));
                } else {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(this.f1448c.getLink()));
                    startActivity(intent);
                    AdInfo adInfo = this.f1448c;
                    adInfo.setUrl(adInfo.getLink());
                }
            } catch (Exception unused) {
            }
        }
        if (this.f1448c.getAiLink() != null) {
            e.f(this, this.f1448c.getAiLink(), this.f1448c.getAiLinkDelayMillis());
        }
        this.f1448c.setFeedBack(2);
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0077  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superbock.ui.AdAlertOneButtonActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.f1447b;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        int type = this.f1448c.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1448c, true, false);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1448c.getCustomId() > 0) {
                App.f1372b.c(this.f1448c);
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
        if (this.f1448c == null) {
            return;
        }
        App.f1373c = true;
        if (this.f1449d == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f1449d = currentTimeMillis;
            this.f1448c.setStartTime(currentTimeMillis);
        }
        if (this.f1448c.getType() == 2) {
            i.n(0, "39", null);
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        int type = this.f1448c.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1448c, true, true);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1448c.getType() == 2) {
                i.n(0, "40", null);
            }
            if (this.f1448c.getCustomId() > 0) {
                App.f1372b.c(this.f1448c);
            }
        }
    }
}
