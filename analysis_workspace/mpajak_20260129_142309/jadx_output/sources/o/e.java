package o;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import o.a;

/* loaded from: classes19.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    @ColorInt
    public int[] f4548a;

    /* renamed from: c, reason: collision with root package name */
    public final a.InterfaceC0058a f4550c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f4551d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f4552e;

    /* renamed from: f, reason: collision with root package name */
    public short[] f4553f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f4554g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f4555h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f4556i;

    /* renamed from: j, reason: collision with root package name */
    @ColorInt
    public int[] f4557j;

    /* renamed from: k, reason: collision with root package name */
    public int f4558k;

    /* renamed from: l, reason: collision with root package name */
    public c f4559l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f4560m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4561n;

    /* renamed from: o, reason: collision with root package name */
    public int f4562o;

    /* renamed from: p, reason: collision with root package name */
    public int f4563p;

    /* renamed from: q, reason: collision with root package name */
    public int f4564q;

    /* renamed from: r, reason: collision with root package name */
    public int f4565r;

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    public Boolean f4566s;

    /* renamed from: b, reason: collision with root package name */
    @ColorInt
    public final int[] f4549b = new int[256];

    /* renamed from: t, reason: collision with root package name */
    @NonNull
    public Bitmap.Config f4567t = Bitmap.Config.ARGB_8888;

    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList, java.util.List<o.b>] */
    public e(@NonNull a.InterfaceC0058a interfaceC0058a, c cVar, ByteBuffer byteBuffer, int i5) {
        this.f4550c = interfaceC0058a;
        this.f4559l = new c();
        synchronized (this) {
            if (i5 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i5);
            }
            int highestOneBit = Integer.highestOneBit(i5);
            this.f4562o = 0;
            this.f4559l = cVar;
            this.f4558k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f4551d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f4551d.order(ByteOrder.LITTLE_ENDIAN);
            this.f4561n = false;
            Iterator it = cVar.f4537e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((b) it.next()).f4528g == 3) {
                    this.f4561n = true;
                    break;
                }
            }
            this.f4563p = highestOneBit;
            int i6 = cVar.f4538f;
            this.f4565r = i6 / highestOneBit;
            int i7 = cVar.f4539g;
            this.f4564q = i7 / highestOneBit;
            this.f4556i = ((c0.b) this.f4550c).a(i6 * i7);
            a.InterfaceC0058a interfaceC0058a2 = this.f4550c;
            int i8 = this.f4565r * this.f4564q;
            s.b bVar = ((c0.b) interfaceC0058a2).f470b;
            this.f4557j = bVar == null ? new int[i8] : (int[]) bVar.b(i8, int[].class);
        }
    }

    @Override // o.a
    public final int a() {
        return this.f4558k;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList, java.util.List<o.b>] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList, java.util.List<o.b>] */
    @Override // o.a
    @Nullable
    public final synchronized Bitmap b() {
        if (this.f4559l.f4535c <= 0 || this.f4558k < 0) {
            if (Log.isLoggable("e", 3)) {
                Log.d("e", "Unable to decode frame, frameCount=" + this.f4559l.f4535c + ", framePointer=" + this.f4558k);
            }
            this.f4562o = 1;
        }
        int i5 = this.f4562o;
        if (i5 != 1 && i5 != 2) {
            this.f4562o = 0;
            if (this.f4552e == null) {
                this.f4552e = ((c0.b) this.f4550c).a(255);
            }
            b bVar = (b) this.f4559l.f4537e.get(this.f4558k);
            int i6 = this.f4558k - 1;
            b bVar2 = i6 >= 0 ? (b) this.f4559l.f4537e.get(i6) : null;
            int[] iArr = bVar.f4532k;
            if (iArr == null) {
                iArr = this.f4559l.f4533a;
            }
            this.f4548a = iArr;
            if (iArr == null) {
                if (Log.isLoggable("e", 3)) {
                    Log.d("e", "No valid color table found for frame #" + this.f4558k);
                }
                this.f4562o = 1;
                return null;
            }
            if (bVar.f4527f) {
                System.arraycopy(iArr, 0, this.f4549b, 0, iArr.length);
                int[] iArr2 = this.f4549b;
                this.f4548a = iArr2;
                iArr2[bVar.f4529h] = 0;
                if (bVar.f4528g == 2 && this.f4558k == 0) {
                    this.f4566s = Boolean.TRUE;
                }
            }
            return j(bVar, bVar2);
        }
        if (Log.isLoggable("e", 3)) {
            Log.d("e", "Unable to decode frame, status=" + this.f4562o);
        }
        return null;
    }

    @Override // o.a
    public final void c() {
        this.f4558k = (this.f4558k + 1) % this.f4559l.f4535c;
    }

    @Override // o.a
    public final void clear() {
        s.b bVar;
        s.b bVar2;
        s.b bVar3;
        this.f4559l = null;
        byte[] bArr = this.f4556i;
        if (bArr != null && (bVar3 = ((c0.b) this.f4550c).f470b) != null) {
            bVar3.put(bArr);
        }
        int[] iArr = this.f4557j;
        if (iArr != null && (bVar2 = ((c0.b) this.f4550c).f470b) != null) {
            bVar2.put(iArr);
        }
        Bitmap bitmap = this.f4560m;
        if (bitmap != null) {
            ((c0.b) this.f4550c).f469a.d(bitmap);
        }
        this.f4560m = null;
        this.f4551d = null;
        this.f4566s = null;
        byte[] bArr2 = this.f4552e;
        if (bArr2 == null || (bVar = ((c0.b) this.f4550c).f470b) == null) {
            return;
        }
        bVar.put(bArr2);
    }

    @Override // o.a
    public final int d() {
        return this.f4559l.f4535c;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<o.b>] */
    @Override // o.a
    public final int e() {
        int i5;
        c cVar = this.f4559l;
        int i6 = cVar.f4535c;
        if (i6 <= 0 || (i5 = this.f4558k) < 0) {
            return 0;
        }
        if (i5 < 0 || i5 >= i6) {
            return -1;
        }
        return ((b) cVar.f4537e.get(i5)).f4530i;
    }

    @Override // o.a
    public final int f() {
        return (this.f4557j.length * 4) + this.f4551d.limit() + this.f4556i.length;
    }

    @Override // o.a
    @NonNull
    public final ByteBuffer g() {
        return this.f4551d;
    }

    public final Bitmap h() {
        Boolean bool = this.f4566s;
        Bitmap.Config config = (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f4567t;
        Bitmap b5 = ((c0.b) this.f4550c).f469a.b(this.f4565r, this.f4564q, config);
        b5.setHasAlpha(true);
        return b5;
    }

    public final void i(@NonNull Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f4567t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if (r3.f4542j == r36.f4529h) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap j(o.b r36, o.b r37) {
        /*
            Method dump skipped, instructions count: 1081
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.e.j(o.b, o.b):android.graphics.Bitmap");
    }
}
