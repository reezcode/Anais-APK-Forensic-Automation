package org.apache.commons.io;

import com.tencent.smtt.sdk.ProxyConfig;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes25.dex */
public class FilenameUtils {
    private static final int BASE_16 = 16;
    private static final String EMPTY_STRING = "";
    private static final int IPV4_MAX_OCTET_VALUE = 255;
    private static final Pattern IPV4_PATTERN;
    private static final int IPV6_MAX_HEX_DIGITS_PER_GROUP = 4;
    private static final int IPV6_MAX_HEX_GROUPS = 8;
    private static final int MAX_UNSIGNED_SHORT = 65535;
    private static final int NOT_FOUND = -1;
    private static final char OTHER_SEPARATOR;
    private static final Pattern REG_NAME_PART_PATTERN;
    private static final char UNIX_SEPARATOR = '/';
    private static final char WINDOWS_SEPARATOR = '\\';
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final char EXTENSION_SEPARATOR = '.';
    public static final String EXTENSION_SEPARATOR_STR = Character.toString(EXTENSION_SEPARATOR);
    private static final char SYSTEM_SEPARATOR = File.separatorChar;

    static {
        OTHER_SEPARATOR = isSystemWindows() ? '/' : '\\';
        IPV4_PATTERN = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
        REG_NAME_PART_PATTERN = Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9-]*$");
    }

    public static String concat(String str, String str2) {
        StringBuilder sb;
        int prefixLength = getPrefixLength(str2);
        if (prefixLength < 0) {
            return null;
        }
        if (prefixLength > 0) {
            return normalize(str2);
        }
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return normalize(str2);
        }
        if (isSeparator(str.charAt(length - 1))) {
            sb = new StringBuilder();
            sb.append(str);
        } else {
            sb = new StringBuilder();
            sb.append(str);
            sb.append('/');
        }
        sb.append(str2);
        return normalize(sb.toString());
    }

    public static boolean directoryContains(String str, String str2) {
        Objects.requireNonNull(str, "canonicalParent");
        if (str2 == null) {
            return false;
        }
        IOCase iOCase = IOCase.SYSTEM;
        if (iOCase.checkEquals(str, str2)) {
            return false;
        }
        return iOCase.checkStartsWith(str2, str);
    }

    private static String doGetFullPath(String str, boolean z4) {
        int prefixLength;
        if (str == null || (prefixLength = getPrefixLength(str)) < 0) {
            return null;
        }
        if (prefixLength >= str.length()) {
            return z4 ? getPrefix(str) : str;
        }
        int indexOfLastSeparator = indexOfLastSeparator(str);
        if (indexOfLastSeparator < 0) {
            return str.substring(0, prefixLength);
        }
        int i5 = indexOfLastSeparator + (z4 ? 1 : 0);
        if (i5 == 0) {
            i5++;
        }
        return str.substring(0, i5);
    }

    private static String doGetPath(String str, int i5) {
        int prefixLength;
        if (str == null || (prefixLength = getPrefixLength(str)) < 0) {
            return null;
        }
        int indexOfLastSeparator = indexOfLastSeparator(str);
        int i6 = i5 + indexOfLastSeparator;
        if (prefixLength >= str.length() || indexOfLastSeparator < 0 || prefixLength >= i6) {
            return "";
        }
        String substring = str.substring(prefixLength, i6);
        requireNonNullChars(substring);
        return substring;
    }

    private static String doNormalize(String str, char c5, boolean z4) {
        boolean z5;
        if (str == null) {
            return null;
        }
        requireNonNullChars(str);
        int length = str.length();
        if (length == 0) {
            return str;
        }
        int prefixLength = getPrefixLength(str);
        if (prefixLength < 0) {
            return null;
        }
        int i5 = length + 2;
        char[] cArr = new char[i5];
        str.getChars(0, str.length(), cArr, 0);
        char c6 = SYSTEM_SEPARATOR;
        if (c5 == c6) {
            c6 = OTHER_SEPARATOR;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (cArr[i6] == c6) {
                cArr[i6] = c5;
            }
        }
        if (cArr[length - 1] != c5) {
            cArr[length] = c5;
            length++;
            z5 = false;
        } else {
            z5 = true;
        }
        int i7 = prefixLength != 0 ? prefixLength : 1;
        while (i7 < length) {
            if (cArr[i7] == c5) {
                int i8 = i7 - 1;
                if (cArr[i8] == c5) {
                    System.arraycopy(cArr, i7, cArr, i8, length - i7);
                    length--;
                    i7--;
                }
            }
            i7++;
        }
        int i9 = prefixLength + 1;
        int i10 = i9;
        while (i10 < length) {
            if (cArr[i10] == c5) {
                int i11 = i10 - 1;
                if (cArr[i11] == '.' && (i10 == i9 || cArr[i10 - 2] == c5)) {
                    if (i10 == length - 1) {
                        z5 = true;
                    }
                    System.arraycopy(cArr, i10 + 1, cArr, i11, length - i10);
                    length -= 2;
                    i10--;
                }
            }
            i10++;
        }
        int i12 = prefixLength + 2;
        int i13 = i12;
        while (i13 < length) {
            if (cArr[i13] == c5 && cArr[i13 - 1] == '.' && cArr[i13 - 2] == '.' && (i13 == i12 || cArr[i13 - 3] == c5)) {
                if (i13 == i12) {
                    return null;
                }
                if (i13 == length - 1) {
                    z5 = true;
                }
                int i14 = i13 - 4;
                while (true) {
                    if (i14 < prefixLength) {
                        int i15 = i13 + 1;
                        System.arraycopy(cArr, i15, cArr, prefixLength, length - i13);
                        length -= i15 - prefixLength;
                        i13 = i9;
                        break;
                    }
                    if (cArr[i14] == c5) {
                        int i16 = i14 + 1;
                        System.arraycopy(cArr, i13 + 1, cArr, i16, length - i13);
                        length -= i13 - i14;
                        i13 = i16;
                        break;
                    }
                    i14--;
                }
            }
            i13++;
        }
        return length <= 0 ? "" : length <= prefixLength ? new String(cArr, 0, length) : (z5 && z4) ? new String(cArr, 0, length) : new String(cArr, 0, length - 1);
    }

    public static boolean equals(String str, String str2) {
        return equals(str, str2, false, IOCase.SENSITIVE);
    }

    public static boolean equals(String str, String str2, boolean z4, IOCase iOCase) {
        if (str == null || str2 == null) {
            return str == null && str2 == null;
        }
        if (z4 && ((str = normalize(str)) == null || (str2 = normalize(str2)) == null)) {
            return false;
        }
        if (iOCase == null) {
            iOCase = IOCase.SENSITIVE;
        }
        return iOCase.checkEquals(str, str2);
    }

    public static boolean equalsNormalized(String str, String str2) {
        return equals(str, str2, true, IOCase.SENSITIVE);
    }

    public static boolean equalsNormalizedOnSystem(String str, String str2) {
        return equals(str, str2, true, IOCase.SYSTEM);
    }

    public static boolean equalsOnSystem(String str, String str2) {
        return equals(str, str2, false, IOCase.SYSTEM);
    }

    private static int getAdsCriticalOffset(String str) {
        int lastIndexOf = str.lastIndexOf(SYSTEM_SEPARATOR);
        int lastIndexOf2 = str.lastIndexOf(OTHER_SEPARATOR);
        if (lastIndexOf != -1) {
            return lastIndexOf2 == -1 ? lastIndexOf + 1 : Math.max(lastIndexOf, lastIndexOf2) + 1;
        }
        if (lastIndexOf2 == -1) {
            return 0;
        }
        return lastIndexOf2 + 1;
    }

    public static String getBaseName(String str) {
        return removeExtension(getName(str));
    }

    public static String getExtension(String str) {
        if (str == null) {
            return null;
        }
        int indexOfExtension = indexOfExtension(str);
        return indexOfExtension == -1 ? "" : str.substring(indexOfExtension + 1);
    }

    public static String getFullPath(String str) {
        return doGetFullPath(str, true);
    }

    public static String getFullPathNoEndSeparator(String str) {
        return doGetFullPath(str, false);
    }

    public static String getName(String str) {
        if (str == null) {
            return null;
        }
        requireNonNullChars(str);
        return str.substring(indexOfLastSeparator(str) + 1);
    }

    public static String getPath(String str) {
        return doGetPath(str, 1);
    }

    public static String getPathNoEndSeparator(String str) {
        return doGetPath(str, 0);
    }

    public static String getPrefix(String str) {
        int prefixLength;
        if (str == null || (prefixLength = getPrefixLength(str)) < 0) {
            return null;
        }
        if (prefixLength <= str.length()) {
            String substring = str.substring(0, prefixLength);
            requireNonNullChars(substring);
            return substring;
        }
        requireNonNullChars(str + '/');
        return str + '/';
    }

    public static int getPrefixLength(String str) {
        if (str == null) {
            return -1;
        }
        int length = str.length();
        if (length == 0) {
            return 0;
        }
        char charAt = str.charAt(0);
        if (charAt == ':') {
            return -1;
        }
        if (length == 1) {
            if (charAt == '~') {
                return 2;
            }
            return isSeparator(charAt) ? 1 : 0;
        }
        if (charAt == '~') {
            int indexOf = str.indexOf(47, 1);
            int indexOf2 = str.indexOf(92, 1);
            if (indexOf == -1 && indexOf2 == -1) {
                return length + 1;
            }
            if (indexOf == -1) {
                indexOf = indexOf2;
            }
            if (indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            return Math.min(indexOf, indexOf2) + 1;
        }
        char charAt2 = str.charAt(1);
        if (charAt2 == ':') {
            char upperCase = Character.toUpperCase(charAt);
            if (upperCase < 'A' || upperCase > 'Z') {
                return upperCase == '/' ? 1 : -1;
            }
            if (length != 2 || FileSystem.getCurrent().supportsDriveLetter()) {
                return (length == 2 || !isSeparator(str.charAt(2))) ? 2 : 3;
            }
            return 0;
        }
        if (!isSeparator(charAt) || !isSeparator(charAt2)) {
            return isSeparator(charAt) ? 1 : 0;
        }
        int indexOf3 = str.indexOf(47, 2);
        int indexOf4 = str.indexOf(92, 2);
        if ((indexOf3 == -1 && indexOf4 == -1) || indexOf3 == 2 || indexOf4 == 2) {
            return -1;
        }
        if (indexOf3 == -1) {
            indexOf3 = indexOf4;
        }
        if (indexOf4 == -1) {
            indexOf4 = indexOf3;
        }
        int min = Math.min(indexOf3, indexOf4) + 1;
        if (isValidHostName(str.substring(2, min - 1))) {
            return min;
        }
        return -1;
    }

    public static int indexOfExtension(String str) {
        if (str == null) {
            return -1;
        }
        if (isSystemWindows() && str.indexOf(58, getAdsCriticalOffset(str)) != -1) {
            throw new IllegalArgumentException("NTFS ADS separator (':') in file name is forbidden.");
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (indexOfLastSeparator(str) > lastIndexOf) {
            return -1;
        }
        return lastIndexOf;
    }

    public static int indexOfLastSeparator(String str) {
        if (str == null) {
            return -1;
        }
        return Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
    }

    public static boolean isExtension(String str, String str2) {
        if (str == null) {
            return false;
        }
        requireNonNullChars(str);
        return (str2 == null || str2.isEmpty()) ? indexOfExtension(str) == -1 : getExtension(str).equals(str2);
    }

    public static boolean isExtension(String str, Collection<String> collection) {
        if (str == null) {
            return false;
        }
        requireNonNullChars(str);
        if (collection == null || collection.isEmpty()) {
            return indexOfExtension(str) == -1;
        }
        String extension = getExtension(str);
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            if (extension.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExtension(String str, String... strArr) {
        if (str == null) {
            return false;
        }
        requireNonNullChars(str);
        if (strArr == null || strArr.length == 0) {
            return indexOfExtension(str) == -1;
        }
        String extension = getExtension(str);
        for (String str2 : strArr) {
            if (extension.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isIPv4Address(String str) {
        Matcher matcher = IPV4_PATTERN.matcher(str);
        if (!matcher.matches() || matcher.groupCount() != 4) {
            return false;
        }
        for (int i5 = 1; i5 <= 4; i5++) {
            String group = matcher.group(i5);
            if (Integer.parseInt(group) > 255) {
                return false;
            }
            if (group.length() > 1 && group.startsWith("0")) {
                return false;
            }
        }
        return true;
    }

    private static boolean isIPv6Address(String str) {
        boolean contains = str.contains("::");
        if (contains && str.indexOf("::") != str.lastIndexOf("::")) {
            return false;
        }
        if ((str.startsWith(":") && !str.startsWith("::")) || (str.endsWith(":") && !str.endsWith("::"))) {
            return false;
        }
        String[] split = str.split(":");
        if (contains) {
            ArrayList arrayList = new ArrayList(Arrays.asList(split));
            if (str.endsWith("::")) {
                arrayList.add("");
            } else if (str.startsWith("::") && !arrayList.isEmpty()) {
                arrayList.remove(0);
            }
            split = (String[]) arrayList.toArray(EMPTY_STRING_ARRAY);
        }
        if (split.length > 8) {
            return false;
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < split.length; i7++) {
            String str2 = split[i7];
            if (str2.isEmpty()) {
                i6++;
                if (i6 > 1) {
                    return false;
                }
            } else {
                if (i7 != split.length - 1 || !str2.contains(".")) {
                    if (str2.length() > 4) {
                        return false;
                    }
                    try {
                        int parseInt = Integer.parseInt(str2, 16);
                        if (parseInt >= 0 && parseInt <= 65535) {
                            i6 = 0;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    return false;
                }
                if (!isIPv4Address(str2)) {
                    return false;
                }
                i5 += 2;
                i6 = 0;
            }
            i5++;
        }
        if (i5 <= 8) {
            return i5 >= 8 || contains;
        }
        return false;
    }

    private static boolean isRFC3986HostName(String str) {
        String[] split = str.split("\\.", -1);
        int i5 = 0;
        while (i5 < split.length) {
            if (split[i5].isEmpty()) {
                return i5 == split.length - 1;
            }
            if (!REG_NAME_PART_PATTERN.matcher(split[i5]).matches()) {
                return false;
            }
            i5++;
        }
        return true;
    }

    private static boolean isSeparator(char c5) {
        return c5 == '/' || c5 == '\\';
    }

    public static boolean isSystemWindows() {
        return SYSTEM_SEPARATOR == '\\';
    }

    private static boolean isValidHostName(String str) {
        return isIPv6Address(str) || isRFC3986HostName(str);
    }

    public static String normalize(String str) {
        return doNormalize(str, SYSTEM_SEPARATOR, true);
    }

    public static String normalize(String str, boolean z4) {
        return doNormalize(str, z4 ? '/' : '\\', true);
    }

    public static String normalizeNoEndSeparator(String str) {
        return doNormalize(str, SYSTEM_SEPARATOR, false);
    }

    public static String normalizeNoEndSeparator(String str, boolean z4) {
        return doNormalize(str, z4 ? '/' : '\\', false);
    }

    public static String removeExtension(String str) {
        if (str == null) {
            return null;
        }
        requireNonNullChars(str);
        int indexOfExtension = indexOfExtension(str);
        return indexOfExtension == -1 ? str : str.substring(0, indexOfExtension);
    }

    private static void requireNonNullChars(String str) {
        if (str.indexOf(0) >= 0) {
            throw new IllegalArgumentException("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it");
        }
    }

    public static String separatorsToSystem(String str) {
        if (str == null) {
            return null;
        }
        return isSystemWindows() ? separatorsToWindows(str) : separatorsToUnix(str);
    }

    public static String separatorsToUnix(String str) {
        return (str == null || str.indexOf(92) == -1) ? str : str.replace('\\', '/');
    }

    public static String separatorsToWindows(String str) {
        return (str == null || str.indexOf(47) == -1) ? str : str.replace('/', '\\');
    }

    public static String[] splitOnTokens(String str) {
        String str2;
        if (str.indexOf(63) == -1 && str.indexOf(42) == -1) {
            return new String[]{str};
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int length = charArray.length;
        int i5 = 0;
        char c5 = 0;
        while (i5 < length) {
            char c6 = charArray[i5];
            if (c6 == '?' || c6 == '*') {
                if (sb.length() != 0) {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
                if (c6 == '?') {
                    str2 = "?";
                } else if (c5 != '*') {
                    str2 = ProxyConfig.MATCH_ALL_SCHEMES;
                }
                arrayList.add(str2);
            } else {
                sb.append(c6);
            }
            i5++;
            c5 = c6;
        }
        if (sb.length() != 0) {
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(EMPTY_STRING_ARRAY);
    }

    public static boolean wildcardMatch(String str, String str2) {
        return wildcardMatch(str, str2, IOCase.SENSITIVE);
    }

    public static boolean wildcardMatch(String str, String str2, IOCase iOCase) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null && str2 != null) {
            if (iOCase == null) {
                iOCase = IOCase.SENSITIVE;
            }
            String[] splitOnTokens = splitOnTokens(str2);
            ArrayDeque arrayDeque = new ArrayDeque(splitOnTokens.length);
            boolean z4 = false;
            int i5 = 0;
            int i6 = 0;
            do {
                if (!arrayDeque.isEmpty()) {
                    int[] iArr = (int[]) arrayDeque.pop();
                    i6 = iArr[0];
                    i5 = iArr[1];
                    z4 = true;
                }
                while (i6 < splitOnTokens.length) {
                    if (splitOnTokens[i6].equals("?")) {
                        i5++;
                        if (i5 > str.length()) {
                            break;
                        }
                        z4 = false;
                        i6++;
                    } else if (splitOnTokens[i6].equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                        if (i6 == splitOnTokens.length - 1) {
                            i5 = str.length();
                        }
                        z4 = true;
                        i6++;
                    } else {
                        if (z4) {
                            i5 = iOCase.checkIndexOf(str, i5, splitOnTokens[i6]);
                            if (i5 == -1) {
                                break;
                            }
                            int checkIndexOf = iOCase.checkIndexOf(str, i5 + 1, splitOnTokens[i6]);
                            if (checkIndexOf >= 0) {
                                arrayDeque.push(new int[]{i6, checkIndexOf});
                            }
                            i5 = splitOnTokens[i6].length() + i5;
                            z4 = false;
                        } else {
                            if (!iOCase.checkRegionMatches(str, i5, splitOnTokens[i6])) {
                                break;
                            }
                            i5 = splitOnTokens[i6].length() + i5;
                            z4 = false;
                        }
                        i6++;
                    }
                }
                if (i6 == splitOnTokens.length && i5 == str.length()) {
                    return true;
                }
            } while (!arrayDeque.isEmpty());
        }
        return false;
    }

    public static boolean wildcardMatchOnSystem(String str, String str2) {
        return wildcardMatch(str, str2, IOCase.SYSTEM);
    }
}
