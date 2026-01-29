package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.activity.d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import androidx.recyclerview.widget.ThreadUtil;
import androidx.recyclerview.widget.TileList;

/* loaded from: classes18.dex */
public class AsyncListUtil<T> {
    public static final boolean DEBUG = false;
    public static final String TAG = "AsyncListUtil";
    public boolean mAllowScrollHints;
    private final ThreadUtil.BackgroundCallback<T> mBackgroundCallback;
    public final ThreadUtil.BackgroundCallback<T> mBackgroundProxy;
    public final DataCallback<T> mDataCallback;
    private final ThreadUtil.MainThreadCallback<T> mMainThreadCallback;
    public final ThreadUtil.MainThreadCallback<T> mMainThreadProxy;
    public final Class<T> mTClass;
    public final TileList<T> mTileList;
    public final int mTileSize;
    public final ViewCallback mViewCallback;
    public final int[] mTmpRange = new int[2];
    public final int[] mPrevRange = new int[2];
    public final int[] mTmpRangeExtended = new int[2];
    private int mScrollHint = 0;
    public int mItemCount = 0;
    public int mDisplayedGeneration = 0;
    public int mRequestedGeneration = 0;
    public final SparseIntArray mMissingPositions = new SparseIntArray();

    /* loaded from: classes24.dex */
    public static abstract class DataCallback<T> {
        @WorkerThread
        public abstract void fillData(@NonNull T[] tArr, int i5, int i6);

        @WorkerThread
        public int getMaxCachedTiles() {
            return 10;
        }

        @WorkerThread
        public void recycleData(@NonNull T[] tArr, int i5) {
        }

        @WorkerThread
        public abstract int refreshData();
    }

    /* loaded from: classes20.dex */
    public static abstract class ViewCallback {
        public static final int HINT_SCROLL_ASC = 2;
        public static final int HINT_SCROLL_DESC = 1;
        public static final int HINT_SCROLL_NONE = 0;

        @UiThread
        public void extendRangeInto(@NonNull int[] iArr, @NonNull int[] iArr2, int i5) {
            int i6 = (iArr[1] - iArr[0]) + 1;
            int i7 = i6 / 2;
            iArr2[0] = iArr[0] - (i5 == 1 ? i6 : i7);
            int i8 = iArr[1];
            if (i5 != 2) {
                i6 = i7;
            }
            iArr2[1] = i8 + i6;
        }

        @UiThread
        public abstract void getItemRangeInto(@NonNull int[] iArr);

        @UiThread
        public abstract void onDataRefresh();

        @UiThread
        public abstract void onItemLoaded(int i5);
    }

