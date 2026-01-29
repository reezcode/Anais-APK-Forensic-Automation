package v1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import comeliest.metempsychosis.pokelogan.R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f5633a = {R.attr.colorPrimary};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f5634b = {R.attr.colorPrimaryVariant};

    public static void a(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i5, @StyleRes int i6) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.g.G, i5, i6);
        boolean z4 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z4) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, f5634b, "Theme.MaterialComponents");
            }
        }
        c(context, f5633a, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(@androidx.annotation.NonNull android.content.Context r4, android.util.AttributeSet r5, @androidx.annotation.NonNull @androidx.annotation.StyleableRes int[] r6, @androidx.annotation.AttrRes int r7, @androidx.annotation.StyleRes int r8, @androidx.annotation.Nullable @androidx.annotation.StyleableRes int... r9) {
        /*
            int[] r0 = i.g.G
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0, r7, r8)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L12
            r0.recycle()
            return
        L12:
            r1 = -1
            int r3 = r9.length
            if (r3 != 0) goto L1d
            int r4 = r0.getResourceId(r2, r1)
            if (r4 == r1) goto L38
            goto L37
        L1d:
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r6, r7, r8)
            int r5 = r9.length
            r6 = 0
        L23:
            if (r6 >= r5) goto L34
            r7 = r9[r6]
            int r7 = r4.getResourceId(r7, r1)
            if (r7 != r1) goto L31
            r4.recycle()
            goto L38
        L31:
            int r6 = r6 + 1
            goto L23
        L34:
            r4.recycle()
        L37:
            r2 = 1
        L38:
            r0.recycle()
            if (r2 == 0) goto L3e
            return
        L3e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.m.b(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void c(@NonNull Context context, @NonNull int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z4 = false;
        int i5 = 0;
        while (true) {
            if (i5 >= iArr.length) {
                obtainStyledAttributes.recycle();
                z4 = true;
                break;
            } else {
                if (!obtainStyledAttributes.hasValue(i5)) {
                    obtainStyledAttributes.recycle();
                    break;
                }
                i5++;
            }
        }
        if (!z4) {
            throw new IllegalArgumentException(androidx.appcompat.widget.a.j("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    @NonNull
    public static TypedArray d(@NonNull Context context, AttributeSet attributeSet, @NonNull @StyleableRes int[] iArr, @AttrRes int i5, @StyleRes int i6, @StyleableRes int... iArr2) {
        a(context, attributeSet, i5, i6);
        b(context, attributeSet, iArr, i5, i6, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i5, i6);
    }
}
