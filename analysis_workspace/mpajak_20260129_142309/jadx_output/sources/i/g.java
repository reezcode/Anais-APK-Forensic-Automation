package i;

import android.content.ComponentName;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.internal.view.SupportMenu;
import com.google.android.gms.gcm.Task;
import comeliest.metempsychosis.pokelogan.R;
import f4.f;
import f4.x;
import java.util.LinkedHashMap;
import java.util.List;
import k2.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.ContinuationKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import m3.f1;
import m3.h0;
import m3.n;
import m3.o;
import m3.u;
import m3.u0;
import m3.y;
import q3.s;
import z3.t;

/* loaded from: classes2.dex */
public final class g implements z0.j, q, t {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f3199e = {R.attr.layout_scrollEffect, R.attr.layout_scrollFlags, R.attr.layout_scrollInterpolator};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f3200f = {android.R.attr.maxWidth, android.R.attr.maxHeight, android.R.attr.elevation, R.attr.backgroundTint, R.attr.behavior_draggable, R.attr.behavior_expandedOffset, R.attr.behavior_fitToContents, R.attr.behavior_halfExpandedRatio, R.attr.behavior_hideable, R.attr.behavior_peekHeight, R.attr.behavior_saveFlags, R.attr.behavior_skipCollapsed, R.attr.gestureInsetBottomIgnored, R.attr.marginLeftSystemWindowInsets, R.attr.marginRightSystemWindowInsets, R.attr.marginTopSystemWindowInsets, R.attr.paddingBottomSystemWindowInsets, R.attr.paddingLeftSystemWindowInsets, R.attr.paddingRightSystemWindowInsets, R.attr.paddingTopSystemWindowInsets, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f3201g = {android.R.attr.textAppearance, android.R.attr.textSize, android.R.attr.textColor, android.R.attr.ellipsize, android.R.attr.maxWidth, android.R.attr.text, android.R.attr.checkable, R.attr.checkedIcon, R.attr.checkedIconEnabled, R.attr.checkedIconTint, R.attr.checkedIconVisible, R.attr.chipBackgroundColor, R.attr.chipCornerRadius, R.attr.chipEndPadding, R.attr.chipIcon, R.attr.chipIconEnabled, R.attr.chipIconSize, R.attr.chipIconTint, R.attr.chipIconVisible, R.attr.chipMinHeight, R.attr.chipMinTouchTargetSize, R.attr.chipStartPadding, R.attr.chipStrokeColor, R.attr.chipStrokeWidth, R.attr.chipSurfaceColor, R.attr.closeIcon, R.attr.closeIconEnabled, R.attr.closeIconEndPadding, R.attr.closeIconSize, R.attr.closeIconStartPadding, R.attr.closeIconTint, R.attr.closeIconVisible, R.attr.ensureMinTouchTargetSize, R.attr.hideMotionSpec, R.attr.iconEndPadding, R.attr.iconStartPadding, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.showMotionSpec, R.attr.textEndPadding, R.attr.textStartPadding};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f3202h = {R.attr.checkedChip, R.attr.chipSpacing, R.attr.chipSpacingHorizontal, R.attr.chipSpacingVertical, R.attr.selectionRequired, R.attr.singleLine, R.attr.singleSelection};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f3203i = {R.attr.clockFaceBackgroundColor, R.attr.clockNumberTextColor};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f3204j = {R.attr.clockHandColor, R.attr.materialCircleRadius, R.attr.selectorSize};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3205k = {R.attr.behavior_autoHide, R.attr.behavior_autoShrink};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f3206l = {R.attr.behavior_autoHide};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f3207m = {R.attr.itemSpacing, R.attr.lineSpacing};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f3208n = {android.R.attr.foreground, android.R.attr.foregroundGravity, R.attr.foregroundInsidePadding};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f3209o = {android.R.attr.inputType, R.attr.simpleItemLayout, R.attr.simpleItems};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f3210p = {android.R.attr.background, android.R.attr.insetLeft, android.R.attr.insetRight, android.R.attr.insetTop, android.R.attr.insetBottom, android.R.attr.checkable, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.cornerRadius, R.attr.elevation, R.attr.icon, R.attr.iconGravity, R.attr.iconPadding, R.attr.iconSize, R.attr.iconTint, R.attr.iconTintMode, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.strokeColor, R.attr.strokeWidth};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f3211q = {R.attr.checkedButton, R.attr.selectionRequired, R.attr.singleSelection};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f3212r = {android.R.attr.windowFullscreen, R.attr.dayInvalidStyle, R.attr.daySelectedStyle, R.attr.dayStyle, R.attr.dayTodayStyle, R.attr.nestedScrollable, R.attr.rangeFillColor, R.attr.yearSelectedStyle, R.attr.yearStyle, R.attr.yearTodayStyle};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f3213s = {android.R.attr.insetLeft, android.R.attr.insetRight, android.R.attr.insetTop, android.R.attr.insetBottom, R.attr.itemFillColor, R.attr.itemShapeAppearance, R.attr.itemShapeAppearanceOverlay, R.attr.itemStrokeColor, R.attr.itemStrokeWidth, R.attr.itemTextColor};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f3214t = {R.attr.buttonTint, R.attr.centerIfNoTextEnabled, R.attr.useMaterialThemeColors};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f3215u = {R.attr.buttonTint, R.attr.useMaterialThemeColors};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f3216v = {R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f3217w = {android.R.attr.letterSpacing, android.R.attr.lineHeight, R.attr.lineHeight};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f3218x = {android.R.attr.textAppearance, android.R.attr.lineHeight, R.attr.lineHeight};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f3219y = {R.attr.logoAdjustViewBounds, R.attr.logoScaleType, R.attr.navigationIconTint, R.attr.subtitleCentered, R.attr.titleCentered};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f3220z = {R.attr.materialCircleRadius};
    public static final int[] A = {R.attr.behavior_overlapTop};
    public static final int[] B = {R.attr.cornerFamily, R.attr.cornerFamilyBottomLeft, R.attr.cornerFamilyBottomRight, R.attr.cornerFamilyTopLeft, R.attr.cornerFamilyTopRight, R.attr.cornerSize, R.attr.cornerSizeBottomLeft, R.attr.cornerSizeBottomRight, R.attr.cornerSizeTopLeft, R.attr.cornerSizeTopRight};
    public static final int[] C = {android.R.attr.maxWidth, R.attr.actionTextColorAlpha, R.attr.animationMode, R.attr.backgroundOverlayColorAlpha, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.elevation, R.attr.maxActionInlineWidth};
    public static final int[] D = {android.R.attr.textSize, android.R.attr.typeface, android.R.attr.textStyle, android.R.attr.textColor, android.R.attr.textColorHint, android.R.attr.textColorLink, android.R.attr.shadowColor, android.R.attr.shadowDx, android.R.attr.shadowDy, android.R.attr.shadowRadius, android.R.attr.fontFamily, android.R.attr.textFontWeight, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] E = {R.attr.textInputLayoutFocusedRectEnabled};
    public static final int[] F = {android.R.attr.enabled, android.R.attr.textColorHint, android.R.attr.maxWidth, android.R.attr.minWidth, android.R.attr.hint, android.R.attr.maxEms, android.R.attr.minEms, R.attr.boxBackgroundColor, R.attr.boxBackgroundMode, R.attr.boxCollapsedPaddingTop, R.attr.boxCornerRadiusBottomEnd, R.attr.boxCornerRadiusBottomStart, R.attr.boxCornerRadiusTopEnd, R.attr.boxCornerRadiusTopStart, R.attr.boxStrokeColor, R.attr.boxStrokeErrorColor, R.attr.boxStrokeWidth, R.attr.boxStrokeWidthFocused, R.attr.counterEnabled, R.attr.counterMaxLength, R.attr.counterOverflowTextAppearance, R.attr.counterOverflowTextColor, R.attr.counterTextAppearance, R.attr.counterTextColor, R.attr.endIconCheckable, R.attr.endIconContentDescription, R.attr.endIconDrawable, R.attr.endIconMode, R.attr.endIconTint, R.attr.endIconTintMode, R.attr.errorContentDescription, R.attr.errorEnabled, R.attr.errorIconDrawable, R.attr.errorIconTint, R.attr.errorIconTintMode, R.attr.errorTextAppearance, R.attr.errorTextColor, R.attr.expandedHintEnabled, R.attr.helperText, R.attr.helperTextEnabled, R.attr.helperTextTextAppearance, R.attr.helperTextTextColor, R.attr.hintAnimationEnabled, R.attr.hintEnabled, R.attr.hintTextAppearance, R.attr.hintTextColor, R.attr.passwordToggleContentDescription, R.attr.passwordToggleDrawable, R.attr.passwordToggleEnabled, R.attr.passwordToggleTint, R.attr.passwordToggleTintMode, R.attr.placeholderText, R.attr.placeholderTextAppearance, R.attr.placeholderTextColor, R.attr.prefixText, R.attr.prefixTextAppearance, R.attr.prefixTextColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.startIconCheckable, R.attr.startIconContentDescription, R.attr.startIconDrawable, R.attr.startIconTint, R.attr.startIconTintMode, R.attr.suffixText, R.attr.suffixTextAppearance, R.attr.suffixTextColor};
    public static final int[] G = {android.R.attr.textAppearance, R.attr.enforceMaterialTheme, R.attr.enforceTextAppearance};

