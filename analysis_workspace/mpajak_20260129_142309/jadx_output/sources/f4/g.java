package f4;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes23.dex */
public interface g extends y, WritableByteChannel {
    g C(int i5);

    g G(byte[] bArr);

    g L();

    g X(i iVar);

    long b0(a0 a0Var);

    g d0(String str);

    g e0(long j5);

    @Override // f4.y, java.io.Flushable
    void flush();

    f h();

    g j(byte[] bArr, int i5, int i6);

    g k(long j5);

    g m();

    g o(int i5);

    g t(int i5);
}
