package u1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.d;
import java.util.ArrayList;

@RequiresApi(21)
/* loaded from: classes14.dex */
public final class c extends d {
    public c(FloatingActionButton floatingActionButton, a2.b bVar) {
        super(floatingActionButton, bVar);
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final float e() {
        return this.f1088r.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void f(@NonNull Rect rect) {
        if (FloatingActionButton.this.f1053l) {
            super.f(rect);
        } else {
            int sizeDimension = !this.f1072b || this.f1088r.getSizeDimension() >= 0 ? 0 : (0 - this.f1088r.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void i() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void j() {
        s();
        throw null;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void k(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            float f5 = 0.0f;
            if (this.f1088r.isEnabled()) {
                this.f1088r.setElevation(this.f1074d);
                if (this.f1088r.isPressed()) {
                    floatingActionButton = this.f1088r;
                    f5 = this.f1076f;
                } else if (this.f1088r.isFocused() || this.f1088r.isHovered()) {
                    floatingActionButton = this.f1088r;
                    f5 = this.f1075e;
                }
                floatingActionButton.setTranslationZ(f5);
            }
            this.f1088r.setElevation(0.0f);
            floatingActionButton = this.f1088r;
            floatingActionButton.setTranslationZ(f5);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void l(float f5, float f6, float f7) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 == 21) {
            this.f1088r.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(d.f1070z, t(f5, f7));
            stateListAnimator.addState(d.A, t(f5, f6));
            stateListAnimator.addState(d.B, t(f5, f6));
            stateListAnimator.addState(d.C, t(f5, f6));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f1088r, "elevation", f5).setDuration(0L));
            if (i5 >= 22 && i5 <= 24) {
                FloatingActionButton floatingActionButton = this.f1088r;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f1088r, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(d.f1069y);
            stateListAnimator.addState(d.D, animatorSet);
            stateListAnimator.addState(d.E, t(0.0f, 0.0f));
            this.f1088r.setStateListAnimator(stateListAnimator);
        }
        if (q()) {
            s();
            throw null;
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void p() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final boolean q() {
        if (!FloatingActionButton.this.f1053l) {
            if (!this.f1072b || this.f1088r.getSizeDimension() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void r() {
    }

    @NonNull
    public final Animator t(float f5, float f6) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f1088r, "elevation", f5).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f1088r, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f6).setDuration(100L));
        animatorSet.setInterpolator(d.f1069y);
        return animatorSet;
    }
}
