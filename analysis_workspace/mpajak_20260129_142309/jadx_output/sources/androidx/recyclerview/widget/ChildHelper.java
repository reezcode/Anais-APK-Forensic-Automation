package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
class ChildHelper {
    private static final boolean DEBUG = false;
    private static final String TAG = "ChildrenHelper";
    public final Callback mCallback;
    public final Bucket mBucket = new Bucket();
    public final List<View> mHiddenViews = new ArrayList();

    /* loaded from: classes12.dex */
    public static class Bucket {
        public static final int BITS_PER_WORD = 64;
        public static final long LAST_BIT = Long.MIN_VALUE;
        public long mData = 0;
        public Bucket mNext;

        private void ensureNext() {
            if (this.mNext == null) {
                this.mNext = new Bucket();
            }
        }

        public void clear(int i5) {
            if (i5 < 64) {
                this.mData &= ~(1 << i5);
                return;
            }
            Bucket bucket = this.mNext;
            if (bucket != null) {
                bucket.clear(i5 - 64);
            }
        }

        public int countOnesBefore(int i5) {
            long j5;
            Bucket bucket = this.mNext;
            if (bucket == null) {
                if (i5 >= 64) {
                    j5 = this.mData;
                    return Long.bitCount(j5);
                }
            } else if (i5 >= 64) {
                return Long.bitCount(this.mData) + bucket.countOnesBefore(i5 - 64);
            }
            j5 = this.mData & ((1 << i5) - 1);
            return Long.bitCount(j5);
        }

        public boolean get(int i5) {
            if (i5 < 64) {
                return (this.mData & (1 << i5)) != 0;
            }
            ensureNext();
            return this.mNext.get(i5 - 64);
        }

        public void insert(int i5, boolean z4) {
            if (i5 >= 64) {
                ensureNext();
                this.mNext.insert(i5 - 64, z4);
                return;
            }
            long j5 = this.mData;
            boolean z5 = (Long.MIN_VALUE & j5) != 0;
            long j6 = (1 << i5) - 1;
            this.mData = ((j5 & (~j6)) << 1) | (j5 & j6);
            if (z4) {
                set(i5);
            } else {
                clear(i5);
            }
            if (z5 || this.mNext != null) {
                ensureNext();
                this.mNext.insert(0, z5);
            }
        }

        public boolean remove(int i5) {
            if (i5 >= 64) {
                ensureNext();
                return this.mNext.remove(i5 - 64);
            }
            long j5 = 1 << i5;
            long j6 = this.mData;
            boolean z4 = (j6 & j5) != 0;
            long j7 = j6 & (~j5);
            this.mData = j7;
            long j8 = j5 - 1;
            this.mData = (j7 & j8) | Long.rotateRight((~j8) & j7, 1);
            Bucket bucket = this.mNext;
            if (bucket != null) {
                if (bucket.get(0)) {
                    set(63);
                }
                this.mNext.remove(0);
            }
            return z4;
        }

        public void reset() {
            this.mData = 0L;
            Bucket bucket = this.mNext;
            if (bucket != null) {
                bucket.reset();
            }
        }

        public void set(int i5) {
            if (i5 < 64) {
                this.mData |= 1 << i5;
            } else {
                ensureNext();
                this.mNext.set(i5 - 64);
            }
        }

        public String toString() {
            if (this.mNext == null) {
                return Long.toBinaryString(this.mData);
            }
            return this.mNext.toString() + "xx" + Long.toBinaryString(this.mData);
        }
    }

    /* loaded from: classes23.dex */
    public interface Callback {
        void addView(View view, int i5);

        void attachViewToParent(View view, int i5, ViewGroup.LayoutParams layoutParams);

        void detachViewFromParent(int i5);

        View getChildAt(int i5);

        int getChildCount();

        RecyclerView.ViewHolder getChildViewHolder(View view);

        int indexOfChild(View view);

        void onEnteredHiddenState(View view);

        void onLeftHiddenState(View view);

        void removeAllViews();

        void removeViewAt(int i5);
    }

    public ChildHelper(Callback callback) {
        this.mCallback = callback;
    }

