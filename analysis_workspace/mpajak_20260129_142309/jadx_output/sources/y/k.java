package y;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.view.InputDeviceCompat;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes22.dex */
public final class k implements ImageHeaderParser {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f5984a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f5985b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* loaded from: classes16.dex */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f5986a;

        public a(ByteBuffer byteBuffer) {
            this.f5986a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // y.k.c
        public final short a() {
            if (this.f5986a.remaining() >= 1) {
                return (short) (this.f5986a.get() & 255);
            }
            throw new c.a();
        }

        @Override // y.k.c
        public final int b() {
            return (a() << 8) | a();
        }

        @Override // y.k.c
        public final long skip(long j5) {
            int min = (int) Math.min(this.f5986a.remaining(), j5);
            ByteBuffer byteBuffer = this.f5986a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* loaded from: classes14.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f5987a;

        public b(byte[] bArr, int i5) {
            this.f5987a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i5);
        }

        public final short a(int i5) {
            if (this.f5987a.remaining() - i5 >= 2) {
                return this.f5987a.getShort(i5);
            }
            return (short) -1;
        }

        public final int b(int i5) {
            if (this.f5987a.remaining() - i5 >= 4) {
                return this.f5987a.getInt(i5);
            }
            return -1;
        }
    }

    /* loaded from: classes16.dex */
    public interface c {

        /* loaded from: classes6.dex */
        public static final class a extends IOException {
            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        short a();

        int b();

        long skip(long j5);
    }

    /* loaded from: classes15.dex */
    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public final InputStream f5988a;

        public d(InputStream inputStream) {
            this.f5988a = inputStream;
        }

        @Override // y.k.c
        public final short a() {
            int read = this.f5988a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }

        @Override // y.k.c
        public final int b() {
            return (a() << 8) | a();
        }

        public final int c(byte[] bArr, int i5) {
            int i6 = 0;
            int i7 = 0;
            while (i6 < i5 && (i7 = this.f5988a.read(bArr, i6, i5 - i6)) != -1) {
                i6 += i7;
            }
            if (i6 == 0 && i7 == -1) {
                throw new c.a();
            }
            return i6;
        }

