package androidx.constraintlayout.core;

import androidx.activity.d;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes20.dex */
public class SolverVariable implements Comparable<SolverVariable> {
    private static final boolean INTERNAL_DEBUG = false;
    public static final int MAX_STRENGTH = 9;
    public static final int STRENGTH_BARRIER = 6;
    public static final int STRENGTH_CENTERING = 7;
    public static final int STRENGTH_EQUALITY = 5;
    public static final int STRENGTH_FIXED = 8;
    public static final int STRENGTH_HIGH = 3;
    public static final int STRENGTH_HIGHEST = 4;
    public static final int STRENGTH_LOW = 1;
    public static final int STRENGTH_MEDIUM = 2;
    public static final int STRENGTH_NONE = 0;
    private static final boolean VAR_USE_HASH = false;
    private static int uniqueConstantId = 1;
    private static int uniqueErrorId = 1;
    private static int uniqueId = 1;
    private static int uniqueSlackId = 1;
    private static int uniqueUnrestrictedId = 1;
    public float computedValue;
    public int definitionId;
    public float[] goalStrengthVector;
    public int id;
    public boolean inGoal;
    public HashSet<ArrayRow> inRows;
    public boolean isFinalValue;
    public boolean isSynonym;
    public ArrayRow[] mClientEquations;
    public int mClientEquationsCount;
    private String mName;
    public Type mType;
    public int strength;
    public float[] strengthVector;
    public int synonym;
    public float synonymDelta;
    public int usageInRowCount;

