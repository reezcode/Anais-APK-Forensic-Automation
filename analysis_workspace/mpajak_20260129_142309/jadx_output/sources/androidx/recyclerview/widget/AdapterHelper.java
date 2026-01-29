package androidx.recyclerview.widget;

import androidx.core.util.Pools;
import androidx.recyclerview.widget.OpReorderer;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes14.dex */
class AdapterHelper implements OpReorderer.Callback {
    private static final boolean DEBUG = false;
    public static final int POSITION_TYPE_INVISIBLE = 0;
    public static final int POSITION_TYPE_NEW_OR_LAID_OUT = 1;
    private static final String TAG = "AHT";
    public final Callback mCallback;
    public final boolean mDisableRecycler;
    private int mExistingUpdateTypes;
    public Runnable mOnItemProcessedCallback;
    public final OpReorderer mOpReorderer;
    public final ArrayList<UpdateOp> mPendingUpdates;
    public final ArrayList<UpdateOp> mPostponedList;
    private Pools.Pool<UpdateOp> mUpdateOpPool;

    /* loaded from: classes17.dex */
    public interface Callback {
        RecyclerView.ViewHolder findViewHolder(int i5);

        void markViewHoldersUpdated(int i5, int i6, Object obj);

        void offsetPositionsForAdd(int i5, int i6);

        void offsetPositionsForMove(int i5, int i6);

        void offsetPositionsForRemovingInvisible(int i5, int i6);

        void offsetPositionsForRemovingLaidOutOrNewView(int i5, int i6);

        void onDispatchFirstPass(UpdateOp updateOp);

        void onDispatchSecondPass(UpdateOp updateOp);
    }

    /* loaded from: classes17.dex */
    public static class UpdateOp {
        public static final int ADD = 1;
        public static final int MOVE = 8;
        public static final int POOL_SIZE = 30;
        public static final int REMOVE = 2;
        public static final int UPDATE = 4;
        public int cmd;
        public int itemCount;
        public Object payload;
        public int positionStart;

        public UpdateOp(int i5, int i6, int i7, Object obj) {
            this.cmd = i5;
            this.positionStart = i6;
            this.itemCount = i7;
            this.payload = obj;
        }

