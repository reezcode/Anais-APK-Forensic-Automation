package org.apache.commons.io.file.spi;

import androidx.core.app.NotificationCompat;
import com.tencent.smtt.sdk.TbsVideoCacheTask;
import java.net.URI;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;
import java.util.List;
import java.util.Objects;

/* loaded from: classes7.dex */
public class FileSystemProviders {
    private static final FileSystemProviders INSTALLED = new FileSystemProviders(FileSystemProvider.installedProviders());
    private final List<FileSystemProvider> providers;

    private FileSystemProviders(List<FileSystemProvider> list) {
        this.providers = list;
    }

    public static FileSystemProvider getFileSystemProvider(Path path) {
        Objects.requireNonNull(path, "path");
        return path.getFileSystem().provider();
    }

    public static FileSystemProviders installed() {
        return INSTALLED;
    }

    public FileSystemProvider getFileSystemProvider(String str) {
        Objects.requireNonNull(str, "scheme");
        if (str.equalsIgnoreCase("file")) {
            return FileSystems.getDefault().provider();
        }
        List<FileSystemProvider> list = this.providers;
        if (list == null) {
            return null;
        }
        for (FileSystemProvider fileSystemProvider : list) {
            if (fileSystemProvider.getScheme().equalsIgnoreCase(str)) {
                return fileSystemProvider;
            }
        }
        return null;
    }

    public FileSystemProvider getFileSystemProvider(URI uri) {
        Objects.requireNonNull(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return getFileSystemProvider(uri.getScheme());
    }

    public FileSystemProvider getFileSystemProvider(URL url) {
        Objects.requireNonNull(url, TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_URL);
        return getFileSystemProvider(url.getProtocol());
    }
}
