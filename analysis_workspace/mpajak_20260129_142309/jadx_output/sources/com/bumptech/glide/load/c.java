package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.util.List;
import y.w;

/* loaded from: classes2.dex */
public final class c {

    /* loaded from: classes5.dex */
    public interface a {
    }

    /* loaded from: classes10.dex */
    public interface b {
    }

    public static int a(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull s.b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            try {
                int b5 = list.get(i5).b(inputStream, bVar);
                if (b5 != -1) {
                    return b5;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static int b(@NonNull List<ImageHeaderParser> list, a aVar) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            int a5 = ((com.bumptech.glide.load.b) aVar).a(list.get(i5));
            if (a5 != -1) {
                return a5;
            }
        }
        return -1;
    }

    @NonNull
    public static ImageHeaderParser.ImageType c(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull s.b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            try {
                ImageHeaderParser.ImageType c5 = list.get(i5).c(inputStream);
                inputStream.reset();
                if (c5 != ImageHeaderParser.ImageType.UNKNOWN) {
                    return c5;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @NonNull
    public static ImageHeaderParser.ImageType d(@NonNull List<ImageHeaderParser> list, b bVar) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            ImageHeaderParser.ImageType a5 = ((com.bumptech.glide.load.a) bVar).a(list.get(i5));
            if (a5 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a5;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
