package androidx.constraintlayout.core.motion.key;

import androidx.activity.d;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.Utils;
import androidx.constraintlayout.core.motion.utils.a;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes13.dex */
public class MotionKeyCycle extends MotionKey {
    public static final int KEY_TYPE = 4;
    public static final String NAME = "KeyCycle";
    public static final int SHAPE_BOUNCE = 6;
    public static final int SHAPE_COS_WAVE = 5;
    public static final int SHAPE_REVERSE_SAW_WAVE = 4;
    public static final int SHAPE_SAW_WAVE = 3;
    public static final int SHAPE_SIN_WAVE = 0;
    public static final int SHAPE_SQUARE_WAVE = 1;
    public static final int SHAPE_TRIANGLE_WAVE = 2;
    private static final String TAG = "KeyCycle";
    public static final String WAVE_OFFSET = "waveOffset";
    public static final String WAVE_PERIOD = "wavePeriod";
    public static final String WAVE_PHASE = "wavePhase";
    public static final String WAVE_SHAPE = "waveShape";
    private String mTransitionEasing = null;
    private int mCurveFit = 0;
    private int mWaveShape = -1;
    private String mCustomWaveShape = null;
    private float mWavePeriod = Float.NaN;
    private float mWaveOffset = 0.0f;
    private float mWavePhase = 0.0f;
    private float mProgress = Float.NaN;
    private float mAlpha = Float.NaN;
    private float mElevation = Float.NaN;
    private float mRotation = Float.NaN;
    private float mTransitionPathRotate = Float.NaN;
    private float mRotationX = Float.NaN;
    private float mRotationY = Float.NaN;
    private float mScaleX = Float.NaN;
    private float mScaleY = Float.NaN;
    private float mTranslationX = Float.NaN;
    private float mTranslationY = Float.NaN;
    private float mTranslationZ = Float.NaN;

    public MotionKeyCycle() {
        this.mType = 4;
        this.mCustom = new HashMap<>();
    }

