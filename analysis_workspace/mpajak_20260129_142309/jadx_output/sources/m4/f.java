package m4;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* loaded from: classes8.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f4244a;

    public f(File file) {
        this.f4244a = file;
    }

    @Override // m4.d
    public final String getPath() {
        return this.f4244a.getAbsolutePath();
    }

    @Override // m4.d
    public final InputStream open() {
        return new FileInputStream(this.f4244a);
    }
}
