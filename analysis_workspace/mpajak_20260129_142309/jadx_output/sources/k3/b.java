package k3;

import java.io.File;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import s3.a0;
import s3.u;
import s3.v;
import s3.w;
import s3.y;
import s3.z;

/* loaded from: classes18.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static w f3862a;

    /* renamed from: b, reason: collision with root package name */
    public static final u f3863b;

    static {
        u.a aVar = u.f5303f;
        aVar.a("application/json");
        f3863b = aVar.b("multipart/form-data");
    }

    public static w a() {
        if (f3862a == null) {
            w.a aVar = new w.a();
            TimeUnit unit = TimeUnit.SECONDS;
            Intrinsics.checkNotNullParameter(unit, "unit");
            aVar.f5368x = t3.c.b();
            Intrinsics.checkNotNullParameter(unit, "unit");
            aVar.f5369y = t3.c.b();
            f3862a = new w(aVar);
        }
        return f3862a;
    }

    public static void b(String toRequestBody, File asRequestBody, s3.e eVar) {
        String boundary = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(boundary, "UUID.randomUUID().toString()");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        f4.i b5 = f4.i.f2861f.b(boundary);
        u uVar = v.f5307f;
        ArrayList arrayList = new ArrayList();
        u type = v.f5308g;
        Intrinsics.checkNotNullParameter(type, "type");
        if (!Intrinsics.areEqual(type.f5305b, "multipart")) {
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }
        String name = asRequestBody.getName();
        u uVar2 = f3863b;
        Intrinsics.checkNotNullParameter(asRequestBody, "file");
        Intrinsics.checkNotNullParameter(asRequestBody, "$this$asRequestBody");
        z body = new z(asRequestBody, uVar2);
        Intrinsics.checkNotNullParameter("media", "name");
        Intrinsics.checkNotNullParameter(body, "body");
        v.b.a aVar = v.b.f5317c;
        v.b part = aVar.a("media", name, body);
        Intrinsics.checkNotNullParameter(part, "part");
        arrayList.add(part);
        Intrinsics.checkNotNullParameter("key", "name");
        Intrinsics.checkNotNullParameter(toRequestBody, "value");
        Intrinsics.checkNotNullParameter("key", "name");
        Intrinsics.checkNotNullParameter(toRequestBody, "value");
        Intrinsics.checkNotNullParameter(toRequestBody, "$this$toRequestBody");
        byte[] toRequestBody2 = toRequestBody.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(toRequestBody2, "(this as java.lang.String).getBytes(charset)");
        int length = toRequestBody2.length;
        Intrinsics.checkNotNullParameter(toRequestBody2, "$this$toRequestBody");
        t3.c.c(toRequestBody2.length, 0, length);
        v.b part2 = aVar.a("key", null, new a0(toRequestBody2, null, length, 0));
        Intrinsics.checkNotNullParameter(part2, "part");
        arrayList.add(part2);
        w a5 = a();
        y.a aVar2 = new y.a();
        aVar2.e("https://thumbsnap.com/api/upload");
        if (!(!arrayList.isEmpty())) {
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }
        v body2 = new v(b5, type, t3.c.z(arrayList));
        Intrinsics.checkNotNullParameter(body2, "body");
        aVar2.c("POST", body2);
        ((w3.e) a5.a(aVar2.a())).e(eVar);
    }
}
