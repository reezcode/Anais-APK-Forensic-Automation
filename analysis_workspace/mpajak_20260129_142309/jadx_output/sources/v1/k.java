package v1;

import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes10.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public float f5628c;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public WeakReference<b> f5630e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public y1.d f5631f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f5626a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final a f5627b = new a();

    /* renamed from: d, reason: collision with root package name */
    public boolean f5629d = true;

    /* loaded from: classes2.dex */
    public class a extends y1.f {
        public a() {
        }

        @Override // y1.f
        public final void a(int i5) {
            k kVar = k.this;
            kVar.f5629d = true;
            b bVar = kVar.f5630e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // y1.f
        public final void b(@NonNull Typeface typeface, boolean z4) {
            if (z4) {
                return;
            }
            k kVar = k.this;
            kVar.f5629d = true;
            b bVar = kVar.f5630e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();

        @NonNull
        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public k(@Nullable b bVar) {
        this.f5630e = new WeakReference<>(null);
        this.f5630e = new WeakReference<>(bVar);
    }

    public final float a(String str) {
        if (!this.f5629d) {
            return this.f5628c;
        }
        float measureText = str == null ? 0.0f : this.f5626a.measureText((CharSequence) str, 0, str.length());
        this.f5628c = measureText;
        this.f5629d = false;
        return measureText;
    }
}
