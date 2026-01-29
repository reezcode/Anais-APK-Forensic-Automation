package f1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes18.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final SimpleArrayMap<String, i> f2779a = new SimpleArrayMap<>();

    /* renamed from: b, reason: collision with root package name */
    public final SimpleArrayMap<String, PropertyValuesHolder[]> f2780b = new SimpleArrayMap<>();

    @Nullable
    public static h a(@NonNull Context context, @AnimatorRes int i5) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i5);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception e5) {
            StringBuilder g5 = androidx.activity.d.g("Can't load animation resource ID #0x");
            g5.append(Integer.toHexString(i5));
            Log.w("MotionSpec", g5.toString(), e5);
            return null;
        }
    }

    @NonNull
    public static h b(@NonNull List<Animator> list) {
        h hVar = new h();
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Animator animator = list.get(i5);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.f2780b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = a.f2768b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = a.f2769c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = a.f2770d;
            }
            i iVar = new i(startDelay, duration, interpolator);
            iVar.f2784d = objectAnimator.getRepeatCount();
            iVar.f2785e = objectAnimator.getRepeatMode();
            hVar.f2779a.put(propertyName, iVar);
        }
        return hVar;
    }

    public final i c(String str) {
        if (this.f2779a.get(str) != null) {
            return this.f2779a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f2779a.equals(((h) obj).f2779a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2779a.hashCode();
    }

    @NonNull
    public final String toString() {
        return '\n' + h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f2779a + "}\n";
    }
}
