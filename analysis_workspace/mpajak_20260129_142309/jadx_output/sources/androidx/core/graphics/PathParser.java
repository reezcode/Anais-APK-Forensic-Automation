package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import androidx.activity.d;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.a;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public class PathParser {
    private static final String LOGTAG = "PathParser";

    /* loaded from: classes23.dex */
    public static class ExtractFloatResult {
        public int mEndPosition;
        public boolean mEndWithNegOrDot;
    }

    /* loaded from: classes11.dex */
    public static class PathDataNode {
        public float[] mParams;
        public char mType;

        public PathDataNode(char c5, float[] fArr) {
            this.mType = c5;
            this.mParams = fArr;
        }

        public PathDataNode(PathDataNode pathDataNode) {
            this.mType = pathDataNode.mType;
            float[] fArr = pathDataNode.mParams;
            this.mParams = PathParser.copyOfRange(fArr, 0, fArr.length);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private static void addCommand(Path path, float[] fArr, char c5, char c6, float[] fArr2) {
            int i5;
            int i6;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            char c7 = c6;
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[2];
            float f16 = fArr[3];
            float f17 = fArr[4];
            float f18 = fArr[5];
            switch (c7) {
                case 'A':
                case 'a':
                    i5 = 7;
                    break;
                case 'C':
                case 'c':
                    i5 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i5 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i5 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i5 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f17, f18);
                    f13 = f17;
                    f15 = f13;
                    f14 = f18;
                    f16 = f14;
                    i5 = 2;
                    break;
            }
            float f19 = f13;
            float f20 = f14;
            float f21 = f17;
            float f22 = f18;
            int i7 = 0;
            char c8 = c5;
            while (i7 < fArr2.length) {
                if (c7 != 'A') {
                    if (c7 == 'C') {
                        i6 = i7;
                        int i8 = i6 + 2;
                        int i9 = i6 + 3;
                        int i10 = i6 + 4;
                        int i11 = i6 + 5;
                        path.cubicTo(fArr2[i6 + 0], fArr2[i6 + 1], fArr2[i8], fArr2[i9], fArr2[i10], fArr2[i11]);
                        f19 = fArr2[i10];
                        float f23 = fArr2[i11];
                        float f24 = fArr2[i8];
                        float f25 = fArr2[i9];
                        f20 = f23;
                        f16 = f25;
                        f15 = f24;
                    } else if (c7 == 'H') {
                        i6 = i7;
                        int i12 = i6 + 0;
                        path.lineTo(fArr2[i12], f20);
                        f19 = fArr2[i12];
                    } else if (c7 == 'Q') {
                        i6 = i7;
                        int i13 = i6 + 0;
                        int i14 = i6 + 1;
                        int i15 = i6 + 2;
                        int i16 = i6 + 3;
                        path.quadTo(fArr2[i13], fArr2[i14], fArr2[i15], fArr2[i16]);
                        float f26 = fArr2[i13];
                        float f27 = fArr2[i14];
                        f19 = fArr2[i15];
                        f20 = fArr2[i16];
                        f15 = f26;
                        f16 = f27;
                    } else if (c7 == 'V') {
                        i6 = i7;
                        int i17 = i6 + 0;
                        path.lineTo(f19, fArr2[i17]);
                        f20 = fArr2[i17];
                    } else if (c7 != 'a') {
                        if (c7 != 'c') {
                            if (c7 == 'h') {
                                int i18 = i7 + 0;
                                path.rLineTo(fArr2[i18], 0.0f);
                                f19 += fArr2[i18];
                            } else if (c7 != 'q') {
                                if (c7 == 'v') {
                                    int i19 = i7 + 0;
                                    path.rLineTo(0.0f, fArr2[i19]);
                                    f8 = fArr2[i19];
                                } else if (c7 == 'L') {
                                    int i20 = i7 + 0;
                                    int i21 = i7 + 1;
                                    path.lineTo(fArr2[i20], fArr2[i21]);
                                    f19 = fArr2[i20];
                                    f20 = fArr2[i21];
                                } else if (c7 == 'M') {
                                    int i22 = i7 + 0;
                                    f19 = fArr2[i22];
                                    int i23 = i7 + 1;
                                    f20 = fArr2[i23];
                                    if (i7 > 0) {
                                        path.lineTo(fArr2[i22], fArr2[i23]);
                                    } else {
                                        path.moveTo(fArr2[i22], fArr2[i23]);
                                        i6 = i7;
                                        f22 = f20;
                                        f21 = f19;
                                    }
                                } else if (c7 == 'S') {
                                    if (c8 == 'c' || c8 == 's' || c8 == 'C' || c8 == 'S') {
                                        f19 = (f19 * 2.0f) - f15;
                                        f20 = (f20 * 2.0f) - f16;
                                    }
                                    float f28 = f20;
                                    int i24 = i7 + 0;
                                    int i25 = i7 + 1;
                                    int i26 = i7 + 2;
                                    int i27 = i7 + 3;
                                    path.cubicTo(f19, f28, fArr2[i24], fArr2[i25], fArr2[i26], fArr2[i27]);
                                    f5 = fArr2[i24];
                                    f6 = fArr2[i25];
                                    f19 = fArr2[i26];
                                    f20 = fArr2[i27];
                                    f15 = f5;
                                    f16 = f6;
                                } else if (c7 == 'T') {
                                    if (c8 == 'q' || c8 == 't' || c8 == 'Q' || c8 == 'T') {
                                        f19 = (f19 * 2.0f) - f15;
                                        f20 = (f20 * 2.0f) - f16;
                                    }
                                    int i28 = i7 + 0;
                                    int i29 = i7 + 1;
                                    path.quadTo(f19, f20, fArr2[i28], fArr2[i29]);
                                    float f29 = fArr2[i28];
                                    float f30 = fArr2[i29];
                                    i6 = i7;
                                    f16 = f20;
                                    f15 = f19;
                                    f19 = f29;
                                    f20 = f30;
                                } else if (c7 == 'l') {
                                    int i30 = i7 + 0;
                                    int i31 = i7 + 1;
                                    path.rLineTo(fArr2[i30], fArr2[i31]);
                                    f19 += fArr2[i30];
                                    f8 = fArr2[i31];
                                } else if (c7 == 'm') {
                                    int i32 = i7 + 0;
                                    f19 += fArr2[i32];
                                    int i33 = i7 + 1;
                                    f20 += fArr2[i33];
                                    if (i7 > 0) {
                                        path.rLineTo(fArr2[i32], fArr2[i33]);
                                    } else {
                                        path.rMoveTo(fArr2[i32], fArr2[i33]);
                                        i6 = i7;
                                        f22 = f20;
                                        f21 = f19;
                                    }
                                } else if (c7 == 's') {
                                    if (c8 == 'c' || c8 == 's' || c8 == 'C' || c8 == 'S') {
                                        float f31 = f19 - f15;
                                        f9 = f20 - f16;
                                        f10 = f31;
                                    } else {
                                        f10 = 0.0f;
                                        f9 = 0.0f;
                                    }
                                    int i34 = i7 + 0;
                                    int i35 = i7 + 1;
                                    int i36 = i7 + 2;
                                    int i37 = i7 + 3;
                                    path.rCubicTo(f10, f9, fArr2[i34], fArr2[i35], fArr2[i36], fArr2[i37]);
                                    f5 = fArr2[i34] + f19;
                                    f6 = fArr2[i35] + f20;
                                    f19 += fArr2[i36];
                                    f7 = fArr2[i37];
                                } else if (c7 == 't') {
                                    if (c8 == 'q' || c8 == 't' || c8 == 'Q' || c8 == 'T') {
                                        f11 = f19 - f15;
                                        f12 = f20 - f16;
                                    } else {
                                        f12 = 0.0f;
                                        f11 = 0.0f;
                                    }
                                    int i38 = i7 + 0;
                                    int i39 = i7 + 1;
                                    path.rQuadTo(f11, f12, fArr2[i38], fArr2[i39]);
                                    float f32 = f11 + f19;
                                    float f33 = f12 + f20;
                                    f19 += fArr2[i38];
                                    f20 += fArr2[i39];
                                    f16 = f33;
                                    f15 = f32;
                                }
                                f20 += f8;
                            } else {
                                int i40 = i7 + 0;
                                int i41 = i7 + 1;
                                int i42 = i7 + 2;
                                int i43 = i7 + 3;
                                path.rQuadTo(fArr2[i40], fArr2[i41], fArr2[i42], fArr2[i43]);
                                f5 = fArr2[i40] + f19;
                                f6 = fArr2[i41] + f20;
                                f19 += fArr2[i42];
                                f7 = fArr2[i43];
                            }
                            i6 = i7;
                        } else {
                            int i44 = i7 + 2;
                            int i45 = i7 + 3;
                            int i46 = i7 + 4;
                            int i47 = i7 + 5;
                            path.rCubicTo(fArr2[i7 + 0], fArr2[i7 + 1], fArr2[i44], fArr2[i45], fArr2[i46], fArr2[i47]);
                            f5 = fArr2[i44] + f19;
                            f6 = fArr2[i45] + f20;
                            f19 += fArr2[i46];
                            f7 = fArr2[i47];
                        }
                        f20 += f7;
                        f15 = f5;
                        f16 = f6;
                        i6 = i7;
                    } else {
                        int i48 = i7 + 5;
                        int i49 = i7 + 6;
                        i6 = i7;
                        drawArc(path, f19, f20, fArr2[i48] + f19, fArr2[i49] + f20, fArr2[i7 + 0], fArr2[i7 + 1], fArr2[i7 + 2], fArr2[i7 + 3] != 0.0f, fArr2[i7 + 4] != 0.0f);
                        f19 += fArr2[i48];
                        f20 += fArr2[i49];
                    }
                    i7 = i6 + i5;
                    c8 = c6;
                    c7 = c8;
                } else {
                    i6 = i7;
                    int i50 = i6 + 5;
                    int i51 = i6 + 6;
                    drawArc(path, f19, f20, fArr2[i50], fArr2[i51], fArr2[i6 + 0], fArr2[i6 + 1], fArr2[i6 + 2], fArr2[i6 + 3] != 0.0f, fArr2[i6 + 4] != 0.0f);
                    f19 = fArr2[i50];
                    f20 = fArr2[i51];
                }
                f16 = f20;
                f15 = f19;
                i7 = i6 + i5;
                c8 = c6;
                c7 = c8;
            }
            fArr[0] = f19;
            fArr[1] = f20;
            fArr[2] = f15;
            fArr[3] = f16;
            fArr[4] = f21;
            fArr[5] = f22;
        }

        private static void arcToBezier(Path path, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13) {
            double d14 = d7;
            int ceil = (int) Math.ceil(Math.abs((d13 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d11);
            double sin = Math.sin(d11);
            double cos2 = Math.cos(d12);
            double sin2 = Math.sin(d12);
            double d15 = -d14;
            double d16 = d15 * cos;
            double d17 = d8 * sin;
            double d18 = (d16 * sin2) - (d17 * cos2);
            double d19 = d15 * sin;
            double d20 = d8 * cos;
            double d21 = (cos2 * d20) + (sin2 * d19);
            double d22 = d13 / ceil;
            double d23 = d12;
            double d24 = d21;
            double d25 = d18;
            int i5 = 0;
            double d26 = d9;
            double d27 = d10;
            while (i5 < ceil) {
                double d28 = d23 + d22;
                double sin3 = Math.sin(d28);
                double cos3 = Math.cos(d28);
                double d29 = (((d14 * cos) * cos3) + d5) - (d17 * sin3);
                double d30 = (d20 * sin3) + (d14 * sin * cos3) + d6;
                double d31 = (d16 * sin3) - (d17 * cos3);
                double d32 = (cos3 * d20) + (sin3 * d19);
                double d33 = d28 - d23;
                double tan = Math.tan(d33 / 2.0d);
                double sqrt = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d33)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d25 * sqrt) + d26), (float) ((d24 * sqrt) + d27), (float) (d29 - (sqrt * d31)), (float) (d30 - (sqrt * d32)), (float) d29, (float) d30);
                i5++;
                d22 = d22;
                sin = sin;
                d26 = d29;
                d19 = d19;
                cos = cos;
                d23 = d28;
                d24 = d32;
                d25 = d31;
                ceil = ceil;
                d27 = d30;
                d14 = d7;
            }
        }

        private static void drawArc(Path path, float f5, float f6, float f7, float f8, float f9, float f10, float f11, boolean z4, boolean z5) {
            double d5;
            double d6;
            double radians = Math.toRadians(f11);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d7 = f5;
            double d8 = d7 * cos;
            double d9 = f6;
            double d10 = f9;
            double d11 = ((d9 * sin) + d8) / d10;
            double d12 = f10;
            double d13 = ((d9 * cos) + ((-f5) * sin)) / d12;
            double d14 = f8;
            double d15 = ((d14 * sin) + (f7 * cos)) / d10;
            double d16 = ((d14 * cos) + ((-f7) * sin)) / d12;
            double d17 = d11 - d15;
            double d18 = d13 - d16;
            double d19 = (d11 + d15) / 2.0d;
            double d20 = (d13 + d16) / 2.0d;
            double d21 = (d18 * d18) + (d17 * d17);
            if (d21 == 0.0d) {
                Log.w(PathParser.LOGTAG, " Points are coincident");
                return;
            }
            double d22 = (1.0d / d21) - 0.25d;
            if (d22 < 0.0d) {
                Log.w(PathParser.LOGTAG, "Points are too far apart " + d21);
                float sqrt = (float) (Math.sqrt(d21) / 1.99999d);
                drawArc(path, f5, f6, f7, f8, f9 * sqrt, f10 * sqrt, f11, z4, z5);
                return;
            }
            double sqrt2 = Math.sqrt(d22);
            double d23 = d17 * sqrt2;
            double d24 = sqrt2 * d18;
            if (z4 == z5) {
                d5 = d19 - d24;
                d6 = d20 + d23;
            } else {
                d5 = d19 + d24;
                d6 = d20 - d23;
            }
            double atan2 = Math.atan2(d13 - d6, d11 - d5);
            double atan22 = Math.atan2(d16 - d6, d15 - d5) - atan2;
            if (z5 != (atan22 >= 0.0d)) {
                atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d25 = d5 * d10;
            double d26 = d6 * d12;
            arcToBezier(path, (d25 * cos) - (d26 * sin), (d26 * cos) + (d25 * sin), d10, d12, d7, d9, radians, atan2, atan22);
        }

        public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
            float[] fArr = new float[6];
            char c5 = 'm';
            for (int i5 = 0; i5 < pathDataNodeArr.length; i5++) {
                addCommand(path, fArr, c5, pathDataNodeArr[i5].mType, pathDataNodeArr[i5].mParams);
                c5 = pathDataNodeArr[i5].mType;
            }
        }

        public void interpolatePathDataNode(PathDataNode pathDataNode, PathDataNode pathDataNode2, float f5) {
            this.mType = pathDataNode.mType;
            int i5 = 0;
            while (true) {
                float[] fArr = pathDataNode.mParams;
                if (i5 >= fArr.length) {
                    return;
                }
                this.mParams[i5] = (pathDataNode2.mParams[i5] * f5) + ((1.0f - f5) * fArr[i5]);
                i5++;
            }
        }
    }

    private PathParser() {
    }

    private static void addNode(ArrayList<PathDataNode> arrayList, char c5, float[] fArr) {
        arrayList.add(new PathDataNode(c5, fArr));
    }

    public static boolean canMorph(@Nullable PathDataNode[] pathDataNodeArr, @Nullable PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int i5 = 0; i5 < pathDataNodeArr.length; i5++) {
            if (pathDataNodeArr[i5].mType != pathDataNodeArr2[i5].mType || pathDataNodeArr[i5].mParams.length != pathDataNodeArr2[i5].mParams.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] copyOfRange(float[] fArr, int i5, int i6) {
        if (i5 > i6) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i5 < 0 || i5 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i7 = i6 - i5;
        int min = Math.min(i7, length - i5);
        float[] fArr2 = new float[i7];
        System.arraycopy(fArr, i5, fArr2, 0, min);
        return fArr2;
    }

    public static PathDataNode[] createNodesFromPathData(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i5 = 1;
        int i6 = 0;
        while (i5 < str.length()) {
            int nextStart = nextStart(str, i5);
            String trim = str.substring(i6, nextStart).trim();
            if (trim.length() > 0) {
                addNode(arrayList, trim.charAt(0), getFloats(trim));
            }
            i6 = nextStart;
            i5 = nextStart + 1;
        }
        if (i5 - i6 == 1 && i6 < str.length()) {
            addNode(arrayList, str.charAt(i6), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[arrayList.size()]);
    }

    public static Path createPathFromPathData(String str) {
        Path path = new Path();
        PathDataNode[] createNodesFromPathData = createNodesFromPathData(str);
        if (createNodesFromPathData == null) {
            return null;
        }
        try {
            PathDataNode.nodesToPath(createNodesFromPathData, path);
            return path;
        } catch (RuntimeException e5) {
            throw new RuntimeException(d.f("Error in parsing ", str), e5);
        }
    }

    public static PathDataNode[] deepCopyNodes(PathDataNode[] pathDataNodeArr) {
        if (pathDataNodeArr == null) {
            return null;
        }
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i5 = 0; i5 < pathDataNodeArr.length; i5++) {
            pathDataNodeArr2[i5] = new PathDataNode(pathDataNodeArr[i5]);
        }
        return pathDataNodeArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038 A[LOOP:0: B:2:0x0007->B:14:0x0038, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void extract(java.lang.String r8, int r9, androidx.core.graphics.PathParser.ExtractFloatResult r10) {
        /*
            r0 = 0
            r10.mEndWithNegOrDot = r0
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3b
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L33
            r6 = 69
            if (r5 == r6) goto L31
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L31
            switch(r5) {
                case 44: goto L33;
                case 45: goto L2a;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L2f
        L22:
            if (r3 != 0) goto L27
            r2 = 0
            r3 = 1
            goto L35
        L27:
            r10.mEndWithNegOrDot = r7
            goto L33
        L2a:
            if (r1 == r9) goto L2f
            if (r2 != 0) goto L2f
            goto L27
        L2f:
            r2 = 0
            goto L35
        L31:
            r2 = 1
            goto L35
        L33:
            r2 = 0
            r4 = 1
        L35:
            if (r4 == 0) goto L38
            goto L3b
        L38:
            int r1 = r1 + 1
            goto L7
        L3b:
            r10.mEndPosition = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.PathParser.extract(java.lang.String, int, androidx.core.graphics.PathParser$ExtractFloatResult):void");
    }

    private static float[] getFloats(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            ExtractFloatResult extractFloatResult = new ExtractFloatResult();
            int length = str.length();
            int i5 = 1;
            int i6 = 0;
            while (i5 < length) {
                extract(str, i5, extractFloatResult);
                int i7 = extractFloatResult.mEndPosition;
                if (i5 < i7) {
                    fArr[i6] = Float.parseFloat(str.substring(i5, i7));
                    i6++;
                }
                i5 = extractFloatResult.mEndWithNegOrDot ? i7 : i7 + 1;
            }
            return copyOfRange(fArr, 0, i6);
        } catch (NumberFormatException e5) {
            throw new RuntimeException(a.j("error in parsing \"", str, "\""), e5);
        }
    }

    public static boolean interpolatePathDataNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2, PathDataNode[] pathDataNodeArr3, float f5) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr3 == null) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes cannot be null");
        }
        if (pathDataNodeArr.length != pathDataNodeArr2.length || pathDataNodeArr2.length != pathDataNodeArr3.length) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        }
        if (!canMorph(pathDataNodeArr2, pathDataNodeArr3)) {
            return false;
        }
        for (int i5 = 0; i5 < pathDataNodeArr.length; i5++) {
            pathDataNodeArr[i5].interpolatePathDataNode(pathDataNodeArr2[i5], pathDataNodeArr3[i5], f5);
        }
        return true;
    }

    private static int nextStart(String str, int i5) {
        while (i5 < str.length()) {
            char charAt = str.charAt(i5);
            if ((charAt - 'Z') * (charAt - 'A') > 0) {
                if ((charAt - 'z') * (charAt - 'a') > 0) {
                    continue;
                    i5++;
                }
            }
            if (charAt != 'e' && charAt != 'E') {
                return i5;
            }
            i5++;
        }
        return i5;
    }

    public static void updateNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        for (int i5 = 0; i5 < pathDataNodeArr2.length; i5++) {
            pathDataNodeArr[i5].mType = pathDataNodeArr2[i5].mType;
            for (int i6 = 0; i6 < pathDataNodeArr2[i5].mParams.length; i6++) {
                pathDataNodeArr[i5].mParams[i6] = pathDataNodeArr2[i5].mParams[i6];
            }
        }
    }
}
