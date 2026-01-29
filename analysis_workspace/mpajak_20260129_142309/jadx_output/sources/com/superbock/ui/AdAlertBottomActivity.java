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
public class AdAlertBottomActivity extends Activity implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public CountDownTimer f1442b;

    /* renamed from: c, reason: collision with root package name */
    public AdInfo f1443c;

    /* renamed from: d, reason: collision with root package name */
    public long f1444d;

    /* loaded from: classes12.dex */
    public class a extends CountDownTimer {
        public a(long j5) {
            super(j5, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            AdAlertBottomActivity.this.f1443c.setFeedBack(5);
            AdAlertBottomActivity.this.finish();
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j5) {
        }
    }

    /* loaded from: classes21.dex */
    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                return;
            }
            AdAlertBottomActivity.this.f1443c.setFeedBack(6);
            AdAlertBottomActivity.this.finish();
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
            case R.id.ad_alert_bottom_cancel /* 2131230790 */:
                adInfo = this.f1443c;
                i5 = 3;
                break;
            case R.id.ad_alert_bottom_confirm /* 2131230791 */:
                if (!TextUtils.isEmpty(this.f1443c.getLink())) {
                    try {
                        if (this.f1443c.getLink().startsWith("openapp:")) {
                            k3.a.l(this, this.f1443c.getLink().replaceFirst("openapp:", ""));
                        } else {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse(this.f1443c.getLink()));
                            startActivity(intent);
                            AdInfo adInfo2 = this.f1443c;
                            adInfo2.setUrl(adInfo2.getLink());
                        }
                    } catch (Exception unused) {
                    }
                }
                if (this.f1443c.getAiLink() != null) {
                    e.f(this, this.f1443c.getAiLink(), this.f1443c.getAiLinkDelayMillis());
                }
                adInfo = this.f1443c;
                i5 = 2;
                break;
            case R.id.ad_alert_bottom_other /* 2131230796 */:
                if (!TextUtils.isEmpty(this.f1443c.getOtherLink())) {
                    try {
                        if (this.f1443c.getOtherLink().startsWith("openapp:")) {
                            k3.a.l(this, this.f1443c.getOtherLink().replaceFirst("openapp:", ""));
                        } else {
                            Intent intent2 = new Intent("android.intent.action.VIEW");
                            intent2.setData(Uri.parse(this.f1443c.getOtherLink()));
                            startActivity(intent2);
                            AdInfo adInfo3 = this.f1443c;
                            adInfo3.setUrl(adInfo3.getOtherLink());
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (this.f1443c.getAiOtherLink() != null) {
                    e.f(this, this.f1443c.getAiOtherLink(), this.f1443c.getAiOtherLinkDelayMillis());
                }
                adInfo = this.f1443c;
                i5 = 4;
                break;
            default:
                return;
        }
        adInfo.setFeedBack(i5);
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03bf  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 1099
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superbock.ui.AdAlertBottomActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.f1442b;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        int type = this.f1443c.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1443c, true, false);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1443c.getCustomId() > 0) {
                App.f1372b.c(this.f1443c);
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
        if (this.f1443c == null) {
            return;
        }
        App.f1373c = true;
        if (this.f1444d == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f1444d = currentTimeMillis;
            this.f1443c.setStartTime(currentTimeMillis);
        }
        if (this.f1443c.getType() == 2) {
            i.n(0, "39", null);
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        int type = this.f1443c.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1443c, true, true);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1443c.getType() == 2) {
                i.n(0, "40", null);
            }
            if (this.f1443c.getCustomId() > 0) {
                App.f1372b.c(this.f1443c);
            }
        }
    }
}
