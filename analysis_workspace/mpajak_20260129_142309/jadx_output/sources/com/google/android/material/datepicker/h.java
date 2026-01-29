package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import comeliest.metempsychosis.pokelogan.R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes9.dex */
public final class h<S> extends z<S> {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f956m = 0;

    /* renamed from: c, reason: collision with root package name */
    @StyleRes
    public int f957c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public com.google.android.material.datepicker.d<S> f958d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public com.google.android.material.datepicker.a f959e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public u f960f;

    /* renamed from: g, reason: collision with root package name */
    public int f961g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.android.material.datepicker.c f962h;

    /* renamed from: i, reason: collision with root package name */
    public RecyclerView f963i;

    /* renamed from: j, reason: collision with root package name */
    public RecyclerView f964j;

    /* renamed from: k, reason: collision with root package name */
    public View f965k;

    /* renamed from: l, reason: collision with root package name */
    public View f966l;

    /* loaded from: classes23.dex */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f967b;

        public a(int i5) {
            this.f967b = i5;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h.this.f964j.smoothScrollToPosition(this.f967b);
        }
    }

    public class b extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCollectionInfo(null);
        }
    }

    /* loaded from: classes11.dex */
    public class c extends a0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f969a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, int i5, int i6) {
            super(context, i5);
            this.f969a = i6;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
            if (this.f969a == 0) {
                iArr[0] = h.this.f964j.getWidth();
                iArr[1] = h.this.f964j.getWidth();
            } else {
                iArr[0] = h.this.f964j.getHeight();
                iArr[1] = h.this.f964j.getHeight();
            }
        }
    }

    /* loaded from: classes6.dex */
    public class d implements e {
        public d() {
        }
    }

    /* loaded from: classes24.dex */
    public interface e {
    }

    @Override // com.google.android.material.datepicker.z
    public final boolean a(@NonNull y<S> yVar) {
        return this.f1038b.add(yVar);
    }

    @NonNull
    public final LinearLayoutManager b() {
        return (LinearLayoutManager) this.f964j.getLayoutManager();
    }

    public final void c(int i5) {
        this.f964j.post(new a(i5));
    }

    public final void d(u uVar) {
        RecyclerView recyclerView;
        int i5;
        x xVar = (x) this.f964j.getAdapter();
        int b5 = xVar.b(uVar);
        int b6 = b5 - xVar.b(this.f960f);
        boolean z4 = Math.abs(b6) > 3;
        boolean z5 = b6 > 0;
        this.f960f = uVar;
        if (!z4 || !z5) {
            if (z4) {
                recyclerView = this.f964j;
                i5 = b5 + 3;
            }
            c(b5);
        }
        recyclerView = this.f964j;
        i5 = b5 - 3;
        recyclerView.scrollToPosition(i5);
        c(b5);
    }

    public final void e(int i5) {
        this.f961g = i5;
        if (i5 == 2) {
            this.f963i.getLayoutManager().scrollToPosition(((e0) this.f963i.getAdapter()).a(this.f960f.f1019d));
            this.f965k.setVisibility(0);
            this.f966l.setVisibility(8);
        } else if (i5 == 1) {
            this.f965k.setVisibility(8);
            this.f966l.setVisibility(0);
            d(this.f960f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f957c = bundle.getInt("THEME_RES_ID_KEY");
        this.f958d = (com.google.android.material.datepicker.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f959e = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f960f = (u) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i5;
        int i6;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f957c);
        this.f962h = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        u uVar = this.f959e.f917b;
        if (p.c(contextThemeWrapper)) {
            i5 = R.layout.mtrl_calendar_vertical;
            i6 = 1;
        } else {
            i5 = R.layout.mtrl_calendar_horizontal;
            i6 = 0;
        }
        View inflate = cloneInContext.inflate(i5, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i7 = v.f1024g;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i7 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i7) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        ViewCompat.setAccessibilityDelegate(gridView, new b());
        gridView.setAdapter((ListAdapter) new g());
        gridView.setNumColumns(uVar.f1020e);
        gridView.setEnabled(false);
        this.f964j = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.f964j.setLayoutManager(new c(getContext(), i6, i6));
        this.f964j.setTag("MONTHS_VIEW_GROUP_TAG");
        x xVar = new x(contextThemeWrapper, this.f958d, this.f959e, new d());
        this.f964j.setAdapter(xVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f963i = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f963i.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f963i.setAdapter(new e0(this));
            this.f963i.addItemDecoration(new i(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            ViewCompat.setAccessibilityDelegate(materialButton, new j(this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(R.id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(R.id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.f965k = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f966l = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            e(1);
            materialButton.setText(this.f960f.n());
            this.f964j.addOnScrollListener(new k(this, xVar, materialButton));
            materialButton.setOnClickListener(new l(this));
            materialButton3.setOnClickListener(new m(this, xVar));
            materialButton2.setOnClickListener(new n(this, xVar));
        }
        if (!p.c(contextThemeWrapper)) {
            new PagerSnapHelper().attachToRecyclerView(this.f964j);
        }
        this.f964j.scrollToPosition(xVar.b(this.f960f));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f957c);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f958d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f959e);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f960f);
    }
}
