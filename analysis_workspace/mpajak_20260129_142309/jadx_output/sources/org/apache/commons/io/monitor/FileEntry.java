package org.apache.commons.io.monitor;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import org.apache.commons.io.FileUtils;

/* loaded from: classes3.dex */
public class FileEntry implements Serializable {
    public static final FileEntry[] EMPTY_FILE_ENTRY_ARRAY = new FileEntry[0];
    private static final long serialVersionUID = -2505664948818681153L;
    private FileEntry[] children;
    private boolean directory;
    private boolean exists;
    private final File file;
    private long lastModified;
    private long length;
    private String name;
    private final FileEntry parent;

    public FileEntry(File file) {
        this(null, file);
    }

    public FileEntry(FileEntry fileEntry, File file) {
        if (file == null) {
            throw new IllegalArgumentException("File is missing");
        }
        this.file = file;
        this.parent = fileEntry;
        this.name = file.getName();
    }

    public FileEntry[] getChildren() {
        FileEntry[] fileEntryArr = this.children;
        return fileEntryArr != null ? fileEntryArr : EMPTY_FILE_ENTRY_ARRAY;
    }

    public File getFile() {
        return this.file;
    }

    public long getLastModified() {
        return this.lastModified;
    }

    public long getLength() {
        return this.length;
    }

    public int getLevel() {
        FileEntry fileEntry = this.parent;
        if (fileEntry == null) {
            return 0;
        }
        return fileEntry.getLevel() + 1;
    }

    public String getName() {
        return this.name;
    }

    public FileEntry getParent() {
        return this.parent;
    }

    public boolean isDirectory() {
        return this.directory;
    }

    public boolean isExists() {
        return this.exists;
    }

    public FileEntry newChildInstance(File file) {
        return new FileEntry(this, file);
    }

    public boolean refresh(File file) {
        boolean z4 = this.exists;
        long j5 = this.lastModified;
        boolean z5 = this.directory;
        long j6 = this.length;
        this.name = file.getName();
        boolean exists = Files.exists(file.toPath(), new LinkOption[0]);
        this.exists = exists;
        this.directory = exists && file.isDirectory();
        long j7 = 0;
        try {
            this.lastModified = this.exists ? FileUtils.lastModified(file) : 0L;
        } catch (IOException unused) {
            this.lastModified = 0L;
        }
        if (this.exists && !this.directory) {
            j7 = file.length();
        }
        this.length = j7;
        return (this.exists == z4 && this.lastModified == j5 && this.directory == z5 && j7 == j6) ? false : true;
    }

    public void setChildren(FileEntry... fileEntryArr) {
        this.children = fileEntryArr;
    }

    public void setDirectory(boolean z4) {
        this.directory = z4;
    }

    public void setExists(boolean z4) {
        this.exists = z4;
    }

    public void setLastModified(long j5) {
        this.lastModified = j5;
    }

    public void setLength(long j5) {
        this.length = j5;
    }

    public void setName(String str) {
        this.name = str;
    }
}