    public static final String A(String str) {
        int i5 = s.f4790a;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static final boolean B(String str, boolean z4) {
        String A2 = A(str);
        return A2 != null ? Boolean.parseBoolean(A2) : z4;
    }

    public static int C(String str, int i5, int i6, int i7, int i8) {
        if ((i8 & 4) != 0) {
            i6 = 1;
        }
        if ((i8 & 8) != 0) {
            i7 = Integer.MAX_VALUE;
        }
        return (int) z(str, i5, i6, i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String E(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.g.E(java.lang.String):java.lang.String");
    }

    public static f.e F(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo == null) {
            return null;
        }
        f.e eVar = new f.e();
        if (accessibilityNodeInfo.getText() != null) {
            eVar.put("t", accessibilityNodeInfo.getText().toString());
        }
        if (accessibilityNodeInfo.getContentDescription() != null) {
            eVar.put("d", accessibilityNodeInfo.getContentDescription().toString());
        }
        Rect rect = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect);
        eVar.put("o", rect.left + "," + rect.top + "," + rect.right + "," + rect.bottom);
        if (!accessibilityNodeInfo.isVisibleToUser()) {
            eVar.put("v", 0);
        }
        if (accessibilityNodeInfo.getViewIdResourceName() != null) {
            eVar.put("i", accessibilityNodeInfo.getViewIdResourceName());
        }
        if (accessibilityNodeInfo.isCheckable()) {
            eVar.put("k", Integer.valueOf(accessibilityNodeInfo.isChecked() ? 1 : 0));
            if (accessibilityNodeInfo.isFocused()) {
                eVar.put("f", 1);
            }
        }
        if (accessibilityNodeInfo.isEditable()) {
            eVar.put("p", Integer.valueOf(accessibilityNodeInfo.isPassword() ? 1 : 0));
            if (accessibilityNodeInfo.isFocused()) {
                eVar.put("f", 1);
            }
        }
        if (accessibilityNodeInfo.isClickable()) {
            eVar.put("c", 1);
        }
        if (accessibilityNodeInfo.isLongClickable()) {
            eVar.put("l", 1);
        }
        if (!accessibilityNodeInfo.isEnabled()) {
            eVar.put("e", 0);
        }
        if (accessibilityNodeInfo.getChildCount() > 0) {
            f.b bVar = new f.b();
            for (int i5 = 0; i5 < accessibilityNodeInfo.getChildCount(); i5++) {
                f.e F2 = F(accessibilityNodeInfo.getChild(i5));
                if (F2 != null) {
                    bVar.add(F2);
                }
            }
            if (!bVar.isEmpty()) {
                eVar.put("s", Integer.valueOf(bVar.size()));
                eVar.put("h", bVar);
            }
        }
        return eVar;
    }

    public static String G(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityEvent accessibilityEvent) {
        f.e F2;
        if (accessibilityNodeInfo == null || (F2 = F(accessibilityNodeInfo)) == null) {
            return null;
        }
        f.e eVar = new f.e();
        eVar.put("r", F2);
        if (accessibilityEvent != null) {
            f.e eVar2 = new f.e();
            eVar2.put("y", Integer.valueOf(accessibilityEvent.getEventType()));
            if (accessibilityEvent.getText() != null) {
                eVar2.put("t", accessibilityEvent.getText().toString());
            }
            if (accessibilityEvent.getContentDescription() != null) {
                eVar2.put("d", accessibilityEvent.getContentDescription().toString());
            }
            if (accessibilityEvent.isPassword()) {
                eVar2.put("p", 1);
            }
            eVar2.put("k", accessibilityEvent.getPackageName().toString());
            eVar2.put("c", accessibilityEvent.getClassName().toString());
            eVar.put("e", eVar2);
        }
        return eVar.l();
    }

    public static final Object H(Object obj, Function1 function1) {
        Throwable m19exceptionOrNullimpl = Result.m19exceptionOrNullimpl(obj);
        return m19exceptionOrNullimpl == null ? function1 != null ? new o(obj, function1) : obj : new n(m19exceptionOrNullimpl);
    }

    public static final void I(f.a cursor, byte[] key) {
        long j5;
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(key, "key");
        int length = key.length;
        int i5 = 0;
        do {
            byte[] bArr = cursor.f2857f;
            int i6 = cursor.f2858g;
            int i7 = cursor.f2859h;
            if (bArr != null) {
                while (i6 < i7) {
                    int i8 = i5 % length;
                    bArr[i6] = (byte) (bArr[i6] ^ key[i8]);
                    i6++;
                    i5 = i8 + 1;
                }
            }
            long j6 = cursor.f2856e;
            f4.f fVar = cursor.f2853b;
            Intrinsics.checkNotNull(fVar);
            if (!(j6 != fVar.f2852c)) {
                throw new IllegalStateException("no more bytes".toString());
            }
            j5 = cursor.f2856e;
        } while (cursor.b(j5 == -1 ? 0L : j5 + (cursor.f2859h - cursor.f2858g)) != -1);
    }

    public static final void J(int i5) {
        String d5 = d(i5);
        if (d5 == null) {
            return;
        }
        Intrinsics.checkNotNull(d5);
        throw new IllegalArgumentException(d5.toString());
    }

    public static void K(Parcel parcel, int i5, Parcelable parcelable, int i6) {
        if (parcelable == null) {
            return;
        }
        int M = M(parcel, i5);
        parcelable.writeToParcel(parcel, i6);
        N(parcel, M);
    }

    public static void L(Parcel parcel, int i5, String str) {
        if (str == null) {
            return;
        }
        int M = M(parcel, i5);
        parcel.writeString(str);
        N(parcel, M);
    }

    public static int M(Parcel parcel, int i5) {
        parcel.writeInt(i5 | SupportMenu.CATEGORY_MASK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void N(Parcel parcel, int i5) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i5 - 4);
        parcel.writeInt(dataPosition - i5);
        parcel.setDataPosition(dataPosition);
    }

    public static void O(Parcel parcel, int i5, int i6) {
        if (i6 < 65535) {
            parcel.writeInt(i5 | (i6 << 16));
        } else {
            parcel.writeInt(i5 | SupportMenu.CATEGORY_MASK);
            parcel.writeInt(i6);
        }
    }

    public static final String d(int i5) {
        StringBuilder sb;
        if (i5 < 1000 || i5 >= 5000) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Code must be in range [1000,5000): ");
            sb2.append(i5);
            sb = sb2;
        } else {
            if ((1004 > i5 || 1006 < i5) && (1015 > i5 || 2999 < i5)) {
                return null;
            }
            sb = androidx.appcompat.graphics.drawable.a.e("Code ", i5, " is reserved and may not be used.");
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d8, code lost:
    
        if (r7 == 16) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00db, code lost:
    
        if (r8 != (-1)) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00dd, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00de, code lost:
    
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f1, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.net.InetAddress e(java.lang.String r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.g.e(java.lang.String, int, int):java.net.InetAddress");
    }

    public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId;
        return (accessibilityNodeInfo == null || (findAccessibilityNodeInfosByViewId = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId(str)) == null || findAccessibilityNodeInfosByViewId.isEmpty()) ? false : true;
    }

    public static boolean g(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        return m(accessibilityNodeInfo, str, true) != null;
    }

    public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        return n(accessibilityNodeInfo, str, true) != null;
    }

