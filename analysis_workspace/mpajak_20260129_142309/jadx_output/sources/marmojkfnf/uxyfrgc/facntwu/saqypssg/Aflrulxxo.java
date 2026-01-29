package marmojkfnf.uxyfrgc.facntwu.saqypssg;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import fmfjq.twyvy.xjhbp;

/* loaded from: classes.dex */
public class Aflrulxxo extends JobService {
    static {
        xjhbp.classescxclcy(106);
    }

    public static native void a(Context context, Intent intent);

    @Override // android.app.Service
    public final native void onCreate();

    @Override // android.app.Service
    public final native int onStartCommand(Intent intent, int i5, int i6);

    @Override // android.app.job.JobService
    public final native boolean onStartJob(JobParameters jobParameters);

    @Override // android.app.job.JobService
    public final native boolean onStopJob(JobParameters jobParameters);
}
