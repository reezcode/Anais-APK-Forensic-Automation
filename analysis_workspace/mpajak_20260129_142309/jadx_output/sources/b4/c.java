package b4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import s3.w;

/* loaded from: classes16.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet<Logger> f441a = new CopyOnWriteArraySet<>();

    /* renamed from: b, reason: collision with root package name */
    public static final Map<String, String> f442b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f443c = null;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r12 = w.class.getPackage();
        String name = r12 != null ? r12.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = w.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = z3.e.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = v3.d.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f442b = MapsKt.toMap(linkedHashMap);
    }
}
