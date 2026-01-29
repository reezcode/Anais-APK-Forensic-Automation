package androidx.transition;

import android.view.View;
import androidx.activity.d;
import androidx.activity.result.a;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class TransitionValues {
    public View view;
    public final Map<String, Object> values = new HashMap();
    public final ArrayList<Transition> mTargetedTransitions = new ArrayList<>();

    @Deprecated
    public TransitionValues() {
    }

    public TransitionValues(@NonNull View view) {
        this.view = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj;
        return this.view == transitionValues.view && this.values.equals(transitionValues.values);
    }

    public int hashCode() {
        return this.values.hashCode() + (this.view.hashCode() * 31);
    }

    public String toString() {
        StringBuilder g5 = d.g("TransitionValues@");
        g5.append(Integer.toHexString(hashCode()));
        g5.append(":\n");
        StringBuilder e5 = a.e(g5.toString(), "    view = ");
        e5.append(this.view);
        e5.append("\n");
        String f5 = d.f(e5.toString(), "    values:");
        for (String str : this.values.keySet()) {
            f5 = f5 + "    " + str + ": " + this.values.get(str) + "\n";
        }
        return f5;
    }
}
