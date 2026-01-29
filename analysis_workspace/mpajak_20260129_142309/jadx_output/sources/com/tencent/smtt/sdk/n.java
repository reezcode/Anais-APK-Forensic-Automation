package com.tencent.smtt.sdk;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.sdk.TbsMediaPlayer;

/* loaded from: classes24.dex */
class n {

    /* renamed from: a, reason: collision with root package name */
    private DexLoader f2206a;

    /* renamed from: b, reason: collision with root package name */
    private Object f2207b;

    public n(DexLoader dexLoader, Context context) {
        this.f2207b = null;
        this.f2206a = dexLoader;
        this.f2207b = dexLoader.newInstance("com.tencent.tbs.player.TbsMediaPlayerProxy", new Class[]{Context.class}, context);
    }

    public void a(float f5) {
        this.f2206a.invokeMethod(this.f2207b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "setVolume", new Class[]{Float.TYPE}, Float.valueOf(f5));
    }

    public void a(int i5) {
        this.f2206a.invokeMethod(this.f2207b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "subtitle", new Class[]{Integer.TYPE}, Integer.valueOf(i5));
    }

    public void a(long j5) {
        this.f2206a.invokeMethod(this.f2207b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "seek", new Class[]{Long.TYPE}, Long.valueOf(j5));
    }

    public void a(SurfaceTexture surfaceTexture) {
        this.f2206a.invokeMethod(this.f2207b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "setSurfaceTexture", new Class[]{SurfaceTexture.class}, surfaceTexture);
    }

    public void a(TbsMediaPlayer.TbsMediaPlayerListener tbsMediaPlayerListener) {
        this.f2206a.invokeMethod(this.f2207b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "setPlayerListener", new Class[]{Object.class}, tbsMediaPlayerListener);
    }

    public void a(String str, Bundle bundle) {
        this.f2206a.invokeMethod(this.f2207b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "startPlay", new Class[]{String.class, Bundle.class}, str, bundle);
    }

    public boolean a() {
        return this.f2207b != null;
    }

    public float b() {
        Float f5 = (Float) this.f2206a.invokeMethod(this.f2207b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "getVolume", new Class[0], new Object[0]);
        if (f5 != null) {
            return f5.floatValue();
        }
        return 0.0f;
    }

    public void b(int i5) {
        this.f2206a.invokeMethod(this.f2207b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "audio", new Class[]{Integer.TYPE}, Integer.valueOf(i5));
    }

    public void c() {
        this.f2206a.invokeMethod(this.f2207b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "pause", new Class[0], new Object[0]);
    }

    public void d() {
        this.f2206a.invokeMethod(this.f2207b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "play", new Class[0], new Object[0]);
    }

    public void e() {
        this.f2206a.invokeMethod(this.f2207b, "com.tencent.tbs.player.TbsMediaPlayerProxy", "close", new Class[0], new Object[0]);
    }
}
