package j;

import java.lang.reflect.Type;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class g implements s {

    /* renamed from: a, reason: collision with root package name */
    public final Class<?> f3373a;

    /* renamed from: b, reason: collision with root package name */
    public final Enum[] f3374b;

    /* renamed from: c, reason: collision with root package name */
    public final Enum[] f3375c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f3376d;

    public g(Class<?> cls) {
        this.f3373a = cls;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.f3375c = enumArr;
        int length = enumArr.length;
        long[] jArr = new long[length];
        this.f3376d = new long[enumArr.length];
        int i5 = 0;
        while (true) {
            Enum[] enumArr2 = this.f3375c;
            if (i5 >= enumArr2.length) {
                break;
            }
            long j5 = -3750763034362895579L;
            for (int i6 = 0; i6 < enumArr2[i5].name().length(); i6++) {
                j5 = (j5 ^ r3.charAt(i6)) * 1099511628211L;
            }
            jArr[i5] = j5;
            this.f3376d[i5] = j5;
            i5++;
        }
        Arrays.sort(this.f3376d);
        this.f3374b = new Enum[this.f3375c.length];
        for (int i7 = 0; i7 < this.f3376d.length; i7++) {
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    break;
                }
                if (this.f3376d[i7] == jArr[i8]) {
                    this.f3374b[i7] = this.f3375c[i8];
                    break;
                }
                i8++;
            }
        }
    }

    @Override // j.s
    public final <T> T c(i.a aVar, Type type, Object obj) {
        try {
            i.c cVar = aVar.f3146g;
            int q4 = cVar.q();
            if (q4 == 2) {
                int I = cVar.I();
                cVar.Q(16);
                if (I >= 0) {
                    Object[] objArr = this.f3375c;
                    if (I <= objArr.length) {
                        return (T) objArr[I];
                    }
                }
                throw new f.d("parse enum " + this.f3373a.getName() + " error, value : " + I);
            }
            if (q4 == 4) {
                String k02 = cVar.k0();
                cVar.Q(16);
                if (k02.length() == 0) {
                    return null;
                }
                return (T) Enum.valueOf(this.f3373a, k02);
            }
            if (q4 == 8) {
                cVar.Q(16);
                return null;
            }
            throw new f.d("parse enum " + this.f3373a.getName() + " error, value : " + aVar.w(null));
        } catch (f.d e5) {
            throw e5;
        } catch (Exception e6) {
            throw new f.d(e6.getMessage(), e6);
        }
    }

    @Override // j.s
    public final int e() {
        return 2;
    }
}
