package kotlin.io.path;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.smtt.sdk.ProxyConfig;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.internal.InlineOnly;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt__StringsJVMKt;
import org.apache.commons.io.FilenameUtils;

/* loaded from: classes18.dex */
class PathsKt__PathUtilsKt extends PathsKt__PathReadWriteKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path Path(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Path path2 = Paths.get(path, new String[0]);
        Intrinsics.checkNotNullExpressionValue(path2, "get(path)");
        return path2;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path Path(String base, String... subpaths) {
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(subpaths, "subpaths");
        Path path = Paths.get(base, (String[]) Arrays.copyOf(subpaths, subpaths.length));
        Intrinsics.checkNotNullExpressionValue(path, "get(base, *subpaths)");
        return path;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path absolute(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path absolutePath = path.toAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "toAbsolutePath()");
        return absolutePath;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final String absolutePathString(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return path.toAbsolutePath().toString();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path copyTo(Path path, Path target, boolean z4) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        CopyOption[] copyOptionArr = z4 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path copy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(copy, "copy(this, target, *options)");
        return copy;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path copyTo(Path path, Path target, CopyOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(options, "options");
        Path copy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(copy, "copy(this, target, *options)");
        return copy;
    }

    public static /* synthetic */ Path copyTo$default(Path path, Path target, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        CopyOption[] copyOptionArr = z4 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path copy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(copy, "copy(this, target, *options)");
        return copy;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path createDirectories(Path path, FileAttribute<?>... attributes) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path createDirectories = Files.createDirectories(path, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(createDirectories, "createDirectories(this, *attributes)");
        return createDirectories;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path createDirectory(Path path, FileAttribute<?>... attributes) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path createDirectory = Files.createDirectory(path, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(createDirectory, "createDirectory(this, *attributes)");
        return createDirectory;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path createFile(Path path, FileAttribute<?>... attributes) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path createFile = Files.createFile(path, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(createFile, "createFile(this, *attributes)");
        return createFile;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path createLinkPointingTo(Path path, Path target) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Path createLink = Files.createLink(path, target);
        Intrinsics.checkNotNullExpressionValue(createLink, "createLink(this, target)");
        return createLink;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path createSymbolicLinkPointingTo(Path path, Path target, FileAttribute<?>... attributes) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path createSymbolicLink = Files.createSymbolicLink(path, target, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(createSymbolicLink, "createSymbolicLink(this, target, *attributes)");
        return createSymbolicLink;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path createTempDirectory(String str, FileAttribute<?>... attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(createTempDirectory, "createTempDirectory(prefix, *attributes)");
        return createTempDirectory;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static final Path createTempDirectory(Path path, String str, FileAttribute<?>... attributes) {
        Path createTempDirectory;
        String str2;
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        if (path != null) {
            createTempDirectory = Files.createTempDirectory(path, str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
            str2 = "createTempDirectory(dire…ory, prefix, *attributes)";
        } else {
            createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
            str2 = "createTempDirectory(prefix, *attributes)";
        }
        Intrinsics.checkNotNullExpressionValue(createTempDirectory, str2);
        return createTempDirectory;
    }

    public static /* synthetic */ Path createTempDirectory$default(String str, FileAttribute[] attributes, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(createTempDirectory, "createTempDirectory(prefix, *attributes)");
        return createTempDirectory;
    }

    public static /* synthetic */ Path createTempDirectory$default(Path path, String str, FileAttribute[] fileAttributeArr, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str = null;
        }
        return createTempDirectory(path, str, fileAttributeArr);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path createTempFile(String str, String str2, FileAttribute<?>... attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(createTempFile, "createTempFile(prefix, suffix, *attributes)");
        return createTempFile;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static final Path createTempFile(Path path, String str, String str2, FileAttribute<?>... attributes) {
        Path createTempFile;
        String str3;
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        if (path != null) {
            createTempFile = Files.createTempFile(path, str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
            str3 = "createTempFile(directory…fix, suffix, *attributes)";
        } else {
            createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
            str3 = "createTempFile(prefix, suffix, *attributes)";
        }
        Intrinsics.checkNotNullExpressionValue(createTempFile, str3);
        return createTempFile;
    }

    public static /* synthetic */ Path createTempFile$default(String str, String str2, FileAttribute[] attributes, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        if ((i5 & 2) != 0) {
            str2 = null;
        }
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Path createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        Intrinsics.checkNotNullExpressionValue(createTempFile, "createTempFile(prefix, suffix, *attributes)");
        return createTempFile;
    }

    public static /* synthetic */ Path createTempFile$default(Path path, String str, String str2, FileAttribute[] fileAttributeArr, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str = null;
        }
        if ((i5 & 4) != 0) {
            str2 = null;
        }
        return createTempFile(path, str, str2, fileAttributeArr);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final void deleteExisting(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Files.delete(path);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final boolean deleteIfExists(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.deleteIfExists(path);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path div(Path path, String other) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Path resolve = path.resolve(other);
        Intrinsics.checkNotNullExpressionValue(resolve, "this.resolve(other)");
        return resolve;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path div(Path path, Path other) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Path resolve = path.resolve(other);
        Intrinsics.checkNotNullExpressionValue(resolve, "this.resolve(other)");
        return resolve;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final boolean exists(Path path, LinkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return Files.exists(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    @PublishedApi
    public static final Void fileAttributeViewNotAvailable(Path path, Class<?> attributeViewClass) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(attributeViewClass, "attributeViewClass");
        throw new UnsupportedOperationException("The desired attribute view type " + attributeViewClass + " is not available for the file " + path + FilenameUtils.EXTENSION_SEPARATOR);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final /* synthetic */ <V extends FileAttributeView> V fileAttributesView(Path path, LinkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        V v4 = (V) Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(options, options.length));
        if (v4 != null) {
            return v4;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        fileAttributeViewNotAvailable(path, FileAttributeView.class);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final /* synthetic */ <V extends FileAttributeView> V fileAttributesViewOrNull(Path path, LinkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        return (V) Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final long fileSize(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.size(path);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final FileStore fileStore(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        FileStore fileStore = Files.getFileStore(path);
        Intrinsics.checkNotNullExpressionValue(fileStore, "getFileStore(this)");
        return fileStore;
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalPathApi
    public static final FileVisitor<Path> fileVisitor(Function1<? super FileVisitorBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        FileVisitorBuilderImpl fileVisitorBuilderImpl = new FileVisitorBuilderImpl();
        builderAction.invoke(fileVisitorBuilderImpl);
        return fileVisitorBuilderImpl.build();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final void forEachDirectoryEntry(Path path, String glob, Function1<? super Path, Unit> action) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        Intrinsics.checkNotNullParameter(action, "action");
        DirectoryStream<Path> it = Files.newDirectoryStream(path, glob);
        try {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            Iterator<Path> it2 = it.iterator();
            while (it2.hasNext()) {
                action.invoke(it2.next());
            }
            Unit unit = Unit.INSTANCE;
            InlineMarker.finallyStart(1);
            CloseableKt.closeFinally(it, null);
            InlineMarker.finallyEnd(1);
        } finally {
        }
    }

    public static /* synthetic */ void forEachDirectoryEntry$default(Path path, String glob, Function1 action, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            glob = ProxyConfig.MATCH_ALL_SCHEMES;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        Intrinsics.checkNotNullParameter(action, "action");
        DirectoryStream<Path> it = Files.newDirectoryStream(path, glob);
        try {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            Iterator<Path> it2 = it.iterator();
            while (it2.hasNext()) {
                action.invoke(it2.next());
            }
            Unit unit = Unit.INSTANCE;
            InlineMarker.finallyStart(1);
            CloseableKt.closeFinally(it, null);
            InlineMarker.finallyEnd(1);
        } finally {
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Object getAttribute(Path path, String attribute, LinkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        Intrinsics.checkNotNullParameter(options, "options");
        return Files.getAttribute(path, attribute, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r1 = kotlin.text.StringsKt__StringsKt.substringAfterLast(r1, org.apache.commons.io.FilenameUtils.EXTENSION_SEPARATOR, "");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String getExtension(java.nio.file.Path r1) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.nio.file.Path r1 = r1.getFileName()
            if (r1 == 0) goto L17
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L17
            java.lang.String r1 = kotlin.text.StringsKt.y(r1)
            if (r1 != 0) goto L19
        L17:
            java.lang.String r1 = ""
        L19:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathsKt__PathUtilsKt.getExtension(java.nio.file.Path):java.lang.String");
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static /* synthetic */ void getExtension$annotations(Path path) {
    }

    private static final String getInvariantSeparatorsPath(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return getInvariantSeparatorsPathString(path);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @Deprecated(level = DeprecationLevel.ERROR, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @ReplaceWith(expression = "invariantSeparatorsPathString", imports = {}))
    @ExperimentalPathApi
    public static /* synthetic */ void getInvariantSeparatorsPath$annotations(Path path) {
    }

    public static final String getInvariantSeparatorsPathString(Path path) {
        String replace$default;
        Intrinsics.checkNotNullParameter(path, "<this>");
        String separator = path.getFileSystem().getSeparator();
        boolean areEqual = Intrinsics.areEqual(separator, "/");
        String obj = path.toString();
        if (areEqual) {
            return obj;
        }
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        replace$default = StringsKt__StringsJVMKt.replace$default(obj, separator, "/", false, 4, (Object) null);
        return replace$default;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static /* synthetic */ void getInvariantSeparatorsPathString$annotations(Path path) {
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final FileTime getLastModifiedTime(Path path, LinkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        FileTime lastModifiedTime = Files.getLastModifiedTime(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(lastModifiedTime, "getLastModifiedTime(this, *options)");
        return lastModifiedTime;
    }

    public static final String getName(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path fileName = path.getFileName();
        String obj = fileName != null ? fileName.toString() : null;
        return obj == null ? "" : obj;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static /* synthetic */ void getName$annotations(Path path) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r1 = kotlin.text.StringsKt__StringsKt.substringBeforeLast$default(r1, ".", (java.lang.String) null, 2, (java.lang.Object) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String getNameWithoutExtension(java.nio.file.Path r1) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.nio.file.Path r1 = r1.getFileName()
            if (r1 == 0) goto L17
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L17
            java.lang.String r1 = kotlin.text.StringsKt.A(r1)
            if (r1 != 0) goto L19
        L17:
            java.lang.String r1 = ""
        L19:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathsKt__PathUtilsKt.getNameWithoutExtension(java.nio.file.Path):java.lang.String");
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static /* synthetic */ void getNameWithoutExtension$annotations(Path path) {
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final UserPrincipal getOwner(Path path, LinkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return Files.getOwner(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    private static final String getPathString(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return path.toString();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    public static /* synthetic */ void getPathString$annotations(Path path) {
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Set<PosixFilePermission> getPosixFilePermissions(Path path, LinkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(posixFilePermissions, "getPosixFilePermissions(this, *options)");
        return posixFilePermissions;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final boolean isDirectory(Path path, LinkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final boolean isExecutable(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.isExecutable(path);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final boolean isHidden(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.isHidden(path);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final boolean isReadable(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.isReadable(path);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final boolean isRegularFile(Path path, LinkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return Files.isRegularFile(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final boolean isSameFileAs(Path path, Path other) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Files.isSameFile(path, other);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final boolean isSymbolicLink(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.isSymbolicLink(path);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final boolean isWritable(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return Files.isWritable(path);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static final List<Path> listDirectoryEntries(Path path, String glob) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        DirectoryStream<Path> it = Files.newDirectoryStream(path, glob);
        try {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            List<Path> list = CollectionsKt.toList(it);
            CloseableKt.closeFinally(it, null);
            return list;
        } finally {
        }
    }

    public static /* synthetic */ List listDirectoryEntries$default(Path path, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = ProxyConfig.MATCH_ALL_SCHEMES;
        }
        return listDirectoryEntries(path, str);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path moveTo(Path path, Path target, boolean z4) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        CopyOption[] copyOptionArr = z4 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path move = Files.move(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(move, "move(this, target, *options)");
        return move;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path moveTo(Path path, Path target, CopyOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(options, "options");
        Path move = Files.move(path, target, (CopyOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(move, "move(this, target, *options)");
        return move;
    }

    public static /* synthetic */ Path moveTo$default(Path path, Path target, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        CopyOption[] copyOptionArr = z4 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path move = Files.move(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(move, "move(this, target, *options)");
        return move;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final boolean notExists(Path path, LinkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return Files.notExists(path, (LinkOption[]) Arrays.copyOf(options, options.length));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final /* synthetic */ <A extends BasicFileAttributes> A readAttributes(Path path, LinkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
        A a5 = (A) Files.readAttributes(path, BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(a5, "readAttributes(this, A::class.java, *options)");
        return a5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Map<String, Object> readAttributes(Path path, String attributes, LinkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(options, "options");
        Map<String, Object> readAttributes = Files.readAttributes(path, attributes, (LinkOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(readAttributes, "readAttributes(this, attributes, *options)");
        return readAttributes;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path readSymbolicLink(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Path readSymbolicLink = Files.readSymbolicLink(path);
        Intrinsics.checkNotNullExpressionValue(readSymbolicLink, "readSymbolicLink(this)");
        return readSymbolicLink;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static final Path relativeTo(Path path, Path base) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        try {
            return PathRelativizer.INSTANCE.tryRelativeTo(path, base);
        } catch (IllegalArgumentException e5) {
            throw new IllegalArgumentException(e5.getMessage() + "\nthis path: " + path + "\nbase path: " + base, e5);
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static final Path relativeToOrNull(Path path, Path base) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        try {
            return PathRelativizer.INSTANCE.tryRelativeTo(path, base);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static final Path relativeToOrSelf(Path path, Path base) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        Path relativeToOrNull = relativeToOrNull(path, base);
        return relativeToOrNull == null ? path : relativeToOrNull;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path setAttribute(Path path, String attribute, Object obj, LinkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        Intrinsics.checkNotNullParameter(options, "options");
        Path attribute2 = Files.setAttribute(path, attribute, obj, (LinkOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(attribute2, "setAttribute(this, attribute, value, *options)");
        return attribute2;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path setLastModifiedTime(Path path, FileTime value) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Path lastModifiedTime = Files.setLastModifiedTime(path, value);
        Intrinsics.checkNotNullExpressionValue(lastModifiedTime, "setLastModifiedTime(this, value)");
        return lastModifiedTime;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path setOwner(Path path, UserPrincipal value) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Path owner = Files.setOwner(path, value);
        Intrinsics.checkNotNullExpressionValue(owner, "setOwner(this, value)");
        return owner;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path setPosixFilePermissions(Path path, Set<? extends PosixFilePermission> value) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Path posixFilePermissions = Files.setPosixFilePermissions(path, value);
        Intrinsics.checkNotNullExpressionValue(posixFilePermissions, "setPosixFilePermissions(this, value)");
        return posixFilePermissions;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path toPath(URI uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Path path = Paths.get(uri);
        Intrinsics.checkNotNullExpressionValue(path, "get(this)");
        return path;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final <T> T useDirectoryEntries(Path path, String glob, Function1<? super Sequence<? extends Path>, ? extends T> block) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        Intrinsics.checkNotNullParameter(block, "block");
        DirectoryStream<Path> it = Files.newDirectoryStream(path, glob);
        try {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            T invoke = block.invoke(CollectionsKt.asSequence(it));
            InlineMarker.finallyStart(1);
            CloseableKt.closeFinally(it, null);
            InlineMarker.finallyEnd(1);
            return invoke;
        } finally {
        }
    }

    public static /* synthetic */ Object useDirectoryEntries$default(Path path, String glob, Function1 block, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            glob = ProxyConfig.MATCH_ALL_SCHEMES;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        Intrinsics.checkNotNullParameter(block, "block");
        DirectoryStream<Path> it = Files.newDirectoryStream(path, glob);
        try {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            Object invoke = block.invoke(CollectionsKt.asSequence(it));
            InlineMarker.finallyStart(1);
            CloseableKt.closeFinally(it, null);
            InlineMarker.finallyEnd(1);
            return invoke;
        } finally {
        }
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalPathApi
    public static final void visitFileTree(Path path, int i5, boolean z4, Function1<? super FileVisitorBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        visitFileTree(path, fileVisitor(builderAction), i5, z4);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalPathApi
    public static final void visitFileTree(Path path, FileVisitor<Path> visitor, int i5, boolean z4) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Files.walkFileTree(path, z4 ? SetsKt.setOf(FileVisitOption.FOLLOW_LINKS) : SetsKt.emptySet(), i5, visitor);
    }

    public static /* synthetic */ void visitFileTree$default(Path path, int i5, boolean z4, Function1 function1, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        if ((i6 & 2) != 0) {
            z4 = false;
        }
        visitFileTree(path, i5, z4, (Function1<? super FileVisitorBuilder, Unit>) function1);
    }

    public static /* synthetic */ void visitFileTree$default(Path path, FileVisitor fileVisitor, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        visitFileTree(path, (FileVisitor<Path>) fileVisitor, i5, z4);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalPathApi
    public static final Sequence<Path> walk(Path path, PathWalkOption... options) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        return new PathTreeWalk(path, options);
    }
}
