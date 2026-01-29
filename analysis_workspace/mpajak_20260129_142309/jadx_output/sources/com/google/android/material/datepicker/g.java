package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import comeliest.metempsychosis.pokelogan.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes16.dex */
public final class g extends BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public static final int f952e;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Calendar f953b;

    /* renamed from: c, reason: collision with root package name */
    public final int f954c;

    /* renamed from: d, reason: collision with root package name */
    public final int f955d;

    static {
        f952e = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public g() {
        Calendar e5 = c0.e(null);
        this.f953b = e5;
        this.f954c = e5.getMaximum(7);
        this.f955d = e5.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f954c;
    }

    @Override // android.widget.Adapter
    @Nullable
    public final Object getItem(int i5) {
        int i6 = this.f954c;
        if (i5 >= i6) {
            return null;
        }
        int i7 = i5 + this.f955d;
        if (i7 > i6) {
            i7 -= i6;
        }
        return Integer.valueOf(i7);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i5) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @Nullable
    @SuppressLint({"WrongConstant"})
    public final View getView(int i5, @Nullable View view, @NonNull ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        Calendar calendar = this.f953b;
        int i6 = i5 + this.f955d;
        int i7 = this.f954c;
        if (i6 > i7) {
            i6 -= i7;
        }
        calendar.set(7, i6);
        textView.setText(this.f953b.getDisplayName(7, f952e, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), this.f953b.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
