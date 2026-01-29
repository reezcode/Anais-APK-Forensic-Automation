package com.tencent.smtt.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
import com.tencent.smtt.export.external.DexLoader;

/* loaded from: classes5.dex */
class r extends FrameLayout implements MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    private Object f2217a;

    /* renamed from: b, reason: collision with root package name */
    private t f2218b;

    /* renamed from: c, reason: collision with root package name */
    private VideoView f2219c;

    /* renamed from: d, reason: collision with root package name */
    private Context f2220d;

    /* renamed from: e, reason: collision with root package name */
    private String f2221e;

    public r(Context context) {
        super(context.getApplicationContext());
        this.f2220d = context;
    }

    private void b(Bundle bundle, Object obj) {
        boolean z4;
        a();
        if (b()) {
            bundle.putInt("callMode", bundle.getInt("callMode"));
            z4 = this.f2218b.a(this.f2217a, bundle, this, obj);
        } else {
            z4 = false;
        }
        if (z4) {
            return;
        }
        VideoView videoView = this.f2219c;
        if (videoView != null) {
            videoView.stopPlayback();
        }
        if (this.f2219c == null) {
            this.f2219c = new VideoView(getContext());
        }
        String string = bundle.getString("videoUrl");
        this.f2221e = string;
        this.f2219c.setVideoURI(Uri.parse(string));
        this.f2219c.setOnErrorListener(this);
        Intent intent = new Intent("com.tencent.smtt.tbs.video.PLAY");
        intent.addFlags(268435456);
        Context applicationContext = getContext().getApplicationContext();
        intent.setPackage(applicationContext.getPackageName());
        applicationContext.startActivity(intent);
    }

    public void a() {
        setBackgroundColor(-16777216);
        if (this.f2218b == null) {
            f.a(true).a(getContext().getApplicationContext(), false, false);
            s a5 = f.a(true).a();
            DexLoader c5 = a5 != null ? a5.c() : null;
            if (c5 != null && QbSdk.canLoadVideo(getContext())) {
                this.f2218b = new t(c5);
            }
        }
        t tVar = this.f2218b;
        if (tVar == null || this.f2217a != null) {
            return;
        }
        this.f2217a = tVar.a(getContext().getApplicationContext());
    }

    public void a(Activity activity) {
        VideoView videoView;
        if (b() || (videoView = this.f2219c) == null) {
            return;
        }
        if (videoView.getParent() == null) {
            Window window = activity.getWindow();
            FrameLayout frameLayout = (FrameLayout) window.getDecorView();
            window.addFlags(1024);
            window.addFlags(128);
            frameLayout.setBackgroundColor(-16777216);
            MediaController mediaController = new MediaController(activity);
            mediaController.setMediaPlayer(this.f2219c);
            this.f2219c.setMediaController(mediaController);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            frameLayout.addView(this.f2219c, layoutParams);
        }
        this.f2219c.start();
    }

    public void a(Activity activity, int i5) {
        VideoView videoView;
        VideoView videoView2;
        if (i5 == 3 && !b() && (videoView2 = this.f2219c) != null) {
            videoView2.pause();
        }
        if (i5 == 4) {
            this.f2220d = null;
            if (!b() && (videoView = this.f2219c) != null) {
                videoView.stopPlayback();
                this.f2219c = null;
            }
        }
        if (i5 == 2 && !b()) {
            this.f2220d = activity;
            a(activity);
        }
        if (b()) {
            this.f2218b.a(this.f2217a, activity, i5);
        }
    }

    public void a(Bundle bundle, Object obj) {
        b(bundle, obj);
    }

    public boolean b() {
        return (this.f2218b == null || this.f2217a == null) ? false : true;
    }

    public void c() {
        if (b()) {
            this.f2218b.a(this.f2217a);
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i5, int i6) {
        try {
            Context context = this.f2220d;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (!activity.isFinishing()) {
                    activity.finish();
                }
            }
            Context context2 = getContext();
            if (context2 != null) {
                Toast.makeText(context2, "播放失败，请选择其它播放器播放", 1).show();
                Context applicationContext = context2.getApplicationContext();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(268435456);
                intent.setDataAndType(Uri.parse(this.f2221e), "video/*");
                applicationContext.startActivity(intent);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
