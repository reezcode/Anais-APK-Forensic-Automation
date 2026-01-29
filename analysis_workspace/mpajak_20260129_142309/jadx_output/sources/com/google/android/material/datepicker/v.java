package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes14.dex */
public final class v extends BaseAdapter {

    /* renamed from: g, reason: collision with root package name */
    public static final int f1024g = c0.e(null).getMaximum(4);

    /* renamed from: b, reason: collision with root package name */
    public final u f1025b;

    /* renamed from: c, reason: collision with root package name */
    public final d<?> f1026c;

    /* renamed from: d, reason: collision with root package name */
    public Collection<Long> f1027d;

    /* renamed from: e, reason: collision with root package name */
    public c f1028e;

    /* renamed from: f, reason: collision with root package name */
    public final a f1029f;

    public v(u uVar, d<?> dVar, a aVar) {
        this.f1025b = uVar;
        this.f1026c = dVar;
        this.f1029f = aVar;
        this.f1027d = dVar.g();
    }

    public final int a(int i5) {
        return b() + (i5 - 1);
    }

    public final int b() {
        return this.f1025b.m();
    }

    @Override // android.widget.Adapter
    @Nullable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i5) {
        if (i5 < this.f1025b.m() || i5 > d()) {
            return null;
        }
        u uVar = this.f1025b;
        int m5 = (i5 - uVar.m()) + 1;
        Calendar b5 = c0.b(uVar.f1017b);
        b5.set(5, m5);
        return Long.valueOf(b5.getTimeInMillis());
    }

    public final int d() {
        return (this.f1025b.m() + this.f1025b.f1021f) - 1;
    }

    public final void e(@Nullable TextView textView, long j5) {
        b bVar;
        if (textView == null) {
            return;
        }
        boolean z4 = false;
        if (this.f1029f.f919d.e(j5)) {
            textView.setEnabled(true);
            Iterator<Long> it = this.f1026c.g().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (c0.a(j5) == c0.a(it.next().longValue())) {
                    z4 = true;
                    break;
                }
            }
            if (z4) {
                bVar = this.f1028e.f939b;
            } else {
                long timeInMillis = c0.d().getTimeInMillis();
                c cVar = this.f1028e;
                bVar = timeInMillis == j5 ? cVar.f940c : cVar.f938a;
            }
        } else {
            textView.setEnabled(false);
            bVar = this.f1028e.f944g;
        }
        bVar.b(textView);
    }

    public final void f(MaterialCalendarGridView materialCalendarGridView, long j5) {
        if (u.l(j5).equals(this.f1025b)) {
            Calendar b5 = c0.b(this.f1025b.f1017b);
            b5.setTimeInMillis(j5);
            e((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(b5.get(5)) - materialCalendarGridView.getFirstVisiblePosition()), j5);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return b() + this.f1025b.f1021f;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i5) {
        return i5 / this.f1025b.f1020e;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ab  */
    @Override // android.widget.Adapter
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r9, @androidx.annotation.Nullable android.view.View r10, @androidx.annotation.NonNull android.view.ViewGroup r11) {
        /*
            r8 = this;
            android.content.Context r0 = r11.getContext()
            com.google.android.material.datepicker.c r1 = r8.f1028e
            if (r1 != 0) goto Lf
            com.google.android.material.datepicker.c r1 = new com.google.android.material.datepicker.c
            r1.<init>(r0)
            r8.f1028e = r1
        Lf:
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r10 != 0) goto L27
            android.content.Context r10 = r11.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r0 = 2131427426(0x7f0b0062, float:1.8476468E38)
            android.view.View r10 = r10.inflate(r0, r11, r1)
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r10 = r8.b()
            int r10 = r9 - r10
            if (r10 < 0) goto L9c
            com.google.android.material.datepicker.u r11 = r8.f1025b
            int r2 = r11.f1021f
            if (r10 < r2) goto L36
            goto L9c
        L36:
            r2 = 1
            int r10 = r10 + r2
            r0.setTag(r11)
            android.content.res.Resources r11 = r0.getResources()
            android.content.res.Configuration r11 = r11.getConfiguration()
            java.util.Locale r11 = r11.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r11 = java.lang.String.format(r11, r4, r3)
            r0.setText(r11)
            com.google.android.material.datepicker.u r11 = r8.f1025b
            java.util.Calendar r11 = r11.f1017b
            java.util.Calendar r11 = com.google.android.material.datepicker.c0.b(r11)
            r3 = 5
            r11.set(r3, r10)
            long r10 = r11.getTimeInMillis()
            com.google.android.material.datepicker.u r4 = r8.f1025b
            int r4 = r4.f1019d
            java.util.Calendar r5 = com.google.android.material.datepicker.c0.d()
            r5.set(r3, r2)
            java.util.Calendar r5 = com.google.android.material.datepicker.c0.b(r5)
            r6 = 2
            r5.get(r6)
            int r6 = r5.get(r2)
            r7 = 7
            r5.getMaximum(r7)
            r5.getActualMaximum(r3)
            r5.getTimeInMillis()
            if (r4 != r6) goto L8e
            java.lang.String r10 = com.google.android.material.datepicker.e.a(r10)
            goto L92
        L8e:
            java.lang.String r10 = com.google.android.material.datepicker.e.b(r10)
        L92:
            r0.setContentDescription(r10)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto La4
        L9c:
            r10 = 8
            r0.setVisibility(r10)
            r0.setEnabled(r1)
        La4:
            java.lang.Long r9 = r8.getItem(r9)
            if (r9 != 0) goto Lab
            goto Lb2
        Lab:
            long r9 = r9.longValue()
            r8.e(r0, r9)
        Lb2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.v.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