    public void addCycleValues(HashMap<String, KeyCycleOscillator> hashMap) {
        KeyCycleOscillator keyCycleOscillator;
        KeyCycleOscillator keyCycleOscillator2;
        for (String str : hashMap.keySet()) {
            if (str.startsWith("CUSTOM")) {
                CustomVariable customVariable = this.mCustom.get(str.substring(7));
                if (customVariable != null && customVariable.getType() == 901 && (keyCycleOscillator = hashMap.get(str)) != null) {
                    keyCycleOscillator.setPoint(this.mFramePosition, this.mWaveShape, this.mCustomWaveShape, -1, this.mWavePeriod, this.mWaveOffset, this.mWavePhase, customVariable.getValueToInterpolate(), customVariable);
                }
            } else {
                float value = getValue(str);
                if (!Float.isNaN(value) && (keyCycleOscillator2 = hashMap.get(str)) != null) {
                    keyCycleOscillator2.setPoint(this.mFramePosition, this.mWaveShape, this.mCustomWaveShape, -1, this.mWavePeriod, this.mWaveOffset, this.mWavePhase, value);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap<String, SplineSet> hashMap) {
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public MotionKey mo3clone() {
        return null;
    }

    public void dump() {
        PrintStream printStream = System.out;
        StringBuilder g5 = d.g("MotionKeyCycle{mWaveShape=");
        g5.append(this.mWaveShape);
        g5.append(", mWavePeriod=");
        g5.append(this.mWavePeriod);
        g5.append(", mWaveOffset=");
        g5.append(this.mWaveOffset);
        g5.append(", mWavePhase=");
        g5.append(this.mWavePhase);
        g5.append(", mRotation=");
        g5.append(this.mRotation);
        g5.append('}');
        printStream.println(g5.toString());
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.mAlpha)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.mElevation)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.mRotation)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.mRotationX)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.mRotationY)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.mScaleX)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.mScaleY)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.mTransitionPathRotate)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.mTranslationX)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.mTranslationY)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.mTranslationZ)) {
            hashSet.add("translationZ");
        }
        if (this.mCustom.size() > 0) {
            Iterator<String> it = this.mCustom.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        char c5;
        Objects.requireNonNull(str);
        switch (str.hashCode()) {
            case -1581616630:
                if (str.equals(TypedValues.CycleType.S_CUSTOM_WAVE_SHAPE)) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case -1310311125:
                if (str.equals("easing")) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c5 = 4;
                    break;
                }
                c5 = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c5 = 5;
                    break;
                }
                c5 = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c5 = 6;
                    break;
                }
                c5 = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c5 = 7;
                    break;
                }
                c5 = 65535;
                break;
            case -1019779949:
                if (str.equals(TypedValues.CycleType.S_WAVE_OFFSET)) {
                    c5 = '\b';
                    break;
                }
                c5 = 65535;
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c5 = '\t';
                    break;
                }
                c5 = 65535;
                break;
            case -991726143:
                if (str.equals(TypedValues.CycleType.S_WAVE_PERIOD)) {
                    c5 = '\n';
                    break;
                }
                c5 = 65535;
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c5 = 11;
                    break;
                }
                c5 = 65535;
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c5 = '\f';
                    break;
                }
                c5 = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c5 = '\r';
                    break;
                }
                c5 = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c5 = 14;
                    break;
                }
                c5 = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c5 = 15;
                    break;
                }
                c5 = 65535;
                break;
            case 106629499:
                if (str.equals(TypedValues.CycleType.S_WAVE_PHASE)) {
                    c5 = 16;
                    break;
                }
                c5 = 65535;
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c5 = 17;
                    break;
                }
                c5 = 65535;
                break;
            case 803192288:
                if (str.equals("pathRotate")) {
                    c5 = 18;
                    break;
                }
                c5 = 65535;
                break;
            case 1532805160:
                if (str.equals("waveShape")) {
                    c5 = 19;
                    break;
                }
                c5 = 65535;
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c5 = 20;
                    break;
                }
                c5 = 65535;
                break;
            default:
                c5 = 65535;
                break;
        }
        switch (c5) {
            case 0:
                return TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE;
            case 1:
                return TypedValues.CycleType.TYPE_EASING;
            case 2:
                return 308;
            case 3:
                return 309;
            case 4:
                return 310;
            case 5:
                return 304;
            case 6:
                return 305;
            case 7:
                return 306;
            case '\b':
                return TypedValues.CycleType.TYPE_WAVE_OFFSET;
            case '\t':
                return 315;
            case '\n':
                return TypedValues.CycleType.TYPE_WAVE_PERIOD;
            case 11:
                return 313;
            case '\f':
                return 314;
            case '\r':
                return 311;
            case 14:
                return 312;
            case 15:
                return 403;
            case 16:
                return TypedValues.CycleType.TYPE_WAVE_PHASE;
            case 17:
                return 401;
            case 18:
                return 416;
            case 19:
                return TypedValues.CycleType.TYPE_WAVE_SHAPE;
            case 20:
                return 402;
            default:
                return -1;
        }
    }

    public float getValue(String str) {
        Objects.requireNonNull(str);
        switch (str) {
            case "rotationX":
                return this.mRotationX;
            case "rotationY":
                return this.mRotationY;
            case "rotationZ":
                return this.mRotation;
            case "translationX":
                return this.mTranslationX;
            case "translationY":
                return this.mTranslationY;
            case "translationZ":
                return this.mTranslationZ;
            case "offset":
                return this.mWaveOffset;
            case "progress":
                return this.mProgress;
            case "scaleX":
                return this.mScaleX;
            case "scaleY":
                return this.mScaleY;
            case "elevation":
                return this.mElevation;
            case "alpha":
                return this.mAlpha;
            case "phase":
                return this.mWavePhase;
            case "pathRotate":
                return this.mTransitionPathRotate;
            default:
                return Float.NaN;
        }
    }

    public void printAttributes() {
        HashSet<String> hashSet = new HashSet<>();
        getAttributeNames(hashSet);
        StringBuilder g5 = d.g(" ------------- ");
        g5.append(this.mFramePosition);
        g5.append(" -------------");
        Utils.log(g5.toString());
        Utils.log("MotionKeyCycle{Shape=" + this.mWaveShape + ", Period=" + this.mWavePeriod + ", Offset=" + this.mWaveOffset + ", Phase=" + this.mWavePhase + '}');
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i5 = 0; i5 < strArr.length; i5++) {
            a.a(strArr[i5]);
            Utils.log(strArr[i5] + ":" + getValue(strArr[i5]));
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i5, float f5) {
        if (i5 == 315) {
            this.mProgress = f5;
            return true;
        }
        if (i5 == 403) {
            this.mAlpha = f5;
            return true;
        }
        if (i5 == 416) {
            this.mTransitionPathRotate = f5;
            return true;
        }
        switch (i5) {
            case 304:
                this.mTranslationX = f5;
                return true;
            case 305:
                this.mTranslationY = f5;
                return true;
            case 306:
                this.mTranslationZ = f5;
                return true;
            case 307:
                this.mElevation = f5;
                return true;
            case 308:
                this.mRotationX = f5;
                return true;
            case 309:
                this.mRotationY = f5;
                return true;
            case 310:
                this.mRotation = f5;
                return true;
            case 311:
                this.mScaleX = f5;
                return true;
            case 312:
                this.mScaleY = f5;
                return true;
            default:
                switch (i5) {
                    case TypedValues.CycleType.TYPE_WAVE_PERIOD /* 423 */:
                        this.mWavePeriod = f5;
                        return true;
                    case TypedValues.CycleType.TYPE_WAVE_OFFSET /* 424 */:
                        this.mWaveOffset = f5;
                        return true;
                    case TypedValues.CycleType.TYPE_WAVE_PHASE /* 425 */:
                        this.mWavePhase = f5;
                        return true;
                    default:
                        return super.setValue(i5, f5);
                }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i5, int i6) {
        if (i5 == 401) {
            this.mCurveFit = i6;
            return true;
        }
        if (i5 == 421) {
            this.mWaveShape = i6;
            return true;
        }
        if (setValue(i5, i6)) {
            return true;
        }
        return super.setValue(i5, i6);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i5, String str) {
        if (i5 == 420) {
            this.mTransitionEasing = str;
            return true;
        }
        if (i5 != 422) {
            return super.setValue(i5, str);
        }
        this.mCustomWaveShape = str;
        return true;
    }
}
