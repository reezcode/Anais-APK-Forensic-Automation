package com.blankj.utilcode.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class JsonUtils {
    private static final byte TYPE_BOOLEAN = 0;
    private static final byte TYPE_DOUBLE = 3;
    private static final byte TYPE_INT = 1;
    private static final byte TYPE_JSON_ARRAY = 6;
    private static final byte TYPE_JSON_OBJECT = 5;
    private static final byte TYPE_LONG = 2;
    private static final byte TYPE_STRING = 4;

    private JsonUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static String formatJson(String str) {
        return formatJson(str, 4);
    }

    public static String formatJson(String str, int i5) {
        try {
            int length = str.length();
            for (int i6 = 0; i6 < length; i6++) {
                char charAt = str.charAt(i6);
                if (charAt == '{') {
                    return new JSONObject(str).toString(i5);
                }
                if (charAt == '[') {
                    return new JSONArray(str).toString(i5);
                }
                if (!Character.isWhitespace(charAt)) {
                    return str;
                }
            }
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return str;
    }

    public static boolean getBoolean(String str, String str2) {
        return getBoolean(str, str2, false);
    }

    public static boolean getBoolean(String str, String str2, boolean z4) {
        return ((Boolean) getValueByType(str, str2, Boolean.valueOf(z4), (byte) 0)).booleanValue();
    }

    public static boolean getBoolean(JSONObject jSONObject, String str) {
        return getBoolean(jSONObject, str, false);
    }

    public static boolean getBoolean(JSONObject jSONObject, String str, boolean z4) {
        return ((Boolean) getValueByType(jSONObject, str, Boolean.valueOf(z4), (byte) 0)).booleanValue();
    }

    public static double getDouble(String str, String str2) {
        return getDouble(str, str2, -1.0d);
    }

    public static double getDouble(String str, String str2, double d5) {
        return ((Double) getValueByType(str, str2, Double.valueOf(d5), TYPE_DOUBLE)).doubleValue();
    }

    public static double getDouble(JSONObject jSONObject, String str) {
        return getDouble(jSONObject, str, -1.0d);
    }

    public static double getDouble(JSONObject jSONObject, String str, double d5) {
        return ((Double) getValueByType(jSONObject, str, Double.valueOf(d5), TYPE_DOUBLE)).doubleValue();
    }

    public static int getInt(String str, String str2) {
        return getInt(str, str2, -1);
    }

    public static int getInt(String str, String str2, int i5) {
        return ((Integer) getValueByType(str, str2, Integer.valueOf(i5), TYPE_INT)).intValue();
    }

    public static int getInt(JSONObject jSONObject, String str) {
        return getInt(jSONObject, str, -1);
    }

    public static int getInt(JSONObject jSONObject, String str, int i5) {
        return ((Integer) getValueByType(jSONObject, str, Integer.valueOf(i5), TYPE_INT)).intValue();
    }

    public static JSONArray getJSONArray(String str, String str2, JSONArray jSONArray) {
        return (JSONArray) getValueByType(str, str2, jSONArray, TYPE_JSON_ARRAY);
    }

    public static JSONArray getJSONArray(JSONObject jSONObject, String str, JSONArray jSONArray) {
        return (JSONArray) getValueByType(jSONObject, str, jSONArray, TYPE_JSON_ARRAY);
    }

    public static JSONObject getJSONObject(String str, String str2, JSONObject jSONObject) {
        return (JSONObject) getValueByType(str, str2, jSONObject, TYPE_JSON_OBJECT);
    }

    public static JSONObject getJSONObject(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        return (JSONObject) getValueByType(jSONObject, str, jSONObject2, TYPE_JSON_OBJECT);
    }

    public static long getLong(String str, String str2) {
        return getLong(str, str2, -1L);
    }

    public static long getLong(String str, String str2, long j5) {
        return ((Long) getValueByType(str, str2, Long.valueOf(j5), TYPE_LONG)).longValue();
    }

    public static long getLong(JSONObject jSONObject, String str) {
        return getLong(jSONObject, str, -1L);
    }

    public static long getLong(JSONObject jSONObject, String str, long j5) {
        return ((Long) getValueByType(jSONObject, str, Long.valueOf(j5), TYPE_LONG)).longValue();
    }

    public static String getString(String str, String str2) {
        return getString(str, str2, "");
    }

    public static String getString(String str, String str2, String str3) {
        return (String) getValueByType(str, str2, str3, TYPE_STRING);
    }

    public static String getString(JSONObject jSONObject, String str) {
        return getString(jSONObject, str, "");
    }

    public static String getString(JSONObject jSONObject, String str, String str2) {
        return (String) getValueByType(jSONObject, str, str2, TYPE_STRING);
    }

    private static <T> T getValueByType(String str, String str2, T t4, byte b5) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            try {
                return (T) getValueByType(new JSONObject(str), str2, t4, b5);
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
        return t4;
    }

    private static <T> T getValueByType(JSONObject jSONObject, String str, T t4, byte b5) {
        T t5;
        if (jSONObject != null && str != null && str.length() != 0) {
            try {
                if (b5 == 0) {
                    t5 = (T) Boolean.valueOf(jSONObject.getBoolean(str));
                } else if (b5 == 1) {
                    t5 = (T) Integer.valueOf(jSONObject.getInt(str));
                } else if (b5 == 2) {
                    t5 = (T) Long.valueOf(jSONObject.getLong(str));
                } else if (b5 == 3) {
                    t5 = (T) Double.valueOf(jSONObject.getDouble(str));
                } else if (b5 == 4) {
                    t5 = (T) jSONObject.getString(str);
                } else if (b5 == 5) {
                    t5 = (T) jSONObject.getJSONObject(str);
                } else if (b5 == 6) {
                    t5 = (T) jSONObject.getJSONArray(str);
                }
                return t5;
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
        return t4;
    }

    public static <T> boolean isJSONArray(T t4) {
        return t4 instanceof JSONArray;
    }

    public static <T> boolean isJSONObject(T t4) {
        return t4 instanceof JSONObject;
    }
}