        @Override // y.k.c
        public final long skip(long j5) {
            if (j5 < 0) {
                return 0L;
            }
            long j6 = j5;
            while (j6 > 0) {
                long skip = this.f5988a.skip(j6);
                if (skip <= 0) {
                    if (this.f5988a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j6 -= skip;
            }
            return j5 - j6;
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public final ImageHeaderParser.ImageType a(@NonNull ByteBuffer byteBuffer) {
        Objects.requireNonNull(byteBuffer, "Argument must not be null");
        return d(new a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int b(@NonNull InputStream inputStream, @NonNull s.b bVar) {
        String str;
        Objects.requireNonNull(inputStream, "Argument must not be null");
        d dVar = new d(inputStream);
        Objects.requireNonNull(bVar, "Argument must not be null");
        try {
            int b5 = dVar.b();
            if ((b5 & 65496) == 65496 || b5 == 19789 || b5 == 18761) {
                int e5 = e(dVar);
                if (e5 != -1) {
                    byte[] bArr = (byte[]) bVar.b(e5, byte[].class);
                    try {
                        int f5 = f(dVar, bArr, e5);
                        bVar.put(bArr);
                        return f5;
                    } catch (Throwable th) {
                        bVar.put(bArr);
                        throw th;
                    }
                }
                if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                }
                str = "Failed to parse exif segment length, or exif segment not found";
            } else {
                if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                }
                str = "Parser doesn't handle magic number: " + b5;
            }
            Log.d("DfltImageHeaderParser", str);
            return -1;
        } catch (c.a unused) {
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public final ImageHeaderParser.ImageType c(@NonNull InputStream inputStream) {
        Objects.requireNonNull(inputStream, "Argument must not be null");
        return d(new d(inputStream));
    }

    @NonNull
    public final ImageHeaderParser.ImageType d(c cVar) {
        try {
            int b5 = cVar.b();
            if (b5 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int a5 = (b5 << 8) | cVar.a();
            if (a5 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int a6 = (a5 << 8) | cVar.a();
            if (a6 == -1991225785) {
                cVar.skip(21L);
                try {
                    return cVar.a() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (a6 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            cVar.skip(4L);
            if (((cVar.b() << 16) | cVar.b()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int b6 = (cVar.b() << 16) | cVar.b();
            if ((b6 & InputDeviceCompat.SOURCE_ANY) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i5 = b6 & 255;
            if (i5 == 88) {
                cVar.skip(4L);
                return (cVar.a() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i5 != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            cVar.skip(4L);
            return (cVar.a() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public final int e(c cVar) {
        short a5;
        int b5;
        long j5;
        long skip;
        do {
            d dVar = (d) cVar;
            short a6 = dVar.a();
            if (a6 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) a6));
                }
                return -1;
            }
            a5 = dVar.a();
            if (a5 == 218) {
                return -1;
            }
            if (a5 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            b5 = dVar.b() - 2;
            if (a5 == 225) {
                return b5;
            }
            j5 = b5;
            skip = dVar.skip(j5);
        } while (skip == j5);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) a5) + ", wanted to skip: " + b5 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    public final int f(c cVar, byte[] bArr, int i5) {
        ByteOrder byteOrder;
        StringBuilder sb;
        String str;
        String sb2;
        int c5 = ((d) cVar).c(bArr, i5);
        if (c5 != i5) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i5 + ", actually read: " + c5);
            }
            return -1;
        }
        boolean z4 = bArr != null && i5 > f5984a.length;
        if (z4) {
            int i6 = 0;
            while (true) {
                byte[] bArr2 = f5984a;
                if (i6 >= bArr2.length) {
                    break;
                }
                if (bArr[i6] != bArr2[i6]) {
                    z4 = false;
                    break;
                }
                i6++;
            }
        }
        if (!z4) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        b bVar = new b(bArr, i5);
        short a5 = bVar.a(6);
        if (a5 != 18761) {
            if (a5 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) a5));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.f5987a.order(byteOrder);
        int b5 = bVar.b(10) + 6;
        short a6 = bVar.a(b5);
        for (int i7 = 0; i7 < a6; i7++) {
            int i8 = (i7 * 12) + b5 + 2;
            short a7 = bVar.a(i8);
            if (a7 == 274) {
                short a8 = bVar.a(i8 + 2);
                if (a8 >= 1 && a8 <= 12) {
                    int b6 = bVar.b(i8 + 4);
                    if (b6 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i7 + " tagType=" + ((int) a7) + " formatCode=" + ((int) a8) + " componentCount=" + b6);
                        }
                        int i9 = b6 + f5985b[a8];
                        if (i9 <= 4) {
                            int i10 = i8 + 8;
                            if (i10 >= 0 && i10 <= bVar.f5987a.remaining()) {
                                if (i9 >= 0 && i9 + i10 <= bVar.f5987a.remaining()) {
                                    return bVar.a(i10);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    sb2 = androidx.appcompat.widget.a.g("Illegal number of bytes for TI tag data tagType=", a7);
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                sb2 = androidx.activity.d.d("Illegal tagValueOffset=", i10, " tagType=", a7);
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            sb = new StringBuilder();
                            str = "Got byte count > 4, not orientation, continuing, formatCode=";
                            sb.append(str);
                            sb.append((int) a8);
                            sb2 = sb.toString();
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        sb2 = "Negative tiff component count";
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    sb = new StringBuilder();
                    str = "Got invalid format code = ";
                    sb.append(str);
                    sb.append((int) a8);
                    sb2 = sb.toString();
                }
                Log.d("DfltImageHeaderParser", sb2);
            }
        }
        return -1;
    }
}
