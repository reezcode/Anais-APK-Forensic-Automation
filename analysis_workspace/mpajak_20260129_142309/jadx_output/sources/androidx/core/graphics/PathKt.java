package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Path;
import androidx.annotation.RequiresApi;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes13.dex */
public final class PathKt {
    @RequiresApi(19)
    public static final Path and(Path path, Path p4) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(p4, "p");
        Path path2 = new Path();
        path2.op(path, p4, Path.Op.INTERSECT);
        return path2;
    }

    @RequiresApi(26)
    public static final Iterable<PathSegment> flatten(Path path, float f5) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Collection<PathSegment> flatten = PathUtils.flatten(path, f5);
        Intrinsics.checkNotNullExpressionValue(flatten, "flatten(this, error)");
        return flatten;
    }

    public static /* synthetic */ Iterable flatten$default(Path path, float f5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = 0.5f;
        }
        return flatten(path, f5);
    }

    @RequiresApi(19)
    public static final Path minus(Path path, Path p4) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(p4, "p");
        Path path2 = new Path(path);
        path2.op(p4, Path.Op.DIFFERENCE);
        return path2;
    }

    @RequiresApi(19)
    public static final Path or(Path path, Path p4) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(p4, "p");
        Path path2 = new Path(path);
        path2.op(p4, Path.Op.UNION);
        return path2;
    }

    @RequiresApi(19)
    public static final Path plus(Path path, Path p4) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(p4, "p");
        Path path2 = new Path(path);
        path2.op(p4, Path.Op.UNION);
        return path2;
    }

    @RequiresApi(19)
    public static final Path xor(Path path, Path p4) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(p4, "p");
        Path path2 = new Path(path);
        path2.op(p4, Path.Op.XOR);
        return path2;
    }
}
