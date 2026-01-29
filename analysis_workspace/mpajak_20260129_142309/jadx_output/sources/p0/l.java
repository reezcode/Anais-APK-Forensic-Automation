package p0;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes21.dex */
public abstract class l extends s0.i {

    /* renamed from: a, reason: collision with root package name */
    public int f4642a;

    public l(byte[] bArr) {
        s0.e.a(bArr.length == 25);
        this.f4642a = Arrays.hashCode(bArr);
    }

    public static byte[] f(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e5) {
            throw new AssertionError(e5);
        }
    }

    @Override // s0.h
    public final y0.a b() {
        return new y0.b(e());
    }

    @Override // s0.h
    public final int c() {
        return this.f4642a;
    }

    public abstract byte[] e();

    public final boolean equals(Object obj) {
        y0.a b5;
        if (obj != null && (obj instanceof s0.h)) {
            try {
                s0.h hVar = (s0.h) obj;
                if (hVar.c() == this.f4642a && (b5 = hVar.b()) != null) {
                    return Arrays.equals(e(), (byte[]) y0.b.e(b5));
                }
                return false;
            } catch (RemoteException e5) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e5);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4642a;
    }
}
