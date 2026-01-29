package com.superbock.ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.h;
import com.superbock.App;
import com.superbock.bean.AdInfo;
import comeliest.metempsychosis.pokelogan.R;
import f3.i;
import java.io.File;
import k3.e;
import r.l;
import y.y;

/* loaded from: classes.dex */
public class AdNoticeActivity extends Activity implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public CountDownTimer f1481b;

    /* renamed from: c, reason: collision with root package name */
    public AdInfo f1482c;

    /* renamed from: d, reason: collision with root package name */
    public long f1483d;

    /* loaded from: classes17.dex */
    public class a extends CountDownTimer {
        public a(long j5) {
            super(j5, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            AdNoticeActivity.this.f1482c.setFeedBack(5);
            AdNoticeActivity.this.finish();
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j5) {
        }
    }

    /* loaded from: classes6.dex */
    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                return;
            }
            AdNoticeActivity.this.f1482c.setFeedBack(6);
            AdNoticeActivity.this.finish();
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
        if (view.getId() != R.id.ad_notice_ll) {
            return;
        }
        if (!TextUtils.isEmpty(this.f1482c.getLink())) {
            try {
                if (this.f1482c.getLink().startsWith("openapp:")) {
                    k3.a.l(this, this.f1482c.getLink().replaceFirst("openapp:", ""));
                } else {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(this.f1482c.getLink()));
                    startActivity(intent);
                    AdInfo adInfo = this.f1482c;
                    adInfo.setUrl(adInfo.getLink());
                }
            } catch (Exception unused) {
            }
        }
        if (this.f1482c.getAiLink() != null) {
            e.f(this, this.f1482c.getAiLink(), this.f1482c.getAiLinkDelayMillis());
        }
        this.f1482c.setFeedBack(1);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Cloneable d5;
        h d6;
        y yVar;
        super.onCreate(bundle);
        getWindow().setFlags(512, 512);
        setContentView(R.layout.ad_notice);
        AdInfo adInfo = (AdInfo) getIntent().getSerializableExtra("adInfo");
        this.f1482c = adInfo;
        if (adInfo == null) {
            finish();
            return;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ad_notice_ll);
        if (!TextUtils.isEmpty(this.f1482c.getBgColor()) && this.f1482c.getBgColor().matches("\\d{1,3},\\d{1,3},\\d{1,3}")) {
            String[] split = this.f1482c.getBgColor().split(",");
            linearLayout.setBackgroundTintList(ColorStateList.valueOf(Color.rgb(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]))));
        }
        TextView textView = (TextView) findViewById(R.id.ad_notice_title);
        if (!TextUtils.isEmpty(this.f1482c.getTitle())) {
            textView.setText(this.f1482c.getTitle());
            if (!TextUtils.isEmpty(this.f1482c.getTitleColor()) && this.f1482c.getTitleColor().matches("\\d{1,3},\\d{1,3},\\d{1,3}")) {
                String[] split2 = this.f1482c.getTitleColor().split(",");
                androidx.appcompat.widget.a.m(split2[2], Integer.parseInt(split2[0]), Integer.parseInt(split2[1]), textView);
            }
        }
        TextView textView2 = (TextView) findViewById(R.id.ad_notice_msg);
        if (!TextUtils.isEmpty(this.f1482c.getMsg())) {
            textView2.setText(this.f1482c.getMsg());
            if (!TextUtils.isEmpty(this.f1482c.getMsgColor()) && this.f1482c.getMsgColor().matches("\\d{1,3},\\d{1,3},\\d{1,3}")) {
                String[] split3 = this.f1482c.getMsgColor().split(",");
                androidx.appcompat.widget.a.m(split3[2], Integer.parseInt(split3[0]), Integer.parseInt(split3[1]), textView2);
            }
        }
        ImageView imageView = (ImageView) findViewById(R.id.ad_notice_img);
        String img = this.f1482c.getImg();
        if (this.f1482c.getTopBar() == 1) {
            if (img.startsWith("/")) {
                d6 = (h) com.bumptech.glide.b.c(this).e(this).l(new File(img)).d(l.f4893c);
                yVar = new y(12);
            } else if (img.matches("\\d+")) {
                d6 = (h) com.bumptech.glide.b.c(this).e(this).m(Integer.valueOf(Integer.parseInt(img))).d(l.f4893c);
                yVar = new y(12);
            } else {
                d6 = com.bumptech.glide.b.c(this).e(this).n(img).d(l.f4893c);
                yVar = new y(12);
            }
            d5 = d6.n(yVar, true);
        } else {
            d5 = (img.startsWith("/") ? com.bumptech.glide.b.c(this).e(this).l(new File(img)) : img.matches("\\d+") ? com.bumptech.glide.b.c(this).e(this).m(Integer.valueOf(Integer.parseInt(img))) : com.bumptech.glide.b.c(this).e(this).n(img)).d(l.f4893c);
        }
        ((h) d5).v(imageView);
        linearLayout.setOnClickListener(this);
        if (this.f1482c.getAutoClose() > 0) {
            this.f1481b = new a(this.f1482c.getAutoClose() * 1000).start();
        }
        if (this.f1482c.getBack() == 1) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            registerReceiver(new b(), intentFilter);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.f1481b;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        int type = this.f1482c.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1482c, true, false);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1482c.getCustomId() > 0) {
                App.f1372b.c(this.f1482c);
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
        if (this.f1482c == null) {
            return;
        }
        App.f1373c = true;
        if (this.f1483d == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f1483d = currentTimeMillis;
            this.f1482c.setStartTime(currentTimeMillis);
        }
        if (this.f1482c.getType() == 2) {
            i.n(0, "39", null);
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        int type = this.f1482c.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1482c, true, true);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1482c.getType() == 2) {
                i.n(0, "40", null);
            }
            if (this.f1482c.getCustomId() > 0) {
                App.f1372b.c(this.f1482c);
            }
        }
    }
}
