package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes24.dex */
public class StepCurve extends Easing {
    private static final boolean DEBUG = false;
    public MonotonicCurveFit mCurveFit;

    public StepCurve(String str) {
        this.str = str;
        double[] dArr = new double[str.length() / 2];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i5 = 0;
        while (indexOf2 != -1) {
            dArr[i5] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i5++;
        }
        dArr[i5] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        this.mCurveFit = genSpline(Arrays.copyOf(dArr, i5 + 1));
    }

    private static MonotonicCurveFit genSpline(String str) {
        String[] split = str.split("\\s+");
        int length = split.length;
        double[] dArr = new double[length];
        for (int i5 = 0; i5 < length; i5++) {
            dArr[i5] = Double.parseDouble(split[i5]);
        }
        return genSpline(dArr);
    }

    private static MonotonicCurveFit genSpline(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d5 = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, length, 1);
        double[] dArr3 = new double[length];
        for (int i5 = 0; i5 < dArr.length; i5++) {
            double d6 = dArr[i5];
            int i6 = i5 + length2;
            dArr2[i6][0] = d6;
            double d7 = i5 * d5;
            dArr3[i6] = d7;
            if (i5 > 0) {
                int i7 = (length2 * 2) + i5;
                dArr2[i7][0] = d6 + 1.0d;
                dArr3[i7] = d7 + 1.0d;
                int i8 = i5 - 1;
                dArr2[i8][0] = (d6 - 1.0d) - d5;
                dArr3[i8] = (d7 - 1.0d) - d5;
            }
        }
        MonotonicCurveFit monotonicCurveFit = new MonotonicCurveFit(dArr3, dArr2);
        PrintStream printStream = System.out;
        StringBuilder g5 = androidx.activity.d.g(" 0 ");
        g5.append(monotonicCurveFit.getPos(0.0d, 0));
        printStream.println(g5.toString());
        PrintStream printStream2 = System.out;
        StringBuilder g6 = androidx.activity.d.g(" 1 ");
        g6.append(monotonicCurveFit.getPos(1.0d, 0));
        printStream2.println(g6.toString());
        return monotonicCurveFit;
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double d5) {
        return this.mCurveFit.getPos(d5, 0);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double d5) {
        return this.mCurveFit.getSlope(d5, 0);
    }
}
