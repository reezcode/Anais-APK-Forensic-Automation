package i;

import j.k;
import j.l;
import j.n;
import j.s;
import j.w;
import java.io.Closeable;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import k.c0;
import k.c1;
import k.l0;

/* loaded from: classes24.dex */
public final class a implements Closeable {

    /* renamed from: p, reason: collision with root package name */
    public static final Set<Class<?>> f3140p = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Object f3141b;

    /* renamed from: c, reason: collision with root package name */
    public final j f3142c;

    /* renamed from: d, reason: collision with root package name */
    public i f3143d;

    /* renamed from: f, reason: collision with root package name */
    public SimpleDateFormat f3145f;

    /* renamed from: g, reason: collision with root package name */
    public final c f3146g;

    /* renamed from: h, reason: collision with root package name */
    public h f3147h;

    /* renamed from: i, reason: collision with root package name */
    public h[] f3148i;

    /* renamed from: k, reason: collision with root package name */
    public List<C0035a> f3150k;

    /* renamed from: e, reason: collision with root package name */
    public String f3144e = f.a.f2682f;

    /* renamed from: j, reason: collision with root package name */
    public int f3149j = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f3151l = 0;

    /* renamed from: m, reason: collision with root package name */
    public List<j.j> f3152m = null;

    /* renamed from: n, reason: collision with root package name */
    public List<j.i> f3153n = null;

    /* renamed from: o, reason: collision with root package name */
    public l f3154o = null;

    /* renamed from: i.a$a, reason: collision with other inner class name */
    /* loaded from: classes13.dex */
    public static class C0035a {

        /* renamed from: a, reason: collision with root package name */
        public final h f3155a;

        /* renamed from: b, reason: collision with root package name */
        public final String f3156b;

        /* renamed from: c, reason: collision with root package name */
        public k f3157c;

        /* renamed from: d, reason: collision with root package name */
        public h f3158d;

        public C0035a(h hVar, String str) {
            this.f3155a = hVar;
            this.f3156b = str;
        }
    }

    /* JADX WARN: Type inference failed for: r4v16, types: [java.util.HashSet, java.util.Set<java.lang.Class<?>>] */
    static {
        Class[] clsArr = {Boolean.TYPE, Byte.TYPE, Short.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE, Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class, BigInteger.class, BigDecimal.class, String.class};
        for (int i5 = 0; i5 < 17; i5++) {
            f3140p.add(clsArr[i5]);
        }
    }

