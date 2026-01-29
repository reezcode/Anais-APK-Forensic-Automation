package org.apache.commons.io.filefilter;

import h4.b;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;
import org.apache.commons.io.file.PathVisitor;

/* loaded from: classes10.dex */
public abstract class AbstractFileFilter implements IOFileFilter, PathVisitor {
    public static FileVisitResult toFileVisitResult(boolean z4, Path path) {
        return z4 ? FileVisitResult.CONTINUE : FileVisitResult.TERMINATE;
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public /* synthetic */ FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return b.a(this, path, basicFileAttributes);
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        Objects.requireNonNull(file, "file");
        return accept(file.getParentFile(), file.getName());
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        Objects.requireNonNull(str, "name");
        return accept(new File(file, str));
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter
    public final /* synthetic */ IOFileFilter and(IOFileFilter iOFileFilter) {
        return b.b(this, iOFileFilter);
    }

    public FileVisitResult handle(Throwable th) {
        return FileVisitResult.TERMINATE;
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter
    public final /* synthetic */ IOFileFilter negate() {
        return b.c(this);
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter
    public final /* synthetic */ IOFileFilter or(IOFileFilter iOFileFilter) {
        return b.d(this, iOFileFilter);
    }

    @Override // java.nio.file.FileVisitor
    public FileVisitResult postVisitDirectory(Path path, IOException iOException) {
        return FileVisitResult.CONTINUE;
    }

    @Override // java.nio.file.FileVisitor
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) {
        return accept(path, basicFileAttributes);
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    @Override // java.nio.file.FileVisitor
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        return accept(path, basicFileAttributes);
    }

    @Override // java.nio.file.FileVisitor
    public FileVisitResult visitFileFailed(Path path, IOException iOException) {
        return FileVisitResult.CONTINUE;
    }
}
