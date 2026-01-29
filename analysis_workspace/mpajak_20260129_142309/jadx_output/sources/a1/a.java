package a1;

import android.content.Context;
import androidx.collection.ArrayMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Deprecated
/* loaded from: classes16.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final g3.a f24b = b.b().a();

    /* renamed from: c, reason: collision with root package name */
    public static Map<String, a> f25c = new ArrayMap();

    /* renamed from: d, reason: collision with root package name */
    public static d f26d;

    /* renamed from: a, reason: collision with root package name */
    public String f27a;

    static {
        TimeUnit.DAYS.toMillis(7L);
    }

    public a(Context context, String str) {
        this.f27a = "";
        context.getApplicationContext();
        this.f27a = str;
    }
}
