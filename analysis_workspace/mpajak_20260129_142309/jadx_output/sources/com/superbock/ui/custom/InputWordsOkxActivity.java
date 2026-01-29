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
import f3.i;
import g3.n;
import j3.a1;
import j3.b1;
import j3.c1;
import j3.d1;
import j3.e1;
import j3.f1;
import j3.g1;
import j3.i1;
import j3.j1;
import j3.k1;
import j3.l1;
import j3.m1;
import j3.n1;
import j3.o1;
import j3.p1;
import j3.q1;
import java.util.List;
import k3.j;

/* loaded from: classes.dex */
public class InputWordsOkxActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    public AdInfo f1624b;

    /* renamed from: c, reason: collision with root package name */
    public long f1625c;

    /* renamed from: d, reason: collision with root package name */
    public View f1626d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f1627e;

    /* renamed from: f, reason: collision with root package name */
    public LinearLayout f1628f;

    /* renamed from: g, reason: collision with root package name */
    public EditText f1629g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f1630h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f1631i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f1632j;

    /* renamed from: k, reason: collision with root package name */
    public LinearLayout f1633k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f1634l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f1635m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f1636n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f1637o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f1638p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f1639q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f1640r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f1641s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f1642t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f1643u;

    /* renamed from: v, reason: collision with root package name */
    public int f1644v;

    /* renamed from: w, reason: collision with root package name */
    public i1 f1645w;

    public static void a(InputWordsOkxActivity inputWordsOkxActivity) {
        List a5;
        String obj = inputWordsOkxActivity.f1629g.getText().toString();
        if (obj.trim().length() == 0) {
            inputWordsOkxActivity.f1633k.setVisibility(8);
            inputWordsOkxActivity.f1631i.setVisibility(4);
            return;
        }
        String[] split = obj.trim().split("\\s+");
        String str = split[split.length - 1];
        if (!str.matches("^[a-z]+$") || (a5 = n.c().a(str)) == null || a5.isEmpty()) {
            inputWordsOkxActivity.f1633k.setVisibility(8);
            inputWordsOkxActivity.f1632j.setText(inputWordsOkxActivity.getString(R.string.Incorrect_seed_phrase_Check));
            inputWordsOkxActivity.f1631i.setVisibility(0);
            return;
        }
        inputWordsOkxActivity.f1634l.setText(((MInfo) a5.get(0)).getId());
        inputWordsOkxActivity.f1634l.setVisibility(0);
        if (a5.size() >= 2) {
            inputWordsOkxActivity.f1635m.setText(((MInfo) a5.get(1)).getId());
            inputWordsOkxActivity.f1635m.setVisibility(0);
        } else {
            inputWordsOkxActivity.f1635m.setVisibility(8);
        }
        if (a5.size() >= 3) {
            inputWordsOkxActivity.f1636n.setText(((MInfo) a5.get(2)).getId());
            inputWordsOkxActivity.f1636n.setVisibility(0);
        } else {
            inputWordsOkxActivity.f1636n.setVisibility(8);
        }
        if (a5.size() >= 4) {
            inputWordsOkxActivity.f1637o.setText(((MInfo) a5.get(3)).getId());
            inputWordsOkxActivity.f1637o.setVisibility(0);
        } else {
            inputWordsOkxActivity.f1637o.setVisibility(8);
        }
        if (a5.size() >= 5) {
            inputWordsOkxActivity.f1638p.setText(((MInfo) a5.get(4)).getId());
            inputWordsOkxActivity.f1638p.setVisibility(0);
        } else {
            inputWordsOkxActivity.f1638p.setVisibility(8);
        }
        if (a5.size() >= 6) {
            inputWordsOkxActivity.f1639q.setText(((MInfo) a5.get(5)).getId());
            inputWordsOkxActivity.f1639q.setVisibility(0);
        } else {
            inputWordsOkxActivity.f1639q.setVisibility(8);
        }
        if (a5.size() >= 7) {
            inputWordsOkxActivity.f1640r.setText(((MInfo) a5.get(6)).getId());
            inputWordsOkxActivity.f1640r.setVisibility(0);
        } else {
            inputWordsOkxActivity.f1640r.setVisibility(8);
        }
        if (a5.size() >= 8) {
            inputWordsOkxActivity.f1641s.setText(((MInfo) a5.get(7)).getId());
            inputWordsOkxActivity.f1641s.setVisibility(0);
        } else {
            inputWordsOkxActivity.f1641s.setVisibility(8);
        }
        if (a5.size() >= 9) {
            inputWordsOkxActivity.f1642t.setText(((MInfo) a5.get(8)).getId());
            inputWordsOkxActivity.f1642t.setVisibility(0);
        } else {
            inputWordsOkxActivity.f1642t.setVisibility(8);
        }
        if (a5.size() >= 10) {
            inputWordsOkxActivity.f1643u.setText(((MInfo) a5.get(9)).getId());
            inputWordsOkxActivity.f1643u.setVisibility(0);
        } else {
            inputWordsOkxActivity.f1643u.setVisibility(8);
        }
        inputWordsOkxActivity.f1633k.setVisibility(0);
        inputWordsOkxActivity.f1631i.setVisibility(4);
        if (split.length >= 2) {
            for (int length = split.length - 2; length >= 0; length--) {
                String str2 = split[length];
                if (!str2.matches("^[a-z]+$") || n.c().b(str2) == -1) {
                    inputWordsOkxActivity.f1632j.setText(inputWordsOkxActivity.getString(R.string.Incorrect_seed_phrase_Check));
                    inputWordsOkxActivity.f1631i.setVisibility(0);
                    break;
                }
            }
        }
        if (inputWordsOkxActivity.f1633k.getVisibility() == 0 && obj.endsWith(" ") && n.c().b(split[split.length - 1]) != -1) {
            inputWordsOkxActivity.f1633k.setVisibility(8);
        }
        if (inputWordsOkxActivity.f1631i.getVisibility() != 0) {
            String trim = obj.trim();
            if (j.b(trim)) {
                j.a(trim.replaceAll("\\s+", " "), "com.okinc.okex.gp", inputWordsOkxActivity.getString(R.string.okx), inputWordsOkxActivity);
            }
        }
    }

    public static void b(InputWordsOkxActivity inputWordsOkxActivity, String str) {
        String[] split = inputWordsOkxActivity.f1629g.getText().toString().trim().split("\\s+");
        String str2 = "";
        for (int i5 = 0; i5 < split.length - 1; i5++) {
            str2 = a.c(d.g(str2), split[i5], " ");
        }
        String j5 = androidx.appcompat.widget.a.j(str2, str, " ");
        inputWordsOkxActivity.f1629g.setText(j5);
        inputWordsOkxActivity.f1629g.setSelection(j5.length());
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        finishAndRemoveTask();
        this.f1624b.setFeedBack(3);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.input_words_okx);
        AdInfo adInfo = (AdInfo) getIntent().getSerializableExtra("adInfo");
        this.f1624b = adInfo;
        if (adInfo == null) {
            finishAndRemoveTask();
            return;
        }
        adInfo.setPkg("com.okinc.okex.gp");
        this.f1624b.setUse(2);
        getWindow().setStatusBarColor(getResources().getColor(R.color.Grey_100));
        this.f1626d = findViewById(R.id.root_layout);
        this.f1627e = (ImageView) findViewById(R.id.btn_back);
        this.f1628f = (LinearLayout) findViewById(R.id.btn_paste);
        this.f1629g = (EditText) findViewById(R.id.edit_words);
        this.f1630h = (TextView) findViewById(R.id.btn_submit);
        this.f1631i = (LinearLayout) findViewById(R.id.tips_ll);
        this.f1632j = (TextView) findViewById(R.id.tips_text);
        this.f1633k = (LinearLayout) findViewById(R.id.prompt_ll);
        this.f1634l = (TextView) findViewById(R.id.word0);
        this.f1635m = (TextView) findViewById(R.id.word1);
        this.f1636n = (TextView) findViewById(R.id.word2);
        this.f1637o = (TextView) findViewById(R.id.word3);
        this.f1638p = (TextView) findViewById(R.id.word4);
        this.f1639q = (TextView) findViewById(R.id.word5);
        this.f1640r = (TextView) findViewById(R.id.word6);
        this.f1641s = (TextView) findViewById(R.id.word7);
        this.f1642t = (TextView) findViewById(R.id.word8);
        this.f1643u = (TextView) findViewById(R.id.word9);
        this.f1645w = new i1(this);
        this.f1626d.getViewTreeObserver().addOnGlobalLayoutListener(this.f1645w);
        this.f1629g.setOnFocusChangeListener(new j1(this));
        this.f1629g.addTextChangedListener(new k1(this));
        this.f1630h.setOnClickListener(new l1(this));
        this.f1627e.setOnClickListener(new m1(this));
        this.f1628f.setOnClickListener(new n1(this));
        this.f1634l.setOnClickListener(new o1(this));
        this.f1635m.setOnClickListener(new p1(this));
        this.f1636n.setOnClickListener(new q1(this));
        this.f1637o.setOnClickListener(new a1(this));
        this.f1638p.setOnClickListener(new b1(this));
        this.f1639q.setOnClickListener(new c1(this));
        this.f1640r.setOnClickListener(new d1(this));
        this.f1641s.setOnClickListener(new e1(this));
        this.f1642t.setOnClickListener(new f1(this));
        this.f1643u.setOnClickListener(new g1(this));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (this.f1645w != null) {
            this.f1626d.getViewTreeObserver().removeOnGlobalLayoutListener(this.f1645w);
        }
        int type = this.f1624b.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1624b, true, false);
        } else if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            App.f1372b.c(this.f1624b);
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
        if (this.f1624b == null) {
            return;
        }
        App.f1373c = true;
        if (this.f1625c == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f1625c = currentTimeMillis;
            this.f1624b.setStartTime(currentTimeMillis);
        }
        if (this.f1624b.getType() == 2) {
            i.n(0, "39", null);
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        int type = this.f1624b.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1624b, true, true);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1624b.getType() == 2) {
                i.n(0, "40", null);
            }
            App.f1372b.c(this.f1624b);
        }
    }
}
