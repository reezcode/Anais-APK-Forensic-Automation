package androidx.constraintlayout.core;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

/* loaded from: classes23.dex */
public class ArrayRow implements LinearSystem.Row {
    private static final boolean DEBUG = false;
    private static final boolean FULL_NEW_CHECK = false;
    public ArrayRowVariables variables;
    public SolverVariable variable = null;
    public float constantValue = 0.0f;
    public boolean used = false;
    public ArrayList<SolverVariable> variablesToUpdate = new ArrayList<>();
    public boolean isSimpleDefinition = false;

    /* loaded from: classes11.dex */
    public interface ArrayRowVariables {
        void add(SolverVariable solverVariable, float f5, boolean z4);

        void clear();

        boolean contains(SolverVariable solverVariable);

        void display();

        void divideByAmount(float f5);

        float get(SolverVariable solverVariable);

        int getCurrentSize();

        SolverVariable getVariable(int i5);

        float getVariableValue(int i5);

        int indexOf(SolverVariable solverVariable);

        void invert();

        void put(SolverVariable solverVariable, float f5);

        float remove(SolverVariable solverVariable, boolean z4);

        int sizeInBytes();

        float use(ArrayRow arrayRow, boolean z4);
    }

    public ArrayRow() {
    }

    public ArrayRow(Cache cache) {
        this.variables = new ArrayLinkedVariables(this, cache);
    }

    private boolean isNew(SolverVariable solverVariable, LinearSystem linearSystem) {
        return solverVariable.usageInRowCount <= 1;
    }

