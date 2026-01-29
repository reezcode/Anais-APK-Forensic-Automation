package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;

/* loaded from: classes5.dex */
public class AlignHorizontallyReference extends HelperReference {
    private float mBias;

    public AlignHorizontallyReference(State state) {
        super(state, State.Helper.ALIGN_VERTICALLY);
        this.mBias = 0.5f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void apply() {
        /*
            r4 = this;
            java.util.ArrayList<java.lang.Object> r0 = r4.mReferences
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.state.State r2 = r4.mState
            androidx.constraintlayout.core.state.ConstraintReference r1 = r2.constraints(r1)
            r1.clearHorizontal()
            java.lang.Object r2 = r4.mStartToStart
            if (r2 == 0) goto L21
        L1d:
            r1.startToStart(r2)
            goto L2c
        L21:
            java.lang.Object r2 = r4.mStartToEnd
            if (r2 == 0) goto L29
            r1.startToEnd(r2)
            goto L2c
        L29:
            java.lang.Integer r2 = androidx.constraintlayout.core.state.State.PARENT
            goto L1d
        L2c:
            java.lang.Object r2 = r4.mEndToStart
            if (r2 == 0) goto L34
            r1.endToStart(r2)
            goto L3e
        L34:
            java.lang.Object r2 = r4.mEndToEnd
            if (r2 == 0) goto L39
            goto L3b
        L39:
            java.lang.Integer r2 = androidx.constraintlayout.core.state.State.PARENT
        L3b:
            r1.endToEnd(r2)
        L3e:
            float r2 = r4.mBias
            r3 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L6
            r1.horizontalBias(r2)
            goto L6
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.helpers.AlignHorizontallyReference.apply():void");
    }
}
