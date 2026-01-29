package androidx.recyclerview.widget;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.graphics.drawable.a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public class DiffUtil {
    private static final Comparator<Snake> SNAKE_COMPARATOR = new Comparator<Snake>() { // from class: androidx.recyclerview.widget.DiffUtil.1
        @Override // java.util.Comparator
        public int compare(Snake snake, Snake snake2) {
            int i5 = snake.f247x - snake2.f247x;
            return i5 == 0 ? snake.f248y - snake2.f248y : i5;
        }
    };

    /* loaded from: classes20.dex */
    public static abstract class Callback {
        public abstract boolean areContentsTheSame(int i5, int i6);

        public abstract boolean areItemsTheSame(int i5, int i6);

        @Nullable
        public Object getChangePayload(int i5, int i6) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* loaded from: classes12.dex */
    public static class DiffResult {
        private static final int FLAG_CHANGED = 2;
        private static final int FLAG_IGNORE = 16;
        private static final int FLAG_MASK = 31;
        private static final int FLAG_MOVED_CHANGED = 4;
        private static final int FLAG_MOVED_NOT_CHANGED = 8;
        private static final int FLAG_NOT_CHANGED = 1;
        private static final int FLAG_OFFSET = 5;
        public static final int NO_POSITION = -1;
        private final Callback mCallback;
        private final boolean mDetectMoves;
        private final int[] mNewItemStatuses;
        private final int mNewListSize;
        private final int[] mOldItemStatuses;
        private final int mOldListSize;
        private final List<Snake> mSnakes;

        public DiffResult(Callback callback, List<Snake> list, int[] iArr, int[] iArr2, boolean z4) {
            this.mSnakes = list;
            this.mOldItemStatuses = iArr;
            this.mNewItemStatuses = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.mCallback = callback;
            this.mOldListSize = callback.getOldListSize();
            this.mNewListSize = callback.getNewListSize();
            this.mDetectMoves = z4;
            addRootSnake();
            findMatchingItems();
        }

        private void addRootSnake() {
            Snake snake = this.mSnakes.isEmpty() ? null : this.mSnakes.get(0);
            if (snake != null && snake.f247x == 0 && snake.f248y == 0) {
                return;
            }
            Snake snake2 = new Snake();
            snake2.f247x = 0;
            snake2.f248y = 0;
            snake2.removal = false;
            snake2.size = 0;
            snake2.reverse = false;
            this.mSnakes.add(0, snake2);
        }

        private void dispatchAdditions(List<PostponedUpdate> list, ListUpdateCallback listUpdateCallback, int i5, int i6, int i7) {
            if (!this.mDetectMoves) {
                listUpdateCallback.onInserted(i5, i6);
                return;
            }
            for (int i8 = i6 - 1; i8 >= 0; i8--) {
                int[] iArr = this.mNewItemStatuses;
                int i9 = i7 + i8;
                int i10 = iArr[i9] & 31;
                if (i10 == 0) {
                    listUpdateCallback.onInserted(i5, 1);
                    Iterator<PostponedUpdate> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().currentPos++;
                    }
                } else if (i10 == 4 || i10 == 8) {
                    int i11 = iArr[i9] >> 5;
                    listUpdateCallback.onMoved(removePostponedUpdate(list, i11, true).currentPos, i5);
                    if (i10 == 4) {
                        listUpdateCallback.onChanged(i5, 1, this.mCallback.getChangePayload(i11, i9));
                    }
                } else {
                    if (i10 != 16) {
                        StringBuilder e5 = a.e("unknown flag for pos ", i9, " ");
                        e5.append(Long.toBinaryString(i10));
                        throw new IllegalStateException(e5.toString());
                    }
                    list.add(new PostponedUpdate(i9, i5, false));
                }
            }
        }

        private void dispatchRemovals(List<PostponedUpdate> list, ListUpdateCallback listUpdateCallback, int i5, int i6, int i7) {
            if (!this.mDetectMoves) {
                listUpdateCallback.onRemoved(i5, i6);
                return;
            }
            for (int i8 = i6 - 1; i8 >= 0; i8--) {
                int[] iArr = this.mOldItemStatuses;
                int i9 = i7 + i8;
                int i10 = iArr[i9] & 31;
                if (i10 == 0) {
                    listUpdateCallback.onRemoved(i5 + i8, 1);
                    Iterator<PostponedUpdate> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().currentPos--;
                    }
                } else if (i10 == 4 || i10 == 8) {
                    int i11 = iArr[i9] >> 5;
                    PostponedUpdate removePostponedUpdate = removePostponedUpdate(list, i11, false);
                    listUpdateCallback.onMoved(i5 + i8, removePostponedUpdate.currentPos - 1);
                    if (i10 == 4) {
                        listUpdateCallback.onChanged(removePostponedUpdate.currentPos - 1, 1, this.mCallback.getChangePayload(i9, i11));
                    }
                } else {
                    if (i10 != 16) {
                        StringBuilder e5 = a.e("unknown flag for pos ", i9, " ");
                        e5.append(Long.toBinaryString(i10));
                        throw new IllegalStateException(e5.toString());
                    }
                    list.add(new PostponedUpdate(i9, i5 + i8, true));
                }
            }
        }

        private void findAddition(int i5, int i6, int i7) {
            if (this.mOldItemStatuses[i5 - 1] != 0) {
                return;
            }
            findMatchingItem(i5, i6, i7, false);
        }

        private boolean findMatchingItem(int i5, int i6, int i7, boolean z4) {
            int i8;
            int i9;
            int i10;
            if (z4) {
                i6--;
                i9 = i5;
                i8 = i6;
            } else {
                i8 = i5 - 1;
                i9 = i8;
            }
            while (i7 >= 0) {
                Snake snake = this.mSnakes.get(i7);
                int i11 = snake.f247x;
                int i12 = snake.size;
                int i13 = i11 + i12;
                int i14 = snake.f248y + i12;
                if (z4) {
                    for (int i15 = i9 - 1; i15 >= i13; i15--) {
                        if (this.mCallback.areItemsTheSame(i15, i8)) {
                            i10 = this.mCallback.areContentsTheSame(i15, i8) ? 8 : 4;
                            this.mNewItemStatuses[i8] = (i15 << 5) | 16;
                            this.mOldItemStatuses[i15] = (i8 << 5) | i10;
                            return true;
                        }
                    }
                } else {
                    for (int i16 = i6 - 1; i16 >= i14; i16--) {
                        if (this.mCallback.areItemsTheSame(i8, i16)) {
                            i10 = this.mCallback.areContentsTheSame(i8, i16) ? 8 : 4;
                            int i17 = i5 - 1;
                            this.mOldItemStatuses[i17] = (i16 << 5) | 16;
                            this.mNewItemStatuses[i16] = (i17 << 5) | i10;
                            return true;
                        }
                    }
                }
                i9 = snake.f247x;
                i6 = snake.f248y;
                i7--;
            }
            return false;
        }

        private void findMatchingItems() {
            int i5 = this.mOldListSize;
            int i6 = this.mNewListSize;
            for (int size = this.mSnakes.size() - 1; size >= 0; size--) {
                Snake snake = this.mSnakes.get(size);
                int i7 = snake.f247x;
                int i8 = snake.size;
                int i9 = i7 + i8;
                int i10 = snake.f248y + i8;
                if (this.mDetectMoves) {
                    while (i5 > i9) {
                        findAddition(i5, i6, size);
                        i5--;
                    }
                    while (i6 > i10) {
                        findRemoval(i5, i6, size);
                        i6--;
                    }
                }
                for (int i11 = 0; i11 < snake.size; i11++) {
                    int i12 = snake.f247x + i11;
                    int i13 = snake.f248y + i11;
                    int i14 = this.mCallback.areContentsTheSame(i12, i13) ? 1 : 2;
                    this.mOldItemStatuses[i12] = (i13 << 5) | i14;
                    this.mNewItemStatuses[i13] = (i12 << 5) | i14;
                }
                i5 = snake.f247x;
                i6 = snake.f248y;
            }
        }

        private void findRemoval(int i5, int i6, int i7) {
            if (this.mNewItemStatuses[i6 - 1] != 0) {
                return;
            }
            findMatchingItem(i5, i6, i7, true);
        }

        private static PostponedUpdate removePostponedUpdate(List<PostponedUpdate> list, int i5, boolean z4) {
            int size = list.size() - 1;
            while (size >= 0) {
                PostponedUpdate postponedUpdate = list.get(size);
                if (postponedUpdate.posInOwnerList == i5 && postponedUpdate.removal == z4) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).currentPos += z4 ? 1 : -1;
                        size++;
                    }
                    return postponedUpdate;
                }
                size--;
            }
            return null;
        }

        public int convertNewPositionToOld(@IntRange(from = 0) int i5) {
            if (i5 < 0 || i5 >= this.mNewListSize) {
                StringBuilder e5 = a.e("Index out of bounds - passed position = ", i5, ", new list size = ");
                e5.append(this.mNewListSize);
                throw new IndexOutOfBoundsException(e5.toString());
            }
            int i6 = this.mNewItemStatuses[i5];
            if ((i6 & 31) == 0) {
                return -1;
            }
            return i6 >> 5;
        }

        public int convertOldPositionToNew(@IntRange(from = 0) int i5) {
            if (i5 < 0 || i5 >= this.mOldListSize) {
                StringBuilder e5 = a.e("Index out of bounds - passed position = ", i5, ", old list size = ");
                e5.append(this.mOldListSize);
                throw new IndexOutOfBoundsException(e5.toString());
            }
            int i6 = this.mOldItemStatuses[i5];
            if ((i6 & 31) == 0) {
                return -1;
            }
            return i6 >> 5;
        }

        public void dispatchUpdatesTo(@NonNull ListUpdateCallback listUpdateCallback) {
            BatchingListUpdateCallback batchingListUpdateCallback = listUpdateCallback instanceof BatchingListUpdateCallback ? (BatchingListUpdateCallback) listUpdateCallback : new BatchingListUpdateCallback(listUpdateCallback);
            ArrayList arrayList = new ArrayList();
            int i5 = this.mOldListSize;
            int i6 = this.mNewListSize;
            for (int size = this.mSnakes.size() - 1; size >= 0; size--) {
                Snake snake = this.mSnakes.get(size);
                int i7 = snake.size;
                int i8 = snake.f247x + i7;
                int i9 = snake.f248y + i7;
                if (i8 < i5) {
                    dispatchRemovals(arrayList, batchingListUpdateCallback, i8, i5 - i8, i8);
                }
                if (i9 < i6) {
                    dispatchAdditions(arrayList, batchingListUpdateCallback, i8, i6 - i9, i9);
                }
                for (int i10 = i7 - 1; i10 >= 0; i10--) {
                    int[] iArr = this.mOldItemStatuses;
                    int i11 = snake.f247x;
                    if ((iArr[i11 + i10] & 31) == 2) {
                        batchingListUpdateCallback.onChanged(i11 + i10, 1, this.mCallback.getChangePayload(i11 + i10, snake.f248y + i10));
                    }
                }
                i5 = snake.f247x;
                i6 = snake.f248y;
            }
            batchingListUpdateCallback.dispatchLastEvent();
        }

        public void dispatchUpdatesTo(@NonNull RecyclerView.Adapter adapter) {
            dispatchUpdatesTo(new AdapterListUpdateCallback(adapter));
        }

        @VisibleForTesting
        public List<Snake> getSnakes() {
            return this.mSnakes;
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class ItemCallback<T> {
        public abstract boolean areContentsTheSame(@NonNull T t4, @NonNull T t5);

        public abstract boolean areItemsTheSame(@NonNull T t4, @NonNull T t5);

        @Nullable
        public Object getChangePayload(@NonNull T t4, @NonNull T t5) {
            return null;
        }
    }

    public static class PostponedUpdate {
        public int currentPos;
        public int posInOwnerList;
        public boolean removal;

        public PostponedUpdate(int i5, int i6, boolean z4) {
            this.posInOwnerList = i5;
            this.currentPos = i6;
            this.removal = z4;
        }
    }

    /* loaded from: classes19.dex */
    public static class Range {
        public int newListEnd;
        public int newListStart;
        public int oldListEnd;
        public int oldListStart;

        public Range() {
        }

        public Range(int i5, int i6, int i7, int i8) {
            this.oldListStart = i5;
            this.oldListEnd = i6;
            this.newListStart = i7;
            this.newListEnd = i8;
        }
    }

    /* loaded from: classes10.dex */
    public static class Snake {
        public boolean removal;
        public boolean reverse;
        public int size;

        /* renamed from: x, reason: collision with root package name */
        public int f247x;

        /* renamed from: y, reason: collision with root package name */
        public int f248y;
    }

    private DiffUtil() {
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback callback) {
        return calculateDiff(callback, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.recyclerview.widget.DiffUtil.DiffResult calculateDiff(@androidx.annotation.NonNull androidx.recyclerview.widget.DiffUtil.Callback r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.DiffUtil.calculateDiff(androidx.recyclerview.widget.DiffUtil$Callback, boolean):androidx.recyclerview.widget.DiffUtil$DiffResult");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r24[r13 - 1] < r24[r13 + r5]) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b8, code lost:
    
        if (r25[r12 - 1] < r25[r12 + 1]) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e1 A[LOOP:4: B:54:0x00cd->B:58:0x00e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec A[EDGE_INSN: B:59:0x00ec->B:60:0x00ec BREAK  A[LOOP:4: B:54:0x00cd->B:58:0x00e1], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.recyclerview.widget.DiffUtil.Snake diffPartial(androidx.recyclerview.widget.DiffUtil.Callback r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.DiffUtil.diffPartial(androidx.recyclerview.widget.DiffUtil$Callback, int, int, int, int, int[], int[], int):androidx.recyclerview.widget.DiffUtil$Snake");
    }
}
