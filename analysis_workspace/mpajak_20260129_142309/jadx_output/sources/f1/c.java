package f1;

import android.animation.TypeEvaluator;
import androidx.annotation.NonNull;

/* loaded from: classes11.dex */
public final class c implements TypeEvaluator<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2772a = new c();

    @Override // android.animation.TypeEvaluator
    @NonNull
    public final Integer evaluate(float f5, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f6 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = num2.intValue();
        float f7 = ((intValue2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
        float a5 = androidx.appcompat.graphics.drawable.a.a(f7, f6, f5, f6);
        float a6 = androidx.appcompat.graphics.drawable.a.a(pow4, pow, f5, pow);
        float a7 = androidx.appcompat.graphics.drawable.a.a(pow5, pow2, f5, pow2);
        float a8 = androidx.appcompat.graphics.drawable.a.a(pow6, pow3, f5, pow3);
        float pow7 = ((float) Math.pow(a6, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(a7, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(a8, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(a5 * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}
