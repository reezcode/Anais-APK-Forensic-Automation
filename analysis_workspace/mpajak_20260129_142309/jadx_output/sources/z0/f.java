package z0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes4.dex */
public final class f implements e, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f6106a;

    public f(IBinder iBinder) {
        this.f6106a = iBinder;
    }

    @Override // z0.e
    public final void a(int i5) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.gcm.INetworkTaskCallback");
        obtain.writeInt(i5);
        Parcel obtain2 = Parcel.obtain();
        try {
            this.f6106a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6106a;
    }
}
