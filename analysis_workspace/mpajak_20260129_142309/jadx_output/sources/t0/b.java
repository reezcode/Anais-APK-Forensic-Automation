package t0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.d;
import androidx.core.internal.view.SupportMenu;

/* loaded from: classes2.dex */
public final class b {

    /* loaded from: classes11.dex */
    public static class a extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                r1 = 41
                int r1 = androidx.activity.d.b(r4, r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t0.b.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static <T extends Parcelable> T a(Parcel parcel, int i5, Parcelable.Creator<T> creator) {
        int e5 = e(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (e5 == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + e5);
        return createFromParcel;
    }

    public static String b(Parcel parcel, int i5) {
        int e5 = e(parcel, i5);
        int dataPosition = parcel.dataPosition();
        if (e5 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + e5);
        return readString;
    }

    public static void c(Parcel parcel, int i5) {
        if (parcel.dataPosition() == i5) {
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(i5);
        throw new a(sb.toString(), parcel);
    }

    public static int d(Parcel parcel, int i5) {
        h(parcel, i5, 4);
        return parcel.readInt();
    }

    public static int e(Parcel parcel, int i5) {
        return (i5 & SupportMenu.CATEGORY_MASK) != -65536 ? (i5 >> 16) & 65535 : parcel.readInt();
    }

    public static void f(Parcel parcel, int i5) {
        parcel.setDataPosition(parcel.dataPosition() + e(parcel, i5));
    }

    public static int g(Parcel parcel) {
        int readInt = parcel.readInt();
        int e5 = e(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if ((65535 & readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new a(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i5 = e5 + dataPosition;
        if (i5 >= dataPosition && i5 <= parcel.dataSize()) {
            return i5;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i5);
        throw new a(sb.toString(), parcel);
    }

    public static void h(Parcel parcel, int i5, int i6) {
        int e5 = e(parcel, i5);
        if (e5 == i6) {
            return;
        }
        String hexString = Integer.toHexString(e5);
        StringBuilder sb = new StringBuilder(d.b(hexString, 46));
        sb.append("Expected size ");
        sb.append(i6);
        sb.append(" got ");
        sb.append(e5);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }
}
