package androidx.recyclerview.widget;

import android.view.View;
import androidx.activity.d;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes19.dex */
class LayoutState {
    public static final int INVALID_LAYOUT = Integer.MIN_VALUE;
    public static final int ITEM_DIRECTION_HEAD = -1;
    public static final int ITEM_DIRECTION_TAIL = 1;
    public static final int LAYOUT_END = 1;
    public static final int LAYOUT_START = -1;
    public int mAvailable;
    public int mCurrentPosition;
    public boolean mInfinite;
    public int mItemDirection;
    public int mLayoutDirection;
    public boolean mStopInFocusable;
    public boolean mRecycle = true;
    public int mStartLine = 0;
    public int mEndLine = 0;

    public boolean hasMore(RecyclerView.State state) {
        int i5 = this.mCurrentPosition;
        return i5 >= 0 && i5 < state.getItemCount();
    }

    public View next(RecyclerView.Recycler recycler) {
        View viewForPosition = recycler.getViewForPosition(this.mCurrentPosition);
        this.mCurrentPosition += this.mItemDirection;
        return viewForPosition;
    }

    public String toString() {
        StringBuilder g5 = d.g("LayoutState{mAvailable=");
        g5.append(this.mAvailable);
        g5.append(", mCurrentPosition=");
        g5.append(this.mCurrentPosition);
        g5.append(", mItemDirection=");
        g5.append(this.mItemDirection);
        g5.append(", mLayoutDirection=");
        g5.append(this.mLayoutDirection);
        g5.append(", mStartLine=");
        g5.append(this.mStartLine);
        g5.append(", mEndLine=");
        g5.append(this.mEndLine);
        g5.append('}');
        return g5.toString();
    }
}
