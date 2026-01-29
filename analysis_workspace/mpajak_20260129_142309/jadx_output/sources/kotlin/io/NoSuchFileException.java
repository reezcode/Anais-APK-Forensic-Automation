package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class NoSuchFileException extends FileSystemException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoSuchFileException(File file, File file2, String str) {
        super(file, file2, str);
        Intrinsics.checkNotNullParameter(file, "file");
    }

    public /* synthetic */ NoSuchFileException(File file, File file2, String str, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i5 & 2) != 0 ? null : file2, (i5 & 4) != 0 ? null : str);
    }
}
