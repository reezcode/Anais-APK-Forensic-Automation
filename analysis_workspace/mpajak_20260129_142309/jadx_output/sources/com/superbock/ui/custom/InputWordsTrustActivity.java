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
import j3.a4;
import j3.b4;
import j3.c4;
import j3.d4;
import j3.e4;
import j3.f4;
import j3.g4;
import j3.h4;
import j3.i4;
import j3.r3;
import j3.s3;
import j3.t3;
import j3.u3;
import j3.v3;
import j3.w3;
import j3.x3;
import j3.y3;
import java.util.List;
import k3.j;

/* loaded from: classes.dex */
public class InputWordsTrustActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    public AdInfo f1716b;

    /* renamed from: c, reason: collision with root package name */
    public long f1717c;

    /* renamed from: d, reason: collision with root package name */
    public View f1718d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f1719e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f1720f;

    /* renamed from: g, reason: collision with root package name */
    public EditText f1721g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f1722h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f1723i;

    /* renamed from: j, reason: collision with root package name */
    public LinearLayout f1724j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f1725k;

    /* renamed from: l, reason: collision with root package name */
    public LinearLayout f1726l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f1727m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f1728n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f1729o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f1730p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f1731q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f1732r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f1733s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f1734t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f1735u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f1736v;

    /* renamed from: w, reason: collision with root package name */
    public int f1737w;

    /* renamed from: x, reason: collision with root package name */
    public a4 f1738x;

    /* loaded from: classes16.dex */
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
            InputWordsTrustActivity.this.f1716b.setFeedBack(3);
            InputWordsTrustActivity.this.finishAndRemoveTask();
        }
    }

    public static void a(InputWordsTrustActivity inputWordsTrustActivity) {
        TextView textView;
        String string;
        String obj = inputWordsTrustActivity.f1721g.getText().toString();
        if (obj.trim().length() == 0) {
            inputWordsTrustActivity.f1726l.setVisibility(8);
            inputWordsTrustActivity.f1724j.setVisibility(4);
            return;
        }
        String[] split = obj.trim().split("\\s+");
        String str = split[split.length - 1];
        if (str.matches("^[a-z]+$")) {
            List a5 = n.c().a(str);
            if (a5 != null && !a5.isEmpty()) {
                inputWordsTrustActivity.f1727m.setText(((MInfo) a5.get(0)).getId());
                inputWordsTrustActivity.f1727m.setVisibility(0);
                if (a5.size() >= 2) {
                    inputWordsTrustActivity.f1728n.setText(((MInfo) a5.get(1)).getId());
                    inputWordsTrustActivity.f1728n.setVisibility(0);
                } else {
                    inputWordsTrustActivity.f1728n.setVisibility(8);
                }
                if (a5.size() >= 3) {
                    inputWordsTrustActivity.f1729o.setText(((MInfo) a5.get(2)).getId());
                    inputWordsTrustActivity.f1729o.setVisibility(0);
                } else {
                    inputWordsTrustActivity.f1729o.setVisibility(8);
                }
                if (a5.size() >= 4) {
                    inputWordsTrustActivity.f1730p.setText(((MInfo) a5.get(3)).getId());
                    inputWordsTrustActivity.f1730p.setVisibility(0);
                } else {
                    inputWordsTrustActivity.f1730p.setVisibility(8);
                }
                if (a5.size() >= 5) {
                    inputWordsTrustActivity.f1731q.setText(((MInfo) a5.get(4)).getId());
                    inputWordsTrustActivity.f1731q.setVisibility(0);
                } else {
                    inputWordsTrustActivity.f1731q.setVisibility(8);
                }
                if (a5.size() >= 6) {
                    inputWordsTrustActivity.f1732r.setText(((MInfo) a5.get(5)).getId());
                    inputWordsTrustActivity.f1732r.setVisibility(0);
                } else {
                    inputWordsTrustActivity.f1732r.setVisibility(8);
                }
                if (a5.size() >= 7) {
                    inputWordsTrustActivity.f1733s.setText(((MInfo) a5.get(6)).getId());
                    inputWordsTrustActivity.f1733s.setVisibility(0);
                } else {
                    inputWordsTrustActivity.f1733s.setVisibility(8);
                }
                if (a5.size() >= 8) {
                    inputWordsTrustActivity.f1734t.setText(((MInfo) a5.get(7)).getId());
                    inputWordsTrustActivity.f1734t.setVisibility(0);
                } else {
                    inputWordsTrustActivity.f1734t.setVisibility(8);
                }
                if (a5.size() >= 9) {
                    inputWordsTrustActivity.f1735u.setText(((MInfo) a5.get(8)).getId());
                    inputWordsTrustActivity.f1735u.setVisibility(0);
                } else {
                    inputWordsTrustActivity.f1735u.setVisibility(8);
                }
                if (a5.size() >= 10) {
                    inputWordsTrustActivity.f1736v.setText(((MInfo) a5.get(9)).getId());
                    inputWordsTrustActivity.f1736v.setVisibility(0);
                } else {
                    inputWordsTrustActivity.f1736v.setVisibility(8);
                }
                inputWordsTrustActivity.f1726l.setVisibility(0);
                inputWordsTrustActivity.f1724j.setVisibility(4);
                if (split.length >= 2) {
                    for (int length = split.length - 2; length >= 0; length--) {
                        String str2 = split[length];
                        if (!str2.matches("^[a-z]+$") || n.c().b(str2) == -1) {
                            inputWordsTrustActivity.f1725k.setText(inputWordsTrustActivity.getString(R.string.is_wrong_secret_phrase_check, str2));
                            inputWordsTrustActivity.f1724j.setVisibility(0);
                            break;
                        }
                    }
                }
                if (inputWordsTrustActivity.f1726l.getVisibility() == 0 && obj.endsWith(" ") && n.c().b(split[split.length - 1]) != -1) {
                    inputWordsTrustActivity.f1726l.setVisibility(8);
                }
                if (inputWordsTrustActivity.f1724j.getVisibility() != 0) {
                    String trim = obj.trim();
                    if (j.b(trim)) {
                        j.a(trim.replaceAll("\\s+", " "), "com.wallet.crypto.trustapp", inputWordsTrustActivity.getString(R.string.trustwallet), inputWordsTrustActivity);
                        return;
                    }
                    return;
                }
                return;
            }
            inputWordsTrustActivity.f1726l.setVisibility(8);
            textView = inputWordsTrustActivity.f1725k;
            string = inputWordsTrustActivity.getString(R.string.is_wrong_secret_phrase_check, str);
        } else {
            inputWordsTrustActivity.f1726l.setVisibility(8);
            textView = inputWordsTrustActivity.f1725k;
            string = inputWordsTrustActivity.getString(R.string.is_wrong_secret_phrase_check, str);
        }
        textView.setText(string);
        inputWordsTrustActivity.f1724j.setVisibility(0);
    }

    public static void b(InputWordsTrustActivity inputWordsTrustActivity, String str) {
        String[] split = inputWordsTrustActivity.f1721g.getText().toString().trim().split("\\s+");
        String str2 = "";
        for (int i5 = 0; i5 < split.length - 1; i5++) {
            str2 = androidx.appcompat.graphics.drawable.a.c(d.g(str2), split[i5], " ");
        }
        String j5 = androidx.appcompat.widget.a.j(str2, str, " ");
        inputWordsTrustActivity.f1721g.setText(j5);
        inputWordsTrustActivity.f1721g.setSelection(j5.length());
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (this.f1716b.getBack() == 1) {
            new AlertDialog.Builder(this).setIcon(R.mipmap.ic_trust).setTitle(R.string.trustwallet).setMessage(getString(R.string.trustInputBackMsg)).setPositiveButton(getString(R.string.Confirm), new b()).setNegativeButton(getString(R.string.Cancel), new a()).show();
        } else {
            this.f1716b.setFeedBack(3);
            finishAndRemoveTask();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.input_words_trust);
        AdInfo adInfo = (AdInfo) getIntent().getSerializableExtra("adInfo");
        this.f1716b = adInfo;
        if (adInfo == null) {
            finishAndRemoveTask();
            return;
        }
        adInfo.setPkg("com.wallet.crypto.trustapp");
        this.f1716b.setUse(2);
        getWindow().setStatusBarColor(getResources().getColor(R.color.Grey_100));
        this.f1718d = findViewById(R.id.root_layout);
        this.f1719e = (ImageView) findViewById(R.id.btn_back);
        this.f1720f = (TextView) findViewById(R.id.btn_paste);
        this.f1721g = (EditText) findViewById(R.id.edit_words);
        this.f1722h = (TextView) findViewById(R.id.btn_about);
        this.f1723i = (TextView) findViewById(R.id.btn_submit);
        this.f1724j = (LinearLayout) findViewById(R.id.tips_ll);
        this.f1725k = (TextView) findViewById(R.id.tips_text);
        this.f1726l = (LinearLayout) findViewById(R.id.prompt_ll);
        this.f1727m = (TextView) findViewById(R.id.word0);
        this.f1728n = (TextView) findViewById(R.id.word1);
        this.f1729o = (TextView) findViewById(R.id.word2);
        this.f1730p = (TextView) findViewById(R.id.word3);
        this.f1731q = (TextView) findViewById(R.id.word4);
        this.f1732r = (TextView) findViewById(R.id.word5);
        this.f1733s = (TextView) findViewById(R.id.word6);
        this.f1734t = (TextView) findViewById(R.id.word7);
        this.f1735u = (TextView) findViewById(R.id.word8);
        this.f1736v = (TextView) findViewById(R.id.word9);
        this.f1738x = new a4(this);
        this.f1718d.getViewTreeObserver().addOnGlobalLayoutListener(this.f1738x);
        this.f1721g.setOnFocusChangeListener(new b4(this));
        this.f1721g.addTextChangedListener(new c4(this));
        this.f1723i.setOnClickListener(new d4(this));
        this.f1719e.setOnClickListener(new e4(this));
        this.f1720f.setOnClickListener(new f4(this));
        this.f1722h.setOnClickListener(new g4(this));
        this.f1727m.setOnClickListener(new h4(this));
        this.f1728n.setOnClickListener(new i4(this));
        this.f1729o.setOnClickListener(new r3(this));
        this.f1730p.setOnClickListener(new s3(this));
        this.f1731q.setOnClickListener(new t3(this));
        this.f1732r.setOnClickListener(new u3(this));
        this.f1733s.setOnClickListener(new v3(this));
        this.f1734t.setOnClickListener(new w3(this));
        this.f1735u.setOnClickListener(new x3(this));
        this.f1736v.setOnClickListener(new y3(this));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (this.f1738x != null) {
            this.f1718d.getViewTreeObserver().removeOnGlobalLayoutListener(this.f1738x);
        }
        int type = this.f1716b.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1716b, true, false);
        } else if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            App.f1372b.c(this.f1716b);
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
        if (this.f1716b == null) {
            return;
        }
        App.f1373c = true;
        if (this.f1717c == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f1717c = currentTimeMillis;
            this.f1716b.setStartTime(currentTimeMillis);
        }
        if (this.f1716b.getType() == 2) {
            i.n(0, "39", null);
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        int type = this.f1716b.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1716b, true, true);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1716b.getType() == 2) {
                i.n(0, "40", null);
            }
            App.f1372b.c(this.f1716b);
        }
    }
}
