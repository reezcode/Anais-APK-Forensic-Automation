package j;

import com.tencent.smtt.sdk.TbsListener;
import i.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

/* loaded from: classes16.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f3358c = m.b.f(i.a.class);

    /* renamed from: d, reason: collision with root package name */
    public static final String f3359d = m.b.f(i.d.class);

    /* renamed from: a, reason: collision with root package name */
    public final m.a f3360a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f3361b = new AtomicLong();

    /* renamed from: j.a$a, reason: collision with other inner class name */
    /* loaded from: classes15.dex */
    public static class C0038a {

        /* renamed from: a, reason: collision with root package name */
        public int f3362a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<String, Integer> f3363b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        public final Class<?> f3364c;

        /* renamed from: d, reason: collision with root package name */
        public final m.g f3365d;

        /* renamed from: e, reason: collision with root package name */
        public final String f3366e;

        /* renamed from: f, reason: collision with root package name */
        public m.c[] f3367f;

        public C0038a(String str, m.g gVar, int i5) {
            this.f3362a = -1;
            this.f3366e = str;
            this.f3364c = gVar.f4102a;
            this.f3362a = i5;
            this.f3365d = gVar;
            this.f3367f = gVar.f4109h;
        }

        public final Class<?> d() {
            Class<?> cls = this.f3365d.f4103b;
            return cls == null ? this.f3364c : cls;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
        public final int e(String str) {
            if (((Integer) this.f3363b.get(str)) == null) {
                this.f3363b.put(str, Integer.valueOf(this.f3362a));
                this.f3362a += 2;
            }
            return ((Integer) this.f3363b.get(str)).intValue();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
        public final int f(String str) {
            if (((Integer) this.f3363b.get(str)) == null) {
                ?? r02 = this.f3363b;
                int i5 = this.f3362a;
                this.f3362a = i5 + 1;
                r02.put(str, Integer.valueOf(i5));
            }
            return ((Integer) this.f3363b.get(str)).intValue();
        }
    }

    public a(ClassLoader classLoader) {
        this.f3360a = (m.a) classLoader;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x019c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(j.a.C0038a r13, h.h r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.a(j.a$a, h.h, boolean):void");
    }

    public final void b(C0038a c0038a, h.h hVar) {
        Constructor<?> constructor = c0038a.f3365d.f4104c;
        if (Modifier.isPublic(constructor.getModifiers())) {
            hVar.j(187, m.b.f(c0038a.d()));
            hVar.c(89);
            hVar.i(183, m.b.f(constructor.getDeclaringClass()), "<init>", "()V");
        } else {
            hVar.k(25, 0);
            hVar.k(25, 1);
            hVar.k(25, 0);
            hVar.a(180, m.b.f(n.class), "clazz", "Ljava/lang/Class;");
            hVar.i(183, m.b.f(n.class), "createInstance", androidx.appcompat.graphics.drawable.a.c(androidx.activity.d.g("(L"), f3358c, ";Ljava/lang/reflect/Type;)Ljava/lang/Object;"));
            hVar.j(192, m.b.f(c0038a.d()));
        }
        hVar.k(58, c0038a.f("instance"));
    }

    public final void c(C0038a c0038a, h.h hVar, m.c cVar, Class<?> cls, int i5) {
        i(c0038a, hVar, cVar);
        h.f fVar = new h.f();
        h.f fVar2 = new h.f();
        if ((cVar.f4070k & i.b.SupportArrayToBean.f3178b) != 0) {
            hVar.c(89);
            hVar.j(193, m.b.f(n.class));
            hVar.e(TbsListener.ErrorCode.STARTDOWNLOAD_LOCKED_IO_FAILED, fVar);
            hVar.j(192, m.b.f(n.class));
            hVar.k(25, 1);
            if (cVar.f4066g instanceof Class) {
                hVar.g(h.i.b(m.b.b(cVar.f4065f)));
            } else {
                hVar.k(25, 0);
                hVar.g(Integer.valueOf(i5));
                hVar.i(182, m.b.f(n.class), "getFieldType", "(I)Ljava/lang/reflect/Type;");
            }
            hVar.g(cVar.f4061b);
            hVar.g(Integer.valueOf(cVar.f4070k));
            hVar.i(182, m.b.f(n.class), "deserialze", androidx.appcompat.graphics.drawable.a.c(androidx.activity.d.g("(L"), f3358c, ";Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;"));
            hVar.j(192, m.b.f(cls));
            hVar.k(58, androidx.appcompat.widget.a.e(new StringBuilder(), cVar.f4061b, "_asm", c0038a));
            hVar.e(167, fVar2);
            hVar.f(fVar);
        }
        hVar.k(25, 1);
        if (cVar.f4066g instanceof Class) {
            hVar.g(h.i.b(m.b.b(cVar.f4065f)));
        } else {
            hVar.k(25, 0);
            hVar.g(Integer.valueOf(i5));
            hVar.i(182, m.b.f(n.class), "getFieldType", "(I)Ljava/lang/reflect/Type;");
        }
        hVar.g(cVar.f4061b);
        hVar.i(185, m.b.f(s.class), "deserialze", androidx.appcompat.graphics.drawable.a.c(androidx.activity.d.g("(L"), f3358c, ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;"));
        hVar.j(192, m.b.f(cls));
        hVar.k(58, androidx.appcompat.widget.a.e(new StringBuilder(), cVar.f4061b, "_asm", c0038a));
        hVar.f(fVar2);
    }

    public final void d(C0038a c0038a, h.h hVar, h.f fVar) {
        hVar.d(21, c0038a.f("matchedCount"));
        hVar.e(158, fVar);
        hVar.k(25, c0038a.f("lexer"));
        hVar.i(182, f3359d, "token", "()I");
        hVar.g(13);
        hVar.e(160, fVar);
        l(c0038a, hVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0ab1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(h.c r27, j.a.C0038a r28) {
        /*
            Method dump skipped, instructions count: 3188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.e(h.c, j.a$a):void");
    }

    public final void f(C0038a c0038a, h.h hVar, h.f fVar, m.c cVar, Class<?> cls, Class<?> cls2, int i5) {
        String str;
        String str2;
        String str3;
        String str4;
        h.f fVar2;
        String f5;
        int i6;
        h.f fVar3 = new h.f();
        String str5 = f3359d;
        hVar.i(182, str5, "matchField", "([C)Z");
        hVar.e(TbsListener.ErrorCode.STARTDOWNLOAD_LOCKED_IO_FAILED, fVar3);
        o(hVar, c0038a, i5);
        h.f fVar4 = new h.f();
        hVar.k(25, c0038a.f("lexer"));
        hVar.i(182, str5, "token", "()I");
        hVar.g(8);
        hVar.e(160, fVar4);
        hVar.k(25, c0038a.f("lexer"));
        hVar.g(16);
        hVar.i(182, str5, "nextToken", "(I)V");
        hVar.e(167, fVar3);
        hVar.f(fVar4);
        h.f fVar5 = new h.f();
        h.f fVar6 = new h.f();
        h.f fVar7 = new h.f();
        hVar.k(25, c0038a.f("lexer"));
        hVar.i(182, str5, "token", "()I");
        hVar.g(21);
        hVar.e(160, fVar6);
        hVar.k(25, c0038a.f("lexer"));
        hVar.g(14);
        hVar.i(182, str5, "nextToken", "(I)V");
        j(hVar, cls, i5, true);
        hVar.e(167, fVar5);
        hVar.f(fVar6);
        hVar.k(25, c0038a.f("lexer"));
        hVar.i(182, str5, "token", "()I");
        hVar.g(14);
        hVar.e(159, fVar7);
        hVar.k(25, c0038a.f("lexer"));
        hVar.i(182, str5, "token", "()I");
        hVar.g(12);
        hVar.e(160, fVar);
        j(hVar, cls, i5, false);
        hVar.k(58, androidx.appcompat.widget.a.e(new StringBuilder(), cVar.f4061b, "_asm", c0038a));
        h(c0038a, hVar, cVar, cls2);
        hVar.k(25, 1);
        hVar.g(h.i.b(m.b.b(cls2)));
        hVar.c(3);
        hVar.i(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
        String f6 = m.b.f(s.class);
        StringBuilder g5 = androidx.activity.d.g("(L");
        String str6 = f3358c;
        hVar.i(185, f6, "deserialze", androidx.appcompat.graphics.drawable.a.c(g5, str6, ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;"));
        hVar.k(58, c0038a.f("list_item_value"));
        hVar.k(25, androidx.appcompat.widget.a.e(new StringBuilder(), cVar.f4061b, "_asm", c0038a));
        hVar.k(25, c0038a.f("list_item_value"));
        if (cls.isInterface()) {
            str = "list_item_value";
            hVar.i(185, m.b.f(cls), "add", "(Ljava/lang/Object;)Z");
        } else {
            str = "list_item_value";
            hVar.i(182, m.b.f(cls), "add", "(Ljava/lang/Object;)Z");
        }
        hVar.c(87);
        hVar.e(167, fVar3);
        hVar.f(fVar7);
        j(hVar, cls, i5, false);
        hVar.f(fVar5);
        hVar.k(58, androidx.appcompat.widget.a.e(new StringBuilder(), cVar.f4061b, "_asm", c0038a));
        boolean e5 = i.i.e(cVar.f4065f);
        h(c0038a, hVar, cVar, cls2);
        if (e5) {
            hVar.i(185, m.b.f(s.class), "getFastMatchToken", "()I");
            hVar.k(54, c0038a.f("fastMatchToken"));
            hVar.k(25, c0038a.f("lexer"));
            hVar.k(21, c0038a.f("fastMatchToken"));
            str2 = "(I)V";
            str3 = "nextToken";
            str4 = str5;
            hVar.i(182, str4, str3, str2);
            fVar2 = fVar3;
        } else {
            str2 = "(I)V";
            str3 = "nextToken";
            str4 = str5;
            hVar.c(87);
            hVar.g(12);
            fVar2 = fVar3;
            hVar.k(54, c0038a.f("fastMatchToken"));
            k(c0038a, hVar, 12);
        }
        hVar.k(25, 1);
        String str7 = str2;
        hVar.i(182, str6, "getContext", "()" + m.b.b(i.h.class));
        hVar.k(58, c0038a.f("listContext"));
        hVar.k(25, 1);
        hVar.k(25, androidx.appcompat.widget.a.e(new StringBuilder(), cVar.f4061b, "_asm", c0038a));
        hVar.g(cVar.f4061b);
        hVar.i(182, str6, "setContext", "(Ljava/lang/Object;Ljava/lang/Object;)" + m.b.b(i.h.class));
        hVar.c(87);
        h.f fVar8 = new h.f();
        h.f fVar9 = new h.f();
        hVar.c(3);
        String str8 = str3;
        hVar.k(54, c0038a.f("i"));
        hVar.f(fVar8);
        hVar.k(25, c0038a.f("lexer"));
        hVar.i(182, str4, "token", "()I");
        hVar.g(15);
        hVar.e(159, fVar9);
        hVar.k(25, 0);
        hVar.a(180, c0038a.f3366e, androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), cVar.f4061b, "_asm_list_item_deser__"), m.b.b(s.class));
        hVar.k(25, 1);
        hVar.g(h.i.b(m.b.b(cls2)));
        hVar.k(21, c0038a.f("i"));
        hVar.i(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
        int i7 = 185;
        hVar.i(185, m.b.f(s.class), "deserialze", androidx.appcompat.widget.a.j("(L", str6, ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;"));
        String str9 = str;
        hVar.k(58, c0038a.f(str9));
        hVar.b(c0038a.f("i"));
        hVar.k(25, androidx.appcompat.widget.a.e(new StringBuilder(), cVar.f4061b, "_asm", c0038a));
        hVar.k(25, c0038a.f(str9));
        if (cls.isInterface()) {
            f5 = m.b.f(cls);
        } else {
            f5 = m.b.f(cls);
            i7 = 182;
        }
        hVar.i(i7, f5, "add", "(Ljava/lang/Object;)Z");
        hVar.c(87);
        hVar.k(25, 1);
        hVar.k(25, androidx.appcompat.widget.a.e(new StringBuilder(), cVar.f4061b, "_asm", c0038a));
        hVar.i(182, str6, "checkListResolve", "(Ljava/util/Collection;)V");
        hVar.k(25, c0038a.f("lexer"));
        hVar.i(182, str4, "token", "()I");
        hVar.g(16);
        hVar.e(160, fVar8);
        if (e5) {
            hVar.k(25, c0038a.f("lexer"));
            hVar.k(21, c0038a.f("fastMatchToken"));
            hVar.i(182, str4, str8, str7);
            i6 = 167;
        } else {
            k(c0038a, hVar, 12);
            i6 = 167;
        }
        hVar.e(i6, fVar8);
        hVar.f(fVar9);
        hVar.k(25, 1);
        hVar.k(25, c0038a.f("listContext"));
        hVar.i(182, str6, "setContext", "(" + m.b.b(i.h.class) + ")V");
        hVar.k(25, c0038a.f("lexer"));
        hVar.i(182, str4, "token", "()I");
        hVar.g(15);
        hVar.e(160, fVar);
        l(c0038a, hVar);
        hVar.f(fVar2);
    }

    public final void g(C0038a c0038a, h.h hVar, m.c cVar, Class cls, int i5) {
        h.f fVar = new h.f();
        h.f fVar2 = new h.f();
        hVar.k(25, c0038a.f("lexer"));
        hVar.k(25, 0);
        hVar.a(180, c0038a.f3366e, androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), cVar.f4061b, "_asm_prefix__"), "[C");
        hVar.i(182, f3359d, "matchField", "([C)Z");
        hVar.e(TbsListener.ErrorCode.STARTDOWNLOAD_NEEDDOWNLOAD_KEY_ERROR, fVar);
        hVar.c(1);
        hVar.k(58, androidx.appcompat.widget.a.e(new StringBuilder(), cVar.f4061b, "_asm", c0038a));
        hVar.e(167, fVar2);
        hVar.f(fVar);
        o(hVar, c0038a, i5);
        hVar.k(21, c0038a.f("matchedCount"));
        hVar.c(4);
        hVar.c(96);
        hVar.k(54, c0038a.f("matchedCount"));
        c(c0038a, hVar, cVar, cls, i5);
        hVar.k(25, 1);
        String str = f3358c;
        hVar.i(182, str, "getResolveStatus", "()I");
        hVar.g(1);
        hVar.e(160, fVar2);
        hVar.k(25, 1);
        hVar.i(182, str, "getLastResolveTask", "()" + m.b.b(a.C0035a.class));
        hVar.k(58, c0038a.f("resolveTask"));
        hVar.k(25, c0038a.f("resolveTask"));
        hVar.k(25, 1);
        hVar.i(182, str, "getContext", "()" + m.b.b(i.h.class));
        hVar.a(181, m.b.f(a.C0035a.class), "ownerContext", m.b.b(i.h.class));
        hVar.k(25, c0038a.f("resolveTask"));
        hVar.k(25, 0);
        hVar.g(cVar.f4061b);
        String f5 = m.b.f(n.class);
        StringBuilder g5 = androidx.activity.d.g("(Ljava/lang/String;)");
        g5.append(m.b.b(k.class));
        hVar.i(182, f5, "getFieldDeserializer", g5.toString());
        hVar.a(181, m.b.f(a.C0035a.class), "fieldDeserializer", m.b.b(k.class));
        hVar.k(25, 1);
        hVar.g(0);
        hVar.i(182, str, "setResolveStatus", "(I)V");
        hVar.f(fVar2);
    }

    public final void h(C0038a c0038a, h.h hVar, m.c cVar, Class<?> cls) {
        h.f fVar = new h.f();
        hVar.k(25, 0);
        hVar.a(180, c0038a.f3366e, androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), cVar.f4061b, "_asm_list_item_deser__"), m.b.b(s.class));
        hVar.e(199, fVar);
        hVar.k(25, 0);
        hVar.k(25, 1);
        String str = f3358c;
        StringBuilder g5 = androidx.activity.d.g("()");
        g5.append(m.b.b(i.i.class));
        hVar.i(182, str, "getConfig", g5.toString());
        hVar.g(h.i.b(m.b.b(cls)));
        String f5 = m.b.f(i.i.class);
        StringBuilder g6 = androidx.activity.d.g("(Ljava/lang/reflect/Type;)");
        g6.append(m.b.b(s.class));
        hVar.i(182, f5, "getDeserializer", g6.toString());
        hVar.a(181, c0038a.f3366e, androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), cVar.f4061b, "_asm_list_item_deser__"), m.b.b(s.class));
        hVar.f(fVar);
        hVar.k(25, 0);
        hVar.a(180, c0038a.f3366e, androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), cVar.f4061b, "_asm_list_item_deser__"), m.b.b(s.class));
    }

    public final void i(C0038a c0038a, h.h hVar, m.c cVar) {
        h.f fVar = new h.f();
        hVar.k(25, 0);
        hVar.a(180, c0038a.f3366e, androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), cVar.f4061b, "_asm_deser__"), m.b.b(s.class));
        hVar.e(199, fVar);
        hVar.k(25, 0);
        hVar.k(25, 1);
        String str = f3358c;
        StringBuilder g5 = androidx.activity.d.g("()");
        g5.append(m.b.b(i.i.class));
        hVar.i(182, str, "getConfig", g5.toString());
        hVar.g(h.i.b(m.b.b(cVar.f4065f)));
        String f5 = m.b.f(i.i.class);
        StringBuilder g6 = androidx.activity.d.g("(Ljava/lang/reflect/Type;)");
        g6.append(m.b.b(s.class));
        hVar.i(182, f5, "getDeserializer", g6.toString());
        hVar.a(181, c0038a.f3366e, androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), cVar.f4061b, "_asm_deser__"), m.b.b(s.class));
        hVar.f(fVar);
        hVar.k(25, 0);
        hVar.a(180, c0038a.f3366e, androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), cVar.f4061b, "_asm_deser__"), m.b.b(s.class));
    }

    public final void j(h.h hVar, Class<?> cls, int i5, boolean z4) {
        Class cls2;
        String f5;
        if (!cls.isAssignableFrom(ArrayList.class) || z4) {
            if (!cls.isAssignableFrom(LinkedList.class) || z4) {
                if (!cls.isAssignableFrom(HashSet.class)) {
                    if (cls.isAssignableFrom(TreeSet.class)) {
                        hVar.j(187, m.b.f(TreeSet.class));
                        hVar.c(89);
                        cls2 = TreeSet.class;
                    } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
                        hVar.j(187, m.b.f(LinkedHashSet.class));
                        hVar.c(89);
                        cls2 = LinkedHashSet.class;
                    } else if (!z4) {
                        hVar.k(25, 0);
                        hVar.g(Integer.valueOf(i5));
                        hVar.i(182, m.b.f(n.class), "getFieldType", "(I)Ljava/lang/reflect/Type;");
                        hVar.i(184, m.b.f(m.j.class), "createCollection", "(Ljava/lang/reflect/Type;)Ljava/util/Collection;");
                        hVar.j(192, m.b.f(cls));
                    }
                }
                hVar.j(187, m.b.f(HashSet.class));
                hVar.c(89);
                cls2 = HashSet.class;
            } else {
                hVar.j(187, m.b.f(LinkedList.class));
                hVar.c(89);
                cls2 = LinkedList.class;
            }
            f5 = m.b.f(cls2);
        } else {
            f5 = "java/util/ArrayList";
            hVar.j(187, "java/util/ArrayList");
            hVar.c(89);
        }
        hVar.i(183, f5, "<init>", "()V");
        hVar.j(192, m.b.f(cls));
    }

    public final void k(C0038a c0038a, h.h hVar, int i5) {
        int i6;
        h.f fVar = new h.f();
        h.f fVar2 = new h.f();
        hVar.k(25, c0038a.f("lexer"));
        String str = f3359d;
        hVar.i(182, str, "getCurrent", "()C");
        if (i5 == 12) {
            i6 = 123;
        } else {
            if (i5 != 14) {
                throw new IllegalStateException();
            }
            i6 = 91;
        }
        hVar.k(16, i6);
        hVar.e(160, fVar);
        hVar.k(25, c0038a.f("lexer"));
        hVar.i(182, str, "next", "()C");
        hVar.c(87);
        hVar.k(25, c0038a.f("lexer"));
        hVar.g(Integer.valueOf(i5));
        hVar.i(182, str, "setToken", "(I)V");
        hVar.e(167, fVar2);
        hVar.f(fVar);
        hVar.k(25, c0038a.f("lexer"));
        hVar.g(Integer.valueOf(i5));
        hVar.i(182, str, "nextToken", "(I)V");
        hVar.f(fVar2);
    }

    public final void l(C0038a c0038a, h.h hVar) {
        h.f fVar = new h.f();
        h.f fVar2 = new h.f();
        h.f fVar3 = new h.f();
        h.f fVar4 = new h.f();
        h.f fVar5 = new h.f();
        hVar.k(25, c0038a.f("lexer"));
        String str = f3359d;
        hVar.i(182, str, "getCurrent", "()C");
        hVar.c(89);
        hVar.k(54, c0038a.f("ch"));
        hVar.k(16, 44);
        hVar.e(160, fVar2);
        hVar.k(25, c0038a.f("lexer"));
        hVar.i(182, str, "next", "()C");
        hVar.c(87);
        hVar.k(25, c0038a.f("lexer"));
        hVar.g(16);
        hVar.i(182, str, "setToken", "(I)V");
        hVar.e(167, fVar5);
        hVar.f(fVar2);
        hVar.k(21, c0038a.f("ch"));
        hVar.k(16, 125);
        hVar.e(160, fVar3);
        hVar.k(25, c0038a.f("lexer"));
        hVar.i(182, str, "next", "()C");
        hVar.c(87);
        hVar.k(25, c0038a.f("lexer"));
        hVar.g(13);
        hVar.i(182, str, "setToken", "(I)V");
        hVar.e(167, fVar5);
        hVar.f(fVar3);
        hVar.k(21, c0038a.f("ch"));
        hVar.k(16, 93);
        hVar.e(160, fVar4);
        hVar.k(25, c0038a.f("lexer"));
        hVar.i(182, str, "next", "()C");
        hVar.c(87);
        hVar.k(25, c0038a.f("lexer"));
        hVar.g(15);
        hVar.i(182, str, "setToken", "(I)V");
        hVar.e(167, fVar5);
        hVar.f(fVar4);
        hVar.k(21, c0038a.f("ch"));
        hVar.k(16, 26);
        hVar.e(160, fVar);
        hVar.k(25, c0038a.f("lexer"));
        hVar.g(20);
        hVar.i(182, str, "setToken", "(I)V");
        hVar.e(167, fVar5);
        hVar.f(fVar);
        hVar.k(25, c0038a.f("lexer"));
        hVar.i(182, str, "nextToken", "()V");
        hVar.f(fVar5);
    }

    public final void m(h.h hVar, m.c cVar) {
        Method method = cVar.f4062c;
        if (method == null) {
            hVar.a(181, m.b.f(cVar.f4067h), cVar.f4063d.getName(), m.b.b(cVar.f4065f));
            return;
        }
        hVar.i(method.getDeclaringClass().isInterface() ? 185 : 182, m.b.f(cVar.f4067h), method.getName(), m.b.c(method));
        if (cVar.f4062c.getReturnType().equals(Void.TYPE)) {
            return;
        }
        hVar.c(87);
    }

    public final void n(C0038a c0038a, h.h hVar) {
        hVar.k(25, 1);
        hVar.k(25, c0038a.f("context"));
        String str = f3358c;
        StringBuilder g5 = androidx.activity.d.g("(");
        g5.append(m.b.b(i.h.class));
        g5.append(")V");
        hVar.i(182, str, "setContext", g5.toString());
        h.f fVar = new h.f();
        hVar.k(25, c0038a.f("childContext"));
        hVar.e(198, fVar);
        hVar.k(25, c0038a.f("childContext"));
        hVar.k(25, c0038a.f("instance"));
        hVar.a(181, m.b.f(i.h.class), "object", "Ljava/lang/Object;");
        hVar.f(fVar);
    }

    public final void o(h.h hVar, C0038a c0038a, int i5) {
        StringBuilder g5 = androidx.activity.d.g("_asm_flag_");
        g5.append(i5 / 32);
        String sb = g5.toString();
        hVar.k(21, c0038a.f(sb));
        hVar.g(Integer.valueOf(1 << i5));
        hVar.c(128);
        hVar.k(54, c0038a.f(sb));
    }

    public final s p(i.i iVar, m.g gVar) {
        a aVar;
        Class<n> cls;
        String str;
        int i5;
        int e5;
        int i6;
        String f5;
        String str2;
        int i7;
        String str3;
        int e6;
        int i8;
        String str4;
        String str5;
        String str6;
        int i9;
        String str7;
        String str8;
        String str9;
        h.f fVar;
        StringBuilder sb;
        String str10;
        String str11;
        String str12;
        int i10;
        int i11;
        int i12;
        String str13;
        a aVar2 = this;
        Class<n> cls2 = n.class;
        Class<?> cls3 = gVar.f4102a;
        if (cls3.isPrimitive()) {
            throw new IllegalArgumentException(androidx.appcompat.view.a.g(cls3, androidx.activity.d.g("not support type :")));
        }
        StringBuilder g5 = androidx.activity.d.g("FastjsonASMDeserializer_");
        g5.append(aVar2.f3361b.incrementAndGet());
        g5.append("_");
        g5.append(cls3.getSimpleName());
        String sb2 = g5.toString();
        String name = a.class.getPackage().getName();
        String str14 = name.replace(FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX) + "/" + sb2;
        String j5 = androidx.appcompat.widget.a.j(name, ".", sb2);
        h.c cVar = new h.c();
        cVar.g(str14, m.b.f(cls2), null);
        new HashMap();
        m.c[] cVarArr = gVar.f4109h;
        int i13 = 0;
        for (int length = cVarArr.length; i13 < length; length = length) {
            new h.d(cVar, androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), cVarArr[i13].f4061b, "_asm_prefix__"), "[C");
            i13++;
        }
        int length2 = cVarArr.length;
        int i14 = 0;
        while (i14 < length2) {
            m.c cVar2 = cVarArr[i14];
            Class<?> cls4 = cVar2.f4065f;
            if (cls4.isPrimitive()) {
                i12 = length2;
                str13 = j5;
            } else {
                i12 = length2;
                if (Collection.class.isAssignableFrom(cls4)) {
                    str13 = j5;
                    new h.d(cVar, androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), cVar2.f4061b, "_asm_list_item_deser__"), m.b.b(s.class));
                } else {
                    str13 = j5;
                    new h.d(cVar, androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), cVar2.f4061b, "_asm_deser__"), m.b.b(s.class));
                }
            }
            i14++;
            length2 = i12;
            j5 = str13;
        }
        String str15 = j5;
        StringBuilder g6 = androidx.activity.d.g("(");
        g6.append(m.b.b(i.i.class));
        g6.append(m.b.b(m.g.class));
        g6.append(")V");
        String str16 = "<init>";
        h.h hVar = new h.h(cVar, "<init>", g6.toString(), null);
        hVar.k(25, 0);
        hVar.k(25, 1);
        hVar.k(25, 2);
        String f6 = m.b.f(cls2);
        StringBuilder g7 = androidx.activity.d.g("(");
        g7.append(m.b.b(i.i.class));
        g7.append(m.b.b(m.g.class));
        g7.append(")V");
        hVar.i(183, f6, "<init>", g7.toString());
        int i15 = 0;
        for (int length3 = cVarArr.length; i15 < length3; length3 = length3) {
            m.c cVar3 = cVarArr[i15];
            hVar.k(25, 0);
            hVar.g("\"" + cVar3.f4061b + "\":");
            hVar.a(181, str14, androidx.appcompat.graphics.drawable.a.c(androidx.appcompat.graphics.drawable.a.d(hVar, 182, "java/lang/String", "toCharArray", "()[C"), cVar3.f4061b, "_asm_prefix__"), "[C");
            i15++;
            cVarArr = cVarArr;
        }
        hVar.c(TbsListener.ErrorCode.NONEEDDOWNLOAD_OTHER_PROCESS_DOWNLOADING);
        hVar.f3035h = 4;
        hVar.f3036i = 4;
        new HashMap();
        Class<?> cls5 = gVar.f4102a;
        if (Modifier.isPublic(gVar.f4104c.getModifiers())) {
            h.h hVar2 = new h.h(cVar, "createInstance", androidx.appcompat.graphics.drawable.a.c(androidx.activity.d.g("(L"), f3358c, ";Ljava/lang/reflect/Type;)Ljava/lang/Object;"), null);
            Class<?> cls6 = gVar.f4103b;
            if (cls6 == null) {
                cls6 = cls5;
            }
            hVar2.j(187, m.b.f(cls6));
            hVar2.c(89);
            Class<?> cls7 = gVar.f4103b;
            if (cls7 != null) {
                cls5 = cls7;
            }
            hVar2.i(183, m.b.f(cls5), "<init>", "()V");
            hVar2.c(176);
            hVar2.f3035h = 3;
            hVar2.f3036i = 3;
        }
        aVar2.e(cVar, new C0038a(str14, gVar, 5));
        C0038a c0038a = new C0038a(str14, gVar, 4);
        h.h hVar3 = new h.h(cVar, "deserialzeArrayMapping", androidx.appcompat.graphics.drawable.a.c(androidx.activity.d.g("(L"), f3358c, ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"), null);
        aVar2.q(c0038a, hVar3);
        aVar2.b(c0038a, hVar3);
        m.c[] cVarArr2 = c0038a.f3365d.f4110i;
        int length4 = cVarArr2.length;
        a aVar3 = aVar2;
        int i16 = 0;
        while (true) {
            h.c cVar4 = cVar;
            if (i16 >= length4) {
                a aVar4 = aVar3;
                aVar4.a(c0038a, hVar3, false);
                h.f fVar2 = new h.f();
                h.f fVar3 = new h.f();
                h.f fVar4 = new h.f();
                h.f fVar5 = new h.f();
                hVar3.k(25, c0038a.f("lexer"));
                String str17 = f3359d;
                hVar3.i(182, str17, "getCurrent", "()C");
                hVar3.c(89);
                hVar3.k(54, c0038a.f("ch"));
                hVar3.k(16, 44);
                hVar3.e(160, fVar3);
                hVar3.k(25, c0038a.f("lexer"));
                hVar3.i(182, str17, "next", "()C");
                hVar3.c(87);
                hVar3.k(25, c0038a.f("lexer"));
                hVar3.g(16);
                hVar3.i(182, str17, "setToken", "(I)V");
                hVar3.e(167, fVar5);
                hVar3.f(fVar3);
                hVar3.k(21, c0038a.f("ch"));
                hVar3.k(16, 93);
                hVar3.e(160, fVar4);
                hVar3.k(25, c0038a.f("lexer"));
                hVar3.i(182, str17, "next", "()C");
                hVar3.c(87);
                hVar3.k(25, c0038a.f("lexer"));
                hVar3.g(15);
                hVar3.i(182, str17, "setToken", "(I)V");
                hVar3.e(167, fVar5);
                hVar3.f(fVar4);
                hVar3.k(21, c0038a.f("ch"));
                hVar3.k(16, 26);
                hVar3.e(160, fVar2);
                hVar3.k(25, c0038a.f("lexer"));
                hVar3.i(182, str17, "next", "()C");
                hVar3.c(87);
                hVar3.k(25, c0038a.f("lexer"));
                hVar3.g(20);
                hVar3.i(182, str17, "setToken", "(I)V");
                hVar3.e(167, fVar5);
                hVar3.f(fVar2);
                hVar3.k(25, c0038a.f("lexer"));
                hVar3.g(16);
                hVar3.i(182, str17, "nextToken", "(I)V");
                hVar3.f(fVar5);
                hVar3.k(25, c0038a.f("instance"));
                hVar3.c(176);
                int i17 = c0038a.f3362a;
                hVar3.f3035h = 5;
                hVar3.f3036i = i17;
                byte[] f7 = cVar4.f();
                return (s) aVar4.f3360a.a(str15, f7, f7.length).getConstructor(i.i.class, m.g.class).newInstance(iVar, gVar);
            }
            a aVar5 = aVar3;
            boolean z4 = i16 == length4 + (-1);
            int i18 = z4 ? 93 : 44;
            int i19 = length4;
            m.c cVar5 = cVarArr2[i16];
            m.c[] cVarArr3 = cVarArr2;
            Class<?> cls8 = cVar5.f4065f;
            String str18 = str16;
            Type type = cVar5.f4066g;
            int i20 = i16;
            if (cls8 == Byte.TYPE || cls8 == Short.TYPE || cls8 == Integer.TYPE) {
                aVar = aVar2;
                cls = cls2;
                str = str18;
                i5 = i20;
                hVar3.k(25, c0038a.f("lexer"));
                hVar3.k(16, i18);
                e5 = androidx.appcompat.widget.a.e(androidx.appcompat.graphics.drawable.a.d(hVar3, 182, f3359d, "scanInt", "(C)I"), cVar5.f4061b, "_asm", c0038a);
                i6 = 54;
            } else {
                cls = cls2;
                if (cls8 == Byte.class) {
                    hVar3.k(25, c0038a.f("lexer"));
                    hVar3.k(16, i18);
                    String str19 = f3359d;
                    hVar3.i(182, str19, "scanInt", "(C)I");
                    hVar3.k(58, androidx.appcompat.widget.a.e(androidx.appcompat.graphics.drawable.a.d(hVar3, 184, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;"), cVar5.f4061b, "_asm", c0038a));
                    fVar = new h.f();
                    hVar3.k(25, c0038a.f("lexer"));
                    hVar3.a(180, str19, "matchStat", "I");
                    hVar3.g(5);
                    hVar3.e(160, fVar);
                    hVar3.c(1);
                    sb = new StringBuilder();
                } else if (cls8 == Short.class) {
                    hVar3.k(25, c0038a.f("lexer"));
                    hVar3.k(16, i18);
                    String str20 = f3359d;
                    hVar3.i(182, str20, "scanInt", "(C)I");
                    hVar3.k(58, androidx.appcompat.widget.a.e(androidx.appcompat.graphics.drawable.a.d(hVar3, 184, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;"), cVar5.f4061b, "_asm", c0038a));
                    fVar = new h.f();
                    hVar3.k(25, c0038a.f("lexer"));
                    hVar3.a(180, str20, "matchStat", "I");
                    hVar3.g(5);
                    hVar3.e(160, fVar);
                    hVar3.c(1);
                    sb = new StringBuilder();
                } else if (cls8 == Integer.class) {
                    hVar3.k(25, c0038a.f("lexer"));
                    hVar3.k(16, i18);
                    String str21 = f3359d;
                    hVar3.i(182, str21, "scanInt", "(C)I");
                    hVar3.k(58, androidx.appcompat.widget.a.e(androidx.appcompat.graphics.drawable.a.d(hVar3, 184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;"), cVar5.f4061b, "_asm", c0038a));
                    fVar = new h.f();
                    hVar3.k(25, c0038a.f("lexer"));
                    hVar3.a(180, str21, "matchStat", "I");
                    hVar3.g(5);
                    hVar3.e(160, fVar);
                    hVar3.c(1);
                    sb = new StringBuilder();
                } else {
                    if (cls8 == Long.TYPE) {
                        hVar3.k(25, c0038a.f("lexer"));
                        hVar3.k(16, i18);
                        str10 = f3359d;
                        str11 = "scanLong";
                        str12 = "(C)J";
                        i10 = 182;
                        i11 = 55;
                    } else if (cls8 == Long.class) {
                        hVar3.k(25, c0038a.f("lexer"));
                        hVar3.k(16, i18);
                        String str22 = f3359d;
                        hVar3.i(182, str22, "scanLong", "(C)J");
                        hVar3.k(58, androidx.appcompat.widget.a.e(androidx.appcompat.graphics.drawable.a.d(hVar3, 184, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;"), cVar5.f4061b, "_asm", c0038a));
                        fVar = new h.f();
                        hVar3.k(25, c0038a.f("lexer"));
                        hVar3.a(180, str22, "matchStat", "I");
                        hVar3.g(5);
                        hVar3.e(160, fVar);
                        hVar3.c(1);
                        sb = new StringBuilder();
                    } else {
                        if (cls8 == Boolean.TYPE) {
                            hVar3.k(25, c0038a.f("lexer"));
                            hVar3.k(16, i18);
                            str7 = f3359d;
                            str8 = "scanBoolean";
                            str9 = "(C)Z";
                            i9 = 182;
                        } else if (cls8 == Float.TYPE) {
                            hVar3.k(25, c0038a.f("lexer"));
                            hVar3.k(16, i18);
                            e6 = androidx.appcompat.widget.a.e(androidx.appcompat.graphics.drawable.a.d(hVar3, 182, f3359d, "scanFloat", "(C)F"), cVar5.f4061b, "_asm", c0038a);
                            i8 = 56;
                            aVar = this;
                            hVar3.k(i8, e6);
                            i5 = i20;
                            str = str18;
                            aVar3 = aVar;
                            i16 = i5 + 1;
                            str16 = str;
                            aVar2 = aVar;
                            cVar = cVar4;
                            length4 = i19;
                            cVarArr2 = cVarArr3;
                            cls2 = cls;
                        } else if (cls8 == Float.class) {
                            hVar3.k(25, c0038a.f("lexer"));
                            hVar3.k(16, i18);
                            String str23 = f3359d;
                            hVar3.i(182, str23, "scanFloat", "(C)F");
                            hVar3.k(58, androidx.appcompat.widget.a.e(androidx.appcompat.graphics.drawable.a.d(hVar3, 184, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;"), cVar5.f4061b, "_asm", c0038a));
                            fVar = new h.f();
                            hVar3.k(25, c0038a.f("lexer"));
                            hVar3.a(180, str23, "matchStat", "I");
                            hVar3.g(5);
                            hVar3.e(160, fVar);
                            hVar3.c(1);
                            sb = new StringBuilder();
                        } else if (cls8 == Double.TYPE) {
                            hVar3.k(25, c0038a.f("lexer"));
                            hVar3.k(16, i18);
                            str10 = f3359d;
                            str11 = "scanDouble";
                            str12 = "(C)D";
                            i10 = 182;
                            i11 = 57;
                        } else if (cls8 == Double.class) {
                            hVar3.k(25, c0038a.f("lexer"));
                            hVar3.k(16, i18);
                            String str24 = f3359d;
                            hVar3.i(182, str24, "scanDouble", "(C)D");
                            hVar3.k(58, androidx.appcompat.widget.a.e(androidx.appcompat.graphics.drawable.a.d(hVar3, 184, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;"), cVar5.f4061b, "_asm", c0038a));
                            fVar = new h.f();
                            hVar3.k(25, c0038a.f("lexer"));
                            hVar3.a(180, str24, "matchStat", "I");
                            hVar3.g(5);
                            hVar3.e(160, fVar);
                            hVar3.c(1);
                            sb = new StringBuilder();
                        } else if (cls8 == Character.TYPE) {
                            hVar3.k(25, c0038a.f("lexer"));
                            hVar3.k(16, i18);
                            i9 = 182;
                            hVar3.i(182, f3359d, "scanString", "(C)Ljava/lang/String;");
                            hVar3.c(3);
                            str7 = "java/lang/String";
                            str8 = "charAt";
                            str9 = "(I)C";
                        } else {
                            if (cls8 == String.class) {
                                hVar3.k(25, c0038a.f("lexer"));
                                hVar3.k(16, i18);
                                str4 = f3359d;
                                str5 = "scanString";
                                str6 = "(C)Ljava/lang/String;";
                            } else if (cls8 == BigDecimal.class) {
                                hVar3.k(25, c0038a.f("lexer"));
                                hVar3.k(16, i18);
                                str4 = f3359d;
                                str5 = "scanDecimal";
                                str6 = "(C)Ljava/math/BigDecimal;";
                            } else if (cls8 == Date.class) {
                                hVar3.k(25, c0038a.f("lexer"));
                                hVar3.k(16, i18);
                                str4 = f3359d;
                                str5 = "scanDate";
                                str6 = "(C)Ljava/util/Date;";
                            } else if (cls8 == UUID.class) {
                                hVar3.k(25, c0038a.f("lexer"));
                                hVar3.k(16, i18);
                                str4 = f3359d;
                                str5 = "scanUUID";
                                str6 = "(C)Ljava/util/UUID;";
                            } else if (cls8.isEnum()) {
                                h.f fVar6 = new h.f();
                                h.f fVar7 = new h.f();
                                h.f fVar8 = new h.f();
                                h.f fVar9 = new h.f();
                                hVar3.k(25, c0038a.f("lexer"));
                                String str25 = f3359d;
                                hVar3.i(182, str25, "getCurrent", "()C");
                                hVar3.c(89);
                                hVar3.k(54, c0038a.f("ch"));
                                hVar3.g(110);
                                hVar3.e(159, fVar9);
                                hVar3.k(21, c0038a.f("ch"));
                                hVar3.g(34);
                                hVar3.e(160, fVar6);
                                hVar3.f(fVar9);
                                hVar3.k(25, c0038a.f("lexer"));
                                hVar3.g(h.i.b(m.b.b(cls8)));
                                hVar3.k(25, 1);
                                String str26 = f3358c;
                                StringBuilder g8 = androidx.activity.d.g("()");
                                g8.append(m.b.b(i.j.class));
                                hVar3.i(182, str26, "getSymbolTable", g8.toString());
                                hVar3.k(16, i18);
                                hVar3.i(182, str25, "scanEnum", "(Ljava/lang/Class;" + m.b.b(i.j.class) + "C)Ljava/lang/Enum;");
                                hVar3.e(167, fVar8);
                                hVar3.f(fVar6);
                                hVar3.k(21, c0038a.f("ch"));
                                hVar3.g(48);
                                hVar3.e(161, fVar7);
                                hVar3.k(21, c0038a.f("ch"));
                                hVar3.g(57);
                                hVar3.e(163, fVar7);
                                aVar = this;
                                aVar.i(c0038a, hVar3, cVar5);
                                hVar3.j(192, m.b.f(g.class));
                                hVar3.k(25, c0038a.f("lexer"));
                                hVar3.k(16, i18);
                                hVar3.i(182, str25, "scanInt", "(C)I");
                                hVar3.i(182, m.b.f(g.class), "valueOf", "(I)Ljava/lang/Enum;");
                                hVar3.e(167, fVar8);
                                hVar3.f(fVar7);
                                hVar3.k(25, 0);
                                hVar3.k(25, c0038a.f("lexer"));
                                hVar3.k(16, i18);
                                hVar3.i(182, m.b.f(cls), "scanEnum", androidx.appcompat.widget.a.j("(L", str25, ";C)Ljava/lang/Enum;"));
                                hVar3.f(fVar8);
                                hVar3.j(192, m.b.f(cls8));
                                e6 = androidx.appcompat.widget.a.e(new StringBuilder(), cVar5.f4061b, "_asm", c0038a);
                                i8 = 58;
                                hVar3.k(i8, e6);
                                i5 = i20;
                                str = str18;
                                aVar3 = aVar;
                                i16 = i5 + 1;
                                str16 = str;
                                aVar2 = aVar;
                                cVar = cVar4;
                                length4 = i19;
                                cVarArr2 = cVarArr3;
                                cls2 = cls;
                            } else {
                                aVar = this;
                                if (Collection.class.isAssignableFrom(cls8)) {
                                    Class<?> x4 = m.j.x(type);
                                    if (x4 == String.class) {
                                        if (cls8 == List.class || cls8 == Collections.class || cls8 == ArrayList.class) {
                                            hVar3.j(187, m.b.f(ArrayList.class));
                                            hVar3.c(89);
                                            f5 = m.b.f(ArrayList.class);
                                            str2 = "()V";
                                            i7 = 183;
                                            str3 = str18;
                                        } else {
                                            hVar3.g(h.i.b(m.b.b(cls8)));
                                            f5 = m.b.f(m.j.class);
                                            str3 = "createCollection";
                                            str2 = "(Ljava/lang/Class;)Ljava/util/Collection;";
                                            i7 = 184;
                                        }
                                        hVar3.k(58, androidx.appcompat.widget.a.e(androidx.appcompat.graphics.drawable.a.d(hVar3, i7, f5, str3, str2), cVar5.f4061b, "_asm", c0038a));
                                        hVar3.k(25, c0038a.f("lexer"));
                                        hVar3.k(25, androidx.appcompat.widget.a.e(new StringBuilder(), cVar5.f4061b, "_asm", c0038a));
                                        hVar3.k(16, i18);
                                        String str27 = f3359d;
                                        hVar3.i(182, str27, "scanStringArray", "(Ljava/util/Collection;C)V");
                                        h.f fVar10 = new h.f();
                                        hVar3.k(25, c0038a.f("lexer"));
                                        hVar3.a(180, str27, "matchStat", "I");
                                        hVar3.g(5);
                                        hVar3.e(160, fVar10);
                                        hVar3.c(1);
                                        hVar3.k(58, androidx.appcompat.widget.a.e(new StringBuilder(), cVar5.f4061b, "_asm", c0038a));
                                        hVar3.f(fVar10);
                                        i5 = i20;
                                        str = str18;
                                        aVar3 = aVar;
                                        i16 = i5 + 1;
                                        str16 = str;
                                        aVar2 = aVar;
                                        cVar = cVar4;
                                        length4 = i19;
                                        cVarArr2 = cVarArr3;
                                        cls2 = cls;
                                    } else {
                                        h.f fVar11 = new h.f();
                                        hVar3.k(25, c0038a.f("lexer"));
                                        String str28 = f3359d;
                                        hVar3.i(182, str28, "token", "()I");
                                        hVar3.k(54, c0038a.f("token"));
                                        hVar3.k(21, c0038a.f("token"));
                                        hVar3.g(Integer.valueOf(i20 == 0 ? 14 : 16));
                                        hVar3.e(159, fVar11);
                                        hVar3.k(25, 1);
                                        hVar3.k(21, c0038a.f("token"));
                                        String str29 = f3358c;
                                        hVar3.i(182, str29, "throwException", "(I)V");
                                        hVar3.f(fVar11);
                                        h.f fVar12 = new h.f();
                                        h.f fVar13 = new h.f();
                                        hVar3.k(25, c0038a.f("lexer"));
                                        hVar3.i(182, str28, "getCurrent", "()C");
                                        hVar3.k(16, 91);
                                        hVar3.e(160, fVar12);
                                        hVar3.k(25, c0038a.f("lexer"));
                                        hVar3.i(182, str28, "next", "()C");
                                        hVar3.c(87);
                                        hVar3.k(25, c0038a.f("lexer"));
                                        hVar3.g(14);
                                        hVar3.i(182, str28, "setToken", "(I)V");
                                        hVar3.e(167, fVar13);
                                        hVar3.f(fVar12);
                                        hVar3.k(25, c0038a.f("lexer"));
                                        hVar3.g(14);
                                        hVar3.i(182, str28, "nextToken", "(I)V");
                                        hVar3.f(fVar13);
                                        i5 = i20;
                                        aVar.j(hVar3, cls8, i5, false);
                                        hVar3.c(89);
                                        hVar3.k(58, androidx.appcompat.widget.a.e(new StringBuilder(), cVar5.f4061b, "_asm", c0038a));
                                        aVar.h(c0038a, hVar3, cVar5, x4);
                                        hVar3.k(25, 1);
                                        hVar3.g(h.i.b(m.b.b(x4)));
                                        hVar3.k(25, 3);
                                        String f8 = m.b.f(cls);
                                        StringBuilder g9 = androidx.activity.d.g("(Ljava/util/Collection;");
                                        g9.append(m.b.b(s.class));
                                        g9.append("L");
                                        g9.append(str29);
                                        g9.append(";Ljava/lang/reflect/Type;Ljava/lang/Object;)V");
                                        hVar3.i(184, f8, "parseArray", g9.toString());
                                        str = str18;
                                        aVar3 = aVar;
                                        i16 = i5 + 1;
                                        str16 = str;
                                        aVar2 = aVar;
                                        cVar = cVar4;
                                        length4 = i19;
                                        cVarArr2 = cVarArr3;
                                        cls2 = cls;
                                    }
                                } else {
                                    i5 = i20;
                                    if (cls8.isArray()) {
                                        hVar3.k(25, c0038a.f("lexer"));
                                        hVar3.g(14);
                                        hVar3.i(182, f3359d, "nextToken", "(I)V");
                                        hVar3.k(25, 1);
                                        hVar3.k(25, 0);
                                        hVar3.g(Integer.valueOf(i5));
                                        hVar3.i(182, m.b.f(cls), "getFieldType", "(I)Ljava/lang/reflect/Type;");
                                        hVar3.i(182, f3358c, "parseObject", "(Ljava/lang/reflect/Type;)Ljava/lang/Object;");
                                        hVar3.j(192, m.b.f(cls8));
                                        e5 = androidx.appcompat.widget.a.e(new StringBuilder(), cVar5.f4061b, "_asm", c0038a);
                                        i6 = 58;
                                        aVar5 = aVar;
                                        str = str18;
                                    } else {
                                        h.f fVar14 = new h.f();
                                        h.f fVar15 = new h.f();
                                        if (cls8 == Date.class) {
                                            hVar3.k(25, c0038a.f("lexer"));
                                            String str30 = f3359d;
                                            hVar3.i(182, str30, "getCurrent", "()C");
                                            hVar3.g(49);
                                            hVar3.e(160, fVar14);
                                            hVar3.j(187, m.b.f(Date.class));
                                            hVar3.c(89);
                                            hVar3.k(25, c0038a.f("lexer"));
                                            hVar3.k(16, i18);
                                            hVar3.i(182, str30, "scanLong", "(C)J");
                                            str = str18;
                                            hVar3.i(183, m.b.f(Date.class), str, "(J)V");
                                            hVar3.k(58, androidx.appcompat.widget.a.e(new StringBuilder(), cVar5.f4061b, "_asm", c0038a));
                                            hVar3.e(167, fVar15);
                                        } else {
                                            str = str18;
                                        }
                                        hVar3.f(fVar14);
                                        aVar.k(c0038a, hVar3, 14);
                                        c(c0038a, hVar3, cVar5, cls8, i5);
                                        hVar3.k(25, c0038a.f("lexer"));
                                        hVar3.i(182, f3359d, "token", "()I");
                                        hVar3.g(15);
                                        hVar3.e(159, fVar15);
                                        hVar3.k(25, 0);
                                        hVar3.k(25, c0038a.f("lexer"));
                                        hVar3.g(Integer.valueOf(!z4 ? 16 : 15));
                                        String f9 = m.b.f(cls);
                                        StringBuilder g10 = androidx.activity.d.g("(");
                                        g10.append(m.b.b(i.c.class));
                                        g10.append("I)V");
                                        hVar3.i(183, f9, "check", g10.toString());
                                        hVar3.f(fVar15);
                                        aVar3 = aVar;
                                        i16 = i5 + 1;
                                        str16 = str;
                                        aVar2 = aVar;
                                        cVar = cVar4;
                                        length4 = i19;
                                        cVarArr2 = cVarArr3;
                                        cls2 = cls;
                                    }
                                }
                            }
                            hVar3.k(58, androidx.appcompat.widget.a.e(androidx.appcompat.graphics.drawable.a.d(hVar3, 182, str4, str5, str6), cVar5.f4061b, "_asm", c0038a));
                            aVar = this;
                            i5 = i20;
                            str = str18;
                            aVar3 = aVar;
                            i16 = i5 + 1;
                            str16 = str;
                            aVar2 = aVar;
                            cVar = cVar4;
                            length4 = i19;
                            cVarArr2 = cVarArr3;
                            cls2 = cls;
                        }
                        e6 = androidx.appcompat.widget.a.e(androidx.appcompat.graphics.drawable.a.d(hVar3, i9, str7, str8, str9), cVar5.f4061b, "_asm", c0038a);
                        i8 = 54;
                        aVar = this;
                        hVar3.k(i8, e6);
                        i5 = i20;
                        str = str18;
                        aVar3 = aVar;
                        i16 = i5 + 1;
                        str16 = str;
                        aVar2 = aVar;
                        cVar = cVar4;
                        length4 = i19;
                        cVarArr2 = cVarArr3;
                        cls2 = cls;
                    }
                    StringBuilder d5 = androidx.appcompat.graphics.drawable.a.d(hVar3, i10, str10, str11, str12);
                    d5.append(cVar5.f4061b);
                    d5.append("_asm");
                    e6 = c0038a.e(d5.toString());
                    aVar = this;
                    i8 = i11;
                    hVar3.k(i8, e6);
                    i5 = i20;
                    str = str18;
                    aVar3 = aVar;
                    i16 = i5 + 1;
                    str16 = str;
                    aVar2 = aVar;
                    cVar = cVar4;
                    length4 = i19;
                    cVarArr2 = cVarArr3;
                    cls2 = cls;
                }
                hVar3.k(58, androidx.appcompat.widget.a.e(sb, cVar5.f4061b, "_asm", c0038a));
                hVar3.f(fVar);
                aVar = this;
                i5 = i20;
                str = str18;
                aVar3 = aVar;
                i16 = i5 + 1;
                str16 = str;
                aVar2 = aVar;
                cVar = cVar4;
                length4 = i19;
                cVarArr2 = cVarArr3;
                cls2 = cls;
            }
            hVar3.k(i6, e5);
            aVar3 = aVar5;
            i16 = i5 + 1;
            str16 = str;
            aVar2 = aVar;
            cVar = cVar4;
            length4 = i19;
            cVarArr2 = cVarArr3;
            cls2 = cls;
        }
    }

    public final void q(C0038a c0038a, h.h hVar) {
        hVar.k(25, 1);
        hVar.a(180, f3358c, "lexer", m.b.b(i.c.class));
        hVar.j(192, f3359d);
        hVar.k(58, c0038a.f("lexer"));
    }
}
