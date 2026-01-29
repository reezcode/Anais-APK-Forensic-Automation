package org.apache.commons.io;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;

@Deprecated
/* loaded from: classes11.dex */
public abstract class DirectoryWalker<T> {
    private final int depthLimit;
    private final FileFilter filter;

    public static class CancelException extends IOException {
        private static final long serialVersionUID = 1347339620135041008L;
        private final int depth;
        private final File file;

        public CancelException(File file, int i5) {
            this("Operation Cancelled", file, i5);
        }

        public CancelException(String str, File file, int i5) {
            super(str);
            this.file = file;
            this.depth = i5;
        }

        public int getDepth() {
            return this.depth;
        }

        public File getFile() {
            return this.file;
        }
    }

    public DirectoryWalker() {
        this(null, -1);
    }

    public DirectoryWalker(FileFilter fileFilter, int i5) {
        this.filter = fileFilter;
        this.depthLimit = i5;
    }

    public DirectoryWalker(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2, int i5) {
        IOFileFilter or;
        if (iOFileFilter == null && iOFileFilter2 == null) {
            or = null;
        } else {
            or = FileFilterUtils.makeDirectoryOnly(iOFileFilter == null ? TrueFileFilter.TRUE : iOFileFilter).or(FileFilterUtils.makeFileOnly(iOFileFilter2 == null ? TrueFileFilter.TRUE : iOFileFilter2));
        }
        this.filter = or;
        this.depthLimit = i5;
    }

    private void walk(File file, int i5, Collection<T> collection) {
        checkIfCancelled(file, i5, collection);
        if (handleDirectory(file, i5, collection)) {
            handleDirectoryStart(file, i5, collection);
            int i6 = i5 + 1;
            int i7 = this.depthLimit;
            if (i7 < 0 || i6 <= i7) {
                checkIfCancelled(file, i5, collection);
                FileFilter fileFilter = this.filter;
                File[] filterDirectoryContents = filterDirectoryContents(file, i5, fileFilter == null ? file.listFiles() : file.listFiles(fileFilter));
                if (filterDirectoryContents == null) {
                    handleRestricted(file, i6, collection);
                } else {
                    for (File file2 : filterDirectoryContents) {
                        if (file2.isDirectory()) {
                            walk(file2, i6, collection);
                        } else {
                            checkIfCancelled(file2, i6, collection);
                            handleFile(file2, i6, collection);
                            checkIfCancelled(file2, i6, collection);
                        }
                    }
                }
            }
            handleDirectoryEnd(file, i5, collection);
        }
        checkIfCancelled(file, i5, collection);
    }

    public final void checkIfCancelled(File file, int i5, Collection<T> collection) {
        if (handleIsCancelled(file, i5, collection)) {
            throw new CancelException(file, i5);
        }
    }

    public File[] filterDirectoryContents(File file, int i5, File... fileArr) {
        return fileArr;
    }

    public void handleCancelled(File file, Collection<T> collection, CancelException cancelException) {
        throw cancelException;
    }

    public boolean handleDirectory(File file, int i5, Collection<T> collection) {
        return true;
    }

    public void handleDirectoryEnd(File file, int i5, Collection<T> collection) {
    }

    public void handleDirectoryStart(File file, int i5, Collection<T> collection) {
    }

    public void handleEnd(Collection<T> collection) {
    }

    public void handleFile(File file, int i5, Collection<T> collection) {
    }

    public boolean handleIsCancelled(File file, int i5, Collection<T> collection) {
        return false;
    }

    public void handleRestricted(File file, int i5, Collection<T> collection) {
    }

    public void handleStart(File file, Collection<T> collection) {
    }

    public final void walk(File file, Collection<T> collection) {
        Objects.requireNonNull(file, "startDirectory");
        try {
            handleStart(file, collection);
            walk(file, 0, collection);
            handleEnd(collection);
        } catch (CancelException e5) {
            handleCancelled(file, collection, e5);
        }
    }
}
