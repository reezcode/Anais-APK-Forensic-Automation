package marmojkfnf.dphnidckqxhm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import fmfjq.twyvy.xjhbp;

/* loaded from: classes21.dex */
public abstract class g0 extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4329a;

    static {
        xjhbp.classescxclcy(32);
        f4329a = i0.a("YW5kcm9pZC5tZWRpYS5JTWVkaWFSb3V0ZXIy");
    }

    public g0() {
        attachInterface(this, i0.a("YW5kcm9pZC5tZWRpYS5JTWVkaWFSb3V0ZXIy"));
    }

    @Override // android.os.IInterface
    public final native IBinder asBinder();

    @Override // android.os.Binder
    public final native boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6);
}
