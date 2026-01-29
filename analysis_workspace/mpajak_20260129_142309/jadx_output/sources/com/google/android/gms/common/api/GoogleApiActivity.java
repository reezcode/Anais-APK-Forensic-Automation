package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import b1.a;
import com.google.android.gms.common.annotation.KeepName;
import p0.c;
import r0.b;

@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f639c = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f640b = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i5, int i6, Intent intent) {
        b bVar;
        super.onActivityResult(i5, i6, intent);
        if (i5 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f640b = 0;
            setResult(i6, intent);
            if (booleanExtra) {
                synchronized (b.f5014k) {
                    if (b.f5015l == null) {
                        HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                        handlerThread.start();
                        Looper looper = handlerThread.getLooper();
                        Context applicationContext = getApplicationContext();
                        Object obj = c.f4630b;
                        c cVar = c.f4631c;
                        b.f5015l = new b(applicationContext, looper);
                    }
                    bVar = b.f5015l;
                }
                if (i6 == -1) {
                    a aVar = bVar.f5023h;
                    aVar.sendMessage(aVar.obtainMessage(3));
                } else if (i6 == 0) {
                    p0.a aVar2 = new p0.a(13, null);
                    int intExtra = getIntent().getIntExtra("failing_client_id", -1);
                    if (!bVar.b(aVar2, intExtra)) {
                        a aVar3 = bVar.f5023h;
                        aVar3.sendMessage(aVar3.obtainMessage(5, intExtra, 0, aVar2));
                    }
                }
            }
        } else if (i5 == 2) {
            this.f640b = 0;
            setResult(i6, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f640b = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f640b = bundle.getInt("resolution");
        }
        if (this.f640b != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                str = "Activity started without extras";
            } else {
                PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
                Integer num = (Integer) extras.get("error_code");
                if (pendingIntent == null && num == null) {
                    str = "Activity started without resolution";
                } else if (pendingIntent == null) {
                    Object obj = c.f4630b;
                    c.f4631c.d(this, num.intValue(), this);
                    this.f640b = 1;
                    return;
                } else {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                        this.f640b = 1;
                        return;
                    } catch (IntentSender.SendIntentException e5) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e5);
                    }
                }
            }
            Log.e("GoogleApiActivity", str);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f640b);
        super.onSaveInstanceState(bundle);
    }
}
