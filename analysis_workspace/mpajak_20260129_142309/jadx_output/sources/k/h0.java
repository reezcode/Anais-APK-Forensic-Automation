package k;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class h0 extends z0 implements q0 {

    /* renamed from: i, reason: collision with root package name */
    public final z[] f3697i;

    /* renamed from: j, reason: collision with root package name */
    public final z[] f3698j;

    /* renamed from: k, reason: collision with root package name */
    public w0 f3699k;

    /* renamed from: l, reason: collision with root package name */
    public volatile transient long[] f3700l;

    /* renamed from: m, reason: collision with root package name */
    public volatile transient short[] f3701m;

    public h0(Class<?> cls) {
        this(m.j.a(cls, false));
    }

    public h0(w0 w0Var) {
        z[] zVarArr;
        this.f3699k = w0Var;
        this.f3698j = new z[w0Var.f3756f.length];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            zVarArr = this.f3698j;
            if (i6 >= zVarArr.length) {
                break;
            }
            zVarArr[i6] = new z(w0Var.f3751a, w0Var.f3756f[i6]);
            i6++;
        }
        m.c[] cVarArr = w0Var.f3755e;
        if (cVarArr == w0Var.f3756f) {
            this.f3697i = zVarArr;
            return;
        }
        this.f3697i = new z[cVarArr.length];
        while (true) {
            z[] zVarArr2 = this.f3697i;
            if (i5 >= zVarArr2.length) {
                return;
            }
            zVarArr2[i5] = j(w0Var.f3755e[i5].f4061b);
            i5++;
        }
    }

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        m(g0Var, obj, obj2, type, i5, false);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<k.i0>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<k.i0>] */
    public final boolean i(g0 g0Var, String str) {
        ?? r22 = g0Var.f3794g;
        if (r22 != 0) {
            Iterator it = r22.iterator();
            while (it.hasNext()) {
                if (!((i0) it.next()).apply()) {
                    return false;
                }
            }
        }
        ?? r23 = this.f3794g;
        if (r23 == 0) {
            return true;
        }
        Iterator it2 = r23.iterator();
        while (it2.hasNext()) {
            if (!((i0) it2.next()).apply()) {
                return false;
            }
        }
        return true;
    }

    public final z j(String str) {
        if (str == null) {
            return null;
        }
        int i5 = 0;
        int length = this.f3698j.length - 1;
        while (i5 <= length) {
            int i6 = (i5 + length) >>> 1;
            int compareTo = this.f3698j[i6].f3772b.f4061b.compareTo(str);
            if (compareTo < 0) {
                i5 = i6 + 1;
            } else {
                if (compareTo <= 0) {
                    return this.f3698j[i6];
                }
                length = i6 - 1;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.Object r16, java.lang.String r17, long r18) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.k(java.lang.Object, java.lang.String, long):java.lang.Object");
    }

    public final List<Object> l(Object obj) {
        ArrayList arrayList = new ArrayList(this.f3698j.length);
        for (z zVar : this.f3698j) {
            arrayList.add(zVar.a(obj));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01bf, code lost:
    
        if ((r27.f3699k.f3757g & r3) == 0) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0328, code lost:
    
        if (r0 == false) goto L257;
     */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0307 A[Catch: Exception -> 0x0335, all -> 0x038d, TryCatch #4 {Exception -> 0x0335, blocks: (B:97:0x0195, B:100:0x019d, B:102:0x01a1, B:108:0x01ad, B:110:0x01b1, B:112:0x01ba, B:114:0x01c1, B:116:0x01c7, B:118:0x01cb, B:121:0x01d6, B:123:0x01da, B:125:0x01de, B:128:0x01e9, B:130:0x01ed, B:132:0x01f1, B:135:0x01fc, B:137:0x0200, B:139:0x0204, B:142:0x0212, B:144:0x0216, B:146:0x021a, B:149:0x0227, B:151:0x022b, B:153:0x022f, B:156:0x023d, B:158:0x0241, B:160:0x0245, B:164:0x0251, B:166:0x0255, B:168:0x0259, B:170:0x0265, B:172:0x0270, B:176:0x0279, B:177:0x0284, B:179:0x02f6, B:181:0x02fa, B:183:0x02fe, B:191:0x0307, B:193:0x0311, B:194:0x0319, B:196:0x031f, B:207:0x0281, B:209:0x028a, B:212:0x0290, B:213:0x0298, B:215:0x029d, B:218:0x02a5, B:221:0x02af, B:223:0x02b8, B:226:0x02be, B:227:0x02c2, B:228:0x02c8, B:230:0x02cf, B:231:0x02d4, B:232:0x02d9, B:234:0x02de, B:236:0x02e2, B:240:0x02ee, B:241:0x02f2, B:269:0x0334), top: B:96:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03bd A[Catch: all -> 0x03f5, TryCatch #0 {all -> 0x03f5, blocks: (B:246:0x039b, B:248:0x03bd, B:249:0x03d1, B:251:0x03d7, B:252:0x03ef, B:253:0x03f4), top: B:245:0x039b }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03d7 A[Catch: all -> 0x03f5, TryCatch #0 {all -> 0x03f5, blocks: (B:246:0x039b, B:248:0x03bd, B:249:0x03d1, B:251:0x03d7, B:252:0x03ef, B:253:0x03f4), top: B:245:0x039b }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0383 A[Catch: all -> 0x038d, Exception -> 0x0391, TRY_LEAVE, TryCatch #6 {all -> 0x038d, blocks: (B:97:0x0195, B:100:0x019d, B:102:0x01a1, B:108:0x01ad, B:110:0x01b1, B:112:0x01ba, B:114:0x01c1, B:116:0x01c7, B:118:0x01cb, B:121:0x01d6, B:123:0x01da, B:125:0x01de, B:128:0x01e9, B:130:0x01ed, B:132:0x01f1, B:135:0x01fc, B:137:0x0200, B:139:0x0204, B:142:0x0212, B:144:0x0216, B:146:0x021a, B:149:0x0227, B:151:0x022b, B:153:0x022f, B:156:0x023d, B:158:0x0241, B:160:0x0245, B:164:0x0251, B:166:0x0255, B:168:0x0259, B:170:0x0265, B:172:0x0270, B:176:0x0279, B:177:0x0284, B:179:0x02f6, B:181:0x02fa, B:183:0x02fe, B:191:0x0307, B:193:0x0311, B:194:0x0319, B:196:0x031f, B:207:0x0281, B:209:0x028a, B:212:0x0290, B:213:0x0298, B:215:0x029d, B:218:0x02a5, B:221:0x02af, B:223:0x02b8, B:226:0x02be, B:227:0x02c2, B:228:0x02c8, B:230:0x02cf, B:231:0x02d4, B:232:0x02d9, B:234:0x02de, B:236:0x02e2, B:240:0x02ee, B:241:0x02f2, B:269:0x0334, B:279:0x036b, B:281:0x0373, B:283:0x037b, B:285:0x0383), top: B:96:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(k.g0 r28, java.lang.Object r29, java.lang.Object r30, java.lang.reflect.Type r31, int r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 1017
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.m(k.g0, java.lang.Object, java.lang.Object, java.lang.reflect.Type, int, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<k.c>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<k.c>] */
    public final char n(g0 g0Var, Object obj, char c5) {
        ?? r02 = g0Var.f3789b;
        if (r02 != 0) {
            Iterator it = r02.iterator();
            while (it.hasNext()) {
                c5 = ((c) it.next()).e(g0Var, obj, c5);
            }
        }
        ?? r03 = this.f3789b;
        if (r03 != 0) {
            Iterator it2 = r03.iterator();
            while (it2.hasNext()) {
                c5 = ((c) it2.next()).e(g0Var, obj, c5);
            }
        }
        return c5;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<k.k>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<k.k>] */
    public final char o(g0 g0Var, Object obj, char c5) {
        ?? r02 = g0Var.f3788a;
        if (r02 != 0) {
            Iterator it = r02.iterator();
            while (it.hasNext()) {
                c5 = ((k) it.next()).e(g0Var, obj, c5);
            }
        }
        ?? r03 = this.f3788a;
        if (r03 != 0) {
            Iterator it2 = r03.iterator();
            while (it2.hasNext()) {
                c5 = ((k) it2.next()).e(g0Var, obj, c5);
            }
        }
        return c5;
    }

    public final void p(g0 g0Var, String str, Object obj) {
        if (str == null) {
            str = g0Var.f3688i.f3768c;
        }
        g0Var.f3689j.q(str);
        String str2 = this.f3699k.f3752b;
        if (str2 == null) {
            Class<?> cls = obj.getClass();
            if (m.j.N(cls)) {
                cls = cls.getSuperclass();
            }
            str2 = cls.getName();
        }
        g0Var.r(str2);
    }

    public final void q(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        m(g0Var, obj, obj2, type, i5, false);
    }
}
