package kotlin.io.path;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
final class DirectoryEntriesReader extends SimpleFileVisitor<Path> {
    private PathNode directoryNode;
    private ArrayDeque<PathNode> entries = new ArrayDeque<>();
    private final boolean followLinks;

    public DirectoryEntriesReader(boolean z4) {
        this.followLinks = z4;
    }

    public final boolean getFollowLinks() {
        return this.followLinks;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.entries.add(new PathNode(dir, attrs.fileKey(), this.directoryNode));
        FileVisitResult preVisitDirectory = super.preVisitDirectory((DirectoryEntriesReader) dir, attrs);
        Intrinsics.checkNotNullExpressionValue(preVisitDirectory, "super.preVisitDirectory(dir, attrs)");
        return preVisitDirectory;
    }

    public final List<PathNode> readEntries(PathNode directoryNode) {
        Intrinsics.checkNotNullParameter(directoryNode, "directoryNode");
        this.directoryNode = directoryNode;
        Files.walkFileTree(directoryNode.getPath(), LinkFollowing.INSTANCE.toVisitOptions(this.followLinks), 1, this);
        this.entries.removeFirst();
        ArrayDeque<PathNode> arrayDeque = this.entries;
        this.entries = new ArrayDeque<>();
        return arrayDeque;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.entries.add(new PathNode(file, null, this.directoryNode));
        FileVisitResult visitFile = super.visitFile((DirectoryEntriesReader) file, attrs);
        Intrinsics.checkNotNullExpressionValue(visitFile, "super.visitFile(file, attrs)");
        return visitFile;
    }
}
