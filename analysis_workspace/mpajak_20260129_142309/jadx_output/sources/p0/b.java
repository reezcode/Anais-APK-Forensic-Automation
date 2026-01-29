package p0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import s0.d;

/* loaded from: classes12.dex */
public final class b extends t0.a {
    public static final Parcelable.Creator<b> CREATOR = new j();

    /* renamed from: b, reason: collision with root package name */
    public final String f4627b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public final int f4628c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4629d;

    public b(String str, int i5, long j5) {
        this.f4627b = str;
        this.f4628c = i5;
        this.f4629d = j5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            String str = this.f4627b;
            if (((str != null && str.equals(bVar.f4627b)) || (this.f4627b == null && bVar.f4627b == null)) && j() == bVar.j()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4627b, Long.valueOf(j())});
    }

    public final long j() {
        long j5 = this.f4629d;
        return j5 == -1 ? this.f4628c : j5;
    }

    public final String toString() {
        d.a aVar = new d.a(this);
        aVar.a("name", this.f4627b);
        aVar.a("version", Long.valueOf(j()));
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int M = i.g.M(parcel, 20293);
        i.g.L(parcel, 1, this.f4627b);
        int i6 = this.f4628c;
        i.g.O(parcel, 2, 4);
        parcel.writeInt(i6);
        long j5 = j();
        i.g.O(parcel, 3, 8);
        parcel.writeLong(j5);
        i.g.N(parcel, M);
    }
}
