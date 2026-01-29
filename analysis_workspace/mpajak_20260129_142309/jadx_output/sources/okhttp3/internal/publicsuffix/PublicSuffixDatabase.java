package okhttp3.internal.publicsuffix;

import com.tencent.smtt.sdk.ProxyConfig;
import d1.d;
import f4.b0;
import f4.h;
import f4.n;
import f4.p;
import f4.q;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.apache.commons.io.FilenameUtils;
import t3.c;

/* loaded from: classes22.dex */
public final class PublicSuffixDatabase {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f4577a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f4578b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f4579c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f4580d;

    /* renamed from: h, reason: collision with root package name */
    public static final a f4576h = new a();

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f4573e = {(byte) 42};

    /* renamed from: f, reason: collision with root package name */
    public static final List<String> f4574f = CollectionsKt.listOf(ProxyConfig.MATCH_ALL_SCHEMES);

    /* renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f4575g = new PublicSuffixDatabase();

    /* loaded from: classes2.dex */
    public static final class a {
        public static final String a(byte[] bArr, byte[][] bArr2, int i5) {
            int i6;
            boolean z4;
            int i7;
            int i8;
            a aVar = PublicSuffixDatabase.f4576h;
            int length = bArr.length;
            int i9 = 0;
            while (i9 < length) {
                int i10 = (i9 + length) / 2;
                while (i10 > -1 && bArr[i10] != ((byte) 10)) {
                    i10--;
                }
                int i11 = i10 + 1;
                int i12 = 1;
                while (true) {
                    i6 = i11 + i12;
                    if (bArr[i6] == ((byte) 10)) {
                        break;
                    }
                    i12++;
                }
                int i13 = i6 - i11;
                int i14 = i5;
                boolean z5 = false;
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    if (z5) {
                        i7 = 46;
                        z4 = false;
                    } else {
                        byte b5 = bArr2[i14][i15];
                        byte[] bArr3 = c.f5449a;
                        int i17 = b5 & 255;
                        z4 = z5;
                        i7 = i17;
                    }
                    byte b6 = bArr[i11 + i16];
                    byte[] bArr4 = c.f5449a;
                    i8 = i7 - (b6 & 255);
                    if (i8 != 0) {
                        break;
                    }
                    i16++;
                    i15++;
                    if (i16 == i13) {
                        break;
                    }
                    if (bArr2[i14].length != i15) {
                        z5 = z4;
                    } else {
                        if (i14 == bArr2.length - 1) {
                            break;
                        }
                        i14++;
                        z5 = true;
                        i15 = -1;
                    }
                }
                if (i8 >= 0) {
                    if (i8 <= 0) {
                        int i18 = i13 - i16;
                        int length2 = bArr2[i14].length - i15;
                        int length3 = bArr2.length;
                        for (int i19 = i14 + 1; i19 < length3; i19++) {
                            length2 += bArr2[i19].length;
                        }
                        if (length2 >= i18) {
                            if (length2 <= i18) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                                return new String(bArr, i11, i13, UTF_8);
                            }
                        }
                    }
                    i9 = i6 + 1;
                }
                length = i11 - 1;
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r1 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010c, code lost:
    
        r5 = kotlin.text.StringsKt__StringsKt.split$default(r8, new char[]{org.apache.commons.io.FilenameUtils.EXTENSION_SEPARATOR}, false, 0, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011d, code lost:
    
        r1 = kotlin.text.StringsKt__StringsKt.split$default(r11, new char[]{org.apache.commons.io.FilenameUtils.EXTENSION_SEPARATOR}, false, 0, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x003a, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0038, code lost:
    
        if (r1 == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String):java.lang.String");
    }

    public final void b() {
        InputStream source = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (source == null) {
            return;
        }
        Logger logger = q.f2882a;
        Intrinsics.checkNotNullParameter(source, "$this$source");
        h e5 = d.e(new n(new p(source, new b0())));
        try {
            byte[] D = e5.D(e5.readInt());
            byte[] D2 = e5.D(e5.readInt());
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(e5, null);
            synchronized (this) {
                Intrinsics.checkNotNull(D);
                this.f4579c = D;
                Intrinsics.checkNotNull(D2);
                this.f4580d = D2;
            }
            this.f4578b.countDown();
        } finally {
        }
    }

    public final List<String> c(String str) {
        List<String> split$default;
        List<String> dropLast;
        split$default = StringsKt__StringsKt.split$default(str, new char[]{FilenameUtils.EXTENSION_SEPARATOR}, false, 0, 6, (Object) null);
        if (!Intrinsics.areEqual((String) CollectionsKt.last((List) split$default), "")) {
            return split$default;
        }
        dropLast = CollectionsKt___CollectionsKt.dropLast(split$default, 1);
        return dropLast;
    }
}
