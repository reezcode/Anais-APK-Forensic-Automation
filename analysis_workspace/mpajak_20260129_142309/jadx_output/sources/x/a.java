package x;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.activity.d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p.g;
import p.h;
import p.i;
import p.j;
import r.w;
import y.l;
import y.m;
import y.r;

@RequiresApi(api = 28)
/* loaded from: classes22.dex */
public abstract class a<T> implements j<ImageDecoder.Source, T> {

    /* renamed from: a, reason: collision with root package name */
    public final r f5897a = r.a();

    /* renamed from: x.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0081a implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f5898a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f5899b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f5900c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p.b f5901d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l f5902e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ i f5903f;

        /* renamed from: x.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public class C0082a implements ImageDecoder.OnPartialImageListener {
            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public final boolean onPartialImage(@NonNull ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        public C0081a(int i5, int i6, boolean z4, p.b bVar, l lVar, i iVar) {
            this.f5898a = i5;
            this.f5899b = i6;
            this.f5900c = z4;
            this.f5901d = bVar;
            this.f5902e = lVar;
            this.f5903f = iVar;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        @SuppressLint({"Override"})
        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            ColorSpace.Named named;
            boolean z4 = false;
            if (a.this.f5897a.b(this.f5898a, this.f5899b, this.f5900c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f5901d == p.b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C0082a());
            Size size = imageInfo.getSize();
            int i5 = this.f5898a;
            if (i5 == Integer.MIN_VALUE) {
                i5 = size.getWidth();
            }
            int i6 = this.f5899b;
            if (i6 == Integer.MIN_VALUE) {
                i6 = size.getHeight();
            }
            float b5 = this.f5902e.b(size.getWidth(), size.getHeight(), i5, i6);
            int round = Math.round(size.getWidth() * b5);
            int round2 = Math.round(size.getHeight() * b5);
            if (Log.isLoggable("ImageDecoder", 2)) {
                StringBuilder g5 = d.g("Resizing from [");
                g5.append(size.getWidth());
                g5.append("x");
                g5.append(size.getHeight());
                g5.append("] to [");
                g5.append(round);
                g5.append("x");
                g5.append(round2);
                g5.append("] scaleFactor: ");
                g5.append(b5);
                Log.v("ImageDecoder", g5.toString());
            }
            imageDecoder.setTargetSize(round, round2);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 28) {
                if (this.f5903f == i.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z4 = true;
                }
                if (z4) {
                    named = ColorSpace.Named.DISPLAY_P3;
                    imageDecoder.setTargetColorSpace(ColorSpace.get(named));
                }
            } else if (i7 < 26) {
                return;
            }
            named = ColorSpace.Named.SRGB;
            imageDecoder.setTargetColorSpace(ColorSpace.get(named));
        }
    }

    @Override // p.j
    public final /* bridge */ /* synthetic */ boolean a(@NonNull ImageDecoder.Source source, @NonNull h hVar) {
        return true;
    }

    public abstract w<T> c(ImageDecoder.Source source, int i5, int i6, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener);

    @Override // p.j
    @Nullable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final w<T> b(@NonNull ImageDecoder.Source source, int i5, int i6, @NonNull h hVar) {
        p.b bVar = (p.b) hVar.c(m.f5996f);
        l lVar = (l) hVar.c(l.f5994f);
        g<Boolean> gVar = m.f5999i;
        return c(source, i5, i6, new C0081a(i5, i6, hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue(), bVar, lVar, (i) hVar.c(m.f5997g)));
    }
}
