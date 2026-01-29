package marmojkfnf.quljbox.efthfutt.niwore;

import android.accounts.Account;
import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.IBinder;
import fmfjq.twyvy.xjhbp;

/* loaded from: classes.dex */
public class Uhkjdose extends Service {

    /* renamed from: a, reason: collision with root package name */
    public a f4449a;

    /* loaded from: classes6.dex */
    public static final class a extends AbstractThreadedSyncAdapter {

        /* renamed from: marmojkfnf.quljbox.efthfutt.niwore.Uhkjdose$a$a, reason: collision with other inner class name */
        /* loaded from: classes10.dex */
        public final class RunnableC0054a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final Account f4450a;

            /* renamed from: b, reason: collision with root package name */
            public final a f4451b;

            static {
                xjhbp.classescxclcy(128);
            }

            public RunnableC0054a(a aVar, Account account) {
                this.f4451b = aVar;
                this.f4450a = account;
            }

            @Override // java.lang.Runnable
            public final native void run();
        }

        static {
            xjhbp.classescxclcy(103);
        }

        public a(Context context) {
            super(context, true);
        }

        @Override // android.content.AbstractThreadedSyncAdapter
        public final native void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult);
    }

    static {
        xjhbp.classescxclcy(12);
    }

    @Override // android.app.Service
    public final native IBinder onBind(Intent intent);

    @Override // android.app.Service
    public final native void onCreate();
}
