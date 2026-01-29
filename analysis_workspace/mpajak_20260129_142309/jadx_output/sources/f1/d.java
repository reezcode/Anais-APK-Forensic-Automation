package f1;

import android.util.Property;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import comeliest.metempsychosis.pokelogan.R;

/* loaded from: classes20.dex */
public final class d extends Property<ViewGroup, Float> {

    /* renamed from: a, reason: collision with root package name */
    public static final Property<ViewGroup, Float> f2773a = new d();

    public d() {
        super(Float.class, "childrenAlpha");
    }

    @Override // android.util.Property
    @NonNull
    public final Float get(@NonNull ViewGroup viewGroup) {
        Float f5 = (Float) viewGroup.getTag(R.id.mtrl_internal_children_alpha_tag);
        return f5 != null ? f5 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(@NonNull ViewGroup viewGroup, @NonNull Float f5) {
        ViewGroup viewGroup2 = viewGroup;
        float floatValue = f5.floatValue();
        viewGroup2.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup2.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            viewGroup2.getChildAt(i5).setAlpha(floatValue);
        }
    }
}
