package androidx.appcompat.widget;

/* loaded from: classes20.dex */
class RtlSpacingHelper {
    public static final int UNDEFINED = Integer.MIN_VALUE;
    private int mLeft = 0;
    private int mRight = 0;
    private int mStart = Integer.MIN_VALUE;
    private int mEnd = Integer.MIN_VALUE;
    private int mExplicitLeft = 0;
    private int mExplicitRight = 0;
    private boolean mIsRtl = false;
    private boolean mIsRelative = false;

    public int getEnd() {
        return this.mIsRtl ? this.mLeft : this.mRight;
    }

    public int getLeft() {
        return this.mLeft;
    }

    public int getRight() {
        return this.mRight;
    }

    public int getStart() {
        return this.mIsRtl ? this.mRight : this.mLeft;
    }

    public void setAbsolute(int i5, int i6) {
        this.mIsRelative = false;
        if (i5 != Integer.MIN_VALUE) {
            this.mExplicitLeft = i5;
            this.mLeft = i5;
        }
        if (i6 != Integer.MIN_VALUE) {
            this.mExplicitRight = i6;
            this.mRight = i6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        if (r2 != Integer.MIN_VALUE) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
    
        if (r2 != Integer.MIN_VALUE) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setDirection(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.mIsRtl
            if (r2 != r0) goto L5
            return
        L5:
            r1.mIsRtl = r2
            boolean r0 = r1.mIsRelative
            if (r0 == 0) goto L2b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L1d
            int r2 = r1.mEnd
            if (r2 == r0) goto L14
            goto L16
        L14:
            int r2 = r1.mExplicitLeft
        L16:
            r1.mLeft = r2
            int r2 = r1.mStart
            if (r2 == r0) goto L2f
            goto L31
        L1d:
            int r2 = r1.mStart
            if (r2 == r0) goto L22
            goto L24
        L22:
            int r2 = r1.mExplicitLeft
        L24:
            r1.mLeft = r2
            int r2 = r1.mEnd
            if (r2 == r0) goto L2f
            goto L31
        L2b:
            int r2 = r1.mExplicitLeft
            r1.mLeft = r2
        L2f:
            int r2 = r1.mExplicitRight
        L31:
            r1.mRight = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.RtlSpacingHelper.setDirection(boolean):void");
    }

    public void setRelative(int i5, int i6) {
        this.mStart = i5;
        this.mEnd = i6;
        this.mIsRelative = true;
        if (this.mIsRtl) {
            if (i6 != Integer.MIN_VALUE) {
                this.mLeft = i6;
            }
            if (i5 != Integer.MIN_VALUE) {
                this.mRight = i5;
                return;
            }
            return;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.mLeft = i5;
        }
        if (i6 != Integer.MIN_VALUE) {
            this.mRight = i6;
        }
    }
}
