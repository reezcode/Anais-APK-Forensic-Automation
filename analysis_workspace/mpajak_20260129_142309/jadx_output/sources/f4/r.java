package f4;

import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.AbstractList;

/* loaded from: classes20.dex */
public final class r extends AbstractList<i> implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final a f2883d = new a();

    /* renamed from: b, reason: collision with root package name */
    public final i[] f2884b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f2885c;

    /* loaded from: classes13.dex */
    public static final class a {
        public final void a(long j5, f fVar, int i5, List<? extends i> list, int i6, int i7, List<Integer> list2) {
            int i8;
            int i9;
            int i10;
            int i11;
            long j6;
            f fVar2;
            long j7;
            int i12 = i5;
            if (!(i6 < i7)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i13 = i6; i13 < i7; i13++) {
                if (!(list.get(i13).c() >= i12)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            i iVar = list.get(i6);
            i iVar2 = list.get(i7 - 1);
            if (i12 == iVar.c()) {
                int intValue = list2.get(i6).intValue();
                int i14 = i6 + 1;
                i iVar3 = list.get(i14);
                i8 = i14;
                i9 = intValue;
                iVar = iVar3;
            } else {
                i8 = i6;
                i9 = -1;
            }
            if (iVar.f(i12) == iVar2.f(i12)) {
                int min = Math.min(iVar.c(), iVar2.c());
                int i15 = 0;
                for (int i16 = i12; i16 < min && iVar.f(i16) == iVar2.f(i16); i16++) {
                    i15++;
                }
                long j8 = 4;
                long j9 = (fVar.f2852c / j8) + j5 + 2 + i15 + 1;
                fVar.I(-i15);
                fVar.I(i9);
                int i17 = i12 + i15;
                while (i12 < i17) {
                    fVar.I(iVar.f(i12) & 255);
                    i12++;
                }
                if (i8 + 1 == i7) {
                    if (!(i17 == list.get(i8).c())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    fVar.I(list2.get(i8).intValue());
                    return;
                } else {
                    f fVar3 = new f();
                    fVar.I(((int) ((fVar3.f2852c / j8) + j9)) * (-1));
                    a(j9, fVar3, i17, list, i8, i7, list2);
                    fVar.b0(fVar3);
                    return;
                }
            }
            int i18 = 1;
            for (int i19 = i8 + 1; i19 < i7; i19++) {
                if (list.get(i19 - 1).f(i12) != list.get(i19).f(i12)) {
                    i18++;
                }
            }
            long j10 = 4;
            long j11 = (i18 * 2) + (fVar.f2852c / j10) + j5 + 2;
            fVar.I(i18);
            fVar.I(i9);
            for (int i20 = i8; i20 < i7; i20++) {
                byte f5 = list.get(i20).f(i12);
                if (i20 == i8 || f5 != list.get(i20 - 1).f(i12)) {
                    fVar.I(f5 & 255);
                }
            }
            f fVar4 = new f();
            while (i8 < i7) {
                byte f6 = list.get(i8).f(i12);
                int i21 = i8 + 1;
                int i22 = i21;
                while (true) {
                    if (i22 >= i7) {
                        i10 = i7;
                        break;
                    } else {
                        if (f6 != list.get(i22).f(i12)) {
                            i10 = i22;
                            break;
                        }
                        i22++;
                    }
                }
                if (i21 == i10 && i12 + 1 == list.get(i8).c()) {
                    fVar.I(list2.get(i8).intValue());
                    i11 = i10;
                    j7 = j10;
                    j6 = j11;
                    fVar2 = fVar4;
                } else {
                    fVar.I(((int) ((fVar4.f2852c / j10) + j11)) * (-1));
                    i11 = i10;
                    j6 = j11;
                    fVar2 = fVar4;
                    j7 = j10;
                    a(j11, fVar4, i12 + 1, list, i8, i11, list2);
                }
                fVar4 = fVar2;
                i8 = i11;
                j10 = j7;
                j11 = j6;
            }
            fVar.b0(fVar4);
        }
    }

    public r(i[] iVarArr, int[] iArr) {
        this.f2884b = iVarArr;
        this.f2885c = iArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return super.contains((i) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i5) {
        return this.f2884b[i5];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.f2884b.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return super.indexOf((i) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return super.lastIndexOf((i) obj);
        }
        return -1;
    }
}
