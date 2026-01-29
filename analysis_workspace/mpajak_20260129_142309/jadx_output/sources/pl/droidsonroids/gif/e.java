package pl.droidsonroids.gif;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes21.dex */
public final class e extends f {
    public e(b bVar) {
        super(bVar);
    }

    @Override // pl.droidsonroids.gif.f
    public final void a() {
        b bVar = this.f4707b;
        long l5 = bVar.f4687h.l(bVar.f4686g);
        if (l5 >= 0) {
            this.f4707b.f4683d = SystemClock.uptimeMillis() + l5;
            if (this.f4707b.isVisible() && this.f4707b.f4682c) {
                b bVar2 = this.f4707b;
                if (!bVar2.f4692m) {
                    bVar2.f4681b.remove(this);
                    b bVar3 = this.f4707b;
                    bVar3.f4696q = bVar3.f4681b.schedule(this, l5, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.f4707b.f4688i.isEmpty() && this.f4707b.f4687h.a() == this.f4707b.f4687h.h() - 1) {
                b bVar4 = this.f4707b;
                k4.d dVar = bVar4.f4693n;
                int b5 = bVar4.f4687h.b();
                if (b5 != 0 && b5 >= bVar4.f4687h.f()) {
                    b5--;
                }
                dVar.sendEmptyMessageAtTime(b5, this.f4707b.f4683d);
            }
        } else {
            b bVar5 = this.f4707b;
            bVar5.f4683d = Long.MIN_VALUE;
            bVar5.f4682c = false;
        }
        if (!this.f4707b.isVisible() || this.f4707b.f4693n.hasMessages(-1)) {
            return;
        }
        this.f4707b.f4693n.sendEmptyMessageAtTime(-1, 0L);
    }
}
