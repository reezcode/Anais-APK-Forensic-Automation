package androidx.appcompat.graphics.drawable;

import androidx.constraintlayout.core.state.Interpolator;
import androidx.constraintlayout.core.state.Transition;
import h.h;
import java.util.ArrayList;
import java.util.Map;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f127a = new a();

    public static float a(float f5, float f6, float f7, float f8) {
        return ((f5 - f6) * f7) + f8;
    }

    public static Object b(short[] sArr, int i5, Function1 function1) {
        return function1.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(sArr, i5)));
    }

    public static String c(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder d(h hVar, int i5, String str, String str2, String str3) {
        hVar.i(i5, str, str2, str3);
        return new StringBuilder();
    }

    public static StringBuilder e(String str, int i5, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i5);
        sb.append(str2);
        return sb;
    }

    public static ArrayList f(Map map, Object obj) {
        ArrayList arrayList = new ArrayList();
        map.put(obj, arrayList);
        return arrayList;
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f5) {
        float lambda$getInterpolator$3;
        lambda$getInterpolator$3 = Transition.lambda$getInterpolator$3(f5);
        return lambda$getInterpolator$3;
    }
}
