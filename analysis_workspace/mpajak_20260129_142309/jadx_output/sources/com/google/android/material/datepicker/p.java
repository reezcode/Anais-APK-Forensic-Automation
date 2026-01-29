package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import comeliest.metempsychosis.pokelogan.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class p<S> extends DialogFragment {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f984x = 0;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet<s<? super S>> f985b = new LinkedHashSet<>();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f986c = new LinkedHashSet<>();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f987d = new LinkedHashSet<>();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f988e = new LinkedHashSet<>();

    /* renamed from: f, reason: collision with root package name */
    @StyleRes
    public int f989f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public d<S> f990g;

    /* renamed from: h, reason: collision with root package name */
    public z<S> f991h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public com.google.android.material.datepicker.a f992i;

    /* renamed from: j, reason: collision with root package name */
    public h<S> f993j;

    /* renamed from: k, reason: collision with root package name */
    @StringRes
    public int f994k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f995l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f996m;

    /* renamed from: n, reason: collision with root package name */
    public int f997n;

    /* renamed from: o, reason: collision with root package name */
    @StringRes
    public int f998o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f999p;

    /* renamed from: q, reason: collision with root package name */
    @StringRes
    public int f1000q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f1001r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f1002s;

    /* renamed from: t, reason: collision with root package name */
    public CheckableImageButton f1003t;

    /* renamed from: u, reason: collision with root package name */
    @Nullable
    public b2.g f1004u;

    /* renamed from: v, reason: collision with root package name */
    public Button f1005v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1006w;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Iterator<s<? super S>> it = p.this.f985b.iterator();
            while (it.hasNext()) {
                s<? super S> next = it.next();
                p.this.a().h();
                next.a();
            }
            p.this.dismiss();
        }
    }

    /* loaded from: classes23.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Iterator<View.OnClickListener> it = p.this.f986c.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            p.this.dismiss();
        }
    }

    /* loaded from: classes23.dex */
    public class c extends y<S> {
        public c() {
        }

        @Override // com.google.android.material.datepicker.y
        public final void a(S s4) {
            p pVar = p.this;
            int i5 = p.f984x;
            pVar.f();
            p pVar2 = p.this;
            pVar2.f1005v.setEnabled(pVar2.a().f());
        }
    }

    public static int b(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar d5 = c0.d();
        d5.set(5, 1);
        Calendar b5 = c0.b(d5);
        b5.get(2);
        b5.get(1);
        int maximum = b5.getMaximum(7);
        b5.getActualMaximum(5);
        b5.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean c(@NonNull Context context) {
        return d(context, android.R.attr.windowFullscreen);
    }

    public static boolean d(@NonNull Context context, int i5) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(y1.b.b(context, R.attr.materialCalendarStyle, h.class.getCanonicalName()), new int[]{i5});
        boolean z4 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z4;
    }

    public final d<S> a() {
        if (this.f990g == null) {
            this.f990g = (d) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f990g;
    }

    public final void e() {
        z<S> zVar;
        requireContext();
        int i5 = this.f989f;
        if (i5 == 0) {
            i5 = a().c();
        }
        d<S> a5 = a();
        com.google.android.material.datepicker.a aVar = this.f992i;
        h<S> hVar = new h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i5);
        bundle.putParcelable("GRID_SELECTOR_KEY", a5);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.f920e);
        hVar.setArguments(bundle);
        this.f993j = hVar;
        if (this.f1003t.isChecked()) {
            d<S> a6 = a();
            com.google.android.material.datepicker.a aVar2 = this.f992i;
            zVar = new t<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i5);
            bundle2.putParcelable("DATE_SELECTOR_KEY", a6);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar2);
            zVar.setArguments(bundle2);
        } else {
            zVar = this.f993j;
        }
        this.f991h = zVar;
        f();
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.mtrl_calendar_frame, this.f991h);
        beginTransaction.commitNow();
        this.f991h.a(new c());
    }

    public final void f() {
        d<S> a5 = a();
        getContext();
        String b5 = a5.b();
        this.f1002s.setContentDescription(String.format(getString(R.string.mtrl_picker_announce_current_selection), b5));
        this.f1002s.setText(b5);
    }

    public final void g(@NonNull CheckableImageButton checkableImageButton) {
        this.f1003t.setContentDescription(checkableImageButton.getContext().getString(this.f1003t.isChecked() ? R.string.mtrl_picker_toggle_to_calendar_input_mode : R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f987d.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f989f = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f990g = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f992i = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f994k = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f995l = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f997n = bundle.getInt("INPUT_MODE_KEY");
        this.f998o = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f999p = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f1000q = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f1001r = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Context requireContext = requireContext();
        requireContext();
        int i5 = this.f989f;
        if (i5 == 0) {
            i5 = a().c();
        }
        Dialog dialog = new Dialog(requireContext, i5);
        Context context = dialog.getContext();
        this.f996m = c(context);
        int b5 = y1.b.b(context, R.attr.colorSurface, p.class.getCanonicalName());
        b2.g gVar = new b2.g(new b2.k(b2.k.b(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar)));
        this.f1004u = gVar;
        gVar.m(context);
        this.f1004u.o(ColorStateList.valueOf(b5));
        this.f1004u.n(ViewCompat.getElevation(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View findViewById;
        LinearLayout.LayoutParams layoutParams;
        View inflate = layoutInflater.inflate(this.f996m ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f996m) {
            findViewById = inflate.findViewById(R.id.mtrl_calendar_frame);
            layoutParams = new LinearLayout.LayoutParams(b(context), -2);
        } else {
            findViewById = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            layoutParams = new LinearLayout.LayoutParams(b(context), -1);
        }
        findViewById.setLayoutParams(layoutParams);
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.f1002s = textView;
        ViewCompat.setAccessibilityLiveRegion(textView, 1);
        this.f1003t = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.f995l;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f994k);
        }
        this.f1003t.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f1003t;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AppCompatResources.getDrawable(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AppCompatResources.getDrawable(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f1003t.setChecked(this.f997n != 0);
        ViewCompat.setAccessibilityDelegate(this.f1003t, null);
        g(this.f1003t);
        this.f1003t.setOnClickListener(new r(this));
        this.f1005v = (Button) inflate.findViewById(R.id.confirm_button);
        if (a().f()) {
            this.f1005v.setEnabled(true);
        } else {
            this.f1005v.setEnabled(false);
        }
        this.f1005v.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence2 = this.f999p;
        if (charSequence2 != null) {
            this.f1005v.setText(charSequence2);
        } else {
            int i5 = this.f998o;
            if (i5 != 0) {
                this.f1005v.setText(i5);
            }
        }
        this.f1005v.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.f1001r;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i6 = this.f1000q;
            if (i6 != 0) {
                button.setText(i6);
            }
        }
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f988e.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f989f);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f990g);
        a.b bVar = new a.b(this.f992i);
        u uVar = this.f993j.f960f;
        if (uVar != null) {
            bVar.f927c = Long.valueOf(uVar.f1022g);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f928d);
        u l5 = u.l(bVar.f925a);
        u l6 = u.l(bVar.f926b);
        a.c cVar = (a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l7 = bVar.f927c;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new com.google.android.material.datepicker.a(l5, l6, cVar, l7 == null ? null : u.l(l7.longValue())));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f994k);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f995l);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f998o);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f999p);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f1000q);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f1001r);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f996m) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f1004u);
            if (!this.f1006w) {
                View findViewById = requireView().findViewById(R.id.fullscreen_header);
                Integer valueOf = findViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor()) : null;
                int i5 = Build.VERSION.SDK_INT;
                boolean z4 = false;
                boolean z5 = valueOf == null || valueOf.intValue() == 0;
                int a5 = p1.a.a(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z5) {
                    valueOf = Integer.valueOf(a5);
                }
                Integer valueOf2 = Integer.valueOf(a5);
                WindowCompat.setDecorFitsSystemWindows(window, false);
                int alphaComponent = i5 < 23 ? ColorUtils.setAlphaComponent(p1.a.a(window.getContext(), android.R.attr.statusBarColor, -16777216), 128) : 0;
                int alphaComponent2 = i5 < 27 ? ColorUtils.setAlphaComponent(p1.a.a(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(alphaComponent);
                window.setNavigationBarColor(alphaComponent2);
                boolean z6 = p1.a.c(alphaComponent) || (alphaComponent == 0 && p1.a.c(valueOf.intValue()));
                boolean c5 = p1.a.c(valueOf2.intValue());
                if (p1.a.c(alphaComponent2) || (alphaComponent2 == 0 && c5)) {
                    z4 = true;
                }
                WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
                if (insetsController != null) {
                    insetsController.setAppearanceLightStatusBars(z6);
                    insetsController.setAppearanceLightNavigationBars(z4);
                }
                ViewCompat.setOnApplyWindowInsetsListener(findViewById, new q(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
                this.f1006w = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f1004u, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new q1.a(requireDialog(), rect));
        }
        e();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        this.f991h.f1038b.clear();
        super.onStop();
    }
}
