package v;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import v.o;

/* loaded from: classes20.dex */
public final class b<Data> implements o<byte[], Data> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0075b<Data> f5475a;

    /* loaded from: classes12.dex */
    public static class a implements p<byte[], ByteBuffer> {

        /* renamed from: v.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes13.dex */
        public class C0074a implements InterfaceC0075b<ByteBuffer> {
            @Override // v.b.InterfaceC0075b
            public final Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // v.b.InterfaceC0075b
            public final ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // v.p
        @NonNull
        public final o<byte[], ByteBuffer> b(@NonNull s sVar) {
            return new b(new C0074a());
        }
    }

    /* renamed from: v.b$b, reason: collision with other inner class name */
    /* loaded from: classes24.dex */
    public interface InterfaceC0075b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* loaded from: classes10.dex */
    public static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f5476b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC0075b<Data> f5477c;

        public c(byte[] bArr, InterfaceC0075b<Data> interfaceC0075b) {
            this.f5476b = bArr;
            this.f5477c = interfaceC0075b;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final Class<Data> a() {
            return this.f5477c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
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
            aVar.d(this.f5477c.b(this.f5476b));
        }
    }

    /* loaded from: classes14.dex */
    public static class d implements p<byte[], InputStream> {

        /* loaded from: classes11.dex */
        public class a implements InterfaceC0075b<InputStream> {
            @Override // v.b.InterfaceC0075b
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // v.b.InterfaceC0075b
            public final InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // v.p
        @NonNull
        public final o<byte[], InputStream> b(@NonNull s sVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0075b<Data> interfaceC0075b) {
        this.f5475a = interfaceC0075b;
    }

    @Override // v.o
    public final o.a a(@NonNull byte[] bArr, int i5, int i6, @NonNull p.h hVar) {
        byte[] bArr2 = bArr;
        return new o.a(new k0.d(bArr2), new c(bArr2, this.f5475a));
    }

    @Override // v.o
    public final /* bridge */ /* synthetic */ boolean b(@NonNull byte[] bArr) {
        return true;
    }
}
