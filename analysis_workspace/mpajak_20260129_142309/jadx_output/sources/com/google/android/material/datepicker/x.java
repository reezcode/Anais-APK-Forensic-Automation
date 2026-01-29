package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;
import comeliest.metempsychosis.pokelogan.R;
import java.util.Iterator;

/* loaded from: classes23.dex */
public final class x extends RecyclerView.Adapter<a> {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final com.google.android.material.datepicker.a f1032a;

    /* renamed from: b, reason: collision with root package name */
    public final d<?> f1033b;

    /* renamed from: c, reason: collision with root package name */
    public final h.e f1034c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1035d;

    /* loaded from: classes10.dex */
    public static class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f1036a;

        /* renamed from: b, reason: collision with root package name */
        public final MaterialCalendarGridView f1037b;

        public a(@NonNull LinearLayout linearLayout, boolean z4) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f1036a = textView;
            ViewCompat.setAccessibilityHeading(textView, true);
            this.f1037b = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z4) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public x(@NonNull Context context, d<?> dVar, @NonNull com.google.android.material.datepicker.a aVar, h.e eVar) {
        u uVar = aVar.f917b;
        u uVar2 = aVar.f918c;
        u uVar3 = aVar.f920e;
        if (uVar.compareTo(uVar3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (uVar3.compareTo(uVar2) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int i5 = v.f1024g;
        int i6 = h.f956m;
        this.f1035d = (context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i5) + (p.c(context) ? context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f1032a = aVar;
        this.f1033b = dVar;
        this.f1034c = eVar;
        setHasStableIds(true);
    }

    @NonNull
    public final u a(int i5) {
        return this.f1032a.f917b.o(i5);
    }

    public final int b(@NonNull u uVar) {
        return this.f1032a.f917b.p(uVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f1032a.f922g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i5) {
        return this.f1032a.f917b.o(i5).f1017b.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull a aVar, int i5) {
        a aVar2 = aVar;
        u o4 = this.f1032a.f917b.o(i5);
        aVar2.f1036a.setText(o4.n());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar2.f1037b.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !o4.equals(materialCalendarGridView.getAdapter().f1025b)) {
            v vVar = new v(o4, this.f1033b, this.f1032a);
            materialCalendarGridView.setNumColumns(o4.f1020e);
            materialCalendarGridView.setAdapter((ListAdapter) vVar);
        } else {
            materialCalendarGridView.invalidate();
            v adapter = materialCalendarGridView.getAdapter();
            Iterator<Long> it = adapter.f1027d.iterator();
            while (it.hasNext()) {
                adapter.f(materialCalendarGridView, it.next().longValue());
            }
            d<?> dVar = adapter.f1026c;
            if (dVar != null) {
                Iterator<Long> it2 = dVar.g().iterator();
                while (it2.hasNext()) {
                    adapter.f(materialCalendarGridView, it2.next().longValue());
                }
                adapter.f1027d = adapter.f1026c.g();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new w(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i5) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!p.c(viewGroup.getContext())) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f1035d));
        return new a(linearLayout, true);
    }
}
