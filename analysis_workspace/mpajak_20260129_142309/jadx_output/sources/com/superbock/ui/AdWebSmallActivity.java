package com.superbock.ui;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.superbock.App;
import com.superbock.bean.AdInfo;
import com.tencent.smtt.sdk.ValueCallback;
import com.tencent.smtt.sdk.WebView;
import f3.i;
import java.util.Objects;

/* loaded from: classes.dex */
public class AdWebSmallActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    public long f1520b;

    /* renamed from: c, reason: collision with root package name */
    public CountDownTimer f1521c;

    /* renamed from: d, reason: collision with root package name */
    public AdInfo f1522d;

    /* renamed from: e, reason: collision with root package name */
    public long f1523e;

    /* renamed from: f, reason: collision with root package name */
    public ProgressBar f1524f;

    /* renamed from: g, reason: collision with root package name */
    public WebView f1525g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1526h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f1527i;

    /* renamed from: j, reason: collision with root package name */
    public String f1528j;

    /* renamed from: k, reason: collision with root package name */
    public String f1529k;

    /* renamed from: l, reason: collision with root package name */
    public ValueCallback<Uri> f1530l;

    /* renamed from: m, reason: collision with root package name */
    public ValueCallback<Uri[]> f1531m;

    /* loaded from: classes21.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (AdWebSmallActivity.this.f1522d.getFeedBack() == 0) {
                AdWebSmallActivity.this.f1522d.setFeedBack(3);
            }
            AdWebSmallActivity.this.finish();
        }
    }

    /* loaded from: classes19.dex */
    public class b extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f1533a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImageView f1534b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j5, long j6, ImageView imageView) {
            super(j5, 1000L);
            this.f1533a = j6;
            this.f1534b = imageView;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            if (AdWebSmallActivity.this.f1522d.getFeedBack() == 0) {
                AdWebSmallActivity.this.f1522d.setFeedBack(5);
            }
            AdWebSmallActivity.this.finish();
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j5) {
            AdWebSmallActivity adWebSmallActivity = AdWebSmallActivity.this;
            adWebSmallActivity.f1520b -= 1000;
            if (adWebSmallActivity.f1522d.getShowClose() > 0) {
                if (AdWebSmallActivity.this.f1520b == this.f1533a - (r7.f1522d.getShowClose() * 1000)) {
                    this.f1534b.setVisibility(0);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ImageView f1536a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j5, ImageView imageView) {
            super(j5, 1000L);
            this.f1536a = imageView;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            this.f1536a.setVisibility(0);
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j5) {
        }
    }

    public static void a(AdWebSmallActivity adWebSmallActivity) {
        Objects.requireNonNull(adWebSmallActivity);
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        adWebSmallActivity.startActivityForResult(Intent.createChooser(intent, "Image Chooser"), 10000);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i5, int i6, Intent intent) {
        Uri[] uriArr;
        super.onActivityResult(i5, i6, intent);
        if (i5 != 10000) {
            ValueCallback<Uri> valueCallback = this.f1530l;
            if (valueCallback == null) {
                ValueCallback<Uri[]> valueCallback2 = this.f1531m;
                if (valueCallback2 != null) {
                    valueCallback2.onReceiveValue(null);
                    this.f1531m = null;
                    return;
                }
                return;
            }
            valueCallback.onReceiveValue(null);
        } else {
            if (this.f1530l == null && this.f1531m == null) {
                return;
            }
            Uri data = (intent == null || i6 != -1) ? null : intent.getData();
            ValueCallback<Uri[]> valueCallback3 = this.f1531m;
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
                this.f1531m.onReceiveValue(uriArr);
                this.f1531m = null;
                return;
            }
            ValueCallback<Uri> valueCallback4 = this.f1530l;
            if (valueCallback4 == null) {
                return;
            } else {
                valueCallback4.onReceiveValue(data);
            }
        }
        this.f1530l = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d6  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superbock.ui.AdWebSmallActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        WebView webView = this.f1525g;
        if (webView != null) {
            webView.destroy();
        }
        CountDownTimer countDownTimer = this.f1521c;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        int type = this.f1522d.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1522d, true, false);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1522d.getCustomId() > 0) {
                App.f1372b.c(this.f1522d);
            }
        }
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
        if (this.f1522d == null) {
            return;
        }
        App.f1373c = true;
        if (this.f1523e == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f1523e = currentTimeMillis;
            this.f1522d.setStartTime(currentTimeMillis);
        }
        if (this.f1522d.getType() == 2) {
            i.n(0, "39", null);
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        int type = this.f1522d.getType();
        if (type == 0 || type == 1) {
            App.f1372b.d(this.f1522d, true, true);
            return;
        }
        if (type == 2 || type == 3 || type == 4) {
            App.f1373c = false;
            if (this.f1522d.getType() == 2) {
                i.n(0, "40", null);
            }
            if (this.f1522d.getCustomId() > 0) {
                App.f1372b.c(this.f1522d);
            }
        }
    }
}
