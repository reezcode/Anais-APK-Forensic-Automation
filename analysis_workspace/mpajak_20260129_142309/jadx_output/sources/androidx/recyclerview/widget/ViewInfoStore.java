package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes16.dex */
class ViewInfoStore {
    private static final boolean DEBUG = false;

    @VisibleForTesting
    public final SimpleArrayMap<RecyclerView.ViewHolder, InfoRecord> mLayoutHolderMap = new SimpleArrayMap<>();

    @VisibleForTesting
    public final LongSparseArray<RecyclerView.ViewHolder> mOldChangedHolders = new LongSparseArray<>();

    /* loaded from: classes12.dex */
    public static class InfoRecord {
        public static final int FLAG_APPEAR = 2;
        public static final int FLAG_APPEAR_AND_DISAPPEAR = 3;
        public static final int FLAG_APPEAR_PRE_AND_POST = 14;
        public static final int FLAG_DISAPPEARED = 1;
        public static final int FLAG_POST = 8;
        public static final int FLAG_PRE = 4;
        public static final int FLAG_PRE_AND_POST = 12;
        public static Pools.Pool<InfoRecord> sPool = new Pools.SimplePool(20);
        public int flags;

        @Nullable
        public RecyclerView.ItemAnimator.ItemHolderInfo postInfo;

        @Nullable
        public RecyclerView.ItemAnimator.ItemHolderInfo preInfo;

        private InfoRecord() {
        }

        public static void drainCache() {
            while (sPool.acquire() != null) {
            }
        }

        public static InfoRecord obtain() {
            InfoRecord acquire = sPool.acquire();
            return acquire == null ? new InfoRecord() : acquire;
        }

        public static void recycle(InfoRecord infoRecord) {
            infoRecord.flags = 0;
            infoRecord.preInfo = null;
            infoRecord.postInfo = null;
            sPool.release(infoRecord);
        }
    }

    /* loaded from: classes5.dex */
    public interface ProcessCallback {
        void processAppeared(RecyclerView.ViewHolder viewHolder, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void processDisappeared(RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void processPersistent(RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void unused(RecyclerView.ViewHolder viewHolder);
    }

    private RecyclerView.ItemAnimator.ItemHolderInfo popFromLayoutStep(RecyclerView.ViewHolder viewHolder, int i5) {
        InfoRecord valueAt;
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo;
        int indexOfKey = this.mLayoutHolderMap.indexOfKey(viewHolder);
        if (indexOfKey >= 0 && (valueAt = this.mLayoutHolderMap.valueAt(indexOfKey)) != null) {
            int i6 = valueAt.flags;
            if ((i6 & i5) != 0) {
                int i7 = (~i5) & i6;
                valueAt.flags = i7;
                if (i5 == 4) {
                    itemHolderInfo = valueAt.preInfo;
                } else {
                    if (i5 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    itemHolderInfo = valueAt.postInfo;
                }
                if ((i7 & 12) == 0) {
                    this.mLayoutHolderMap.removeAt(indexOfKey);
                    InfoRecord.recycle(valueAt);
                }
                return itemHolderInfo;
            }
        }
        return null;
    }

    public void addToAppearedInPreLayoutHolders(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecord);
        }
        infoRecord.flags |= 2;
        infoRecord.preInfo = itemHolderInfo;
    }

    public void addToDisappearedInLayout(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecord);
        }
        infoRecord.flags |= 1;
    }

    public void addToOldChangeHolders(long j5, RecyclerView.ViewHolder viewHolder) {
        this.mOldChangedHolders.put(j5, viewHolder);
    }

    public void addToPostLayout(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecord);
        }
        infoRecord.postInfo = itemHolderInfo;
        infoRecord.flags |= 8;
    }

    public void addToPreLayout(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecord);
        }
        infoRecord.preInfo = itemHolderInfo;
        infoRecord.flags |= 4;
    }

    public void clear() {
        this.mLayoutHolderMap.clear();
        this.mOldChangedHolders.clear();
    }

    public RecyclerView.ViewHolder getFromOldChangeHolders(long j5) {
        return this.mOldChangedHolders.get(j5);
    }

    public boolean isDisappearing(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        return (infoRecord == null || (infoRecord.flags & 1) == 0) ? false : true;
    }

    public boolean isInPreLayout(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        return (infoRecord == null || (infoRecord.flags & 4) == 0) ? false : true;
    }

    public void onDetach() {
        InfoRecord.drainCache();
    }

    public void onViewDetached(RecyclerView.ViewHolder viewHolder) {
        removeFromDisappearedInLayout(viewHolder);
    }

    @Nullable
    public RecyclerView.ItemAnimator.ItemHolderInfo popFromPostLayout(RecyclerView.ViewHolder viewHolder) {
        return popFromLayoutStep(viewHolder, 8);
    }

    @Nullable
    public RecyclerView.ItemAnimator.ItemHolderInfo popFromPreLayout(RecyclerView.ViewHolder viewHolder) {
        return popFromLayoutStep(viewHolder, 4);
    }

    public void process(ProcessCallback processCallback) {
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo;
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2;
        for (int size = this.mLayoutHolderMap.size() - 1; size >= 0; size--) {
            RecyclerView.ViewHolder keyAt = this.mLayoutHolderMap.keyAt(size);
            InfoRecord removeAt = this.mLayoutHolderMap.removeAt(size);
            int i5 = removeAt.flags;
            if ((i5 & 3) != 3) {
                if ((i5 & 1) != 0) {
                    itemHolderInfo = removeAt.preInfo;
                    itemHolderInfo2 = itemHolderInfo != null ? removeAt.postInfo : null;
                } else {
                    if ((i5 & 14) != 14) {
                        if ((i5 & 12) == 12) {
                            processCallback.processPersistent(keyAt, removeAt.preInfo, removeAt.postInfo);
                        } else if ((i5 & 4) != 0) {
                            itemHolderInfo = removeAt.preInfo;
                        } else if ((i5 & 8) == 0) {
                        }
                        InfoRecord.recycle(removeAt);
                    }
                    processCallback.processAppeared(keyAt, removeAt.preInfo, removeAt.postInfo);
                    InfoRecord.recycle(removeAt);
                }
                processCallback.processDisappeared(keyAt, itemHolderInfo, itemHolderInfo2);
                InfoRecord.recycle(removeAt);
            }
            processCallback.unused(keyAt);
            InfoRecord.recycle(removeAt);
        }
    }

    public void removeFromDisappearedInLayout(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            return;
        }
        infoRecord.flags &= -2;
    }

    public void removeViewHolder(RecyclerView.ViewHolder viewHolder) {
        int size = this.mOldChangedHolders.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (viewHolder == this.mOldChangedHolders.valueAt(size)) {
                this.mOldChangedHolders.removeAt(size);
                break;
            }
            size--;
        }
        InfoRecord remove = this.mLayoutHolderMap.remove(viewHolder);
        if (remove != null) {
            InfoRecord.recycle(remove);
        }
    }
}
