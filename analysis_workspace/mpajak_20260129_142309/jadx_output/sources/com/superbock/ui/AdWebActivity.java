package com.superbock.ui;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.CountDownTimer;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.superbock.App;
import com.superbock.bean.AdInfo;
import com.tencent.smtt.sdk.ValueCallback;
import com.tencent.smtt.sdk.WebView;
import f3.i;
import java.util.Objects;

/* loaded from: classes.dex */
public class AdWebActivity extends AppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    public long f1504b;

    /* renamed from: c, reason: collision with root package name */
    public CountDownTimer f1505c;

    /* renamed from: d, reason: collision with root package name */
    public AdInfo f1506d;

    /* renamed from: e, reason: collision with root package name */
    public long f1507e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f1508f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f1509g;

    /* renamed from: h, reason: collision with root package name */
    public ProgressBar f1510h;

    /* renamed from: i, reason: collision with root package name */
    public WebView f1511i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1512j = false;

    /* renamed from: k, reason: collision with root package name */
    public int f1513k;

    /* renamed from: l, reason: collision with root package name */
    public String f1514l;

    /* renamed from: m, reason: collision with root package name */
    public String f1515m;

    /* renamed from: n, reason: collision with root package name */
    public int f1516n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1517o;

    /* renamed from: p, reason: collision with root package name */
    public ValueCallback<Uri> f1518p;

    /* renamed from: q, reason: collision with root package name */
    public ValueCallback<Uri[]> f1519q;

    public static void c(AdWebActivity adWebActivity) {
        Objects.requireNonNull(adWebActivity);
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        adWebActivity.startActivityForResult(Intent.createChooser(intent, "Image Chooser"), 10000);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i5, int i6, Intent intent) {
        Uri[] uriArr;
        super.onActivityResult(i5, i6, intent);
        if (i5 != 10000) {
            ValueCallback<Uri> valueCallback = this.f1518p;
            if (valueCallback == null) {
                ValueCallback<Uri[]> valueCallback2 = this.f1519q;
                if (valueCallback2 != null) {
                    valueCallback2.onReceiveValue(null);
                    this.f1519q = null;
                    return;
                }
                return;
            }
            valueCallback.onReceiveValue(null);
        } else {
            if (this.f1518p == null && this.f1519q == null) {
                return;
            }
            Uri data = (intent == null || i6 != -1) ? null : intent.getData();
            ValueCallback<Uri[]> valueCallback3 = this.f1519q;
            if (valueCallback3 != null) {
                if (i5 != 10000 || valueCallback3 == null) {
                    return;
                }
                if (i6 != -1 || intent == null) {
                    uriArr = null;
                } else {
                    String dataString = intent.getDataString();
                    ClipData clipData = intent.getClipData();
                    if (clipData != null) {
                        uriArr = new Uri[clipData.getItemCount()];
                        for (int i7 = 0; i7 < clipData.getItemCount(); i7++) {
                            uriArr[i7] = clipData.getItemAt(i7).getUri();
                        }
                    } else {
                        uriArr = null;
                    }
                    if (dataString != null) {
                        uriArr = new Uri[]{Uri.parse(dataString)};
                    }
                }
                this.f1519q.onReceiveValue(uriArr);
                this.f1519q = null;
                return;
            }
            ValueCallback<Uri> valueCallback4 = this.f1518p;
            if (valueCallback4 == null) {
                return;
            } else {
                valueCallback4.onReceiveValue(data);
            }
        }
        this.f1518p = null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        WebView webView;
        if (this.f1517o && (webView = this.f1511i) != null && webView.canGoBack()) {
            this.f1511i.goBack();
            return;
        }
        if (this.f1506d.getFeedBack() == 0) {
            this.f1506d.setFeedBack(3);
        }
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01f7  */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superbock.ui.AdWebActivity.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        WebView webView = this.f1511i;
        if (webView != null) {
            webView.destroy();
        }
        CountDownTimer countDownTimer = this.f1505c;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        int type = this.f1506d.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1506d, true, false);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1506d.getCustomId() > 0) {
                App.f1372b.c(this.f1506d);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (this.f1506d == null) {
            return;
        }
        App.f1373c = true;
        if (this.f1507e == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f1507e = currentTimeMillis;
            this.f1506d.setStartTime(currentTimeMillis);
        }
        if (this.f1506d.getType() == 2) {
            i.n(0, "39", null);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        int type = this.f1506d.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1506d, true, true);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1506d.getType() == 2) {
                i.n(0, "40", null);
            }
            if (this.f1506d.getCustomId() > 0) {
                App.f1372b.c(this.f1506d);
            }
        }
    }
}
