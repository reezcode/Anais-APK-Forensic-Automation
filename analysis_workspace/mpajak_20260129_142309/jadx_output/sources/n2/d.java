package n2;

import java.sql.Timestamp;
import java.util.Date;
import l2.d;
import n2.a;
import n2.b;
import n2.c;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f4512a;

    /* renamed from: b, reason: collision with root package name */
    public static final d.b<? extends Date> f4513b;

    /* renamed from: c, reason: collision with root package name */
    public static final d.b<? extends Date> f4514c;

    /* renamed from: d, reason: collision with root package name */
    public static final a.C0057a f4515d;

    /* renamed from: e, reason: collision with root package name */
    public static final b.a f4516e;

    /* renamed from: f, reason: collision with root package name */
    public static final c.a f4517f;

    /* loaded from: classes18.dex */
    public class a extends d.b<java.sql.Date> {
        public a(Class cls) {
            super(cls);
        }

        @Override // l2.d.b
        public final java.sql.Date b(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    /* loaded from: classes9.dex */
    public class b extends d.b<Timestamp> {
        public b(Class cls) {
            super(cls);
        }

        @Override // l2.d.b
        public final Timestamp b(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z4;
        c.a aVar;
        try {
            Class.forName("java.sql.Date");
            z4 = true;
        } catch (ClassNotFoundException unused) {
            z4 = false;
        }
        f4512a = z4;
        if (z4) {
            f4513b = new a(java.sql.Date.class);
            f4514c = new b(Timestamp.class);
            f4515d = n2.a.f4506b;
            f4516e = n2.b.f4508b;
            aVar = c.f4510b;
        } else {
            aVar = null;
            f4513b = null;
            f4514c = null;
            f4515d = null;
            f4516e = null;
        }
        f4517f = aVar;
    }
}
