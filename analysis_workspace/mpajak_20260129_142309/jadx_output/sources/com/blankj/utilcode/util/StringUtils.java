package com.blankj.utilcode.util;

import android.content.res.Resources;
import androidx.annotation.ArrayRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import java.util.IllegalFormatException;

/* loaded from: classes12.dex */
public final class StringUtils {
    private StringUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean equals(CharSequence charSequence, CharSequence charSequence2) {
        int length;
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || (length = charSequence.length()) != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        for (int i5 = 0; i5 < length; i5++) {
            if (charSequence.charAt(i5) != charSequence2.charAt(i5)) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsIgnoreCase(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static String format(@Nullable String str, Object... objArr) {
        if (str == null || objArr == null || objArr.length <= 0) {
            return str;
        }
        try {
            return String.format(str, objArr);
        } catch (IllegalFormatException e5) {
            e5.printStackTrace();
            return str;
        }
    }

    public static String getString(@StringRes int i5) {
        return getString(i5, null);
    }

    public static String getString(@StringRes int i5, Object... objArr) {
        try {
            return format(Utils.getApp().getString(i5), objArr);
        } catch (Resources.NotFoundException e5) {
            e5.printStackTrace();
            return String.valueOf(i5);
        }
    }

    public static String[] getStringArray(@ArrayRes int i5) {
        try {
            return Utils.getApp().getResources().getStringArray(i5);
        } catch (Resources.NotFoundException e5) {
            e5.printStackTrace();
            return new String[]{String.valueOf(i5)};
        }
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean isSpace(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            if (!Character.isWhitespace(str.charAt(i5))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTrimEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static int length(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    public static String lowerFirstLetter(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (!Character.isUpperCase(str.charAt(0))) {
            return str;
        }
        return String.valueOf((char) (str.charAt(0) + ' ')) + str.substring(1);
    }

    public static String null2Length0(String str) {
        return str == null ? "" : str;
    }

    public static String reverse(String str) {
        if (str == null) {
            return "";
        }
        int length = str.length();
        if (length <= 1) {
            return str;
        }
        int i5 = length >> 1;
        char[] charArray = str.toCharArray();
        for (int i6 = 0; i6 < i5; i6++) {
            char c5 = charArray[i6];
            int i7 = (length - i6) - 1;
            charArray[i6] = charArray[i7];
            charArray[i7] = c5;
        }
        return new String(charArray);
    }

    public static String toDBC(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (charArray[i5] == 12288) {
                charArray[i5] = ' ';
            } else if (65281 > charArray[i5] || charArray[i5] > 65374) {
                charArray[i5] = charArray[i5];
            } else {
                charArray[i5] = (char) (charArray[i5] - 65248);
            }
        }
        return new String(charArray);
    }

    public static String toSBC(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (charArray[i5] == ' ') {
                charArray[i5] = 12288;
            } else if ('!' > charArray[i5] || charArray[i5] > '~') {
                charArray[i5] = charArray[i5];
            } else {
                charArray[i5] = (char) (charArray[i5] + 65248);
            }
        }
        return new String(charArray);
    }

    public static String upperFirstLetter(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (!Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return ((char) (str.charAt(0) - ' ')) + str.substring(1);
    }
}
