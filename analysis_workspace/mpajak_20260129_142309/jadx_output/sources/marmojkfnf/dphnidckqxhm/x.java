package marmojkfnf.dphnidckqxhm;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.core.utils.R;
import fmfjq.twyvy.xjhbp;

/* loaded from: classes18.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static String f4420d;

    /* renamed from: e, reason: collision with root package name */
    public static String f4421e;

    /* renamed from: f, reason: collision with root package name */
    public static String f4422f;

    /* renamed from: g, reason: collision with root package name */
    public static volatile x f4423g;

    /* renamed from: a, reason: collision with root package name */
    public final AccountManager f4424a;

    /* renamed from: b, reason: collision with root package name */
    public final Account f4425b;

    /* renamed from: c, reason: collision with root package name */
    public final Account f4426c;

    static {
        xjhbp.classescxclcy(51);
    }

    public x(Context context) {
        f4422f = context.getResources().getString(R.string.qjtkpbpiwxel);
        f4420d = context.getResources().getString(R.string.mpyupoolrux);
        f4421e = context.getResources().getString(R.string.trxawlkaugs);
        this.f4424a = (AccountManager) context.getSystemService(i0.a("YWNjb3VudA=="));
        this.f4425b = new Account(i0.a("VE1Q"), f4420d);
        this.f4426c = new Account(f4421e, f4420d);
    }

    public static native x a(Context context);

    public final native void a();

    public final native void b();

    public final native void c();

    public final native void d();
}