    public a(Object obj, c cVar, i iVar) {
        d dVar;
        int i5;
        this.f3146g = cVar;
        this.f3141b = obj;
        this.f3143d = iVar;
        this.f3142c = iVar.f3234c;
        d dVar2 = (d) cVar;
        char c5 = dVar2.f3184e;
        if (c5 == '{') {
            ((f) cVar).next();
            dVar = (d) cVar;
            i5 = 12;
        } else if (c5 != '[') {
            dVar2.y();
            return;
        } else {
            ((f) cVar).next();
            dVar = (d) cVar;
            i5 = 14;
        }
        dVar.f3181b = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T A(Type type, Object obj) {
        int q4 = this.f3146g.q();
        if (q4 == 8) {
            this.f3146g.y();
            return null;
        }
        if (q4 == 4) {
            if (type == byte[].class) {
                T t4 = (T) this.f3146g.a0();
                this.f3146g.y();
                return t4;
            }
            if (type == char[].class) {
                String k02 = this.f3146g.k0();
                this.f3146g.y();
                return (T) k02.toCharArray();
            }
        }
        try {
            return (T) this.f3143d.c(type).c(this, type, obj);
        } catch (f.d e5) {
            throw e5;
        } catch (Throwable th) {
            throw new f.d(th.getMessage(), th);
        }
    }

    public final Object E(Map map) {
        return H(map, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:239:0x0227, code lost:
    
        r2.Q(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0232, code lost:
    
        if (r2.q() != 13) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0234, code lost:
    
        r2.Q(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0237, code lost:
    
        r14 = r13.f3143d.c(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x023f, code lost:
    
        if ((r14 instanceof j.n) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0241, code lost:
    
        r14 = (j.n) r14;
        r15 = r14.b(r13, r7);
        r0 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0253, code lost:
    
        if (r0.hasNext() == false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0255, code lost:
    
        r1 = (java.util.Map.Entry) r0.next();
        r2 = r1.getKey();
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0261, code lost:
    
        if ((r2 instanceof java.lang.String) == false) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0263, code lost:
    
        r2 = r14.i((java.lang.String) r2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x026a, code lost:
    
        if (r2 == null) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x026c, code lost:
    
        r2.c(r15, r1.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0275, code lost:
    
        if (r15 != null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0279, code lost:
    
        if (r7 != java.lang.Cloneable.class) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x027b, code lost:
    
        r15 = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0287, code lost:
    
        if ("java.util.Collections$EmptyMap".equals(r6) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0289, code lost:
    
        r15 = java.util.Collections.emptyMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x028e, code lost:
    
        r15 = r7.newInstance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0295, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0274, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0296, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x029e, code lost:
    
        throw new f.d("create instance error", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x029f, code lost:
    
        r13.f3151l = 2;
        r0 = r13.f3147h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x02a4, code lost:
    
        if (r0 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x02a6, code lost:
    
        if (r15 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x02aa, code lost:
    
        if ((r15 instanceof java.lang.Integer) != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x02b0, code lost:
    
        if ((r0.f3223c instanceof java.lang.Integer) != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x02b2, code lost:
    
        J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x02b9, code lost:
    
        if (r14.size() <= 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x02bb, code lost:
    
        r14 = m.j.b(r14, r7, r13.f3143d);
        I(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x02c7, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x02d5, code lost:
    
        return r13.f3143d.c(r7).c(r13, r7, r15);
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0409 A[Catch: all -> 0x0573, TryCatch #0 {all -> 0x0573, blocks: (B:18:0x0055, B:20:0x0059, B:22:0x0061, B:25:0x0074, B:29:0x008c, B:34:0x01d7, B:35:0x01dd, B:37:0x01e8, B:228:0x01f0, B:232:0x0204, B:234:0x0212, B:236:0x0220, B:239:0x0227, B:241:0x0234, B:243:0x0237, B:245:0x0241, B:246:0x024f, B:248:0x0255, B:251:0x0263, B:254:0x026c, B:263:0x027b, B:264:0x0281, B:266:0x0289, B:267:0x028e, B:272:0x0297, B:273:0x029e, B:274:0x029f, B:277:0x02a8, B:279:0x02ac, B:281:0x02b2, B:282:0x02b5, B:284:0x02bb, B:287:0x02c8, B:290:0x0217, B:43:0x02dc, B:46:0x02e4, B:48:0x02ee, B:50:0x02ff, B:52:0x0303, B:54:0x0309, B:57:0x030e, B:59:0x0312, B:60:0x0352, B:62:0x035a, B:65:0x0363, B:66:0x0368, B:69:0x0315, B:71:0x031d, B:73:0x0323, B:74:0x034c, B:75:0x034f, B:76:0x0329, B:79:0x0332, B:83:0x0338, B:86:0x033e, B:87:0x0347, B:88:0x0369, B:89:0x0387, B:91:0x038a, B:93:0x038e, B:95:0x0392, B:98:0x0398, B:102:0x03a0, B:221:0x03b2, B:223:0x03c1, B:225:0x03cc, B:226:0x03d2, B:116:0x03fb, B:118:0x0409, B:124:0x0412, B:127:0x0422, B:128:0x0440, B:113:0x03e2, B:115:0x03ec, B:129:0x03f1, B:200:0x0445, B:202:0x044f, B:203:0x0452, B:205:0x045d, B:206:0x0461, B:216:0x046c, B:208:0x0473, B:213:0x047d, B:214:0x0482, B:153:0x0487, B:155:0x048c, B:158:0x0495, B:160:0x04a2, B:161:0x04a8, B:164:0x04ae, B:165:0x04b1, B:167:0x04b9, B:169:0x04c8, B:172:0x04d0, B:174:0x04d4, B:175:0x04db, B:177:0x04e0, B:178:0x04e3, B:193:0x04eb, B:180:0x04f5, B:187:0x04ff, B:184:0x0504, B:190:0x0509, B:191:0x0523, B:139:0x0524, B:149:0x0537, B:141:0x053e, B:146:0x0548, B:147:0x0566, B:296:0x009d, B:297:0x00bb, B:361:0x00c0, B:363:0x00cb, B:365:0x00cf, B:367:0x00d3, B:370:0x00d9, B:302:0x00e8, B:304:0x00f0, B:308:0x0101, B:309:0x0119, B:311:0x011a, B:312:0x011f, B:321:0x0134, B:323:0x013a, B:325:0x0141, B:326:0x014a, B:330:0x0151, B:331:0x0169, B:332:0x0146, B:334:0x016a, B:335:0x0182, B:343:0x018c, B:345:0x0194, B:348:0x01a5, B:349:0x01c5, B:351:0x01c6, B:352:0x01cb, B:353:0x01cc, B:355:0x0567, B:356:0x056c, B:358:0x056d, B:359:0x0572), top: B:17:0x0055, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x040e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04c8 A[Catch: all -> 0x0573, TryCatch #0 {all -> 0x0573, blocks: (B:18:0x0055, B:20:0x0059, B:22:0x0061, B:25:0x0074, B:29:0x008c, B:34:0x01d7, B:35:0x01dd, B:37:0x01e8, B:228:0x01f0, B:232:0x0204, B:234:0x0212, B:236:0x0220, B:239:0x0227, B:241:0x0234, B:243:0x0237, B:245:0x0241, B:246:0x024f, B:248:0x0255, B:251:0x0263, B:254:0x026c, B:263:0x027b, B:264:0x0281, B:266:0x0289, B:267:0x028e, B:272:0x0297, B:273:0x029e, B:274:0x029f, B:277:0x02a8, B:279:0x02ac, B:281:0x02b2, B:282:0x02b5, B:284:0x02bb, B:287:0x02c8, B:290:0x0217, B:43:0x02dc, B:46:0x02e4, B:48:0x02ee, B:50:0x02ff, B:52:0x0303, B:54:0x0309, B:57:0x030e, B:59:0x0312, B:60:0x0352, B:62:0x035a, B:65:0x0363, B:66:0x0368, B:69:0x0315, B:71:0x031d, B:73:0x0323, B:74:0x034c, B:75:0x034f, B:76:0x0329, B:79:0x0332, B:83:0x0338, B:86:0x033e, B:87:0x0347, B:88:0x0369, B:89:0x0387, B:91:0x038a, B:93:0x038e, B:95:0x0392, B:98:0x0398, B:102:0x03a0, B:221:0x03b2, B:223:0x03c1, B:225:0x03cc, B:226:0x03d2, B:116:0x03fb, B:118:0x0409, B:124:0x0412, B:127:0x0422, B:128:0x0440, B:113:0x03e2, B:115:0x03ec, B:129:0x03f1, B:200:0x0445, B:202:0x044f, B:203:0x0452, B:205:0x045d, B:206:0x0461, B:216:0x046c, B:208:0x0473, B:213:0x047d, B:214:0x0482, B:153:0x0487, B:155:0x048c, B:158:0x0495, B:160:0x04a2, B:161:0x04a8, B:164:0x04ae, B:165:0x04b1, B:167:0x04b9, B:169:0x04c8, B:172:0x04d0, B:174:0x04d4, B:175:0x04db, B:177:0x04e0, B:178:0x04e3, B:193:0x04eb, B:180:0x04f5, B:187:0x04ff, B:184:0x0504, B:190:0x0509, B:191:0x0523, B:139:0x0524, B:149:0x0537, B:141:0x053e, B:146:0x0548, B:147:0x0566, B:296:0x009d, B:297:0x00bb, B:361:0x00c0, B:363:0x00cb, B:365:0x00cf, B:367:0x00d3, B:370:0x00d9, B:302:0x00e8, B:304:0x00f0, B:308:0x0101, B:309:0x0119, B:311:0x011a, B:312:0x011f, B:321:0x0134, B:323:0x013a, B:325:0x0141, B:326:0x014a, B:330:0x0151, B:331:0x0169, B:332:0x0146, B:334:0x016a, B:335:0x0182, B:343:0x018c, B:345:0x0194, B:348:0x01a5, B:349:0x01c5, B:351:0x01c6, B:352:0x01cb, B:353:0x01cc, B:355:0x0567, B:356:0x056c, B:358:0x056d, B:359:0x0572), top: B:17:0x0055, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04d4 A[Catch: all -> 0x0573, TryCatch #0 {all -> 0x0573, blocks: (B:18:0x0055, B:20:0x0059, B:22:0x0061, B:25:0x0074, B:29:0x008c, B:34:0x01d7, B:35:0x01dd, B:37:0x01e8, B:228:0x01f0, B:232:0x0204, B:234:0x0212, B:236:0x0220, B:239:0x0227, B:241:0x0234, B:243:0x0237, B:245:0x0241, B:246:0x024f, B:248:0x0255, B:251:0x0263, B:254:0x026c, B:263:0x027b, B:264:0x0281, B:266:0x0289, B:267:0x028e, B:272:0x0297, B:273:0x029e, B:274:0x029f, B:277:0x02a8, B:279:0x02ac, B:281:0x02b2, B:282:0x02b5, B:284:0x02bb, B:287:0x02c8, B:290:0x0217, B:43:0x02dc, B:46:0x02e4, B:48:0x02ee, B:50:0x02ff, B:52:0x0303, B:54:0x0309, B:57:0x030e, B:59:0x0312, B:60:0x0352, B:62:0x035a, B:65:0x0363, B:66:0x0368, B:69:0x0315, B:71:0x031d, B:73:0x0323, B:74:0x034c, B:75:0x034f, B:76:0x0329, B:79:0x0332, B:83:0x0338, B:86:0x033e, B:87:0x0347, B:88:0x0369, B:89:0x0387, B:91:0x038a, B:93:0x038e, B:95:0x0392, B:98:0x0398, B:102:0x03a0, B:221:0x03b2, B:223:0x03c1, B:225:0x03cc, B:226:0x03d2, B:116:0x03fb, B:118:0x0409, B:124:0x0412, B:127:0x0422, B:128:0x0440, B:113:0x03e2, B:115:0x03ec, B:129:0x03f1, B:200:0x0445, B:202:0x044f, B:203:0x0452, B:205:0x045d, B:206:0x0461, B:216:0x046c, B:208:0x0473, B:213:0x047d, B:214:0x0482, B:153:0x0487, B:155:0x048c, B:158:0x0495, B:160:0x04a2, B:161:0x04a8, B:164:0x04ae, B:165:0x04b1, B:167:0x04b9, B:169:0x04c8, B:172:0x04d0, B:174:0x04d4, B:175:0x04db, B:177:0x04e0, B:178:0x04e3, B:193:0x04eb, B:180:0x04f5, B:187:0x04ff, B:184:0x0504, B:190:0x0509, B:191:0x0523, B:139:0x0524, B:149:0x0537, B:141:0x053e, B:146:0x0548, B:147:0x0566, B:296:0x009d, B:297:0x00bb, B:361:0x00c0, B:363:0x00cb, B:365:0x00cf, B:367:0x00d3, B:370:0x00d9, B:302:0x00e8, B:304:0x00f0, B:308:0x0101, B:309:0x0119, B:311:0x011a, B:312:0x011f, B:321:0x0134, B:323:0x013a, B:325:0x0141, B:326:0x014a, B:330:0x0151, B:331:0x0169, B:332:0x0146, B:334:0x016a, B:335:0x0182, B:343:0x018c, B:345:0x0194, B:348:0x01a5, B:349:0x01c5, B:351:0x01c6, B:352:0x01cb, B:353:0x01cc, B:355:0x0567, B:356:0x056c, B:358:0x056d, B:359:0x0572), top: B:17:0x0055, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04e0 A[Catch: all -> 0x0573, TryCatch #0 {all -> 0x0573, blocks: (B:18:0x0055, B:20:0x0059, B:22:0x0061, B:25:0x0074, B:29:0x008c, B:34:0x01d7, B:35:0x01dd, B:37:0x01e8, B:228:0x01f0, B:232:0x0204, B:234:0x0212, B:236:0x0220, B:239:0x0227, B:241:0x0234, B:243:0x0237, B:245:0x0241, B:246:0x024f, B:248:0x0255, B:251:0x0263, B:254:0x026c, B:263:0x027b, B:264:0x0281, B:266:0x0289, B:267:0x028e, B:272:0x0297, B:273:0x029e, B:274:0x029f, B:277:0x02a8, B:279:0x02ac, B:281:0x02b2, B:282:0x02b5, B:284:0x02bb, B:287:0x02c8, B:290:0x0217, B:43:0x02dc, B:46:0x02e4, B:48:0x02ee, B:50:0x02ff, B:52:0x0303, B:54:0x0309, B:57:0x030e, B:59:0x0312, B:60:0x0352, B:62:0x035a, B:65:0x0363, B:66:0x0368, B:69:0x0315, B:71:0x031d, B:73:0x0323, B:74:0x034c, B:75:0x034f, B:76:0x0329, B:79:0x0332, B:83:0x0338, B:86:0x033e, B:87:0x0347, B:88:0x0369, B:89:0x0387, B:91:0x038a, B:93:0x038e, B:95:0x0392, B:98:0x0398, B:102:0x03a0, B:221:0x03b2, B:223:0x03c1, B:225:0x03cc, B:226:0x03d2, B:116:0x03fb, B:118:0x0409, B:124:0x0412, B:127:0x0422, B:128:0x0440, B:113:0x03e2, B:115:0x03ec, B:129:0x03f1, B:200:0x0445, B:202:0x044f, B:203:0x0452, B:205:0x045d, B:206:0x0461, B:216:0x046c, B:208:0x0473, B:213:0x047d, B:214:0x0482, B:153:0x0487, B:155:0x048c, B:158:0x0495, B:160:0x04a2, B:161:0x04a8, B:164:0x04ae, B:165:0x04b1, B:167:0x04b9, B:169:0x04c8, B:172:0x04d0, B:174:0x04d4, B:175:0x04db, B:177:0x04e0, B:178:0x04e3, B:193:0x04eb, B:180:0x04f5, B:187:0x04ff, B:184:0x0504, B:190:0x0509, B:191:0x0523, B:139:0x0524, B:149:0x0537, B:141:0x053e, B:146:0x0548, B:147:0x0566, B:296:0x009d, B:297:0x00bb, B:361:0x00c0, B:363:0x00cb, B:365:0x00cf, B:367:0x00d3, B:370:0x00d9, B:302:0x00e8, B:304:0x00f0, B:308:0x0101, B:309:0x0119, B:311:0x011a, B:312:0x011f, B:321:0x0134, B:323:0x013a, B:325:0x0141, B:326:0x014a, B:330:0x0151, B:331:0x0169, B:332:0x0146, B:334:0x016a, B:335:0x0182, B:343:0x018c, B:345:0x0194, B:348:0x01a5, B:349:0x01c5, B:351:0x01c6, B:352:0x01cb, B:353:0x01cc, B:355:0x0567, B:356:0x056c, B:358:0x056d, B:359:0x0572), top: B:17:0x0055, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04f5 A[Catch: all -> 0x0573, TRY_ENTER, TryCatch #0 {all -> 0x0573, blocks: (B:18:0x0055, B:20:0x0059, B:22:0x0061, B:25:0x0074, B:29:0x008c, B:34:0x01d7, B:35:0x01dd, B:37:0x01e8, B:228:0x01f0, B:232:0x0204, B:234:0x0212, B:236:0x0220, B:239:0x0227, B:241:0x0234, B:243:0x0237, B:245:0x0241, B:246:0x024f, B:248:0x0255, B:251:0x0263, B:254:0x026c, B:263:0x027b, B:264:0x0281, B:266:0x0289, B:267:0x028e, B:272:0x0297, B:273:0x029e, B:274:0x029f, B:277:0x02a8, B:279:0x02ac, B:281:0x02b2, B:282:0x02b5, B:284:0x02bb, B:287:0x02c8, B:290:0x0217, B:43:0x02dc, B:46:0x02e4, B:48:0x02ee, B:50:0x02ff, B:52:0x0303, B:54:0x0309, B:57:0x030e, B:59:0x0312, B:60:0x0352, B:62:0x035a, B:65:0x0363, B:66:0x0368, B:69:0x0315, B:71:0x031d, B:73:0x0323, B:74:0x034c, B:75:0x034f, B:76:0x0329, B:79:0x0332, B:83:0x0338, B:86:0x033e, B:87:0x0347, B:88:0x0369, B:89:0x0387, B:91:0x038a, B:93:0x038e, B:95:0x0392, B:98:0x0398, B:102:0x03a0, B:221:0x03b2, B:223:0x03c1, B:225:0x03cc, B:226:0x03d2, B:116:0x03fb, B:118:0x0409, B:124:0x0412, B:127:0x0422, B:128:0x0440, B:113:0x03e2, B:115:0x03ec, B:129:0x03f1, B:200:0x0445, B:202:0x044f, B:203:0x0452, B:205:0x045d, B:206:0x0461, B:216:0x046c, B:208:0x0473, B:213:0x047d, B:214:0x0482, B:153:0x0487, B:155:0x048c, B:158:0x0495, B:160:0x04a2, B:161:0x04a8, B:164:0x04ae, B:165:0x04b1, B:167:0x04b9, B:169:0x04c8, B:172:0x04d0, B:174:0x04d4, B:175:0x04db, B:177:0x04e0, B:178:0x04e3, B:193:0x04eb, B:180:0x04f5, B:187:0x04ff, B:184:0x0504, B:190:0x0509, B:191:0x0523, B:139:0x0524, B:149:0x0537, B:141:0x053e, B:146:0x0548, B:147:0x0566, B:296:0x009d, B:297:0x00bb, B:361:0x00c0, B:363:0x00cb, B:365:0x00cf, B:367:0x00d3, B:370:0x00d9, B:302:0x00e8, B:304:0x00f0, B:308:0x0101, B:309:0x0119, B:311:0x011a, B:312:0x011f, B:321:0x0134, B:323:0x013a, B:325:0x0141, B:326:0x014a, B:330:0x0151, B:331:0x0169, B:332:0x0146, B:334:0x016a, B:335:0x0182, B:343:0x018c, B:345:0x0194, B:348:0x01a5, B:349:0x01c5, B:351:0x01c6, B:352:0x01cb, B:353:0x01cc, B:355:0x0567, B:356:0x056c, B:358:0x056d, B:359:0x0572), top: B:17:0x0055, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d7 A[Catch: all -> 0x0573, TryCatch #0 {all -> 0x0573, blocks: (B:18:0x0055, B:20:0x0059, B:22:0x0061, B:25:0x0074, B:29:0x008c, B:34:0x01d7, B:35:0x01dd, B:37:0x01e8, B:228:0x01f0, B:232:0x0204, B:234:0x0212, B:236:0x0220, B:239:0x0227, B:241:0x0234, B:243:0x0237, B:245:0x0241, B:246:0x024f, B:248:0x0255, B:251:0x0263, B:254:0x026c, B:263:0x027b, B:264:0x0281, B:266:0x0289, B:267:0x028e, B:272:0x0297, B:273:0x029e, B:274:0x029f, B:277:0x02a8, B:279:0x02ac, B:281:0x02b2, B:282:0x02b5, B:284:0x02bb, B:287:0x02c8, B:290:0x0217, B:43:0x02dc, B:46:0x02e4, B:48:0x02ee, B:50:0x02ff, B:52:0x0303, B:54:0x0309, B:57:0x030e, B:59:0x0312, B:60:0x0352, B:62:0x035a, B:65:0x0363, B:66:0x0368, B:69:0x0315, B:71:0x031d, B:73:0x0323, B:74:0x034c, B:75:0x034f, B:76:0x0329, B:79:0x0332, B:83:0x0338, B:86:0x033e, B:87:0x0347, B:88:0x0369, B:89:0x0387, B:91:0x038a, B:93:0x038e, B:95:0x0392, B:98:0x0398, B:102:0x03a0, B:221:0x03b2, B:223:0x03c1, B:225:0x03cc, B:226:0x03d2, B:116:0x03fb, B:118:0x0409, B:124:0x0412, B:127:0x0422, B:128:0x0440, B:113:0x03e2, B:115:0x03ec, B:129:0x03f1, B:200:0x0445, B:202:0x044f, B:203:0x0452, B:205:0x045d, B:206:0x0461, B:216:0x046c, B:208:0x0473, B:213:0x047d, B:214:0x0482, B:153:0x0487, B:155:0x048c, B:158:0x0495, B:160:0x04a2, B:161:0x04a8, B:164:0x04ae, B:165:0x04b1, B:167:0x04b9, B:169:0x04c8, B:172:0x04d0, B:174:0x04d4, B:175:0x04db, B:177:0x04e0, B:178:0x04e3, B:193:0x04eb, B:180:0x04f5, B:187:0x04ff, B:184:0x0504, B:190:0x0509, B:191:0x0523, B:139:0x0524, B:149:0x0537, B:141:0x053e, B:146:0x0548, B:147:0x0566, B:296:0x009d, B:297:0x00bb, B:361:0x00c0, B:363:0x00cb, B:365:0x00cf, B:367:0x00d3, B:370:0x00d9, B:302:0x00e8, B:304:0x00f0, B:308:0x0101, B:309:0x0119, B:311:0x011a, B:312:0x011f, B:321:0x0134, B:323:0x013a, B:325:0x0141, B:326:0x014a, B:330:0x0151, B:331:0x0169, B:332:0x0146, B:334:0x016a, B:335:0x0182, B:343:0x018c, B:345:0x0194, B:348:0x01a5, B:349:0x01c5, B:351:0x01c6, B:352:0x01cb, B:353:0x01cc, B:355:0x0567, B:356:0x056c, B:358:0x056d, B:359:0x0572), top: B:17:0x0055, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x038a A[Catch: all -> 0x0573, TryCatch #0 {all -> 0x0573, blocks: (B:18:0x0055, B:20:0x0059, B:22:0x0061, B:25:0x0074, B:29:0x008c, B:34:0x01d7, B:35:0x01dd, B:37:0x01e8, B:228:0x01f0, B:232:0x0204, B:234:0x0212, B:236:0x0220, B:239:0x0227, B:241:0x0234, B:243:0x0237, B:245:0x0241, B:246:0x024f, B:248:0x0255, B:251:0x0263, B:254:0x026c, B:263:0x027b, B:264:0x0281, B:266:0x0289, B:267:0x028e, B:272:0x0297, B:273:0x029e, B:274:0x029f, B:277:0x02a8, B:279:0x02ac, B:281:0x02b2, B:282:0x02b5, B:284:0x02bb, B:287:0x02c8, B:290:0x0217, B:43:0x02dc, B:46:0x02e4, B:48:0x02ee, B:50:0x02ff, B:52:0x0303, B:54:0x0309, B:57:0x030e, B:59:0x0312, B:60:0x0352, B:62:0x035a, B:65:0x0363, B:66:0x0368, B:69:0x0315, B:71:0x031d, B:73:0x0323, B:74:0x034c, B:75:0x034f, B:76:0x0329, B:79:0x0332, B:83:0x0338, B:86:0x033e, B:87:0x0347, B:88:0x0369, B:89:0x0387, B:91:0x038a, B:93:0x038e, B:95:0x0392, B:98:0x0398, B:102:0x03a0, B:221:0x03b2, B:223:0x03c1, B:225:0x03cc, B:226:0x03d2, B:116:0x03fb, B:118:0x0409, B:124:0x0412, B:127:0x0422, B:128:0x0440, B:113:0x03e2, B:115:0x03ec, B:129:0x03f1, B:200:0x0445, B:202:0x044f, B:203:0x0452, B:205:0x045d, B:206:0x0461, B:216:0x046c, B:208:0x0473, B:213:0x047d, B:214:0x0482, B:153:0x0487, B:155:0x048c, B:158:0x0495, B:160:0x04a2, B:161:0x04a8, B:164:0x04ae, B:165:0x04b1, B:167:0x04b9, B:169:0x04c8, B:172:0x04d0, B:174:0x04d4, B:175:0x04db, B:177:0x04e0, B:178:0x04e3, B:193:0x04eb, B:180:0x04f5, B:187:0x04ff, B:184:0x0504, B:190:0x0509, B:191:0x0523, B:139:0x0524, B:149:0x0537, B:141:0x053e, B:146:0x0548, B:147:0x0566, B:296:0x009d, B:297:0x00bb, B:361:0x00c0, B:363:0x00cb, B:365:0x00cf, B:367:0x00d3, B:370:0x00d9, B:302:0x00e8, B:304:0x00f0, B:308:0x0101, B:309:0x0119, B:311:0x011a, B:312:0x011f, B:321:0x0134, B:323:0x013a, B:325:0x0141, B:326:0x014a, B:330:0x0151, B:331:0x0169, B:332:0x0146, B:334:0x016a, B:335:0x0182, B:343:0x018c, B:345:0x0194, B:348:0x01a5, B:349:0x01c5, B:351:0x01c6, B:352:0x01cb, B:353:0x01cc, B:355:0x0567, B:356:0x056c, B:358:0x056d, B:359:0x0572), top: B:17:0x0055, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(java.util.Map r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 1400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.H(java.util.Map, java.lang.Object):java.lang.Object");
    }

    public final void I(Object obj) {
        Object c5;
        Class<?> cls = obj.getClass();
        s c6 = this.f3143d.c(cls);
        n nVar = c6 instanceof n ? (n) c6 : null;
        if (this.f3146g.q() != 12 && this.f3146g.q() != 16) {
            StringBuilder g5 = androidx.activity.d.g("syntax error, expect {, actual ");
            g5.append(this.f3146g.Y());
            throw new f.d(g5.toString());
        }
        while (true) {
            String N = this.f3146g.N(this.f3142c);
            if (N == null) {
                if (this.f3146g.q() == 13) {
                    this.f3146g.Q(16);
                    return;
                } else if (this.f3146g.q() == 16 && this.f3146g.A(b.AllowArbitraryCommas)) {
                }
            }
            k i5 = nVar != null ? nVar.i(N, null) : null;
            if (i5 != null) {
                m.c cVar = i5.f3377a;
                Class<?> cls2 = cVar.f4065f;
                Type type = cVar.f4066g;
                if (cls2 == Integer.TYPE) {
                    this.f3146g.H();
                    c5 = c0.f3678a.c(this, type, null);
                } else if (cls2 == String.class) {
                    this.f3146g.H();
                    c5 = c1.f(this);
                } else if (cls2 == Long.TYPE) {
                    this.f3146g.H();
                    c5 = l0.f3727a.c(this, type, null);
                } else {
                    s b5 = this.f3143d.b(cls2, type);
                    c cVar2 = this.f3146g;
                    b5.e();
                    cVar2.H();
                    c5 = b5.c(this, type, null);
                }
                i5.c(obj, c5);
                if (this.f3146g.q() != 16 && this.f3146g.q() == 13) {
                    this.f3146g.Q(16);
                    return;
                }
            } else {
                if (!this.f3146g.A(b.IgnoreNotMatch)) {
                    StringBuilder g6 = androidx.activity.d.g("setter not found, class ");
                    g6.append(cls.getName());
                    g6.append(", property ");
                    g6.append(N);
                    throw new f.d(g6.toString());
                }
                this.f3146g.S();
                s();
                if (this.f3146g.q() == 13) {
                    this.f3146g.y();
                    return;
                }
            }
        }
    }

    public final void J() {
        if (this.f3146g.A(b.DisableCircularReferenceDetect)) {
            return;
        }
        this.f3147h = this.f3147h.f3222b;
        int i5 = this.f3149j;
        if (i5 <= 0) {
            return;
        }
        int i6 = i5 - 1;
        this.f3149j = i6;
        this.f3148i[i6] = null;
    }

    public final Object K(String str) {
        if (this.f3148i == null) {
            return null;
        }
        int i5 = 0;
        while (true) {
            h[] hVarArr = this.f3148i;
            if (i5 >= hVarArr.length || i5 >= this.f3149j) {
                break;
            }
            h hVar = hVarArr[i5];
            if (hVar.toString().equals(str)) {
                return hVar.f3221a;
            }
            i5++;
        }
        return null;
    }

    public final h M(h hVar, Object obj, Object obj2) {
        if (this.f3146g.A(b.DisableCircularReferenceDetect)) {
            return null;
        }
        h hVar2 = new h(hVar, obj, obj2);
        this.f3147h = hVar2;
        int i5 = this.f3149j;
        this.f3149j = i5 + 1;
        h[] hVarArr = this.f3148i;
        if (hVarArr == null) {
            this.f3148i = new h[8];
        } else if (i5 >= hVarArr.length) {
            h[] hVarArr2 = new h[(hVarArr.length * 3) / 2];
            System.arraycopy(hVarArr, 0, hVarArr2, 0, hVarArr.length);
            this.f3148i = hVarArr2;
        }
        this.f3148i[i5] = hVar2;
        return this.f3147h;
    }

    public final h N(Object obj, Object obj2) {
        if (this.f3146g.A(b.DisableCircularReferenceDetect)) {
            return null;
        }
        return M(this.f3147h, obj, obj2);
    }

    public final void P(h hVar) {
        if (this.f3146g.A(b.DisableCircularReferenceDetect)) {
            return;
        }
        this.f3147h = hVar;
    }

    public final void a(int i5) {
        c cVar = this.f3146g;
        if (cVar.q() == i5) {
            cVar.y();
            return;
        }
        StringBuilder g5 = androidx.activity.d.g("syntax error, expect ");
        g5.append(g.w(i5));
        g5.append(", actual ");
        g5.append(g.w(cVar.q()));
        throw new f.d(g5.toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<i.a$a>] */
    public final void b(C0035a c0035a) {
        if (this.f3150k == null) {
            this.f3150k = new ArrayList(2);
        }
        this.f3150k.add(c0035a);
    }

    public final void c(Collection collection) {
        if (this.f3151l == 1) {
            if (collection instanceof List) {
                int size = collection.size() - 1;
                C0035a p4 = p();
                p4.f3157c = new w(this, (List) collection, size);
                p4.f3158d = this.f3147h;
            } else {
                C0035a p5 = p();
                p5.f3157c = new w(collection);
                p5.f3158d = this.f3147h;
            }
            this.f3151l = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c cVar = this.f3146g;
        try {
            if (cVar.A(b.AutoCloseSource) && cVar.q() != 20) {
                throw new f.d("not close json text, token : " + g.w(cVar.q()));
            }
        } finally {
            cVar.close();
        }
    }

    public final void e(Map map, Object obj) {
        if (this.f3151l == 1) {
            w wVar = new w(map, obj);
            C0035a p4 = p();
            p4.f3157c = wVar;
            p4.f3158d = this.f3147h;
            this.f3151l = 0;
        }
    }

    public final i f() {
        return this.f3143d;
    }

    public final h l() {
        return this.f3147h;
    }

    public final DateFormat n() {
        if (this.f3145f == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.f3144e, this.f3146g.f0());
            this.f3145f = simpleDateFormat;
            simpleDateFormat.setTimeZone(this.f3146g.l0());
        }
        return this.f3145f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<i.a$a>] */
    public final C0035a p() {
        return (C0035a) this.f3150k.get(r0.size() - 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<i.a$a>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<i.a$a>] */
    public final void q(Object obj) {
        m.c cVar;
        ?? r02 = this.f3150k;
        if (r02 == 0) {
            return;
        }
        int size = r02.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0035a c0035a = (C0035a) this.f3150k.get(i5);
            String str = c0035a.f3156b;
            h hVar = c0035a.f3158d;
            Object obj2 = null;
            Object obj3 = hVar != null ? hVar.f3221a : null;
            if (str.startsWith("$")) {
                int i6 = 0;
                while (true) {
                    if (i6 >= this.f3149j) {
                        break;
                    }
                    if (str.equals(this.f3148i[i6].toString())) {
                        obj2 = this.f3148i[i6].f3221a;
                        break;
                    }
                    i6++;
                }
                if (obj2 == null) {
                    try {
                        obj2 = f.g.b(obj, str);
                    } catch (f.i unused) {
                    }
                }
            } else {
                obj2 = c0035a.f3155a.f3221a;
            }
            k kVar = c0035a.f3157c;
            if (kVar != null) {
                if (obj2 != null && obj2.getClass() == f.e.class && (cVar = kVar.f3377a) != null && !Map.class.isAssignableFrom(cVar.f4065f)) {
                    obj2 = f.g.b(this.f3148i[0].f3221a, str);
                }
                kVar.c(obj3, obj2);
            }
        }
    }

    public final boolean r(b bVar) {
        return this.f3146g.A(bVar);
    }

    public final Object s() {
        return w(null);
    }

    public final Object w(Object obj) {
        Collection hashSet;
        c cVar = this.f3146g;
        int q4 = cVar.q();
        if (q4 == 2) {
            Number f5 = cVar.f();
            cVar.y();
            return f5;
        }
        if (q4 == 3) {
            Number Z = cVar.Z(cVar.A(b.UseBigDecimal));
            cVar.y();
            return Z;
        }
        if (q4 == 4) {
            String k02 = cVar.k0();
            cVar.Q(16);
            if (cVar.A(b.AllowISO8601DateFormat)) {
                f fVar = new f(k02);
                try {
                    if (fVar.S0(true)) {
                        return fVar.f3190k.getTime();
                    }
                } finally {
                    fVar.close();
                }
            }
            return k02;
        }
        if (q4 == 12) {
            return H(new f.e(cVar.A(b.OrderedField)), obj);
        }
        if (q4 == 14) {
            f.b bVar = new f.b();
            y(bVar, obj);
            return cVar.A(b.UseObjectArray) ? bVar.toArray() : bVar;
        }
        if (q4 == 18) {
            if ("NaN".equals(cVar.k0())) {
                cVar.y();
                return null;
            }
            StringBuilder g5 = androidx.activity.d.g("syntax error, ");
            g5.append(cVar.c());
            throw new f.d(g5.toString());
        }
        if (q4 == 26) {
            byte[] a02 = cVar.a0();
            cVar.y();
            return a02;
        }
        switch (q4) {
            case 6:
                cVar.y();
                return Boolean.TRUE;
            case 7:
                cVar.y();
                return Boolean.FALSE;
            case 8:
                cVar.y();
                return null;
            case 9:
                cVar.Q(18);
                if (cVar.q() != 18) {
                    throw new f.d("syntax error");
                }
                cVar.Q(10);
                a(10);
                long longValue = cVar.f().longValue();
                a(2);
                a(11);
                return new Date(longValue);
            default:
                switch (q4) {
                    case 20:
                        if (cVar.n()) {
                            return null;
                        }
                        StringBuilder g6 = androidx.activity.d.g("unterminated json string, ");
                        g6.append(cVar.c());
                        throw new f.d(g6.toString());
                    case 21:
                        cVar.y();
                        hashSet = new HashSet();
                        break;
                    case 22:
                        cVar.y();
                        hashSet = new TreeSet();
                        break;
                    case 23:
                        cVar.y();
                        return null;
                    default:
                        StringBuilder g7 = androidx.activity.d.g("syntax error, ");
                        g7.append(cVar.c());
                        throw new f.d(g7.toString());
                }
                y(hashSet, obj);
                return hashSet;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055 A[Catch: all -> 0x00dd, LOOP:1: B:15:0x0055->B:17:0x005d, LOOP_START, TryCatch #0 {all -> 0x00dd, blocks: (B:13:0x0049, B:15:0x0055, B:17:0x005d, B:19:0x0063, B:22:0x0076, B:24:0x007b, B:25:0x00c8, B:27:0x00d0, B:32:0x0087, B:34:0x008f, B:35:0x00a6, B:36:0x009b, B:39:0x00a2, B:40:0x00aa, B:42:0x00b4, B:43:0x00c2, B:44:0x00ba), top: B:12:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[Catch: all -> 0x00dd, TRY_ENTER, TryCatch #0 {all -> 0x00dd, blocks: (B:13:0x0049, B:15:0x0055, B:17:0x005d, B:19:0x0063, B:22:0x0076, B:24:0x007b, B:25:0x00c8, B:27:0x00d0, B:32:0x0087, B:34:0x008f, B:35:0x00a6, B:36:0x009b, B:39:0x00a2, B:40:0x00aa, B:42:0x00b4, B:43:0x00c2, B:44:0x00ba), top: B:12:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(java.lang.reflect.Type r9, java.util.Collection r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.x(java.lang.reflect.Type, java.util.Collection, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd A[Catch: all -> 0x0104, TRY_LEAVE, TryCatch #0 {all -> 0x0104, blocks: (B:9:0x0028, B:11:0x0032, B:13:0x0038, B:15:0x003c, B:35:0x0066, B:36:0x00f1, B:38:0x00fd, B:43:0x006c, B:47:0x0073, B:49:0x0087, B:51:0x008c, B:52:0x0093, B:53:0x0094, B:54:0x00a8, B:55:0x00ac, B:56:0x00ed, B:57:0x00af, B:58:0x00b2, B:60:0x00c1, B:62:0x00cc, B:63:0x00d3, B:64:0x00d7, B:66:0x00df, B:67:0x00e4, B:68:0x00e9), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.util.Collection r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.y(java.util.Collection, java.lang.Object):void");
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList, java.util.List<j.i>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList, java.util.List<j.j>] */
    public final void z(Object obj, String str) {
        Type type;
        this.f3146g.S();
        ?? r5 = this.f3152m;
        if (r5 != 0) {
            Iterator it = r5.iterator();
            type = null;
            while (it.hasNext()) {
                type = ((j.j) it.next()).a();
            }
        } else {
            type = null;
        }
        if (type == null) {
            w(null);
        } else {
            A(type, null);
        }
        if (obj instanceof j.h) {
            ((j.h) obj).a();
            return;
        }
        ?? r4 = this.f3153n;
        if (r4 != 0) {
            Iterator it2 = r4.iterator();
            while (it2.hasNext()) {
                ((j.i) it2.next()).a();
            }
        }
        if (this.f3151l == 1) {
            this.f3151l = 0;
        }
    }
}
