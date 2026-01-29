package org.apache.commons.io;

import androidx.activity.d;
import androidx.core.location.e;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;
import org.apache.commons.io.file.AccumulatorPathVisitor;
import org.apache.commons.io.file.Counters;
import org.apache.commons.io.file.PathUtils;
import org.apache.commons.io.file.StandardDeleteOption;
import org.apache.commons.io.filefilter.FileEqualsFileFilter;
import org.apache.commons.io.filefilter.FileFileFilter;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;

/* loaded from: classes14.dex */
public class FileUtils {
    public static final File[] EMPTY_FILE_ARRAY;
    public static final long ONE_EB = 1152921504606846976L;
    public static final BigInteger ONE_EB_BI;
    public static final long ONE_GB = 1073741824;
    public static final BigInteger ONE_GB_BI;
    public static final long ONE_KB = 1024;
    public static final BigInteger ONE_KB_BI;
    public static final long ONE_MB = 1048576;
    public static final BigInteger ONE_MB_BI;
    public static final long ONE_PB = 1125899906842624L;
    public static final BigInteger ONE_PB_BI;
    public static final long ONE_TB = 1099511627776L;
    public static final BigInteger ONE_TB_BI;
    public static final BigInteger ONE_YB;
    public static final BigInteger ONE_ZB;

    static {
        BigInteger valueOf = BigInteger.valueOf(ONE_KB);
        ONE_KB_BI = valueOf;
        BigInteger multiply = valueOf.multiply(valueOf);
        ONE_MB_BI = multiply;
        BigInteger multiply2 = valueOf.multiply(multiply);
        ONE_GB_BI = multiply2;
        BigInteger multiply3 = valueOf.multiply(multiply2);
        ONE_TB_BI = multiply3;
        BigInteger multiply4 = valueOf.multiply(multiply3);
        ONE_PB_BI = multiply4;
        ONE_EB_BI = valueOf.multiply(multiply4);
        BigInteger multiply5 = BigInteger.valueOf(ONE_KB).multiply(BigInteger.valueOf(ONE_EB));
        ONE_ZB = multiply5;
        ONE_YB = valueOf.multiply(multiply5);
        EMPTY_FILE_ARRAY = new File[0];
    }

    @Deprecated
    public FileUtils() {
    }

    private static CopyOption[] addCopyAttributes(CopyOption... copyOptionArr) {
        CopyOption[] copyOptionArr2 = (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length + 1);
        Arrays.sort(copyOptionArr2, 0, copyOptionArr.length);
        if (Arrays.binarySearch(copyOptionArr, 0, copyOptionArr.length, StandardCopyOption.COPY_ATTRIBUTES) >= 0) {
            return copyOptionArr;
        }
        copyOptionArr2[copyOptionArr2.length - 1] = StandardCopyOption.COPY_ATTRIBUTES;
        return copyOptionArr2;
    }

    public static String byteCountToDisplaySize(long j5) {
        return byteCountToDisplaySize(BigInteger.valueOf(j5));
    }

    public static String byteCountToDisplaySize(BigInteger bigInteger) {
        StringBuilder sb;
        String str;
        Objects.requireNonNull(bigInteger, "size");
        BigInteger bigInteger2 = ONE_EB_BI;
        BigInteger divide = bigInteger.divide(bigInteger2);
        BigInteger bigInteger3 = BigInteger.ZERO;
        if (divide.compareTo(bigInteger3) > 0) {
            sb = new StringBuilder();
            sb.append(bigInteger.divide(bigInteger2));
            str = " EB";
        } else {
            BigInteger bigInteger4 = ONE_PB_BI;
            if (bigInteger.divide(bigInteger4).compareTo(bigInteger3) > 0) {
                sb = new StringBuilder();
                sb.append(bigInteger.divide(bigInteger4));
                str = " PB";
            } else {
                BigInteger bigInteger5 = ONE_TB_BI;
                if (bigInteger.divide(bigInteger5).compareTo(bigInteger3) > 0) {
                    sb = new StringBuilder();
                    sb.append(bigInteger.divide(bigInteger5));
                    str = " TB";
                } else {
                    BigInteger bigInteger6 = ONE_GB_BI;
                    if (bigInteger.divide(bigInteger6).compareTo(bigInteger3) > 0) {
                        sb = new StringBuilder();
                        sb.append(bigInteger.divide(bigInteger6));
                        str = " GB";
                    } else {
                        BigInteger bigInteger7 = ONE_MB_BI;
                        if (bigInteger.divide(bigInteger7).compareTo(bigInteger3) > 0) {
                            sb = new StringBuilder();
                            sb.append(bigInteger.divide(bigInteger7));
                            str = " MB";
                        } else {
                            BigInteger bigInteger8 = ONE_KB_BI;
                            if (bigInteger.divide(bigInteger8).compareTo(bigInteger3) <= 0) {
                                return bigInteger + " bytes";
                            }
                            sb = new StringBuilder();
                            sb.append(bigInteger.divide(bigInteger8));
                            str = " KB";
                        }
                    }
                }
            }
        }
        sb.append(str);
        return sb.toString();
    }

