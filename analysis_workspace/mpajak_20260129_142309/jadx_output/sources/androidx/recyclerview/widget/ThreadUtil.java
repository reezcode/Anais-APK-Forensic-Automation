package androidx.recyclerview.widget;

import androidx.recyclerview.widget.TileList;

/* loaded from: classes24.dex */
interface ThreadUtil<T> {

    /* loaded from: classes10.dex */
    public interface BackgroundCallback<T> {
        void loadTile(int i5, int i6);

        void recycleTile(TileList.Tile<T> tile);

        void refresh(int i5);

        void updateRange(int i5, int i6, int i7, int i8, int i9);
    }

    /* loaded from: classes17.dex */
    public interface MainThreadCallback<T> {
        void addTile(int i5, TileList.Tile<T> tile);

        void removeTile(int i5, int i6);

        void updateItemCount(int i5, int i6);
    }

    BackgroundCallback<T> getBackgroundProxy(BackgroundCallback<T> backgroundCallback);

    MainThreadCallback<T> getMainThreadProxy(MainThreadCallback<T> mainThreadCallback);
}
