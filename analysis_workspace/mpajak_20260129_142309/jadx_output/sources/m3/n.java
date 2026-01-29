package m3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.JvmField;

/* loaded from: classes11.dex */
public class n {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4201b = AtomicIntegerFieldUpdater.newUpdater(n.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public final Throwable f4202a;

    public n(Throwable th) {
        this.f4202a = th;
        this._handled = 0;
    }

    public n(Throwable th, boolean z4) {
        this.f4202a = th;
        this._handled = z4 ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean a() {
        return this._handled;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f4202a + ']';
    }
}
