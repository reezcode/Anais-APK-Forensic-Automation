package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.lang.reflect.Array;

/* loaded from: classes9.dex */
class TileList<T> {
    public Tile<T> mLastAccessedTile;
    public final int mTileSize;
    private final SparseArray<Tile<T>> mTiles = new SparseArray<>(10);

    /* loaded from: classes18.dex */
    public static class Tile<T> {
        public int mItemCount;
        public final T[] mItems;
        public Tile<T> mNext;
        public int mStartPosition;

        public Tile(Class<T> cls, int i5) {
            this.mItems = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i5));
        }

        public boolean containsPosition(int i5) {
            int i6 = this.mStartPosition;
            return i6 <= i5 && i5 < i6 + this.mItemCount;
        }

        public T getByPosition(int i5) {
            return this.mItems[i5 - this.mStartPosition];
        }
    }

    public TileList(int i5) {
        this.mTileSize = i5;
    }

    public Tile<T> addOrReplace(Tile<T> tile) {
        int indexOfKey = this.mTiles.indexOfKey(tile.mStartPosition);
        if (indexOfKey < 0) {
            this.mTiles.put(tile.mStartPosition, tile);
            return null;
        }
        Tile<T> valueAt = this.mTiles.valueAt(indexOfKey);
        this.mTiles.setValueAt(indexOfKey, tile);
        if (this.mLastAccessedTile == valueAt) {
            this.mLastAccessedTile = tile;
        }
        return valueAt;
    }

    public void clear() {
        this.mTiles.clear();
    }

    public Tile<T> getAtIndex(int i5) {
        return this.mTiles.valueAt(i5);
    }

    public T getItemAt(int i5) {
        Tile<T> tile = this.mLastAccessedTile;
        if (tile == null || !tile.containsPosition(i5)) {
            int indexOfKey = this.mTiles.indexOfKey(i5 - (i5 % this.mTileSize));
            if (indexOfKey < 0) {
                return null;
            }
            this.mLastAccessedTile = this.mTiles.valueAt(indexOfKey);
        }
        return this.mLastAccessedTile.getByPosition(i5);
    }

    public Tile<T> removeAtPos(int i5) {
        Tile<T> tile = this.mTiles.get(i5);
        if (this.mLastAccessedTile == tile) {
            this.mLastAccessedTile = null;
        }
        this.mTiles.delete(i5);
        return tile;
    }

    public int size() {
        return this.mTiles.size();
    }
}
