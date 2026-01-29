package androidx.constraintlayout.core;

import androidx.activity.d;
import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;

/* loaded from: classes19.dex */
public class ArrayLinkedVariables implements ArrayRow.ArrayRowVariables {
    private static final boolean DEBUG = false;
    private static final boolean FULL_NEW_CHECK = false;
    public static final int NONE = -1;
    private static float epsilon = 0.001f;
    public final Cache mCache;
    private final ArrayRow mRow;
    public int currentSize = 0;
    private int ROW_SIZE = 8;
    private SolverVariable candidate = null;
    private int[] mArrayIndices = new int[8];
    private int[] mArrayNextIndices = new int[8];
    private float[] mArrayValues = new float[8];
    private int mHead = -1;
    private int mLast = -1;
    private boolean mDidFillOnce = false;

    public ArrayLinkedVariables(ArrayRow arrayRow, Cache cache) {
        this.mRow = arrayRow;
        this.mCache = cache;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(SolverVariable solverVariable, float f5, boolean z4) {
        float f6 = epsilon;
        if (f5 <= (-f6) || f5 >= f6) {
            int i5 = this.mHead;
            if (i5 == -1) {
                this.mHead = 0;
                this.mArrayValues[0] = f5;
                this.mArrayIndices[0] = solverVariable.id;
                this.mArrayNextIndices[0] = -1;
                solverVariable.usageInRowCount++;
                solverVariable.addToRow(this.mRow);
                this.currentSize++;
                if (this.mDidFillOnce) {
                    return;
                }
                int i6 = this.mLast + 1;
                this.mLast = i6;
                int[] iArr = this.mArrayIndices;
                if (i6 >= iArr.length) {
                    this.mDidFillOnce = true;
                    this.mLast = iArr.length - 1;
                    return;
                }
                return;
            }
            int i7 = -1;
            for (int i8 = 0; i5 != -1 && i8 < this.currentSize; i8++) {
                int[] iArr2 = this.mArrayIndices;
                int i9 = iArr2[i5];
                int i10 = solverVariable.id;
                if (i9 == i10) {
                    float[] fArr = this.mArrayValues;
                    float f7 = fArr[i5] + f5;
                    float f8 = epsilon;
                    if (f7 > (-f8) && f7 < f8) {
                        f7 = 0.0f;
                    }
                    fArr[i5] = f7;
                    if (f7 == 0.0f) {
                        if (i5 == this.mHead) {
                            this.mHead = this.mArrayNextIndices[i5];
                        } else {
                            int[] iArr3 = this.mArrayNextIndices;
                            iArr3[i7] = iArr3[i5];
                        }
                        if (z4) {
                            solverVariable.removeFromRow(this.mRow);
                        }
                        if (this.mDidFillOnce) {
                            this.mLast = i5;
                        }
                        solverVariable.usageInRowCount--;
                        this.currentSize--;
                        return;
                    }
                    return;
                }
                if (iArr2[i5] < i10) {
                    i7 = i5;
                }
                i5 = this.mArrayNextIndices[i5];
            }
            int i11 = this.mLast;
            int i12 = i11 + 1;
            if (this.mDidFillOnce) {
                int[] iArr4 = this.mArrayIndices;
                if (iArr4[i11] != -1) {
                    i11 = iArr4.length;
                }
            } else {
                i11 = i12;
            }
            int[] iArr5 = this.mArrayIndices;
            if (i11 >= iArr5.length && this.currentSize < iArr5.length) {
                int i13 = 0;
                while (true) {
                    int[] iArr6 = this.mArrayIndices;
                    if (i13 >= iArr6.length) {
                        break;
                    }
                    if (iArr6[i13] == -1) {
                        i11 = i13;
                        break;
                    }
                    i13++;
                }
            }
            int[] iArr7 = this.mArrayIndices;
            if (i11 >= iArr7.length) {
                i11 = iArr7.length;
                int i14 = this.ROW_SIZE * 2;
                this.ROW_SIZE = i14;
                this.mDidFillOnce = false;
                this.mLast = i11 - 1;
                this.mArrayValues = Arrays.copyOf(this.mArrayValues, i14);
                this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.ROW_SIZE);
                this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.ROW_SIZE);
            }
            this.mArrayIndices[i11] = solverVariable.id;
            this.mArrayValues[i11] = f5;
            int[] iArr8 = this.mArrayNextIndices;
            if (i7 != -1) {
                iArr8[i11] = iArr8[i7];
                iArr8[i7] = i11;
            } else {
                iArr8[i11] = this.mHead;
                this.mHead = i11;
            }
            solverVariable.usageInRowCount++;
            solverVariable.addToRow(this.mRow);
            this.currentSize++;
            if (!this.mDidFillOnce) {
                this.mLast++;
            }
            int i15 = this.mLast;
            int[] iArr9 = this.mArrayIndices;
            if (i15 >= iArr9.length) {
                this.mDidFillOnce = true;
                this.mLast = iArr9.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void clear() {
        int i5 = this.mHead;
        for (int i6 = 0; i5 != -1 && i6 < this.currentSize; i6++) {
            SolverVariable solverVariable = this.mCache.mIndexedVariables[this.mArrayIndices[i5]];
            if (solverVariable != null) {
                solverVariable.removeFromRow(this.mRow);
            }
            i5 = this.mArrayNextIndices[i5];
        }
        this.mHead = -1;
        this.mLast = -1;
        this.mDidFillOnce = false;
        this.currentSize = 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(SolverVariable solverVariable) {
        int i5 = this.mHead;
        if (i5 == -1) {
            return false;
        }
        for (int i6 = 0; i5 != -1 && i6 < this.currentSize; i6++) {
            if (this.mArrayIndices[i5] == solverVariable.id) {
                return true;
            }
            i5 = this.mArrayNextIndices[i5];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void display() {
        int i5 = this.currentSize;
        System.out.print("{ ");
        for (int i6 = 0; i6 < i5; i6++) {
            SolverVariable variable = getVariable(i6);
            if (variable != null) {
                System.out.print(variable + " = " + getVariableValue(i6) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void divideByAmount(float f5) {
        int i5 = this.mHead;
        for (int i6 = 0; i5 != -1 && i6 < this.currentSize; i6++) {
            float[] fArr = this.mArrayValues;
            fArr[i5] = fArr[i5] / f5;
            i5 = this.mArrayNextIndices[i5];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float get(SolverVariable solverVariable) {
        int i5 = this.mHead;
        for (int i6 = 0; i5 != -1 && i6 < this.currentSize; i6++) {
            if (this.mArrayIndices[i5] == solverVariable.id) {
                return this.mArrayValues[i5];
            }
            i5 = this.mArrayNextIndices[i5];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
        return this.currentSize;
    }

    public int getHead() {
        return this.mHead;
    }

    public final int getId(int i5) {
        return this.mArrayIndices[i5];
    }

    public final int getNextIndice(int i5) {
        return this.mArrayNextIndices[i5];
    }

    public SolverVariable getPivotCandidate() {
        SolverVariable solverVariable = this.candidate;
        if (solverVariable != null) {
            return solverVariable;
        }
        int i5 = this.mHead;
        SolverVariable solverVariable2 = null;
        for (int i6 = 0; i5 != -1 && i6 < this.currentSize; i6++) {
            if (this.mArrayValues[i5] < 0.0f) {
                SolverVariable solverVariable3 = this.mCache.mIndexedVariables[this.mArrayIndices[i5]];
                if (solverVariable2 == null || solverVariable2.strength < solverVariable3.strength) {
                    solverVariable2 = solverVariable3;
                }
            }
            i5 = this.mArrayNextIndices[i5];
        }
        return solverVariable2;
    }

    public final float getValue(int i5) {
        return this.mArrayValues[i5];
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public SolverVariable getVariable(int i5) {
        int i6 = this.mHead;
        for (int i7 = 0; i6 != -1 && i7 < this.currentSize; i7++) {
            if (i7 == i5) {
                return this.mCache.mIndexedVariables[this.mArrayIndices[i6]];
            }
            i6 = this.mArrayNextIndices[i6];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int i5) {
        int i6 = this.mHead;
        for (int i7 = 0; i6 != -1 && i7 < this.currentSize; i7++) {
            if (i7 == i5) {
                return this.mArrayValues[i6];
            }
            i6 = this.mArrayNextIndices[i6];
        }
        return 0.0f;
    }

    public boolean hasAtLeastOnePositiveVariable() {
        int i5 = this.mHead;
        for (int i6 = 0; i5 != -1 && i6 < this.currentSize; i6++) {
            if (this.mArrayValues[i5] > 0.0f) {
                return true;
            }
            i5 = this.mArrayNextIndices[i5];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(SolverVariable solverVariable) {
        int i5 = this.mHead;
        if (i5 == -1) {
            return -1;
        }
        for (int i6 = 0; i5 != -1 && i6 < this.currentSize; i6++) {
            if (this.mArrayIndices[i5] == solverVariable.id) {
                return i5;
            }
            i5 = this.mArrayNextIndices[i5];
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        int i5 = this.mHead;
        for (int i6 = 0; i5 != -1 && i6 < this.currentSize; i6++) {
            float[] fArr = this.mArrayValues;
            fArr[i5] = fArr[i5] * (-1.0f);
            i5 = this.mArrayNextIndices[i5];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void put(SolverVariable solverVariable, float f5) {
        if (f5 == 0.0f) {
            remove(solverVariable, true);
            return;
        }
        int i5 = this.mHead;
        if (i5 == -1) {
            this.mHead = 0;
            this.mArrayValues[0] = f5;
            this.mArrayIndices[0] = solverVariable.id;
            this.mArrayNextIndices[0] = -1;
            solverVariable.usageInRowCount++;
            solverVariable.addToRow(this.mRow);
            this.currentSize++;
            if (this.mDidFillOnce) {
                return;
            }
            int i6 = this.mLast + 1;
            this.mLast = i6;
            int[] iArr = this.mArrayIndices;
            if (i6 >= iArr.length) {
                this.mDidFillOnce = true;
                this.mLast = iArr.length - 1;
                return;
            }
            return;
        }
        int i7 = -1;
        for (int i8 = 0; i5 != -1 && i8 < this.currentSize; i8++) {
            int[] iArr2 = this.mArrayIndices;
            int i9 = iArr2[i5];
            int i10 = solverVariable.id;
            if (i9 == i10) {
                this.mArrayValues[i5] = f5;
                return;
            }
            if (iArr2[i5] < i10) {
                i7 = i5;
            }
            i5 = this.mArrayNextIndices[i5];
        }
        int i11 = this.mLast;
        int i12 = i11 + 1;
        if (this.mDidFillOnce) {
            int[] iArr3 = this.mArrayIndices;
            if (iArr3[i11] != -1) {
                i11 = iArr3.length;
            }
        } else {
            i11 = i12;
        }
        int[] iArr4 = this.mArrayIndices;
        if (i11 >= iArr4.length && this.currentSize < iArr4.length) {
            int i13 = 0;
            while (true) {
                int[] iArr5 = this.mArrayIndices;
                if (i13 >= iArr5.length) {
                    break;
                }
                if (iArr5[i13] == -1) {
                    i11 = i13;
                    break;
                }
                i13++;
            }
        }
        int[] iArr6 = this.mArrayIndices;
        if (i11 >= iArr6.length) {
            i11 = iArr6.length;
            int i14 = this.ROW_SIZE * 2;
            this.ROW_SIZE = i14;
            this.mDidFillOnce = false;
            this.mLast = i11 - 1;
            this.mArrayValues = Arrays.copyOf(this.mArrayValues, i14);
            this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.ROW_SIZE);
            this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.ROW_SIZE);
        }
        this.mArrayIndices[i11] = solverVariable.id;
        this.mArrayValues[i11] = f5;
        int[] iArr7 = this.mArrayNextIndices;
        if (i7 != -1) {
            iArr7[i11] = iArr7[i7];
            iArr7[i7] = i11;
        } else {
            iArr7[i11] = this.mHead;
            this.mHead = i11;
        }
        solverVariable.usageInRowCount++;
        solverVariable.addToRow(this.mRow);
        int i15 = this.currentSize + 1;
        this.currentSize = i15;
        if (!this.mDidFillOnce) {
            this.mLast++;
        }
        int[] iArr8 = this.mArrayIndices;
        if (i15 >= iArr8.length) {
            this.mDidFillOnce = true;
        }
        if (this.mLast >= iArr8.length) {
            this.mDidFillOnce = true;
            this.mLast = iArr8.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float remove(SolverVariable solverVariable, boolean z4) {
        if (this.candidate == solverVariable) {
            this.candidate = null;
        }
        int i5 = this.mHead;
        if (i5 == -1) {
            return 0.0f;
        }
        int i6 = 0;
        int i7 = -1;
        while (i5 != -1 && i6 < this.currentSize) {
            if (this.mArrayIndices[i5] == solverVariable.id) {
                if (i5 == this.mHead) {
                    this.mHead = this.mArrayNextIndices[i5];
                } else {
                    int[] iArr = this.mArrayNextIndices;
                    iArr[i7] = iArr[i5];
                }
                if (z4) {
                    solverVariable.removeFromRow(this.mRow);
                }
                solverVariable.usageInRowCount--;
                this.currentSize--;
                this.mArrayIndices[i5] = -1;
                if (this.mDidFillOnce) {
                    this.mLast = i5;
                }
                return this.mArrayValues[i5];
            }
            i6++;
            i7 = i5;
            i5 = this.mArrayNextIndices[i5];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
        return (this.mArrayIndices.length * 4 * 3) + 0 + 36;
    }

    public String toString() {
        int i5 = this.mHead;
        String str = "";
        for (int i6 = 0; i5 != -1 && i6 < this.currentSize; i6++) {
            StringBuilder g5 = d.g(d.f(str, " -> "));
            g5.append(this.mArrayValues[i5]);
            g5.append(" : ");
            StringBuilder g6 = d.g(g5.toString());
            g6.append(this.mCache.mIndexedVariables[this.mArrayIndices[i5]]);
            str = g6.toString();
            i5 = this.mArrayNextIndices[i5];
        }
        return str;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(ArrayRow arrayRow, boolean z4) {
        float f5 = get(arrayRow.variable);
        remove(arrayRow.variable, z4);
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.variables;
        int currentSize = arrayRowVariables.getCurrentSize();
        for (int i5 = 0; i5 < currentSize; i5++) {
            SolverVariable variable = arrayRowVariables.getVariable(i5);
            add(variable, arrayRowVariables.get(variable) * f5, z4);
        }
        return f5;
    }
}
