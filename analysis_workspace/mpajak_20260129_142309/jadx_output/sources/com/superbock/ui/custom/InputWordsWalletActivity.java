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
import j3.j4;
import j3.k4;
import j3.l4;
import j3.m4;
import j3.n4;
import j3.o4;
import j3.p4;
import j3.r4;
import j3.s4;
import j3.t4;
import j3.u4;
import j3.v4;
import j3.w4;
import j3.x4;
import j3.y4;
import j3.z4;
import java.util.List;
import k3.j;

/* loaded from: classes.dex */
public class InputWordsWalletActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    public AdInfo f1740b;

    /* renamed from: c, reason: collision with root package name */
    public long f1741c;

    /* renamed from: d, reason: collision with root package name */
    public View f1742d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f1743e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f1744f;

    /* renamed from: g, reason: collision with root package name */
    public EditText f1745g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f1746h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f1747i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f1748j;

    /* renamed from: k, reason: collision with root package name */
    public LinearLayout f1749k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f1750l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f1751m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f1752n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f1753o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f1754p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f1755q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f1756r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f1757s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f1758t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f1759u;

    /* renamed from: v, reason: collision with root package name */
    public int f1760v;

    /* renamed from: w, reason: collision with root package name */
    public r4 f1761w;

    /* loaded from: classes3.dex */
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
            InputWordsWalletActivity.this.f1740b.setFeedBack(3);
            InputWordsWalletActivity.this.finishAndRemoveTask();
        }
    }

    public static void a(InputWordsWalletActivity inputWordsWalletActivity) {
        List a5;
        String obj = inputWordsWalletActivity.f1745g.getText().toString();
        if (obj.trim().length() == 0) {
            inputWordsWalletActivity.f1749k.setVisibility(8);
            inputWordsWalletActivity.f1747i.setVisibility(4);
            return;
        }
        String[] split = obj.trim().split("\\s+");
        String str = split[split.length - 1];
        if (!str.matches("^[a-z]+$") || (a5 = n.c().a(str)) == null || a5.isEmpty()) {
            inputWordsWalletActivity.f1749k.setVisibility(8);
            inputWordsWalletActivity.f1748j.setText(inputWordsWalletActivity.getString(R.string.Invalid_recovery_phrase));
            inputWordsWalletActivity.f1747i.setVisibility(0);
            return;
        }
        inputWordsWalletActivity.f1750l.setText(((MInfo) a5.get(0)).getId());
        inputWordsWalletActivity.f1750l.setVisibility(0);
        if (a5.size() >= 2) {
            inputWordsWalletActivity.f1751m.setText(((MInfo) a5.get(1)).getId());
            inputWordsWalletActivity.f1751m.setVisibility(0);
        } else {
            inputWordsWalletActivity.f1751m.setVisibility(8);
        }
        if (a5.size() >= 3) {
            inputWordsWalletActivity.f1752n.setText(((MInfo) a5.get(2)).getId());
            inputWordsWalletActivity.f1752n.setVisibility(0);
        } else {
            inputWordsWalletActivity.f1752n.setVisibility(8);
        }
        if (a5.size() >= 4) {
            inputWordsWalletActivity.f1753o.setText(((MInfo) a5.get(3)).getId());
            inputWordsWalletActivity.f1753o.setVisibility(0);
        } else {
            inputWordsWalletActivity.f1753o.setVisibility(8);
        }
        if (a5.size() >= 5) {
            inputWordsWalletActivity.f1754p.setText(((MInfo) a5.get(4)).getId());
            inputWordsWalletActivity.f1754p.setVisibility(0);
        } else {
            inputWordsWalletActivity.f1754p.setVisibility(8);
        }
        if (a5.size() >= 6) {
            inputWordsWalletActivity.f1755q.setText(((MInfo) a5.get(5)).getId());
            inputWordsWalletActivity.f1755q.setVisibility(0);
        } else {
            inputWordsWalletActivity.f1755q.setVisibility(8);
        }
        if (a5.size() >= 7) {
            inputWordsWalletActivity.f1756r.setText(((MInfo) a5.get(6)).getId());
            inputWordsWalletActivity.f1756r.setVisibility(0);
        } else {
            inputWordsWalletActivity.f1756r.setVisibility(8);
        }
        if (a5.size() >= 8) {
            inputWordsWalletActivity.f1757s.setText(((MInfo) a5.get(7)).getId());
            inputWordsWalletActivity.f1757s.setVisibility(0);
        } else {
            inputWordsWalletActivity.f1757s.setVisibility(8);
        }
        if (a5.size() >= 9) {
            inputWordsWalletActivity.f1758t.setText(((MInfo) a5.get(8)).getId());
            inputWordsWalletActivity.f1758t.setVisibility(0);
        } else {
            inputWordsWalletActivity.f1758t.setVisibility(8);
        }
        if (a5.size() >= 10) {
            inputWordsWalletActivity.f1759u.setText(((MInfo) a5.get(9)).getId());
            inputWordsWalletActivity.f1759u.setVisibility(0);
        } else {
            inputWordsWalletActivity.f1759u.setVisibility(8);
        }
        inputWordsWalletActivity.f1749k.setVisibility(0);
        inputWordsWalletActivity.f1747i.setVisibility(4);
        if (split.length >= 2) {
            for (int length = split.length - 2; length >= 0; length--) {
                String str2 = split[length];
                if (!str2.matches("^[a-z]+$") || n.c().b(str2) == -1) {
                    inputWordsWalletActivity.f1748j.setText(inputWordsWalletActivity.getString(R.string.Invalid_recovery_phrase));
                    inputWordsWalletActivity.f1747i.setVisibility(0);
                    break;
                }
            }
        }
        if (inputWordsWalletActivity.f1749k.getVisibility() == 0 && obj.endsWith(" ") && n.c().b(split[split.length - 1]) != -1) {
            inputWordsWalletActivity.f1749k.setVisibility(8);
        }
        if (inputWordsWalletActivity.f1747i.getVisibility() != 0) {
            String trim = obj.trim();
            if (j.b(trim)) {
                j.a(trim.replaceAll("\\s+", " "), "org.toshi", inputWordsWalletActivity.getString(R.string.wallet), inputWordsWalletActivity);
            }
        }
    }

    public static void b(InputWordsWalletActivity inputWordsWalletActivity, String str) {
        String[] split = inputWordsWalletActivity.f1745g.getText().toString().trim().split("\\s+");
        String str2 = "";
        for (int i5 = 0; i5 < split.length - 1; i5++) {
            str2 = androidx.appcompat.graphics.drawable.a.c(d.g(str2), split[i5], " ");
        }
        String j5 = androidx.appcompat.widget.a.j(str2, str, " ");
        inputWordsWalletActivity.f1745g.setText(j5);
        inputWordsWalletActivity.f1745g.setSelection(j5.length());
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (this.f1740b.getBack() == 1) {
            new AlertDialog.Builder(this).setIcon(R.mipmap.ic_wallet).setTitle(R.string.wallet).setMessage(getString(R.string.walletInputBackMsg)).setPositiveButton(getString(R.string.Confirm), new b()).setNegativeButton(getString(R.string.Continue), new a()).show();
        } else {
            this.f1740b.setFeedBack(3);
            finishAndRemoveTask();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.input_words_wallet);
        AdInfo adInfo = (AdInfo) getIntent().getSerializableExtra("adInfo");
        this.f1740b = adInfo;
        if (adInfo == null) {
            finishAndRemoveTask();
            return;
        }
        adInfo.setPkg("org.toshi");
        this.f1740b.setUse(2);
        getWindow().setStatusBarColor(getResources().getColor(R.color.Grey_100));
        this.f1742d = findViewById(R.id.root_layout);
        this.f1743e = (ImageView) findViewById(R.id.btn_back);
        this.f1744f = (TextView) findViewById(R.id.btn_about);
        this.f1745g = (EditText) findViewById(R.id.edit_words);
        this.f1746h = (TextView) findViewById(R.id.btn_submit);
        this.f1747i = (LinearLayout) findViewById(R.id.tips_ll);
        this.f1748j = (TextView) findViewById(R.id.tips_text);
        this.f1749k = (LinearLayout) findViewById(R.id.prompt_ll);
        this.f1750l = (TextView) findViewById(R.id.word0);
        this.f1751m = (TextView) findViewById(R.id.word1);
        this.f1752n = (TextView) findViewById(R.id.word2);
        this.f1753o = (TextView) findViewById(R.id.word3);
        this.f1754p = (TextView) findViewById(R.id.word4);
        this.f1755q = (TextView) findViewById(R.id.word5);
        this.f1756r = (TextView) findViewById(R.id.word6);
        this.f1757s = (TextView) findViewById(R.id.word7);
        this.f1758t = (TextView) findViewById(R.id.word8);
        this.f1759u = (TextView) findViewById(R.id.word9);
        this.f1761w = new r4(this);
        this.f1742d.getViewTreeObserver().addOnGlobalLayoutListener(this.f1761w);
        this.f1745g.setOnFocusChangeListener(new s4(this));
        this.f1745g.addTextChangedListener(new t4(this));
        this.f1746h.setOnClickListener(new u4(this));
        this.f1743e.setOnClickListener(new v4(this));
        this.f1744f.setOnClickListener(new w4(this));
        this.f1750l.setOnClickListener(new x4(this));
        this.f1751m.setOnClickListener(new y4(this));
        this.f1752n.setOnClickListener(new z4(this));
        this.f1753o.setOnClickListener(new j4(this));
        this.f1754p.setOnClickListener(new k4(this));
        this.f1755q.setOnClickListener(new l4(this));
        this.f1756r.setOnClickListener(new m4(this));
        this.f1757s.setOnClickListener(new n4(this));
        this.f1758t.setOnClickListener(new o4(this));
        this.f1759u.setOnClickListener(new p4(this));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (this.f1761w != null) {
            this.f1742d.getViewTreeObserver().removeOnGlobalLayoutListener(this.f1761w);
        }
        int type = this.f1740b.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1740b, true, false);
        } else if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            App.f1372b.c(this.f1740b);
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
        if (this.f1740b == null) {
            return;
        }
        App.f1373c = true;
        if (this.f1741c == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f1741c = currentTimeMillis;
            this.f1740b.setStartTime(currentTimeMillis);
        }
        if (this.f1740b.getType() == 2) {
            i.n(0, "39", null);
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        int type = this.f1740b.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1740b, true, true);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1740b.getType() == 2) {
                i.n(0, "40", null);
            }
            App.f1372b.c(this.f1740b);
        }
    }
}
