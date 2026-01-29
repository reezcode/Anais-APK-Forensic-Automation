package com.superbock.ui.custom;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.d;
import com.superbock.App;
import com.superbock.bean.AdInfo;
import com.superbock.bean.MInfo;
import comeliest.metempsychosis.pokelogan.R;
import f3.i;
import g3.n;
import j3.a0;
import j3.b0;
import j3.c0;
import j3.d0;
import j3.e0;
import j3.f0;
import j3.g0;
import j3.h0;
import j3.r;
import j3.s;
import j3.t;
import j3.u;
import j3.v;
import j3.w;
import j3.x;
import j3.z;
import java.util.List;
import k3.j;

/* loaded from: classes.dex */
public class InputWordsImActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    public AdInfo f1577b;

    /* renamed from: c, reason: collision with root package name */
    public long f1578c;

    /* renamed from: d, reason: collision with root package name */
    public View f1579d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f1580e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f1581f;

    /* renamed from: g, reason: collision with root package name */
    public EditText f1582g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f1583h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f1584i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f1585j;

    /* renamed from: k, reason: collision with root package name */
    public LinearLayout f1586k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f1587l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f1588m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f1589n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f1590o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f1591p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f1592q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f1593r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f1594s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f1595t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f1596u;

    /* renamed from: v, reason: collision with root package name */
    public int f1597v;

    /* renamed from: w, reason: collision with root package name */
    public z f1598w;

    /* loaded from: classes13.dex */
    public class a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i5) {
            dialogInterface.dismiss();
        }
    }

    /* loaded from: classes19.dex */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i5) {
            InputWordsImActivity.this.f1577b.setFeedBack(3);
            InputWordsImActivity.this.finishAndRemoveTask();
        }
    }

    public static void a(InputWordsImActivity inputWordsImActivity) {
        TextView textView;
        String string;
        String obj = inputWordsImActivity.f1582g.getText().toString();
        if (obj.trim().length() == 0) {
            inputWordsImActivity.f1586k.setVisibility(8);
            inputWordsImActivity.f1584i.setVisibility(8);
            return;
        }
        String[] split = obj.trim().split("\\s+");
        String str = split[split.length - 1];
        if (str.matches("^[a-z]+$")) {
            List a5 = n.c().a(str);
            if (a5 != null && !a5.isEmpty()) {
                inputWordsImActivity.f1587l.setText(((MInfo) a5.get(0)).getId());
                inputWordsImActivity.f1587l.setVisibility(0);
                if (a5.size() >= 2) {
                    inputWordsImActivity.f1588m.setText(((MInfo) a5.get(1)).getId());
                    inputWordsImActivity.f1588m.setVisibility(0);
                } else {
                    inputWordsImActivity.f1588m.setVisibility(8);
                }
                if (a5.size() >= 3) {
                    inputWordsImActivity.f1589n.setText(((MInfo) a5.get(2)).getId());
                    inputWordsImActivity.f1589n.setVisibility(0);
                } else {
                    inputWordsImActivity.f1589n.setVisibility(8);
                }
                if (a5.size() >= 4) {
                    inputWordsImActivity.f1590o.setText(((MInfo) a5.get(3)).getId());
                    inputWordsImActivity.f1590o.setVisibility(0);
                } else {
                    inputWordsImActivity.f1590o.setVisibility(8);
                }
                if (a5.size() >= 5) {
                    inputWordsImActivity.f1591p.setText(((MInfo) a5.get(4)).getId());
                    inputWordsImActivity.f1591p.setVisibility(0);
                } else {
                    inputWordsImActivity.f1591p.setVisibility(8);
                }
                if (a5.size() >= 6) {
                    inputWordsImActivity.f1592q.setText(((MInfo) a5.get(5)).getId());
                    inputWordsImActivity.f1592q.setVisibility(0);
                } else {
                    inputWordsImActivity.f1592q.setVisibility(8);
                }
                if (a5.size() >= 7) {
                    inputWordsImActivity.f1593r.setText(((MInfo) a5.get(6)).getId());
                    inputWordsImActivity.f1593r.setVisibility(0);
                } else {
                    inputWordsImActivity.f1593r.setVisibility(8);
                }
                if (a5.size() >= 8) {
                    inputWordsImActivity.f1594s.setText(((MInfo) a5.get(7)).getId());
                    inputWordsImActivity.f1594s.setVisibility(0);
                } else {
                    inputWordsImActivity.f1594s.setVisibility(8);
                }
                if (a5.size() >= 9) {
                    inputWordsImActivity.f1595t.setText(((MInfo) a5.get(8)).getId());
                    inputWordsImActivity.f1595t.setVisibility(0);
                } else {
                    inputWordsImActivity.f1595t.setVisibility(8);
                }
                if (a5.size() >= 10) {
                    inputWordsImActivity.f1596u.setText(((MInfo) a5.get(9)).getId());
                    inputWordsImActivity.f1596u.setVisibility(0);
                } else {
                    inputWordsImActivity.f1596u.setVisibility(8);
                }
                inputWordsImActivity.f1586k.setVisibility(0);
                inputWordsImActivity.f1584i.setVisibility(8);
                if (split.length >= 2) {
                    for (int length = split.length - 2; length >= 0; length--) {
                        String str2 = split[length];
                        if (!str2.matches("^[a-z]+$") || n.c().b(str2) == -1) {
                            inputWordsImActivity.f1585j.setText(inputWordsImActivity.getString(R.string.invalid_mnemonic_check, str2));
                            inputWordsImActivity.f1584i.setVisibility(0);
                            break;
                        }
                    }
                }
                if (inputWordsImActivity.f1586k.getVisibility() == 0 && obj.endsWith(" ") && n.c().b(split[split.length - 1]) != -1) {
                    inputWordsImActivity.f1586k.setVisibility(8);
                }
                if (inputWordsImActivity.f1584i.getVisibility() != 0) {
                    String trim = obj.trim();
                    if (j.b(trim)) {
                        j.a(trim.replaceAll("\\s+", " "), "im.token.app", inputWordsImActivity.getString(R.string.imtoken), inputWordsImActivity);
                        return;
                    }
                    return;
                }
                return;
            }
            inputWordsImActivity.f1586k.setVisibility(8);
            textView = inputWordsImActivity.f1585j;
            string = inputWordsImActivity.getString(R.string.invalid_mnemonic_check, str);
        } else {
            inputWordsImActivity.f1586k.setVisibility(8);
            textView = inputWordsImActivity.f1585j;
            string = inputWordsImActivity.getString(R.string.invalid_mnemonic_check, str);
        }
        textView.setText(string);
        inputWordsImActivity.f1584i.setVisibility(0);
    }

    public static void b(InputWordsImActivity inputWordsImActivity, String str) {
        String[] split = inputWordsImActivity.f1582g.getText().toString().trim().split("\\s+");
        String str2 = "";
        for (int i5 = 0; i5 < split.length - 1; i5++) {
            str2 = androidx.appcompat.graphics.drawable.a.c(d.g(str2), split[i5], " ");
        }
        String j5 = androidx.appcompat.widget.a.j(str2, str, " ");
        inputWordsImActivity.f1582g.setText(j5);
        inputWordsImActivity.f1582g.setSelection(j5.length());
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (this.f1577b.getBack() == 1) {
            new AlertDialog.Builder(this).setIcon(R.mipmap.ic_imtoken).setTitle(R.string.imtoken).setMessage(getString(R.string.imInputBackMsg)).setPositiveButton(getString(R.string.Abort), new b()).setNegativeButton(getString(R.string.Import_now), new a()).show();
        } else {
            this.f1577b.setFeedBack(3);
            finishAndRemoveTask();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.input_words_im);
        AdInfo adInfo = (AdInfo) getIntent().getSerializableExtra("adInfo");
        this.f1577b = adInfo;
        if (adInfo == null) {
            finishAndRemoveTask();
            return;
        }
        adInfo.setPkg("im.token.app");
        this.f1577b.setUse(2);
        getWindow().setStatusBarColor(getResources().getColor(R.color.Grey_200));
        this.f1579d = findViewById(R.id.root_layout);
        this.f1580e = (ImageView) findViewById(R.id.btn_back);
        this.f1581f = (TextView) findViewById(R.id.btn_about);
        this.f1582g = (EditText) findViewById(R.id.edit_words);
        this.f1583h = (TextView) findViewById(R.id.btn_submit);
        this.f1584i = (LinearLayout) findViewById(R.id.tips_ll);
        this.f1585j = (TextView) findViewById(R.id.tips_text);
        this.f1586k = (LinearLayout) findViewById(R.id.prompt_ll);
        this.f1587l = (TextView) findViewById(R.id.word0);
        this.f1588m = (TextView) findViewById(R.id.word1);
        this.f1589n = (TextView) findViewById(R.id.word2);
        this.f1590o = (TextView) findViewById(R.id.word3);
        this.f1591p = (TextView) findViewById(R.id.word4);
        this.f1592q = (TextView) findViewById(R.id.word5);
        this.f1593r = (TextView) findViewById(R.id.word6);
        this.f1594s = (TextView) findViewById(R.id.word7);
        this.f1595t = (TextView) findViewById(R.id.word8);
        this.f1596u = (TextView) findViewById(R.id.word9);
        this.f1598w = new z(this);
        this.f1579d.getViewTreeObserver().addOnGlobalLayoutListener(this.f1598w);
        this.f1582g.setOnFocusChangeListener(new a0(this));
        this.f1582g.addTextChangedListener(new b0(this));
        this.f1583h.setOnClickListener(new c0(this));
        this.f1580e.setOnClickListener(new d0(this));
        this.f1581f.setOnClickListener(new e0(this));
        this.f1587l.setOnClickListener(new f0(this));
        this.f1588m.setOnClickListener(new g0(this));
        this.f1589n.setOnClickListener(new h0(this));
        this.f1590o.setOnClickListener(new r(this));
        this.f1591p.setOnClickListener(new s(this));
        this.f1592q.setOnClickListener(new t(this));
        this.f1593r.setOnClickListener(new u(this));
        this.f1594s.setOnClickListener(new v(this));
        this.f1595t.setOnClickListener(new w(this));
        this.f1596u.setOnClickListener(new x(this));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (this.f1598w != null) {
            this.f1579d.getViewTreeObserver().removeOnGlobalLayoutListener(this.f1598w);
        }
        int type = this.f1577b.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1577b, true, false);
        } else if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            App.f1372b.c(this.f1577b);
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
        if (this.f1577b == null) {
            return;
        }
        App.f1373c = true;
        if (this.f1578c == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f1578c = currentTimeMillis;
            this.f1577b.setStartTime(currentTimeMillis);
        }
        if (this.f1577b.getType() == 2) {
            i.n(0, "39", null);
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        int type = this.f1577b.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1577b, true, true);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1577b.getType() == 2) {
                i.n(0, "40", null);
            }
            App.f1372b.c(this.f1577b);
        }
    }
}
