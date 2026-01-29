package org.apache.commons.io;

import androidx.activity.d;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

@Deprecated
/* loaded from: classes19.dex */
public class FileSystemUtils {
    private static final String DF;
    private static final int INIT_PROBLEM = -1;
    private static final FileSystemUtils INSTANCE = new FileSystemUtils();
    private static final int OS;
    private static final int OTHER = 0;
    private static final int POSIX_UNIX = 3;
    private static final int UNIX = 2;
    private static final int WINDOWS = 1;

    static {
        int i5;
        String property;
        String str = "df";
        try {
            property = System.getProperty("os.name");
        } catch (Exception unused) {
            i5 = -1;
        }
        if (property == null) {
            throw new IOException("os.name not found");
        }
        String lowerCase = property.toLowerCase(Locale.ENGLISH);
        i5 = 3;
        if (lowerCase.contains("windows")) {
            i5 = 1;
        } else {
            if (!lowerCase.contains("linux") && !lowerCase.contains("mpe/ix") && !lowerCase.contains("freebsd") && !lowerCase.contains("openbsd") && !lowerCase.contains("irix") && !lowerCase.contains("digital unix") && !lowerCase.contains("unix") && !lowerCase.contains("mac os x")) {
                if (!lowerCase.contains("sun os") && !lowerCase.contains("sunos") && !lowerCase.contains("solaris")) {
                    if (!lowerCase.contains("hp-ux") && !lowerCase.contains("aix")) {
                        i5 = 0;
                    }
                }
                str = "/usr/xpg4/bin/df";
            }
            i5 = 2;
        }
        OS = i5;
        DF = str;
    }

    @Deprecated
    public static long freeSpace(String str) {
        return INSTANCE.freeSpaceOS(str, OS, false, Duration.ofMillis(-1L));
    }

    @Deprecated
    public static long freeSpaceKb() {
        return freeSpaceKb(-1L);
    }

    @Deprecated
    public static long freeSpaceKb(long j5) {
        return freeSpaceKb(new File(".").getAbsolutePath(), j5);
    }

    @Deprecated
    public static long freeSpaceKb(String str) {
        return freeSpaceKb(str, -1L);
    }

    @Deprecated
    public static long freeSpaceKb(String str, long j5) {
        return INSTANCE.freeSpaceOS(str, OS, true, Duration.ofMillis(j5));
    }

    public long freeSpaceOS(String str, int i5, boolean z4, Duration duration) {
        if (str == null) {
            throw new IllegalArgumentException("Path must not be null");
        }
        if (i5 == 0) {
            throw new IllegalStateException("Unsupported operating system");
        }
        if (i5 == 1) {
            long freeSpaceWindows = freeSpaceWindows(str, duration);
            return z4 ? freeSpaceWindows / FileUtils.ONE_KB : freeSpaceWindows;
        }
        if (i5 == 2) {
            return freeSpaceUnix(str, z4, false, duration);
        }
        if (i5 == 3) {
            return freeSpaceUnix(str, z4, true, duration);
        }
        throw new IllegalStateException("Exception caught when determining operating system");
    }

    public long freeSpaceUnix(String str, boolean z4, boolean z5, Duration duration) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Path must not be empty");
        }
        String str2 = z4 ? "-k" : "-";
        if (z5) {
            str2 = d.f(str2, "P");
        }
        List<String> performCommand = performCommand(str2.length() > 1 ? new String[]{DF, str2, str} : new String[]{DF, str}, 3, duration);
        if (performCommand.size() < 2) {
            StringBuilder g5 = d.g("Command line '");
            g5.append(DF);
            g5.append("' did not return info as expected for path '");
            g5.append(str);
            g5.append("'- response was ");
            g5.append(performCommand);
            throw new IOException(g5.toString());
        }
        StringTokenizer stringTokenizer = new StringTokenizer(performCommand.get(1), " ");
        if (stringTokenizer.countTokens() >= 4) {
            stringTokenizer.nextToken();
        } else {
            if (stringTokenizer.countTokens() != 1 || performCommand.size() < 3) {
                StringBuilder g6 = d.g("Command line '");
                g6.append(DF);
                g6.append("' did not return data as expected for path '");
                g6.append(str);
                g6.append("'- check path is valid");
                throw new IOException(g6.toString());
            }
            stringTokenizer = new StringTokenizer(performCommand.get(2), " ");
        }
        stringTokenizer.nextToken();
        stringTokenizer.nextToken();
        return parseBytes(stringTokenizer.nextToken(), str);
    }

    public long freeSpaceWindows(String str, Duration duration) {
        String normalize = FilenameUtils.normalize(str, false);
        if (normalize == null) {
            throw new IllegalArgumentException(str);
        }
        if (!normalize.isEmpty() && normalize.charAt(0) != '\"') {
            normalize = androidx.appcompat.widget.a.j("\"", normalize, "\"");
        }
        List<String> performCommand = performCommand(new String[]{"cmd.exe", "/C", d.f("dir /a /-c ", normalize)}, Integer.MAX_VALUE, duration);
        for (int size = performCommand.size() - 1; size >= 0; size--) {
            String str2 = performCommand.get(size);
            if (!str2.isEmpty()) {
                return parseDir(str2, normalize);
            }
        }
        throw new IOException(androidx.appcompat.widget.a.j("Command line 'dir /-c' did not return any info for path '", normalize, "'"));
    }

    public Process openProcess(String[] strArr) {
        return Runtime.getRuntime().exec(strArr);
    }

    public long parseBytes(String str, String str2) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong >= 0) {
                return parseLong;
            }
            throw new IOException("Command line '" + DF + "' did not find free space in response for path '" + str2 + "'- check path is valid");
        } catch (NumberFormatException e5) {
            StringBuilder g5 = d.g("Command line '");
            g5.append(DF);
            g5.append("' did not return numeric data as expected for path '");
            g5.append(str2);
            g5.append("'- check path is valid");
            throw new IOException(g5.toString(), e5);
        }
    }

    public long parseDir(String str, String str2) {
        int i5;
        int i6;
        int i7;
        int length = str.length();
        while (true) {
            length--;
            i5 = 0;
            if (length < 0) {
                i6 = 0;
                break;
            }
            if (Character.isDigit(str.charAt(length))) {
                i6 = length + 1;
                break;
            }
        }
        while (true) {
            if (length < 0) {
                i7 = 0;
                break;
            }
            char charAt = str.charAt(length);
            if (!Character.isDigit(charAt) && charAt != ',' && charAt != '.') {
                i7 = length + 1;
                break;
            }
            length--;
        }
        if (length < 0) {
            throw new IOException(androidx.appcompat.widget.a.j("Command line 'dir /-c' did not return valid info for path '", str2, "'"));
        }
        StringBuilder sb = new StringBuilder(str.substring(i7, i6));
        while (i5 < sb.length()) {
            if (sb.charAt(i5) == ',' || sb.charAt(i5) == '.') {
                sb.deleteCharAt(i5);
                i5--;
            }
            i5++;
        }
        return parseBytes(sb.toString(), str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0127  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<java.lang.String> performCommand(java.lang.String[] r11, int r12, java.time.Duration r13) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.FileSystemUtils.performCommand(java.lang.String[], int, java.time.Duration):java.util.List");
    }
}
