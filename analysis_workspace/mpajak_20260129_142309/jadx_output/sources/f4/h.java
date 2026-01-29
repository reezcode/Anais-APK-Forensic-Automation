package f4;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes18.dex */
public interface h extends a0, ReadableByteChannel {
    boolean B();

    byte[] D(long j5);

    void F(f fVar, long j5);

    String O(long j5);

    void c0(long j5);

    i d(long j5);

    int g(r rVar);

    f h();

    long h0();

    String j0(Charset charset);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j5);

    String v();
}
