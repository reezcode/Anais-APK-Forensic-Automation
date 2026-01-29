package com.tencent.smtt.utils;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.UnknownFormatConversionException;

/* loaded from: classes10.dex */
public class e implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f2339a = {127, 'E', 'L', 'F', 0};

    /* renamed from: b, reason: collision with root package name */
    public final char[] f2340b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2341c;

    /* renamed from: d, reason: collision with root package name */
    public j[] f2342d;

    /* renamed from: e, reason: collision with root package name */
    public l[] f2343e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f2344f;

    /* renamed from: g, reason: collision with root package name */
    private final com.tencent.smtt.utils.c f2345g;

    /* renamed from: h, reason: collision with root package name */
    private final a f2346h;

    /* renamed from: i, reason: collision with root package name */
    private final k[] f2347i;

    /* renamed from: j, reason: collision with root package name */
    private byte[] f2348j;

    /* loaded from: classes16.dex */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public short f2349a;

        /* renamed from: b, reason: collision with root package name */
        public short f2350b;

        /* renamed from: c, reason: collision with root package name */
        public int f2351c;

        /* renamed from: d, reason: collision with root package name */
        public int f2352d;

        /* renamed from: e, reason: collision with root package name */
        public short f2353e;

        /* renamed from: f, reason: collision with root package name */
        public short f2354f;

        /* renamed from: g, reason: collision with root package name */
        public short f2355g;

        /* renamed from: h, reason: collision with root package name */
        public short f2356h;

        /* renamed from: i, reason: collision with root package name */
        public short f2357i;

        /* renamed from: j, reason: collision with root package name */
        public short f2358j;

        public abstract long a();

        public abstract long b();
    }

    /* loaded from: classes21.dex */
    public static class b extends a {

        /* renamed from: k, reason: collision with root package name */
        public int f2359k;

        /* renamed from: l, reason: collision with root package name */
        public int f2360l;

        /* renamed from: m, reason: collision with root package name */
        public int f2361m;

        @Override // com.tencent.smtt.utils.e.a
        public long a() {
            return this.f2361m;
        }

        @Override // com.tencent.smtt.utils.e.a
        public long b() {
            return this.f2360l;
        }
    }

    /* loaded from: classes23.dex */
    public static class c extends j {

        /* renamed from: a, reason: collision with root package name */
        public int f2362a;

        /* renamed from: b, reason: collision with root package name */
        public int f2363b;

        /* renamed from: c, reason: collision with root package name */
        public int f2364c;

        /* renamed from: d, reason: collision with root package name */
        public int f2365d;

        /* renamed from: e, reason: collision with root package name */
        public int f2366e;

        /* renamed from: f, reason: collision with root package name */
        public int f2367f;
    }

    /* loaded from: classes25.dex */
    public static class d extends k {

        /* renamed from: a, reason: collision with root package name */
        public int f2368a;

        /* renamed from: b, reason: collision with root package name */
        public int f2369b;

        /* renamed from: c, reason: collision with root package name */
        public int f2370c;

        /* renamed from: d, reason: collision with root package name */
        public int f2371d;

        /* renamed from: e, reason: collision with root package name */
        public int f2372e;

        /* renamed from: f, reason: collision with root package name */
        public int f2373f;

        @Override // com.tencent.smtt.utils.e.k
        public int a() {
            return this.f2371d;
        }

        @Override // com.tencent.smtt.utils.e.k
        public long b() {
            return this.f2370c;
        }
    }

    /* renamed from: com.tencent.smtt.utils.e$e, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0028e extends l {

        /* renamed from: a, reason: collision with root package name */
        public int f2374a;

        /* renamed from: b, reason: collision with root package name */
        public int f2375b;
    }

    /* loaded from: classes20.dex */
    public static class f extends a {

        /* renamed from: k, reason: collision with root package name */
        public long f2376k;

        /* renamed from: l, reason: collision with root package name */
        public long f2377l;

        /* renamed from: m, reason: collision with root package name */
        public long f2378m;

        @Override // com.tencent.smtt.utils.e.a
        public long a() {
            return this.f2378m;
        }

        @Override // com.tencent.smtt.utils.e.a
        public long b() {
            return this.f2377l;
        }
    }

    /* loaded from: classes14.dex */
    public static class g extends j {

        /* renamed from: a, reason: collision with root package name */
        public long f2379a;

        /* renamed from: b, reason: collision with root package name */
        public long f2380b;

        /* renamed from: c, reason: collision with root package name */
        public long f2381c;

        /* renamed from: d, reason: collision with root package name */
        public long f2382d;

        /* renamed from: e, reason: collision with root package name */
        public long f2383e;

        /* renamed from: f, reason: collision with root package name */
        public long f2384f;
    }

    /* loaded from: classes3.dex */
    public static class h extends k {

        /* renamed from: a, reason: collision with root package name */
        public long f2385a;

        /* renamed from: b, reason: collision with root package name */
        public long f2386b;

        /* renamed from: c, reason: collision with root package name */
        public long f2387c;

        /* renamed from: d, reason: collision with root package name */
        public long f2388d;

        /* renamed from: e, reason: collision with root package name */
        public long f2389e;

        /* renamed from: f, reason: collision with root package name */
        public long f2390f;

        @Override // com.tencent.smtt.utils.e.k
        public int a() {
            return (int) this.f2388d;
        }

        @Override // com.tencent.smtt.utils.e.k
        public long b() {
            return this.f2387c;
        }
    }

    /* loaded from: classes5.dex */
    public static class i extends l {

        /* renamed from: a, reason: collision with root package name */
        public long f2391a;

        /* renamed from: b, reason: collision with root package name */
        public long f2392b;
    }

    /* loaded from: classes24.dex */
    public static abstract class j {

        /* renamed from: g, reason: collision with root package name */
        public int f2393g;

        /* renamed from: h, reason: collision with root package name */
        public int f2394h;
    }

    /* loaded from: classes4.dex */
    public static abstract class k {

        /* renamed from: g, reason: collision with root package name */
        public int f2395g;

        /* renamed from: h, reason: collision with root package name */
        public int f2396h;

        /* renamed from: i, reason: collision with root package name */
        public int f2397i;

        /* renamed from: j, reason: collision with root package name */
        public int f2398j;

        public abstract int a();

        public abstract long b();
    }

    /* loaded from: classes15.dex */
    public static abstract class l {

        /* renamed from: c, reason: collision with root package name */
        public int f2399c;

        /* renamed from: d, reason: collision with root package name */
        public char f2400d;

        /* renamed from: e, reason: collision with root package name */
        public char f2401e;

        /* renamed from: f, reason: collision with root package name */
        public short f2402f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(File file) {
        b bVar;
        char[] cArr = new char[16];
        this.f2340b = cArr;
        com.tencent.smtt.utils.c cVar = new com.tencent.smtt.utils.c(file);
        this.f2345g = cVar;
        cVar.a(cArr);
        if (!a()) {
            throw new UnknownFormatConversionException("Invalid elf magic: " + file);
        }
        cVar.a(e());
        boolean d5 = d();
        if (d5) {
            f fVar = new f();
            fVar.f2349a = cVar.a();
            fVar.f2350b = cVar.a();
            fVar.f2351c = cVar.b();
            fVar.f2376k = cVar.c();
            fVar.f2377l = cVar.c();
            fVar.f2378m = cVar.c();
            bVar = fVar;
        } else {
            b bVar2 = new b();
            bVar2.f2349a = cVar.a();
            bVar2.f2350b = cVar.a();
            bVar2.f2351c = cVar.b();
            bVar2.f2359k = cVar.b();
            bVar2.f2360l = cVar.b();
            bVar2.f2361m = cVar.b();
            bVar = bVar2;
        }
        this.f2346h = bVar;
        a aVar = this.f2346h;
        aVar.f2352d = cVar.b();
        aVar.f2353e = cVar.a();
        aVar.f2354f = cVar.a();
        aVar.f2355g = cVar.a();
        aVar.f2356h = cVar.a();
        aVar.f2357i = cVar.a();
        aVar.f2358j = cVar.a();
        this.f2347i = new k[aVar.f2357i];
        for (int i5 = 0; i5 < aVar.f2357i; i5++) {
            cVar.a(aVar.a() + (aVar.f2356h * i5));
            if (d5) {
                h hVar = new h();
                hVar.f2395g = cVar.b();
                hVar.f2396h = cVar.b();
                hVar.f2385a = cVar.c();
                hVar.f2386b = cVar.c();
                hVar.f2387c = cVar.c();
                hVar.f2388d = cVar.c();
                hVar.f2397i = cVar.b();
                hVar.f2398j = cVar.b();
                hVar.f2389e = cVar.c();
                hVar.f2390f = cVar.c();
                this.f2347i[i5] = hVar;
            } else {
                d dVar = new d();
                dVar.f2395g = cVar.b();
                dVar.f2396h = cVar.b();
                dVar.f2368a = cVar.b();
                dVar.f2369b = cVar.b();
                dVar.f2370c = cVar.b();
                dVar.f2371d = cVar.b();
                dVar.f2397i = cVar.b();
                dVar.f2398j = cVar.b();
                dVar.f2372e = cVar.b();
                dVar.f2373f = cVar.b();
                this.f2347i[i5] = dVar;
            }
        }
        short s4 = aVar.f2358j;
        if (s4 > -1) {
            k[] kVarArr = this.f2347i;
            if (s4 < kVarArr.length) {
                k kVar = kVarArr[s4];
                if (kVar.f2396h != 3) {
                    StringBuilder g5 = androidx.activity.d.g("Wrong string section e_shstrndx=");
                    g5.append((int) aVar.f2358j);
                    throw new UnknownFormatConversionException(g5.toString());
                }
                this.f2348j = new byte[kVar.a()];
                cVar.a(kVar.b());
                cVar.a(this.f2348j);
                if (this.f2341c) {
                    f();
                    return;
                }
                return;
            }
        }
        StringBuilder g6 = androidx.activity.d.g("Invalid e_shstrndx=");
        g6.append((int) aVar.f2358j);
        throw new UnknownFormatConversionException(g6.toString());
    }

    public static boolean a(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            long readInt = randomAccessFile.readInt();
            randomAccessFile.close();
            return readInt == 2135247942;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static boolean b(File file) {
        StringBuilder sb;
        String str;
        if (!g() || !a(file)) {
            return true;
        }
        try {
            new e(file);
            return true;
        } catch (IOException e5) {
            Log.e("ELF", "checkElfFile IOException: " + e5);
            return false;
        } catch (UnknownFormatConversionException e6) {
            e = e6;
            sb = new StringBuilder();
            str = "checkElfFile UnknownFormatConversionException: ";
            sb.append(str);
            sb.append(e);
            Log.e("ELF", sb.toString());
            return true;
        } catch (Throwable th) {
            e = th;
            sb = new StringBuilder();
            str = "checkElfFile Throwable: ";
            sb.append(str);
            sb.append(e);
            Log.e("ELF", sb.toString());
            return true;
        }
    }

    private void f() {
        a aVar = this.f2346h;
        com.tencent.smtt.utils.c cVar = this.f2345g;
        boolean d5 = d();
        k a5 = a(".dynsym");
        if (a5 != null) {
            cVar.a(a5.b());
            int a6 = a5.a() / (d5 ? 24 : 16);
            this.f2343e = new l[a6];
            char[] cArr = new char[1];
            for (int i5 = 0; i5 < a6; i5++) {
                if (d5) {
                    i iVar = new i();
                    iVar.f2399c = cVar.b();
                    cVar.a(cArr);
                    iVar.f2400d = cArr[0];
                    cVar.a(cArr);
                    iVar.f2401e = cArr[0];
                    iVar.f2391a = cVar.c();
                    iVar.f2392b = cVar.c();
                    iVar.f2402f = cVar.a();
                    this.f2343e[i5] = iVar;
                } else {
                    C0028e c0028e = new C0028e();
                    c0028e.f2399c = cVar.b();
                    c0028e.f2374a = cVar.b();
                    c0028e.f2375b = cVar.b();
                    cVar.a(cArr);
                    c0028e.f2400d = cArr[0];
                    cVar.a(cArr);
                    c0028e.f2401e = cArr[0];
                    c0028e.f2402f = cVar.a();
                    this.f2343e[i5] = c0028e;
                }
            }
            k kVar = this.f2347i[a5.f2397i];
            cVar.a(kVar.b());
            byte[] bArr = new byte[kVar.a()];
            this.f2344f = bArr;
            cVar.a(bArr);
        }
        this.f2342d = new j[aVar.f2355g];
        for (int i6 = 0; i6 < aVar.f2355g; i6++) {
            cVar.a(aVar.b() + (aVar.f2354f * i6));
            if (d5) {
                g gVar = new g();
                gVar.f2393g = cVar.b();
                gVar.f2394h = cVar.b();
                gVar.f2379a = cVar.c();
                gVar.f2380b = cVar.c();
                gVar.f2381c = cVar.c();
                gVar.f2382d = cVar.c();
                gVar.f2383e = cVar.c();
                gVar.f2384f = cVar.c();
                this.f2342d[i6] = gVar;
            } else {
                c cVar2 = new c();
                cVar2.f2393g = cVar.b();
                cVar2.f2394h = cVar.b();
                cVar2.f2362a = cVar.b();
                cVar2.f2363b = cVar.b();
                cVar2.f2364c = cVar.b();
                cVar2.f2365d = cVar.b();
                cVar2.f2366e = cVar.b();
                cVar2.f2367f = cVar.b();
                this.f2342d[i6] = cVar2;
            }
        }
    }

    private static boolean g() {
        String property = System.getProperty("java.vm.version");
        return property != null && property.startsWith(ExifInterface.GPS_MEASUREMENT_2D);
    }

    public final k a(String str) {
        for (k kVar : this.f2347i) {
            if (str.equals(a(kVar.f2395g))) {
                return kVar;
            }
        }
        return null;
    }

    public final String a(int i5) {
        if (i5 == 0) {
            return "SHN_UNDEF";
        }
        int i6 = i5;
        while (true) {
            byte[] bArr = this.f2348j;
            if (bArr[i6] == 0) {
                return new String(bArr, i5, i6 - i5);
            }
            i6++;
        }
    }

    public final boolean a() {
        return this.f2340b[0] == f2339a[0];
    }

    public final char b() {
        return this.f2340b[4];
    }

    public final char c() {
        return this.f2340b[5];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2345g.close();
    }

    public final boolean d() {
        return b() == 2;
    }

    public final boolean e() {
        return c() == 1;
    }
}
