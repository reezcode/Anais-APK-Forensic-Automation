package kotlin.io.path;

import java.nio.file.Path;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes21.dex */
final class PathNode {
    private Iterator<PathNode> contentIterator;
    private final Object key;
    private final PathNode parent;
    private final Path path;

    public PathNode(Path path, Object obj, PathNode pathNode) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.path = path;
        this.key = obj;
        this.parent = pathNode;
    }

    public final Iterator<PathNode> getContentIterator() {
        return this.contentIterator;
    }

    public final Object getKey() {
        return this.key;
    }

    public final PathNode getParent() {
        return this.parent;
    }

    public final Path getPath() {
        return this.path;
    }

    public final void setContentIterator(Iterator<PathNode> it) {
        this.contentIterator = it;
    }
}