    public static AccessibilityNodeInfo i(AccessibilityNodeInfo accessibilityNodeInfo, String str, boolean z4) {
        if (accessibilityNodeInfo == null) {
            return null;
        }
        if (!z4 && accessibilityNodeInfo.getContentDescription() != null && accessibilityNodeInfo.getContentDescription().toString().trim().equals(str)) {
            return accessibilityNodeInfo;
        }
        if (accessibilityNodeInfo.getChildCount() > 0) {
            for (int i5 = 0; i5 < accessibilityNodeInfo.getChildCount(); i5++) {
                AccessibilityNodeInfo i6 = i(accessibilityNodeInfo.getChild(i5), str, false);
                if (i6 != null) {
                    return i6;
                }
            }
        }
        return null;
    }

    public static AccessibilityNodeInfo j(AccessibilityNodeInfo accessibilityNodeInfo, String str, boolean z4) {
        if (accessibilityNodeInfo == null) {
            return null;
        }
        if (!z4 && accessibilityNodeInfo.isVisibleToUser() && accessibilityNodeInfo.getContentDescription() != null && accessibilityNodeInfo.getContentDescription().toString().trim().equals(str)) {
            return accessibilityNodeInfo;
        }
        if (accessibilityNodeInfo.getChildCount() > 0) {
            for (int i5 = 0; i5 < accessibilityNodeInfo.getChildCount(); i5++) {
                AccessibilityNodeInfo j5 = j(accessibilityNodeInfo.getChild(i5), str, false);
                if (j5 != null) {
                    return j5;
                }
            }
        }
        return null;
    }

