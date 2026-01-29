package y;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;
import y.s;

@RequiresApi(21)
/* loaded from: classes24.dex */
public final class v implements p.j<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final m f6032a;

    public v(m mVar) {
        this.f6032a = mVar;
    }

    @Override // p.j
    public final boolean a(@NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull p.h hVar) {
        Objects.requireNonNull(this.f6032a);
        return true;
    }

    @Override // p.j
    @Nullable
    public final r.w<Bitmap> b(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i5, int i6, @NonNull p.h hVar) {
        m mVar = this.f6032a;
        return mVar.a(new s.b(parcelFileDescriptor, mVar.f6006d, mVar.f6005c), i5, i6, hVar, m.f6001k);
    }
}
