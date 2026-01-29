package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;
import org.apache.commons.io.IOUtils;

/* loaded from: classes3.dex */
public class EmptyFileFilter extends AbstractFileFilter implements Serializable {
    public static final IOFileFilter EMPTY;
    public static final IOFileFilter NOT_EMPTY;
    private static final long serialVersionUID = 3631422087512832211L;

    static {
        EmptyFileFilter emptyFileFilter = new EmptyFileFilter();
        EMPTY = emptyFileFilter;
        NOT_EMPTY = emptyFileFilter.negate();
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        try {
            if (!Files.isDirectory(path, new LinkOption[0])) {
                return AbstractFileFilter.toFileVisitResult(Files.size(path) == 0, path);
            }
            Stream<Path> list = Files.list(path);
            try {
                FileVisitResult fileVisitResult = AbstractFileFilter.toFileVisitResult(list.findFirst().isPresent() ? false : true, path);
                list.close();
                return fileVisitResult;
            } finally {
            }
        } catch (IOException e5) {
            return handle(e5);
        }
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return file.isDirectory() ? IOUtils.length(file.listFiles()) == 0 : file.length() == 0;
    }
}