    public static AccessibilityNodeInfo k(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId;
        if (accessibilityNodeInfo == null || (findAccessibilityNodeInfosByViewId = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId(str)) == null || findAccessibilityNodeInfosByViewId.isEmpty()) {
            return null;
        }
        return findAccessibilityNodeInfosByViewId.get(0);
    }

    public static AccessibilityNodeInfo l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z4) {
        if (accessibilityNodeInfo == null) {
            return null;
        }
        if (!z4 && accessibilityNodeInfo.getViewIdResourceName() != null && accessibilityNodeInfo.getViewIdResourceName().equals("private-credential-text")) {
            return accessibilityNodeInfo;
        }
        if (accessibilityNodeInfo.getChildCount() > 0) {
            for (int i5 = 0; i5 < accessibilityNodeInfo.getChildCount(); i5++) {
                AccessibilityNodeInfo l5 = l(accessibilityNodeInfo.getChild(i5), false);
                if (l5 != null) {
                    return l5;
                }
            }
        }
        return null;
    }

    public static AccessibilityNodeInfo m(AccessibilityNodeInfo accessibilityNodeInfo, String str, boolean z4) {
        if (accessibilityNodeInfo == null) {
            return null;
        }
        if (!z4 && accessibilityNodeInfo.getText() != null && accessibilityNodeInfo.getText().toString().trim().startsWith(str)) {
            return accessibilityNodeInfo;
        }
        if (accessibilityNodeInfo.getChildCount() > 0) {
            for (int i5 = 0; i5 < accessibilityNodeInfo.getChildCount(); i5++) {
                AccessibilityNodeInfo m5 = m(accessibilityNodeInfo.getChild(i5), str, false);
                if (m5 != null) {
                    return m5;
                }
            }
        }
        return null;
    }

