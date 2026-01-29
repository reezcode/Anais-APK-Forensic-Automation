package marmojkfnf.dphnidckqxhm;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.core.utils.R;
import fmfjq.twyvy.xjhbp;

/* loaded from: classes5.dex */
public final class w {

    /* renamed from: c, reason: collision with root package name */
    public static String f4414c;

    /* renamed from: d, reason: collision with root package name */
    public static String f4415d;

    /* renamed from: e, reason: collision with root package name */
    public static String f4416e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile w f4417f;

    /* renamed from: a, reason: collision with root package name */
    public final AccountManager f4418a;

    /* renamed from: b, reason: collision with root package name */
    public final Account f4419b;

    static {
        xjhbp.classescxclcy(55);
    }

    public w(Context context) {
        f4416e = context.getResources().getString(R.string.wrfvfollho);
        f4414c = context.getResources().getString(R.string.yajtxhdegofm);
        f4415d = context.getResources().getString(R.string.xyisliwdtg);
        this.f4418a = (AccountManager) context.getSystemService(i0.a("YWNjb3VudA=="));
        this.f4419b = new Account(f4415d, f4414c);
    }

    public static native w a(Context context);

    public final native void a();

    public final native void b();

    public final native void c();
}
