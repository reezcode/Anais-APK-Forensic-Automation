package androidx.work.multiprocess;

import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.multiprocess.IWorkManagerImplCallback;
import java.util.NoSuchElementException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes21.dex */
public class RemoteCallback extends IWorkManagerImplCallback.Stub {
    private IBinder mBinder = null;
    private final SettableFuture<byte[]> mFuture = SettableFuture.create();
    private final IBinder.DeathRecipient mRecipient = new DeathRecipient(this);

    /* loaded from: classes23.dex */
    public static class DeathRecipient implements IBinder.DeathRecipient {
        private final RemoteCallback mCallback;

        public DeathRecipient(@NonNull RemoteCallback remoteCallback) {
            this.mCallback = remoteCallback;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            this.mCallback.onFailure("Binder died");
        }
    }

    private void onFailure(@NonNull Throwable th) {
        this.mFuture.setException(th);
        unlinkToDeath();
        onRequestCompleted();
    }

    private void unlinkToDeath() {
        IBinder iBinder = this.mBinder;
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this.mRecipient, 0);
            } catch (NoSuchElementException unused) {
            }
        }
    }

    @NonNull
    public h2.a<byte[]> getFuture() {
        return this.mFuture;
    }

    @Override // androidx.work.multiprocess.IWorkManagerImplCallback
    public void onFailure(@NonNull String str) {
        onFailure(new RuntimeException(str));
    }

    public void onRequestCompleted() {
    }

    @Override // androidx.work.multiprocess.IWorkManagerImplCallback
    public void onSuccess(@NonNull byte[] bArr) {
        this.mFuture.set(bArr);
        unlinkToDeath();
        onRequestCompleted();
    }

    public void setBinder(@NonNull IBinder iBinder) {
        this.mBinder = iBinder;
        try {
            iBinder.linkToDeath(this.mRecipient, 0);
        } catch (RemoteException e5) {
            onFailure(e5);
        }
    }
}
