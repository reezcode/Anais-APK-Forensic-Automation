package androidx.constraintlayout.core;

import androidx.activity.d;
import androidx.appcompat.view.a;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes14.dex */
public class LinearSystem {
    public static long ARRAY_ROW_CREATION = 0;
    public static final boolean DEBUG = false;
    private static final boolean DEBUG_CONSTRAINTS = false;
    public static final boolean FULL_DEBUG = false;
    public static final boolean MEASURE = false;
    public static long OPTIMIZED_ARRAY_ROW_CREATION = 0;
    public static boolean OPTIMIZED_ENGINE = false;
    private static int POOL_SIZE = 1000;
    public static boolean SIMPLIFY_SYNONYMS = true;
    public static boolean SKIP_COLUMNS = true;
    public static boolean USE_BASIC_SYNONYMS = true;
    public static boolean USE_DEPENDENCY_ORDERING = false;
    public static boolean USE_SYNONYMS = true;
    public static Metrics sMetrics;
    public final Cache mCache;
    private Row mGoal;
    public ArrayRow[] mRows;
    private Row mTempGoal;
    public boolean hasSimpleDefinition = false;
    public int mVariablesID = 0;
    private HashMap<String, SolverVariable> mVariables = null;
    private int TABLE_SIZE = 32;
    private int mMaxColumns = 32;
    public boolean graphOptimizer = false;
    public boolean newgraphOptimizer = false;
    private boolean[] mAlreadyTestedCandidates = new boolean[32];
    public int mNumColumns = 1;
    public int mNumRows = 0;
    private int mMaxRows = 32;
    private SolverVariable[] mPoolVariables = new SolverVariable[POOL_SIZE];
    private int mPoolVariablesCount = 0;

    /* loaded from: classes2.dex */
    public interface Row {
        void addError(SolverVariable solverVariable);

        void clear();

        SolverVariable getKey();

        SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr);

        void initFromRow(Row row);

        boolean isEmpty();

