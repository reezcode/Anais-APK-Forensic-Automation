package androidx.constraintlayout.core;

import androidx.activity.d;
import androidx.activity.result.a;
import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes22.dex */
public class PriorityGoalRow extends ArrayRow {
    private static final boolean DEBUG = false;
    public static final int NOT_FOUND = -1;
    private static final float epsilon = 1.0E-4f;
    private int TABLE_SIZE;
    public GoalVariableAccessor accessor;
    private SolverVariable[] arrayGoals;
    public Cache mCache;
    private int numGoals;
    private SolverVariable[] sortArray;

    public class GoalVariableAccessor {
        public PriorityGoalRow row;
        public SolverVariable variable;

        public GoalVariableAccessor(PriorityGoalRow priorityGoalRow) {
            this.row = priorityGoalRow;
        }

        public void add(SolverVariable solverVariable) {
            for (int i5 = 0; i5 < 9; i5++) {
                float[] fArr = this.variable.goalStrengthVector;
                fArr[i5] = fArr[i5] + solverVariable.goalStrengthVector[i5];
                if (Math.abs(fArr[i5]) < PriorityGoalRow.epsilon) {
                    this.variable.goalStrengthVector[i5] = 0.0f;
                }
            }
        }

        public boolean addToGoal(SolverVariable solverVariable, float f5) {
            boolean z4 = true;
            if (!this.variable.inGoal) {
                for (int i5 = 0; i5 < 9; i5++) {
                    float f6 = solverVariable.goalStrengthVector[i5];
                    if (f6 != 0.0f) {
                        float f7 = f6 * f5;
                        if (Math.abs(f7) < PriorityGoalRow.epsilon) {
                            f7 = 0.0f;
                        }
                        this.variable.goalStrengthVector[i5] = f7;
                    } else {
                        this.variable.goalStrengthVector[i5] = 0.0f;
                    }
                }
                return true;
            }
            for (int i6 = 0; i6 < 9; i6++) {
                float[] fArr = this.variable.goalStrengthVector;
                fArr[i6] = (solverVariable.goalStrengthVector[i6] * f5) + fArr[i6];
                if (Math.abs(fArr[i6]) < PriorityGoalRow.epsilon) {
                    this.variable.goalStrengthVector[i6] = 0.0f;
                } else {
                    z4 = false;
                }
            }
            if (z4) {
                PriorityGoalRow.this.removeGoal(this.variable);
            }
            return false;
        }

        public void init(SolverVariable solverVariable) {
            this.variable = solverVariable;
        }

