package v;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Objects;

/* loaded from: classes23.dex */
public final class g implements p.f {

    /* renamed from: b, reason: collision with root package name */
    public final h f5489b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public final URL f5490c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f5491d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public String f5492e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public URL f5493f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public volatile byte[] f5494g;

    /* renamed from: h, reason: collision with root package name */
    public int f5495h;

    public g(String str) {
        j jVar = h.f5496a;
        this.f5490c = null;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f5491d = str;
        Objects.requireNonNull(jVar, "Argument must not be null");
        this.f5489b = jVar;
    }

    public g(URL url) {
        j jVar = h.f5496a;
        Objects.requireNonNull(url, "Argument must not be null");
        this.f5490c = url;
        this.f5491d = null;
        Objects.requireNonNull(jVar, "Argument must not be null");
        this.f5489b = jVar;
    }

    @Override // p.f
    public final void a(@NonNull MessageDigest messageDigest) {
        if (this.f5494g == null) {
            this.f5494g = c().getBytes(p.f.f4612a);
        }
        messageDigest.update(this.f5494g);
    }

    public final String c() {
        String str = this.f5491d;
        if (str != null) {
            return str;
        }
        URL url = this.f5490c;
        Objects.requireNonNull(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        if (this.f5493f == null) {
            if (TextUtils.isEmpty(this.f5492e)) {
                String str = this.f5491d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f5490c;
                    Objects.requireNonNull(url, "Argument must not be null");
                    str = url.toString();
                }
                this.f5492e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f5493f = new URL(this.f5492e);
        }
        return this.f5493f;
    }

    @Override // p.f
    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return c().equals(gVar.c()) && this.f5489b.equals(gVar.f5489b);
    }

    @Override // p.f
    public final int hashCode() {
        if (this.f5495h == 0) {
            int hashCode = c().hashCode();
            this.f5495h = hashCode;
            this.f5495h = this.f5489b.hashCode() + (hashCode * 31);
        }
        return this.f5495h;
    }

    public final String toString() {
        return c();
    }
}
