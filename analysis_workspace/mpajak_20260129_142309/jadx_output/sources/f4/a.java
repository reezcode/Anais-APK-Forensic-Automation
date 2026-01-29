package f4;

import f4.i;
import kotlin.jvm.JvmName;

@JvmName(name = "-Base64")
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f2835a;

    static {
        i.a aVar = i.f2861f;
        f2835a = aVar.b("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").f2864d;
        aVar.b("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    }
}
