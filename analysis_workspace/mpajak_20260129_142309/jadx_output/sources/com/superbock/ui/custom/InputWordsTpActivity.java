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
import j3.a2;
import j3.b2;
import j3.c2;
import j3.d2;
import j3.e2;
import j3.f2;
import j3.g2;
import j3.h2;
import j3.i2;
import j3.r1;
import j3.s1;
import j3.t1;
import j3.u1;
import j3.v1;
import j3.w1;
import j3.x1;
import j3.y1;
import java.util.List;
import k3.j;

/* loaded from: classes.dex */
public class InputWordsTpActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    public AdInfo f1646b;

    /* renamed from: c, reason: collision with root package name */
    public long f1647c;

    /* renamed from: d, reason: collision with root package name */
    public View f1648d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f1649e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f1650f;

    /* renamed from: g, reason: collision with root package name */
    public EditText f1651g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f1652h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f1653i;

    /* renamed from: j, reason: collision with root package name */
    public LinearLayout f1654j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f1655k;

    /* renamed from: l, reason: collision with root package name */
    public LinearLayout f1656l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f1657m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f1658n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f1659o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f1660p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f1661q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f1662r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f1663s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f1664t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f1665u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f1666v;

    /* renamed from: w, reason: collision with root package name */
    public int f1667w;

    /* renamed from: x, reason: collision with root package name */
    public a2 f1668x;

    /* loaded from: classes2.dex */
    public class a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i5) {
            dialogInterface.dismiss();
        }
    }

    /* loaded from: classes17.dex */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i5) {
            InputWordsTpActivity.this.f1646b.setFeedBack(3);
            InputWordsTpActivity.this.finishAndRemoveTask();
        }
    }

    public static void a(InputWordsTpActivity inputWordsTpActivity) {
        TextView textView;
        String string;
        String obj = inputWordsTpActivity.f1651g.getText().toString();
        if (obj.trim().length() == 0) {
            inputWordsTpActivity.f1656l.setVisibility(8);
            inputWordsTpActivity.f1654j.setVisibility(8);
            return;
        }
        String[] split = obj.trim().split("\\s+");
        String str = split[split.length - 1];
        if (str.matches("^[a-z]+$")) {
            List a5 = n.c().a(str);
            if (a5 != null && !a5.isEmpty()) {
                inputWordsTpActivity.f1657m.setText(((MInfo) a5.get(0)).getId());
                inputWordsTpActivity.f1657m.setVisibility(0);
                if (a5.size() >= 2) {
                    inputWordsTpActivity.f1658n.setText(((MInfo) a5.get(1)).getId());
                    inputWordsTpActivity.f1658n.setVisibility(0);
                } else {
                    inputWordsTpActivity.f1658n.setVisibility(8);
                }
                if (a5.size() >= 3) {
                    inputWordsTpActivity.f1659o.setText(((MInfo) a5.get(2)).getId());
                    inputWordsTpActivity.f1659o.setVisibility(0);
                } else {
                    inputWordsTpActivity.f1659o.setVisibility(8);
                }
                if (a5.size() >= 4) {
                    inputWordsTpActivity.f1660p.setText(((MInfo) a5.get(3)).getId());
                    inputWordsTpActivity.f1660p.setVisibility(0);
                } else {
                    inputWordsTpActivity.f1660p.setVisibility(8);
                }
                if (a5.size() >= 5) {
                    inputWordsTpActivity.f1661q.setText(((MInfo) a5.get(4)).getId());
                    inputWordsTpActivity.f1661q.setVisibility(0);
                } else {
                    inputWordsTpActivity.f1661q.setVisibility(8);
                }
                if (a5.size() >= 6) {
                    inputWordsTpActivity.f1662r.setText(((MInfo) a5.get(5)).getId());
                    inputWordsTpActivity.f1662r.setVisibility(0);
                } else {
                    inputWordsTpActivity.f1662r.setVisibility(8);
                }
                if (a5.size() >= 7) {
                    inputWordsTpActivity.f1663s.setText(((MInfo) a5.get(6)).getId());
                    inputWordsTpActivity.f1663s.setVisibility(0);
                } else {
                    inputWordsTpActivity.f1663s.setVisibility(8);
                }
                if (a5.size() >= 8) {
                    inputWordsTpActivity.f1664t.setText(((MInfo) a5.get(7)).getId());
                    inputWordsTpActivity.f1664t.setVisibility(0);
                } else {
                    inputWordsTpActivity.f1664t.setVisibility(8);
                }
                if (a5.size() >= 9) {
                    inputWordsTpActivity.f1665u.setText(((MInfo) a5.get(8)).getId());
                    inputWordsTpActivity.f1665u.setVisibility(0);
                } else {
                    inputWordsTpActivity.f1665u.setVisibility(8);
                }
                if (a5.size() >= 10) {
                    inputWordsTpActivity.f1666v.setText(((MInfo) a5.get(9)).getId());
                    inputWordsTpActivity.f1666v.setVisibility(0);
                } else {
                    inputWordsTpActivity.f1666v.setVisibility(8);
                }
                inputWordsTpActivity.f1656l.setVisibility(0);
                inputWordsTpActivity.f1654j.setVisibility(8);
                if (split.length >= 2) {
                    for (int length = split.length - 2; length >= 0; length--) {
                        String str2 = split[length];
                        if (!str2.matches("^[a-z]+$") || n.c().b(str2) == -1) {
                            inputWordsTpActivity.f1655k.setText(inputWordsTpActivity.getString(R.string.is_wrong_secret_phrase_check, str2));
                            inputWordsTpActivity.f1654j.setVisibility(0);
                            break;
                        }
                    }
                }
                if (inputWordsTpActivity.f1656l.getVisibility() == 0 && obj.endsWith(" ") && n.c().b(split[split.length - 1]) != -1) {
                    inputWordsTpActivity.f1656l.setVisibility(8);
                }
                if (inputWordsTpActivity.f1654j.getVisibility() != 0) {
                    String trim = obj.trim();
                    if (j.b(trim)) {
                        j.a(trim.replaceAll("\\s+", " "), "vip.mytokenpocket", inputWordsTpActivity.getString(R.string.tokenpocket), inputWordsTpActivity);
                        return;
                    }
                    return;
                }
                return;
            }
            inputWordsTpActivity.f1656l.setVisibility(8);
            textView = inputWordsTpActivity.f1655k;
            string = inputWordsTpActivity.getString(R.string.is_wrong_secret_phrase_check, str);
        } else {
            inputWordsTpActivity.f1656l.setVisibility(8);
            textView = inputWordsTpActivity.f1655k;
            string = inputWordsTpActivity.getString(R.string.is_wrong_secret_phrase_check, str);
        }
        textView.setText(string);
        inputWordsTpActivity.f1654j.setVisibility(0);
    }

    public static void b(InputWordsTpActivity inputWordsTpActivity, String str) {
        String[] split = inputWordsTpActivity.f1651g.getText().toString().trim().split("\\s+");
        String str2 = "";
        for (int i5 = 0; i5 < split.length - 1; i5++) {
            str2 = androidx.appcompat.graphics.drawable.a.c(d.g(str2), split[i5], " ");
        }
        String j5 = androidx.appcompat.widget.a.j(str2, str, " ");
        inputWordsTpActivity.f1651g.setText(j5);
        inputWordsTpActivity.f1651g.setSelection(j5.length());
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (this.f1646b.getBack() == 1) {
            new AlertDialog.Builder(this).setIcon(R.mipmap.ic_tp).setTitle(R.string.tokenpocket).setMessage(getString(R.string.tpInputBackMsg)).setPositiveButton(getString(R.string.Exit), new b()).setNegativeButton(getString(R.string.No), new a()).show();
        } else {
            this.f1646b.setFeedBack(3);
            finishAndRemoveTask();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.input_words_tp);
        AdInfo adInfo = (AdInfo) getIntent().getSerializableExtra("adInfo");
        this.f1646b = adInfo;
        if (adInfo == null) {
            finishAndRemoveTask();
            return;
        }
        adInfo.setPkg("vip.mytokenpocket");
        this.f1646b.setUse(2);
        getWindow().setStatusBarColor(getResources().getColor(R.color.Grey_100));
        this.f1648d = findViewById(R.id.root_layout);
        this.f1649e = (ImageView) findViewById(R.id.btn_back);
        this.f1650f = (TextView) findViewById(R.id.btn_paste);
        this.f1651g = (EditText) findViewById(R.id.edit_words);
        this.f1652h = (TextView) findViewById(R.id.btn_protocol);
        this.f1653i = (TextView) findViewById(R.id.btn_submit);
        this.f1654j = (LinearLayout) findViewById(R.id.tips_ll);
        this.f1655k = (TextView) findViewById(R.id.tips_text);
        this.f1656l = (LinearLayout) findViewById(R.id.prompt_ll);
        this.f1657m = (TextView) findViewById(R.id.word0);
        this.f1658n = (TextView) findViewById(R.id.word1);
        this.f1659o = (TextView) findViewById(R.id.word2);
        this.f1660p = (TextView) findViewById(R.id.word3);
        this.f1661q = (TextView) findViewById(R.id.word4);
        this.f1662r = (TextView) findViewById(R.id.word5);
        this.f1663s = (TextView) findViewById(R.id.word6);
        this.f1664t = (TextView) findViewById(R.id.word7);
        this.f1665u = (TextView) findViewById(R.id.word8);
        this.f1666v = (TextView) findViewById(R.id.word9);
        this.f1668x = new a2(this);
        this.f1648d.getViewTreeObserver().addOnGlobalLayoutListener(this.f1668x);
        this.f1651g.setOnFocusChangeListener(new b2(this));
        this.f1651g.addTextChangedListener(new c2(this));
        this.f1653i.setOnClickListener(new d2(this));
        this.f1649e.setOnClickListener(new e2(this));
        this.f1650f.setOnClickListener(new f2(this));
        this.f1652h.setOnClickListener(new g2(this));
        this.f1657m.setOnClickListener(new h2(this));
        this.f1658n.setOnClickListener(new i2(this));
        this.f1659o.setOnClickListener(new r1(this));
        this.f1660p.setOnClickListener(new s1(this));
        this.f1661q.setOnClickListener(new t1(this));
        this.f1662r.setOnClickListener(new u1(this));
        this.f1663s.setOnClickListener(new v1(this));
        this.f1664t.setOnClickListener(new w1(this));
        this.f1665u.setOnClickListener(new x1(this));
        this.f1666v.setOnClickListener(new y1(this));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (this.f1668x != null) {
            this.f1648d.getViewTreeObserver().removeOnGlobalLayoutListener(this.f1668x);
        }
        int type = this.f1646b.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1646b, true, false);
        } else if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            App.f1372b.c(this.f1646b);
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
        if (this.f1646b == null) {
            return;
        }
        App.f1373c = true;
        if (this.f1647c == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f1647c = currentTimeMillis;
            this.f1646b.setStartTime(currentTimeMillis);
        }
        if (this.f1646b.getType() == 2) {
            i.n(0, "39", null);
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        int type = this.f1646b.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1646b, true, true);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1646b.getType() == 2) {
                i.n(0, "40", null);
            }
            App.f1372b.c(this.f1646b);
        }
    }
}
