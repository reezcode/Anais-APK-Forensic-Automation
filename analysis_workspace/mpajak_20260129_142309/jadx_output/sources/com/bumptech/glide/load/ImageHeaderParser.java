package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes14.dex */
public interface ImageHeaderParser {

    /* loaded from: classes16.dex */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);


        /* renamed from: b, reason: collision with root package name */
        public final boolean f597b;

        ImageType(boolean z4) {
            this.f597b = z4;
        }

        public boolean hasAlpha() {
            return this.f597b;
        }
    }

    @NonNull
    ImageType a(@NonNull ByteBuffer byteBuffer);

    int b(@NonNull InputStream inputStream, @NonNull s.b bVar);

    @NonNull
    ImageType c(@NonNull InputStream inputStream);
}
