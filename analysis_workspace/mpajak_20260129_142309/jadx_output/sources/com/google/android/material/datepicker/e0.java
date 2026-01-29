package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import comeliest.metempsychosis.pokelogan.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class e0 extends RecyclerView.Adapter<a> {

    /* renamed from: a, reason: collision with root package name */
    public final h<?> f949a;

    /* loaded from: classes5.dex */
    public static class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f950a;

        public a(TextView textView) {
            super(textView);
            this.f950a = textView;
        }
    }

    public e0(h<?> hVar) {
        this.f949a = hVar;
    }

    public final int a(int i5) {
        return i5 - this.f949a.f959e.f917b.f1019d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f949a.f959e.f921f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull a aVar, int i5) {
        a aVar2 = aVar;
        int i6 = this.f949a.f959e.f917b.f1019d + i5;
        String string = aVar2.f950a.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        aVar2.f950a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i6)));
        aVar2.f950a.setContentDescription(String.format(string, Integer.valueOf(i6)));
        c cVar = this.f949a.f962h;
        Calendar d5 = c0.d();
        b bVar = d5.get(1) == i6 ? cVar.f943f : cVar.f941d;
        Iterator<Long> it = this.f949a.f958d.g().iterator();
        while (it.hasNext()) {
            d5.setTimeInMillis(it.next().longValue());
            if (d5.get(1) == i6) {
                bVar = cVar.f942e;
            }
        }
        bVar.b(aVar2.f950a);
        aVar2.f950a.setOnClickListener(new d0(this, i6));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i5) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