    /* renamed from: androidx.constraintlayout.core.SolverVariable$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$SolverVariable$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$androidx$constraintlayout$core$SolverVariable$Type = iArr;
            try {
                iArr[Type.UNRESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$SolverVariable$Type[Type.CONSTANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$SolverVariable$Type[Type.SLACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$SolverVariable$Type[Type.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$SolverVariable$Type[Type.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes25.dex */
    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type, String str) {
        this.id = -1;
        this.definitionId = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.strengthVector = new float[9];
        this.goalStrengthVector = new float[9];
        this.mClientEquations = new ArrayRow[16];
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.isSynonym = false;
        this.synonym = -1;
        this.synonymDelta = 0.0f;
        this.inRows = null;
        this.mType = type;
    }

    public SolverVariable(String str, Type type) {
        this.id = -1;
        this.definitionId = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.strengthVector = new float[9];
        this.goalStrengthVector = new float[9];
        this.mClientEquations = new ArrayRow[16];
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.isSynonym = false;
        this.synonym = -1;
        this.synonymDelta = 0.0f;
        this.inRows = null;
        this.mName = str;
        this.mType = type;
    }

    private static String getUniqueName(Type type, String str) {
        StringBuilder g5;
        int i5;
        if (str != null) {
            g5 = d.g(str);
            i5 = uniqueErrorId;
        } else {
            int i6 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$SolverVariable$Type[type.ordinal()];
            if (i6 == 1) {
                g5 = d.g("U");
                i5 = uniqueUnrestrictedId + 1;
                uniqueUnrestrictedId = i5;
            } else if (i6 == 2) {
                g5 = d.g("C");
                i5 = uniqueConstantId + 1;
                uniqueConstantId = i5;
            } else if (i6 == 3) {
                g5 = d.g(ExifInterface.LATITUDE_SOUTH);
                i5 = uniqueSlackId + 1;
                uniqueSlackId = i5;
            } else if (i6 == 4) {
                g5 = d.g("e");
                i5 = uniqueErrorId + 1;
                uniqueErrorId = i5;
            } else {
                if (i6 != 5) {
                    throw new AssertionError(type.name());
                }
                g5 = d.g(ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
                i5 = uniqueId + 1;
                uniqueId = i5;
            }
        }
        g5.append(i5);
        return g5.toString();
    }

    public static void increaseErrorId() {
        uniqueErrorId++;
    }

    public final void addToRow(ArrayRow arrayRow) {
        int i5 = 0;
        while (true) {
            int i6 = this.mClientEquationsCount;
            if (i5 >= i6) {
                ArrayRow[] arrayRowArr = this.mClientEquations;
                if (i6 >= arrayRowArr.length) {
                    this.mClientEquations = (ArrayRow[]) Arrays.copyOf(arrayRowArr, arrayRowArr.length * 2);
                }
                ArrayRow[] arrayRowArr2 = this.mClientEquations;
                int i7 = this.mClientEquationsCount;
                arrayRowArr2[i7] = arrayRow;
                this.mClientEquationsCount = i7 + 1;
                return;
            }
            if (this.mClientEquations[i5] == arrayRow) {
                return;
            } else {
                i5++;
            }
        }
    }

    public void clearStrengths() {
        for (int i5 = 0; i5 < 9; i5++) {
            this.strengthVector[i5] = 0.0f;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(SolverVariable solverVariable) {
        return this.id - solverVariable.id;
    }

    public String getName() {
        return this.mName;
    }

    public final void removeFromRow(ArrayRow arrayRow) {
        int i5 = this.mClientEquationsCount;
        int i6 = 0;
        while (i6 < i5) {
            if (this.mClientEquations[i6] == arrayRow) {
                while (i6 < i5 - 1) {
                    ArrayRow[] arrayRowArr = this.mClientEquations;
                    int i7 = i6 + 1;
                    arrayRowArr[i6] = arrayRowArr[i7];
                    i6 = i7;
                }
                this.mClientEquationsCount--;
                return;
            }
            i6++;
        }
    }

    public void reset() {
        this.mName = null;
        this.mType = Type.UNKNOWN;
        this.strength = 0;
        this.id = -1;
        this.definitionId = -1;
        this.computedValue = 0.0f;
        this.isFinalValue = false;
        this.isSynonym = false;
        this.synonym = -1;
        this.synonymDelta = 0.0f;
        int i5 = this.mClientEquationsCount;
        for (int i6 = 0; i6 < i5; i6++) {
            this.mClientEquations[i6] = null;
        }
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.inGoal = false;
        Arrays.fill(this.goalStrengthVector, 0.0f);
    }

    public void setFinalValue(LinearSystem linearSystem, float f5) {
        this.computedValue = f5;
        this.isFinalValue = true;
        this.isSynonym = false;
        this.synonym = -1;
        this.synonymDelta = 0.0f;
        int i5 = this.mClientEquationsCount;
        this.definitionId = -1;
        for (int i6 = 0; i6 < i5; i6++) {
            this.mClientEquations[i6].updateFromFinalVariable(linearSystem, this, false);
        }
        this.mClientEquationsCount = 0;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setSynonym(LinearSystem linearSystem, SolverVariable solverVariable, float f5) {
        this.isSynonym = true;
        this.synonym = solverVariable.id;
        this.synonymDelta = f5;
        int i5 = this.mClientEquationsCount;
        this.definitionId = -1;
        for (int i6 = 0; i6 < i5; i6++) {
            this.mClientEquations[i6].updateFromSynonymVariable(linearSystem, this, false);
        }
        this.mClientEquationsCount = 0;
        linearSystem.displayReadableRows();
    }

    public void setType(Type type, String str) {
        this.mType = type;
    }

    public String strengthsToString() {
        StringBuilder g5;
        String str;
        String str2 = this + "[";
        boolean z4 = false;
        boolean z5 = true;
        for (int i5 = 0; i5 < this.strengthVector.length; i5++) {
            StringBuilder g6 = d.g(str2);
            g6.append(this.strengthVector[i5]);
            String sb = g6.toString();
            float[] fArr = this.strengthVector;
            if (fArr[i5] > 0.0f) {
                z4 = false;
            } else if (fArr[i5] < 0.0f) {
                z4 = true;
            }
            if (fArr[i5] != 0.0f) {
                z5 = false;
            }
            if (i5 < fArr.length - 1) {
                g5 = d.g(sb);
                str = ", ";
            } else {
                g5 = d.g(sb);
                str = "] ";
            }
            g5.append(str);
            str2 = g5.toString();
        }
        if (z4) {
            str2 = d.f(str2, " (-)");
        }
        return z5 ? d.f(str2, " (*)") : str2;
    }

    public String toString() {
        StringBuilder g5;
        if (this.mName != null) {
            g5 = d.g("");
            g5.append(this.mName);
        } else {
            g5 = d.g("");
            g5.append(this.id);
        }
        return g5.toString();
    }

    public final void updateReferencesWithNewDefinition(LinearSystem linearSystem, ArrayRow arrayRow) {
        int i5 = this.mClientEquationsCount;
        for (int i6 = 0; i6 < i5; i6++) {
            this.mClientEquations[i6].updateFromRow(linearSystem, arrayRow, false);
        }
        this.mClientEquationsCount = 0;
    }
}
