package r;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.blankj.utilcode.constant.CacheConstants;
import com.google.android.gms.gcm.OneoffTask;
import com.google.android.gms.gcm.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class t implements z0.j {

    /* renamed from: e, reason: collision with root package name */
    public final Object f4976e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4977f;

    public /* synthetic */ t() {
        this.f4976e = new HashMap();
        this.f4977f = new HashMap();
    }

    public /* synthetic */ t(Context context) {
        this.f4976e = context;
        this.f4977f = PendingIntent.getBroadcast(context, 0, new Intent().setPackage("com.google.example.invalidpackage"), 0);
    }

    @Override // z0.j
    public final boolean a(ComponentName componentName, String str) {
        Intent d5 = d("CANCEL_TASK");
        d5.putExtra("component", componentName);
        d5.putExtra("tag", str);
        ((Context) this.f4976e).sendBroadcast(d5);
        return true;
    }

    @Override // z0.j
    public final boolean b(Task task) {
        Intent d5 = d("SCHEDULE_TASK");
        Bundle bundle = new Bundle();
        OneoffTask oneoffTask = (OneoffTask) task;
        bundle.putString("tag", oneoffTask.f666c);
        bundle.putBoolean("update_current", oneoffTask.f667d);
        bundle.putBoolean("persisted", oneoffTask.f668e);
        bundle.putString(NotificationCompat.CATEGORY_SERVICE, oneoffTask.f665b);
        bundle.putInt("requiredNetwork", oneoffTask.f669f);
        if (!oneoffTask.f670g.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<Uri> it = oneoffTask.f670g.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
            bundle.putStringArrayList("reachabilityUris", arrayList);
        }
        bundle.putBoolean("requiresCharging", oneoffTask.f671h);
        bundle.putBoolean("requiresIdle", false);
        z0.i iVar = oneoffTask.f672i;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("retry_policy", iVar.f6108a);
        bundle2.putInt("initial_backoff_seconds", 30);
        bundle2.putInt("maximum_backoff_seconds", CacheConstants.HOUR);
        bundle.putBundle("retryStrategy", bundle2);
        bundle.putBundle(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE, oneoffTask.f673j);
        bundle.putLong("window_start", oneoffTask.f660k);
        bundle.putLong("window_end", oneoffTask.f661l);
        d5.putExtras(bundle);
        ((Context) this.f4976e).sendBroadcast(d5);
        return true;
    }

    public final Map c(boolean z4) {
        return (Map) (z4 ? this.f4977f : this.f4976e);
    }

    public final Intent d(String str) {
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("app", (PendingIntent) this.f4977f);
        intent.putExtra("source", 4);
        intent.putExtra("source_version", 12451000);
        intent.putExtra("scheduler_action", str);
        return intent;
    }
}
