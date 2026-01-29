package com.jx.shell;

import a.a;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public class ProxyApplication extends Application {

    /* renamed from: a, reason: collision with root package name */
    public String f1a = "";
    public Application b = null;

    public final void a() {
        if (!a.b || TextUtils.isEmpty(this.f1a)) {
            return;
        }
        Application application = (Application) JniBridge.ra(this.f1a);
        this.b = application;
        application.getClass();
        JniBridge.craa(getApplicationContext(), this.f1a);
        JniBridge.craoc(this.f1a);
        a.b = false;
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        Objects.toString(context.getClassLoader());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = null;
        try {
            try {
                inputStream = getAssets().open("app_name");
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.f1a = byteArrayOutputStream.toString();
            if (a.f0a) {
                return;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null) {
                throw new NullPointerException("application info is null");
            }
            a.d(applicationInfo.sourceDir, applicationInfo.dataDir);
            JniBridge.a(applicationInfo.dataDir, applicationInfo.sourceDir);
            JniBridge.ia();
            JniBridge.cbde(context.getClassLoader());
            a.f0a = true;
        } finally {
            a.a(byteArrayOutputStream);
            a.a(inputStream);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createPackageContext(String str, int i) {
        if (TextUtils.isEmpty(this.f1a)) {
            return super.createPackageContext(str, i);
        }
        a();
        return this.b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final String getPackageName() {
        return !TextUtils.isEmpty(this.f1a) ? "" : super.getPackageName();
    }

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        a();
    }
}