    private SolverVariable pickPivotInVariables(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int currentSize = this.variables.getCurrentSize();
        SolverVariable solverVariable2 = null;
        float f5 = 0.0f;
        for (int i5 = 0; i5 < currentSize; i5++) {
            float variableValue = this.variables.getVariableValue(i5);
            if (variableValue < 0.0f) {
                SolverVariable variable = this.variables.getVariable(i5);
                if ((zArr == null || !zArr[variable.id]) && variable != solverVariable && (((type = variable.mType) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && variableValue < f5)) {
                    f5 = variableValue;
                    solverVariable2 = variable;
                }
            }
        }
        return solverVariable2;
    }

    public ArrayRow addError(LinearSystem linearSystem, int i5) {
        this.variables.put(linearSystem.createErrorVariable(i5, "ep"), 1.0f);
        this.variables.put(linearSystem.createErrorVariable(i5, "em"), -1.0f);
        return this;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void addError(SolverVariable solverVariable) {
        int i5 = solverVariable.strength;
        float f5 = 1.0f;
        if (i5 != 1) {
            if (i5 == 2) {
                f5 = 1000.0f;
            } else if (i5 == 3) {
                f5 = 1000000.0f;
            } else if (i5 == 4) {
                f5 = 1.0E9f;
            } else if (i5 == 5) {
                f5 = 1.0E12f;
            }
        }
        this.variables.put(solverVariable, f5);
    }

    public ArrayRow addSingleError(SolverVariable solverVariable, int i5) {
        this.variables.put(solverVariable, i5);
        return this;
    }

    public boolean chooseSubject(LinearSystem linearSystem) {
        boolean z4;
        SolverVariable chooseSubjectInVariables = chooseSubjectInVariables(linearSystem);
        if (chooseSubjectInVariables == null) {
            z4 = true;
        } else {
            pivot(chooseSubjectInVariables);
            z4 = false;
        }
        if (this.variables.getCurrentSize() == 0) {
            this.isSimpleDefinition = true;
        }
        return z4;
    }

    public SolverVariable chooseSubjectInVariables(LinearSystem linearSystem) {
        int currentSize = this.variables.getCurrentSize();
        SolverVariable solverVariable = null;
        SolverVariable solverVariable2 = null;
        boolean z4 = false;
        boolean z5 = false;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i5 = 0; i5 < currentSize; i5++) {
            float variableValue = this.variables.getVariableValue(i5);
            SolverVariable variable = this.variables.getVariable(i5);
            if (variable.mType == SolverVariable.Type.UNRESTRICTED) {
                if (solverVariable == null || f5 > variableValue) {
                    z4 = isNew(variable, linearSystem);
                    f5 = variableValue;
                    solverVariable = variable;
                } else if (!z4 && isNew(variable, linearSystem)) {
                    f5 = variableValue;
                    solverVariable = variable;
                    z4 = true;
                }
            } else if (solverVariable == null && variableValue < 0.0f) {
                if (solverVariable2 == null || f6 > variableValue) {
                    z5 = isNew(variable, linearSystem);
                    f6 = variableValue;
                    solverVariable2 = variable;
                } else if (!z5 && isNew(variable, linearSystem)) {
                    f6 = variableValue;
                    solverVariable2 = variable;
                    z5 = true;
                }
            }
        }
        return solverVariable != null ? solverVariable : solverVariable2;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
        this.variables.clear();
        this.variable = null;
        this.constantValue = 0.0f;
    }

    public ArrayRow createRowCentering(SolverVariable solverVariable, SolverVariable solverVariable2, int i5, float f5, SolverVariable solverVariable3, SolverVariable solverVariable4, int i6) {
        int i7;
        float f6;
        if (solverVariable2 == solverVariable3) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable2, -2.0f);
            return this;
        }
        if (f5 == 0.5f) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            if (i5 > 0 || i6 > 0) {
                i7 = (-i5) + i6;
                f6 = i7;
            }
            return this;
        }
        if (f5 <= 0.0f) {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
            f6 = i5;
        } else {
            if (f5 < 1.0f) {
                float f7 = 1.0f - f5;
                this.variables.put(solverVariable, f7 * 1.0f);
                this.variables.put(solverVariable2, f7 * (-1.0f));
                this.variables.put(solverVariable3, (-1.0f) * f5);
                this.variables.put(solverVariable4, 1.0f * f5);
                if (i5 > 0 || i6 > 0) {
                    this.constantValue = (i6 * f5) + ((-i5) * f7);
                }
                return this;
            }
            this.variables.put(solverVariable4, -1.0f);
            this.variables.put(solverVariable3, 1.0f);
            i7 = -i6;
            f6 = i7;
        }
        this.constantValue = f6;
        return this;
    }

    public ArrayRow createRowDefinition(SolverVariable solverVariable, int i5) {
        this.variable = solverVariable;
        float f5 = i5;
        solverVariable.computedValue = f5;
        this.constantValue = f5;
        this.isSimpleDefinition = true;
        return this;
    }

    public ArrayRow createRowDimensionPercent(SolverVariable solverVariable, SolverVariable solverVariable2, float f5) {
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, f5);
        return this;
    }

    public ArrayRow createRowDimensionRatio(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f5) {
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        this.variables.put(solverVariable3, f5);
        this.variables.put(solverVariable4, -f5);
        return this;
    }

    public ArrayRow createRowEqualDimension(float f5, float f6, float f7, SolverVariable solverVariable, int i5, SolverVariable solverVariable2, int i6, SolverVariable solverVariable3, int i7, SolverVariable solverVariable4, int i8) {
        if (f6 == 0.0f || f5 == f7) {
            this.constantValue = ((-i5) - i6) + i7 + i8;
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
        } else {
            float f8 = (f5 / f6) / (f7 / f6);
            this.constantValue = (i8 * f8) + (i7 * f8) + ((-i5) - i6);
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, f8);
            this.variables.put(solverVariable3, -f8);
        }
        return this;
    }

    public ArrayRow createRowEqualMatchDimensions(float f5, float f6, float f7, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.constantValue = 0.0f;
        if (f6 == 0.0f || f5 == f7) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
        } else if (f5 == 0.0f) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
        } else if (f7 == 0.0f) {
            this.variables.put(solverVariable3, 1.0f);
            this.variables.put(solverVariable4, -1.0f);
        } else {
            float f8 = (f5 / f6) / (f7 / f6);
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, f8);
            this.variables.put(solverVariable3, -f8);
        }
        return this;
    }

    public ArrayRow createRowEquals(SolverVariable solverVariable, int i5) {
        ArrayRowVariables arrayRowVariables;
        float f5;
        if (i5 < 0) {
            this.constantValue = i5 * (-1);
            arrayRowVariables = this.variables;
            f5 = 1.0f;
        } else {
            this.constantValue = i5;
            arrayRowVariables = this.variables;
            f5 = -1.0f;
        }
        arrayRowVariables.put(solverVariable, f5);
        return this;
    }

    public ArrayRow createRowEquals(SolverVariable solverVariable, SolverVariable solverVariable2, int i5) {
        boolean z4 = false;
        if (i5 != 0) {
            if (i5 < 0) {
                i5 *= -1;
                z4 = true;
            }
            this.constantValue = i5;
        }
        if (z4) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
        } else {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
        }
        return this;
    }

    public ArrayRow createRowGreaterThan(SolverVariable solverVariable, int i5, SolverVariable solverVariable2) {
        this.constantValue = i5;
        this.variables.put(solverVariable, -1.0f);
        return this;
    }

    public ArrayRow createRowGreaterThan(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i5) {
        boolean z4 = false;
        if (i5 != 0) {
            if (i5 < 0) {
                i5 *= -1;
                z4 = true;
            }
            this.constantValue = i5;
        }
        if (z4) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, -1.0f);
        } else {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
            this.variables.put(solverVariable3, 1.0f);
        }
        return this;
    }

    public ArrayRow createRowLowerThan(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i5) {
        boolean z4 = false;
        if (i5 != 0) {
            if (i5 < 0) {
                i5 *= -1;
                z4 = true;
            }
            this.constantValue = i5;
        }
        if (z4) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, 1.0f);
        } else {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
        }
        return this;
    }

    public ArrayRow createRowWithAngle(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f5) {
        this.variables.put(solverVariable3, 0.5f);
        this.variables.put(solverVariable4, 0.5f);
        this.variables.put(solverVariable, -0.5f);
        this.variables.put(solverVariable2, -0.5f);
        this.constantValue = -f5;
        return this;
    }

    public void ensurePositiveConstant() {
        float f5 = this.constantValue;
        if (f5 < 0.0f) {
            this.constantValue = f5 * (-1.0f);
            this.variables.invert();
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable getKey() {
        return this.variable;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr) {
        return pickPivotInVariables(zArr, null);
    }

    public boolean hasKeyVariable() {
        SolverVariable solverVariable = this.variable;
        return solverVariable != null && (solverVariable.mType == SolverVariable.Type.UNRESTRICTED || this.constantValue >= 0.0f);
    }

    public boolean hasVariable(SolverVariable solverVariable) {
        return this.variables.contains(solverVariable);
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void initFromRow(LinearSystem.Row row) {
        if (row instanceof ArrayRow) {
            ArrayRow arrayRow = (ArrayRow) row;
            this.variable = null;
            this.variables.clear();
            for (int i5 = 0; i5 < arrayRow.variables.getCurrentSize(); i5++) {
                this.variables.add(arrayRow.variables.getVariable(i5), arrayRow.variables.getVariableValue(i5), true);
            }
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
        return this.variable == null && this.constantValue == 0.0f && this.variables.getCurrentSize() == 0;
    }

    public SolverVariable pickPivot(SolverVariable solverVariable) {
        return pickPivotInVariables(null, solverVariable);
    }

    public void pivot(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.variable;
        if (solverVariable2 != null) {
            this.variables.put(solverVariable2, -1.0f);
            this.variable.definitionId = -1;
            this.variable = null;
        }
        float remove = this.variables.remove(solverVariable, true) * (-1.0f);
        this.variable = solverVariable;
        if (remove == 1.0f) {
            return;
        }
        this.constantValue /= remove;
        this.variables.divideByAmount(remove);
    }

    public void reset() {
        this.variable = null;
        this.variables.clear();
        this.constantValue = 0.0f;
        this.isSimpleDefinition = false;
    }

    public int sizeInBytes() {
        return this.variables.sizeInBytes() + (this.variable != null ? 4 : 0) + 4 + 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toReadableString() {
        /*
            r10 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r10.variable
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L16
        L7:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = androidx.activity.d.g(r0)
            androidx.constraintlayout.core.SolverVariable r1 = r10.variable
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L16:
            java.lang.String r1 = " = "
            java.lang.String r0 = androidx.activity.d.f(r0, r1)
            float r1 = r10.constantValue
            r2 = 0
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L33
            java.lang.StringBuilder r0 = androidx.activity.d.g(r0)
            float r1 = r10.constantValue
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            goto L34
        L33:
            r1 = 0
        L34:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r4 = r10.variables
            int r4 = r4.getCurrentSize()
        L3a:
            if (r2 >= r4) goto La3
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r5 = r10.variables
            androidx.constraintlayout.core.SolverVariable r5 = r5.getVariable(r2)
            if (r5 != 0) goto L45
            goto La0
        L45:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r6 = r10.variables
            float r6 = r6.getVariableValue(r2)
            int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r7 != 0) goto L50
            goto La0
        L50:
            java.lang.String r5 = r5.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L63
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r1 >= 0) goto L82
            java.lang.StringBuilder r0 = androidx.activity.d.g(r0)
            java.lang.String r1 = "- "
            goto L79
        L63:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r7 <= 0) goto L71
            java.lang.String r7 = " + "
            java.lang.String r0 = androidx.appcompat.graphics.drawable.a.c(r1, r0, r7)
            goto L82
        L71:
            r1.append(r0)
            java.lang.String r0 = " - "
            r9 = r1
            r1 = r0
            r0 = r9
        L79:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            float r6 = r6 * r8
        L82:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L8e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L9b
        L8e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " "
        L9b:
            java.lang.String r0 = androidx.appcompat.graphics.drawable.a.c(r1, r0, r5)
            r1 = 1
        La0:
            int r2 = r2 + 1
            goto L3a
        La3:
            if (r1 != 0) goto Lab
            java.lang.String r1 = "0.0"
            java.lang.String r0 = androidx.activity.d.f(r0, r1)
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.ArrayRow.toReadableString():java.lang.String");
    }

    public String toString() {
        return toReadableString();
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromFinalVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z4) {
        if (solverVariable == null || !solverVariable.isFinalValue) {
            return;
        }
        float f5 = this.variables.get(solverVariable);
        this.constantValue = (solverVariable.computedValue * f5) + this.constantValue;
        this.variables.remove(solverVariable, z4);
        if (z4) {
            solverVariable.removeFromRow(this);
        }
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
            this.isSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z4) {
        float use = this.variables.use(arrayRow, z4);
        this.constantValue = (arrayRow.constantValue * use) + this.constantValue;
        if (z4) {
            arrayRow.variable.removeFromRow(this);
        }
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.variable != null && this.variables.getCurrentSize() == 0) {
            this.isSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    public void updateFromSynonymVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z4) {
        if (solverVariable == null || !solverVariable.isSynonym) {
            return;
        }
        float f5 = this.variables.get(solverVariable);
        this.constantValue = (solverVariable.synonymDelta * f5) + this.constantValue;
        this.variables.remove(solverVariable, z4);
        if (z4) {
            solverVariable.removeFromRow(this);
        }
        this.variables.add(linearSystem.mCache.mIndexedVariables[solverVariable.synonym], f5, z4);
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
            this.isSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromSystem(LinearSystem linearSystem) {
        if (linearSystem.mRows.length == 0) {
            return;
        }
        boolean z4 = false;
        while (!z4) {
            int currentSize = this.variables.getCurrentSize();
            for (int i5 = 0; i5 < currentSize; i5++) {
                SolverVariable variable = this.variables.getVariable(i5);
                if (variable.definitionId != -1 || variable.isFinalValue || variable.isSynonym) {
                    this.variablesToUpdate.add(variable);
                }
            }
            int size = this.variablesToUpdate.size();
            if (size > 0) {
                for (int i6 = 0; i6 < size; i6++) {
                    SolverVariable solverVariable = this.variablesToUpdate.get(i6);
                    if (solverVariable.isFinalValue) {
                        updateFromFinalVariable(linearSystem, solverVariable, true);
                    } else if (solverVariable.isSynonym) {
                        updateFromSynonymVariable(linearSystem, solverVariable, true);
                    } else {
                        updateFromRow(linearSystem, linearSystem.mRows[solverVariable.definitionId], true);
                    }
                }
                this.variablesToUpdate.clear();
            } else {
                z4 = true;
            }
        }
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.variable != null && this.variables.getCurrentSize() == 0) {
            this.isSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }
}