        void updateFromFinalVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z4);

        void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z4);

        void updateFromSystem(LinearSystem linearSystem);
    }

    /* loaded from: classes12.dex */
    public class ValuesRow extends ArrayRow {
        public ValuesRow(Cache cache) {
            this.variables = new SolverVariableValues(this, cache);
        }
    }

    public LinearSystem() {
        this.mRows = null;
        this.mRows = new ArrayRow[32];
        releaseRows();
        Cache cache = new Cache();
        this.mCache = cache;
        this.mGoal = new PriorityGoalRow(cache);
        this.mTempGoal = OPTIMIZED_ENGINE ? new ValuesRow(cache) : new ArrayRow(cache);
    }

    private SolverVariable acquireSolverVariable(SolverVariable.Type type, String str) {
        SolverVariable acquire = this.mCache.solverVariablePool.acquire();
        if (acquire == null) {
            acquire = new SolverVariable(type, str);
        } else {
            acquire.reset();
        }
        acquire.setType(type, str);
        int i5 = this.mPoolVariablesCount;
        int i6 = POOL_SIZE;
        if (i5 >= i6) {
            int i7 = i6 * 2;
            POOL_SIZE = i7;
            this.mPoolVariables = (SolverVariable[]) Arrays.copyOf(this.mPoolVariables, i7);
        }
        SolverVariable[] solverVariableArr = this.mPoolVariables;
        int i8 = this.mPoolVariablesCount;
        this.mPoolVariablesCount = i8 + 1;
        solverVariableArr[i8] = acquire;
        return acquire;
    }

    private void addError(ArrayRow arrayRow) {
        arrayRow.addError(this, 0);
    }

    private final void addRow(ArrayRow arrayRow) {
        int i5;
        if (SIMPLIFY_SYNONYMS && arrayRow.isSimpleDefinition) {
            arrayRow.variable.setFinalValue(this, arrayRow.constantValue);
        } else {
            ArrayRow[] arrayRowArr = this.mRows;
            int i6 = this.mNumRows;
            arrayRowArr[i6] = arrayRow;
            SolverVariable solverVariable = arrayRow.variable;
            solverVariable.definitionId = i6;
            this.mNumRows = i6 + 1;
            solverVariable.updateReferencesWithNewDefinition(this, arrayRow);
        }
        if (SIMPLIFY_SYNONYMS && this.hasSimpleDefinition) {
            int i7 = 0;
            while (i7 < this.mNumRows) {
                if (this.mRows[i7] == null) {
                    System.out.println("WTF");
                }
                ArrayRow[] arrayRowArr2 = this.mRows;
                if (arrayRowArr2[i7] != null && arrayRowArr2[i7].isSimpleDefinition) {
                    ArrayRow arrayRow2 = arrayRowArr2[i7];
                    arrayRow2.variable.setFinalValue(this, arrayRow2.constantValue);
                    (OPTIMIZED_ENGINE ? this.mCache.optimizedArrayRowPool : this.mCache.arrayRowPool).release(arrayRow2);
                    this.mRows[i7] = null;
                    int i8 = i7 + 1;
                    int i9 = i8;
                    while (true) {
                        i5 = this.mNumRows;
                        if (i8 >= i5) {
                            break;
                        }
                        ArrayRow[] arrayRowArr3 = this.mRows;
                        int i10 = i8 - 1;
                        arrayRowArr3[i10] = arrayRowArr3[i8];
                        if (arrayRowArr3[i10].variable.definitionId == i8) {
                            arrayRowArr3[i10].variable.definitionId = i10;
                        }
                        i9 = i8;
                        i8++;
                    }
                    if (i9 < i5) {
                        this.mRows[i9] = null;
                    }
                    this.mNumRows = i5 - 1;
                    i7--;
                }
                i7++;
            }
            this.hasSimpleDefinition = false;
        }
    }

    private void addSingleError(ArrayRow arrayRow, int i5) {
        addSingleError(arrayRow, i5, 0);
    }

    private void computeValues() {
        for (int i5 = 0; i5 < this.mNumRows; i5++) {
            ArrayRow arrayRow = this.mRows[i5];
            arrayRow.variable.computedValue = arrayRow.constantValue;
        }
    }

    public static ArrayRow createRowDimensionPercent(LinearSystem linearSystem, SolverVariable solverVariable, SolverVariable solverVariable2, float f5) {
        return linearSystem.createRow().createRowDimensionPercent(solverVariable, solverVariable2, f5);
    }

    private SolverVariable createVariable(String str, SolverVariable.Type type) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.variables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable acquireSolverVariable = acquireSolverVariable(type, null);
        acquireSolverVariable.setName(str);
        int i5 = this.mVariablesID + 1;
        this.mVariablesID = i5;
        this.mNumColumns++;
        acquireSolverVariable.id = i5;
        if (this.mVariables == null) {
            this.mVariables = new HashMap<>();
        }
        this.mVariables.put(str, acquireSolverVariable);
        this.mCache.mIndexedVariables[this.mVariablesID] = acquireSolverVariable;
        return acquireSolverVariable;
    }

    private void displayRows() {
        displaySolverVariables();
        String str = "";
        for (int i5 = 0; i5 < this.mNumRows; i5++) {
            StringBuilder g5 = d.g(str);
            g5.append(this.mRows[i5]);
            str = d.f(g5.toString(), "\n");
        }
        StringBuilder g6 = d.g(str);
        g6.append(this.mGoal);
        g6.append("\n");
        System.out.println(g6.toString());
    }

    private void displaySolverVariables() {
        StringBuilder g5 = d.g("Display Rows (");
        g5.append(this.mNumRows);
        g5.append("x");
        System.out.println(a.h(g5, this.mNumColumns, ")\n"));
    }

    private int enforceBFS(Row row) {
        boolean z4;
        int i5 = 0;
        while (true) {
            if (i5 >= this.mNumRows) {
                z4 = false;
                break;
            }
            ArrayRow[] arrayRowArr = this.mRows;
            if (arrayRowArr[i5].variable.mType != SolverVariable.Type.UNRESTRICTED && arrayRowArr[i5].constantValue < 0.0f) {
                z4 = true;
                break;
            }
            i5++;
        }
        if (!z4) {
            return 0;
        }
        boolean z5 = false;
        int i6 = 0;
        while (!z5) {
            Metrics metrics = sMetrics;
            if (metrics != null) {
                metrics.bfs++;
            }
            i6++;
            float f5 = Float.MAX_VALUE;
            int i7 = -1;
            int i8 = -1;
            int i9 = 0;
            for (int i10 = 0; i10 < this.mNumRows; i10++) {
                ArrayRow arrayRow = this.mRows[i10];
                if (arrayRow.variable.mType != SolverVariable.Type.UNRESTRICTED && !arrayRow.isSimpleDefinition && arrayRow.constantValue < 0.0f) {
                    int i11 = 9;
                    if (SKIP_COLUMNS) {
                        int currentSize = arrayRow.variables.getCurrentSize();
                        int i12 = 0;
                        while (i12 < currentSize) {
                            SolverVariable variable = arrayRow.variables.getVariable(i12);
                            float f6 = arrayRow.variables.get(variable);
                            if (f6 > 0.0f) {
                                int i13 = 0;
                                while (i13 < i11) {
                                    float f7 = variable.strengthVector[i13] / f6;
                                    if ((f7 < f5 && i13 == i9) || i13 > i9) {
                                        i8 = variable.id;
                                        i9 = i13;
                                        i7 = i10;
                                        f5 = f7;
                                    }
                                    i13++;
                                    i11 = 9;
                                }
                            }
                            i12++;
                            i11 = 9;
                        }
                    } else {
                        for (int i14 = 1; i14 < this.mNumColumns; i14++) {
                            SolverVariable solverVariable = this.mCache.mIndexedVariables[i14];
                            float f8 = arrayRow.variables.get(solverVariable);
                            if (f8 > 0.0f) {
                                for (int i15 = 0; i15 < 9; i15++) {
                                    float f9 = solverVariable.strengthVector[i15] / f8;
                                    if ((f9 < f5 && i15 == i9) || i15 > i9) {
                                        i8 = i14;
                                        i9 = i15;
                                        i7 = i10;
                                        f5 = f9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i7 != -1) {
                ArrayRow arrayRow2 = this.mRows[i7];
                arrayRow2.variable.definitionId = -1;
                Metrics metrics2 = sMetrics;
                if (metrics2 != null) {
                    metrics2.pivots++;
                }
                arrayRow2.pivot(this.mCache.mIndexedVariables[i8]);
                SolverVariable solverVariable2 = arrayRow2.variable;
                solverVariable2.definitionId = i7;
                solverVariable2.updateReferencesWithNewDefinition(this, arrayRow2);
            } else {
                z5 = true;
            }
            if (i6 > this.mNumColumns / 2) {
                z5 = true;
            }
        }
        return i6;
    }

    private String getDisplaySize(int i5) {
        int i6 = i5 * 4;
        int i7 = i6 / 1024;
        int i8 = i7 / 1024;
        return i8 > 0 ? d.c("", i8, " Mb") : i7 > 0 ? d.c("", i7, " Kb") : d.c("", i6, " bytes");
    }

    private String getDisplayStrength(int i5) {
        return i5 == 1 ? "LOW" : i5 == 2 ? "MEDIUM" : i5 == 3 ? "HIGH" : i5 == 4 ? "HIGHEST" : i5 == 5 ? "EQUALITY" : i5 == 8 ? "FIXED" : i5 == 6 ? "BARRIER" : "NONE";
    }

    public static Metrics getMetrics() {
        return sMetrics;
    }

    private void increaseTableSize() {
        int i5 = this.TABLE_SIZE * 2;
        this.TABLE_SIZE = i5;
        this.mRows = (ArrayRow[]) Arrays.copyOf(this.mRows, i5);
        Cache cache = this.mCache;
        cache.mIndexedVariables = (SolverVariable[]) Arrays.copyOf(cache.mIndexedVariables, this.TABLE_SIZE);
        int i6 = this.TABLE_SIZE;
        this.mAlreadyTestedCandidates = new boolean[i6];
        this.mMaxColumns = i6;
        this.mMaxRows = i6;
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.tableSizeIncrease++;
            metrics.maxTableSize = Math.max(metrics.maxTableSize, i6);
            Metrics metrics2 = sMetrics;
            metrics2.lastTableSize = metrics2.maxTableSize;
        }
    }

    private final int optimize(Row row, boolean z4) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.optimize++;
        }
        for (int i5 = 0; i5 < this.mNumColumns; i5++) {
            this.mAlreadyTestedCandidates[i5] = false;
        }
        boolean z5 = false;
        int i6 = 0;
        while (!z5) {
            Metrics metrics2 = sMetrics;
            if (metrics2 != null) {
                metrics2.iterations++;
            }
            i6++;
            if (i6 >= this.mNumColumns * 2) {
                return i6;
            }
            if (row.getKey() != null) {
                this.mAlreadyTestedCandidates[row.getKey().id] = true;
            }
            SolverVariable pivotCandidate = row.getPivotCandidate(this, this.mAlreadyTestedCandidates);
            if (pivotCandidate != null) {
                boolean[] zArr = this.mAlreadyTestedCandidates;
                int i7 = pivotCandidate.id;
                if (zArr[i7]) {
                    return i6;
                }
                zArr[i7] = true;
            }
            if (pivotCandidate != null) {
                float f5 = Float.MAX_VALUE;
                int i8 = -1;
                for (int i9 = 0; i9 < this.mNumRows; i9++) {
                    ArrayRow arrayRow = this.mRows[i9];
                    if (arrayRow.variable.mType != SolverVariable.Type.UNRESTRICTED && !arrayRow.isSimpleDefinition && arrayRow.hasVariable(pivotCandidate)) {
                        float f6 = arrayRow.variables.get(pivotCandidate);
                        if (f6 < 0.0f) {
                            float f7 = (-arrayRow.constantValue) / f6;
                            if (f7 < f5) {
                                i8 = i9;
                                f5 = f7;
                            }
                        }
                    }
                }
                if (i8 > -1) {
                    ArrayRow arrayRow2 = this.mRows[i8];
                    arrayRow2.variable.definitionId = -1;
                    Metrics metrics3 = sMetrics;
                    if (metrics3 != null) {
                        metrics3.pivots++;
                    }
                    arrayRow2.pivot(pivotCandidate);
                    SolverVariable solverVariable = arrayRow2.variable;
                    solverVariable.definitionId = i8;
                    solverVariable.updateReferencesWithNewDefinition(this, arrayRow2);
                }
            } else {
                z5 = true;
            }
        }
        return i6;
    }

    private void releaseRows() {
        int i5 = 0;
        if (OPTIMIZED_ENGINE) {
            while (i5 < this.mNumRows) {
                ArrayRow arrayRow = this.mRows[i5];
                if (arrayRow != null) {
                    this.mCache.optimizedArrayRowPool.release(arrayRow);
                }
                this.mRows[i5] = null;
                i5++;
            }
            return;
        }
        while (i5 < this.mNumRows) {
            ArrayRow arrayRow2 = this.mRows[i5];
            if (arrayRow2 != null) {
                this.mCache.arrayRowPool.release(arrayRow2);
            }
            this.mRows[i5] = null;
            i5++;
        }
    }

    public void addCenterPoint(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f5, int i5) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
        SolverVariable createObjectVariable = createObjectVariable(constraintWidget.getAnchor(type));
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
        SolverVariable createObjectVariable2 = createObjectVariable(constraintWidget.getAnchor(type2));
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
        SolverVariable createObjectVariable3 = createObjectVariable(constraintWidget.getAnchor(type3));
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
        SolverVariable createObjectVariable4 = createObjectVariable(constraintWidget.getAnchor(type4));
        SolverVariable createObjectVariable5 = createObjectVariable(constraintWidget2.getAnchor(type));
        SolverVariable createObjectVariable6 = createObjectVariable(constraintWidget2.getAnchor(type2));
        SolverVariable createObjectVariable7 = createObjectVariable(constraintWidget2.getAnchor(type3));
        SolverVariable createObjectVariable8 = createObjectVariable(constraintWidget2.getAnchor(type4));
        ArrayRow createRow = createRow();
        double d5 = f5;
        double d6 = i5;
        createRow.createRowWithAngle(createObjectVariable2, createObjectVariable4, createObjectVariable6, createObjectVariable8, (float) (Math.sin(d5) * d6));
        addConstraint(createRow);
        ArrayRow createRow2 = createRow();
        createRow2.createRowWithAngle(createObjectVariable, createObjectVariable3, createObjectVariable5, createObjectVariable7, (float) (Math.cos(d5) * d6));
        addConstraint(createRow2);
    }

    public void addCentering(SolverVariable solverVariable, SolverVariable solverVariable2, int i5, float f5, SolverVariable solverVariable3, SolverVariable solverVariable4, int i6, int i7) {
        ArrayRow createRow = createRow();
        createRow.createRowCentering(solverVariable, solverVariable2, i5, f5, solverVariable3, solverVariable4, i6);
        if (i7 != 8) {
            createRow.addError(this, i7);
        }
        addConstraint(createRow);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addConstraint(androidx.constraintlayout.core.ArrayRow r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            r1 = 1
            if (r0 == 0) goto L17
            long r3 = r0.constraints
            long r3 = r3 + r1
            r0.constraints = r3
            boolean r3 = r8.isSimpleDefinition
            if (r3 == 0) goto L17
            long r3 = r0.simpleconstraints
            long r3 = r3 + r1
            r0.simpleconstraints = r3
        L17:
            int r0 = r7.mNumRows
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.mMaxRows
            if (r0 >= r4) goto L26
            int r0 = r7.mNumColumns
            int r0 = r0 + r3
            int r4 = r7.mMaxColumns
            if (r0 < r4) goto L29
        L26:
            r7.increaseTableSize()
        L29:
            r0 = 0
            boolean r4 = r8.isSimpleDefinition
            if (r4 != 0) goto L9e
            r8.updateFromSystem(r7)
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L38
            return
        L38:
            r8.ensurePositiveConstant()
            boolean r4 = r8.chooseSubject(r7)
            if (r4 == 0) goto L95
            androidx.constraintlayout.core.SolverVariable r4 = r7.createExtraVariable()
            r8.variable = r4
            int r5 = r7.mNumRows
            r7.addRow(r8)
            int r6 = r7.mNumRows
            int r5 = r5 + r3
            if (r6 != r5) goto L95
            androidx.constraintlayout.core.LinearSystem$Row r0 = r7.mTempGoal
            r0.initFromRow(r8)
            androidx.constraintlayout.core.LinearSystem$Row r0 = r7.mTempGoal
            r7.optimize(r0, r3)
            int r0 = r4.definitionId
            r5 = -1
            if (r0 != r5) goto L96
            androidx.constraintlayout.core.SolverVariable r0 = r8.variable
            if (r0 != r4) goto L76
            androidx.constraintlayout.core.SolverVariable r0 = r8.pickPivot(r4)
            if (r0 == 0) goto L76
            androidx.constraintlayout.core.Metrics r4 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r4 == 0) goto L73
            long r5 = r4.pivots
            long r5 = r5 + r1
            r4.pivots = r5
        L73:
            r8.pivot(r0)
        L76:
            boolean r0 = r8.isSimpleDefinition
            if (r0 != 0) goto L7f
            androidx.constraintlayout.core.SolverVariable r0 = r8.variable
            r0.updateReferencesWithNewDefinition(r7, r8)
        L7f:
            boolean r0 = androidx.constraintlayout.core.LinearSystem.OPTIMIZED_ENGINE
            if (r0 == 0) goto L88
            androidx.constraintlayout.core.Cache r0 = r7.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r0 = r0.optimizedArrayRowPool
            goto L8c
        L88:
            androidx.constraintlayout.core.Cache r0 = r7.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r0 = r0.arrayRowPool
        L8c:
            r0.release(r8)
            int r0 = r7.mNumRows
            int r0 = r0 - r3
            r7.mNumRows = r0
            goto L96
        L95:
            r3 = 0
        L96:
            boolean r0 = r8.hasKeyVariable()
            if (r0 != 0) goto L9d
            return
        L9d:
            r0 = r3
        L9e:
            if (r0 != 0) goto La3
            r7.addRow(r8)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.LinearSystem.addConstraint(androidx.constraintlayout.core.ArrayRow):void");
    }

    public ArrayRow addEquality(SolverVariable solverVariable, SolverVariable solverVariable2, int i5, int i6) {
        if (USE_BASIC_SYNONYMS && i6 == 8 && solverVariable2.isFinalValue && solverVariable.definitionId == -1) {
            solverVariable.setFinalValue(this, solverVariable2.computedValue + i5);
            return null;
        }
        ArrayRow createRow = createRow();
        createRow.createRowEquals(solverVariable, solverVariable2, i5);
        if (i6 != 8) {
            createRow.addError(this, i6);
        }
        addConstraint(createRow);
        return createRow;
    }

    public void addEquality(SolverVariable solverVariable, int i5) {
        ArrayRow createRow;
        if (USE_BASIC_SYNONYMS && solverVariable.definitionId == -1) {
            float f5 = i5;
            solverVariable.setFinalValue(this, f5);
            for (int i6 = 0; i6 < this.mVariablesID + 1; i6++) {
                SolverVariable solverVariable2 = this.mCache.mIndexedVariables[i6];
                if (solverVariable2 != null && solverVariable2.isSynonym && solverVariable2.synonym == solverVariable.id) {
                    solverVariable2.setFinalValue(this, solverVariable2.synonymDelta + f5);
                }
            }
            return;
        }
        int i7 = solverVariable.definitionId;
        if (i7 != -1) {
            ArrayRow arrayRow = this.mRows[i7];
            if (!arrayRow.isSimpleDefinition) {
                if (arrayRow.variables.getCurrentSize() == 0) {
                    arrayRow.isSimpleDefinition = true;
                } else {
                    createRow = createRow();
                    createRow.createRowEquals(solverVariable, i5);
                }
            }
            arrayRow.constantValue = i5;
            return;
        }
        createRow = createRow();
        createRow.createRowDefinition(solverVariable, i5);
        addConstraint(createRow);
    }

    public void addGreaterBarrier(SolverVariable solverVariable, SolverVariable solverVariable2, int i5, boolean z4) {
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowGreaterThan(solverVariable, solverVariable2, createSlackVariable, i5);
        addConstraint(createRow);
    }

    public void addGreaterThan(SolverVariable solverVariable, SolverVariable solverVariable2, int i5, int i6) {
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowGreaterThan(solverVariable, solverVariable2, createSlackVariable, i5);
        if (i6 != 8) {
            addSingleError(createRow, (int) (createRow.variables.get(createSlackVariable) * (-1.0f)), i6);
        }
        addConstraint(createRow);
    }

    public void addLowerBarrier(SolverVariable solverVariable, SolverVariable solverVariable2, int i5, boolean z4) {
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowLowerThan(solverVariable, solverVariable2, createSlackVariable, i5);
        addConstraint(createRow);
    }

    public void addLowerThan(SolverVariable solverVariable, SolverVariable solverVariable2, int i5, int i6) {
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowLowerThan(solverVariable, solverVariable2, createSlackVariable, i5);
        if (i6 != 8) {
            addSingleError(createRow, (int) (createRow.variables.get(createSlackVariable) * (-1.0f)), i6);
        }
        addConstraint(createRow);
    }

    public void addRatio(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f5, int i5) {
        ArrayRow createRow = createRow();
        createRow.createRowDimensionRatio(solverVariable, solverVariable2, solverVariable3, solverVariable4, f5);
        if (i5 != 8) {
            createRow.addError(this, i5);
        }
        addConstraint(createRow);
    }

    public void addSingleError(ArrayRow arrayRow, int i5, int i6) {
        arrayRow.addSingleError(createErrorVariable(i6, null), i5);
    }

    public void addSynonym(SolverVariable solverVariable, SolverVariable solverVariable2, int i5) {
        if (solverVariable.definitionId != -1 || i5 != 0) {
            addEquality(solverVariable, solverVariable2, i5, 8);
            return;
        }
        if (solverVariable2.isSynonym) {
            solverVariable2 = this.mCache.mIndexedVariables[solverVariable2.synonym];
        }
        if (solverVariable.isSynonym) {
            SolverVariable solverVariable3 = this.mCache.mIndexedVariables[solverVariable.synonym];
        } else {
            solverVariable.setSynonym(this, solverVariable2, 0.0f);
        }
    }

    public final void cleanupRows() {
        int i5;
        int i6 = 0;
        while (i6 < this.mNumRows) {
            ArrayRow arrayRow = this.mRows[i6];
            if (arrayRow.variables.getCurrentSize() == 0) {
                arrayRow.isSimpleDefinition = true;
            }
            if (arrayRow.isSimpleDefinition) {
                SolverVariable solverVariable = arrayRow.variable;
                solverVariable.computedValue = arrayRow.constantValue;
                solverVariable.removeFromRow(arrayRow);
                int i7 = i6;
                while (true) {
                    i5 = this.mNumRows;
                    if (i7 >= i5 - 1) {
                        break;
                    }
                    ArrayRow[] arrayRowArr = this.mRows;
                    int i8 = i7 + 1;
                    arrayRowArr[i7] = arrayRowArr[i8];
                    i7 = i8;
                }
                this.mRows[i5 - 1] = null;
                this.mNumRows = i5 - 1;
                i6--;
                (OPTIMIZED_ENGINE ? this.mCache.optimizedArrayRowPool : this.mCache.arrayRowPool).release(arrayRow);
            }
            i6++;
        }
    }

    public SolverVariable createErrorVariable(int i5, String str) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.errors++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable acquireSolverVariable = acquireSolverVariable(SolverVariable.Type.ERROR, str);
        int i6 = this.mVariablesID + 1;
        this.mVariablesID = i6;
        this.mNumColumns++;
        acquireSolverVariable.id = i6;
        acquireSolverVariable.strength = i5;
        this.mCache.mIndexedVariables[i6] = acquireSolverVariable;
        this.mGoal.addError(acquireSolverVariable);
        return acquireSolverVariable;
    }

    public SolverVariable createExtraVariable() {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.extravariables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable acquireSolverVariable = acquireSolverVariable(SolverVariable.Type.SLACK, null);
        int i5 = this.mVariablesID + 1;
        this.mVariablesID = i5;
        this.mNumColumns++;
        acquireSolverVariable.id = i5;
        this.mCache.mIndexedVariables[i5] = acquireSolverVariable;
        return acquireSolverVariable;
    }

    public SolverVariable createObjectVariable(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.getSolverVariable();
            if (solverVariable == null) {
                constraintAnchor.resetSolverVariable(this.mCache);
                solverVariable = constraintAnchor.getSolverVariable();
            }
            int i5 = solverVariable.id;
            if (i5 == -1 || i5 > this.mVariablesID || this.mCache.mIndexedVariables[i5] == null) {
                if (i5 != -1) {
                    solverVariable.reset();
                }
                int i6 = this.mVariablesID + 1;
                this.mVariablesID = i6;
                this.mNumColumns++;
                solverVariable.id = i6;
                solverVariable.mType = SolverVariable.Type.UNRESTRICTED;
                this.mCache.mIndexedVariables[i6] = solverVariable;
            }
        }
        return solverVariable;
    }

    public ArrayRow createRow() {
        ArrayRow acquire;
        if (OPTIMIZED_ENGINE) {
            acquire = this.mCache.optimizedArrayRowPool.acquire();
            if (acquire == null) {
                acquire = new ValuesRow(this.mCache);
                OPTIMIZED_ARRAY_ROW_CREATION++;
            }
            acquire.reset();
        } else {
            acquire = this.mCache.arrayRowPool.acquire();
            if (acquire == null) {
                acquire = new ArrayRow(this.mCache);
                ARRAY_ROW_CREATION++;
            }
            acquire.reset();
        }
        SolverVariable.increaseErrorId();
        return acquire;
    }

    public SolverVariable createSlackVariable() {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.slackvariables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable acquireSolverVariable = acquireSolverVariable(SolverVariable.Type.SLACK, null);
        int i5 = this.mVariablesID + 1;
        this.mVariablesID = i5;
        this.mNumColumns++;
        acquireSolverVariable.id = i5;
        this.mCache.mIndexedVariables[i5] = acquireSolverVariable;
        return acquireSolverVariable;
    }

    public void displayReadableRows() {
        displaySolverVariables();
        String h5 = a.h(d.g(" num vars "), this.mVariablesID, "\n");
        for (int i5 = 0; i5 < this.mVariablesID + 1; i5++) {
            SolverVariable solverVariable = this.mCache.mIndexedVariables[i5];
            if (solverVariable != null && solverVariable.isFinalValue) {
                h5 = h5 + " $[" + i5 + "] => " + solverVariable + " = " + solverVariable.computedValue + "\n";
            }
        }
        String f5 = d.f(h5, "\n");
        for (int i6 = 0; i6 < this.mVariablesID + 1; i6++) {
            SolverVariable[] solverVariableArr = this.mCache.mIndexedVariables;
            SolverVariable solverVariable2 = solverVariableArr[i6];
            if (solverVariable2 != null && solverVariable2.isSynonym) {
                f5 = f5 + " ~[" + i6 + "] => " + solverVariable2 + " = " + solverVariableArr[solverVariable2.synonym] + " + " + solverVariable2.synonymDelta + "\n";
            }
        }
        String f6 = d.f(f5, "\n\n #  ");
        for (int i7 = 0; i7 < this.mNumRows; i7++) {
            StringBuilder g5 = d.g(f6);
            g5.append(this.mRows[i7].toReadableString());
            f6 = d.f(g5.toString(), "\n #  ");
        }
        if (this.mGoal != null) {
            StringBuilder e5 = androidx.activity.result.a.e(f6, "Goal: ");
            e5.append(this.mGoal);
            e5.append("\n");
            f6 = e5.toString();
        }
        System.out.println(f6);
    }

    public void displaySystemInformation() {
        int i5 = 0;
        for (int i6 = 0; i6 < this.TABLE_SIZE; i6++) {
            ArrayRow[] arrayRowArr = this.mRows;
            if (arrayRowArr[i6] != null) {
                i5 = arrayRowArr[i6].sizeInBytes() + i5;
            }
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.mNumRows; i8++) {
            ArrayRow[] arrayRowArr2 = this.mRows;
            if (arrayRowArr2[i8] != null) {
                i7 = arrayRowArr2[i8].sizeInBytes() + i7;
            }
        }
        PrintStream printStream = System.out;
        StringBuilder g5 = d.g("Linear System -> Table size: ");
        g5.append(this.TABLE_SIZE);
        g5.append(" (");
        int i9 = this.TABLE_SIZE;
        g5.append(getDisplaySize(i9 * i9));
        g5.append(") -- row sizes: ");
        g5.append(getDisplaySize(i5));
        g5.append(", actual size: ");
        g5.append(getDisplaySize(i7));
        g5.append(" rows: ");
        g5.append(this.mNumRows);
        g5.append("/");
        g5.append(this.mMaxRows);
        g5.append(" cols: ");
        g5.append(this.mNumColumns);
        g5.append("/");
        g5.append(this.mMaxColumns);
        g5.append(" ");
        g5.append(0);
        g5.append(" occupied cells, ");
        g5.append(getDisplaySize(0));
        printStream.println(g5.toString());
    }

    public void displayVariablesReadableRows() {
        displaySolverVariables();
        String str = "";
        for (int i5 = 0; i5 < this.mNumRows; i5++) {
            if (this.mRows[i5].variable.mType == SolverVariable.Type.UNRESTRICTED) {
                StringBuilder g5 = d.g(str);
                g5.append(this.mRows[i5].toReadableString());
                str = d.f(g5.toString(), "\n");
            }
        }
        StringBuilder g6 = d.g(str);
        g6.append(this.mGoal);
        g6.append("\n");
        System.out.println(g6.toString());
    }

    public void fillMetrics(Metrics metrics) {
        sMetrics = metrics;
    }

    public Cache getCache() {
        return this.mCache;
    }

    public Row getGoal() {
        return this.mGoal;
    }

    public int getMemoryUsed() {
        int i5 = 0;
        for (int i6 = 0; i6 < this.mNumRows; i6++) {
            ArrayRow[] arrayRowArr = this.mRows;
            if (arrayRowArr[i6] != null) {
                i5 = arrayRowArr[i6].sizeInBytes() + i5;
            }
        }
        return i5;
    }

    public int getNumEquations() {
        return this.mNumRows;
    }

    public int getNumVariables() {
        return this.mVariablesID;
    }

    public int getObjectVariableValue(Object obj) {
        SolverVariable solverVariable = ((ConstraintAnchor) obj).getSolverVariable();
        if (solverVariable != null) {
            return (int) (solverVariable.computedValue + 0.5f);
        }
        return 0;
    }

    public ArrayRow getRow(int i5) {
        return this.mRows[i5];
    }

    public float getValueFor(String str) {
        SolverVariable variable = getVariable(str, SolverVariable.Type.UNRESTRICTED);
        if (variable == null) {
            return 0.0f;
        }
        return variable.computedValue;
    }

    public SolverVariable getVariable(String str, SolverVariable.Type type) {
        if (this.mVariables == null) {
            this.mVariables = new HashMap<>();
        }
        SolverVariable solverVariable = this.mVariables.get(str);
        return solverVariable == null ? createVariable(str, type) : solverVariable;
    }

    public void minimize() {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.minimize++;
        }
        if (this.mGoal.isEmpty()) {
            computeValues();
            return;
        }
        if (this.graphOptimizer || this.newgraphOptimizer) {
            Metrics metrics2 = sMetrics;
            if (metrics2 != null) {
                metrics2.graphOptimizer++;
            }
            boolean z4 = false;
            int i5 = 0;
            while (true) {
                if (i5 >= this.mNumRows) {
                    z4 = true;
                    break;
                } else if (!this.mRows[i5].isSimpleDefinition) {
                    break;
                } else {
                    i5++;
                }
            }
            if (z4) {
                Metrics metrics3 = sMetrics;
                if (metrics3 != null) {
                    metrics3.fullySolved++;
                }
                computeValues();
                return;
            }
        }
        minimizeGoal(this.mGoal);
    }

    public void minimizeGoal(Row row) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.minimizeGoal++;
            metrics.maxVariables = Math.max(metrics.maxVariables, this.mNumColumns);
            Metrics metrics2 = sMetrics;
            metrics2.maxRows = Math.max(metrics2.maxRows, this.mNumRows);
        }
        enforceBFS(row);
        optimize(row, false);
        computeValues();
    }

    public void removeRow(ArrayRow arrayRow) {
        SolverVariable solverVariable;
        int i5;
        if (!arrayRow.isSimpleDefinition || (solverVariable = arrayRow.variable) == null) {
            return;
        }
        int i6 = solverVariable.definitionId;
        if (i6 != -1) {
            while (true) {
                i5 = this.mNumRows;
                if (i6 >= i5 - 1) {
                    break;
                }
                ArrayRow[] arrayRowArr = this.mRows;
                int i7 = i6 + 1;
                SolverVariable solverVariable2 = arrayRowArr[i7].variable;
                if (solverVariable2.definitionId == i7) {
                    solverVariable2.definitionId = i6;
                }
                arrayRowArr[i6] = arrayRowArr[i7];
                i6 = i7;
            }
            this.mNumRows = i5 - 1;
        }
        SolverVariable solverVariable3 = arrayRow.variable;
        if (!solverVariable3.isFinalValue) {
            solverVariable3.setFinalValue(this, arrayRow.constantValue);
        }
        (OPTIMIZED_ENGINE ? this.mCache.optimizedArrayRowPool : this.mCache.arrayRowPool).release(arrayRow);
    }

    public void reset() {
        Cache cache;
        int i5 = 0;
        while (true) {
            cache = this.mCache;
            SolverVariable[] solverVariableArr = cache.mIndexedVariables;
            if (i5 >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i5];
            if (solverVariable != null) {
                solverVariable.reset();
            }
            i5++;
        }
        cache.solverVariablePool.releaseAll(this.mPoolVariables, this.mPoolVariablesCount);
        this.mPoolVariablesCount = 0;
        Arrays.fill(this.mCache.mIndexedVariables, (Object) null);
        HashMap<String, SolverVariable> hashMap = this.mVariables;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.mVariablesID = 0;
        this.mGoal.clear();
        this.mNumColumns = 1;
        for (int i6 = 0; i6 < this.mNumRows; i6++) {
            ArrayRow[] arrayRowArr = this.mRows;
            if (arrayRowArr[i6] != null) {
                arrayRowArr[i6].used = false;
            }
        }
        releaseRows();
        this.mNumRows = 0;
        this.mTempGoal = OPTIMIZED_ENGINE ? new ValuesRow(this.mCache) : new ArrayRow(this.mCache);
    }
}
