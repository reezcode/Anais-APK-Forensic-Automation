package s0;

import android.os.Parcel;
import p0.l;

/* loaded from: classes15.dex */
public abstract class i extends c1.a implements h {
    public i() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // c1.a
    public final boolean d(int i5, Parcel parcel, Parcel parcel2) {
        if (i5 == 1) {
            y0.b bVar = new y0.b(((l) this).e());
            parcel2.writeNoException();
            int i6 = c1.b.f512a;
            parcel2.writeStrongBinder(bVar);
        } else {
            if (i5 != 2) {
                return false;
            }
            int i7 = ((l) this).f4642a;
            parcel2.writeNoException();
            parcel2.writeInt(i7);
        }
        return true;
    }
}
