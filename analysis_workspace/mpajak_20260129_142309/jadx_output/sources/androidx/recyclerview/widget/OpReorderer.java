package androidx.recyclerview.widget;

import androidx.recyclerview.widget.AdapterHelper;
import java.util.List;

/* loaded from: classes17.dex */
class OpReorderer {
    public final Callback mCallback;

    /* loaded from: classes23.dex */
    public interface Callback {
        AdapterHelper.UpdateOp obtainUpdateOp(int i5, int i6, int i7, Object obj);

        void recycleUpdateOp(AdapterHelper.UpdateOp updateOp);
    }

    public OpReorderer(Callback callback) {
        this.mCallback = callback;
    }

    private int getLastMoveOutOfOrder(List<AdapterHelper.UpdateOp> list) {
        boolean z4 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).cmd != 8) {
                z4 = true;
            } else if (z4) {
                return size;
            }
        }
        return -1;
    }

    private void swapMoveAdd(List<AdapterHelper.UpdateOp> list, int i5, AdapterHelper.UpdateOp updateOp, int i6, AdapterHelper.UpdateOp updateOp2) {
        int i7 = updateOp.itemCount;
        int i8 = updateOp2.positionStart;
        int i9 = i7 < i8 ? -1 : 0;
        int i10 = updateOp.positionStart;
        if (i10 < i8) {
            i9++;
        }
        if (i8 <= i10) {
            updateOp.positionStart = i10 + updateOp2.itemCount;
        }
        int i11 = updateOp2.positionStart;
        if (i11 <= i7) {
            updateOp.itemCount = i7 + updateOp2.itemCount;
        }
        updateOp2.positionStart = i11 + i9;
        list.set(i5, updateOp2);
        list.set(i6, updateOp);
    }

    private void swapMoveOp(List<AdapterHelper.UpdateOp> list, int i5, int i6) {
        AdapterHelper.UpdateOp updateOp = list.get(i5);
        AdapterHelper.UpdateOp updateOp2 = list.get(i6);
        int i7 = updateOp2.cmd;
        if (i7 == 1) {
            swapMoveAdd(list, i5, updateOp, i6, updateOp2);
        } else if (i7 == 2) {
            swapMoveRemove(list, i5, updateOp, i6, updateOp2);
        } else {
            if (i7 != 4) {
                return;
            }
            swapMoveUpdate(list, i5, updateOp, i6, updateOp2);
        }
    }

    public void reorderOps(List<AdapterHelper.UpdateOp> list) {
        while (true) {
            int lastMoveOutOfOrder = getLastMoveOutOfOrder(list);
            if (lastMoveOutOfOrder == -1) {
                return;
            } else {
                swapMoveOp(list, lastMoveOutOfOrder, lastMoveOutOfOrder + 1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        if (r0 > r14.positionStart) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
    
        r12.itemCount = r0 - r14.itemCount;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c7, code lost:
    
        if (r0 >= r14.positionStart) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void swapMoveRemove(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> r10, int r11, androidx.recyclerview.widget.AdapterHelper.UpdateOp r12, int r13, androidx.recyclerview.widget.AdapterHelper.UpdateOp r14) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.OpReorderer.swapMoveRemove(java.util.List, int, androidx.recyclerview.widget.AdapterHelper$UpdateOp, int, androidx.recyclerview.widget.AdapterHelper$UpdateOp):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void swapMoveUpdate(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> r9, int r10, androidx.recyclerview.widget.AdapterHelper.UpdateOp r11, int r12, androidx.recyclerview.widget.AdapterHelper.UpdateOp r13) {
        /*
            r8 = this;
            int r0 = r11.itemCount
            int r1 = r13.positionStart
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto Ld
            int r1 = r1 - r4
            r13.positionStart = r1
            goto L20
        Ld:
            int r5 = r13.itemCount
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r4
            r13.itemCount = r5
            androidx.recyclerview.widget.OpReorderer$Callback r0 = r8.mCallback
            int r1 = r11.positionStart
            java.lang.Object r5 = r13.payload
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r0 = r0.obtainUpdateOp(r2, r1, r4, r5)
            goto L21
        L20:
            r0 = r3
        L21:
            int r1 = r11.positionStart
            int r5 = r13.positionStart
            if (r1 > r5) goto L2b
            int r5 = r5 + r4
            r13.positionStart = r5
            goto L41
        L2b:
            int r6 = r13.itemCount
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.OpReorderer$Callback r3 = r8.mCallback
            int r1 = r1 + r4
            java.lang.Object r4 = r13.payload
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r3 = r3.obtainUpdateOp(r2, r1, r5, r4)
            int r1 = r13.itemCount
            int r1 = r1 - r5
            r13.itemCount = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.itemCount
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.OpReorderer$Callback r11 = r8.mCallback
            r11.recycleUpdateOp(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r3 == 0) goto L5e
            r9.add(r10, r3)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.OpReorderer.swapMoveUpdate(java.util.List, int, androidx.recyclerview.widget.AdapterHelper$UpdateOp, int, androidx.recyclerview.widget.AdapterHelper$UpdateOp):void");
    }
}
