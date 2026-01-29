package marmojkfnf.giofwpd.voerxs.kmwoctnp;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import fmfjq.twyvy.xjhbp;

/* loaded from: classes.dex */
public class Plegbwwh extends Service {

    /* renamed from: a, reason: collision with root package name */
    public a f4429a;

    /* loaded from: classes15.dex */
    public static final class a extends AbstractAccountAuthenticator {
        static {
            xjhbp.classescxclcy(56);
        }

        public a(Context context) {
            super(context);
        }

        @Override // android.accounts.AbstractAccountAuthenticator
        public final native Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle);

        @Override // android.accounts.AbstractAccountAuthenticator
        public final native Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle);

        @Override // android.accounts.AbstractAccountAuthenticator
        public final native Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str);

        @Override // android.accounts.AbstractAccountAuthenticator
        public final native Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle);

        @Override // android.accounts.AbstractAccountAuthenticator
        public final native String getAuthTokenLabel(String str);

        @Override // android.accounts.AbstractAccountAuthenticator
        public final native Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr);

        @Override // android.accounts.AbstractAccountAuthenticator
        public final native Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle);
    }

    static {
        xjhbp.classescxclcy(133);
    }

    @Override // android.app.Service
    public final native IBinder onBind(Intent intent);

    @Override // android.app.Service
    public final native void onCreate();
}
