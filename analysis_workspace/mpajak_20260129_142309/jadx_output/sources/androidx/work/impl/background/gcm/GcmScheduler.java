package androidx.work.impl.background.gcm;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.Logger;
import androidx.work.impl.Scheduler;
import androidx.work.impl.model.WorkSpec;
import com.google.android.gms.gcm.OneoffTask;
import com.google.android.gms.gcm.a;
import java.util.Map;
import java.util.Objects;
import p0.c;
import z0.k;

/* loaded from: classes2.dex */
public class GcmScheduler implements Scheduler {
    private static final String TAG = Logger.tagWithPrefix("GcmScheduler");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f283b = 0;
    private final a mNetworkManager;
    private final GcmTaskConverter mTaskConverter;

    public GcmScheduler(@NonNull Context context) {
        Object obj = c.f4630b;
        if (!(c.f4631c.c(context) == 0)) {
            throw new IllegalStateException("Google Play Services not available");
        }
        this.mNetworkManager = a.a(context);
        this.mTaskConverter = new GcmTaskConverter();
    }

    @Override // androidx.work.impl.Scheduler
    public void cancel(@NonNull String str) {
        Logger.get().debug(TAG, "Cancelling " + str);
        a aVar = this.mNetworkManager;
        Objects.requireNonNull(aVar);
        ComponentName componentName = new ComponentName(aVar.f684a, (Class<?>) WorkManagerGcmService.class);
        String valueOf = String.valueOf(str);
        k kVar = new k(valueOf.length() != 0 ? "nts:client:cancel:".concat(valueOf) : new String("nts:client:cancel:"));
        try {
            a.b(str);
            aVar.e(componentName.getClassName());
            aVar.d().a(componentName, str);
            a.c(null, kVar);
        } finally {
        }
    }

    @Override // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
        return true;
    }

    @Override // androidx.work.impl.Scheduler
    public void schedule(@NonNull WorkSpec... workSpecArr) {
        Map<String, Boolean> map;
        for (WorkSpec workSpec : workSpecArr) {
            OneoffTask convert = this.mTaskConverter.convert(workSpec);
            Logger.get().debug(TAG, "Scheduling " + workSpec + "with " + convert);
            a aVar = this.mNetworkManager;
            synchronized (aVar) {
                String valueOf = String.valueOf(convert.f666c);
                k kVar = new k(valueOf.length() != 0 ? "nts:client:schedule:".concat(valueOf) : new String("nts:client:schedule:"));
                try {
                    aVar.e(convert.f665b);
                    if (aVar.d().b(convert) && (map = aVar.f685b.get(convert.f665b)) != null && map.containsKey(convert.f666c)) {
                        map.put(convert.f666c, Boolean.TRUE);
                    }
                    a.c(null, kVar);
                } finally {
                }
            }
        }
    }
}