    public static Checksum checksum(File file, Checksum checksum) {
        requireExistsChecked(file, "file");
        requireFile(file, "file");
        Objects.requireNonNull(checksum, "checksum");
        CheckedInputStream checkedInputStream = new CheckedInputStream(Files.newInputStream(file.toPath(), new OpenOption[0]), checksum);
        try {
            IOUtils.consume(checkedInputStream);
            checkedInputStream.close();
            return checksum;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    checkedInputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static long checksumCRC32(File file) {
        return checksum(file, new CRC32()).getValue();
    }

    public static void cleanDirectory(File file) {
        File[] listFiles = listFiles(file, null);
        ArrayList arrayList = new ArrayList();
        for (File file2 : listFiles) {
            try {
                forceDelete(file2);
            } catch (IOException e5) {
                arrayList.add(e5);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new IOExceptionList(file.toString(), arrayList);
        }
    }

    private static void cleanDirectoryOnExit(File file) {
        File[] listFiles = listFiles(file, null);
        ArrayList arrayList = new ArrayList();
        for (File file2 : listFiles) {
            try {
                forceDeleteOnExit(file2);
            } catch (IOException e5) {
                arrayList.add(e5);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new IOExceptionList(arrayList);
        }
    }

    public static boolean contentEquals(File file, File file2) {
        boolean exists;
        if (file == null && file2 == null) {
            return true;
        }
        if (file == null || file2 == null || (exists = file.exists()) != file2.exists()) {
            return false;
        }
        if (!exists) {
            return true;
        }
        requireFile(file, "file1");
        requireFile(file2, "file2");
        if (file.length() != file2.length()) {
            return false;
        }
        if (file.getCanonicalFile().equals(file2.getCanonicalFile())) {
            return true;
        }
        InputStream newInputStream = Files.newInputStream(file.toPath(), new OpenOption[0]);
        try {
            InputStream newInputStream2 = Files.newInputStream(file2.toPath(), new OpenOption[0]);
            try {
                boolean contentEquals = IOUtils.contentEquals(newInputStream, newInputStream2);
                if (newInputStream2 != null) {
                    newInputStream2.close();
                }
                if (newInputStream != null) {
                    newInputStream.close();
                }
                return contentEquals;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (newInputStream != null) {
                    try {
                        newInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static boolean contentEqualsIgnoreEOL(File file, File file2, String str) {
        boolean exists;
        if (file == null && file2 == null) {
            return true;
        }
        if (file == null || file2 == null || (exists = file.exists()) != file2.exists()) {
            return false;
        }
        if (!exists) {
            return true;
        }
        requireFile(file, "file1");
        requireFile(file2, "file2");
        if (file.getCanonicalFile().equals(file2.getCanonicalFile())) {
            return true;
        }
        Charset charset = Charsets.toCharset(str);
        InputStreamReader inputStreamReader = new InputStreamReader(Files.newInputStream(file.toPath(), new OpenOption[0]), charset);
        try {
            InputStreamReader inputStreamReader2 = new InputStreamReader(Files.newInputStream(file2.toPath(), new OpenOption[0]), charset);
            try {
                boolean contentEqualsIgnoreEOL = IOUtils.contentEqualsIgnoreEOL(inputStreamReader, inputStreamReader2);
                inputStreamReader2.close();
                inputStreamReader.close();
                return contentEqualsIgnoreEOL;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static File[] convertFileCollectionToFileArray(Collection<File> collection) {
        return (File[]) collection.toArray(EMPTY_FILE_ARRAY);
    }

    public static void copyDirectory(File file, File file2) {
        copyDirectory(file, file2, true);
    }

    public static void copyDirectory(File file, File file2, FileFilter fileFilter) {
        copyDirectory(file, file2, fileFilter, true);
    }

    public static void copyDirectory(File file, File file2, FileFilter fileFilter, boolean z4) {
        copyDirectory(file, file2, fileFilter, z4, StandardCopyOption.REPLACE_EXISTING);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void copyDirectory(java.io.File r8, java.io.File r9, java.io.FileFilter r10, boolean r11, java.nio.file.CopyOption... r12) {
        /*
            requireFileCopy(r8, r9)
            java.lang.String r0 = "srcDir"
            requireDirectory(r8, r0)
            requireCanonicalPathsNotEquals(r8, r9)
            java.lang.String r0 = r8.getCanonicalPath()
            java.lang.String r1 = r9.getCanonicalPath()
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L3f
            java.io.File[] r0 = listFiles(r8, r10)
            int r1 = r0.length
            if (r1 <= 0) goto L3f
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        L28:
            if (r3 >= r2) goto L40
            r4 = r0[r3]
            java.io.File r5 = new java.io.File
            java.lang.String r4 = r4.getName()
            r5.<init>(r9, r4)
            java.lang.String r4 = r5.getCanonicalPath()
            r1.add(r4)
            int r3 = r3 + 1
            goto L28
        L3f:
            r1 = 0
        L40:
            r5 = r1
            if (r11 == 0) goto L47
            java.nio.file.CopyOption[] r12 = addCopyAttributes(r12)
        L47:
            r7 = r12
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r11
            doCopyDirectory(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.FileUtils.copyDirectory(java.io.File, java.io.File, java.io.FileFilter, boolean, java.nio.file.CopyOption[]):void");
    }

    public static void copyDirectory(File file, File file2, boolean z4) {
        copyDirectory(file, file2, null, z4);
    }

    public static void copyDirectoryToDirectory(File file, File file2) {
        requireDirectoryIfExists(file, "sourceDir");
        requireDirectoryIfExists(file2, "destinationDir");
        copyDirectory(file, new File(file2, file.getName()), true);
    }

    public static long copyFile(File file, OutputStream outputStream) {
        InputStream newInputStream = Files.newInputStream(file.toPath(), new OpenOption[0]);
        try {
            long copyLarge = IOUtils.copyLarge(newInputStream, outputStream);
            if (newInputStream != null) {
                newInputStream.close();
            }
            return copyLarge;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (newInputStream != null) {
                    try {
                        newInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static void copyFile(File file, File file2) {
        copyFile(file, file2, StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING);
    }

    public static void copyFile(File file, File file2, boolean z4) {
        copyFile(file, file2, z4 ? new CopyOption[]{StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING} : new CopyOption[]{StandardCopyOption.REPLACE_EXISTING});
    }

    public static void copyFile(File file, File file2, boolean z4, CopyOption... copyOptionArr) {
        if (z4) {
            copyOptionArr = addCopyAttributes(copyOptionArr);
        }
        copyFile(file, file2, copyOptionArr);
    }

    public static void copyFile(File file, File file2, CopyOption... copyOptionArr) {
        requireFileCopy(file, file2);
        requireFile(file, "srcFile");
        requireCanonicalPathsNotEquals(file, file2);
        createParentDirectories(file2);
        requireFileIfExists(file2, "destFile");
        if (file2.exists()) {
            requireCanWrite(file2, "destFile");
        }
        Files.copy(file.toPath(), file2.toPath(), copyOptionArr);
        requireEqualSizes(file, file2, file.length(), file2.length());
    }

    public static void copyFileToDirectory(File file, File file2) {
        copyFileToDirectory(file, file2, true);
    }

    public static void copyFileToDirectory(File file, File file2, boolean z4) {
        Objects.requireNonNull(file, "sourceFile");
        requireDirectoryIfExists(file2, "destinationDir");
        copyFile(file, new File(file2, file.getName()), z4);
    }

    public static void copyInputStreamToFile(InputStream inputStream, File file) {
        try {
            copyToFile(inputStream, file);
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static void copyToDirectory(File file, File file2) {
        Objects.requireNonNull(file, "sourceFile");
        if (file.isFile()) {
            copyFileToDirectory(file, file2);
            return;
        }
        if (file.isDirectory()) {
            copyDirectoryToDirectory(file, file2);
            return;
        }
        throw new FileNotFoundException("The source " + file + " does not exist");
    }

    public static void copyToDirectory(Iterable<File> iterable, File file) {
        Objects.requireNonNull(iterable, "sourceIterable");
        Iterator<File> it = iterable.iterator();
        while (it.hasNext()) {
            copyFileToDirectory(it.next(), file);
        }
    }

    public static void copyToFile(InputStream inputStream, File file) {
        FileOutputStream openOutputStream = openOutputStream(file);
        try {
            IOUtils.copy(inputStream, openOutputStream);
            if (openOutputStream != null) {
                openOutputStream.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (openOutputStream != null) {
                    try {
                        openOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static void copyURLToFile(URL url, File file) {
        InputStream openStream = url.openStream();
        try {
            copyInputStreamToFile(openStream, file);
            if (openStream != null) {
                openStream.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (openStream != null) {
                    try {
                        openStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static void copyURLToFile(URL url, File file, int i5, int i6) {
        URLConnection openConnection = url.openConnection();
        openConnection.setConnectTimeout(i5);
        openConnection.setReadTimeout(i6);
        InputStream inputStream = openConnection.getInputStream();
        try {
            copyInputStreamToFile(inputStream, file);
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static File createParentDirectories(File file) {
        return mkdirs(getParentFile(file));
    }

    public static String decodeUrl(String str) {
        int i5;
        if (str == null || str.indexOf(37) < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        ByteBuffer allocate = ByteBuffer.allocate(length);
        int i6 = 0;
        while (i6 < length) {
            if (str.charAt(i6) == '%') {
                while (true) {
                    i5 = i6 + 3;
                    try {
                        try {
                            allocate.put((byte) Integer.parseInt(str.substring(i6 + 1, i5), 16));
                            if (i5 >= length) {
                                break;
                            }
                            try {
                                if (str.charAt(i5) != '%') {
                                    break;
                                }
                                i6 = i5;
                            } catch (RuntimeException unused) {
                                i6 = i5;
                                if (allocate.position() > 0) {
                                    allocate.flip();
                                    sb.append(StandardCharsets.UTF_8.decode(allocate).toString());
                                    allocate.clear();
                                }
                                sb.append(str.charAt(i6));
                                i6++;
                            }
                        } catch (RuntimeException unused2) {
                        }
                    } finally {
                        if (allocate.position() > 0) {
                            allocate.flip();
                            sb.append(StandardCharsets.UTF_8.decode(allocate).toString());
                            allocate.clear();
                        }
                    }
                }
                i6 = i5;
            }
            sb.append(str.charAt(i6));
            i6++;
        }
        return sb.toString();
    }

    public static File delete(File file) {
        Objects.requireNonNull(file, "file");
        Files.delete(file.toPath());
        return file;
    }

    public static void deleteDirectory(File file) {
        Objects.requireNonNull(file, "directory");
        if (file.exists()) {
            if (!isSymlink(file)) {
                cleanDirectory(file);
            }
            delete(file);
        }
    }

    private static void deleteDirectoryOnExit(File file) {
        if (file.exists()) {
            file.deleteOnExit();
            if (isSymlink(file)) {
                return;
            }
            cleanDirectoryOnExit(file);
        }
    }

    public static boolean deleteQuietly(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.isDirectory()) {
                cleanDirectory(file);
            }
        } catch (Exception unused) {
        }
        try {
            return file.delete();
        } catch (Exception unused2) {
            return false;
        }
    }

    public static boolean directoryContains(File file, File file2) {
        requireDirectoryExists(file, "directory");
        if (file2 != null && file.exists() && file2.exists()) {
            return FilenameUtils.directoryContains(file.getCanonicalPath(), file2.getCanonicalPath());
        }
        return false;
    }

    private static void doCopyDirectory(File file, File file2, FileFilter fileFilter, List<String> list, boolean z4, CopyOption... copyOptionArr) {
        File[] listFiles = listFiles(file, fileFilter);
        requireDirectoryIfExists(file2, "destDir");
        mkdirs(file2);
        requireCanWrite(file2, "destDir");
        for (File file3 : listFiles) {
            File file4 = new File(file2, file3.getName());
            if (list == null || !list.contains(file3.getCanonicalPath())) {
                if (file3.isDirectory()) {
                    doCopyDirectory(file3, file4, fileFilter, list, z4, copyOptionArr);
                } else {
                    copyFile(file3, file4, copyOptionArr);
                }
            }
        }
        if (z4) {
            setLastModified(file, file2);
        }
    }

    public static void forceDelete(File file) {
        Objects.requireNonNull(file, "file");
        try {
            Counters.PathCounters delete = PathUtils.delete(file.toPath(), PathUtils.EMPTY_LINK_OPTION_ARRAY, StandardDeleteOption.OVERRIDE_READ_ONLY);
            if (delete.getFileCounter().get() >= 1 || delete.getDirectoryCounter().get() >= 1) {
                return;
            }
            throw new FileNotFoundException("File does not exist: " + file);
        } catch (IOException e5) {
            throw new IOException("Cannot delete file: " + file, e5);
        }
    }

    public static void forceDeleteOnExit(File file) {
        Objects.requireNonNull(file, "file");
        if (file.isDirectory()) {
            deleteDirectoryOnExit(file);
        } else {
            file.deleteOnExit();
        }
    }

    public static void forceMkdir(File file) {
        mkdirs(file);
    }

    public static void forceMkdirParent(File file) {
        Objects.requireNonNull(file, "file");
        File parentFile = getParentFile(file);
        if (parentFile == null) {
            return;
        }
        forceMkdir(parentFile);
    }

    public static File getFile(File file, String... strArr) {
        Objects.requireNonNull(file, "directory");
        Objects.requireNonNull(strArr, "names");
        int length = strArr.length;
        int i5 = 0;
        while (i5 < length) {
            File file2 = new File(file, strArr[i5]);
            i5++;
            file = file2;
        }
        return file;
    }

    public static File getFile(String... strArr) {
        Objects.requireNonNull(strArr, "names");
        File file = null;
        for (String str : strArr) {
            file = file == null ? new File(str) : new File(file, str);
        }
        return file;
    }

    private static File getParentFile(File file) {
        if (file == null) {
            return null;
        }
        return file.getParentFile();
    }

    public static File getTempDirectory() {
        return new File(getTempDirectoryPath());
    }

    public static String getTempDirectoryPath() {
        return System.getProperty("java.io.tmpdir");
    }

    public static File getUserDirectory() {
        return new File(getUserDirectoryPath());
    }

    public static String getUserDirectoryPath() {
        return System.getProperty("user.home");
    }

    public static boolean isDirectory(File file, LinkOption... linkOptionArr) {
        return file != null && Files.isDirectory(file.toPath(), linkOptionArr);
    }

    public static boolean isEmptyDirectory(File file) {
        return PathUtils.isEmptyDirectory(file.toPath());
    }

    public static boolean isFileNewer(File file, long j5) {
        Objects.requireNonNull(file, "file");
        return file.exists() && lastModifiedUnchecked(file) > j5;
    }

    public static boolean isFileNewer(File file, File file2) {
        requireExists(file2, "reference");
        return isFileNewer(file, lastModifiedUnchecked(file2));
    }

    public static boolean isFileNewer(File file, Instant instant) {
        Objects.requireNonNull(instant, "instant");
        return isFileNewer(file, instant.toEpochMilli());
    }

    public static boolean isFileNewer(File file, ChronoLocalDate chronoLocalDate) {
        return isFileNewer(file, chronoLocalDate, LocalTime.now());
    }

    public static boolean isFileNewer(File file, ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(chronoLocalDate, "chronoLocalDate");
        Objects.requireNonNull(localTime, "localTime");
        return isFileNewer(file, chronoLocalDate.atTime(localTime));
    }

    public static boolean isFileNewer(File file, ChronoLocalDateTime<?> chronoLocalDateTime) {
        return isFileNewer(file, chronoLocalDateTime, ZoneId.systemDefault());
    }

    public static boolean isFileNewer(File file, ChronoLocalDateTime<?> chronoLocalDateTime, ZoneId zoneId) {
        Objects.requireNonNull(chronoLocalDateTime, "chronoLocalDateTime");
        Objects.requireNonNull(zoneId, "zoneId");
        return isFileNewer(file, chronoLocalDateTime.atZone(zoneId));
    }

    public static boolean isFileNewer(File file, ChronoZonedDateTime<?> chronoZonedDateTime) {
        Objects.requireNonNull(chronoZonedDateTime, "chronoZonedDateTime");
        return isFileNewer(file, chronoZonedDateTime.toInstant());
    }

    public static boolean isFileNewer(File file, Date date) {
        Objects.requireNonNull(date, "date");
        return isFileNewer(file, date.getTime());
    }

    public static boolean isFileOlder(File file, long j5) {
        Objects.requireNonNull(file, "file");
        return file.exists() && lastModifiedUnchecked(file) < j5;
    }

    public static boolean isFileOlder(File file, File file2) {
        requireExists(file2, "reference");
        return isFileOlder(file, lastModifiedUnchecked(file2));
    }

    public static boolean isFileOlder(File file, Instant instant) {
        Objects.requireNonNull(instant, "instant");
        return isFileOlder(file, instant.toEpochMilli());
    }

    public static boolean isFileOlder(File file, ChronoLocalDate chronoLocalDate) {
        return isFileOlder(file, chronoLocalDate, LocalTime.now());
    }

    public static boolean isFileOlder(File file, ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(chronoLocalDate, "chronoLocalDate");
        Objects.requireNonNull(localTime, "localTime");
        return isFileOlder(file, chronoLocalDate.atTime(localTime));
    }

    public static boolean isFileOlder(File file, ChronoLocalDateTime<?> chronoLocalDateTime) {
        return isFileOlder(file, chronoLocalDateTime, ZoneId.systemDefault());
    }

    public static boolean isFileOlder(File file, ChronoLocalDateTime<?> chronoLocalDateTime, ZoneId zoneId) {
        Objects.requireNonNull(chronoLocalDateTime, "chronoLocalDateTime");
        Objects.requireNonNull(zoneId, "zoneId");
        return isFileOlder(file, chronoLocalDateTime.atZone(zoneId));
    }

    public static boolean isFileOlder(File file, ChronoZonedDateTime<?> chronoZonedDateTime) {
        Objects.requireNonNull(chronoZonedDateTime, "chronoZonedDateTime");
        return isFileOlder(file, chronoZonedDateTime.toInstant());
    }

    public static boolean isFileOlder(File file, Date date) {
        Objects.requireNonNull(date, "date");
        return isFileOlder(file, date.getTime());
    }

    public static boolean isRegularFile(File file, LinkOption... linkOptionArr) {
        return file != null && Files.isRegularFile(file.toPath(), linkOptionArr);
    }

    public static boolean isSymlink(File file) {
        return file != null && Files.isSymbolicLink(file.toPath());
    }

    public static Iterator<File> iterateFiles(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return listFiles(file, iOFileFilter, iOFileFilter2).iterator();
    }

    public static Iterator<File> iterateFiles(File file, String[] strArr, boolean z4) {
        try {
            return StreamIterator.iterator(streamFiles(file, z4, strArr));
        } catch (IOException e5) {
            throw new UncheckedIOException(file.toString(), e5);
        }
    }

    public static Iterator<File> iterateFilesAndDirs(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return listFilesAndDirs(file, iOFileFilter, iOFileFilter2).iterator();
    }

    public static long lastModified(File file) {
        Path path = file.toPath();
        Objects.requireNonNull(path, "file");
        return Files.getLastModifiedTime(path, new LinkOption[0]).toMillis();
    }

    public static long lastModifiedUnchecked(File file) {
        try {
            return lastModified(file);
        } catch (IOException e5) {
            throw new UncheckedIOException(file.toString(), e5);
        }
    }

    public static LineIterator lineIterator(File file) {
        return lineIterator(file, null);
    }

    public static LineIterator lineIterator(File file, String str) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = openInputStream(file);
            return IOUtils.lineIterator(fileInputStream, str);
        } catch (IOException | RuntimeException e5) {
            IOUtils.closeQuietly(fileInputStream, new e(e5, 1));
            throw e5;
        }
    }

    private static AccumulatorPathVisitor listAccumulate(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        boolean z4 = iOFileFilter2 != null;
        IOFileFilter fileEqualsFileFilter = new FileEqualsFileFilter(file);
        if (z4) {
            fileEqualsFileFilter = h4.b.d(fileEqualsFileFilter, iOFileFilter2);
        }
        AccumulatorPathVisitor accumulatorPathVisitor = new AccumulatorPathVisitor(Counters.noopPathCounters(), iOFileFilter, fileEqualsFileFilter);
        Files.walkFileTree(file.toPath(), Collections.emptySet(), toMaxDepth(z4), accumulatorPathVisitor);
        return accumulatorPathVisitor;
    }

    public static Collection<File> listFiles(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        try {
            return (Collection) listAccumulate(file, iOFileFilter, iOFileFilter2).getFileList().stream().map(a.f4582a).collect(Collectors.toList());
        } catch (IOException e5) {
            throw new UncheckedIOException(file.toString(), e5);
        }
    }

    public static Collection<File> listFiles(File file, String[] strArr, boolean z4) {
        try {
            return toList(streamFiles(file, z4, strArr));
        } catch (IOException e5) {
            throw new UncheckedIOException(file.toString(), e5);
        }
    }

    private static File[] listFiles(File file, FileFilter fileFilter) {
        requireDirectoryExists(file, "directory");
        File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        if (listFiles != null) {
            return listFiles;
        }
        throw new IOException("Unknown I/O error listing contents of directory: " + file);
    }

    public static Collection<File> listFilesAndDirs(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        try {
            AccumulatorPathVisitor listAccumulate = listAccumulate(file, iOFileFilter, iOFileFilter2);
            List<Path> fileList = listAccumulate.getFileList();
            fileList.addAll(listAccumulate.getDirList());
            return (Collection) fileList.stream().map(a.f4582a).collect(Collectors.toList());
        } catch (IOException e5) {
            throw new UncheckedIOException(file.toString(), e5);
        }
    }

    private static File mkdirs(File file) {
        if (file == null || file.mkdirs() || file.isDirectory()) {
            return file;
        }
        throw new IOException("Cannot create directory '" + file + "'.");
    }

    public static void moveDirectory(File file, File file2) {
        validateMoveParameters(file, file2);
        requireDirectory(file, "srcDir");
        requireAbsent(file2, "destDir");
        if (file.renameTo(file2)) {
            return;
        }
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath() + File.separator)) {
            throw new IOException("Cannot move directory: " + file + " to a subdirectory of itself: " + file2);
        }
        copyDirectory(file, file2);
        deleteDirectory(file);
        if (file.exists()) {
            throw new IOException("Failed to delete original directory '" + file + "' after copy to '" + file2 + "'");
        }
    }

    public static void moveDirectoryToDirectory(File file, File file2, boolean z4) {
        validateMoveParameters(file, file2);
        if (!file2.isDirectory()) {
            if (file2.exists()) {
                throw new IOException("Destination '" + file2 + "' is not a directory");
            }
            if (!z4) {
                throw new FileNotFoundException("Destination directory '" + file2 + "' does not exist [createDestDir=false]");
            }
            mkdirs(file2);
        }
        moveDirectory(file, new File(file2, file.getName()));
    }

    public static void moveFile(File file, File file2) {
        moveFile(file, file2, StandardCopyOption.COPY_ATTRIBUTES);
    }

    public static void moveFile(File file, File file2, CopyOption... copyOptionArr) {
        validateMoveParameters(file, file2);
        requireFile(file, "srcFile");
        requireAbsent(file2, null);
        if (file.renameTo(file2)) {
            return;
        }
        copyFile(file, file2, copyOptionArr);
        if (file.delete()) {
            return;
        }
        deleteQuietly(file2);
        throw new IOException("Failed to delete original file '" + file + "' after copy to '" + file2 + "'");
    }

    public static void moveFileToDirectory(File file, File file2, boolean z4) {
        validateMoveParameters(file, file2);
        if (!file2.exists() && z4) {
            mkdirs(file2);
        }
        requireExistsChecked(file2, "destDir");
        requireDirectory(file2, "destDir");
        moveFile(file, new File(file2, file.getName()));
    }

    public static void moveToDirectory(File file, File file2, boolean z4) {
        validateMoveParameters(file, file2);
        if (file.isDirectory()) {
            moveDirectoryToDirectory(file, file2, z4);
        } else {
            moveFileToDirectory(file, file2, z4);
        }
    }

    public static FileInputStream openInputStream(File file) {
        Objects.requireNonNull(file, "file");
        return new FileInputStream(file);
    }

    public static FileOutputStream openOutputStream(File file) {
        return openOutputStream(file, false);
    }

    public static FileOutputStream openOutputStream(File file, boolean z4) {
        Objects.requireNonNull(file, "file");
        if (file.exists()) {
            requireFile(file, "file");
            requireCanWrite(file, "file");
        } else {
            createParentDirectories(file);
        }
        return new FileOutputStream(file, z4);
    }

    public static byte[] readFileToByteArray(File file) {
        FileInputStream openInputStream = openInputStream(file);
        try {
            long length = file.length();
            byte[] byteArray = length > 0 ? IOUtils.toByteArray(openInputStream, length) : IOUtils.toByteArray(openInputStream);
            if (openInputStream != null) {
                openInputStream.close();
            }
            return byteArray;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (openInputStream != null) {
                    try {
                        openInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Deprecated
    public static String readFileToString(File file) {
        return readFileToString(file, Charset.defaultCharset());
    }

    public static String readFileToString(File file, String str) {
        return readFileToString(file, Charsets.toCharset(str));
    }

    public static String readFileToString(File file, Charset charset) {
        FileInputStream openInputStream = openInputStream(file);
        try {
            String iOUtils = IOUtils.toString(openInputStream, Charsets.toCharset(charset));
            if (openInputStream != null) {
                openInputStream.close();
            }
            return iOUtils;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (openInputStream != null) {
                    try {
                        openInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Deprecated
    public static List<String> readLines(File file) {
        return readLines(file, Charset.defaultCharset());
    }

    public static List<String> readLines(File file, String str) {
        return readLines(file, Charsets.toCharset(str));
    }

    public static List<String> readLines(File file, Charset charset) {
        FileInputStream openInputStream = openInputStream(file);
        try {
            List<String> readLines = IOUtils.readLines(openInputStream, Charsets.toCharset(charset));
            if (openInputStream != null) {
                openInputStream.close();
            }
            return readLines;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (openInputStream != null) {
                    try {
                        openInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    private static void requireAbsent(File file, String str) {
        if (file.exists()) {
            throw new FileExistsException(String.format("File element in parameter '%s' already exists: '%s'", str, file));
        }
    }

    private static void requireCanWrite(File file, String str) {
        Objects.requireNonNull(file, "file");
        if (file.canWrite()) {
            return;
        }
        throw new IllegalArgumentException("File parameter '" + str + " is not writable: '" + file + "'");
    }

    private static void requireCanonicalPathsNotEquals(File file, File file2) {
        String canonicalPath = file.getCanonicalPath();
        if (canonicalPath.equals(file2.getCanonicalPath())) {
            throw new IllegalArgumentException(String.format("File canonical paths are equal: '%s' (file1='%s', file2='%s')", canonicalPath, file, file2));
        }
    }

    private static File requireDirectory(File file, String str) {
        Objects.requireNonNull(file, str);
        if (file.isDirectory()) {
            return file;
        }
        throw new IllegalArgumentException("Parameter '" + str + "' is not a directory: '" + file + "'");
    }

    private static File requireDirectoryExists(File file, String str) {
        requireExists(file, str);
        requireDirectory(file, str);
        return file;
    }

    private static File requireDirectoryIfExists(File file, String str) {
        Objects.requireNonNull(file, str);
        if (file.exists()) {
            requireDirectory(file, str);
        }
        return file;
    }

    private static void requireEqualSizes(File file, File file2, long j5, long j6) {
        if (j5 == j6) {
            return;
        }
        throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "' Expected length: " + j5 + " Actual: " + j6);
    }

    private static File requireExists(File file, String str) {
        Objects.requireNonNull(file, str);
        if (file.exists()) {
            return file;
        }
        throw new IllegalArgumentException("File system element for parameter '" + str + "' does not exist: '" + file + "'");
    }

    private static File requireExistsChecked(File file, String str) {
        Objects.requireNonNull(file, str);
        if (file.exists()) {
            return file;
        }
        throw new FileNotFoundException("File system element for parameter '" + str + "' does not exist: '" + file + "'");
    }

    private static File requireFile(File file, String str) {
        Objects.requireNonNull(file, str);
        if (file.isFile()) {
            return file;
        }
        throw new IllegalArgumentException("Parameter '" + str + "' is not a file: " + file);
    }

    private static void requireFileCopy(File file, File file2) {
        requireExistsChecked(file, "source");
        Objects.requireNonNull(file2, "destination");
    }

    private static File requireFileIfExists(File file, String str) {
        Objects.requireNonNull(file, str);
        return file.exists() ? requireFile(file, str) : file;
    }

    private static void setLastModified(File file, long j5) {
        Objects.requireNonNull(file, "file");
        if (!file.setLastModified(j5)) {
            throw new IOException(String.format("Failed setLastModified(%s) on '%s'", Long.valueOf(j5), file));
        }
    }

    private static void setLastModified(File file, File file2) {
        Objects.requireNonNull(file, "sourceFile");
        setLastModified(file2, lastModified(file));
    }

    public static long sizeOf(File file) {
        requireExists(file, "file");
        return file.isDirectory() ? sizeOfDirectory0(file) : file.length();
    }

    private static long sizeOf0(File file) {
        Objects.requireNonNull(file, "file");
        return file.isDirectory() ? sizeOfDirectory0(file) : file.length();
    }

    public static BigInteger sizeOfAsBigInteger(File file) {
        requireExists(file, "file");
        return file.isDirectory() ? sizeOfDirectoryBig0(file) : BigInteger.valueOf(file.length());
    }

    private static BigInteger sizeOfBig0(File file) {
        Objects.requireNonNull(file, "fileOrDir");
        return file.isDirectory() ? sizeOfDirectoryBig0(file) : BigInteger.valueOf(file.length());
    }

    public static long sizeOfDirectory(File file) {
        return sizeOfDirectory0(requireDirectoryExists(file, "directory"));
    }

    private static long sizeOfDirectory0(File file) {
        Objects.requireNonNull(file, "directory");
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0L;
        }
        long j5 = 0;
        for (File file2 : listFiles) {
            if (!isSymlink(file2)) {
                j5 += sizeOf0(file2);
                if (j5 < 0) {
                    break;
                }
            }
        }
        return j5;
    }

    public static BigInteger sizeOfDirectoryAsBigInteger(File file) {
        return sizeOfDirectoryBig0(requireDirectoryExists(file, "directory"));
    }

    private static BigInteger sizeOfDirectoryBig0(File file) {
        Objects.requireNonNull(file, "directory");
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return BigInteger.ZERO;
        }
        BigInteger bigInteger = BigInteger.ZERO;
        for (File file2 : listFiles) {
            if (!isSymlink(file2)) {
                bigInteger = bigInteger.add(sizeOfBig0(file2));
            }
        }
        return bigInteger;
    }

    public static Stream<File> streamFiles(File file, boolean z4, String... strArr) {
        return PathUtils.walk(file.toPath(), strArr == null ? FileFileFilter.INSTANCE : FileFileFilter.INSTANCE.and(new SuffixFileFilter(toSuffixes(strArr))), toMaxDepth(z4), false, FileVisitOption.FOLLOW_LINKS).map(a.f4582a);
    }

    public static File toFile(URL url) {
        if (url == null || !"file".equalsIgnoreCase(url.getProtocol())) {
            return null;
        }
        return new File(decodeUrl(url.getFile().replace(IOUtils.DIR_SEPARATOR_UNIX, File.separatorChar)));
    }

    public static File[] toFiles(URL... urlArr) {
        if (IOUtils.length(urlArr) == 0) {
            return EMPTY_FILE_ARRAY;
        }
        File[] fileArr = new File[urlArr.length];
        for (int i5 = 0; i5 < urlArr.length; i5++) {
            URL url = urlArr[i5];
            if (url != null) {
                if (!"file".equalsIgnoreCase(url.getProtocol())) {
                    throw new IllegalArgumentException("Can only convert file URL to a File: " + url);
                }
                fileArr[i5] = toFile(url);
            }
        }
        return fileArr;
    }

    private static List<File> toList(Stream<File> stream) {
        return (List) stream.collect(Collectors.toList());
    }

    private static int toMaxDepth(boolean z4) {
        return z4 ? Integer.MAX_VALUE : 1;
    }

    private static String[] toSuffixes(String... strArr) {
        Objects.requireNonNull(strArr, "extensions");
        String[] strArr2 = new String[strArr.length];
        for (int i5 = 0; i5 < strArr.length; i5++) {
            StringBuilder g5 = d.g(".");
            g5.append(strArr[i5]);
            strArr2[i5] = g5.toString();
        }
        return strArr2;
    }

    public static URL[] toURLs(File... fileArr) {
        Objects.requireNonNull(fileArr, "files");
        int length = fileArr.length;
        URL[] urlArr = new URL[length];
        for (int i5 = 0; i5 < length; i5++) {
            urlArr[i5] = fileArr[i5].toURI().toURL();
        }
        return urlArr;
    }

    public static void touch(File file) {
        Objects.requireNonNull(file, "file");
        if (!file.exists()) {
            openOutputStream(file).close();
        }
        setLastModified(file, System.currentTimeMillis());
    }

    private static void validateMoveParameters(File file, File file2) {
        Objects.requireNonNull(file, "source");
        Objects.requireNonNull(file2, "destination");
        if (file.exists()) {
            return;
        }
        throw new FileNotFoundException("Source '" + file + "' does not exist");
    }

    public static boolean waitFor(File file, int i5) {
        Objects.requireNonNull(file, "file");
        long currentTimeMillis = (i5 * 1000) + System.currentTimeMillis();
        boolean z4 = false;
        while (!file.exists()) {
            try {
                long currentTimeMillis2 = currentTimeMillis - System.currentTimeMillis();
                if (currentTimeMillis2 < 0) {
                    return false;
                }
                try {
                    Thread.sleep(Math.min(100L, currentTimeMillis2));
                } catch (InterruptedException unused) {
                    z4 = true;
                } catch (Exception unused2) {
                }
            } finally {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return true;
    }

    @Deprecated
    public static void write(File file, CharSequence charSequence) {
        write(file, charSequence, Charset.defaultCharset(), false);
    }

    public static void write(File file, CharSequence charSequence, String str) {
        write(file, charSequence, str, false);
    }

    public static void write(File file, CharSequence charSequence, String str, boolean z4) {
        write(file, charSequence, Charsets.toCharset(str), z4);
    }

    public static void write(File file, CharSequence charSequence, Charset charset) {
        write(file, charSequence, charset, false);
    }

    public static void write(File file, CharSequence charSequence, Charset charset, boolean z4) {
        writeStringToFile(file, Objects.toString(charSequence, null), charset, z4);
    }

    @Deprecated
    public static void write(File file, CharSequence charSequence, boolean z4) {
        write(file, charSequence, Charset.defaultCharset(), z4);
    }

    public static void writeByteArrayToFile(File file, byte[] bArr) {
        writeByteArrayToFile(file, bArr, false);
    }

    public static void writeByteArrayToFile(File file, byte[] bArr, int i5, int i6) {
        writeByteArrayToFile(file, bArr, i5, i6, false);
    }

    public static void writeByteArrayToFile(File file, byte[] bArr, int i5, int i6, boolean z4) {
        FileOutputStream openOutputStream = openOutputStream(file, z4);
        try {
            openOutputStream.write(bArr, i5, i6);
            openOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (openOutputStream != null) {
                    try {
                        openOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static void writeByteArrayToFile(File file, byte[] bArr, boolean z4) {
        writeByteArrayToFile(file, bArr, 0, bArr.length, z4);
    }

    public static void writeLines(File file, String str, Collection<?> collection) {
        writeLines(file, str, collection, null, false);
    }

    public static void writeLines(File file, String str, Collection<?> collection, String str2) {
        writeLines(file, str, collection, str2, false);
    }

    public static void writeLines(File file, String str, Collection<?> collection, String str2, boolean z4) {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(openOutputStream(file, z4));
        try {
            IOUtils.writeLines(collection, str2, bufferedOutputStream, str);
            bufferedOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void writeLines(File file, String str, Collection<?> collection, boolean z4) {
        writeLines(file, str, collection, null, z4);
    }

    public static void writeLines(File file, Collection<?> collection) {
        writeLines(file, null, collection, null, false);
    }

    public static void writeLines(File file, Collection<?> collection, String str) {
        writeLines(file, null, collection, str, false);
    }

    public static void writeLines(File file, Collection<?> collection, String str, boolean z4) {
        writeLines(file, null, collection, str, z4);
    }

    public static void writeLines(File file, Collection<?> collection, boolean z4) {
        writeLines(file, null, collection, null, z4);
    }

    @Deprecated
    public static void writeStringToFile(File file, String str) {
        writeStringToFile(file, str, Charset.defaultCharset(), false);
    }

    public static void writeStringToFile(File file, String str, String str2) {
        writeStringToFile(file, str, str2, false);
    }

    public static void writeStringToFile(File file, String str, String str2, boolean z4) {
        writeStringToFile(file, str, Charsets.toCharset(str2), z4);
    }

    public static void writeStringToFile(File file, String str, Charset charset) {
        writeStringToFile(file, str, charset, false);
    }

    public static void writeStringToFile(File file, String str, Charset charset, boolean z4) {
        FileOutputStream openOutputStream = openOutputStream(file, z4);
        try {
            IOUtils.write(str, (OutputStream) openOutputStream, charset);
            if (openOutputStream != null) {
                openOutputStream.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (openOutputStream != null) {
                    try {
                        openOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Deprecated
    public static void writeStringToFile(File file, String str, boolean z4) {
        writeStringToFile(file, str, Charset.defaultCharset(), z4);
    }
}
