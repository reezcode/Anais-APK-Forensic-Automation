package o3;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class d<T> implements a<T> {
    private volatile /* synthetic */ Object _state;

    /* renamed from: a, reason: collision with root package name */
    public int f4572a;

    public d(Object obj) {
        this._state = obj;
    }

    @Override // o3.a
    public final void setValue(T t4) {
        int i5;
        if (t4 == null) {
            t4 = (T) p3.a.f4674a;
        }
        synchronized (this) {
            if (!Intrinsics.areEqual(this._state, t4)) {
                this._state = t4;
                int i6 = this.f4572a;
                if ((i6 & 1) == 0) {
                    int i7 = i6 + 1;
                    this.f4572a = i7;
                    Unit unit = Unit.INSTANCE;
                    while (true) {
                        synchronized (this) {
                            i5 = this.f4572a;
                            if (i5 == i7) {
                                break;
                            } else {
                                Unit unit2 = Unit.INSTANCE;
                            }
                        }
                        i7 = i5;
                    }
                    this.f4572a = i7 + 1;
                } else {
                    this.f4572a = i6 + 2;
                }
            }
        }
    }
}
