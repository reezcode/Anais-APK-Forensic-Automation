package v1;

import androidx.core.view.OnApplyWindowInsetsListener;
import v1.r;

/* loaded from: classes9.dex */
public final class p implements OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r.a f5637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r.b f5638b;

    public p(r.a aVar, r.b bVar) {
        this.f5637a = aVar;
        this.f5638b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af A[ADDED_TO_REGION] */
    @Override // androidx.core.view.OnApplyWindowInsetsListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View r13, androidx.core.view.WindowInsetsCompat r14) {
        /*
            r12 = this;
            v1.r$a r0 = r12.f5637a
            v1.r$b r1 = r12.f5638b
            int r2 = r1.f5639a
            int r3 = r1.f5640b
            int r1 = r1.f5641c
            i1.b r0 = (i1.b) r0
            java.util.Objects.requireNonNull(r0)
            int r4 = androidx.core.view.WindowInsetsCompat.Type.systemBars()
            androidx.core.graphics.Insets r4 = r14.getInsets(r4)
            int r5 = androidx.core.view.WindowInsetsCompat.Type.mandatorySystemGestures()
            androidx.core.graphics.Insets r5 = r14.getInsets(r5)
            com.google.android.material.bottomsheet.BottomSheetBehavior r6 = r0.f3259b
            int r7 = r4.top
            r6.f800v = r7
            boolean r6 = v1.r.a(r13)
            int r7 = r13.getPaddingBottom()
            int r8 = r13.getPaddingLeft()
            int r9 = r13.getPaddingRight()
            com.google.android.material.bottomsheet.BottomSheetBehavior r10 = r0.f3259b
            boolean r11 = r10.f792n
            if (r11 == 0) goto L46
            int r7 = r14.getSystemWindowInsetBottom()
            r10.f799u = r7
            com.google.android.material.bottomsheet.BottomSheetBehavior r7 = r0.f3259b
            int r7 = r7.f799u
            int r7 = r7 + r1
        L46:
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r0.f3259b
            boolean r10 = r1.f793o
            if (r10 == 0) goto L54
            if (r6 == 0) goto L50
            r8 = r3
            goto L51
        L50:
            r8 = r2
        L51:
            int r10 = r4.left
            int r8 = r8 + r10
        L54:
            boolean r1 = r1.f794p
            if (r1 == 0) goto L60
            if (r6 == 0) goto L5b
            goto L5c
        L5b:
            r2 = r3
        L5c:
            int r1 = r4.right
            int r9 = r2 + r1
        L60:
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r0.f3259b
            boolean r3 = r2.f796r
            r6 = 1
            if (r3 == 0) goto L77
            int r3 = r1.leftMargin
            int r10 = r4.left
            if (r3 == r10) goto L77
            r1.leftMargin = r10
            r3 = 1
            goto L78
        L77:
            r3 = 0
        L78:
            boolean r10 = r2.f797s
            if (r10 == 0) goto L85
            int r10 = r1.rightMargin
            int r11 = r4.right
            if (r10 == r11) goto L85
            r1.rightMargin = r11
            r3 = 1
        L85:
            boolean r2 = r2.f798t
            if (r2 == 0) goto L92
            int r2 = r1.topMargin
            int r4 = r4.top
            if (r2 == r4) goto L92
            r1.topMargin = r4
            goto L93
        L92:
            r6 = r3
        L93:
            if (r6 == 0) goto L98
            r13.setLayoutParams(r1)
        L98:
            int r1 = r13.getPaddingTop()
            r13.setPadding(r8, r1, r9, r7)
            boolean r13 = r0.f3258a
            if (r13 == 0) goto La9
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r0.f3259b
            int r2 = r5.bottom
            r1.f790l = r2
        La9:
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r0.f3259b
            boolean r1 = r0.f792n
            if (r1 != 0) goto Lb1
            if (r13 == 0) goto Lb4
        Lb1:
            r0.q()
        Lb4:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.p.onApplyWindowInsets(android.view.View, androidx.core.view.WindowInsetsCompat):androidx.core.view.WindowInsetsCompat");
    }
}
