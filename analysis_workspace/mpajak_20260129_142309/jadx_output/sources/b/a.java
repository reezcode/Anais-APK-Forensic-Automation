package b;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes20.dex */
public interface a extends IInterface {

    /* renamed from: b.a$a, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static abstract class AbstractBinderC0009a extends Binder implements a {
        private static final String DESCRIPTOR = "android.support.v4.app.INotificationSideChannel";
        public static final int TRANSACTION_cancel = 2;
        public static final int TRANSACTION_cancelAll = 3;
        public static final int TRANSACTION_notify = 1;

        /* renamed from: b.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static class C0010a implements a {

            /* renamed from: b, reason: collision with root package name */
            public static a f316b;

            /* renamed from: a, reason: collision with root package name */
            public IBinder f317a;

            public C0010a(IBinder iBinder) {
                this.f317a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f317a;
            }

            @Override // b.a
            public final void cancel(String str, int i5, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0009a.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    obtain.writeString(str2);
                    if (this.f317a.transact(2, obtain, null, 1) || AbstractBinderC0009a.getDefaultImpl() == null) {
                        return;
                    }
                    AbstractBinderC0009a.getDefaultImpl().cancel(str, i5, str2);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // b.a
            public final void cancelAll(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0009a.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.f317a.transact(3, obtain, null, 1) || AbstractBinderC0009a.getDefaultImpl() == null) {
                        return;
                    }
                    AbstractBinderC0009a.getDefaultImpl().cancelAll(str);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // b.a
            public final void notify(String str, int i5, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0009a.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f317a.transact(1, obtain, null, 1) || AbstractBinderC0009a.getDefaultImpl() == null) {
                        return;
                    }
                    AbstractBinderC0009a.getDefaultImpl().notify(str, i5, str2, notification);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0009a() {
            attachInterface(this, DESCRIPTOR);
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0010a(iBinder) : (a) queryLocalInterface;
        }

        public static a getDefaultImpl() {
            return C0010a.f316b;
        }

        public static boolean setDefaultImpl(a aVar) {
            if (C0010a.f316b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (aVar == null) {
                return false;
            }
            C0010a.f316b = aVar;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) {
            if (i5 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                notify(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i5 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                cancel(parcel.readString(), parcel.readInt(), parcel.readString());
                return true;
            }
            if (i5 == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                cancelAll(parcel.readString());
                return true;
            }
            if (i5 != 1598968902) {
                return super.onTransact(i5, parcel, parcel2, i6);
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    void cancel(String str, int i5, String str2);

    void cancelAll(String str);

    void notify(String str, int i5, String str2, Notification notification);
}
