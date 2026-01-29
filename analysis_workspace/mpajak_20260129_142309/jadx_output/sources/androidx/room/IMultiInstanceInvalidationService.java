package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.IMultiInstanceInvalidationCallback;

/* loaded from: classes5.dex */
public interface IMultiInstanceInvalidationService extends IInterface {
    public static final String DESCRIPTOR = "androidx.room.IMultiInstanceInvalidationService";

    /* loaded from: classes3.dex */
    public static class Default implements IMultiInstanceInvalidationService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public void broadcastInvalidation(int i5, String[] strArr) {
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public int registerCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) {
            return 0;
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public void unregisterCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i5) {
        }
    }

    public static abstract class Stub extends Binder implements IMultiInstanceInvalidationService {
        public static final int TRANSACTION_broadcastInvalidation = 3;
        public static final int TRANSACTION_registerCallback = 1;
        public static final int TRANSACTION_unregisterCallback = 2;

        /* loaded from: classes18.dex */
        public static class Proxy implements IMultiInstanceInvalidationService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            public void broadcastInvalidation(int i5, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMultiInstanceInvalidationService.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeStringArray(strArr);
                    this.mRemote.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IMultiInstanceInvalidationService.DESCRIPTOR;
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            public int registerCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMultiInstanceInvalidationService.DESCRIPTOR);
                    obtain.writeStrongInterface(iMultiInstanceInvalidationCallback);
                    obtain.writeString(str);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            public void unregisterCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i5) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMultiInstanceInvalidationService.DESCRIPTOR);
                    obtain.writeStrongInterface(iMultiInstanceInvalidationCallback);
                    obtain.writeInt(i5);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IMultiInstanceInvalidationService.DESCRIPTOR);
        }

        public static IMultiInstanceInvalidationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IMultiInstanceInvalidationService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IMultiInstanceInvalidationService)) ? new Proxy(iBinder) : (IMultiInstanceInvalidationService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) {
            if (i5 >= 1 && i5 <= 16777215) {
                parcel.enforceInterface(IMultiInstanceInvalidationService.DESCRIPTOR);
            }
            if (i5 == 1598968902) {
                parcel2.writeString(IMultiInstanceInvalidationService.DESCRIPTOR);
                return true;
            }
            if (i5 == 1) {
                int registerCallback = registerCallback(IMultiInstanceInvalidationCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(registerCallback);
            } else if (i5 == 2) {
                unregisterCallback(IMultiInstanceInvalidationCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i5 != 3) {
                    return super.onTransact(i5, parcel, parcel2, i6);
                }
                broadcastInvalidation(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    void broadcastInvalidation(int i5, String[] strArr);

    int registerCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str);

    void unregisterCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i5);
}
