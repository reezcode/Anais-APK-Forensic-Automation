package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.util.Pair;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;

/* loaded from: classes12.dex */
public final class i extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f972a = c0.e(null);

    /* renamed from: b, reason: collision with root package name */
    public final Calendar f973b = c0.e(null);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f974c;

    public i(h hVar) {
        this.f974c = hVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        if ((recyclerView.getAdapter() instanceof e0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            e0 e0Var = (e0) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (Pair<Long, Long> pair : this.f974c.f958d.d()) {
                Long l5 = pair.first;
                if (l5 != null && pair.second != null) {
                    this.f972a.setTimeInMillis(l5.longValue());
                    this.f973b.setTimeInMillis(pair.second.longValue());
                    int a5 = e0Var.a(this.f972a.get(1));
                    int a6 = e0Var.a(this.f973b.get(1));
                    View findViewByPosition = gridLayoutManager.findViewByPosition(a5);
                    View findViewByPosition2 = gridLayoutManager.findViewByPosition(a6);
                    int spanCount = a5 / gridLayoutManager.getSpanCount();
                    int spanCount2 = a6 / gridLayoutManager.getSpanCount();
                    for (int i5 = spanCount; i5 <= spanCount2; i5++) {
                        View findViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.getSpanCount() * i5);
                        if (findViewByPosition3 != null) {
                            int top = findViewByPosition3.getTop() + this.f974c.f962h.f941d.f929a.top;
                            int bottom = findViewByPosition3.getBottom() - this.f974c.f962h.f941d.f929a.bottom;
                            canvas.drawRect(i5 == spanCount ? (findViewByPosition.getWidth() / 2) + findViewByPosition.getLeft() : 0, top, i5 == spanCount2 ? (findViewByPosition2.getWidth() / 2) + findViewByPosition2.getLeft() : recyclerView.getWidth(), bottom, this.f974c.f962h.f945h);
                        }
                    }
                }
            }
        }
    }
}
