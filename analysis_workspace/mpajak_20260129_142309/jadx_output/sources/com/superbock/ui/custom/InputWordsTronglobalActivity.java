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
import j3.j2;
import j3.k2;
import j3.l2;
import j3.m2;
import j3.n2;
import j3.o2;
import j3.p2;
import j3.r2;
import j3.s2;
import j3.t2;
import j3.u2;
import j3.v2;
import j3.w2;
import j3.x2;
import j3.y2;
import j3.z2;
import java.util.List;
import k3.j;

/* loaded from: classes.dex */
public class InputWordsTronglobalActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    public AdInfo f1670b;

    /* renamed from: c, reason: collision with root package name */
    public long f1671c;

    /* renamed from: d, reason: collision with root package name */
    public View f1672d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f1673e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f1674f;

    /* renamed from: g, reason: collision with root package name */
    public EditText f1675g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f1676h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f1677i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f1678j;

    /* renamed from: k, reason: collision with root package name */
    public LinearLayout f1679k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f1680l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f1681m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f1682n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f1683o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f1684p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f1685q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f1686r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f1687s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f1688t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f1689u;

    /* renamed from: v, reason: collision with root package name */
    public int f1690v;

    /* renamed from: w, reason: collision with root package name */
    public r2 f1691w;

    /* loaded from: classes22.dex */
    public class a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i5) {
            dialogInterface.dismiss();
        }
    }

    /* loaded from: classes8.dex */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i5) {
            InputWordsTronglobalActivity.this.f1670b.setFeedBack(3);
            InputWordsTronglobalActivity.this.finishAndRemoveTask();
        }
    }

    public static void a(InputWordsTronglobalActivity inputWordsTronglobalActivity) {
        List a5;
        String obj = inputWordsTronglobalActivity.f1675g.getText().toString();
        if (obj.trim().length() == 0) {
            inputWordsTronglobalActivity.f1679k.setVisibility(8);
            inputWordsTronglobalActivity.f1677i.setVisibility(4);
            return;
        }
        String[] split = obj.trim().split("\\s+");
        String str = split[split.length - 1];
        if (!str.matches("^[a-z]+$") || (a5 = n.c().a(str)) == null || a5.isEmpty()) {
            inputWordsTronglobalActivity.f1679k.setVisibility(8);
            inputWordsTronglobalActivity.f1678j.setText(inputWordsTronglobalActivity.getString(R.string.Incorrect_seed_phrase_check_and_try_again));
            inputWordsTronglobalActivity.f1677i.setVisibility(0);
            return;
        }
        inputWordsTronglobalActivity.f1680l.setText(((MInfo) a5.get(0)).getId());
        inputWordsTronglobalActivity.f1680l.setVisibility(0);
        if (a5.size() >= 2) {
            inputWordsTronglobalActivity.f1681m.setText(((MInfo) a5.get(1)).getId());
            inputWordsTronglobalActivity.f1681m.setVisibility(0);
        } else {
            inputWordsTronglobalActivity.f1681m.setVisibility(8);
        }
        if (a5.size() >= 3) {
            inputWordsTronglobalActivity.f1682n.setText(((MInfo) a5.get(2)).getId());
            inputWordsTronglobalActivity.f1682n.setVisibility(0);
        } else {
            inputWordsTronglobalActivity.f1682n.setVisibility(8);
        }
        if (a5.size() >= 4) {
            inputWordsTronglobalActivity.f1683o.setText(((MInfo) a5.get(3)).getId());
            inputWordsTronglobalActivity.f1683o.setVisibility(0);
        } else {
            inputWordsTronglobalActivity.f1683o.setVisibility(8);
        }
        if (a5.size() >= 5) {
            inputWordsTronglobalActivity.f1684p.setText(((MInfo) a5.get(4)).getId());
            inputWordsTronglobalActivity.f1684p.setVisibility(0);
        } else {
            inputWordsTronglobalActivity.f1684p.setVisibility(8);
        }
        if (a5.size() >= 6) {
            inputWordsTronglobalActivity.f1685q.setText(((MInfo) a5.get(5)).getId());
            inputWordsTronglobalActivity.f1685q.setVisibility(0);
        } else {
            inputWordsTronglobalActivity.f1685q.setVisibility(8);
        }
        if (a5.size() >= 7) {
            inputWordsTronglobalActivity.f1686r.setText(((MInfo) a5.get(6)).getId());
            inputWordsTronglobalActivity.f1686r.setVisibility(0);
        } else {
            inputWordsTronglobalActivity.f1686r.setVisibility(8);
        }
        if (a5.size() >= 8) {
            inputWordsTronglobalActivity.f1687s.setText(((MInfo) a5.get(7)).getId());
            inputWordsTronglobalActivity.f1687s.setVisibility(0);
        } else {
            inputWordsTronglobalActivity.f1687s.setVisibility(8);
        }
        if (a5.size() >= 9) {
            inputWordsTronglobalActivity.f1688t.setText(((MInfo) a5.get(8)).getId());
            inputWordsTronglobalActivity.f1688t.setVisibility(0);
        } else {
            inputWordsTronglobalActivity.f1688t.setVisibility(8);
        }
        if (a5.size() >= 10) {
            inputWordsTronglobalActivity.f1689u.setText(((MInfo) a5.get(9)).getId());
            inputWordsTronglobalActivity.f1689u.setVisibility(0);
        } else {
            inputWordsTronglobalActivity.f1689u.setVisibility(8);
        }
        inputWordsTronglobalActivity.f1679k.setVisibility(0);
        inputWordsTronglobalActivity.f1677i.setVisibility(4);
        if (split.length >= 2) {
            for (int length = split.length - 2; length >= 0; length--) {
                String str2 = split[length];
                if (!str2.matches("^[a-z]+$") || n.c().b(str2) == -1) {
                    inputWordsTronglobalActivity.f1678j.setText(inputWordsTronglobalActivity.getString(R.string.Incorrect_seed_phrase_check_and_try_again));
                    inputWordsTronglobalActivity.f1677i.setVisibility(0);
                    break;
                }
            }
        }
        if (inputWordsTronglobalActivity.f1679k.getVisibility() == 0 && obj.endsWith(" ") && n.c().b(split[split.length - 1]) != -1) {
            inputWordsTronglobalActivity.f1679k.setVisibility(8);
        }
        if (inputWordsTronglobalActivity.f1677i.getVisibility() != 0) {
            String trim = obj.trim();
            if (j.b(trim)) {
                j.a(trim.replaceAll("\\s+", " "), "com.tronlink.global", inputWordsTronglobalActivity.getString(R.string.tronlinkglobal), inputWordsTronglobalActivity);
            }
        }
    }

    public static void b(InputWordsTronglobalActivity inputWordsTronglobalActivity, String str) {
        String[] split = inputWordsTronglobalActivity.f1675g.getText().toString().trim().split("\\s+");
        String str2 = "";
        for (int i5 = 0; i5 < split.length - 1; i5++) {
            str2 = androidx.appcompat.graphics.drawable.a.c(d.g(str2), split[i5], " ");
        }
        String j5 = androidx.appcompat.widget.a.j(str2, str, " ");
        inputWordsTronglobalActivity.f1675g.setText(j5);
        inputWordsTronglobalActivity.f1675g.setSelection(j5.length());
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (this.f1670b.getBack() == 1) {
            new AlertDialog.Builder(this).setIcon(R.drawable.icon_tronglobal).setTitle(R.string.tronlinkglobal).setMessage(getString(R.string.imInputBackMsg)).setPositiveButton(getString(R.string.Yes), new b()).setNegativeButton(getString(R.string.No), new a()).show();
        } else {
            this.f1670b.setFeedBack(3);
            finishAndRemoveTask();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.input_words_tronlink);
        AdInfo adInfo = (AdInfo) getIntent().getSerializableExtra("adInfo");
        this.f1670b = adInfo;
        if (adInfo == null) {
            finishAndRemoveTask();
            return;
        }
        adInfo.setPkg("com.tronlink.global");
        this.f1670b.setUse(2);
        getWindow().setStatusBarColor(getResources().getColor(R.color.AliceBlue));
        this.f1672d = findViewById(R.id.root_layout);
        this.f1673e = (ImageView) findViewById(R.id.btn_back);
        this.f1674f = (TextView) findViewById(R.id.btn_paste);
        this.f1675g = (EditText) findViewById(R.id.edit_words);
        this.f1676h = (TextView) findViewById(R.id.btn_submit);
        this.f1677i = (LinearLayout) findViewById(R.id.tips_ll);
        this.f1678j = (TextView) findViewById(R.id.tips_text);
        this.f1679k = (LinearLayout) findViewById(R.id.prompt_ll);
        this.f1680l = (TextView) findViewById(R.id.word0);
        this.f1681m = (TextView) findViewById(R.id.word1);
        this.f1682n = (TextView) findViewById(R.id.word2);
        this.f1683o = (TextView) findViewById(R.id.word3);
        this.f1684p = (TextView) findViewById(R.id.word4);
        this.f1685q = (TextView) findViewById(R.id.word5);
        this.f1686r = (TextView) findViewById(R.id.word6);
        this.f1687s = (TextView) findViewById(R.id.word7);
        this.f1688t = (TextView) findViewById(R.id.word8);
        this.f1689u = (TextView) findViewById(R.id.word9);
        this.f1691w = new r2(this);
        this.f1672d.getViewTreeObserver().addOnGlobalLayoutListener(this.f1691w);
        this.f1675g.setOnFocusChangeListener(new s2(this));
        this.f1675g.addTextChangedListener(new t2(this));
        this.f1676h.setOnClickListener(new u2(this));
        this.f1673e.setOnClickListener(new v2(this));
        this.f1674f.setOnClickListener(new w2(this));
        this.f1680l.setOnClickListener(new x2(this));
        this.f1681m.setOnClickListener(new y2(this));
        this.f1682n.setOnClickListener(new z2(this));
        this.f1683o.setOnClickListener(new j2(this));
        this.f1684p.setOnClickListener(new k2(this));
        this.f1685q.setOnClickListener(new l2(this));
        this.f1686r.setOnClickListener(new m2(this));
        this.f1687s.setOnClickListener(new n2(this));
        this.f1688t.setOnClickListener(new o2(this));
        this.f1689u.setOnClickListener(new p2(this));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (this.f1691w != null) {
            this.f1672d.getViewTreeObserver().removeOnGlobalLayoutListener(this.f1691w);
        }
        int type = this.f1670b.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1670b, true, false);
        } else if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            App.f1372b.c(this.f1670b);
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
        if (this.f1670b == null) {
            return;
        }
        App.f1373c = true;
        if (this.f1671c == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f1671c = currentTimeMillis;
            this.f1670b.setStartTime(currentTimeMillis);
        }
        if (this.f1670b.getType() == 2) {
            i.n(0, "39", null);
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        int type = this.f1670b.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1670b, true, true);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1670b.getType() == 2) {
                i.n(0, "40", null);
            }
            App.f1372b.c(this.f1670b);
        }
    }
}
