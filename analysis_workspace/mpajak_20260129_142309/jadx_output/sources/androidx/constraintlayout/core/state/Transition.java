package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.Motion;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes19.dex */
public class Transition implements TypedValues {
    public static final int ANTICIPATE = 6;
    public static final int BOUNCE = 4;
    public static final int EASE_IN = 1;
    public static final int EASE_IN_OUT = 0;
    public static final int EASE_OUT = 2;
    public static final int END = 1;
    public static final int INTERPOLATED = 2;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    public static final int LINEAR = 3;
    public static final int OVERSHOOT = 5;
    private static final int SPLINE_STRING = -1;
    public static final int START = 0;
    public HashMap<Integer, HashMap<String, KeyPosition>> keyPositions = new HashMap<>();
    private HashMap<String, WidgetState> state = new HashMap<>();
    public TypedBundle mBundle = new TypedBundle();
    private int mDefaultInterpolator = 0;
    private String mDefaultInterpolatorString = null;
    private Easing mEasing = null;
    private int mAutoTransition = 0;
    private int mDuration = TbsListener.ErrorCode.INFO_CODE_BASE;
    private float mStagger = 0.0f;

    /* loaded from: classes12.dex */
    public static class KeyPosition {
        public int frame;
        public String target;
        public int type;

        /* renamed from: x, reason: collision with root package name */
        public float f142x;

        /* renamed from: y, reason: collision with root package name */
        public float f143y;

        public KeyPosition(String str, int i5, int i6, float f5, float f6) {
            this.target = str;
            this.frame = i5;
            this.type = i6;
            this.f142x = f5;
            this.f143y = f6;
        }
    }

    /* loaded from: classes21.dex */
    public static class WidgetState {
        public Motion motionControl;
        public KeyCache myKeyCache = new KeyCache();
        public int myParentHeight = -1;
        public int myParentWidth = -1;
        public WidgetFrame start = new WidgetFrame();
        public WidgetFrame end = new WidgetFrame();
        public WidgetFrame interpolated = new WidgetFrame();
        public MotionWidget motionWidgetStart = new MotionWidget(this.start);
        public MotionWidget motionWidgetEnd = new MotionWidget(this.end);
        public MotionWidget motionWidgetInterpolated = new MotionWidget(this.interpolated);

        public WidgetState() {
            Motion motion = new Motion(this.motionWidgetStart);
            this.motionControl = motion;
            motion.setStart(this.motionWidgetStart);
            this.motionControl.setEnd(this.motionWidgetEnd);
        }

        public WidgetFrame getFrame(int i5) {
            return i5 == 0 ? this.start : i5 == 1 ? this.end : this.interpolated;
        }

        public void interpolate(int i5, int i6, float f5, Transition transition) {
            this.myParentHeight = i6;
            this.myParentWidth = i5;
            this.motionControl.setup(i5, i6, 1.0f, System.nanoTime());
            WidgetFrame.interpolate(i5, i6, this.interpolated, this.start, this.end, transition, f5);
            this.interpolated.interpolatedPos = f5;
            this.motionControl.interpolate(this.motionWidgetInterpolated, f5, System.nanoTime(), this.myKeyCache);
        }

        public void setKeyAttribute(TypedBundle typedBundle) {
            MotionKeyAttributes motionKeyAttributes = new MotionKeyAttributes();
            typedBundle.applyDelta(motionKeyAttributes);
            this.motionControl.addKey(motionKeyAttributes);
        }

        public void setKeyCycle(TypedBundle typedBundle) {
            MotionKeyCycle motionKeyCycle = new MotionKeyCycle();
            typedBundle.applyDelta(motionKeyCycle);
            this.motionControl.addKey(motionKeyCycle);
        }

        public void setKeyPosition(TypedBundle typedBundle) {
            MotionKeyPosition motionKeyPosition = new MotionKeyPosition();
            typedBundle.applyDelta(motionKeyPosition);
            this.motionControl.addKey(motionKeyPosition);
        }

        public void update(ConstraintWidget constraintWidget, int i5) {
            if (i5 == 0) {
                this.start.update(constraintWidget);
                this.motionControl.setStart(this.motionWidgetStart);
            } else if (i5 == 1) {
                this.end.update(constraintWidget);
                this.motionControl.setEnd(this.motionWidgetEnd);
            }
            this.myParentWidth = -1;
        }
    }

