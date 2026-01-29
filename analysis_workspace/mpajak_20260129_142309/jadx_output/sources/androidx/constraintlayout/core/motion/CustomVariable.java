package androidx.constraintlayout.core.motion;

import androidx.activity.d;
import androidx.appcompat.graphics.drawable.a;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* loaded from: classes9.dex */
public class CustomVariable {
    private static final String TAG = "TransitionLayout";
    public boolean mBooleanValue;
    private float mFloatValue;
    private int mIntegerValue;
    public String mName;
    private String mStringValue;
    private int mType;

    public CustomVariable(CustomVariable customVariable) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mStringValue = null;
        this.mName = customVariable.mName;
        this.mType = customVariable.mType;
        this.mIntegerValue = customVariable.mIntegerValue;
        this.mFloatValue = customVariable.mFloatValue;
        this.mStringValue = customVariable.mStringValue;
        this.mBooleanValue = customVariable.mBooleanValue;
    }

    public CustomVariable(CustomVariable customVariable, Object obj) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mStringValue = null;
        this.mName = customVariable.mName;
        this.mType = customVariable.mType;
        setValue(obj);
    }

    public CustomVariable(String str, int i5) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mStringValue = null;
        this.mName = str;
        this.mType = i5;
    }

    public CustomVariable(String str, int i5, float f5) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mStringValue = null;
        this.mName = str;
        this.mType = i5;
        this.mFloatValue = f5;
    }

    public CustomVariable(String str, int i5, int i6) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mStringValue = null;
        this.mName = str;
        this.mType = i5;
        if (i5 == 901) {
            this.mFloatValue = i6;
        } else {
            this.mIntegerValue = i6;
        }
    }

    public CustomVariable(String str, int i5, Object obj) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mStringValue = null;
        this.mName = str;
        this.mType = i5;
        setValue(obj);
    }

    public CustomVariable(String str, int i5, String str2) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mName = str;
        this.mType = i5;
        this.mStringValue = str2;
    }

    public CustomVariable(String str, int i5, boolean z4) {
        this.mIntegerValue = Integer.MIN_VALUE;
        this.mFloatValue = Float.NaN;
        this.mStringValue = null;
        this.mName = str;
        this.mType = i5;
        this.mBooleanValue = z4;
    }

    private static int clamp(int i5) {
        int i6 = (i5 & (~(i5 >> 31))) - 255;
        return (i6 & (i6 >> 31)) + 255;
    }

    public static String colorString(int i5) {
        StringBuilder g5 = d.g("00000000");
        g5.append(Integer.toHexString(i5));
        String sb = g5.toString();
        StringBuilder g6 = d.g("#");
        g6.append(sb.substring(sb.length() - 8));
        return g6.toString();
    }

    public static int hsvToRgb(float f5, float f6, float f7) {
        float f8 = f5 * 6.0f;
        int i5 = (int) f8;
        float f9 = f8 - i5;
        float f10 = f7 * 255.0f;
        int a5 = (int) a.a(1.0f, f6, f10, 0.5f);
        int i6 = (int) (((1.0f - (f9 * f6)) * f10) + 0.5f);
        int i7 = (int) (((1.0f - ((1.0f - f9) * f6)) * f10) + 0.5f);
        int i8 = (int) (f10 + 0.5f);
        if (i5 == 0) {
            return ((i8 << 16) + (i7 << 8) + a5) | (-16777216);
        }
        if (i5 == 1) {
            return ((i6 << 16) + (i8 << 8) + a5) | (-16777216);
        }
        if (i5 == 2) {
            return ((a5 << 16) + (i8 << 8) + i7) | (-16777216);
        }
        if (i5 == 3) {
            return ((a5 << 16) + (i6 << 8) + i8) | (-16777216);
        }
        if (i5 == 4) {
            return ((i7 << 16) + (a5 << 8) + i8) | (-16777216);
        }
        if (i5 != 5) {
            return 0;
        }
        return ((i8 << 16) + (a5 << 8) + i6) | (-16777216);
    }

    public static int rgbaTocColor(float f5, float f6, float f7, float f8) {
        int clamp = clamp((int) (f5 * 255.0f));
        int clamp2 = clamp((int) (f6 * 255.0f));
        return (clamp << 16) | (clamp((int) (f8 * 255.0f)) << 24) | (clamp2 << 8) | clamp((int) (f7 * 255.0f));
    }

    public void applyToWidget(MotionWidget motionWidget) {
        int i5 = this.mType;
        switch (i5) {
            case 900:
            case 902:
            case TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                motionWidget.setCustomAttribute(this.mName, i5, this.mIntegerValue);
                break;
            case 901:
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                motionWidget.setCustomAttribute(this.mName, i5, this.mFloatValue);
                break;
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                motionWidget.setCustomAttribute(this.mName, i5, this.mStringValue);
                break;
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                motionWidget.setCustomAttribute(this.mName, i5, this.mBooleanValue);
                break;
        }
    }

    public CustomVariable copy() {
        return new CustomVariable(this);
    }

    public boolean diff(CustomVariable customVariable) {
        int i5;
        if (customVariable == null || (i5 = this.mType) != customVariable.mType) {
            return false;
        }
        switch (i5) {
            case 900:
            case TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                if (this.mIntegerValue == customVariable.mIntegerValue) {
                }
                break;
            case 901:
                if (this.mFloatValue == customVariable.mFloatValue) {
                }
                break;
            case 902:
                if (this.mIntegerValue == customVariable.mIntegerValue) {
                }
                break;
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                if (this.mIntegerValue == customVariable.mIntegerValue) {
                }
                break;
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                if (this.mBooleanValue == customVariable.mBooleanValue) {
                }
                break;
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                if (this.mFloatValue == customVariable.mFloatValue) {
                }
                break;
        }
        return false;
    }

    public boolean getBooleanValue() {
        return this.mBooleanValue;
    }

    public int getColorValue() {
        return this.mIntegerValue;
    }

    public float getFloatValue() {
        return this.mFloatValue;
    }

    public int getIntegerValue() {
        return this.mIntegerValue;
    }

    public int getInterpolatedColor(float[] fArr) {
        return (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public String getName() {
        return this.mName;
    }

    public String getStringValue() {
        return this.mStringValue;
    }

    public int getType() {
        return this.mType;
    }

    public float getValueToInterpolate() {
        switch (this.mType) {
            case 900:
                return this.mIntegerValue;
            case 901:
                return this.mFloatValue;
            case 902:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                return this.mBooleanValue ? 1.0f : 0.0f;
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                return this.mFloatValue;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (this.mType) {
            case 900:
                fArr[0] = this.mIntegerValue;
                return;
            case 901:
                fArr[0] = this.mFloatValue;
                return;
            case 902:
                int i5 = (this.mIntegerValue >> 24) & 255;
                float pow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i5 / 255.0f;
                return;
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                fArr[0] = this.mBooleanValue ? 1.0f : 0.0f;
                return;
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                fArr[0] = this.mFloatValue;
                return;
            default:
                return;
        }
    }

    public boolean isContinuous() {
        int i5 = this.mType;
        return (i5 == 903 || i5 == 904 || i5 == 906) ? false : true;
    }

    public int numberOfInterpolatedValues() {
        return this.mType != 902 ? 1 : 4;
    }

    public void setBooleanValue(boolean z4) {
        this.mBooleanValue = z4;
    }

    public void setFloatValue(float f5) {
        this.mFloatValue = f5;
    }

    public void setIntValue(int i5) {
        this.mIntegerValue = i5;
    }

    public void setInterpolatedValue(MotionWidget motionWidget, float[] fArr) {
        int i5 = this.mType;
        switch (i5) {
            case 900:
                motionWidget.setCustomAttribute(this.mName, i5, (int) fArr[0]);
                return;
            case 901:
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                motionWidget.setCustomAttribute(this.mName, i5, fArr[0]);
                return;
            case 902:
                motionWidget.setCustomAttribute(this.mName, this.mType, (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                return;
            case TypedValues.Custom.TYPE_STRING /* 903 */:
            case TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                StringBuilder g5 = d.g("unable to interpolate ");
                g5.append(this.mName);
                throw new RuntimeException(g5.toString());
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                motionWidget.setCustomAttribute(this.mName, i5, fArr[0] > 0.5f);
                return;
            default:
                return;
        }
    }

    public void setStringValue(String str) {
        this.mStringValue = str;
    }

    public void setValue(Object obj) {
        switch (this.mType) {
            case 900:
            case 902:
            case TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                this.mIntegerValue = ((Integer) obj).intValue();
                break;
            case 901:
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                this.mFloatValue = ((Float) obj).floatValue();
                break;
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                this.mStringValue = (String) obj;
                break;
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                this.mBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
    }

    public void setValue(float[] fArr) {
        int i5;
        switch (this.mType) {
            case 900:
            case TypedValues.Custom.TYPE_REFERENCE /* 906 */:
                i5 = (int) fArr[0];
                break;
            case 901:
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                this.mFloatValue = fArr[0];
                return;
            case 902:
                i5 = ((Math.round(fArr[3] * 255.0f) & 255) << 24) | ((Math.round(((float) Math.pow(fArr[0], 0.5d)) * 255.0f) & 255) << 16) | ((Math.round(((float) Math.pow(fArr[1], 0.5d)) * 255.0f) & 255) << 8) | (Math.round(((float) Math.pow(fArr[2], 0.5d)) * 255.0f) & 255);
                break;
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                this.mBooleanValue = ((double) fArr[0]) > 0.5d;
                return;
            default:
                return;
        }
        this.mIntegerValue = i5;
    }

    public String toString() {
        StringBuilder g5;
        StringBuilder sb;
        String colorString;
        String str = this.mName + ':';
        switch (this.mType) {
            case 900:
                g5 = d.g(str);
                g5.append(this.mIntegerValue);
                break;
            case 901:
                sb = new StringBuilder();
                sb.append(str);
                sb.append(this.mFloatValue);
                g5 = sb;
                break;
            case 902:
                g5 = d.g(str);
                colorString = colorString(this.mIntegerValue);
                g5.append(colorString);
                break;
            case TypedValues.Custom.TYPE_STRING /* 903 */:
                g5 = d.g(str);
                colorString = this.mStringValue;
                g5.append(colorString);
                break;
            case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                g5 = d.g(str);
                g5.append(Boolean.valueOf(this.mBooleanValue));
                break;
            case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                sb = new StringBuilder();
                sb.append(str);
                sb.append(this.mFloatValue);
                g5 = sb;
                break;
            default:
                g5 = d.g(str);
                colorString = "????";
                g5.append(colorString);
                break;
        }
        return g5.toString();
    }
}
