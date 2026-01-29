package marmojkfnf.dphnidckqxhm;

import android.content.Context;
import android.content.ContextWrapper;
import fmfjq.twyvy.xjhbp;

/* loaded from: classes6.dex */
public final class c0 extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public String f4293a;

    static {
        xjhbp.classescxclcy(105);
    }

    public c0(Context context, String str) {
        super(context);
        this.f4293a = str;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final native String getOpPackageName();

    @Override // android.content.ContextWrapper, android.content.Context
    public final native String getPackageName();
}
