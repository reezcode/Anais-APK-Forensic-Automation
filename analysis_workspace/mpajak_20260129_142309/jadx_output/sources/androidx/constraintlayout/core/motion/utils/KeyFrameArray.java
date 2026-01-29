package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import java.io.PrintStream;
import java.util.Arrays;

/* loaded from: classes19.dex */
public class KeyFrameArray {

    /* loaded from: classes8.dex */
    public static class CustomArray {
        private static final int EMPTY = 999;
        public int count;
        public int[] keys = new int[101];
        public CustomAttribute[] values = new CustomAttribute[101];

        public CustomArray() {
            clear();
        }

        public void append(int i5, CustomAttribute customAttribute) {
            if (this.values[i5] != null) {
                remove(i5);
            }
            this.values[i5] = customAttribute;
            int[] iArr = this.keys;
            int i6 = this.count;
            this.count = i6 + 1;
            iArr[i6] = i5;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.keys, 999);
            Arrays.fill(this.values, (Object) null);
            this.count = 0;
        }

        public void dump() {
            PrintStream printStream = System.out;
            StringBuilder g5 = androidx.activity.d.g("V: ");
            g5.append(Arrays.toString(Arrays.copyOf(this.keys, this.count)));
            printStream.println(g5.toString());
            System.out.print("K: [");
            int i5 = 0;
            while (i5 < this.count) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i5 == 0 ? "" : ", ");
                sb.append(valueAt(i5));
                printStream2.print(sb.toString());
                i5++;
            }
            System.out.println("]");
        }

        public int keyAt(int i5) {
            return this.keys[i5];
        }

        public void remove(int i5) {
            this.values[i5] = null;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int i8 = this.count;
                if (i6 >= i8) {
                    this.count = i8 - 1;
                    return;
                }
                int[] iArr = this.keys;
                if (i5 == iArr[i6]) {
                    iArr[i6] = 999;
                    i7++;
                }
                if (i6 != i7) {
                    iArr[i6] = iArr[i7];
                }
                i7++;
                i6++;
            }
        }

        public int size() {
            return this.count;
        }

        public CustomAttribute valueAt(int i5) {
            return this.values[this.keys[i5]];
        }
    }

    /* loaded from: classes6.dex */
    public static class CustomVar {
        private static final int EMPTY = 999;
        public int count;
        public int[] keys = new int[101];
        public CustomVariable[] values = new CustomVariable[101];

        public CustomVar() {
            clear();
        }

        public void append(int i5, CustomVariable customVariable) {
            if (this.values[i5] != null) {
                remove(i5);
            }
            this.values[i5] = customVariable;
            int[] iArr = this.keys;
            int i6 = this.count;
            this.count = i6 + 1;
            iArr[i6] = i5;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.keys, 999);
            Arrays.fill(this.values, (Object) null);
            this.count = 0;
        }

        public void dump() {
            PrintStream printStream = System.out;
            StringBuilder g5 = androidx.activity.d.g("V: ");
            g5.append(Arrays.toString(Arrays.copyOf(this.keys, this.count)));
            printStream.println(g5.toString());
            System.out.print("K: [");
            int i5 = 0;
            while (i5 < this.count) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i5 == 0 ? "" : ", ");
                sb.append(valueAt(i5));
                printStream2.print(sb.toString());
                i5++;
            }
            System.out.println("]");
        }

        public int keyAt(int i5) {
            return this.keys[i5];
        }

        public void remove(int i5) {
            this.values[i5] = null;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int i8 = this.count;
                if (i6 >= i8) {
                    this.count = i8 - 1;
                    return;
                }
                int[] iArr = this.keys;
                if (i5 == iArr[i6]) {
                    iArr[i6] = 999;
                    i7++;
                }
                if (i6 != i7) {
                    iArr[i6] = iArr[i7];
                }
                i7++;
                i6++;
            }
        }

        public int size() {
            return this.count;
        }

        public CustomVariable valueAt(int i5) {
            return this.values[this.keys[i5]];
        }
    }

    /* loaded from: classes11.dex */
    public static class FloatArray {
        private static final int EMPTY = 999;
        public int count;
        public int[] keys = new int[101];
        public float[][] values = new float[101][];

        public FloatArray() {
            clear();
        }

        public void append(int i5, float[] fArr) {
            if (this.values[i5] != null) {
                remove(i5);
            }
            this.values[i5] = fArr;
            int[] iArr = this.keys;
            int i6 = this.count;
            this.count = i6 + 1;
            iArr[i6] = i5;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.keys, 999);
            Arrays.fill(this.values, (Object) null);
            this.count = 0;
        }

        public void dump() {
            PrintStream printStream = System.out;
            StringBuilder g5 = androidx.activity.d.g("V: ");
            g5.append(Arrays.toString(Arrays.copyOf(this.keys, this.count)));
            printStream.println(g5.toString());
            System.out.print("K: [");
            int i5 = 0;
            while (i5 < this.count) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i5 == 0 ? "" : ", ");
                sb.append(Arrays.toString(valueAt(i5)));
                printStream2.print(sb.toString());
                i5++;
            }
            System.out.println("]");
        }

        public int keyAt(int i5) {
            return this.keys[i5];
        }

        public void remove(int i5) {
            this.values[i5] = null;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int i8 = this.count;
                if (i6 >= i8) {
                    this.count = i8 - 1;
                    return;
                }
                int[] iArr = this.keys;
                if (i5 == iArr[i6]) {
                    iArr[i6] = 999;
                    i7++;
                }
                if (i6 != i7) {
                    iArr[i6] = iArr[i7];
                }
                i7++;
                i6++;
            }
        }

        public int size() {
            return this.count;
        }

        public float[] valueAt(int i5) {
            return this.values[this.keys[i5]];
        }
    }
}
