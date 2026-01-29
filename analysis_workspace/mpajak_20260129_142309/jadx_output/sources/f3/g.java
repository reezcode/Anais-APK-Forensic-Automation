package f3;

import com.superbock.auto.BaseService;
import f3.i;
import java.util.Objects;
import java.util.TimerTask;
import s3.g0;

/* loaded from: classes7.dex */
public final class g extends TimerTask {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f2792b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i.a f2793c;

    public g(i.a aVar, g0 g0Var) {
        this.f2793c = aVar;
        this.f2792b = g0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        i.a aVar = this.f2793c;
        g0 g0Var = this.f2792b;
        Objects.requireNonNull(aVar);
        g0Var.b("pong");
        if ((aVar.f2807d == 0 && System.currentTimeMillis() - aVar.f2806c > 60000) || (aVar.f2807d > 0 && System.currentTimeMillis() - aVar.f2807d > 60000)) {
            g0Var.a(1000, "NORMAL_CLOSURE");
        }
        if (BaseService.M == null || aVar.f2808e <= 0 || System.currentTimeMillis() - aVar.f2808e <= 60000) {
            return;
        }
        BaseService.M = null;
        BaseService.L = Boolean.TRUE;
        aVar.f2808e = 0L;
    }
}