    private int getOffset(int i5) {
        if (i5 < 0) {
            return -1;
        }
        int childCount = this.mCallback.getChildCount();
        int i6 = i5;
        while (i6 < childCount) {
            int countOnesBefore = i5 - (i6 - this.mBucket.countOnesBefore(i6));
            if (countOnesBefore == 0) {
                while (this.mBucket.get(i6)) {
                    i6++;
                }
                return i6;
            }
            i6 += countOnesBefore;
        }
        return -1;
    }

    private void hideViewInternal(View view) {
        this.mHiddenViews.add(view);
        this.mCallback.onEnteredHiddenState(view);
    }

    private boolean unhideViewInternal(View view) {
        if (!this.mHiddenViews.remove(view)) {
            return false;
        }
        this.mCallback.onLeftHiddenState(view);
        return true;
    }

    public void addView(View view, int i5, boolean z4) {
        int childCount = i5 < 0 ? this.mCallback.getChildCount() : getOffset(i5);
        this.mBucket.insert(childCount, z4);
        if (z4) {
            hideViewInternal(view);
        }
        this.mCallback.addView(view, childCount);
    }

    public void addView(View view, boolean z4) {
        addView(view, -1, z4);
    }

    public void attachViewToParent(View view, int i5, ViewGroup.LayoutParams layoutParams, boolean z4) {
        int childCount = i5 < 0 ? this.mCallback.getChildCount() : getOffset(i5);
        this.mBucket.insert(childCount, z4);
        if (z4) {
            hideViewInternal(view);
        }
        this.mCallback.attachViewToParent(view, childCount, layoutParams);
    }

    public void detachViewFromParent(int i5) {
        int offset = getOffset(i5);
        this.mBucket.remove(offset);
        this.mCallback.detachViewFromParent(offset);
    }

    public View findHiddenNonRemovedView(int i5) {
        int size = this.mHiddenViews.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.mHiddenViews.get(i6);
            RecyclerView.ViewHolder childViewHolder = this.mCallback.getChildViewHolder(view);
            if (childViewHolder.getLayoutPosition() == i5 && !childViewHolder.isInvalid() && !childViewHolder.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    public View getChildAt(int i5) {
        return this.mCallback.getChildAt(getOffset(i5));
    }

    public int getChildCount() {
        return this.mCallback.getChildCount() - this.mHiddenViews.size();
    }

    public View getUnfilteredChildAt(int i5) {
        return this.mCallback.getChildAt(i5);
    }

    public int getUnfilteredChildCount() {
        return this.mCallback.getChildCount();
    }

    public void hide(View view) {
        int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild >= 0) {
            this.mBucket.set(indexOfChild);
            hideViewInternal(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public int indexOfChild(View view) {
        int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild == -1 || this.mBucket.get(indexOfChild)) {
            return -1;
        }
        return indexOfChild - this.mBucket.countOnesBefore(indexOfChild);
    }

    public boolean isHidden(View view) {
        return this.mHiddenViews.contains(view);
    }

    public void removeAllViewsUnfiltered() {
        this.mBucket.reset();
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            this.mCallback.onLeftHiddenState(this.mHiddenViews.get(size));
            this.mHiddenViews.remove(size);
        }
        this.mCallback.removeAllViews();
    }

    public void removeView(View view) {
        int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild < 0) {
            return;
        }
        if (this.mBucket.remove(indexOfChild)) {
            unhideViewInternal(view);
        }
        this.mCallback.removeViewAt(indexOfChild);
    }

    public void removeViewAt(int i5) {
        int offset = getOffset(i5);
        View childAt = this.mCallback.getChildAt(offset);
        if (childAt == null) {
            return;
        }
        if (this.mBucket.remove(offset)) {
            unhideViewInternal(childAt);
        }
        this.mCallback.removeViewAt(offset);
    }

    public boolean removeViewIfHidden(View view) {
        int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild == -1) {
            unhideViewInternal(view);
            return true;
        }
        if (!this.mBucket.get(indexOfChild)) {
            return false;
        }
        this.mBucket.remove(indexOfChild);
        unhideViewInternal(view);
        this.mCallback.removeViewAt(indexOfChild);
        return true;
    }

    public String toString() {
        return this.mBucket.toString() + ", hidden list:" + this.mHiddenViews.size();
    }

    public void unhide(View view) {
        int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.mBucket.get(indexOfChild)) {
            this.mBucket.clear(indexOfChild);
            unhideViewInternal(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }
}
