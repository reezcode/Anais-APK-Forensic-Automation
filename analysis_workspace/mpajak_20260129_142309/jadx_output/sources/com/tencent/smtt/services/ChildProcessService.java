package com.tencent.smtt.services;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.smtt.export.external.interfaces.IX5ChildProcessService;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes3.dex */
public class ChildProcessService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private IX5ChildProcessService f2268a;

    /* loaded from: classes18.dex */
    public static class Privileged extends ChildProcessService {
    }

    /* loaded from: classes13.dex */
    public static final class Privileged0 extends Privileged {
    }

    /* loaded from: classes25.dex */
    public static final class Privileged1 extends Privileged {
    }

    /* loaded from: classes17.dex */
    public static final class Privileged2 extends Privileged {
    }

    /* loaded from: classes22.dex */
    public static final class Privileged3 extends Privileged {
    }

    /* loaded from: classes12.dex */
    public static final class Privileged4 extends Privileged {
    }

    /* loaded from: classes8.dex */
    public static final class Privileged5 extends Privileged {
    }

    /* loaded from: classes2.dex */
    public static final class Privileged6 extends Privileged {
    }

    /* loaded from: classes4.dex */
    public static final class Privileged7 extends Privileged {
    }

    /* loaded from: classes15.dex */
    public static final class Privileged8 extends Privileged {
    }

    /* loaded from: classes19.dex */
    public static final class Privileged9 extends Privileged {
    }

    /* loaded from: classes16.dex */
    public static class Sandboxed extends ChildProcessService {
    }

    /* loaded from: classes23.dex */
    public static final class Sandboxed0 extends Sandboxed {
    }

    /* loaded from: classes20.dex */
    public static final class Sandboxed1 extends Sandboxed {
    }

    /* loaded from: classes18.dex */
    public static final class Sandboxed2 extends Sandboxed {
    }

    /* loaded from: classes4.dex */
    public static final class Sandboxed3 extends Sandboxed {
    }

    /* loaded from: classes11.dex */
    public static final class Sandboxed4 extends Sandboxed {
    }

    /* loaded from: classes24.dex */
    public static final class Sandboxed5 extends Sandboxed {
    }

    /* loaded from: classes7.dex */
    public static final class Sandboxed6 extends Sandboxed {
    }

    /* loaded from: classes25.dex */
    public static final class Sandboxed7 extends Sandboxed {
    }

    /* loaded from: classes15.dex */
    public static final class Sandboxed8 extends Sandboxed {
    }

    /* loaded from: classes22.dex */
    public static final class Sandboxed9 extends Sandboxed {
    }

    @SuppressLint({"NewApi"})
    private void a(Intent intent, Throwable th) {
        IBinder binder;
        Parcel obtain;
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        Bundle extras = intent.getExtras();
        if (extras == null || (binder = extras.getBinder(IX5ChildProcessService.ERROR_CALLBACK_KEY)) == null) {
            return;
        }
        Parcel parcel = null;
        try {
            try {
                obtain = Parcel.obtain();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (RemoteException e5) {
            e = e5;
        }
        try {
            obtain.writeString(stringWriter2);
            binder.transact(1, obtain, null, 0);
            obtain.recycle();
        } catch (RemoteException e6) {
            e = e6;
            parcel = obtain;
            e.printStackTrace();
            if (parcel != null) {
                parcel.recycle();
            }
            throw new RuntimeException(th);
        } catch (Throwable th3) {
            th = th3;
            parcel = obtain;
            if (parcel != null) {
                parcel.recycle();
            }
            throw th;
        }
        throw new RuntimeException(th);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (this.f2268a == null) {
            try {
                String stringExtra = intent.getStringExtra(IX5ChildProcessService.INSTALLATION_DIRECTORY_KEY);
                String stringExtra2 = intent.getStringExtra(IX5ChildProcessService.ENTRY_DEX_FILE_KEY);
                String stringExtra3 = intent.getStringExtra(IX5ChildProcessService.ENTRY_CLASS_NAME_KEY);
                if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2) && !TextUtils.isEmpty(stringExtra3)) {
                    File file = new File(stringExtra, stringExtra2);
                    String absolutePath = file.getAbsolutePath();
                    if (!file.exists()) {
                        a(intent, new FileNotFoundException(absolutePath));
                        return null;
                    }
                    SystemClock.elapsedRealtime();
                    IX5ChildProcessService iX5ChildProcessService = (IX5ChildProcessService) new DexClassLoader(absolutePath, stringExtra, stringExtra, ChildProcessService.class.getClassLoader()).loadClass(stringExtra3).newInstance();
                    this.f2268a = iX5ChildProcessService;
                    iX5ChildProcessService.onCreate(this, intent);
                }
                a(intent, new IllegalArgumentException("installationDirectory: " + stringExtra + ", dexFile: " + stringExtra2 + ", className: " + stringExtra3));
                return null;
            } catch (Throwable th) {
                a(intent, th);
                return null;
            }
        }
        return this.f2268a.onBind(this, intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        IX5ChildProcessService iX5ChildProcessService = this.f2268a;
        if (iX5ChildProcessService != null) {
            iX5ChildProcessService.onCreate(this, null);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        IX5ChildProcessService iX5ChildProcessService = this.f2268a;
        if (iX5ChildProcessService != null) {
            iX5ChildProcessService.onDestroy(this);
            this.f2268a = null;
        }
    }
}
