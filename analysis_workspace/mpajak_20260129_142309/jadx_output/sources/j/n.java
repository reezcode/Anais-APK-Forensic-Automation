package j;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes6.dex */
public class n implements s {

    /* renamed from: a, reason: collision with root package name */
    public final k[] f3379a;

    /* renamed from: b, reason: collision with root package name */
    public final k[] f3380b;

    /* renamed from: c, reason: collision with root package name */
    public final Class<?> f3381c;

    /* renamed from: d, reason: collision with root package name */
    public final m.g f3382d;

    /* renamed from: e, reason: collision with root package name */
    public ConcurrentMap<String, Object> f3383e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<String, k> f3384f;

    /* renamed from: g, reason: collision with root package name */
    public transient long[] f3385g;

    /* renamed from: h, reason: collision with root package name */
    public transient short[] f3386h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(i.i iVar, Class<?> cls, Type type) {
        this(iVar, m.g.c(cls, type, iVar.f3240i));
        Objects.requireNonNull(iVar);
    }

    public n(i.i iVar, m.g gVar) {
        Class<?> deserializeUsing;
        this.f3381c = gVar.f4102a;
        this.f3382d = gVar;
        m.c[] cVarArr = gVar.f4110i;
        this.f3380b = new k[cVarArr.length];
        int length = cVarArr.length;
        HashMap hashMap = null;
        for (int i5 = 0; i5 < length; i5++) {
            m.c cVar = gVar.f4110i[i5];
            Objects.requireNonNull(iVar);
            Class<?> cls = gVar.f4102a;
            Class<?> cls2 = cVar.f4065f;
            g.b c5 = cVar.c();
            k cVar2 = (((c5 == null || (deserializeUsing = c5.deserializeUsing()) == Void.class) ? null : deserializeUsing) == null && (cls2 == List.class || cls2 == ArrayList.class)) ? new c(cls, cVar) : new f(cls, cVar);
            this.f3380b[i5] = cVar2;
            for (String str : cVar.f4080u) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                hashMap.put(str, cVar2);
            }
        }
        this.f3384f = hashMap;
        m.c[] cVarArr2 = gVar.f4109h;
        this.f3379a = new k[cVarArr2.length];
        int length2 = cVarArr2.length;
        for (int i6 = 0; i6 < length2; i6++) {
            this.f3379a[i6] = i(gVar.f4109h[i6].f4061b, null);
        }
    }

    public static boolean k(int i5, int[] iArr) {
        if (iArr == null) {
            return false;
        }
        int i6 = i5 / 32;
        int i7 = i5 % 32;
        if (i6 < iArr.length) {
            if (((1 << i7) & iArr[i6]) != 0) {
                return true;
            }
        }
        return false;
    }

    public final Object b(i.a aVar, Type type) {
        Object newInstance;
        if ((type instanceof Class) && this.f3381c.isInterface()) {
            return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{(Class) type}, new f.e());
        }
        m.g gVar = this.f3382d;
        Constructor<?> constructor = gVar.f4104c;
        Object obj = null;
        if (constructor == null && gVar.f4106e == null) {
            return null;
        }
        Method method = gVar.f4106e;
        if (method != null && gVar.f4108g > 0) {
            return null;
        }
        try {
            if (gVar.f4108g == 0) {
                newInstance = constructor != null ? constructor.newInstance(new Object[0]) : method.invoke(null, new Object[0]);
            } else {
                i.h hVar = aVar.f3147h;
                if (hVar == null || hVar.f3221a == null) {
                    throw new f.d("can't create non-static inner class instance.");
                }
                if (!(type instanceof Class)) {
                    throw new f.d("can't create non-static inner class instance.");
                }
                String name = ((Class) type).getName();
                String substring = name.substring(0, name.lastIndexOf(36));
                Object obj2 = hVar.f3221a;
                String name2 = obj2.getClass().getName();
                if (!name2.equals(substring)) {
                    i.h hVar2 = hVar.f3222b;
                    if (hVar2 != null && hVar2.f3221a != null && (("java.util.ArrayList".equals(name2) || "java.util.List".equals(name2) || "java.util.Collection".equals(name2) || "java.util.Map".equals(name2) || "java.util.HashMap".equals(name2)) && hVar2.f3221a.getClass().getName().equals(substring))) {
                        obj = hVar2.f3221a;
                    }
                    obj2 = obj;
                }
                if (obj2 == null) {
                    throw new f.d("can't create non-static inner class instance.");
                }
                newInstance = constructor.newInstance(obj2);
            }
            if (aVar != null && aVar.f3146g.A(i.b.InitStringFieldAsEmpty)) {
                for (m.c cVar : this.f3382d.f4109h) {
                    if (cVar.f4065f == String.class) {
                        try {
                            Method method2 = cVar.f4062c;
                            if (method2 != null) {
                                method2.invoke(newInstance, "");
                            } else {
                                cVar.f4063d.set(newInstance, "");
                            }
                        } catch (Exception e5) {
                            throw new f.d(androidx.appcompat.view.a.g(this.f3381c, androidx.activity.d.g("create instance error, class ")), e5);
                        }
                    }
                }
            }
            return newInstance;
        } catch (f.d e6) {
            throw e6;
        } catch (Exception e7) {
            throw new f.d(androidx.appcompat.view.a.g(this.f3381c, androidx.activity.d.g("create instance error, class ")), e7);
        }
    }

    @Override // j.s
    public <T> T c(i.a aVar, Type type, Object obj) {
        return (T) f(aVar, type, obj, 0);
    }

    public final Object d(Map<String, Object> map, i.i iVar) {
        m.g gVar = this.f3382d;
        if (gVar.f4105d == null && gVar.f4106e == null) {
            Object b5 = b(null, this.f3381c);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                k n4 = n(key, null);
                if (n4 != null) {
                    n4.c(b5, m.j.c(value, n4.f3377a.f4066g, iVar));
                }
            }
            Method method = this.f3382d.f4107f;
            if (method == null) {
                return b5;
            }
            try {
                return method.invoke(b5, new Object[0]);
            } catch (Exception e5) {
                throw new f.d("build object error", e5);
            }
        }
        m.c[] cVarArr = gVar.f4109h;
        int length = cVarArr.length;
        Object[] objArr = new Object[length];
        for (int i5 = 0; i5 < length; i5++) {
            m.c cVar = cVarArr[i5];
            Object obj = map.get(cVar.f4061b);
            if (obj == null) {
                Class<?> cls = cVar.f4065f;
                if (cls == Integer.TYPE) {
                    obj = 0;
                } else if (cls == Long.TYPE) {
                    obj = 0L;
                } else if (cls == Short.TYPE) {
                    obj = (short) 0;
                } else if (cls == Byte.TYPE) {
                    obj = (byte) 0;
                } else if (cls == Float.TYPE) {
                    obj = Float.valueOf(0.0f);
                } else if (cls == Double.TYPE) {
                    obj = Double.valueOf(0.0d);
                } else if (cls == Character.TYPE) {
                    obj = '0';
                } else if (cls == Boolean.TYPE) {
                    obj = Boolean.FALSE;
                }
            }
            objArr[i5] = obj;
        }
        m.g gVar2 = this.f3382d;
        Constructor<?> constructor = gVar2.f4105d;
        if (constructor != null) {
            try {
                return constructor.newInstance(objArr);
            } catch (Exception e6) {
                StringBuilder g5 = androidx.activity.d.g("create instance error, ");
                g5.append(this.f3382d.f4105d.toGenericString());
                throw new f.d(g5.toString(), e6);
            }
        }
        Method method2 = gVar2.f4106e;
        if (method2 == null) {
            return null;
        }
        try {
            return method2.invoke(null, objArr);
        } catch (Exception e7) {
            StringBuilder g6 = androidx.activity.d.g("create factory method error, ");
            g6.append(this.f3382d.f4106e.toString());
            throw new f.d(g6.toString(), e7);
        }
    }

    @Override // j.s
    public int e() {
        return 12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x02b3, code lost:
    
        if (r12.A(i.b.AllowArbitraryCommas) != false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0716, code lost:
    
        throw new f.d("syntax error, unexpect token " + i.g.w(r12.q()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x04f3, code lost:
    
        r12.Q(16);
        r1 = r1;
        r3 = r3;
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x04f6, code lost:
    
        r2 = r14;
        r0 = r18;
        r5 = r19;
        r1 = r1;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x04c6, code lost:
    
        r12.y();
        r1 = r1;
        r3 = r3;
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x027e, code lost:
    
        if (r1 == (-2)) goto L207;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #14 {all -> 0x003f, blocks: (B:13:0x0034, B:18:0x0047, B:20:0x0052, B:22:0x0058, B:27:0x0062, B:34:0x0071, B:39:0x007d, B:41:0x0087, B:44:0x008e, B:46:0x0094, B:48:0x009b, B:51:0x00a5, B:61:0x00b2, B:63:0x00ba, B:66:0x00c4, B:68:0x00e5, B:69:0x00ed, B:70:0x0100, B:75:0x0106), top: B:11:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0406 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x040e A[Catch: all -> 0x0126, TryCatch #2 {all -> 0x0126, blocks: (B:557:0x011b, B:83:0x0131, B:88:0x0142, B:94:0x014e, B:99:0x028c, B:101:0x0296, B:438:0x02a2, B:105:0x02ad, B:121:0x02c3, B:123:0x02cd, B:125:0x02d9, B:127:0x0326, B:129:0x032f, B:134:0x033f, B:135:0x0346, B:136:0x02de, B:138:0x02e6, B:141:0x02ee, B:142:0x02f3, B:144:0x0323, B:145:0x02f8, B:148:0x0301, B:152:0x0307, B:155:0x030c, B:156:0x0312, B:159:0x031a, B:160:0x0347, B:161:0x0361, B:163:0x0364, B:165:0x036e, B:167:0x0378, B:169:0x038b, B:173:0x0394, B:175:0x039c, B:176:0x03ae, B:178:0x03b6, B:180:0x03ba, B:186:0x03c9, B:189:0x03d1, B:348:0x03f0, B:349:0x03f7, B:350:0x036a, B:355:0x0408, B:357:0x040e, B:358:0x0418, B:360:0x041e, B:448:0x0160, B:450:0x0164, B:457:0x0176, B:464:0x0188, B:469:0x0196, B:474:0x01a0, B:479:0x01aa, B:484:0x01b4, B:486:0x01ba, B:489:0x01c8, B:491:0x01d0, B:493:0x01d4, B:502:0x01ec, B:510:0x01ff, B:518:0x0212, B:524:0x0220, B:527:0x022a, B:533:0x023b, B:539:0x024c, B:545:0x025d, B:551:0x026e), top: B:556:0x011b }] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x041e A[Catch: all -> 0x0126, TRY_LEAVE, TryCatch #2 {all -> 0x0126, blocks: (B:557:0x011b, B:83:0x0131, B:88:0x0142, B:94:0x014e, B:99:0x028c, B:101:0x0296, B:438:0x02a2, B:105:0x02ad, B:121:0x02c3, B:123:0x02cd, B:125:0x02d9, B:127:0x0326, B:129:0x032f, B:134:0x033f, B:135:0x0346, B:136:0x02de, B:138:0x02e6, B:141:0x02ee, B:142:0x02f3, B:144:0x0323, B:145:0x02f8, B:148:0x0301, B:152:0x0307, B:155:0x030c, B:156:0x0312, B:159:0x031a, B:160:0x0347, B:161:0x0361, B:163:0x0364, B:165:0x036e, B:167:0x0378, B:169:0x038b, B:173:0x0394, B:175:0x039c, B:176:0x03ae, B:178:0x03b6, B:180:0x03ba, B:186:0x03c9, B:189:0x03d1, B:348:0x03f0, B:349:0x03f7, B:350:0x036a, B:355:0x0408, B:357:0x040e, B:358:0x0418, B:360:0x041e, B:448:0x0160, B:450:0x0164, B:457:0x0176, B:464:0x0188, B:469:0x0196, B:474:0x01a0, B:479:0x01aa, B:484:0x01b4, B:486:0x01ba, B:489:0x01c8, B:491:0x01d0, B:493:0x01d4, B:502:0x01ec, B:510:0x01ff, B:518:0x0212, B:524:0x0220, B:527:0x022a, B:533:0x023b, B:539:0x024c, B:545:0x025d, B:551:0x026e), top: B:556:0x011b }] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x04ed A[Catch: all -> 0x0723, TryCatch #1 {all -> 0x0723, blocks: (B:370:0x04dc, B:374:0x04ed, B:386:0x04f3, B:420:0x04ba, B:422:0x04d4), top: B:369:0x04dc }] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028c A[Catch: all -> 0x0126, TryCatch #2 {all -> 0x0126, blocks: (B:557:0x011b, B:83:0x0131, B:88:0x0142, B:94:0x014e, B:99:0x028c, B:101:0x0296, B:438:0x02a2, B:105:0x02ad, B:121:0x02c3, B:123:0x02cd, B:125:0x02d9, B:127:0x0326, B:129:0x032f, B:134:0x033f, B:135:0x0346, B:136:0x02de, B:138:0x02e6, B:141:0x02ee, B:142:0x02f3, B:144:0x0323, B:145:0x02f8, B:148:0x0301, B:152:0x0307, B:155:0x030c, B:156:0x0312, B:159:0x031a, B:160:0x0347, B:161:0x0361, B:163:0x0364, B:165:0x036e, B:167:0x0378, B:169:0x038b, B:173:0x0394, B:175:0x039c, B:176:0x03ae, B:178:0x03b6, B:180:0x03ba, B:186:0x03c9, B:189:0x03d1, B:348:0x03f0, B:349:0x03f7, B:350:0x036a, B:355:0x0408, B:357:0x040e, B:358:0x0418, B:360:0x041e, B:448:0x0160, B:450:0x0164, B:457:0x0176, B:464:0x0188, B:469:0x0196, B:474:0x01a0, B:479:0x01aa, B:484:0x01b4, B:486:0x01ba, B:489:0x01c8, B:491:0x01d0, B:493:0x01d4, B:502:0x01ec, B:510:0x01ff, B:518:0x0212, B:524:0x0220, B:527:0x022a, B:533:0x023b, B:539:0x024c, B:545:0x025d, B:551:0x026e), top: B:556:0x011b }] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r1v101 */
    /* JADX WARN: Type inference failed for: r1v120 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v35, types: [int] */
    /* JADX WARN: Type inference failed for: r1v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v0, types: [i.a] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [i.h] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v73 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v4, types: [j.k] */
    /* JADX WARN: Type inference failed for: r7v0, types: [i.h] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [i.h] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(i.a r29, java.lang.reflect.Type r30, java.lang.Object r31, int r32) {
        /*
            Method dump skipped, instructions count: 1857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n.f(i.a, java.lang.reflect.Type, java.lang.Object, int):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0123, code lost:
    
        r0.Q(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0126, code lost:
    
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(i.a r12, java.lang.reflect.Type r13) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n.g(i.a, java.lang.reflect.Type):java.lang.Object");
    }

    public final k h(String str) {
        return i(str, null);
    }

    public final k i(String str, int[] iArr) {
        if (str == null) {
            return null;
        }
        int i5 = 0;
        int length = this.f3380b.length - 1;
        while (i5 <= length) {
            int i6 = (i5 + length) >>> 1;
            int compareTo = this.f3380b[i6].f3377a.f4061b.compareTo(str);
            if (compareTo < 0) {
                i5 = i6 + 1;
            } else {
                if (compareTo <= 0) {
                    if (k(i6, iArr)) {
                        return null;
                    }
                    return this.f3380b[i6];
                }
                length = i6 - 1;
            }
        }
        Map<String, k> map = this.f3384f;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public final n j(i.i iVar, m.g gVar, String str) {
        g.d dVar = gVar.f4112k;
        if (dVar == null) {
            return null;
        }
        for (Class<?> cls : dVar.seeAlso()) {
            s c5 = iVar.c(cls);
            if (c5 instanceof n) {
                n nVar = (n) c5;
                m.g gVar2 = nVar.f3382d;
                if (gVar2.f4113l.equals(str)) {
                    return nVar;
                }
                n j5 = j(iVar, gVar2, str);
                if (j5 != null) {
                    return j5;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(i.a r22, java.lang.String r23, java.lang.Object r24, java.lang.reflect.Type r25, java.util.Map<java.lang.String, java.lang.Object> r26, int[] r27) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n.l(i.a, java.lang.String, java.lang.Object, java.lang.reflect.Type, java.util.Map, int[]):boolean");
    }

    public final Enum m(i.d dVar, char[] cArr, s sVar) {
        int binarySearch;
        g gVar = sVar instanceof g ? (g) sVar : null;
        if (gVar == null) {
            dVar.f3193n = -1;
            return null;
        }
        long K0 = dVar.K0(cArr);
        if (dVar.f3193n <= 0 || gVar.f3374b == null || (binarySearch = Arrays.binarySearch(gVar.f3376d, K0)) < 0) {
            return null;
        }
        return gVar.f3374b[binarySearch];
    }

    public final k n(String str, int[] iArr) {
        boolean z4;
        if (str == null) {
            return null;
        }
        k i5 = i(str, iArr);
        if (i5 == null) {
            long u4 = m.j.u(str);
            int i6 = 0;
            if (this.f3385g == null) {
                long[] jArr = new long[this.f3380b.length];
                int i7 = 0;
                while (true) {
                    k[] kVarArr = this.f3380b;
                    if (i7 >= kVarArr.length) {
                        break;
                    }
                    jArr[i7] = m.j.u(kVarArr[i7].f3377a.f4061b);
                    i7++;
                }
                Arrays.sort(jArr);
                this.f3385g = jArr;
            }
            int binarySearch = Arrays.binarySearch(this.f3385g, u4);
            if (binarySearch < 0) {
                z4 = str.startsWith("is");
                if (z4) {
                    binarySearch = Arrays.binarySearch(this.f3385g, m.j.u(str.substring(2)));
                }
            } else {
                z4 = false;
            }
            if (binarySearch >= 0) {
                if (this.f3386h == null) {
                    short[] sArr = new short[this.f3385g.length];
                    Arrays.fill(sArr, (short) -1);
                    while (true) {
                        k[] kVarArr2 = this.f3380b;
                        if (i6 >= kVarArr2.length) {
                            break;
                        }
                        int binarySearch2 = Arrays.binarySearch(this.f3385g, m.j.u(kVarArr2[i6].f3377a.f4061b));
                        if (binarySearch2 >= 0) {
                            sArr[binarySearch2] = (short) i6;
                        }
                        i6++;
                    }
                    this.f3386h = sArr;
                }
                short s4 = this.f3386h[binarySearch];
                if (s4 != -1 && !k(s4, iArr)) {
                    i5 = this.f3380b[s4];
                }
            }
            if (i5 != null) {
                m.c cVar = i5.f3377a;
                if ((cVar.f4070k & i.b.DisableFieldSmartMatch.f3178b) != 0) {
                    return null;
                }
                Class<?> cls = cVar.f4065f;
                if (z4 && cls != Boolean.TYPE && cls != Boolean.class) {
                    return null;
                }
            }
        }
        return i5;
    }
}
