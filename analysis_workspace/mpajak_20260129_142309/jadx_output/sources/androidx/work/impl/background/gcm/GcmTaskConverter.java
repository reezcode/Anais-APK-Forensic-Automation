package androidx.work.impl.background.gcm;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.impl.model.WorkSpec;
import com.google.android.gms.gcm.OneoffTask;
import com.google.android.gms.gcm.Task;
import com.google.android.gms.gcm.a;
import java.util.concurrent.TimeUnit;
import z0.i;

/* loaded from: classes13.dex */
public class GcmTaskConverter {

    @VisibleForTesting
    public static final long EXECUTION_WINDOW_SIZE_IN_SECONDS = 5;
    public static final String EXTRA_WORK_GENERATION = "androidx.work.impl.background.gcm.GENERATION";

    /* renamed from: androidx.work.impl.background.gcm.GcmTaskConverter$1, reason: invalid class name */
    /* loaded from: classes23.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$work$NetworkType;

        static {
            int[] iArr = new int[NetworkType.values().length];
            $SwitchMap$androidx$work$NetworkType = iArr;
            try {
                iArr[NetworkType.METERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[NetworkType.NOT_ROAMING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[NetworkType.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[NetworkType.UNMETERED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[NetworkType.NOT_REQUIRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private static Task.a applyConstraints(@NonNull Task.a aVar, @NonNull WorkSpec workSpec) {
        ((OneoffTask.a) aVar).f679f = false;
        OneoffTask.a aVar2 = (OneoffTask.a) aVar;
        aVar2.f674a = 2;
        if (workSpec.hasConstraints()) {
            Constraints constraints = workSpec.constraints;
            NetworkType requiredNetworkType = constraints.getRequiredNetworkType();
            int i5 = AnonymousClass1.$SwitchMap$androidx$work$NetworkType[requiredNetworkType.ordinal()];
            if (i5 == 1 || i5 == 2 || i5 == 3) {
                aVar2.f674a = 0;
            } else if (i5 == 4) {
                aVar2.f674a = 1;
            } else if (i5 == 5 || (Build.VERSION.SDK_INT >= 30 && requiredNetworkType == NetworkType.TEMPORARILY_UNMETERED)) {
                aVar2.f674a = 2;
            }
            if (constraints.requiresCharging()) {
                aVar2.f679f = true;
            } else {
                aVar2.f679f = false;
            }
        }
        return aVar;
    }

    public OneoffTask convert(@NonNull WorkSpec workSpec) {
        int i5;
        Bundle bundle = new Bundle();
        bundle.putInt(EXTRA_WORK_GENERATION, workSpec.getGeneration());
        OneoffTask.a aVar = new OneoffTask.a();
        aVar.f675b = WorkManagerGcmService.class.getName();
        aVar.f676c = workSpec.id;
        aVar.f677d = true;
        aVar.f682i = bundle;
        aVar.f678e = false;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long now = now();
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        long max = Math.max(timeUnit.convert(workSpec.calculateNextRunTime(), timeUnit2) - timeUnit.convert(now, timeUnit2), 0L);
        aVar.f662j = max;
        aVar.f663k = 5 + max;
        applyConstraints(aVar, workSpec);
        if (!(aVar.f675b != null)) {
            throw new IllegalArgumentException("Must provide an endpoint for this task by calling setService(ComponentName).");
        }
        a.b(aVar.f676c);
        i iVar = aVar.f681h;
        if (iVar != null && (i5 = iVar.f6108a) != 1 && i5 != 0) {
            StringBuilder sb = new StringBuilder(45);
            sb.append("Must provide a valid RetryPolicy: ");
            sb.append(i5);
            throw new IllegalArgumentException(sb.toString());
        }
        if (aVar.f678e) {
            Task.j(aVar.f682i);
        }
        if (!aVar.f680g.isEmpty() && aVar.f674a == 2) {
            throw new IllegalArgumentException("Required URIs may not be used with NETWORK_STATE_ANY");
        }
        for (Uri uri : aVar.f680g) {
            if (uri == null) {
                throw new IllegalArgumentException("Null URI");
            }
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (TextUtils.isEmpty(host) || "null".equals(host)) {
                throw new IllegalArgumentException("URI hostname is required");
            }
            try {
                int port = uri.getPort();
                if ("tcp".equals(scheme)) {
                    if (port <= 0 || port > 65535) {
                        int port2 = uri.getPort();
                        StringBuilder sb2 = new StringBuilder(38);
                        sb2.append("Invalid required URI port: ");
                        sb2.append(port2);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                } else {
                    if (!"ping".equals(scheme)) {
                        String valueOf = String.valueOf(scheme);
                        throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported required URI scheme: ".concat(valueOf) : new String("Unsupported required URI scheme: "));
                    }
                    if (port != -1) {
                        throw new IllegalArgumentException("Ping does not support port numbers");
                    }
                }
            } catch (NumberFormatException e5) {
                String valueOf2 = String.valueOf(e5.getMessage());
                throw new IllegalArgumentException(valueOf2.length() != 0 ? "Invalid port number: ".concat(valueOf2) : new String("Invalid port number: "));
            }
        }
        long j5 = aVar.f662j;
        if (j5 != -1) {
            long j6 = aVar.f663k;
            if (j6 != -1) {
                if (j5 < j6) {
                    return new OneoffTask(aVar);
                }
                throw new IllegalArgumentException("Window start must be shorter than window end.");
            }
        }
        throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
    }

    @VisibleForTesting
    public long now() {
        return System.currentTimeMillis();
    }
}
