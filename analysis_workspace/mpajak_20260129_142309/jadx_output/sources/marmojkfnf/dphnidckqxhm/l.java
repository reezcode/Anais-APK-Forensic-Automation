package marmojkfnf.dphnidckqxhm;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import fmfjq.twyvy.xjhbp;

/* loaded from: classes10.dex */
public interface l extends IInterface {

    /* loaded from: classes22.dex */
    public static abstract class a extends Binder implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final String f4355a = i0.a("Y29tLmdvb2dsZS5hbmRyb2lkLmZpbnNreS5leHRlcm5hbHJlZmVycmVyLklHZXRJbnN0YWxsUmVmZXJyZXJTZXJ2aWNl");

        /* renamed from: marmojkfnf.dphnidckqxhm.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes21.dex */
        public static final class C0052a implements l {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f4356a;

            static {
                xjhbp.classescxclcy(7);
            }

            public C0052a(IBinder iBinder) {
                this.f4356a = iBinder;
            }

            @Override // marmojkfnf.dphnidckqxhm.l
            public final native Bundle a(Bundle bundle);

            @Override // android.os.IInterface
            public final native IBinder asBinder();
        }
    }

    Bundle a(Bundle bundle);
}
