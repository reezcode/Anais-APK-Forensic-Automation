package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.file.PathUtils;

/* loaded from: classes12.dex */
public class AgeFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = -2132740084016138541L;
    private final boolean acceptOlder;
    private final long cutoffMillis;

    public AgeFileFilter(long j5) {
        this(j5, true);
    }

    public AgeFileFilter(long j5, boolean z4) {
        this.acceptOlder = z4;
        this.cutoffMillis = j5;
    }

    public AgeFileFilter(File file) {
        this(file, true);
    }

    public AgeFileFilter(File file, boolean z4) {
        this(FileUtils.lastModifiedUnchecked(file), z4);
    }

    public AgeFileFilter(Date date) {
        this(date, true);
    }

    public AgeFileFilter(Date date, boolean z4) {
        this(date.getTime(), z4);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        try {
            return AbstractFileFilter.toFileVisitResult(this.acceptOlder != PathUtils.isNewer(path, this.cutoffMillis, new LinkOption[0]), path);
        } catch (IOException e5) {
            return handle(e5);
        }
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return this.acceptOlder != FileUtils.isFileNewer(file, this.cutoffMillis);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public String toString() {
        return super.toString() + "(" + (this.acceptOlder ? "<=" : ">") + this.cutoffMillis + ")";
    }
}
