package androidx.constraintlayout.core.motion;

import androidx.appcompat.graphics.drawable.a;
import androidx.core.view.ViewCompat;

/* loaded from: classes10.dex */
public class CustomAttribute {
    private static final String TAG = "TransitionLayout";
    public boolean mBooleanValue;
    private int mColorValue;
    private float mFloatValue;
    private int mIntegerValue;
    private boolean mMethod;
    public String mName;
    private String mStringValue;
    private AttributeType mType;

    /* renamed from: androidx.constraintlayout.core.motion.CustomAttribute$1, reason: invalid class name */
    /* loaded from: classes22.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType;

        static {
            int[] iArr = new int[AttributeType.values().length];
            $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType = iArr;
            try {
                iArr[AttributeType.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[AttributeType.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[AttributeType.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[AttributeType.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[AttributeType.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[AttributeType.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[AttributeType.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes15.dex */
    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public CustomAttribute(CustomAttribute customAttribute, Object obj) {
        this.mMethod = false;
        this.mName = customAttribute.mName;
        this.mType = customAttribute.mType;
        setValue(obj);
    }

    public CustomAttribute(String str, AttributeType attributeType) {
        this.mMethod = false;
        this.mName = str;
        this.mType = attributeType;
    }

    public CustomAttribute(String str, AttributeType attributeType, Object obj, boolean z4) {
        this.mName = str;
        this.mType = attributeType;
        this.mMethod = z4;
        setValue(obj);
    }

    private static int clamp(int i5) {
        int i6 = (i5 & (~(i5 >> 31))) - 255;
        return (i6 & (i6 >> 31)) + 255;
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

    public boolean diff(CustomAttribute customAttribute) {
        AttributeType attributeType;
        if (customAttribute == null || (attributeType = this.mType) != customAttribute.mType) {
            return false;
        }
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[attributeType.ordinal()]) {
            case 1:
            case 6:
                if (this.mIntegerValue == customAttribute.mIntegerValue) {
                }
                break;
            case 2:
                if (this.mBooleanValue == customAttribute.mBooleanValue) {
                }
                break;
            case 3:
                if (this.mIntegerValue == customAttribute.mIntegerValue) {
                }
                break;
            case 4:
            case 5:
                if (this.mColorValue == customAttribute.mColorValue) {
                }
                break;
            case 7:
                if (this.mFloatValue == customAttribute.mFloatValue) {
                }
                break;
            case 8:
                if (this.mFloatValue == customAttribute.mFloatValue) {
                }
                break;
        }
        return false;
    }

    public AttributeType getType() {
        return this.mType;
    }

    public float getValueToInterpolate() {
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[this.mType.ordinal()]) {
            case 2:
                return this.mBooleanValue ? 1.0f : 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.mIntegerValue;
            case 7:
                return this.mFloatValue;
            case 8:
                return this.mFloatValue;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[this.mType.ordinal()]) {
            case 2:
                fArr[0] = this.mBooleanValue ? 1.0f : 0.0f;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i5 = (this.mColorValue >> 24) & 255;
                float pow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i5 / 255.0f;
                return;
            case 6:
                fArr[0] = this.mIntegerValue;
                return;
            case 7:
                fArr[0] = this.mFloatValue;
                return;
            case 8:
                fArr[0] = this.mFloatValue;
                return;
            default:
                return;
        }
    }

    public boolean isContinuous() {
        int i5 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[this.mType.ordinal()];
        return (i5 == 1 || i5 == 2 || i5 == 3) ? false : true;
    }

    public int numberOfInterpolatedValues() {
        int i5 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[this.mType.ordinal()];
        return (i5 == 4 || i5 == 5) ? 4 : 1;
    }

    public void setColorValue(int i5) {
        this.mColorValue = i5;
    }

    public void setFloatValue(float f5) {
        this.mFloatValue = f5;
    }

    public void setIntValue(int i5) {
        this.mIntegerValue = i5;
    }

    public void setStringValue(String str) {
        this.mStringValue = str;
    }

    public void setValue(Object obj) {
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[this.mType.ordinal()]) {
            case 1:
            case 6:
                this.mIntegerValue = ((Integer) obj).intValue();
                break;
            case 2:
                this.mBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 3:
                this.mStringValue = (String) obj;
                break;
            case 4:
            case 5:
                this.mColorValue = ((Integer) obj).intValue();
                break;
            case 7:
            case 8:
                this.mFloatValue = ((Float) obj).floatValue();
                break;
        }
    }

    public void setValue(float[] fArr) {
        float f5;
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[this.mType.ordinal()]) {
            case 1:
            case 6:
                this.mIntegerValue = (int) fArr[0];
                return;
            case 2:
                this.mBooleanValue = ((double) fArr[0]) > 0.5d;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int hsvToRgb = hsvToRgb(fArr[0], fArr[1], fArr[2]);
                this.mColorValue = hsvToRgb;
                this.mColorValue = (clamp((int) (fArr[3] * 255.0f)) << 24) | (hsvToRgb & ViewCompat.MEASURED_SIZE_MASK);
                return;
            case 7:
                f5 = fArr[0];
                break;
            case 8:
                f5 = fArr[0];
                break;
            default:
                return;
        }
        this.mFloatValue = f5;
    }
}