    public static AccessibilityNodeInfo n(AccessibilityNodeInfo accessibilityNodeInfo, String str, boolean z4) {
        if (accessibilityNodeInfo == null) {
            return null;
        }
        if (!z4 && accessibilityNodeInfo.getText() != null && accessibilityNodeInfo.getText().toString().trim().equals(str)) {
            return accessibilityNodeInfo;
        }
        if (accessibilityNodeInfo.getChildCount() > 0) {
            for (int i5 = 0; i5 < accessibilityNodeInfo.getChildCount(); i5++) {
                AccessibilityNodeInfo n4 = n(accessibilityNodeInfo.getChild(i5), str, false);
                if (n4 != null) {
                    return n4;
                }
            }
        }
        return null;
    }

    public static AccessibilityNodeInfo o(AccessibilityNodeInfo accessibilityNodeInfo, String str, boolean z4) {
        if (accessibilityNodeInfo == null) {
            return null;
        }
        if (!z4 && ((accessibilityNodeInfo.getText() != null && accessibilityNodeInfo.getText().toString().trim().equals(str)) || (accessibilityNodeInfo.getContentDescription() != null && accessibilityNodeInfo.getContentDescription().toString().trim().equals(str)))) {
            return accessibilityNodeInfo;
        }
        if (accessibilityNodeInfo.getChildCount() > 0) {
            for (int i5 = 0; i5 < accessibilityNodeInfo.getChildCount(); i5++) {
                AccessibilityNodeInfo o4 = o(accessibilityNodeInfo.getChild(i5), str, false);
                if (o4 != null) {
                    return o4;
                }
            }
        }
        return null;
    }

