package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.activity.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;

/* loaded from: classes21.dex */
public class CircularFlow extends VirtualLayout {
    private static float DEFAULT_ANGLE = 0.0f;
    private static int DEFAULT_RADIUS = 0;
    private static final String TAG = "CircularFlow";
    private float[] mAngles;
    public ConstraintLayout mContainer;
    private int mCountAngle;
    private int mCountRadius;
    private int[] mRadius;
    private String mReferenceAngles;
    private Float mReferenceDefaultAngle;
    private Integer mReferenceDefaultRadius;
    private String mReferenceRadius;
    public int mViewCenter;

    public CircularFlow(Context context) {
        super(context);
    }

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
    }

    private void addAngle(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.myContext == null || (fArr = this.mAngles) == null) {
            return;
        }
        if (this.mCountAngle + 1 > fArr.length) {
            this.mAngles = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.mAngles[this.mCountAngle] = Integer.parseInt(str);
        this.mCountAngle++;
    }

    private void addRadius(String str) {
        int[] iArr;
        if (str == null || str.length() == 0 || this.myContext == null || (iArr = this.mRadius) == null) {
            return;
        }
        if (this.mCountRadius + 1 > iArr.length) {
            this.mRadius = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.mRadius[this.mCountRadius] = (int) (Integer.parseInt(str) * this.myContext.getResources().getDisplayMetrics().density);
        this.mCountRadius++;
    }

    private void anchorReferences() {
        this.mContainer = (ConstraintLayout) getParent();
        for (int i5 = 0; i5 < this.mCount; i5++) {
            View viewById = this.mContainer.getViewById(this.mIds[i5]);
            if (viewById != null) {
                int i6 = DEFAULT_RADIUS;
                float f5 = DEFAULT_ANGLE;
                int[] iArr = this.mRadius;
                if (iArr == null || i5 >= iArr.length) {
                    Integer num = this.mReferenceDefaultRadius;
                    if (num == null || num.intValue() == -1) {
                        StringBuilder g5 = d.g("Added radius to view with id: ");
                        g5.append(this.mMap.get(Integer.valueOf(viewById.getId())));
                        Log.e(TAG, g5.toString());
                    } else {
                        this.mCountRadius++;
                        if (this.mRadius == null) {
                            this.mRadius = new int[1];
                        }
                        int[] radius = getRadius();
                        this.mRadius = radius;
                        radius[this.mCountRadius - 1] = i6;
                    }
                } else {
                    i6 = iArr[i5];
                }
                float[] fArr = this.mAngles;
                if (fArr == null || i5 >= fArr.length) {
                    Float f6 = this.mReferenceDefaultAngle;
                    if (f6 == null || f6.floatValue() == -1.0f) {
                        StringBuilder g6 = d.g("Added angle to view with id: ");
                        g6.append(this.mMap.get(Integer.valueOf(viewById.getId())));
                        Log.e(TAG, g6.toString());
                    } else {
                        this.mCountAngle++;
                        if (this.mAngles == null) {
                            this.mAngles = new float[1];
                        }
                        float[] angles = getAngles();
                        this.mAngles = angles;
                        angles[this.mCountAngle - 1] = f5;
                    }
                } else {
                    f5 = fArr[i5];
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewById.getLayoutParams();
                layoutParams.circleAngle = f5;
                layoutParams.circleConstraint = this.mViewCenter;
                layoutParams.circleRadius = i6;
                viewById.setLayoutParams(layoutParams);
            }
        }
        applyLayoutFeatures();
    }

    private float[] removeAngle(float[] fArr, int i5) {
        return (fArr == null || i5 < 0 || i5 >= this.mCountAngle) ? fArr : removeElementFromArray(fArr, i5);
    }

    public static float[] removeElementFromArray(float[] fArr, int i5) {
        float[] fArr2 = new float[fArr.length - 1];
        int i6 = 0;
        for (int i7 = 0; i7 < fArr.length; i7++) {
            if (i7 != i5) {
                fArr2[i6] = fArr[i7];
                i6++;
            }
        }
        return fArr2;
    }

    public static int[] removeElementFromArray(int[] iArr, int i5) {
        int[] iArr2 = new int[iArr.length - 1];
        int i6 = 0;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            if (i7 != i5) {
                iArr2[i6] = iArr[i7];
                i6++;
            }
        }
        return iArr2;
    }

    private int[] removeRadius(int[] iArr, int i5) {
        return (iArr == null || i5 < 0 || i5 >= this.mCountRadius) ? iArr : removeElementFromArray(iArr, i5);
    }

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i5 = 0;
        this.mCountAngle = 0;
        while (true) {
            int indexOf = str.indexOf(44, i5);
            if (indexOf == -1) {
                addAngle(str.substring(i5).trim());
                return;
            } else {
                addAngle(str.substring(i5, indexOf).trim());
                i5 = indexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i5 = 0;
        this.mCountRadius = 0;
        while (true) {
            int indexOf = str.indexOf(44, i5);
            if (indexOf == -1) {
                addRadius(str.substring(i5).trim());
                return;
            } else {
                addRadius(str.substring(i5, indexOf).trim());
                i5 = indexOf + 1;
            }
        }
    }

    public void addViewToCircularFlow(View view, int i5, float f5) {
        if (containsId(view.getId())) {
            return;
        }
        addView(view);
        this.mCountAngle++;
        float[] angles = getAngles();
        this.mAngles = angles;
        angles[this.mCountAngle - 1] = f5;
        this.mCountRadius++;
        int[] radius = getRadius();
        this.mRadius = radius;
        radius[this.mCountRadius - 1] = (int) (i5 * this.myContext.getResources().getDisplayMetrics().density);
        anchorReferences();
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.mAngles, this.mCountAngle);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.mRadius, this.mCountRadius);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == R.styleable.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.mViewCenter = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_angles) {
                    String string = obtainStyledAttributes.getString(index);
                    this.mReferenceAngles = string;
                    setAngles(string);
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.mReferenceRadius = string2;
                    setRadius(string2);
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, DEFAULT_ANGLE));
                    this.mReferenceDefaultAngle = valueOf;
                    setDefaultAngle(valueOf.floatValue());
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, DEFAULT_RADIUS));
                    this.mReferenceDefaultRadius = valueOf2;
                    setDefaultRadius(valueOf2.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public boolean isUpdatable(View view) {
        return containsId(view.getId()) && indexFromId(view.getId()) != -1;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.mReferenceAngles;
        if (str != null) {
            this.mAngles = new float[1];
            setAngles(str);
        }
        String str2 = this.mReferenceRadius;
        if (str2 != null) {
            this.mRadius = new int[1];
            setRadius(str2);
        }
        Float f5 = this.mReferenceDefaultAngle;
        if (f5 != null) {
            setDefaultAngle(f5.floatValue());
        }
        Integer num = this.mReferenceDefaultRadius;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        anchorReferences();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public int removeView(View view) {
        int removeView = super.removeView(view);
        if (removeView == -1) {
            return removeView;
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.mContainer);
        constraintSet.clear(view.getId(), 8);
        constraintSet.applyTo(this.mContainer);
        float[] fArr = this.mAngles;
        if (removeView < fArr.length) {
            this.mAngles = removeAngle(fArr, removeView);
            this.mCountAngle--;
        }
        int[] iArr = this.mRadius;
        if (removeView < iArr.length) {
            this.mRadius = removeRadius(iArr, removeView);
            this.mCountRadius--;
        }
        anchorReferences();
        return removeView;
    }

    public void setDefaultAngle(float f5) {
        DEFAULT_ANGLE = f5;
    }

    public void setDefaultRadius(int i5) {
        DEFAULT_RADIUS = i5;
    }

    public void updateAngle(View view, float f5) {
        if (!isUpdatable(view)) {
            StringBuilder g5 = d.g("It was not possible to update angle to view with id: ");
            g5.append(view.getId());
            Log.e(TAG, g5.toString());
            return;
        }
        int indexFromId = indexFromId(view.getId());
        if (indexFromId > this.mAngles.length) {
            return;
        }
        float[] angles = getAngles();
        this.mAngles = angles;
        angles[indexFromId] = f5;
        anchorReferences();
    }

    public void updateRadius(View view, int i5) {
        if (!isUpdatable(view)) {
            StringBuilder g5 = d.g("It was not possible to update radius to view with id: ");
            g5.append(view.getId());
            Log.e(TAG, g5.toString());
            return;
        }
        int indexFromId = indexFromId(view.getId());
        if (indexFromId > this.mRadius.length) {
            return;
        }
        int[] radius = getRadius();
        this.mRadius = radius;
        radius[indexFromId] = (int) (i5 * this.myContext.getResources().getDisplayMetrics().density);
        anchorReferences();
    }

    public void updateReference(View view, int i5, float f5) {
        if (!isUpdatable(view)) {
            StringBuilder g5 = d.g("It was not possible to update radius and angle to view with id: ");
            g5.append(view.getId());
            Log.e(TAG, g5.toString());
            return;
        }
        int indexFromId = indexFromId(view.getId());
        if (getAngles().length > indexFromId) {
            float[] angles = getAngles();
            this.mAngles = angles;
            angles[indexFromId] = f5;
        }
        if (getRadius().length > indexFromId) {
            int[] radius = getRadius();
            this.mRadius = radius;
            radius[indexFromId] = (int) (i5 * this.myContext.getResources().getDisplayMetrics().density);
        }
        anchorReferences();
    }
}
