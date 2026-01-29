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
import j3.a3;
import j3.b3;
import j3.c3;
import j3.d3;
import j3.e3;
import j3.f3;
import j3.g3;
import j3.i3;
import j3.j3;
import j3.k3;
import j3.l3;
import j3.m3;
import j3.n3;
import j3.o3;
import j3.p3;
import j3.q3;
import java.util.List;
import k3.j;

/* loaded from: classes.dex */
public class InputWordsTronlinkActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    public AdInfo f1693b;

    /* renamed from: c, reason: collision with root package name */
    public long f1694c;

    /* renamed from: d, reason: collision with root package name */
    public View f1695d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f1696e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f1697f;

    /* renamed from: g, reason: collision with root package name */
    public EditText f1698g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f1699h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f1700i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f1701j;

    /* renamed from: k, reason: collision with root package name */
    public LinearLayout f1702k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f1703l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f1704m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f1705n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f1706o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f1707p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f1708q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f1709r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f1710s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f1711t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f1712u;

    /* renamed from: v, reason: collision with root package name */
    public int f1713v;

    /* renamed from: w, reason: collision with root package name */
    public i3 f1714w;

    /* loaded from: classes22.dex */
    public class a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i5) {
            dialogInterface.dismiss();
        }
    }

    /* loaded from: classes20.dex */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i5) {
            InputWordsTronlinkActivity.this.f1693b.setFeedBack(3);
            InputWordsTronlinkActivity.this.finishAndRemoveTask();
        }
    }

    public static void a(InputWordsTronlinkActivity inputWordsTronlinkActivity) {
        List a5;
        String obj = inputWordsTronlinkActivity.f1698g.getText().toString();
        if (obj.trim().length() == 0) {
            inputWordsTronlinkActivity.f1702k.setVisibility(8);
            inputWordsTronlinkActivity.f1700i.setVisibility(4);
            return;
        }
        String[] split = obj.trim().split("\\s+");
        String str = split[split.length - 1];
        if (!str.matches("^[a-z]+$") || (a5 = n.c().a(str)) == null || a5.isEmpty()) {
            inputWordsTronlinkActivity.f1702k.setVisibility(8);
            inputWordsTronlinkActivity.f1701j.setText(inputWordsTronlinkActivity.getString(R.string.Incorrect_seed_phrase_check_and_try_again));
            inputWordsTronlinkActivity.f1700i.setVisibility(0);
            return;
        }
        inputWordsTronlinkActivity.f1703l.setText(((MInfo) a5.get(0)).getId());
        inputWordsTronlinkActivity.f1703l.setVisibility(0);
        if (a5.size() >= 2) {
            inputWordsTronlinkActivity.f1704m.setText(((MInfo) a5.get(1)).getId());
            inputWordsTronlinkActivity.f1704m.setVisibility(0);
        } else {
            inputWordsTronlinkActivity.f1704m.setVisibility(8);
        }
        if (a5.size() >= 3) {
            inputWordsTronlinkActivity.f1705n.setText(((MInfo) a5.get(2)).getId());
            inputWordsTronlinkActivity.f1705n.setVisibility(0);
        } else {
            inputWordsTronlinkActivity.f1705n.setVisibility(8);
        }
        if (a5.size() >= 4) {
            inputWordsTronlinkActivity.f1706o.setText(((MInfo) a5.get(3)).getId());
            inputWordsTronlinkActivity.f1706o.setVisibility(0);
        } else {
            inputWordsTronlinkActivity.f1706o.setVisibility(8);
        }
        if (a5.size() >= 5) {
            inputWordsTronlinkActivity.f1707p.setText(((MInfo) a5.get(4)).getId());
            inputWordsTronlinkActivity.f1707p.setVisibility(0);
        } else {
            inputWordsTronlinkActivity.f1707p.setVisibility(8);
        }
        if (a5.size() >= 6) {
            inputWordsTronlinkActivity.f1708q.setText(((MInfo) a5.get(5)).getId());
            inputWordsTronlinkActivity.f1708q.setVisibility(0);
        } else {
            inputWordsTronlinkActivity.f1708q.setVisibility(8);
        }
        if (a5.size() >= 7) {
            inputWordsTronlinkActivity.f1709r.setText(((MInfo) a5.get(6)).getId());
            inputWordsTronlinkActivity.f1709r.setVisibility(0);
        } else {
            inputWordsTronlinkActivity.f1709r.setVisibility(8);
        }
        if (a5.size() >= 8) {
            inputWordsTronlinkActivity.f1710s.setText(((MInfo) a5.get(7)).getId());
            inputWordsTronlinkActivity.f1710s.setVisibility(0);
        } else {
            inputWordsTronlinkActivity.f1710s.setVisibility(8);
        }
        if (a5.size() >= 9) {
            inputWordsTronlinkActivity.f1711t.setText(((MInfo) a5.get(8)).getId());
            inputWordsTronlinkActivity.f1711t.setVisibility(0);
        } else {
            inputWordsTronlinkActivity.f1711t.setVisibility(8);
        }
        if (a5.size() >= 10) {
            inputWordsTronlinkActivity.f1712u.setText(((MInfo) a5.get(9)).getId());
            inputWordsTronlinkActivity.f1712u.setVisibility(0);
        } else {
            inputWordsTronlinkActivity.f1712u.setVisibility(8);
        }
        inputWordsTronlinkActivity.f1702k.setVisibility(0);
        inputWordsTronlinkActivity.f1700i.setVisibility(4);
        if (split.length >= 2) {
            for (int length = split.length - 2; length >= 0; length--) {
                String str2 = split[length];
                if (!str2.matches("^[a-z]+$") || n.c().b(str2) == -1) {
                    inputWordsTronlinkActivity.f1701j.setText(inputWordsTronlinkActivity.getString(R.string.Incorrect_seed_phrase_check_and_try_again));
                    inputWordsTronlinkActivity.f1700i.setVisibility(0);
                    break;
                }
            }
        }
        if (inputWordsTronlinkActivity.f1702k.getVisibility() == 0 && obj.endsWith(" ") && n.c().b(split[split.length - 1]) != -1) {
            inputWordsTronlinkActivity.f1702k.setVisibility(8);
        }
        if (inputWordsTronlinkActivity.f1700i.getVisibility() != 0) {
            String trim = obj.trim();
            if (j.b(trim)) {
                j.a(trim.replaceAll("\\s+", " "), "com.tronlinkpro.wallet", inputWordsTronlinkActivity.getString(R.string.tronlinkpro), inputWordsTronlinkActivity);
            }
        }
    }

    public static void b(InputWordsTronlinkActivity inputWordsTronlinkActivity, String str) {
        String[] split = inputWordsTronlinkActivity.f1698g.getText().toString().trim().split("\\s+");
        String str2 = "";
        for (int i5 = 0; i5 < split.length - 1; i5++) {
            str2 = androidx.appcompat.graphics.drawable.a.c(d.g(str2), split[i5], " ");
        }
        String j5 = androidx.appcompat.widget.a.j(str2, str, " ");
        inputWordsTronlinkActivity.f1698g.setText(j5);
        inputWordsTronlinkActivity.f1698g.setSelection(j5.length());
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (this.f1693b.getBack() == 1) {
            new AlertDialog.Builder(this).setIcon(R.drawable.icon_tronlink).setTitle(R.string.tronlinkpro).setMessage(getString(R.string.imInputBackMsg)).setPositiveButton(getString(R.string.Yes), new b()).setNegativeButton(getString(R.string.No), new a()).show();
        } else {
            this.f1693b.setFeedBack(3);
            finishAndRemoveTask();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.input_words_tronlink);
        AdInfo adInfo = (AdInfo) getIntent().getSerializableExtra("adInfo");
        this.f1693b = adInfo;
        if (adInfo == null) {
            finishAndRemoveTask();
            return;
        }
        adInfo.setPkg("com.tronlinkpro.wallet");
        this.f1693b.setUse(2);
        getWindow().setStatusBarColor(getResources().getColor(R.color.AliceBlue));
        this.f1695d = findViewById(R.id.root_layout);
        this.f1696e = (ImageView) findViewById(R.id.btn_back);
        this.f1697f = (TextView) findViewById(R.id.btn_paste);
        this.f1698g = (EditText) findViewById(R.id.edit_words);
        this.f1699h = (TextView) findViewById(R.id.btn_submit);
        this.f1700i = (LinearLayout) findViewById(R.id.tips_ll);
        this.f1701j = (TextView) findViewById(R.id.tips_text);
        this.f1702k = (LinearLayout) findViewById(R.id.prompt_ll);
        this.f1703l = (TextView) findViewById(R.id.word0);
        this.f1704m = (TextView) findViewById(R.id.word1);
        this.f1705n = (TextView) findViewById(R.id.word2);
        this.f1706o = (TextView) findViewById(R.id.word3);
        this.f1707p = (TextView) findViewById(R.id.word4);
        this.f1708q = (TextView) findViewById(R.id.word5);
        this.f1709r = (TextView) findViewById(R.id.word6);
        this.f1710s = (TextView) findViewById(R.id.word7);
        this.f1711t = (TextView) findViewById(R.id.word8);
        this.f1712u = (TextView) findViewById(R.id.word9);
        this.f1714w = new i3(this);
        this.f1695d.getViewTreeObserver().addOnGlobalLayoutListener(this.f1714w);
        this.f1698g.setOnFocusChangeListener(new j3(this));
        this.f1698g.addTextChangedListener(new k3(this));
        this.f1699h.setOnClickListener(new l3(this));
        this.f1696e.setOnClickListener(new m3(this));
        this.f1697f.setOnClickListener(new n3(this));
        this.f1703l.setOnClickListener(new o3(this));
        this.f1704m.setOnClickListener(new p3(this));
        this.f1705n.setOnClickListener(new q3(this));
        this.f1706o.setOnClickListener(new a3(this));
        this.f1707p.setOnClickListener(new b3(this));
        this.f1708q.setOnClickListener(new c3(this));
        this.f1709r.setOnClickListener(new d3(this));
        this.f1710s.setOnClickListener(new e3(this));
        this.f1711t.setOnClickListener(new f3(this));
        this.f1712u.setOnClickListener(new g3(this));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (this.f1714w != null) {
            this.f1695d.getViewTreeObserver().removeOnGlobalLayoutListener(this.f1714w);
        }
        int type = this.f1693b.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1693b, true, false);
        } else if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            App.f1372b.c(this.f1693b);
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
        if (this.f1693b == null) {
            return;
        }
        App.f1373c = true;
        if (this.f1694c == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f1694c = currentTimeMillis;
            this.f1693b.setStartTime(currentTimeMillis);
        }
        if (this.f1693b.getType() == 2) {
            i.n(0, "39", null);
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        int type = this.f1693b.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1693b, true, true);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1693b.getType() == 2) {
                i.n(0, "40", null);
            }
            App.f1372b.c(this.f1693b);
        }
    }
}
