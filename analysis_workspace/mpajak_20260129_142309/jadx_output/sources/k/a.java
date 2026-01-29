package k;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.smtt.sdk.TbsListener;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes23.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f3611c = m.b.f(g0.class);

    /* renamed from: d, reason: collision with root package name */
    public static final String f3612d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f3613e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f3614f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f3615g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f3616h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f3617i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f3618j;

    /* renamed from: a, reason: collision with root package name */
    public final m.a f3619a = new m.a();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f3620b = new AtomicLong();

    /* renamed from: k.a$a, reason: collision with other inner class name */
    /* loaded from: classes19.dex */
    public static class C0040a {

        /* renamed from: a, reason: collision with root package name */
        public final m.c[] f3621a;

        /* renamed from: b, reason: collision with root package name */
        public final String f3622b;

        /* renamed from: c, reason: collision with root package name */
        public final w0 f3623c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f3624d;

        /* renamed from: e, reason: collision with root package name */
        public Map<String, Integer> f3625e = new HashMap();

        /* renamed from: f, reason: collision with root package name */
        public int f3626f = 9;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f3627g;

        public C0040a(m.c[] cVarArr, w0 w0Var, String str, boolean z4, boolean z5) {
            this.f3621a = cVarArr;
            this.f3622b = str;
            this.f3623c = w0Var;
            this.f3624d = z4;
            this.f3627g = z5 || w0Var.f3751a.isEnum();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
        public final int a(String str) {
            if (((Integer) this.f3625e.get(str)) == null) {
                ?? r02 = this.f3625e;
                int i5 = this.f3626f;
                this.f3626f = i5 + 1;
                r02.put(str, Integer.valueOf(i5));
            }
            return ((Integer) this.f3625e.get(str)).intValue();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
        public final int b(String str) {
            if (((Integer) this.f3625e.get(str)) == null) {
                this.f3625e.put(str, Integer.valueOf(this.f3626f));
                this.f3626f += 2;
            }
            return ((Integer) this.f3625e.get(str)).intValue();
        }
    }

    static {
        String f5 = m.b.f(q0.class);
        f3612d = f5;
        f3613e = androidx.appcompat.widget.a.j("L", f5, ";");
        String f6 = m.b.f(a1.class);
        f3614f = f6;
        f3615g = androidx.appcompat.widget.a.j("L", f6, ";");
        f3616h = m.b.f(h0.class);
        m.b.f(h0.class);
        f3617i = m.b.b(v0.class);
        f3618j = m.b.b(z0.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0359 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0220  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(h.h r29, m.c r30, k.a.C0040a r31, h.f r32) {
        /*
            Method dump skipped, instructions count: 1202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.a.a(h.h, m.c, k.a$a, h.f):void");
    }

    public final void b(h.h hVar, C0040a c0040a, m.c cVar) {
        Method method = cVar.f4062c;
        hVar.k(25, c0040a.a("entity"));
        if (method != null) {
            Class<?> declaringClass = method.getDeclaringClass();
            hVar.i(declaringClass.isInterface() ? 185 : 182, m.b.f(declaringClass), method.getName(), m.b.c(method));
            if (method.getReturnType().equals(cVar.f4065f)) {
                return;
            }
        } else {
            Field field = cVar.f4063d;
            hVar.a(180, m.b.f(cVar.f4067h), field.getName(), m.b.b(field.getType()));
            if (field.getType().equals(cVar.f4065f)) {
                return;
            }
        }
        hVar.j(192, m.b.f(cVar.f4065f));
    }

    public final void c(C0040a c0040a, h.h hVar, m.c cVar) {
        h.f fVar = new h.f();
        hVar.k(25, 0);
        String str = c0040a.f3622b;
        String c5 = androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), cVar.f4061b, "_asm_ser_");
        String str2 = f3613e;
        hVar.a(180, str, c5, str2);
        hVar.e(199, fVar);
        hVar.k(25, 0);
        hVar.k(25, 1);
        hVar.g(h.i.b(m.b.b(cVar.f4065f)));
        hVar.i(182, f3611c, "getObjectWriter", androidx.activity.d.f("(Ljava/lang/Class;)", str2));
        hVar.a(181, c0040a.f3622b, androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), cVar.f4061b, "_asm_ser_"), str2);
        hVar.f(fVar);
        hVar.k(25, 0);
        hVar.a(180, c0040a.f3622b, androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), cVar.f4061b, "_asm_ser_"), str2);
    }

    public final void d(C0040a c0040a, h.h hVar, m.c cVar, Class<?> cls) {
        h.f fVar = new h.f();
        hVar.k(25, 0);
        String str = c0040a.f3622b;
        String c5 = androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), cVar.f4061b, "_asm_list_item_ser_");
        String str2 = f3613e;
        hVar.a(180, str, c5, str2);
        hVar.e(199, fVar);
        hVar.k(25, 0);
        hVar.k(25, 1);
        hVar.g(h.i.b(m.b.b(cls)));
        hVar.i(182, f3611c, "getObjectWriter", androidx.activity.d.f("(Ljava/lang/Class;)", str2));
        hVar.a(181, c0040a.f3622b, androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), cVar.f4061b, "_asm_list_item_ser_"), str2);
        hVar.f(fVar);
        hVar.k(25, 0);
        hVar.a(180, c0040a.f3622b, androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), cVar.f4061b, "_asm_list_item_ser_"), str2);
    }

    public final void e(h.h hVar, m.c cVar, C0040a c0040a) {
        b1 b1Var;
        int i5;
        Class<?> cls = cVar.f4065f;
        h.f fVar = new h.f();
        h.f fVar2 = new h.f();
        int i6 = hVar.f3034g.f2984b;
        g.b c5 = cVar.c();
        int b5 = c5 != null ? b1.b(c5.serialzeFeatures()) : 0;
        int i7 = b1.F;
        if ((b5 & i7) == 0) {
            hVar.k(25, c0040a.a("out"));
            hVar.g(Integer.valueOf(i7));
            hVar.i(182, f3614f, "isEnabled", "(I)Z");
            hVar.e(TbsListener.ErrorCode.STARTDOWNLOAD_LOCKED_IO_FAILED, fVar);
        }
        int i8 = hVar.f3034g.f2984b;
        hVar.k(25, c0040a.a("out"));
        hVar.k(21, c0040a.a("seperator"));
        String str = f3614f;
        hVar.i(182, str, "write", "(I)V");
        i(hVar, c0040a);
        hVar.k(25, c0040a.a("out"));
        hVar.g(Integer.valueOf(b5));
        if (cls == String.class || cls == Character.class) {
            b1Var = b1.WriteNullStringAsEmpty;
        } else if (Number.class.isAssignableFrom(cls)) {
            b1Var = b1.WriteNullNumberAsZero;
        } else if (cls == Boolean.class) {
            b1Var = b1.WriteNullBooleanAsFalse;
        } else {
            if (!Collection.class.isAssignableFrom(cls) && !cls.isArray()) {
                i5 = 0;
                hVar.g(i5);
                hVar.i(182, str, "writeNull", "(II)V");
                h(hVar, c0040a);
                hVar.e(167, fVar2);
                hVar.f(fVar);
                hVar.f(fVar2);
            }
            b1Var = b1.WriteNullListAsEmpty;
        }
        i5 = Integer.valueOf(b1Var.f3675b);
        hVar.g(i5);
        hVar.i(182, str, "writeNull", "(II)V");
        h(hVar, c0040a);
        hVar.e(167, fVar2);
        hVar.f(fVar);
        hVar.f(fVar2);
    }

    public final void f(h.h hVar, m.c cVar, C0040a c0040a, int i5, char c5) {
        h.f fVar = new h.f();
        g(hVar, cVar, c0040a, fVar);
        b(hVar, c0040a, cVar);
        hVar.k(54, i5);
        a(hVar, cVar, c0040a, fVar);
        hVar.k(25, c0040a.a("out"));
        hVar.k(21, c0040a.a("seperator"));
        hVar.k(25, 6);
        hVar.k(21, i5);
        hVar.i(182, f3614f, "writeFieldValue", "(CLjava/lang/String;" + c5 + ")V");
        h(hVar, c0040a);
        hVar.f(fVar);
    }

    public final void g(h.h hVar, m.c cVar, C0040a c0040a, h.f fVar) {
        if (!c0040a.f3624d) {
            hVar.k(25, 0);
            hVar.k(25, 1);
            hVar.k(25, 2);
            hVar.k(25, 6);
            String str = f3616h;
            StringBuilder g5 = androidx.activity.d.g("(L");
            String str2 = f3611c;
            hVar.i(182, str, "applyName", androidx.appcompat.graphics.drawable.a.c(g5, str2, ";Ljava/lang/Object;Ljava/lang/String;)Z"));
            hVar.e(TbsListener.ErrorCode.STARTDOWNLOAD_LOCKED_IO_FAILED, fVar);
            hVar.k(25, 0);
            hVar.k(25, 1);
            hVar.g(cVar.f4071l);
            hVar.i(182, str, "applyLabel", "(L" + str2 + ";Ljava/lang/String;)Z");
            hVar.e(TbsListener.ErrorCode.STARTDOWNLOAD_LOCKED_IO_FAILED, fVar);
        }
        if (cVar.f4063d == null) {
            hVar.k(25, c0040a.a("out"));
            hVar.g(Integer.valueOf(b1.IgnoreNonFieldGetter.f3675b));
            hVar.i(182, f3614f, "isEnabled", "(I)Z");
            hVar.e(TbsListener.ErrorCode.STARTDOWNLOAD_NEEDDOWNLOAD_KEY_ERROR, fVar);
        }
    }

    public final void h(h.h hVar, C0040a c0040a) {
        hVar.k(16, 44);
        hVar.k(54, c0040a.a("seperator"));
    }

    public final void i(h.h hVar, C0040a c0040a) {
        String str;
        String str2;
        String str3;
        boolean z4 = c0040a.f3624d;
        hVar.k(25, c0040a.a("out"));
        hVar.k(25, 6);
        if (z4) {
            str = f3614f;
            str2 = "writeFieldNameDirect";
            str3 = "(Ljava/lang/String;)V";
        } else {
            hVar.c(3);
            str = f3614f;
            str2 = "writeFieldName";
            str3 = "(Ljava/lang/String;Z)V";
        }
        hVar.i(182, str, str2, str3);
    }

    public final void j(h.h hVar, m.c cVar, C0040a c0040a, h.f fVar) {
        Class<?> cls;
        String str;
        h.f fVar2;
        h.f fVar3;
        String str2;
        String str3;
        String str4 = cVar.f4079t;
        Class<?> cls2 = cVar.f4065f;
        h.f fVar4 = new h.f();
        if (c0040a.f3624d) {
            hVar.k(25, c0040a.a("object"));
        } else {
            hVar.k(25, 8);
        }
        hVar.c(89);
        hVar.k(58, c0040a.a("object"));
        hVar.e(199, fVar4);
        e(hVar, cVar, c0040a);
        hVar.e(167, fVar);
        hVar.f(fVar4);
        hVar.k(25, c0040a.a("out"));
        hVar.k(21, c0040a.a("seperator"));
        hVar.i(182, f3614f, "write", "(I)V");
        i(hVar, c0040a);
        h.f fVar5 = new h.f();
        h.f fVar6 = new h.f();
        if (!Modifier.isPublic(cls2.getModifiers()) || i.i.e(cls2)) {
            cls = String.class;
            str = str4;
            fVar2 = fVar5;
            fVar3 = fVar6;
        } else {
            hVar.k(25, c0040a.a("object"));
            cls = String.class;
            hVar.i(182, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
            hVar.g(h.i.b(m.b.b(cls2)));
            hVar.e(166, fVar6);
            c(c0040a, hVar, cVar);
            hVar.k(58, c0040a.a("fied_ser"));
            h.f fVar7 = new h.f();
            h.f fVar8 = new h.f();
            hVar.k(25, c0040a.a("fied_ser"));
            String str5 = f3616h;
            hVar.j(193, str5);
            hVar.e(TbsListener.ErrorCode.STARTDOWNLOAD_LOCKED_IO_FAILED, fVar7);
            int i5 = cVar.f4069j;
            boolean z4 = (b1.DisableCircularReferenceDetect.f3675b & i5) != 0;
            str = str4;
            boolean z5 = (b1.BeanToArray.f3675b & i5) != 0;
            String str6 = (z4 || (c0040a.f3627g && c0040a.f3624d)) ? z5 ? "writeAsArrayNonContext" : "writeDirectNonContext" : z5 ? "writeAsArray" : "write";
            hVar.k(25, c0040a.a("fied_ser"));
            hVar.j(192, str5);
            hVar.k(25, 1);
            hVar.k(25, c0040a.a("object"));
            hVar.k(25, 6);
            hVar.k(25, 0);
            fVar3 = fVar6;
            hVar.a(180, c0040a.f3622b, androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), cVar.f4061b, "_asm_fieldType"), "Ljava/lang/reflect/Type;");
            hVar.g(Integer.valueOf(cVar.f4069j));
            StringBuilder sb = new StringBuilder();
            sb.append("(L");
            String str7 = f3611c;
            hVar.i(182, str5, str6, androidx.appcompat.graphics.drawable.a.c(sb, str7, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
            hVar.e(167, fVar8);
            hVar.f(fVar7);
            hVar.k(25, c0040a.a("fied_ser"));
            hVar.k(25, 1);
            hVar.k(25, c0040a.a("object"));
            hVar.k(25, 6);
            hVar.k(25, 0);
            hVar.a(180, c0040a.f3622b, androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), cVar.f4061b, "_asm_fieldType"), "Ljava/lang/reflect/Type;");
            hVar.g(Integer.valueOf(cVar.f4069j));
            hVar.i(185, f3612d, "write", androidx.appcompat.widget.a.j("(L", str7, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
            hVar.f(fVar8);
            fVar2 = fVar5;
            hVar.e(167, fVar2);
        }
        hVar.f(fVar3);
        hVar.k(25, 1);
        hVar.k(25, c0040a.f3624d ? c0040a.a("object") : 8);
        if (str != null) {
            hVar.g(str);
            hVar.i(182, f3611c, "writeWithFormat", "(Ljava/lang/Object;Ljava/lang/String;)V");
        } else {
            hVar.k(25, 6);
            Type type = cVar.f4066g;
            if ((type instanceof Class) && ((Class) type).isPrimitive()) {
                str2 = f3611c;
                str3 = "(Ljava/lang/Object;Ljava/lang/Object;)V";
            } else {
                Class<?> cls3 = cls;
                if (cVar.f4065f == cls3) {
                    hVar.g(h.i.b(m.b.b(cls3)));
                } else {
                    hVar.k(25, 0);
                    hVar.a(180, c0040a.f3622b, androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), cVar.f4061b, "_asm_fieldType"), "Ljava/lang/reflect/Type;");
                }
                hVar.g(Integer.valueOf(cVar.f4069j));
                str2 = f3611c;
                str3 = "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
            }
            hVar.i(182, str2, "writeWithFieldName", str3);
        }
        hVar.f(fVar2);
        h(hVar, c0040a);
    }

    public final void k(Class<?> cls, h.h hVar, m.c[] cVarArr, C0040a c0040a) {
        String str;
        int i5;
        a aVar;
        int i6;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        h.f fVar;
        h.f fVar2;
        h.f fVar3;
        h.f fVar4;
        String str15;
        String str16;
        String str17;
        Class<?> cls2;
        h.f fVar5;
        m.c cVar;
        h.f fVar6;
        String str18;
        String str19;
        String str20;
        int i7;
        int i8;
        int i9;
        h.f fVar7;
        m.c cVar2;
        String str21;
        String str22;
        int a5;
        char c5;
        int i10;
        m.c[] cVarArr2 = cVarArr;
        int length = cVarArr2.length;
        String str23 = ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
        String str24 = "write";
        String str25 = "(L";
        String str26 = "out";
        if (!c0040a.f3624d) {
            h.f fVar8 = new h.f();
            h.f fVar9 = new h.f();
            hVar.k(25, c0040a.a("out"));
            hVar.g(Integer.valueOf(b1.PrettyFormat.f3675b));
            hVar.i(182, f3614f, "isEnabled", "(I)Z");
            hVar.e(TbsListener.ErrorCode.STARTDOWNLOAD_NEEDDOWNLOAD_KEY_ERROR, fVar9);
            boolean z4 = false;
            for (m.c cVar3 : cVarArr2) {
                if (cVar3.f4062c != null) {
                    z4 = true;
                }
            }
            if (z4) {
                hVar.k(25, c0040a.a("out"));
                hVar.g(Integer.valueOf(b1.IgnoreErrorGetter.f3675b));
                hVar.i(182, f3614f, "isEnabled", "(I)Z");
                i10 = TbsListener.ErrorCode.STARTDOWNLOAD_LOCKED_IO_FAILED;
            } else {
                i10 = 167;
            }
            hVar.e(i10, fVar8);
            hVar.f(fVar9);
            hVar.k(25, 0);
            hVar.k(25, 1);
            hVar.k(25, 2);
            hVar.k(25, 3);
            hVar.k(25, 4);
            hVar.k(21, 5);
            hVar.i(183, f3616h, "write", androidx.appcompat.graphics.drawable.a.c(androidx.activity.d.g("(L"), f3611c, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
            hVar.c(TbsListener.ErrorCode.NONEEDDOWNLOAD_OTHER_PROCESS_DOWNLOADING);
            hVar.f(fVar8);
        }
        if (!c0040a.f3627g) {
            h.f fVar10 = new h.f();
            hVar.k(25, 0);
            hVar.k(25, 1);
            hVar.k(25, 2);
            hVar.k(21, 5);
            hVar.i(182, f3616h, "writeReference", androidx.appcompat.graphics.drawable.a.c(androidx.activity.d.g("(L"), f3611c, ";Ljava/lang/Object;I)Z"));
            hVar.e(TbsListener.ErrorCode.STARTDOWNLOAD_LOCKED_IO_FAILED, fVar10);
            hVar.c(TbsListener.ErrorCode.NONEEDDOWNLOAD_OTHER_PROCESS_DOWNLOADING);
            hVar.f(fVar10);
        }
        String str27 = c0040a.f3624d ? c0040a.f3627g ? "writeAsArrayNonContext" : "writeAsArray" : "writeAsArrayNormal";
        int i11 = c0040a.f3623c.f3757g;
        b1 b1Var = b1.BeanToArray;
        if ((i11 & b1Var.f3675b) == 0) {
            h.f fVar11 = new h.f();
            hVar.k(25, c0040a.a("out"));
            hVar.g(Integer.valueOf(b1Var.f3675b));
            hVar.i(182, f3614f, "isEnabled", "(I)Z");
            hVar.e(TbsListener.ErrorCode.STARTDOWNLOAD_LOCKED_IO_FAILED, fVar11);
            hVar.k(25, 0);
            hVar.k(25, 1);
            hVar.k(25, 2);
            hVar.k(25, 3);
            hVar.k(25, 4);
            hVar.k(21, 5);
            hVar.i(182, c0040a.f3622b, str27, androidx.appcompat.graphics.drawable.a.c(androidx.activity.d.g("(L"), f3611c, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
            hVar.c(TbsListener.ErrorCode.NONEEDDOWNLOAD_OTHER_PROCESS_DOWNLOADING);
            hVar.f(fVar11);
        } else {
            hVar.k(25, 0);
            hVar.k(25, 1);
            hVar.k(25, 2);
            hVar.k(25, 3);
            hVar.k(25, 4);
            hVar.k(21, 5);
            hVar.i(182, c0040a.f3622b, str27, androidx.appcompat.graphics.drawable.a.c(androidx.activity.d.g("(L"), f3611c, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
            hVar.c(TbsListener.ErrorCode.NONEEDDOWNLOAD_OTHER_PROCESS_DOWNLOADING);
        }
        String str28 = "(";
        if (!c0040a.f3627g) {
            hVar.k(25, 1);
            String str29 = f3611c;
            StringBuilder g5 = androidx.activity.d.g("()");
            String str30 = f3617i;
            g5.append(str30);
            hVar.i(182, str29, "getContext", g5.toString());
            hVar.k(58, c0040a.a("parent"));
            hVar.k(25, 1);
            hVar.k(25, c0040a.a("parent"));
            hVar.k(25, 2);
            hVar.k(25, 3);
            hVar.g(Integer.valueOf(c0040a.f3623c.f3757g));
            hVar.i(182, str29, "setContext", "(" + str30 + "Ljava/lang/Object;Ljava/lang/Object;I)V");
        }
        boolean z5 = (c0040a.f3623c.f3757g & b1.WriteClassName.f3675b) != 0;
        String str31 = "(I)V";
        if (z5 || !c0040a.f3624d) {
            h.f fVar12 = new h.f();
            h.f fVar13 = new h.f();
            if (z5) {
                str = "parent";
                i5 = 182;
            } else {
                hVar.k(25, 1);
                hVar.k(25, 4);
                hVar.k(25, 2);
                str = "parent";
                i5 = 182;
                hVar.i(182, f3611c, "isWriteClassName", "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z");
                hVar.e(TbsListener.ErrorCode.STARTDOWNLOAD_LOCKED_IO_FAILED, fVar13);
            }
            hVar.k(25, 4);
            hVar.k(25, 2);
            hVar.i(i5, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
            hVar.e(165, fVar13);
            int i12 = hVar.f3034g.f2984b;
            hVar.k(25, c0040a.a("out"));
            hVar.k(16, 123);
            hVar.i(i5, f3614f, "write", "(I)V");
            hVar.k(25, 0);
            hVar.k(25, 1);
            String str32 = c0040a.f3623c.f3753c;
            if (str32 != null) {
                hVar.g(str32);
            } else {
                hVar.c(1);
            }
            hVar.k(25, 2);
            hVar.i(182, f3616h, "writeClassName", androidx.appcompat.graphics.drawable.a.c(androidx.activity.d.g("(L"), f3611c, ";Ljava/lang/String;Ljava/lang/Object;)V"));
            hVar.k(16, 44);
            hVar.e(167, fVar12);
            hVar.f(fVar13);
            hVar.k(16, 123);
            hVar.f(fVar12);
        } else {
            hVar.k(16, 123);
            str = "parent";
        }
        String str33 = "seperator";
        hVar.k(54, c0040a.a("seperator"));
        if (!c0040a.f3624d) {
            hVar.k(25, 0);
            hVar.k(25, 1);
            hVar.k(25, 2);
            hVar.k(21, c0040a.a("seperator"));
            hVar.i(182, f3616h, "writeBefore", androidx.appcompat.graphics.drawable.a.c(androidx.activity.d.g("(L"), f3611c, ";Ljava/lang/Object;C)C"));
            hVar.k(54, c0040a.a("seperator"));
        }
        if (!c0040a.f3624d) {
            hVar.k(25, c0040a.a("out"));
            hVar.i(182, f3614f, "isNotWriteDefaultValue", "()Z");
            hVar.k(54, c0040a.a("notWriteDefaultValue"));
            hVar.k(25, 1);
            hVar.k(25, 0);
            String str34 = f3611c;
            StringBuilder g6 = androidx.activity.d.g("(");
            String str35 = f3618j;
            hVar.i(182, str34, "checkValue", androidx.appcompat.graphics.drawable.a.c(g6, str35, ")Z"));
            hVar.k(54, c0040a.a("checkValue"));
            hVar.k(25, 1);
            hVar.k(25, 0);
            hVar.i(182, str34, "hasNameFilters", "(" + str35 + ")Z");
            hVar.k(54, c0040a.a("hasNameFilters"));
        }
        a aVar2 = this;
        int i13 = 0;
        while (i13 < length) {
            m.c cVar4 = cVarArr2[i13];
            Class<?> cls3 = cVar4.f4065f;
            hVar.g(cVar4.f4061b);
            int i14 = i13;
            hVar.k(58, 6);
            if (cls3 == Byte.TYPE || cls3 == Short.TYPE || cls3 == Integer.TYPE) {
                aVar = aVar2;
                i6 = length;
                String str36 = str23;
                str2 = str24;
                str3 = str25;
                str4 = str26;
                str5 = str28;
                str6 = str31;
                str7 = str36;
                f(hVar, cVar4, c0040a, c0040a.a(cls3.getName()), 'I');
            } else {
                String str37 = "writeFieldValue";
                if (cls3 == Long.TYPE) {
                    h.f fVar14 = new h.f();
                    aVar2.g(hVar, cVar4, c0040a, fVar14);
                    aVar2.b(hVar, c0040a, cVar4);
                    str8 = str31;
                    hVar.k(55, c0040a.b("long"));
                    aVar2.a(hVar, cVar4, c0040a, fVar14);
                    hVar.k(25, c0040a.a(str26));
                    hVar.k(21, c0040a.a(str33));
                    hVar.k(25, 6);
                    hVar.k(22, c0040a.b("long"));
                    hVar.i(182, f3614f, "writeFieldValue", "(CLjava/lang/String;J)V");
                    aVar2.h(hVar, c0040a);
                    hVar.f(fVar14);
                } else {
                    str8 = str31;
                    if (cls3 == Float.TYPE) {
                        h.f fVar15 = new h.f();
                        aVar2.g(hVar, cVar4, c0040a, fVar15);
                        aVar2.b(hVar, c0040a, cVar4);
                        hVar.k(56, c0040a.a(TypedValues.Custom.S_FLOAT));
                        aVar2.a(hVar, cVar4, c0040a, fVar15);
                        hVar.k(25, c0040a.a(str26));
                        hVar.k(21, c0040a.a(str33));
                        hVar.k(25, 6);
                        hVar.k(23, c0040a.a(TypedValues.Custom.S_FLOAT));
                        hVar.i(182, f3614f, "writeFieldValue", "(CLjava/lang/String;F)V");
                        aVar2.h(hVar, c0040a);
                        hVar.f(fVar15);
                    } else if (cls3 == Double.TYPE) {
                        h.f fVar16 = new h.f();
                        aVar2.g(hVar, cVar4, c0040a, fVar16);
                        aVar2.b(hVar, c0040a, cVar4);
                        hVar.k(57, c0040a.b("double"));
                        aVar2.a(hVar, cVar4, c0040a, fVar16);
                        hVar.k(25, c0040a.a(str26));
                        hVar.k(21, c0040a.a(str33));
                        hVar.k(25, 6);
                        hVar.k(24, c0040a.b("double"));
                        hVar.i(182, f3614f, "writeFieldValue", "(CLjava/lang/String;D)V");
                        aVar2.h(hVar, c0040a);
                        hVar.f(fVar16);
                    } else {
                        if (cls3 == Boolean.TYPE) {
                            a5 = c0040a.a(TypedValues.Custom.S_BOOLEAN);
                            c5 = 'Z';
                        } else if (cls3 == Character.TYPE) {
                            a5 = c0040a.a("char");
                            c5 = 'C';
                        } else {
                            aVar = aVar2;
                            i6 = length;
                            str9 = str8;
                            if (cls3 == String.class) {
                                h.f fVar17 = new h.f();
                                if (cVar4.f4061b.equals(c0040a.f3623c.f3753c)) {
                                    hVar.k(25, 1);
                                    hVar.k(25, 4);
                                    hVar.k(25, 2);
                                    str5 = str28;
                                    hVar.i(182, f3611c, "isWriteClassName", "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z");
                                    hVar.e(TbsListener.ErrorCode.STARTDOWNLOAD_NEEDDOWNLOAD_KEY_ERROR, fVar17);
                                } else {
                                    str5 = str28;
                                }
                                aVar.g(hVar, cVar4, c0040a, fVar17);
                                aVar.b(hVar, c0040a, cVar4);
                                hVar.k(58, c0040a.a(TypedValues.Custom.S_STRING));
                                aVar.a(hVar, cVar4, c0040a, fVar17);
                                h.f fVar18 = new h.f();
                                h.f fVar19 = new h.f();
                                str10 = str23;
                                hVar.k(25, c0040a.a(TypedValues.Custom.S_STRING));
                                hVar.e(199, fVar18);
                                aVar.e(hVar, cVar4, c0040a);
                                hVar.e(167, fVar19);
                                hVar.f(fVar18);
                                if ("trim".equals(cVar4.f4079t)) {
                                    hVar.k(25, c0040a.a(TypedValues.Custom.S_STRING));
                                    hVar.i(182, "java/lang/String", "trim", "()Ljava/lang/String;");
                                    hVar.k(58, c0040a.a(TypedValues.Custom.S_STRING));
                                }
                                if (c0040a.f3624d) {
                                    hVar.k(25, c0040a.a(str26));
                                    hVar.k(21, c0040a.a(str33));
                                    hVar.k(25, 6);
                                    hVar.k(25, c0040a.a(TypedValues.Custom.S_STRING));
                                    str22 = f3614f;
                                    str37 = "writeFieldValueStringWithDoubleQuoteCheck";
                                } else {
                                    hVar.k(25, c0040a.a(str26));
                                    hVar.k(21, c0040a.a(str33));
                                    hVar.k(25, 6);
                                    hVar.k(25, c0040a.a(TypedValues.Custom.S_STRING));
                                    str22 = f3614f;
                                }
                                hVar.i(182, str22, str37, "(CLjava/lang/String;Ljava/lang/String;)V");
                                aVar.h(hVar, c0040a);
                                hVar.f(fVar19);
                                hVar.f(fVar17);
                            } else {
                                str10 = str23;
                                str5 = str28;
                                if (cls3 == BigDecimal.class) {
                                    h.f fVar20 = new h.f();
                                    aVar.g(hVar, cVar4, c0040a, fVar20);
                                    aVar.b(hVar, c0040a, cVar4);
                                    hVar.k(58, c0040a.a("decimal"));
                                    aVar.a(hVar, cVar4, c0040a, fVar20);
                                    h.f fVar21 = new h.f();
                                    h.f fVar22 = new h.f();
                                    int i15 = hVar.f3034g.f2984b;
                                    hVar.k(25, c0040a.a("decimal"));
                                    hVar.e(199, fVar21);
                                    aVar.e(hVar, cVar4, c0040a);
                                    hVar.e(167, fVar22);
                                    hVar.f(fVar21);
                                    hVar.k(25, c0040a.a(str26));
                                    hVar.k(21, c0040a.a(str33));
                                    hVar.k(25, 6);
                                    hVar.k(25, c0040a.a("decimal"));
                                    hVar.i(182, f3614f, "writeFieldValue", "(CLjava/lang/String;Ljava/math/BigDecimal;)V");
                                    aVar.h(hVar, c0040a);
                                    hVar.e(167, fVar22);
                                    hVar.f(fVar22);
                                    hVar.f(fVar20);
                                } else {
                                    if (List.class.isAssignableFrom(cls3)) {
                                        Type y4 = m.j.y(cVar4.f4066g);
                                        Class<?> cls4 = null;
                                        Class<?> cls5 = y4 instanceof Class ? (Class) y4 : null;
                                        if (cls5 != Object.class && cls5 != Serializable.class) {
                                            cls4 = cls5;
                                        }
                                        h.f fVar23 = new h.f();
                                        h.f fVar24 = new h.f();
                                        h.f fVar25 = new h.f();
                                        aVar.g(hVar, cVar4, c0040a, fVar23);
                                        aVar.b(hVar, c0040a, cVar4);
                                        hVar.j(192, "java/util/List");
                                        str3 = str25;
                                        Class<?> cls6 = cls4;
                                        hVar.k(58, c0040a.a("list"));
                                        aVar.a(hVar, cVar4, c0040a, fVar23);
                                        hVar.k(25, c0040a.a("list"));
                                        hVar.e(199, fVar24);
                                        aVar.e(hVar, cVar4, c0040a);
                                        hVar.e(167, fVar25);
                                        hVar.f(fVar24);
                                        hVar.k(25, c0040a.a(str26));
                                        hVar.k(21, c0040a.a(str33));
                                        String str38 = f3614f;
                                        hVar.i(182, str38, str24, str9);
                                        aVar.i(hVar, c0040a);
                                        hVar.k(25, c0040a.a("list"));
                                        String str39 = str33;
                                        hVar.i(185, "java/util/List", "size", "()I");
                                        hVar.k(54, c0040a.a("size"));
                                        h.f fVar26 = new h.f();
                                        h.f fVar27 = new h.f();
                                        hVar.k(21, c0040a.a("size"));
                                        hVar.c(3);
                                        hVar.e(160, fVar26);
                                        hVar.k(25, c0040a.a(str26));
                                        hVar.g("[]");
                                        hVar.i(182, str38, str24, "(Ljava/lang/String;)V");
                                        hVar.e(167, fVar27);
                                        hVar.f(fVar26);
                                        if (c0040a.f3627g) {
                                            fVar = fVar27;
                                        } else {
                                            hVar.k(25, 1);
                                            hVar.k(25, c0040a.a("list"));
                                            hVar.k(25, 6);
                                            fVar = fVar27;
                                            hVar.i(182, f3611c, "setContext", "(Ljava/lang/Object;Ljava/lang/Object;)V");
                                        }
                                        if (y4 == String.class && c0040a.f3624d) {
                                            i7 = 25;
                                            hVar.k(25, c0040a.a(str26));
                                            hVar.k(25, c0040a.a("list"));
                                            i9 = 182;
                                            hVar.i(182, str38, str24, "(Ljava/util/List;)V");
                                            i8 = 1;
                                            str2 = str24;
                                            str17 = str10;
                                            str6 = str9;
                                            str4 = str26;
                                        } else {
                                            hVar.k(25, c0040a.a(str26));
                                            hVar.k(16, 91);
                                            hVar.i(182, str38, str24, str9);
                                            h.f fVar28 = new h.f();
                                            h.f fVar29 = new h.f();
                                            h.f fVar30 = new h.f();
                                            hVar.c(3);
                                            hVar.k(54, c0040a.a("i"));
                                            hVar.f(fVar28);
                                            hVar.k(21, c0040a.a("i"));
                                            hVar.k(21, c0040a.a("size"));
                                            hVar.e(162, fVar30);
                                            hVar.k(21, c0040a.a("i"));
                                            hVar.e(TbsListener.ErrorCode.STARTDOWNLOAD_LOCKED_IO_FAILED, fVar29);
                                            hVar.k(25, c0040a.a(str26));
                                            hVar.k(16, 44);
                                            hVar.i(182, str38, str24, str9);
                                            hVar.f(fVar29);
                                            hVar.k(25, c0040a.a("list"));
                                            hVar.k(21, c0040a.a("i"));
                                            hVar.i(185, "java/util/List", "get", "(I)Ljava/lang/Object;");
                                            hVar.k(58, c0040a.a("list_item"));
                                            h.f fVar31 = new h.f();
                                            h.f fVar32 = new h.f();
                                            hVar.k(25, c0040a.a("list_item"));
                                            hVar.e(199, fVar32);
                                            hVar.k(25, c0040a.a(str26));
                                            hVar.i(182, str38, "writeNull", "()V");
                                            hVar.e(167, fVar31);
                                            hVar.f(fVar32);
                                            h.f fVar33 = new h.f();
                                            h.f fVar34 = new h.f();
                                            if (cls6 == null || !Modifier.isPublic(cls6.getModifiers())) {
                                                fVar2 = fVar28;
                                                fVar3 = fVar33;
                                                fVar4 = fVar30;
                                                str15 = str9;
                                                str16 = str26;
                                                str17 = str10;
                                                cls2 = cls6;
                                                fVar5 = fVar31;
                                                cVar = cVar4;
                                                fVar6 = fVar34;
                                                str2 = str24;
                                            } else {
                                                str15 = str9;
                                                str16 = str26;
                                                hVar.k(25, c0040a.a("list_item"));
                                                fVar4 = fVar30;
                                                fVar2 = fVar28;
                                                hVar.i(182, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
                                                hVar.g(h.i.b(m.b.b(cls6)));
                                                hVar.e(166, fVar34);
                                                cls2 = cls6;
                                                aVar.d(c0040a, hVar, cVar4, cls2);
                                                hVar.k(58, c0040a.a("list_item_desc"));
                                                h.f fVar35 = new h.f();
                                                h.f fVar36 = new h.f();
                                                fVar5 = fVar31;
                                                boolean z6 = c0040a.f3624d;
                                                if (z6) {
                                                    fVar6 = fVar34;
                                                    String str40 = (c0040a.f3627g && z6) ? "writeDirectNonContext" : str24;
                                                    fVar7 = fVar33;
                                                    hVar.k(25, c0040a.a("list_item_desc"));
                                                    String str41 = f3616h;
                                                    hVar.j(193, str41);
                                                    hVar.e(TbsListener.ErrorCode.STARTDOWNLOAD_LOCKED_IO_FAILED, fVar35);
                                                    str21 = str24;
                                                    hVar.k(25, c0040a.a("list_item_desc"));
                                                    hVar.j(192, str41);
                                                    hVar.k(25, 1);
                                                    hVar.k(25, c0040a.a("list_item"));
                                                    if (c0040a.f3627g) {
                                                        hVar.c(1);
                                                    } else {
                                                        hVar.k(21, c0040a.a("i"));
                                                        hVar.i(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                                    }
                                                    hVar.g(h.i.b(m.b.b(cls2)));
                                                    hVar.g(Integer.valueOf(cVar4.f4069j));
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append(str3);
                                                    cVar2 = cVar4;
                                                    str17 = str10;
                                                    hVar.i(182, str41, str40, androidx.appcompat.graphics.drawable.a.c(sb, f3611c, str17));
                                                    hVar.e(167, fVar36);
                                                    hVar.f(fVar35);
                                                } else {
                                                    fVar7 = fVar33;
                                                    cVar2 = cVar4;
                                                    fVar6 = fVar34;
                                                    str21 = str24;
                                                    str17 = str10;
                                                }
                                                hVar.k(25, c0040a.a("list_item_desc"));
                                                hVar.k(25, 1);
                                                hVar.k(25, c0040a.a("list_item"));
                                                if (c0040a.f3627g) {
                                                    hVar.c(1);
                                                } else {
                                                    hVar.k(21, c0040a.a("i"));
                                                    hVar.i(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                                }
                                                hVar.g(h.i.b(m.b.b(cls2)));
                                                cVar = cVar2;
                                                hVar.g(Integer.valueOf(cVar.f4069j));
                                                str2 = str21;
                                                hVar.i(185, f3612d, str2, androidx.appcompat.graphics.drawable.a.c(androidx.activity.d.g(str3), f3611c, str17));
                                                hVar.f(fVar36);
                                                fVar3 = fVar7;
                                                hVar.e(167, fVar3);
                                            }
                                            hVar.f(fVar6);
                                            hVar.k(25, 1);
                                            hVar.k(25, c0040a.a("list_item"));
                                            if (c0040a.f3627g) {
                                                hVar.c(1);
                                            } else {
                                                hVar.k(21, c0040a.a("i"));
                                                hVar.i(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                            }
                                            if (cls2 == null || !Modifier.isPublic(cls2.getModifiers())) {
                                                str18 = f3611c;
                                                str19 = "writeWithFieldName";
                                                str20 = "(Ljava/lang/Object;Ljava/lang/Object;)V";
                                            } else {
                                                hVar.g(h.i.b(m.b.b((Class) y4)));
                                                hVar.g(Integer.valueOf(cVar.f4069j));
                                                str18 = f3611c;
                                                str19 = "writeWithFieldName";
                                                str20 = "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
                                            }
                                            hVar.i(182, str18, str19, str20);
                                            hVar.f(fVar3);
                                            hVar.f(fVar5);
                                            hVar.b(c0040a.a("i"));
                                            hVar.e(167, fVar2);
                                            hVar.f(fVar4);
                                            str4 = str16;
                                            i7 = 25;
                                            hVar.k(25, c0040a.a(str4));
                                            hVar.k(16, 93);
                                            str6 = str15;
                                            hVar.i(182, str38, str2, str6);
                                            i8 = 1;
                                            i9 = 182;
                                        }
                                        hVar.k(i7, i8);
                                        hVar.i(i9, f3611c, "popContext", "()V");
                                        hVar.f(fVar);
                                        h(hVar, c0040a);
                                        hVar.f(fVar25);
                                        hVar.f(fVar23);
                                        str11 = str17;
                                        aVar2 = this;
                                        str33 = str39;
                                    } else {
                                        str2 = str24;
                                        str3 = str25;
                                        String str42 = str33;
                                        str6 = str9;
                                        str4 = str26;
                                        if (cls3.isEnum()) {
                                            h.f fVar37 = new h.f();
                                            h.f fVar38 = new h.f();
                                            h.f fVar39 = new h.f();
                                            aVar.g(hVar, cVar4, c0040a, fVar39);
                                            aVar.b(hVar, c0040a, cVar4);
                                            hVar.j(192, "java/lang/Enum");
                                            hVar.k(58, c0040a.a("enum"));
                                            aVar.a(hVar, cVar4, c0040a, fVar39);
                                            hVar.k(25, c0040a.a("enum"));
                                            hVar.e(199, fVar37);
                                            aVar.e(hVar, cVar4, c0040a);
                                            hVar.e(167, fVar38);
                                            hVar.f(fVar37);
                                            if (c0040a.f3624d) {
                                                hVar.k(25, c0040a.a(str4));
                                                str33 = str42;
                                                hVar.k(21, c0040a.a(str33));
                                                hVar.k(25, 6);
                                                hVar.k(25, c0040a.a("enum"));
                                                hVar.i(182, "java/lang/Enum", "name", "()Ljava/lang/String;");
                                                str12 = f3614f;
                                                str13 = "writeFieldValueStringWithDoubleQuote";
                                                str14 = "(CLjava/lang/String;Ljava/lang/String;)V";
                                                str11 = str10;
                                            } else {
                                                str33 = str42;
                                                hVar.k(25, c0040a.a(str4));
                                                hVar.k(21, c0040a.a(str33));
                                                String str43 = f3614f;
                                                hVar.i(182, str43, str2, str6);
                                                hVar.k(25, c0040a.a(str4));
                                                hVar.k(25, 6);
                                                hVar.c(3);
                                                str11 = str10;
                                                hVar.i(182, str43, "writeFieldName", "(Ljava/lang/String;Z)V");
                                                hVar.k(25, 1);
                                                hVar.k(25, c0040a.a("enum"));
                                                hVar.k(25, 6);
                                                hVar.g(h.i.b(m.b.b(cVar4.f4065f)));
                                                hVar.g(Integer.valueOf(cVar4.f4069j));
                                                str12 = f3611c;
                                                str13 = "writeWithFieldName";
                                                str14 = "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
                                            }
                                            hVar.i(182, str12, str13, str14);
                                            aVar.h(hVar, c0040a);
                                            hVar.f(fVar38);
                                            hVar.f(fVar39);
                                        } else {
                                            str11 = str10;
                                            str33 = str42;
                                            h.f fVar40 = new h.f();
                                            aVar.g(hVar, cVar4, c0040a, fVar40);
                                            aVar.b(hVar, c0040a, cVar4);
                                            hVar.k(58, c0040a.a("object"));
                                            aVar.a(hVar, cVar4, c0040a, fVar40);
                                            aVar.j(hVar, cVar4, c0040a, fVar40);
                                            hVar.f(fVar40);
                                        }
                                        aVar2 = aVar;
                                    }
                                    str7 = str11;
                                    i13 = i14 + 1;
                                    cVarArr2 = cVarArr;
                                    str31 = str6;
                                    str28 = str5;
                                    str25 = str3;
                                    str24 = str2;
                                    str23 = str7;
                                    str26 = str4;
                                    length = i6;
                                }
                            }
                            str2 = str24;
                            str3 = str25;
                            str6 = str9;
                            str4 = str26;
                            str7 = str10;
                        }
                        aVar = aVar2;
                        i6 = length;
                        str9 = str8;
                        f(hVar, cVar4, c0040a, a5, c5);
                        str10 = str23;
                        str5 = str28;
                        str2 = str24;
                        str3 = str25;
                        str6 = str9;
                        str4 = str26;
                        str7 = str10;
                    }
                }
                aVar = aVar2;
                i6 = length;
                str3 = str25;
                str4 = str26;
                str7 = str23;
                str2 = str24;
                str6 = str8;
                str5 = str28;
            }
            aVar2 = aVar;
            i13 = i14 + 1;
            cVarArr2 = cVarArr;
            str31 = str6;
            str28 = str5;
            str25 = str3;
            str24 = str2;
            str23 = str7;
            str26 = str4;
            length = i6;
        }
        String str44 = str24;
        String str45 = str25;
        String str46 = str26;
        String str47 = str28;
        String str48 = str31;
        if (!c0040a.f3624d) {
            hVar.k(25, 0);
            hVar.k(25, 1);
            hVar.k(25, 2);
            hVar.k(21, c0040a.a(str33));
            hVar.i(182, f3616h, "writeAfter", androidx.appcompat.graphics.drawable.a.c(androidx.activity.d.g(str45), f3611c, ";Ljava/lang/Object;C)C"));
            hVar.k(54, c0040a.a(str33));
        }
        h.f fVar41 = new h.f();
        hVar.k(21, c0040a.a(str33));
        hVar.d(16, 123);
        hVar.e(160, fVar41);
        hVar.k(25, c0040a.a(str46));
        hVar.k(16, 123);
        String str49 = f3614f;
        hVar.i(182, str49, str44, str48);
        hVar.f(fVar41);
        hVar.k(25, c0040a.a(str46));
        hVar.k(16, 125);
        hVar.i(182, str49, str44, str48);
        int i16 = hVar.f3034g.f2984b;
        if (c0040a.f3627g) {
            return;
        }
        hVar.k(25, 1);
        hVar.k(25, c0040a.a(str));
        hVar.i(182, f3611c, "setContext", androidx.appcompat.graphics.drawable.a.c(androidx.activity.d.g(str47), f3617i, ")V"));
    }
}
