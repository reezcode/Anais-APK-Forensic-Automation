package com.tencent.smtt.utils;

import java.io.UnsupportedEncodingException;

/* loaded from: classes8.dex */
public class Base64 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ boolean f2269a = true;

    /* loaded from: classes25.dex */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f2270a;

        /* renamed from: b, reason: collision with root package name */
        public int f2271b;
    }

    /* loaded from: classes2.dex */
    public static class b extends a {

        /* renamed from: c, reason: collision with root package name */
        private static final int[] f2272c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: d, reason: collision with root package name */
        private static final int[] f2273d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: e, reason: collision with root package name */
        private int f2274e;

        /* renamed from: f, reason: collision with root package name */
        private int f2275f;

        /* renamed from: g, reason: collision with root package name */
        private final int[] f2276g;

        public b(int i5, byte[] bArr) {
            this.f2270a = bArr;
            this.f2276g = (i5 & 8) == 0 ? f2272c : f2273d;
            this.f2274e = 0;
            this.f2275f = 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00fe, code lost:
        
            if (r5 != 4) goto L71;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(byte[] r17, int r18, int r19, boolean r20) {
            /*
                Method dump skipped, instructions count: 283
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.Base64.b.a(byte[], int, int, boolean):boolean");
        }
    }

    /* loaded from: classes9.dex */
    public static class c extends a {

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ boolean f2277g = true;

        /* renamed from: h, reason: collision with root package name */
        private static final byte[] f2278h = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: i, reason: collision with root package name */
        private static final byte[] f2279i = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: c, reason: collision with root package name */
        public int f2280c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f2281d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f2282e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f2283f;

        /* renamed from: j, reason: collision with root package name */
        private final byte[] f2284j;

        /* renamed from: k, reason: collision with root package name */
        private int f2285k;

        /* renamed from: l, reason: collision with root package name */
        private final byte[] f2286l;

        public c(int i5, byte[] bArr) {
            this.f2270a = bArr;
            this.f2281d = (i5 & 1) == 0;
            boolean z4 = (i5 & 2) == 0;
            this.f2282e = z4;
            this.f2283f = (i5 & 4) != 0;
            this.f2286l = (i5 & 8) == 0 ? f2278h : f2279i;
            this.f2284j = new byte[2];
            this.f2280c = 0;
            this.f2285k = z4 ? 19 : -1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00e6 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 513
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.Base64.c.a(byte[], int, int, boolean):boolean");
        }
    }

    private Base64() {
    }

    public static byte[] a(String str, int i5) {
        return a(str.getBytes(), i5);
    }

    public static byte[] a(byte[] bArr, int i5) {
        return a(bArr, 0, bArr.length, i5);
    }

    public static byte[] a(byte[] bArr, int i5, int i6, int i7) {
        b bVar = new b(i7, new byte[(i6 * 3) / 4]);
        if (!bVar.a(bArr, i5, i6, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i8 = bVar.f2271b;
        byte[] bArr2 = bVar.f2270a;
        if (i8 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i8];
        System.arraycopy(bArr2, 0, bArr3, 0, i8);
        return bArr3;
    }

    public static byte[] b(byte[] bArr, int i5) {
        return b(bArr, 0, bArr.length, i5);
    }

    public static byte[] b(byte[] bArr, int i5, int i6, int i7) {
        c cVar = new c(i7, null);
        int i8 = (i6 / 3) * 4;
        if (!cVar.f2281d) {
            int i9 = i6 % 3;
            if (i9 == 1) {
                i8 += 2;
            } else if (i9 == 2) {
                i8 += 3;
            }
        } else if (i6 % 3 > 0) {
            i8 += 4;
        }
        if (cVar.f2282e && i6 > 0) {
            i8 += (((i6 - 1) / 57) + 1) * (cVar.f2283f ? 2 : 1);
        }
        cVar.f2270a = new byte[i8];
        cVar.a(bArr, i5, i6, true);
        if (f2269a || cVar.f2271b == i8) {
            return cVar.f2270a;
        }
        throw new AssertionError();
    }

    public static String encodeToString(byte[] bArr, int i5) {
        try {
            return new String(b(bArr, i5), "US-ASCII");
        } catch (UnsupportedEncodingException e5) {
            throw new AssertionError(e5);
        }
    }
}
