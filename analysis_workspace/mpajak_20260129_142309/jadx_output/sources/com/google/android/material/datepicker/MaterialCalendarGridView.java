package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.core.util.Pair;
import androidx.core.view.ViewCompat;
import comeliest.metempsychosis.pokelogan.R;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes17.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: b, reason: collision with root package name */
    public final Calendar f915b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f916c;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f915b = c0.e(null);
        if (p.c(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f916c = p.d(getContext(), R.attr.nestedScrollable);
        ViewCompat.setAccessibilityDelegate(this, new o());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final v getAdapter2() {
        return (v) super.getAdapter();
    }

    public final View b(int i5) {
        return getChildAt(i5 - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        int a5;
        int width;
        int a6;
        int width2;
        int i5;
        int i6;
        int right;
        int right2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        v adapter = getAdapter();
        d<?> dVar = adapter.f1026c;
        c cVar = adapter.f1028e;
        int max = Math.max(adapter.b(), getFirstVisiblePosition());
        int min = Math.min(adapter.d(), getLastVisiblePosition());
        Long item = adapter.getItem(max);
        Long item2 = adapter.getItem(min);
        Iterator<Pair<Long, Long>> it = dVar.d().iterator();
        while (it.hasNext()) {
            Pair<Long, Long> next = it.next();
            Long l5 = next.first;
            if (l5 == null) {
                materialCalendarGridView = this;
            } else if (next.second != null) {
                long longValue = l5.longValue();
                long longValue2 = next.second.longValue();
                Long valueOf = Long.valueOf(longValue);
                Long valueOf2 = Long.valueOf(longValue2);
                if (!(item == null || item2 == null || valueOf == null || valueOf2 == null || valueOf.longValue() > item2.longValue() || valueOf2.longValue() < item.longValue())) {
                    boolean a7 = v1.r.a(this);
                    if (longValue < item.longValue()) {
                        if (max % adapter.f1025b.f1020e == 0) {
                            right2 = 0;
                        } else {
                            View b5 = materialCalendarGridView.b(max - 1);
                            right2 = !a7 ? b5.getRight() : b5.getLeft();
                        }
                        width = right2;
                        a5 = max;
                    } else {
                        materialCalendarGridView.f915b.setTimeInMillis(longValue);
                        a5 = adapter.a(materialCalendarGridView.f915b.get(5));
                        View b6 = materialCalendarGridView.b(a5);
                        width = (b6.getWidth() / 2) + b6.getLeft();
                    }
                    if (longValue2 > item2.longValue()) {
                        if ((min + 1) % adapter.f1025b.f1020e == 0) {
                            right = getWidth();
                        } else {
                            View b7 = materialCalendarGridView.b(min);
                            right = !a7 ? b7.getRight() : b7.getLeft();
                        }
                        width2 = right;
                        a6 = min;
                    } else {
                        materialCalendarGridView.f915b.setTimeInMillis(longValue2);
                        a6 = adapter.a(materialCalendarGridView.f915b.get(5));
                        View b8 = materialCalendarGridView.b(a6);
                        width2 = (b8.getWidth() / 2) + b8.getLeft();
                    }
                    int itemId = (int) adapter.getItemId(a5);
                    int i7 = max;
                    int i8 = min;
                    int itemId2 = (int) adapter.getItemId(a6);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        v vVar = adapter;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View b9 = materialCalendarGridView.b(numColumns);
                        int top = b9.getTop() + cVar.f938a.f929a.top;
                        int bottom = b9.getBottom() - cVar.f938a.f929a.bottom;
                        if (a7) {
                            int i9 = a6 > numColumns2 ? 0 : width2;
                            int width3 = numColumns > a5 ? getWidth() : width;
                            i5 = i9;
                            i6 = width3;
                        } else {
                            i5 = numColumns > a5 ? 0 : width;
                            i6 = a6 > numColumns2 ? getWidth() : width2;
                        }
                        canvas.drawRect(i5, top, i6, bottom, cVar.f945h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        adapter = vVar;
                    }
                    materialCalendarGridView = this;
                    max = i7;
                    min = i8;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z4, int i5, Rect rect) {
        int b5;
        if (!z4) {
            super.onFocusChanged(false, i5, rect);
            return;
        }
        if (i5 == 33) {
            b5 = getAdapter().d();
        } else {
            if (i5 != 130) {
                super.onFocusChanged(true, i5, rect);
                return;
            }
            b5 = getAdapter().b();
        }
        setSelection(b5);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i5, KeyEvent keyEvent) {
        if (!super.onKeyDown(i5, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i5) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i5, int i6) {
        if (!this.f916c) {
            super.onMeasure(i5, i6);
            return;
        }
        super.onMeasure(i5, View.MeasureSpec.makeMeasureSpec(ViewCompat.MEASURED_SIZE_MASK, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof v)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), v.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i5) {
        if (i5 < getAdapter().b()) {
            i5 = getAdapter().b();
        }
        super.setSelection(i5);
    }
}