    public AsyncListUtil(@NonNull Class<T> cls, int i5, @NonNull DataCallback<T> dataCallback, @NonNull ViewCallback viewCallback) {
        ThreadUtil.MainThreadCallback<T> mainThreadCallback = new ThreadUtil.MainThreadCallback<T>() { // from class: androidx.recyclerview.widget.AsyncListUtil.1
            private boolean isRequestedGeneration(int i6) {
                return i6 == AsyncListUtil.this.mRequestedGeneration;
            }

            private void recycleAllTiles() {
                for (int i6 = 0; i6 < AsyncListUtil.this.mTileList.size(); i6++) {
                    AsyncListUtil asyncListUtil = AsyncListUtil.this;
                    asyncListUtil.mBackgroundProxy.recycleTile(asyncListUtil.mTileList.getAtIndex(i6));
                }
                AsyncListUtil.this.mTileList.clear();
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
            public void addTile(int i6, TileList.Tile<T> tile) {
                if (!isRequestedGeneration(i6)) {
                    AsyncListUtil.this.mBackgroundProxy.recycleTile(tile);
                    return;
                }
                TileList.Tile<T> addOrReplace = AsyncListUtil.this.mTileList.addOrReplace(tile);
                if (addOrReplace != null) {
                    StringBuilder g5 = d.g("duplicate tile @");
                    g5.append(addOrReplace.mStartPosition);
                    Log.e(AsyncListUtil.TAG, g5.toString());
                    AsyncListUtil.this.mBackgroundProxy.recycleTile(addOrReplace);
                }
                int i7 = tile.mStartPosition + tile.mItemCount;
                int i8 = 0;
                while (i8 < AsyncListUtil.this.mMissingPositions.size()) {
                    int keyAt = AsyncListUtil.this.mMissingPositions.keyAt(i8);
                    if (tile.mStartPosition > keyAt || keyAt >= i7) {
                        i8++;
                    } else {
                        AsyncListUtil.this.mMissingPositions.removeAt(i8);
                        AsyncListUtil.this.mViewCallback.onItemLoaded(keyAt);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
            public void removeTile(int i6, int i7) {
                if (isRequestedGeneration(i6)) {
                    TileList.Tile<T> removeAtPos = AsyncListUtil.this.mTileList.removeAtPos(i7);
                    if (removeAtPos != null) {
                        AsyncListUtil.this.mBackgroundProxy.recycleTile(removeAtPos);
                        return;
                    }
                    Log.e(AsyncListUtil.TAG, "tile not found @" + i7);
                }
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
            public void updateItemCount(int i6, int i7) {
                if (isRequestedGeneration(i6)) {
                    AsyncListUtil asyncListUtil = AsyncListUtil.this;
                    asyncListUtil.mItemCount = i7;
                    asyncListUtil.mViewCallback.onDataRefresh();
                    AsyncListUtil asyncListUtil2 = AsyncListUtil.this;
                    asyncListUtil2.mDisplayedGeneration = asyncListUtil2.mRequestedGeneration;
                    recycleAllTiles();
                    AsyncListUtil asyncListUtil3 = AsyncListUtil.this;
                    asyncListUtil3.mAllowScrollHints = false;
                    asyncListUtil3.updateRange();
                }
            }
        };
        this.mMainThreadCallback = mainThreadCallback;
        ThreadUtil.BackgroundCallback<T> backgroundCallback = new ThreadUtil.BackgroundCallback<T>() { // from class: androidx.recyclerview.widget.AsyncListUtil.2
            private int mFirstRequiredTileStart;
            private int mGeneration;
            private int mItemCount;
            private int mLastRequiredTileStart;
            public final SparseBooleanArray mLoadedTiles = new SparseBooleanArray();
            private TileList.Tile<T> mRecycledRoot;

            private TileList.Tile<T> acquireTile() {
                TileList.Tile<T> tile = this.mRecycledRoot;
                if (tile != null) {
                    this.mRecycledRoot = tile.mNext;
                    return tile;
                }
                AsyncListUtil asyncListUtil = AsyncListUtil.this;
                return new TileList.Tile<>(asyncListUtil.mTClass, asyncListUtil.mTileSize);
            }

            private void addTile(TileList.Tile<T> tile) {
                this.mLoadedTiles.put(tile.mStartPosition, true);
                AsyncListUtil.this.mMainThreadProxy.addTile(this.mGeneration, tile);
            }

            private void flushTileCache(int i6) {
                int maxCachedTiles = AsyncListUtil.this.mDataCallback.getMaxCachedTiles();
                while (this.mLoadedTiles.size() >= maxCachedTiles) {
                    int keyAt = this.mLoadedTiles.keyAt(0);
                    SparseBooleanArray sparseBooleanArray = this.mLoadedTiles;
                    int keyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                    int i7 = this.mFirstRequiredTileStart - keyAt;
                    int i8 = keyAt2 - this.mLastRequiredTileStart;
                    if (i7 > 0 && (i7 >= i8 || i6 == 2)) {
                        removeTile(keyAt);
                    } else {
                        if (i8 <= 0) {
                            return;
                        }
                        if (i7 >= i8 && i6 != 1) {
                            return;
                        } else {
                            removeTile(keyAt2);
                        }
                    }
                }
            }

            private int getTileStart(int i6) {
                return i6 - (i6 % AsyncListUtil.this.mTileSize);
            }

            private boolean isTileLoaded(int i6) {
                return this.mLoadedTiles.get(i6);
            }

            private void log(String str, Object... objArr) {
                StringBuilder g5 = d.g("[BKGR] ");
                g5.append(String.format(str, objArr));
                Log.d(AsyncListUtil.TAG, g5.toString());
            }

            private void removeTile(int i6) {
                this.mLoadedTiles.delete(i6);
                AsyncListUtil.this.mMainThreadProxy.removeTile(this.mGeneration, i6);
            }

            private void requestTiles(int i6, int i7, int i8, boolean z4) {
                int i9 = i6;
                while (i9 <= i7) {
                    AsyncListUtil.this.mBackgroundProxy.loadTile(z4 ? (i7 + i6) - i9 : i9, i8);
                    i9 += AsyncListUtil.this.mTileSize;
                }
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void loadTile(int i6, int i7) {
                if (isTileLoaded(i6)) {
                    return;
                }
                TileList.Tile<T> acquireTile = acquireTile();
                acquireTile.mStartPosition = i6;
                int min = Math.min(AsyncListUtil.this.mTileSize, this.mItemCount - i6);
                acquireTile.mItemCount = min;
                AsyncListUtil.this.mDataCallback.fillData(acquireTile.mItems, acquireTile.mStartPosition, min);
                flushTileCache(i7);
                addTile(acquireTile);
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void recycleTile(TileList.Tile<T> tile) {
                AsyncListUtil.this.mDataCallback.recycleData(tile.mItems, tile.mItemCount);
                tile.mNext = this.mRecycledRoot;
                this.mRecycledRoot = tile;
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void refresh(int i6) {
                this.mGeneration = i6;
                this.mLoadedTiles.clear();
                int refreshData = AsyncListUtil.this.mDataCallback.refreshData();
                this.mItemCount = refreshData;
                AsyncListUtil.this.mMainThreadProxy.updateItemCount(this.mGeneration, refreshData);
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void updateRange(int i6, int i7, int i8, int i9, int i10) {
                if (i6 > i7) {
                    return;
                }
                int tileStart = getTileStart(i6);
                int tileStart2 = getTileStart(i7);
                this.mFirstRequiredTileStart = getTileStart(i8);
                int tileStart3 = getTileStart(i9);
                this.mLastRequiredTileStart = tileStart3;
                if (i10 == 1) {
                    requestTiles(this.mFirstRequiredTileStart, tileStart2, i10, true);
                    requestTiles(tileStart2 + AsyncListUtil.this.mTileSize, this.mLastRequiredTileStart, i10, false);
                } else {
                    requestTiles(tileStart, tileStart3, i10, false);
                    requestTiles(this.mFirstRequiredTileStart, tileStart - AsyncListUtil.this.mTileSize, i10, true);
                }
            }
        };
        this.mBackgroundCallback = backgroundCallback;
        this.mTClass = cls;
        this.mTileSize = i5;
        this.mDataCallback = dataCallback;
        this.mViewCallback = viewCallback;
        this.mTileList = new TileList<>(i5);
        MessageThreadUtil messageThreadUtil = new MessageThreadUtil();
        this.mMainThreadProxy = messageThreadUtil.getMainThreadProxy(mainThreadCallback);
        this.mBackgroundProxy = messageThreadUtil.getBackgroundProxy(backgroundCallback);
        refresh();
    }

    private boolean isRefreshPending() {
        return this.mRequestedGeneration != this.mDisplayedGeneration;
    }

    @Nullable
    public T getItem(int i5) {
        if (i5 < 0 || i5 >= this.mItemCount) {
            throw new IndexOutOfBoundsException(i5 + " is not within 0 and " + this.mItemCount);
        }
        T itemAt = this.mTileList.getItemAt(i5);
        if (itemAt == null && !isRefreshPending()) {
            this.mMissingPositions.put(i5, 0);
        }
        return itemAt;
    }

    public int getItemCount() {
        return this.mItemCount;
    }

    public void log(String str, Object... objArr) {
        StringBuilder g5 = d.g("[MAIN] ");
        g5.append(String.format(str, objArr));
        Log.d(TAG, g5.toString());
    }

    public void onRangeChanged() {
        if (isRefreshPending()) {
            return;
        }
        updateRange();
        this.mAllowScrollHints = true;
    }

    public void refresh() {
        this.mMissingPositions.clear();
        ThreadUtil.BackgroundCallback<T> backgroundCallback = this.mBackgroundProxy;
        int i5 = this.mRequestedGeneration + 1;
        this.mRequestedGeneration = i5;
        backgroundCallback.refresh(i5);
    }

    public void updateRange() {
        this.mViewCallback.getItemRangeInto(this.mTmpRange);
        int[] iArr = this.mTmpRange;
        if (iArr[0] > iArr[1] || iArr[0] < 0 || iArr[1] >= this.mItemCount) {
            return;
        }
        if (this.mAllowScrollHints) {
            int i5 = iArr[0];
            int[] iArr2 = this.mPrevRange;
            if (i5 <= iArr2[1] && iArr2[0] <= iArr[1]) {
                if (iArr[0] < iArr2[0]) {
                    this.mScrollHint = 1;
                } else if (iArr[0] > iArr2[0]) {
                    this.mScrollHint = 2;
                }
                int[] iArr3 = this.mPrevRange;
                iArr3[0] = iArr[0];
                iArr3[1] = iArr[1];
                this.mViewCallback.extendRangeInto(iArr, this.mTmpRangeExtended, this.mScrollHint);
                int[] iArr4 = this.mTmpRangeExtended;
                iArr4[0] = Math.min(this.mTmpRange[0], Math.max(iArr4[0], 0));
                int[] iArr5 = this.mTmpRangeExtended;
                iArr5[1] = Math.max(this.mTmpRange[1], Math.min(iArr5[1], this.mItemCount - 1));
                ThreadUtil.BackgroundCallback<T> backgroundCallback = this.mBackgroundProxy;
                int[] iArr6 = this.mTmpRange;
                int i6 = iArr6[0];
                int i7 = iArr6[1];
                int[] iArr7 = this.mTmpRangeExtended;
                backgroundCallback.updateRange(i6, i7, iArr7[0], iArr7[1], this.mScrollHint);
            }
        }
        this.mScrollHint = 0;
        int[] iArr32 = this.mPrevRange;
        iArr32[0] = iArr[0];
        iArr32[1] = iArr[1];
        this.mViewCallback.extendRangeInto(iArr, this.mTmpRangeExtended, this.mScrollHint);
        int[] iArr42 = this.mTmpRangeExtended;
        iArr42[0] = Math.min(this.mTmpRange[0], Math.max(iArr42[0], 0));
        int[] iArr52 = this.mTmpRangeExtended;
        iArr52[1] = Math.max(this.mTmpRange[1], Math.min(iArr52[1], this.mItemCount - 1));
        ThreadUtil.BackgroundCallback<T> backgroundCallback2 = this.mBackgroundProxy;
        int[] iArr62 = this.mTmpRange;
        int i62 = iArr62[0];
        int i72 = iArr62[1];
        int[] iArr72 = this.mTmpRangeExtended;
        backgroundCallback2.updateRange(i62, i72, iArr72[0], iArr72[1], this.mScrollHint);
    }
}
