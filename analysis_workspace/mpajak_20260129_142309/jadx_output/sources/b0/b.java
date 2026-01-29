package b0;

import java.io.File;
import java.util.Objects;
import r.w;

/* loaded from: classes17.dex */
public final class b implements w<File> {

    /* renamed from: b, reason: collision with root package name */
    public final File f318b;

    public b(File file) {
        Objects.requireNonNull(file, "Argument must not be null");
        this.f318b = file;
    }

    @Override // r.w
    public final Class<File> b() {
        return this.f318b.getClass();
    }

    @Override // r.w
    public final File get() {
        return this.f318b;
    }

    @Override // r.w
    public final /* bridge */ /* synthetic */ int getSize() {
        return 1;
    }

    @Override // r.w
    public final /* bridge */ /* synthetic */ void recycle() {
    }
}
