package l4;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes15.dex */
public final class e implements FilenameFilter {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4054b;

    public e(String str) {
        this.f4054b = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.f4054b);
    }
}