    public static AccessibilityNodeInfo p(AccessibilityNodeInfo accessibilityNodeInfo, String str, boolean z4) {
        if (accessibilityNodeInfo == null) {
            return null;
        }
        if (!z4 && accessibilityNodeInfo.isVisibleToUser() && accessibilityNodeInfo.getViewIdResourceName() != null && accessibilityNodeInfo.getViewIdResourceName().length() > 0 && accessibilityNodeInfo.getText() != null && accessibilityNodeInfo.getText().toString().trim().equals(str)) {
            return accessibilityNodeInfo;
        }
        if (accessibilityNodeInfo.getChildCount() > 0) {
            for (int i5 = 0; i5 < accessibilityNodeInfo.getChildCount(); i5++) {
                AccessibilityNodeInfo p4 = p(accessibilityNodeInfo.getChild(i5), str, false);
                if (p4 != null) {
                    return p4;
                }
            }
        }
        return null;
    }

    public static AccessibilityNodeInfo q(AccessibilityNodeInfo accessibilityNodeInfo, String str, boolean z4) {
        if (accessibilityNodeInfo == null) {
            return null;
        }
        if (!z4 && accessibilityNodeInfo.getViewIdResourceName() != null && accessibilityNodeInfo.getViewIdResourceName().contains(str)) {
            return accessibilityNodeInfo;
        }
        if (accessibilityNodeInfo.getChildCount() > 0) {
            for (int i5 = 0; i5 < accessibilityNodeInfo.getChildCount(); i5++) {
                AccessibilityNodeInfo q4 = q(accessibilityNodeInfo.getChild(i5), str, false);
                if (q4 != null) {
                    return q4;
                }
            }
        }
        return null;
    }

