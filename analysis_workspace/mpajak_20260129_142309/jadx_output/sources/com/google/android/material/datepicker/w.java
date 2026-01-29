package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;
import java.util.Iterator;

/* loaded from: classes16.dex */
public final class w implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f1030b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f1031c;

    public w(x xVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f1031c = xVar;
        this.f1030b = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
        v adapter = this.f1030b.getAdapter();
        if (i5 >= adapter.b() && i5 <= adapter.d()) {
            h.d dVar = (h.d) this.f1031c.f1034c;
            if (h.this.f959e.f919d.e(this.f1030b.getAdapter().getItem(i5).longValue())) {
                h.this.f958d.a();
                Iterator it = h.this.f1038b.iterator();
                while (it.hasNext()) {
                    ((y) it.next()).a(h.this.f958d.h());
                }
                h.this.f964j.getAdapter().notifyDataSetChanged();
                RecyclerView recyclerView = h.this.f963i;
                if (recyclerView != null) {
                    recyclerView.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }
}
