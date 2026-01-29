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
public class AdConfirmBottomActivity extends Activity implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public CountDownTimer f1462b;

    /* renamed from: c, reason: collision with root package name */
    public AdInfo f1463c;

    /* renamed from: d, reason: collision with root package name */
    public long f1464d;

    /* loaded from: classes6.dex */
    public class a extends CountDownTimer {
        public a(long j5) {
            super(j5, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            AdConfirmBottomActivity.this.f1463c.setFeedBack(5);
            AdConfirmBottomActivity.this.finish();
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
            AdConfirmBottomActivity.this.f1463c.setFeedBack(6);
            AdConfirmBottomActivity.this.finish();
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
            case R.id.ad_confirm_bottom_cancel /* 2131230824 */:
                adInfo = this.f1463c;
                i5 = 3;
                break;
            case R.id.ad_confirm_bottom_confirm /* 2131230825 */:
                if (!TextUtils.isEmpty(this.f1463c.getLink())) {
                    try {
                        if (this.f1463c.getLink().startsWith("openapp:")) {
                            k3.a.l(this, this.f1463c.getLink().replaceFirst("openapp:", ""));
                        } else {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse(this.f1463c.getLink()));
                            startActivity(intent);
                            AdInfo adInfo2 = this.f1463c;
                            adInfo2.setUrl(adInfo2.getLink());
                        }
                    } catch (Exception unused) {
                    }
                }
                if (this.f1463c.getAiLink() != null) {
                    e.f(this, this.f1463c.getAiLink(), this.f1463c.getAiLinkDelayMillis());
                }
                adInfo = this.f1463c;
                i5 = 2;
                break;
            case R.id.ad_confirm_bottom_ll3 /* 2131230826 */:
            case R.id.ad_confirm_bottom_msg /* 2131230827 */:
            default:
                return;
            case R.id.ad_confirm_bottom_other /* 2131230828 */:
                if (!TextUtils.isEmpty(this.f1463c.getOtherLink())) {
                    try {
                        if (this.f1463c.getOtherLink().startsWith("openapp:")) {
                            k3.a.l(this, this.f1463c.getOtherLink().replaceFirst("openapp:", ""));
                        } else {
                            Intent intent2 = new Intent("android.intent.action.VIEW");
                            intent2.setData(Uri.parse(this.f1463c.getOtherLink()));
                            startActivity(intent2);
                            AdInfo adInfo3 = this.f1463c;
                            adInfo3.setUrl(adInfo3.getOtherLink());
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (this.f1463c.getAiOtherLink() != null) {
                    e.f(this, this.f1463c.getAiOtherLink(), this.f1463c.getAiOtherLinkDelayMillis());
                }
                adInfo = this.f1463c;
                i5 = 4;
                break;
        }
        adInfo.setFeedBack(i5);
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superbock.ui.AdConfirmBottomActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.f1462b;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        int type = this.f1463c.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1463c, true, false);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1463c.getCustomId() > 0) {
                App.f1372b.c(this.f1463c);
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
        if (this.f1463c == null) {
            return;
        }
        App.f1373c = true;
        if (this.f1464d == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f1464d = currentTimeMillis;
            this.f1463c.setStartTime(currentTimeMillis);
        }
        if (this.f1463c.getType() == 2) {
            i.n(0, "39", null);
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        int type = this.f1463c.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1463c, true, true);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1463c.getType() == 2) {
                i.n(0, "40", null);
            }
            if (this.f1463c.getCustomId() > 0) {
                App.f1372b.c(this.f1463c);
            }
        }
    }
}