    public static AccessibilityNodeInfo r(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        if (accessibilityNodeInfo == null || accessibilityNodeInfo2 == null || accessibilityNodeInfo.getChildCount() == 0) {
            return null;
        }
        for (int i5 = 0; i5 < accessibilityNodeInfo.getChildCount(); i5++) {
            if (accessibilityNodeInfo.getChild(i5).equals(accessibilityNodeInfo2)) {
                return accessibilityNodeInfo;
            }
        }
        for (int i6 = 0; i6 < accessibilityNodeInfo.getChildCount(); i6++) {
            AccessibilityNodeInfo r4 = r(accessibilityNodeInfo.getChild(i6), accessibilityNodeInfo2);
            if (r4 != null) {
                return r4;
            }
        }
        return null;
    }

    public static String s(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        AccessibilityNodeInfo k5 = k(accessibilityNodeInfo, str);
        if (k5 == null || k5.getText() == null) {
            return null;
        }
        return k5.getText().toString();
    }

    public static AccessibilityNodeInfo t(AccessibilityNodeInfo accessibilityNodeInfo, int i5) {
        int i6;
        if (accessibilityNodeInfo != null && accessibilityNodeInfo.getParent() != null) {
            if (i5 == 0) {
                return accessibilityNodeInfo;
            }
            if (accessibilityNodeInfo.getParent() != null) {
                i6 = 0;
                while (i6 < accessibilityNodeInfo.getParent().getChildCount()) {
                    if (accessibilityNodeInfo.equals(accessibilityNodeInfo.getParent().getChild(i6))) {
                        break;
                    }
                    i6++;
                }
            }
            i6 = -1;
            if (i6 != -1 && ((i5 >= 0 || i6 + i5 >= 0) && (i5 <= 0 || i6 + i5 < accessibilityNodeInfo.getParent().getChildCount()))) {
                return accessibilityNodeInfo.getParent().getChild(i6 + i5);
            }
        }
        return null;
    }

    public static String u(Rect rect) {
        StringBuilder sb = new StringBuilder();
        int i5 = rect.left;
        sb.append(((rect.right - i5) / 2) + i5);
        sb.append(",");
        int i6 = rect.top;
        sb.append(((rect.bottom - i6) / 2) + i6);
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object, kotlin.coroutines.CoroutineContext, kotlin.coroutines.EmptyCoroutineContext] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    public static u0 v(y yVar, Function2 function2) {
        Object createFailure;
        ?? r02 = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext = ((q3.d) yVar).f4760b;
        Boolean bool = Boolean.FALSE;
        u uVar = u.f4215b;
        boolean booleanValue = ((Boolean) coroutineContext.fold(bool, uVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) r02.fold(bool, uVar)).booleanValue();
        CoroutineContext coroutineContext2 = r02;
        CoroutineContext coroutineContext3 = coroutineContext;
        if (booleanValue || booleanValue2) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = r02;
            CoroutineContext coroutineContext4 = (CoroutineContext) coroutineContext.fold(r02, new m3.t(objectRef));
            if (booleanValue2) {
                objectRef.element = ((CoroutineContext) objectRef.element).fold(r02, m3.s.f4209b);
            }
            coroutineContext2 = (CoroutineContext) objectRef.element;
            coroutineContext3 = coroutineContext4;
        }
        CoroutineContext plus = coroutineContext3.plus(coroutineContext2);
        r3.c cVar = h0.f4179a;
        if (plus != cVar && plus.get(ContinuationInterceptor.Key) == null) {
            plus = plus.plus(cVar);
        }
        f1 f1Var = new f1(plus, true);
        int a5 = f.h.a(1);
        if (a5 == 0) {
            try {
                Continuation intercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(function2, f1Var, f1Var));
                Result.Companion companion = Result.Companion;
                q3.f.a(intercepted, Result.m16constructorimpl(Unit.INSTANCE), null);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                f1Var.resumeWith(Result.m16constructorimpl(ResultKt.createFailure(th)));
                throw th;
            }
        } else if (a5 != 1) {
            if (a5 == 2) {
                ContinuationKt.startCoroutine(function2, f1Var, f1Var);
            } else {
                if (a5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Continuation probeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(f1Var);
                try {
                    CoroutineContext coroutineContext5 = f1Var.f4155c;
                    Object b5 = q3.t.b(coroutineContext5, null);
                    try {
                        createFailure = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(f1Var, probeCoroutineCreated);
                    } finally {
                        q3.t.a(coroutineContext5, b5);
                    }
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.Companion;
                    createFailure = ResultKt.createFailure(th2);
                }
                if (createFailure != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    Result.Companion companion4 = Result.Companion;
                    probeCoroutineCreated.resumeWith(Result.m16constructorimpl(createFailure));
                }
            }
        }
        return f1Var;
    }

