package kotlin.io;

import androidx.activity.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

/* loaded from: classes4.dex */
class FilesKt__UtilsKt extends FilesKt__FileTreeWalkKt {
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean copyRecursively(java.io.File r11, java.io.File r12, boolean r13, final kotlin.jvm.functions.Function2<? super java.io.File, ? super java.io.IOException, ? extends kotlin.io.OnErrorAction> r14) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "onError"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            boolean r0 = r11.exists()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L2e
            kotlin.io.NoSuchFileException r12 = new kotlin.io.NoSuchFileException
            r5 = 0
            r7 = 2
            r8 = 0
            java.lang.String r6 = "The source file doesn't exist."
            r3 = r12
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r11 = r14.invoke(r11, r12)
            kotlin.io.OnErrorAction r12 = kotlin.io.OnErrorAction.TERMINATE
            if (r11 == r12) goto L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            return r1
        L2e:
            kotlin.io.FileTreeWalk r0 = kotlin.io.FilesKt__FileTreeWalkKt.walkTopDown(r11)     // Catch: kotlin.io.TerminateException -> Ldc
            kotlin.io.FilesKt__UtilsKt$copyRecursively$2 r3 = new kotlin.io.FilesKt__UtilsKt$copyRecursively$2     // Catch: kotlin.io.TerminateException -> Ldc
            r3.<init>()     // Catch: kotlin.io.TerminateException -> Ldc
            kotlin.io.FileTreeWalk r0 = r0.onFail(r3)     // Catch: kotlin.io.TerminateException -> Ldc
            java.util.Iterator r0 = r0.iterator()     // Catch: kotlin.io.TerminateException -> Ldc
        L3f:
            boolean r3 = r0.hasNext()     // Catch: kotlin.io.TerminateException -> Ldc
            if (r3 == 0) goto Ldb
            java.lang.Object r3 = r0.next()     // Catch: kotlin.io.TerminateException -> Ldc
            java.io.File r3 = (java.io.File) r3     // Catch: kotlin.io.TerminateException -> Ldc
            boolean r4 = r3.exists()     // Catch: kotlin.io.TerminateException -> Ldc
            if (r4 != 0) goto L66
            kotlin.io.NoSuchFileException r10 = new kotlin.io.NoSuchFileException     // Catch: kotlin.io.TerminateException -> Ldc
            r6 = 0
            java.lang.String r7 = "The source file doesn't exist."
            r8 = 2
            r9 = 0
            r4 = r10
            r5 = r3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: kotlin.io.TerminateException -> Ldc
            java.lang.Object r3 = r14.invoke(r3, r10)     // Catch: kotlin.io.TerminateException -> Ldc
            kotlin.io.OnErrorAction r4 = kotlin.io.OnErrorAction.TERMINATE     // Catch: kotlin.io.TerminateException -> Ldc
            if (r3 != r4) goto L3f
            return r2
        L66:
            java.lang.String r4 = toRelativeString(r3, r11)     // Catch: kotlin.io.TerminateException -> Ldc
            java.io.File r5 = new java.io.File     // Catch: kotlin.io.TerminateException -> Ldc
            r5.<init>(r12, r4)     // Catch: kotlin.io.TerminateException -> Ldc
            boolean r4 = r5.exists()     // Catch: kotlin.io.TerminateException -> Ldc
            if (r4 == 0) goto Lac
            boolean r4 = r3.isDirectory()     // Catch: kotlin.io.TerminateException -> Ldc
            if (r4 == 0) goto L81
            boolean r4 = r5.isDirectory()     // Catch: kotlin.io.TerminateException -> Ldc
            if (r4 != 0) goto Lac
        L81:
            if (r13 != 0) goto L85
        L83:
            r4 = 1
            goto L9a
        L85:
            boolean r4 = r5.isDirectory()     // Catch: kotlin.io.TerminateException -> Ldc
            if (r4 == 0) goto L92
            boolean r4 = deleteRecursively(r5)     // Catch: kotlin.io.TerminateException -> Ldc
            if (r4 != 0) goto L99
            goto L83
        L92:
            boolean r4 = r5.delete()     // Catch: kotlin.io.TerminateException -> Ldc
            if (r4 != 0) goto L99
            goto L83
        L99:
            r4 = 0
        L9a:
            if (r4 == 0) goto Lac
            kotlin.io.FileAlreadyExistsException r4 = new kotlin.io.FileAlreadyExistsException     // Catch: kotlin.io.TerminateException -> Ldc
            java.lang.String r6 = "The destination file already exists."
            r4.<init>(r3, r5, r6)     // Catch: kotlin.io.TerminateException -> Ldc
            java.lang.Object r3 = r14.invoke(r5, r4)     // Catch: kotlin.io.TerminateException -> Ldc
            kotlin.io.OnErrorAction r4 = kotlin.io.OnErrorAction.TERMINATE     // Catch: kotlin.io.TerminateException -> Ldc
            if (r3 != r4) goto L3f
            return r2
        Lac:
            boolean r4 = r3.isDirectory()     // Catch: kotlin.io.TerminateException -> Ldc
            if (r4 == 0) goto Lb6
            r5.mkdirs()     // Catch: kotlin.io.TerminateException -> Ldc
            goto L3f
        Lb6:
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r3
            r6 = r13
            java.io.File r4 = copyTo$default(r4, r5, r6, r7, r8, r9)     // Catch: kotlin.io.TerminateException -> Ldc
            long r4 = r4.length()     // Catch: kotlin.io.TerminateException -> Ldc
            long r6 = r3.length()     // Catch: kotlin.io.TerminateException -> Ldc
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L3f
            java.io.IOException r4 = new java.io.IOException     // Catch: kotlin.io.TerminateException -> Ldc
            java.lang.String r5 = "Source file wasn't copied completely, length of destination file differs."
            r4.<init>(r5)     // Catch: kotlin.io.TerminateException -> Ldc
            java.lang.Object r3 = r14.invoke(r3, r4)     // Catch: kotlin.io.TerminateException -> Ldc
            kotlin.io.OnErrorAction r4 = kotlin.io.OnErrorAction.TERMINATE     // Catch: kotlin.io.TerminateException -> Ldc
            if (r3 != r4) goto L3f
            return r2
        Ldb:
            return r1
        Ldc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FilesKt__UtilsKt.copyRecursively(java.io.File, java.io.File, boolean, kotlin.jvm.functions.Function2):boolean");
    }

    public static /* synthetic */ boolean copyRecursively$default(File file, File file2, boolean z4, Function2 function2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        if ((i5 & 4) != 0) {
            function2 = new Function2() { // from class: kotlin.io.FilesKt__UtilsKt$copyRecursively$1
                @Override // kotlin.jvm.functions.Function2
                public final Void invoke(File file3, IOException exception) {
                    Intrinsics.checkNotNullParameter(file3, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    throw exception;
                }
            };
        }
        return copyRecursively(file, file2, z4, function2);
    }

    public static final File copyTo(File file, File target, boolean z4, int i5) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z4) {
                throw new FileAlreadyExistsException(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new FileAlreadyExistsException(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (!file.isDirectory()) {
            File parentFile = target.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(target);
                try {
                    ByteStreamsKt.copyTo(fileInputStream, fileOutputStream, i5);
                    CloseableKt.closeFinally(fileOutputStream, null);
                    CloseableKt.closeFinally(fileInputStream, null);
                } finally {
                }
            } finally {
            }
        } else if (!target.mkdirs()) {
            throw new FileSystemException(file, target, "Failed to create target directory.");
        }
        return target;
    }

    public static /* synthetic */ File copyTo$default(File file, File file2, boolean z4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z4 = false;
        }
        if ((i6 & 4) != 0) {
            i5 = 8192;
        }
        return copyTo(file, file2, z4, i5);
    }

    @Deprecated(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    public static final File createTempDir(String prefix, String str, File file) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        File dir = File.createTempFile(prefix, str, file);
        dir.delete();
        if (dir.mkdir()) {
            Intrinsics.checkNotNullExpressionValue(dir, "dir");
            return dir;
        }
        throw new IOException("Unable to create temporary directory " + dir + FilenameUtils.EXTENSION_SEPARATOR);
    }

    public static /* synthetic */ File createTempDir$default(String str, String str2, File file, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = "tmp";
        }
        if ((i5 & 2) != 0) {
            str2 = null;
        }
        if ((i5 & 4) != 0) {
            file = null;
        }
        return createTempDir(str, str2, file);
    }

    @Deprecated(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    public static final File createTempFile(String prefix, String str, File file) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        File createTempFile = File.createTempFile(prefix, str, file);
        Intrinsics.checkNotNullExpressionValue(createTempFile, "createTempFile(prefix, suffix, directory)");
        return createTempFile;
    }

    public static /* synthetic */ File createTempFile$default(String str, String str2, File file, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = "tmp";
        }
        if ((i5 & 2) != 0) {
            str2 = null;
        }
        if ((i5 & 4) != 0) {
            file = null;
        }
        return createTempFile(str, str2, file);
    }

    public static final boolean deleteRecursively(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        while (true) {
            boolean z4 = true;
            for (File file2 : FilesKt__FileTreeWalkKt.walkBottomUp(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z4) {
                        break;
                    }
                }
                z4 = false;
            }
            return z4;
        }
    }

    public static final boolean endsWith(File file, File other) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        FilePathComponents components = FilesKt__FilePathComponentsKt.toComponents(file);
        FilePathComponents components2 = FilesKt__FilePathComponentsKt.toComponents(other);
        if (components2.isRooted()) {
            return Intrinsics.areEqual(file, other);
        }
        int size = components.getSize() - components2.getSize();
        if (size < 0) {
            return false;
        }
        return components.getSegments().subList(size, components.getSize()).equals(components2.getSegments());
    }

    public static final boolean endsWith(File file, String other) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return endsWith(file, new File(other));
    }

    public static final String getExtension(File file) {
        String substringAfterLast;
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        substringAfterLast = StringsKt__StringsKt.substringAfterLast(name, FilenameUtils.EXTENSION_SEPARATOR, "");
        return substringAfterLast;
    }

    public static final String getInvariantSeparatorsPath(File file) {
        String replace$default;
        Intrinsics.checkNotNullParameter(file, "<this>");
        char c5 = File.separatorChar;
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "path");
        if (c5 == '/') {
            return path;
        }
        replace$default = StringsKt__StringsJVMKt.replace$default(path, File.separatorChar, IOUtils.DIR_SEPARATOR_UNIX, false, 4, (Object) null);
        return replace$default;
    }

    public static final String getNameWithoutExtension(File file) {
        String substringBeforeLast$default;
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        substringBeforeLast$default = StringsKt__StringsKt.substringBeforeLast$default(name, ".", (String) null, 2, (Object) null);
        return substringBeforeLast$default;
    }

    public static final File normalize(File file) {
        String joinToString$default;
        Intrinsics.checkNotNullParameter(file, "<this>");
        FilePathComponents components = FilesKt__FilePathComponentsKt.toComponents(file);
        File root = components.getRoot();
        List<File> normalize$FilesKt__UtilsKt = normalize$FilesKt__UtilsKt(components.getSegments());
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(normalize$FilesKt__UtilsKt, separator, null, null, 0, null, null, 62, null);
        return resolve(root, joinToString$default);
    }

    private static final List<File> normalize$FilesKt__UtilsKt(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!Intrinsics.areEqual(name, ".")) {
                if (!Intrinsics.areEqual(name, "..") || arrayList.isEmpty() || Intrinsics.areEqual(((File) CollectionsKt.last((List) arrayList)).getName(), "..")) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }

    private static final FilePathComponents normalize$FilesKt__UtilsKt(FilePathComponents filePathComponents) {
        return new FilePathComponents(filePathComponents.getRoot(), normalize$FilesKt__UtilsKt(filePathComponents.getSegments()));
    }

    public static final File relativeTo(File file, File base) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        return new File(toRelativeString(file, base));
    }

    public static final File relativeToOrNull(File file, File base) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, base);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return new File(relativeStringOrNull$FilesKt__UtilsKt);
        }
        return null;
    }

    public static final File relativeToOrSelf(File file, File base) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, base);
        return relativeStringOrNull$FilesKt__UtilsKt != null ? new File(relativeStringOrNull$FilesKt__UtilsKt) : file;
    }

    public static final File resolve(File file, File relative) {
        boolean endsWith$default;
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        if (FilesKt__FilePathComponentsKt.isRooted(relative)) {
            return relative;
        }
        String file2 = file.toString();
        Intrinsics.checkNotNullExpressionValue(file2, "this.toString()");
        if (!(file2.length() == 0)) {
            endsWith$default = StringsKt__StringsKt.endsWith$default(file2, File.separatorChar, false, 2, (Object) null);
            if (!endsWith$default) {
                StringBuilder g5 = d.g(file2);
                g5.append(File.separatorChar);
                g5.append(relative);
                return new File(g5.toString());
            }
        }
        return new File(file2 + relative);
    }

    public static final File resolve(File file, String relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        return resolve(file, new File(relative));
    }

    public static final File resolveSibling(File file, File relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        FilePathComponents components = FilesKt__FilePathComponentsKt.toComponents(file);
        return resolve(resolve(components.getRoot(), components.getSize() == 0 ? new File("..") : components.subPath(0, components.getSize() - 1)), relative);
    }

    public static final File resolveSibling(File file, String relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        return resolveSibling(file, new File(relative));
    }

    public static final boolean startsWith(File file, File other) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        FilePathComponents components = FilesKt__FilePathComponentsKt.toComponents(file);
        FilePathComponents components2 = FilesKt__FilePathComponentsKt.toComponents(other);
        if (Intrinsics.areEqual(components.getRoot(), components2.getRoot()) && components.getSize() >= components2.getSize()) {
            return components.getSegments().subList(0, components2.getSize()).equals(components2.getSegments());
        }
        return false;
    }

    public static final boolean startsWith(File file, String other) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return startsWith(file, new File(other));
    }

    public static final String toRelativeString(File file, File base) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, base);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return relativeStringOrNull$FilesKt__UtilsKt;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + base + FilenameUtils.EXTENSION_SEPARATOR);
    }

    private static final String toRelativeStringOrNull$FilesKt__UtilsKt(File file, File file2) {
        FilePathComponents normalize$FilesKt__UtilsKt = normalize$FilesKt__UtilsKt(FilesKt__FilePathComponentsKt.toComponents(file));
        FilePathComponents normalize$FilesKt__UtilsKt2 = normalize$FilesKt__UtilsKt(FilesKt__FilePathComponentsKt.toComponents(file2));
        if (!Intrinsics.areEqual(normalize$FilesKt__UtilsKt.getRoot(), normalize$FilesKt__UtilsKt2.getRoot())) {
            return null;
        }
        int size = normalize$FilesKt__UtilsKt2.getSize();
        int size2 = normalize$FilesKt__UtilsKt.getSize();
        int i5 = 0;
        int min = Math.min(size2, size);
        while (i5 < min && Intrinsics.areEqual(normalize$FilesKt__UtilsKt.getSegments().get(i5), normalize$FilesKt__UtilsKt2.getSegments().get(i5))) {
            i5++;
        }
        StringBuilder sb = new StringBuilder();
        int i6 = size - 1;
        if (i5 <= i6) {
            while (!Intrinsics.areEqual(normalize$FilesKt__UtilsKt2.getSegments().get(i6).getName(), "..")) {
                sb.append("..");
                if (i6 != i5) {
                    sb.append(File.separatorChar);
                }
                if (i6 != i5) {
                    i6--;
                }
            }
            return null;
        }
        if (i5 < size2) {
            if (i5 < size) {
                sb.append(File.separatorChar);
            }
            List drop = CollectionsKt.drop(normalize$FilesKt__UtilsKt.getSegments(), i5);
            String separator = File.separator;
            Intrinsics.checkNotNullExpressionValue(separator, "separator");
            CollectionsKt.d(drop, sb, separator);
        }
        return sb.toString();
    }
}
