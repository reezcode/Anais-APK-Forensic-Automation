package androidx.savedstate;

import android.view.View;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

@JvmName(name = "ViewTreeSavedStateRegistryOwner")
/* loaded from: classes21.dex */
public final class ViewTreeSavedStateRegistryOwner {
    @JvmName(name = "get")
    public static final SavedStateRegistryOwner get(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (SavedStateRegistryOwner) SequencesKt.firstOrNull(SequencesKt.mapNotNull(SequencesKt.generateSequence(view, new Function1<View, View>() { // from class: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1
            @Override // kotlin.jvm.functions.Function1
            public final View invoke(View view2) {
                Intrinsics.checkNotNullParameter(view2, "view");
                Object parent = view2.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new Function1<View, SavedStateRegistryOwner>() { // from class: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2
            @Override // kotlin.jvm.functions.Function1
            public final SavedStateRegistryOwner invoke(View view2) {
                Intrinsics.checkNotNullParameter(view2, "view");
                Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
                if (tag instanceof SavedStateRegistryOwner) {
                    return (SavedStateRegistryOwner) tag;
                }
                return null;
            }
        }));
    }

    @JvmName(name = "set")
    public static final void set(View view, SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
    }
}
