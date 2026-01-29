package kotlin.io.path;

import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes14.dex */
final class PathRelativizer {
    public static final PathRelativizer INSTANCE = new PathRelativizer();
    private static final Path emptyPath = Paths.get("", new String[0]);
    private static final Path parentPath = Paths.get("..", new String[0]);

    private PathRelativizer() {
    }

    public final Path tryRelativeTo(Path path, Path base) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(base, "base");
        Path normalize = base.normalize();
        Path r4 = path.normalize();
        Path relativize = normalize.relativize(r4);
        int min = Math.min(normalize.getNameCount(), r4.getNameCount());
        for (int i5 = 0; i5 < min; i5++) {
            Path name = normalize.getName(i5);
            Path path2 = parentPath;
            if (!Intrinsics.areEqual(name, path2)) {
                break;
            }
            if (!Intrinsics.areEqual(r4.getName(i5), path2)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (Intrinsics.areEqual(r4, normalize) || !Intrinsics.areEqual(normalize, emptyPath)) {
            String obj = relativize.toString();
            String separator = relativize.getFileSystem().getSeparator();
            Intrinsics.checkNotNullExpressionValue(separator, "rn.fileSystem.separator");
            r4 = StringsKt.f(obj, separator) ? relativize.getFileSystem().getPath(StringsKt.dropLast(obj, relativize.getFileSystem().getSeparator().length()), new String[0]) : relativize;
        }
        Intrinsics.checkNotNullExpressionValue(r4, "r");
        return r4;
    }
}
