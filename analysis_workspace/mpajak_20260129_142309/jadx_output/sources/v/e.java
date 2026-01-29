package v;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import v.o;

/* loaded from: classes25.dex */
public final class e<Model, Data> implements o<Model, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final a<Data> f5479a;

    /* loaded from: classes13.dex */
    public interface a<Data> {
    }

    /* JADX WARN: Incorrect field signature: TData; */
    /* loaded from: classes17.dex */
    public static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: b, reason: collision with root package name */
        public final String f5480b;

        /* renamed from: c, reason: collision with root package name */
        public final a<Data> f5481c;

        /* renamed from: d, reason: collision with root package name */
        public ByteArrayInputStream f5482d;

        public b(String str, a<Data> aVar) {
            this.f5480b = str;
            this.f5481c = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final Class<Data> a() {
            Objects.requireNonNull((c.a) this.f5481c);
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            try {
                a<Data> aVar = this.f5481c;
                ByteArrayInputStream byteArrayInputStream = this.f5482d;
                Objects.requireNonNull((c.a) aVar);
                byteArrayInputStream.close();
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final p.a e() {
            return p.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void f(@NonNull com.bumptech.glide.f fVar, @NonNull d.a<? super Data> aVar) {
            try {
                Object a5 = ((c.a) this.f5481c).a(this.f5480b);
                this.f5482d = (ByteArrayInputStream) a5;
                aVar.d(a5);
            } catch (IllegalArgumentException e5) {
                aVar.c(e5);
            }
        }
    }

    /* loaded from: classes18.dex */
    public static final class c<Model> implements p<Model, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final a<InputStream> f5483a = new a();

        /* loaded from: classes11.dex */
        public class a implements a<InputStream> {
            public final Object a(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, indexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // v.p
        @NonNull
        public final o<Model, InputStream> b(@NonNull s sVar) {
            return new e(this.f5483a);
        }
    }

    public e(a<Data> aVar) {
        this.f5479a = aVar;
    }

    @Override // v.o
    public final o.a<Data> a(@NonNull Model model, int i5, int i6, @NonNull p.h hVar) {
        return new o.a<>(new k0.d(model), new b(model.toString(), this.f5479a));
    }

    @Override // v.o
    public final boolean b(@NonNull Model model) {
        return model.toString().startsWith("data:image");
    }
}
