package e2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.annotation.ArrayRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.material.textfield.TextInputLayout;
import comeliest.metempsychosis.pokelogan.R;
import java.util.Locale;

/* loaded from: classes14.dex */
public final class m extends AppCompatAutoCompleteTextView {

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ListPopupWindow f2576b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public final AccessibilityManager f2577c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final Rect f2578d;

    /* renamed from: e, reason: collision with root package name */
    @LayoutRes
    public final int f2579e;

    /* loaded from: classes10.dex */
    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
            m mVar = m.this;
            m.a(m.this, i5 < 0 ? mVar.f2576b.getSelectedItem() : mVar.getAdapter().getItem(i5));
            AdapterView.OnItemClickListener onItemClickListener = m.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i5 < 0) {
                    view = m.this.f2576b.getSelectedView();
                    i5 = m.this.f2576b.getSelectedItemPosition();
                    j5 = m.this.f2576b.getSelectedItemId();
                }
                onItemClickListener.onItemClick(m.this.f2576b.getListView(), view, i5, j5);
            }
            m.this.f2576b.dismiss();
        }
    }

    public m(@NonNull Context context, @Nullable AttributeSet attributeSet, int i5) {
        super(f2.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        this.f2578d = new Rect();
        Context context2 = getContext();
        TypedArray d5 = v1.m.d(context2, attributeSet, i.g.f3209o, R.attr.autoCompleteTextViewStyle, 2131755728, new int[0]);
        if (d5.hasValue(0) && d5.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f2579e = d5.getResourceId(1, R.layout.mtrl_auto_complete_simple_item);
        this.f2577c = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f2576b = listPopupWindow;
        listPopupWindow.setModal(true);
        listPopupWindow.setAnchorView(this);
        listPopupWindow.setInputMethodMode(2);
        listPopupWindow.setAdapter(getAdapter());
        listPopupWindow.setOnItemClickListener(new a());
        if (d5.hasValue(2)) {
            setSimpleItems(d5.getResourceId(2, 0));
        }
        d5.recycle();
    }

    public static void a(m mVar, Object obj) {
        mVar.setText(mVar.convertSelectionToString(obj), false);
    }

    @Nullable
    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout b5 = b();
        return (b5 == null || !b5.F) ? super.getHint() : b5.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b5 = b();
        if (b5 != null && b5.F && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        if (View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b5 = b();
            int i7 = 0;
            if (adapter != null && b5 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                int min = Math.min(adapter.getCount(), Math.max(0, this.f2576b.getSelectedItemPosition()) + 15);
                View view = null;
                int i8 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i7) {
                        view = null;
                        i7 = itemViewType;
                    }
                    view = adapter.getView(max, view, b5);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i8 = Math.max(i8, view.getMeasuredWidth());
                }
                Drawable background = this.f2576b.getBackground();
                if (background != null) {
                    background.getPadding(this.f2578d);
                    Rect rect = this.f2578d;
                    i8 += rect.left + rect.right;
                }
                i7 = b5.getEndIconView().getMeasuredWidth() + i8;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i7), View.MeasureSpec.getSize(i5)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@Nullable T t4) {
        super.setAdapter(t4);
        this.f2576b.setAdapter(getAdapter());
    }

    public void setSimpleItems(@ArrayRes int i5) {
        setSimpleItems(getResources().getStringArray(i5));
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new ArrayAdapter(getContext(), this.f2579e, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f2577c;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f2576b.show();
        }
    }
}