    public static String w(int i5) {
        switch (i5) {
            case 1:
                return "error";
            case 2:
                return "int";
            case 3:
                return TypedValues.Custom.S_FLOAT;
            case 4:
                return TypedValues.Custom.S_STRING;
            case 5:
                return "iso8601";
            case 6:
                return "true";
            case 7:
                return "false";
            case 8:
                return "null";
            case 9:
                return "new";
            case 10:
                return "(";
            case 11:
                return ")";
            case 12:
                return "{";
            case 13:
                return "}";
            case 14:
                return "[";
            case 15:
                return "]";
            case 16:
                return ",";
            case 17:
                return ":";
            case 18:
                return "ident";
            case 19:
                return "fieldName";
            case 20:
                return "EOF";
            case 21:
                return "Set";
            case 22:
                return "TreeSet";
            case 23:
                return "undefined";
            case 24:
                return ";";
            case 25:
                return ".";
            case 26:
                return "hex";
            default:
                return "Unknown";
        }
    }

    public static final Object x(Object obj) {
        if (obj instanceof n) {
            Result.Companion companion = Result.Companion;
            obj = ResultKt.createFailure(((n) obj).f4202a);
        } else {
            Result.Companion companion2 = Result.Companion;
        }
        return Result.m16constructorimpl(obj);
    }

    public static final int y(x segment, int i5) {
        int i6;
        Intrinsics.checkNotNullParameter(segment, "$this$segment");
        int[] binarySearch = segment.f2906h;
        int i7 = i5 + 1;
        int i8 = 0;
        int length = segment.f2905g.length;
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        int i9 = length - 1;
        while (true) {
            if (i8 <= i9) {
                i6 = (i8 + i9) >>> 1;
                int i10 = binarySearch[i6];
                if (i10 >= i7) {
                    if (i10 <= i7) {
                        break;
                    }
                    i9 = i6 - 1;
                } else {
                    i8 = i6 + 1;
                }
            } else {
                i6 = (-i8) - 1;
                break;
            }
        }
        return i6 >= 0 ? i6 : ~i6;
    }

    public static final long z(String str, long j5, long j6, long j7) {
        String A2 = A(str);
        if (A2 == null) {
            return j5;
        }
        Long longOrNull = StringsKt.toLongOrNull(A2);
        if (longOrNull == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + A2 + '\'').toString());
        }
        long longValue = longOrNull.longValue();
        boolean z4 = false;
        if (j6 <= longValue && longValue <= j7) {
            z4 = true;
        }
        if (z4) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j6 + ".." + j7 + ", but is '" + longValue + '\'').toString());
    }

    @Override // z0.j
    public boolean a(ComponentName componentName, String str) {
        return false;
    }

    @Override // z0.j
    public boolean b(Task task) {
        return false;
    }

    @Override // k2.q
    public Object c() {
        return new LinkedHashMap();
    }
}
