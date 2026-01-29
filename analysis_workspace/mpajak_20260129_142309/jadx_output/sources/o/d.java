package o;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f4545b;

    /* renamed from: c, reason: collision with root package name */
    public c f4546c;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4544a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    public int f4547d = 0;

    public final boolean a() {
        return this.f4546c.f4534b != 0;
    }

    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.ArrayList, java.util.List<o.b>] */
    @NonNull
    public final c b() {
        if (this.f4545b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.f4546c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < 6; i5++) {
            sb.append((char) c());
        }
        if (sb.toString().startsWith("GIF")) {
            this.f4546c.f4538f = f();
            this.f4546c.f4539g = f();
            int c5 = c();
            c cVar = this.f4546c;
            cVar.f4540h = (c5 & 128) != 0;
            cVar.f4541i = (int) Math.pow(2.0d, (c5 & 7) + 1);
            this.f4546c.f4542j = c();
            c cVar2 = this.f4546c;
            c();
            Objects.requireNonNull(cVar2);
            if (this.f4546c.f4540h && !a()) {
                c cVar3 = this.f4546c;
                cVar3.f4533a = e(cVar3.f4541i);
                c cVar4 = this.f4546c;
                cVar4.f4543k = cVar4.f4533a[cVar4.f4542j];
            }
        } else {
            this.f4546c.f4534b = 1;
        }
        if (!a()) {
            boolean z4 = false;
            while (!z4 && !a() && this.f4546c.f4535c <= Integer.MAX_VALUE) {
                int c6 = c();
                if (c6 == 33) {
                    int c7 = c();
                    if (c7 != 1) {
                        if (c7 == 249) {
                            this.f4546c.f4536d = new b();
                            c();
                            int c8 = c();
                            b bVar = this.f4546c.f4536d;
                            int i6 = (c8 & 28) >> 2;
                            bVar.f4528g = i6;
                            if (i6 == 0) {
                                bVar.f4528g = 1;
                            }
                            bVar.f4527f = (c8 & 1) != 0;
                            int f5 = f();
                            if (f5 < 2) {
                                f5 = 10;
                            }
                            b bVar2 = this.f4546c.f4536d;
                            bVar2.f4530i = f5 * 10;
                            bVar2.f4529h = c();
                            c();
                        } else if (c7 != 254 && c7 == 255) {
                            d();
                            StringBuilder sb2 = new StringBuilder();
                            for (int i7 = 0; i7 < 11; i7++) {
                                sb2.append((char) this.f4544a[i7]);
                            }
                            if (sb2.toString().equals("NETSCAPE2.0")) {
                                do {
                                    d();
                                    byte[] bArr = this.f4544a;
                                    if (bArr[0] == 1) {
                                        byte b5 = bArr[1];
                                        byte b6 = bArr[2];
                                        Objects.requireNonNull(this.f4546c);
                                    }
                                    if (this.f4547d > 0) {
                                    }
                                } while (!a());
                            }
                        }
                    }
                    g();
                } else if (c6 == 44) {
                    c cVar5 = this.f4546c;
                    if (cVar5.f4536d == null) {
                        cVar5.f4536d = new b();
                    }
                    cVar5.f4536d.f4522a = f();
                    this.f4546c.f4536d.f4523b = f();
                    this.f4546c.f4536d.f4524c = f();
                    this.f4546c.f4536d.f4525d = f();
                    int c9 = c();
                    boolean z5 = (c9 & 128) != 0;
                    int pow = (int) Math.pow(2.0d, (c9 & 7) + 1);
                    b bVar3 = this.f4546c.f4536d;
                    bVar3.f4526e = (c9 & 64) != 0;
                    if (z5) {
                        bVar3.f4532k = e(pow);
                    } else {
                        bVar3.f4532k = null;
                    }
                    this.f4546c.f4536d.f4531j = this.f4545b.position();
                    c();
                    g();
                    if (!a()) {
                        c cVar6 = this.f4546c;
                        cVar6.f4535c++;
                        cVar6.f4537e.add(cVar6.f4536d);
                    }
                } else if (c6 != 59) {
                    this.f4546c.f4534b = 1;
                } else {
                    z4 = true;
                }
            }
            c cVar7 = this.f4546c;
            if (cVar7.f4535c < 0) {
                cVar7.f4534b = 1;
            }
        }
        return this.f4546c;
    }

    public final int c() {
        try {
            return this.f4545b.get() & 255;
        } catch (Exception unused) {
            this.f4546c.f4534b = 1;
            return 0;
        }
    }

    public final void d() {
        int c5 = c();
        this.f4547d = c5;
        if (c5 <= 0) {
            return;
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            try {
                i6 = this.f4547d;
                if (i5 >= i6) {
                    return;
                }
                i6 -= i5;
                this.f4545b.get(this.f4544a, i5, i6);
                i5 += i6;
            } catch (Exception e5) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i5 + " count: " + i6 + " blockSize: " + this.f4547d, e5);
                }
                this.f4546c.f4534b = 1;
                return;
            }
        }
    }

    @Nullable
    public final int[] e(int i5) {
        byte[] bArr = new byte[i5 * 3];
        int[] iArr = null;
        try {
            this.f4545b.get(bArr);
            iArr = new int[256];
            int i6 = 0;
            int i7 = 0;
            while (i6 < i5) {
                int i8 = i7 + 1;
                int i9 = i8 + 1;
                int i10 = i9 + 1;
                int i11 = i6 + 1;
                iArr[i6] = ((bArr[i7] & 255) << 16) | (-16777216) | ((bArr[i8] & 255) << 8) | (bArr[i9] & 255);
                i7 = i10;
                i6 = i11;
            }
        } catch (BufferUnderflowException e5) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e5);
            }
            this.f4546c.f4534b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.f4545b.getShort();
    }

    public final void g() {
        int c5;
        do {
            c5 = c();
            this.f4545b.position(Math.min(this.f4545b.position() + c5, this.f4545b.limit()));
        } while (c5 > 0);
    }
}
