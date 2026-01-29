package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;
import java.util.Arrays;

/* loaded from: classes20.dex */
public class Easing {
    private static final String ACCELERATE = "cubic(0.4, 0.05, 0.8, 0.7)";
    private static final String ANTICIPATE = "cubic(0.36, 0, 0.66, -0.56)";
    private static final String ANTICIPATE_NAME = "anticipate";
    private static final String DECELERATE = "cubic(0.0, 0.0, 0.2, 0.95)";
    private static final String LINEAR = "cubic(1, 1, 0, 0)";
    private static final String OVERSHOOT = "cubic(0.34, 1.56, 0.64, 1)";
    private static final String OVERSHOOT_NAME = "overshoot";
    private static final String STANDARD = "cubic(0.4, 0.0, 0.2, 1)";
    public String str = "identity";
    public static Easing sDefault = new Easing();
    private static final String STANDARD_NAME = "standard";
    private static final String ACCELERATE_NAME = "accelerate";
    private static final String DECELERATE_NAME = "decelerate";
    private static final String LINEAR_NAME = "linear";
    public static String[] NAMED_EASING = {STANDARD_NAME, ACCELERATE_NAME, DECELERATE_NAME, LINEAR_NAME};

    /* loaded from: classes23.dex */
    public static class CubicEasing extends Easing {
        private static double d_error = 1.0E-4d;
        private static double error = 0.01d;

        /* renamed from: x1, reason: collision with root package name */
        public double f138x1;

        /* renamed from: x2, reason: collision with root package name */
        public double f139x2;

        /* renamed from: y1, reason: collision with root package name */
        public double f140y1;

        /* renamed from: y2, reason: collision with root package name */
        public double f141y2;

        public CubicEasing(double d5, double d6, double d7, double d8) {
            setup(d5, d6, d7, d8);
        }

        public CubicEasing(String str) {
            this.str = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.f138x1 = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i5 = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i5);
            this.f140y1 = Double.parseDouble(str.substring(i5, indexOf3).trim());
            int i6 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i6);
            this.f139x2 = Double.parseDouble(str.substring(i6, indexOf4).trim());
            int i7 = indexOf4 + 1;
            this.f141y2 = Double.parseDouble(str.substring(i7, str.indexOf(41, i7)).trim());
        }

        private double getDiffX(double d5) {
            double d6 = 1.0d - d5;
            double d7 = this.f138x1;
            double d8 = d6 * 3.0d * d6 * d7;
            double d9 = this.f139x2;
            return ((1.0d - d9) * 3.0d * d5 * d5) + ((d9 - d7) * d6 * 6.0d * d5) + d8;
        }

        private double getDiffY(double d5) {
            double d6 = 1.0d - d5;
            double d7 = this.f140y1;
            double d8 = d6 * 3.0d * d6 * d7;
            double d9 = this.f141y2;
            return ((1.0d - d9) * 3.0d * d5 * d5) + ((d9 - d7) * d6 * 6.0d * d5) + d8;
        }

        private double getX(double d5) {
            double d6 = 1.0d - d5;
            double d7 = 3.0d * d6;
            double d8 = d6 * d7 * d5;
            double d9 = d7 * d5 * d5;
            return (this.f139x2 * d9) + (this.f138x1 * d8) + (d5 * d5 * d5);
        }

        private double getY(double d5) {
            double d6 = 1.0d - d5;
            double d7 = 3.0d * d6;
            double d8 = d6 * d7 * d5;
            double d9 = d7 * d5 * d5;
            return (this.f141y2 * d9) + (this.f140y1 * d8) + (d5 * d5 * d5);
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public double get(double d5) {
            if (d5 <= 0.0d) {
                return 0.0d;
            }
            if (d5 >= 1.0d) {
                return 1.0d;
            }
            double d6 = 0.5d;
            double d7 = 0.5d;
            while (d6 > error) {
                d6 *= 0.5d;
                d7 = getX(d7) < d5 ? d7 + d6 : d7 - d6;
            }
            double d8 = d7 - d6;
            double x4 = getX(d8);
            double d9 = d7 + d6;
            double x5 = getX(d9);
            double y4 = getY(d8);
            return (((d5 - x4) * (getY(d9) - y4)) / (x5 - x4)) + y4;
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public double getDiff(double d5) {
            double d6 = 0.5d;
            double d7 = 0.5d;
            while (d6 > d_error) {
                d6 *= 0.5d;
                d7 = getX(d7) < d5 ? d7 + d6 : d7 - d6;
            }
            double d8 = d7 - d6;
            double d9 = d7 + d6;
            return (getY(d9) - getY(d8)) / (getX(d9) - getX(d8));
        }

        public void setup(double d5, double d6, double d7, double d8) {
            this.f138x1 = d5;
            this.f140y1 = d6;
            this.f139x2 = d7;
            this.f141y2 = d8;
        }
    }

    public static Easing getInterpolator(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new CubicEasing(str);
        }
        if (str.startsWith("spline")) {
            return new StepCurve(str);
        }
        if (str.startsWith("Schlick")) {
            return new Schlick(str);
        }
        str.hashCode();
        switch (str) {
            case "accelerate":
                return new CubicEasing(ACCELERATE);
            case "decelerate":
                return new CubicEasing(DECELERATE);
            case "anticipate":
                return new CubicEasing(ANTICIPATE);
            case "linear":
                return new CubicEasing(LINEAR);
            case "overshoot":
                return new CubicEasing(OVERSHOOT);
            case "standard":
                return new CubicEasing(STANDARD);
            default:
                PrintStream printStream = System.err;
                StringBuilder g5 = androidx.activity.d.g("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or ");
                g5.append(Arrays.toString(NAMED_EASING));
                printStream.println(g5.toString());
                return sDefault;
        }
    }

    public double get(double d5) {
        return d5;
    }

    public double getDiff(double d5) {
        return 1.0d;
    }

    public String toString() {
        return this.str;
    }
}
