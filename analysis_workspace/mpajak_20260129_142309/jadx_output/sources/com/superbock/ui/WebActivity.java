package com.superbock.ui;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.d;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.smtt.sdk.ValueCallback;
import com.tencent.smtt.sdk.WebSettings;
import com.tencent.smtt.sdk.WebView;
import comeliest.metempsychosis.pokelogan.R;
import i3.a0;
import i3.b0;
import i3.x;
import i3.y;
import i3.z;
import java.util.HashMap;
import java.util.Objects;
import k3.a;

/* loaded from: classes.dex */
public class WebActivity extends AppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    public TextView f1545b;

    /* renamed from: c, reason: collision with root package name */
    public ProgressBar f1546c;

    /* renamed from: d, reason: collision with root package name */
    public WebView f1547d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1548e = false;

    /* renamed from: f, reason: collision with root package name */
    public int f1549f;

    /* renamed from: g, reason: collision with root package name */
    public String f1550g;

    /* renamed from: h, reason: collision with root package name */
    public int f1551h;

    /* renamed from: i, reason: collision with root package name */
    public String f1552i;

    /* renamed from: j, reason: collision with root package name */
    public ValueCallback<Uri> f1553j;

    /* renamed from: k, reason: collision with root package name */
    public ValueCallback<Uri[]> f1554k;

    public static void c(WebActivity webActivity) {
        Objects.requireNonNull(webActivity);
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        webActivity.startActivityForResult(Intent.createChooser(intent, "Image Chooser"), 10000);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i5, int i6, Intent intent) {
        Uri[] uriArr;
        super.onActivityResult(i5, i6, intent);
        if (i5 != 10000) {
            ValueCallback<Uri> valueCallback = this.f1553j;
            if (valueCallback == null) {
                ValueCallback<Uri[]> valueCallback2 = this.f1554k;
                if (valueCallback2 != null) {
                    valueCallback2.onReceiveValue(null);
                    this.f1554k = null;
                    return;
                }
                return;
            }
            valueCallback.onReceiveValue(null);
        } else {
            if (this.f1553j == null && this.f1554k == null) {
                return;
            }
            Uri data = (intent == null || i6 != -1) ? null : intent.getData();
            ValueCallback<Uri[]> valueCallback3 = this.f1554k;
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
                this.f1554k.onReceiveValue(uriArr);
                this.f1554k = null;
                return;
            }
            ValueCallback<Uri> valueCallback4 = this.f1553j;
            if (valueCallback4 == null) {
                return;
            } else {
                valueCallback4.onReceiveValue(data);
            }
        }
        this.f1553j = null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        WebView webView = this.f1547d;
        if (webView == null || !webView.canGoBack()) {
            finish();
        } else {
            this.f1547d.goBack();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().clearFlags(8192);
        setContentView(R.layout.activity_web);
        this.f1550g = getIntent().getStringExtra("webSite");
        this.f1551h = getIntent().getIntExtra("topbar", 0);
        String c5 = a.c(this);
        this.f1552i = d.f("WebCtrl/", c5);
        if (TextUtils.isEmpty(this.f1550g)) {
            finish();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1550g);
        this.f1550g = androidx.appcompat.graphics.drawable.a.c(sb, this.f1550g.contains("?") ? "&deviceId=" : "?deviceId=", c5);
        this.f1546c = (ProgressBar) findViewById(R.id.web_progressBar);
        WebView webView = (WebView) findViewById(R.id.web_x5);
        this.f1547d = webView;
        webView.getSettings().setLoadsImagesAutomatically(true);
        this.f1547d.getSettings().setJavaScriptEnabled(true);
        this.f1547d.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f1547d.getSettings().setCacheMode(-1);
        this.f1547d.getSettings().setDomStorageEnabled(true);
        this.f1547d.getSettings().setUseWideViewPort(true);
        this.f1547d.getSettings().setLoadWithOverviewMode(true);
        this.f1547d.getSettings().setBuiltInZoomControls(false);
        this.f1547d.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        this.f1547d.getSettings().setGeolocationEnabled(true);
        this.f1547d.getSettings().setAllowFileAccess(true);
        this.f1547d.getSettings().setAppCacheMaxSize(Long.MAX_VALUE);
        this.f1547d.getSettings().setPluginState(WebSettings.PluginState.ON_DEMAND);
        this.f1547d.setLayerType(2, null);
        this.f1547d.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        this.f1547d.getSettings().setSupportZoom(true);
        this.f1547d.getSettings().setDatabaseEnabled(true);
        this.f1547d.getSettings().setSupportMultipleWindows(true);
        this.f1547d.getSettings().setAppCacheEnabled(true);
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", this.f1552i);
        this.f1547d.loadUrl(this.f1550g, hashMap);
        this.f1547d.setWebViewClient(new z(this));
        this.f1547d.setWebChromeClient(new a0(this));
        this.f1547d.setDownloadListener(new b0(this));
        this.f1545b = (TextView) findViewById(R.id.web_actionbar_center);
        ((ImageView) findViewById(R.id.web_actionbar_left)).setOnClickListener(new x(this));
        ((ImageView) findViewById(R.id.web_actionbar_right)).setOnClickListener(new y(this));
        int i5 = this.f1551h;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    findViewById(R.id.web_actionbar_rl).setVisibility(8);
                    getWindow().setFlags(512, 512);
                    return;
                }
                return;
            }
            findViewById(R.id.web_actionbar_rl).setVisibility(8);
        }
        getWindow().setStatusBarColor(getResources().getColor(R.color.Grey_200));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
    }
}