    public static Interpolator getInterpolator(int i5, String str) {
        switch (i5) {
            case -1:
                return new c(str);
            case 0:
                return g.f155a;
            case 1:
                return d.f147a;
            case 2:
                return androidx.appcompat.graphics.drawable.a.f127a;
            case 3:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.a
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f5) {
                        float lambda$getInterpolator$4;
                        lambda$getInterpolator$4 = Transition.lambda$getInterpolator$4(f5);
                        return lambda$getInterpolator$4;
                    }
                };
            case 4:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.b
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f5) {
                        float lambda$getInterpolator$7;
                        lambda$getInterpolator$7 = Transition.lambda$getInterpolator$7(f5);
                        return lambda$getInterpolator$7;
                    }
                };
            case 5:
                return e.f149b;
            case 6:
                return f.f153a;
            default:
                return null;
        }
    }

    private WidgetState getWidgetState(String str) {
        return this.state.get(str);
    }

    private WidgetState getWidgetState(String str, ConstraintWidget constraintWidget, int i5) {
        WidgetState widgetState = this.state.get(str);
        if (widgetState == null) {
            widgetState = new WidgetState();
            this.mBundle.applyDelta(widgetState.motionControl);
            this.state.put(str, widgetState);
            if (constraintWidget != null) {
                widgetState.update(constraintWidget, i5);
            }
        }
        return widgetState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$0(String str, float f5) {
        return (float) Easing.getInterpolator(str).get(f5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$1(float f5) {
        return (float) Easing.getInterpolator("standard").get(f5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$2(float f5) {
        return (float) Easing.getInterpolator("accelerate").get(f5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$3(float f5) {
        return (float) Easing.getInterpolator("decelerate").get(f5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$4(float f5) {
        return (float) Easing.getInterpolator("linear").get(f5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$5(float f5) {
        return (float) Easing.getInterpolator("anticipate").get(f5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$6(float f5) {
        return (float) Easing.getInterpolator("overshoot").get(f5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$getInterpolator$7(float f5) {
        return (float) Easing.getInterpolator("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").get(f5);
    }

    public void addCustomColor(int i5, String str, String str2, int i6) {
        getWidgetState(str, null, i5).getFrame(i5).addCustomColor(str2, i6);
    }

    public void addCustomFloat(int i5, String str, String str2, float f5) {
        getWidgetState(str, null, i5).getFrame(i5).addCustomFloat(str2, f5);
    }

    public void addKeyAttribute(String str, TypedBundle typedBundle) {
        getWidgetState(str, null, 0).setKeyAttribute(typedBundle);
    }

    public void addKeyCycle(String str, TypedBundle typedBundle) {
        getWidgetState(str, null, 0).setKeyCycle(typedBundle);
    }

    public void addKeyPosition(String str, int i5, int i6, float f5, float f6) {
        TypedBundle typedBundle = new TypedBundle();
        typedBundle.add(510, 2);
        typedBundle.add(100, i5);
        typedBundle.add(506, f5);
        typedBundle.add(507, f6);
        getWidgetState(str, null, 0).setKeyPosition(typedBundle);
        KeyPosition keyPosition = new KeyPosition(str, i5, i6, f5, f6);
        HashMap<String, KeyPosition> hashMap = this.keyPositions.get(Integer.valueOf(i5));
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.keyPositions.put(Integer.valueOf(i5), hashMap);
        }
        hashMap.put(str, keyPosition);
    }

    public void addKeyPosition(String str, TypedBundle typedBundle) {
        getWidgetState(str, null, 0).setKeyPosition(typedBundle);
    }

    public void clear() {
        this.state.clear();
    }

    public boolean contains(String str) {
        return this.state.containsKey(str);
    }

    public void fillKeyPositions(WidgetFrame widgetFrame, float[] fArr, float[] fArr2, float[] fArr3) {
        KeyPosition keyPosition;
        int i5 = 0;
        for (int i6 = 0; i6 <= 100; i6++) {
            HashMap<String, KeyPosition> hashMap = this.keyPositions.get(Integer.valueOf(i6));
            if (hashMap != null && (keyPosition = hashMap.get(widgetFrame.widget.stringId)) != null) {
                fArr[i5] = keyPosition.f142x;
                fArr2[i5] = keyPosition.f143y;
                fArr3[i5] = keyPosition.frame;
                i5++;
            }
        }
    }

    public KeyPosition findNextPosition(String str, int i5) {
        KeyPosition keyPosition;
        while (i5 <= 100) {
            HashMap<String, KeyPosition> hashMap = this.keyPositions.get(Integer.valueOf(i5));
            if (hashMap != null && (keyPosition = hashMap.get(str)) != null) {
                return keyPosition;
            }
            i5++;
        }
        return null;
    }

    public KeyPosition findPreviousPosition(String str, int i5) {
        KeyPosition keyPosition;
        while (i5 >= 0) {
            HashMap<String, KeyPosition> hashMap = this.keyPositions.get(Integer.valueOf(i5));
            if (hashMap != null && (keyPosition = hashMap.get(str)) != null) {
                return keyPosition;
            }
            i5--;
        }
        return null;
    }

    public int getAutoTransition() {
        return this.mAutoTransition;
    }

    public WidgetFrame getEnd(ConstraintWidget constraintWidget) {
        return getWidgetState(constraintWidget.stringId, null, 1).end;
    }

    public WidgetFrame getEnd(String str) {
        WidgetState widgetState = this.state.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.end;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return 0;
    }

    public WidgetFrame getInterpolated(ConstraintWidget constraintWidget) {
        return getWidgetState(constraintWidget.stringId, null, 2).interpolated;
    }

    public WidgetFrame getInterpolated(String str) {
        WidgetState widgetState = this.state.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.interpolated;
    }

    public Interpolator getInterpolator() {
        return getInterpolator(this.mDefaultInterpolator, this.mDefaultInterpolatorString);
    }

    public int getKeyFrames(String str, float[] fArr, int[] iArr, int[] iArr2) {
        return this.state.get(str).motionControl.buildKeyFrames(fArr, iArr, iArr2);
    }

    public Motion getMotion(String str) {
        return getWidgetState(str, null, 0).motionControl;
    }

    public int getNumberKeyPositions(WidgetFrame widgetFrame) {
        int i5 = 0;
        for (int i6 = 0; i6 <= 100; i6++) {
            HashMap<String, KeyPosition> hashMap = this.keyPositions.get(Integer.valueOf(i6));
            if (hashMap != null && hashMap.get(widgetFrame.widget.stringId) != null) {
                i5++;
            }
        }
        return i5;
    }

    public float[] getPath(String str) {
        float[] fArr = new float[124];
        this.state.get(str).motionControl.buildPath(fArr, 62);
        return fArr;
    }

    public WidgetFrame getStart(ConstraintWidget constraintWidget) {
        return getWidgetState(constraintWidget.stringId, null, 0).start;
    }

    public WidgetFrame getStart(String str) {
        WidgetState widgetState = this.state.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.start;
    }

    public boolean hasPositionKeyframes() {
        return this.keyPositions.size() > 0;
    }

    public void interpolate(int i5, int i6, float f5) {
        Easing easing = this.mEasing;
        if (easing != null) {
            f5 = (float) easing.get(f5);
        }
        Iterator<String> it = this.state.keySet().iterator();
        while (it.hasNext()) {
            this.state.get(it.next()).interpolate(i5, i6, f5, this);
        }
    }

    public boolean isEmpty() {
        return this.state.isEmpty();
    }

    public void setTransitionProperties(TypedBundle typedBundle) {
        typedBundle.applyDelta(this.mBundle);
        typedBundle.applyDelta(this);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i5, float f5) {
        if (i5 != 706) {
            return false;
        }
        this.mStagger = f5;
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i5, int i6) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i5, String str) {
        if (i5 != 705) {
            return false;
        }
        this.mDefaultInterpolatorString = str;
        this.mEasing = Easing.getInterpolator(str);
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i5, boolean z4) {
        return false;
    }

    public void updateFrom(ConstraintWidgetContainer constraintWidgetContainer, int i5) {
        ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
        int size = children.size();
        for (int i6 = 0; i6 < size; i6++) {
            ConstraintWidget constraintWidget = children.get(i6);
            getWidgetState(constraintWidget.stringId, null, i5).update(constraintWidget, i5);
        }
    }
}
