package com.tencent.smtt.sdk;

import android.content.Context;
import android.util.Log;
import com.tencent.smtt.export.external.DexLoader;

/* loaded from: classes18.dex */
public class TbsMediaFactory {

    /* renamed from: a, reason: collision with root package name */
    private Context f1961a;

    /* renamed from: b, reason: collision with root package name */
    private s f1962b = null;

    /* renamed from: c, reason: collision with root package name */
    private DexLoader f1963c = null;

    public TbsMediaFactory(Context context) {
        this.f1961a = null;
        this.f1961a = context.getApplicationContext();
        a();
    }

    private void a() {
        if (this.f1961a == null) {
            Log.e("TbsVideo", "TbsVideo needs context !!");
            return;
        }
        if (this.f1962b == null) {
            f.a(true).a(this.f1961a, false, false);
            s a5 = f.a(true).a();
            this.f1962b = a5;
            if (a5 != null) {
                this.f1963c = a5.c();
            }
        }
        if (this.f1962b == null || this.f1963c == null) {
            throw new RuntimeException("tbs core dex(s) load failure !!!");
        }
    }

    public TbsMediaPlayer createPlayer() {
        DexLoader dexLoader;
        if (this.f1962b == null || (dexLoader = this.f1963c) == null) {
            throw new RuntimeException("tbs core dex(s) did not loaded !!!");
        }
        return new TbsMediaPlayer(new n(dexLoader, this.f1961a));
    }
}