        public final boolean isNegative() {
            for (int i5 = 8; i5 >= 0; i5--) {
                float f5 = this.variable.goalStrengthVector[i5];
                if (f5 > 0.0f) {
                    return false;
                }
                if (f5 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isNull() {
            for (int i5 = 0; i5 < 9; i5++) {
                if (this.variable.goalStrengthVector[i5] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isSmallerThan(SolverVariable solverVariable) {
            int i5 = 8;
            while (true) {
                if (i5 < 0) {
                    break;
                }
                float f5 = solverVariable.goalStrengthVector[i5];
                float f6 = this.variable.goalStrengthVector[i5];
                if (f6 == f5) {
                    i5--;
                } else if (f6 < f5) {
                    return true;
                }
            }
            return false;
        }

        public void reset() {
            Arrays.fill(this.variable.goalStrengthVector, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.variable != null) {
                for (int i5 = 0; i5 < 9; i5++) {
                    StringBuilder g5 = d.g(str);
                    g5.append(this.variable.goalStrengthVector[i5]);
                    g5.append(" ");
                    str = g5.toString();
                }
            }
            StringBuilder e5 = a.e(str, "] ");
            e5.append(this.variable);
            return e5.toString();
        }
    }

    public PriorityGoalRow(Cache cache) {
        super(cache);
        this.TABLE_SIZE = 128;
        this.arrayGoals = new SolverVariable[128];
        this.sortArray = new SolverVariable[128];
        this.numGoals = 0;
        this.accessor = new GoalVariableAccessor(this);
        this.mCache = cache;
    }

    private final void addToGoal(SolverVariable solverVariable) {
        int i5;
        int i6 = this.numGoals + 1;
        SolverVariable[] solverVariableArr = this.arrayGoals;
        if (i6 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.arrayGoals = solverVariableArr2;
            this.sortArray = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.arrayGoals;
        int i7 = this.numGoals;
        solverVariableArr3[i7] = solverVariable;
        int i8 = i7 + 1;
        this.numGoals = i8;
        if (i8 > 1 && solverVariableArr3[i8 - 1].id > solverVariable.id) {
            int i9 = 0;
            while (true) {
                i5 = this.numGoals;
                if (i9 >= i5) {
                    break;
                }
                this.sortArray[i9] = this.arrayGoals[i9];
                i9++;
            }
            Arrays.sort(this.sortArray, 0, i5, new Comparator<SolverVariable>() { // from class: androidx.constraintlayout.core.PriorityGoalRow.1
                @Override // java.util.Comparator
                public int compare(SolverVariable solverVariable2, SolverVariable solverVariable3) {
                    return solverVariable2.id - solverVariable3.id;
                }
            });
            for (int i10 = 0; i10 < this.numGoals; i10++) {
                this.arrayGoals[i10] = this.sortArray[i10];
            }
        }
        solverVariable.inGoal = true;
        solverVariable.addToRow(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeGoal(SolverVariable solverVariable) {
        int i5 = 0;
        while (i5 < this.numGoals) {
            if (this.arrayGoals[i5] == solverVariable) {
                while (true) {
                    int i6 = this.numGoals;
                    if (i5 >= i6 - 1) {
                        this.numGoals = i6 - 1;
                        solverVariable.inGoal = false;
                        return;
                    } else {
                        SolverVariable[] solverVariableArr = this.arrayGoals;
                        int i7 = i5 + 1;
                        solverVariableArr[i5] = solverVariableArr[i7];
                        i5 = i7;
                    }
                }
            } else {
                i5++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void addError(SolverVariable solverVariable) {
        this.accessor.init(solverVariable);
        this.accessor.reset();
        solverVariable.goalStrengthVector[solverVariable.strength] = 1.0f;
        addToGoal(solverVariable);
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
        this.numGoals = 0;
        this.constantValue = 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr) {
        int i5 = -1;
        for (int i6 = 0; i6 < this.numGoals; i6++) {
            SolverVariable solverVariable = this.arrayGoals[i6];
            if (!zArr[solverVariable.id]) {
                this.accessor.init(solverVariable);
                GoalVariableAccessor goalVariableAccessor = this.accessor;
                if (i5 == -1) {
                    if (!goalVariableAccessor.isNegative()) {
                    }
                    i5 = i6;
                } else {
                    if (!goalVariableAccessor.isSmallerThan(this.arrayGoals[i5])) {
                    }
                    i5 = i6;
                }
            }
        }
        if (i5 == -1) {
            return null;
        }
        return this.arrayGoals[i5];
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
        return this.numGoals == 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public String toString() {
        StringBuilder e5 = a.e("", " goal -> (");
        e5.append(this.constantValue);
        e5.append(") : ");
        String sb = e5.toString();
        for (int i5 = 0; i5 < this.numGoals; i5++) {
            this.accessor.init(this.arrayGoals[i5]);
            StringBuilder g5 = d.g(sb);
            g5.append(this.accessor);
            g5.append(" ");
            sb = g5.toString();
        }
        return sb;
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z4) {
        SolverVariable solverVariable = arrayRow.variable;
        if (solverVariable == null) {
            return;
        }
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.variables;
        int currentSize = arrayRowVariables.getCurrentSize();
        for (int i5 = 0; i5 < currentSize; i5++) {
            SolverVariable variable = arrayRowVariables.getVariable(i5);
            float variableValue = arrayRowVariables.getVariableValue(i5);
            this.accessor.init(variable);
            if (this.accessor.addToGoal(solverVariable, variableValue)) {
                addToGoal(variable);
            }
            this.constantValue = (arrayRow.constantValue * variableValue) + this.constantValue;
        }
        removeGoal(solverVariable);
    }
}
