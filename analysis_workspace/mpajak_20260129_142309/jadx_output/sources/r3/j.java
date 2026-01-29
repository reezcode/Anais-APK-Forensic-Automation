package r3;

import kotlin.jvm.JvmField;
import m3.a0;

/* loaded from: classes23.dex */
public final class j extends g {

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public final Runnable f5067d;

    public j(Runnable runnable, long j5, h hVar) {
        super(j5, hVar);
        this.f5067d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f5067d.run();
        } finally {
            this.f5065c.a();
        }
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("Task[");
        g5.append(a0.a(this.f5067d));
        g5.append('@');
        g5.append(a0.b(this.f5067d));
        g5.append(", ");
        g5.append(this.f5064b);
        g5.append(", ");
        g5.append(this.f5065c);
        g5.append(']');
        return g5.toString();
    }
}
