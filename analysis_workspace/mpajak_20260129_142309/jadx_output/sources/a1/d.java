package a1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import com.google.android.gms.iid.InstanceIDListenerService;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes13.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f31a;

    /* renamed from: b, reason: collision with root package name */
    public Context f32b;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    public final Map<String, Object> f33c = new ArrayMap();

    public d(Context context) {
        this.f32b = context;
        this.f31a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(ContextCompat.getNoBackupFilesDir(this.f32b), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || this.f31a.getAll().isEmpty()) {
                return;
            }
            Log.i("InstanceID/Store", "App restored, clearing state");
            Context context2 = this.f32b;
            int i5 = InstanceIDListenerService.f686g;
            b();
            Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
            intent.putExtra("CMD", "RST");
            intent.setClassName(context2, "com.google.android.gms.gcm.GcmReceiver");
            context2.sendBroadcast(intent);
        } catch (IOException e5) {
            if (Log.isLoggable("InstanceID/Store", 3)) {
                String valueOf = String.valueOf(e5.getMessage());
                Log.d("InstanceID/Store", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    public final synchronized void a(String str) {
        SharedPreferences.Editor edit = this.f31a.edit();
        for (String str2 : this.f31a.getAll().keySet()) {
            if (str2.startsWith(str)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }

    public final synchronized void b() {
        this.f33c.clear();
        for (File file : k.a(this.f32b).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
        this.f31a.edit().clear().commit();
    }
}
