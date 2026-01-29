package marmojkfnf.uxyfrgc.facntwu.saqypssg;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import fmfjq.twyvy.xjhbp;

/* loaded from: classes19.dex */
public class Lgkqfwamh extends Worker {

    /* renamed from: a, reason: collision with root package name */
    public static long f4460a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f4461b = 0;

    /* loaded from: classes11.dex */
    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final Lgkqfwamh f4462a;

        static {
            xjhbp.classescxclcy(33);
        }

        public a(Lgkqfwamh lgkqfwamh) {
            this.f4462a = lgkqfwamh;
        }

        @Override // java.lang.Runnable
        public final native void run();
    }

    static {
        xjhbp.classescxclcy(84);
    }

    public Lgkqfwamh(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final native ListenableWorker.Result doWork();

    @Override // androidx.work.ListenableWorker
    public final native void onStopped();
}