        public String cmdToString() {
            int i5 = this.cmd;
            return i5 != 1 ? i5 != 2 ? i5 != 4 ? i5 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            UpdateOp updateOp = (UpdateOp) obj;
            int i5 = this.cmd;
            if (i5 != updateOp.cmd) {
                return false;
            }
            if (i5 == 8 && Math.abs(this.itemCount - this.positionStart) == 1 && this.itemCount == updateOp.positionStart && this.positionStart == updateOp.itemCount) {
                return true;
            }
            if (this.itemCount != updateOp.itemCount || this.positionStart != updateOp.positionStart) {
                return false;
            }
            Object obj2 = this.payload;
            Object obj3 = updateOp.payload;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.cmd * 31) + this.positionStart) * 31) + this.itemCount;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + cmdToString() + ",s:" + this.positionStart + "c:" + this.itemCount + ",p:" + this.payload + "]";
        }
    }

    public AdapterHelper(Callback callback) {
        this(callback, false);
    }

    public AdapterHelper(Callback callback, boolean z4) {
        this.mUpdateOpPool = new Pools.SimplePool(30);
        this.mPendingUpdates = new ArrayList<>();
        this.mPostponedList = new ArrayList<>();
        this.mExistingUpdateTypes = 0;
        this.mCallback = callback;
        this.mDisableRecycler = z4;
        this.mOpReorderer = new OpReorderer(this);
    }

    private void applyAdd(UpdateOp updateOp) {
        postponeAndUpdateViewHolders(updateOp);
    }

    private void applyMove(UpdateOp updateOp) {
        postponeAndUpdateViewHolders(updateOp);
    }

    private void applyRemove(UpdateOp updateOp) {
        boolean z4;
        char c5;
        int i5 = updateOp.positionStart;
        int i6 = updateOp.itemCount + i5;
        char c6 = 65535;
        int i7 = i5;
        int i8 = 0;
        while (i7 < i6) {
            if (this.mCallback.findViewHolder(i7) != null || canFindInPreLayout(i7)) {
                if (c6 == 0) {
                    dispatchAndUpdateViewHolders(obtainUpdateOp(2, i5, i8, null));
                    z4 = true;
                } else {
                    z4 = false;
                }
                c5 = 1;
            } else {
                if (c6 == 1) {
                    postponeAndUpdateViewHolders(obtainUpdateOp(2, i5, i8, null));
                    z4 = true;
                } else {
                    z4 = false;
                }
                c5 = 0;
            }
            if (z4) {
                i7 -= i8;
                i6 -= i8;
                i8 = 1;
            } else {
                i8++;
            }
            i7++;
            c6 = c5;
        }
        if (i8 != updateOp.itemCount) {
            recycleUpdateOp(updateOp);
            updateOp = obtainUpdateOp(2, i5, i8, null);
        }
        if (c6 == 0) {
            dispatchAndUpdateViewHolders(updateOp);
        } else {
            postponeAndUpdateViewHolders(updateOp);
        }
    }

    private void applyUpdate(UpdateOp updateOp) {
        int i5 = updateOp.positionStart;
        int i6 = updateOp.itemCount + i5;
        int i7 = i5;
        char c5 = 65535;
        int i8 = 0;
        while (i5 < i6) {
            if (this.mCallback.findViewHolder(i5) != null || canFindInPreLayout(i5)) {
                if (c5 == 0) {
                    dispatchAndUpdateViewHolders(obtainUpdateOp(4, i7, i8, updateOp.payload));
                    i7 = i5;
                    i8 = 0;
                }
                c5 = 1;
            } else {
                if (c5 == 1) {
                    postponeAndUpdateViewHolders(obtainUpdateOp(4, i7, i8, updateOp.payload));
                    i7 = i5;
                    i8 = 0;
                }
                c5 = 0;
            }
            i8++;
            i5++;
        }
        if (i8 != updateOp.itemCount) {
            Object obj = updateOp.payload;
            recycleUpdateOp(updateOp);
            updateOp = obtainUpdateOp(4, i7, i8, obj);
        }
        if (c5 == 0) {
            dispatchAndUpdateViewHolders(updateOp);
        } else {
            postponeAndUpdateViewHolders(updateOp);
        }
    }

    private boolean canFindInPreLayout(int i5) {
        int size = this.mPostponedList.size();
        for (int i6 = 0; i6 < size; i6++) {
            UpdateOp updateOp = this.mPostponedList.get(i6);
            int i7 = updateOp.cmd;
            if (i7 == 8) {
                if (findPositionOffset(updateOp.itemCount, i6 + 1) == i5) {
                    return true;
                }
            } else if (i7 == 1) {
                int i8 = updateOp.positionStart;
                int i9 = updateOp.itemCount + i8;
                while (i8 < i9) {
                    if (findPositionOffset(i8, i6 + 1) == i5) {
                        return true;
                    }
                    i8++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void dispatchAndUpdateViewHolders(UpdateOp updateOp) {
        int i5;
        int i6 = updateOp.cmd;
        if (i6 == 1 || i6 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int updatePositionWithPostponed = updatePositionWithPostponed(updateOp.positionStart, i6);
        int i7 = updateOp.positionStart;
        int i8 = updateOp.cmd;
        if (i8 == 2) {
            i5 = 0;
        } else {
            if (i8 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + updateOp);
            }
            i5 = 1;
        }
        int i9 = 1;
        for (int i10 = 1; i10 < updateOp.itemCount; i10++) {
            int updatePositionWithPostponed2 = updatePositionWithPostponed((i5 * i10) + updateOp.positionStart, updateOp.cmd);
            int i11 = updateOp.cmd;
            if (i11 == 2 ? updatePositionWithPostponed2 == updatePositionWithPostponed : i11 == 4 && updatePositionWithPostponed2 == updatePositionWithPostponed + 1) {
                i9++;
            } else {
                UpdateOp obtainUpdateOp = obtainUpdateOp(i11, updatePositionWithPostponed, i9, updateOp.payload);
                dispatchFirstPassAndUpdateViewHolders(obtainUpdateOp, i7);
                recycleUpdateOp(obtainUpdateOp);
                if (updateOp.cmd == 4) {
                    i7 += i9;
                }
                updatePositionWithPostponed = updatePositionWithPostponed2;
                i9 = 1;
            }
        }
        Object obj = updateOp.payload;
        recycleUpdateOp(updateOp);
        if (i9 > 0) {
            UpdateOp obtainUpdateOp2 = obtainUpdateOp(updateOp.cmd, updatePositionWithPostponed, i9, obj);
            dispatchFirstPassAndUpdateViewHolders(obtainUpdateOp2, i7);
            recycleUpdateOp(obtainUpdateOp2);
        }
    }

    private void postponeAndUpdateViewHolders(UpdateOp updateOp) {
        this.mPostponedList.add(updateOp);
        int i5 = updateOp.cmd;
        if (i5 == 1) {
            this.mCallback.offsetPositionsForAdd(updateOp.positionStart, updateOp.itemCount);
            return;
        }
        if (i5 == 2) {
            this.mCallback.offsetPositionsForRemovingLaidOutOrNewView(updateOp.positionStart, updateOp.itemCount);
            return;
        }
        if (i5 == 4) {
            this.mCallback.markViewHoldersUpdated(updateOp.positionStart, updateOp.itemCount, updateOp.payload);
        } else {
            if (i5 == 8) {
                this.mCallback.offsetPositionsForMove(updateOp.positionStart, updateOp.itemCount);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + updateOp);
        }
    }

    private int updatePositionWithPostponed(int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        for (int size = this.mPostponedList.size() - 1; size >= 0; size--) {
            UpdateOp updateOp = this.mPostponedList.get(size);
            int i13 = updateOp.cmd;
            if (i13 == 8) {
                int i14 = updateOp.positionStart;
                int i15 = updateOp.itemCount;
                if (i14 < i15) {
                    i9 = i14;
                    i8 = i15;
                } else {
                    i8 = i14;
                    i9 = i15;
                }
                if (i5 < i9 || i5 > i8) {
                    if (i5 < i14) {
                        if (i6 == 1) {
                            updateOp.positionStart = i14 + 1;
                            i10 = i15 + 1;
                        } else if (i6 == 2) {
                            updateOp.positionStart = i14 - 1;
                            i10 = i15 - 1;
                        }
                        updateOp.itemCount = i10;
                    }
                } else if (i9 == i14) {
                    if (i6 == 1) {
                        i12 = i15 + 1;
                    } else {
                        if (i6 == 2) {
                            i12 = i15 - 1;
                        }
                        i5++;
                    }
                    updateOp.itemCount = i12;
                    i5++;
                } else {
                    if (i6 == 1) {
                        i11 = i14 + 1;
                    } else {
                        if (i6 == 2) {
                            i11 = i14 - 1;
                        }
                        i5--;
                    }
                    updateOp.positionStart = i11;
                    i5--;
                }
            } else {
                int i16 = updateOp.positionStart;
                if (i16 > i5) {
                    if (i6 == 1) {
                        i7 = i16 + 1;
                    } else if (i6 == 2) {
                        i7 = i16 - 1;
                    }
                    updateOp.positionStart = i7;
                } else if (i13 == 1) {
                    i5 -= updateOp.itemCount;
                } else if (i13 == 2) {
                    i5 += updateOp.itemCount;
                }
            }
        }
        for (int size2 = this.mPostponedList.size() - 1; size2 >= 0; size2--) {
            UpdateOp updateOp2 = this.mPostponedList.get(size2);
            if (updateOp2.cmd == 8) {
                int i17 = updateOp2.itemCount;
                if (i17 != updateOp2.positionStart && i17 >= 0) {
                }
                this.mPostponedList.remove(size2);
                recycleUpdateOp(updateOp2);
            } else {
                if (updateOp2.itemCount > 0) {
                }
                this.mPostponedList.remove(size2);
                recycleUpdateOp(updateOp2);
            }
        }
        return i5;
    }

    public AdapterHelper addUpdateOp(UpdateOp... updateOpArr) {
        Collections.addAll(this.mPendingUpdates, updateOpArr);
        return this;
    }

    public int applyPendingUpdatesToPosition(int i5) {
        int size = this.mPendingUpdates.size();
        for (int i6 = 0; i6 < size; i6++) {
            UpdateOp updateOp = this.mPendingUpdates.get(i6);
            int i7 = updateOp.cmd;
            if (i7 != 1) {
                if (i7 == 2) {
                    int i8 = updateOp.positionStart;
                    if (i8 <= i5) {
                        int i9 = updateOp.itemCount;
                        if (i8 + i9 > i5) {
                            return -1;
                        }
                        i5 -= i9;
                    } else {
                        continue;
                    }
                } else if (i7 == 8) {
                    int i10 = updateOp.positionStart;
                    if (i10 == i5) {
                        i5 = updateOp.itemCount;
                    } else {
                        if (i10 < i5) {
                            i5--;
                        }
                        if (updateOp.itemCount <= i5) {
                            i5++;
                        }
                    }
                }
            } else if (updateOp.positionStart <= i5) {
                i5 += updateOp.itemCount;
            }
        }
        return i5;
    }

    public void consumePostponedUpdates() {
        int size = this.mPostponedList.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.mCallback.onDispatchSecondPass(this.mPostponedList.get(i5));
        }
        recycleUpdateOpsAndClearList(this.mPostponedList);
        this.mExistingUpdateTypes = 0;
    }

    public void consumeUpdatesInOnePass() {
        consumePostponedUpdates();
        int size = this.mPendingUpdates.size();
        for (int i5 = 0; i5 < size; i5++) {
            UpdateOp updateOp = this.mPendingUpdates.get(i5);
            int i6 = updateOp.cmd;
            if (i6 == 1) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.offsetPositionsForAdd(updateOp.positionStart, updateOp.itemCount);
            } else if (i6 == 2) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.offsetPositionsForRemovingInvisible(updateOp.positionStart, updateOp.itemCount);
            } else if (i6 == 4) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.markViewHoldersUpdated(updateOp.positionStart, updateOp.itemCount, updateOp.payload);
            } else if (i6 == 8) {
                this.mCallback.onDispatchSecondPass(updateOp);
                this.mCallback.offsetPositionsForMove(updateOp.positionStart, updateOp.itemCount);
            }
            Runnable runnable = this.mOnItemProcessedCallback;
            if (runnable != null) {
                runnable.run();
            }
        }
        recycleUpdateOpsAndClearList(this.mPendingUpdates);
        this.mExistingUpdateTypes = 0;
    }

    public void dispatchFirstPassAndUpdateViewHolders(UpdateOp updateOp, int i5) {
        this.mCallback.onDispatchFirstPass(updateOp);
        int i6 = updateOp.cmd;
        if (i6 == 2) {
            this.mCallback.offsetPositionsForRemovingInvisible(i5, updateOp.itemCount);
        } else {
            if (i6 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.mCallback.markViewHoldersUpdated(i5, updateOp.itemCount, updateOp.payload);
        }
    }

    public int findPositionOffset(int i5) {
        return findPositionOffset(i5, 0);
    }

    public int findPositionOffset(int i5, int i6) {
        int size = this.mPostponedList.size();
        while (i6 < size) {
            UpdateOp updateOp = this.mPostponedList.get(i6);
            int i7 = updateOp.cmd;
            if (i7 == 8) {
                int i8 = updateOp.positionStart;
                if (i8 == i5) {
                    i5 = updateOp.itemCount;
                } else {
                    if (i8 < i5) {
                        i5--;
                    }
                    if (updateOp.itemCount <= i5) {
                        i5++;
                    }
                }
            } else {
                int i9 = updateOp.positionStart;
                if (i9 > i5) {
                    continue;
                } else if (i7 == 2) {
                    int i10 = updateOp.itemCount;
                    if (i5 < i9 + i10) {
                        return -1;
                    }
                    i5 -= i10;
                } else if (i7 == 1) {
                    i5 += updateOp.itemCount;
                }
            }
            i6++;
        }
        return i5;
    }

    public boolean hasAnyUpdateTypes(int i5) {
        return (i5 & this.mExistingUpdateTypes) != 0;
    }

    public boolean hasPendingUpdates() {
        return this.mPendingUpdates.size() > 0;
    }

    public boolean hasUpdates() {
        return (this.mPostponedList.isEmpty() || this.mPendingUpdates.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    public UpdateOp obtainUpdateOp(int i5, int i6, int i7, Object obj) {
        UpdateOp acquire = this.mUpdateOpPool.acquire();
        if (acquire == null) {
            return new UpdateOp(i5, i6, i7, obj);
        }
        acquire.cmd = i5;
        acquire.positionStart = i6;
        acquire.itemCount = i7;
        acquire.payload = obj;
        return acquire;
    }

    public boolean onItemRangeChanged(int i5, int i6, Object obj) {
        if (i6 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(4, i5, i6, obj));
        this.mExistingUpdateTypes |= 4;
        return this.mPendingUpdates.size() == 1;
    }

    public boolean onItemRangeInserted(int i5, int i6) {
        if (i6 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(1, i5, i6, null));
        this.mExistingUpdateTypes |= 1;
        return this.mPendingUpdates.size() == 1;
    }

    public boolean onItemRangeMoved(int i5, int i6, int i7) {
        if (i5 == i6) {
            return false;
        }
        if (i7 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.mPendingUpdates.add(obtainUpdateOp(8, i5, i6, null));
        this.mExistingUpdateTypes |= 8;
        return this.mPendingUpdates.size() == 1;
    }

    public boolean onItemRangeRemoved(int i5, int i6) {
        if (i6 < 1) {
            return false;
        }
        this.mPendingUpdates.add(obtainUpdateOp(2, i5, i6, null));
        this.mExistingUpdateTypes |= 2;
        return this.mPendingUpdates.size() == 1;
    }

    public void preProcess() {
        this.mOpReorderer.reorderOps(this.mPendingUpdates);
        int size = this.mPendingUpdates.size();
        for (int i5 = 0; i5 < size; i5++) {
            UpdateOp updateOp = this.mPendingUpdates.get(i5);
            int i6 = updateOp.cmd;
            if (i6 == 1) {
                applyAdd(updateOp);
            } else if (i6 == 2) {
                applyRemove(updateOp);
            } else if (i6 == 4) {
                applyUpdate(updateOp);
            } else if (i6 == 8) {
                applyMove(updateOp);
            }
            Runnable runnable = this.mOnItemProcessedCallback;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.mPendingUpdates.clear();
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    public void recycleUpdateOp(UpdateOp updateOp) {
        if (this.mDisableRecycler) {
            return;
        }
        updateOp.payload = null;
        this.mUpdateOpPool.release(updateOp);
    }

    public void recycleUpdateOpsAndClearList(List<UpdateOp> list) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            recycleUpdateOp(list.get(i5));
        }
        list.clear();
    }

    public void reset() {
        recycleUpdateOpsAndClearList(this.mPendingUpdates);
        recycleUpdateOpsAndClearList(this.mPostponedList);
        this.mExistingUpdateTypes = 0;
    }
}
