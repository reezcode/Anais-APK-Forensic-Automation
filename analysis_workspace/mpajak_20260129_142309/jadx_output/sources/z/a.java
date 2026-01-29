package z;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public final class a implements e<ByteBuffer> {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f6096a;

    /* renamed from: z.a$a, reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static class C0088a implements e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public final e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f6096a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    @NonNull
    public final ByteBuffer a() {
        this.f6096a.position(0);
        return this.f6096a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
    }
}
