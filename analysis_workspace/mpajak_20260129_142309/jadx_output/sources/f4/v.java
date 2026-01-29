package f4;

import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes19.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public final byte[] f2894a;

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public int f2895b;

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public int f2896c;

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public boolean f2897d;

    /* renamed from: e, reason: collision with root package name */
    @JvmField
    public boolean f2898e;

    /* renamed from: f, reason: collision with root package name */
    @JvmField
    public v f2899f;

    /* renamed from: g, reason: collision with root package name */
    @JvmField
    public v f2900g;

    public v() {
        this.f2894a = new byte[8192];
        this.f2898e = true;
        this.f2897d = false;
    }

    public v(byte[] data, int i5, int i6, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f2894a = data;
        this.f2895b = i5;
        this.f2896c = i6;
        this.f2897d = z4;
        this.f2898e = z5;
    }

    public final v a() {
        v vVar = this.f2899f;
        if (vVar == this) {
            vVar = null;
        }
        v vVar2 = this.f2900g;
        Intrinsics.checkNotNull(vVar2);
        vVar2.f2899f = this.f2899f;
        v vVar3 = this.f2899f;
        Intrinsics.checkNotNull(vVar3);
        vVar3.f2900g = this.f2900g;
        this.f2899f = null;
        this.f2900g = null;
        return vVar;
    }

    public final v b(v segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f2900g = this;
        segment.f2899f = this.f2899f;
        v vVar = this.f2899f;
        Intrinsics.checkNotNull(vVar);
        vVar.f2900g = segment;
        this.f2899f = segment;
        return segment;
    }

    public final v c() {
        this.f2897d = true;
        return new v(this.f2894a, this.f2895b, this.f2896c, true, false);
    }

    public final void d(v sink, int i5) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.f2898e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i6 = sink.f2896c;
        int i7 = i6 + i5;
        if (i7 > 8192) {
            if (sink.f2897d) {
                throw new IllegalArgumentException();
            }
            int i8 = sink.f2895b;
            if (i7 - i8 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f2894a;
            ArraysKt___ArraysJvmKt.copyInto$default(bArr, bArr, 0, i8, i6, 2, (Object) null);
            sink.f2896c -= sink.f2895b;
            sink.f2895b = 0;
        }
        byte[] bArr2 = this.f2894a;
        byte[] bArr3 = sink.f2894a;
        int i9 = sink.f2896c;
        int i10 = this.f2895b;
        ArraysKt.copyInto(bArr2, bArr3, i9, i10, i10 + i5);
        sink.f2896c += i5;
        this.f2895b += i5;
    }
}
