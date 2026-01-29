package p;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f4612a = Charset.forName("UTF-8");

    void a(@NonNull MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
