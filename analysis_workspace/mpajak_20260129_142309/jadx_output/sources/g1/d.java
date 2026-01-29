package g1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes5.dex */
public class d<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a, reason: collision with root package name */
    public e f2941a;

    /* renamed from: b, reason: collision with root package name */
    public int f2942b;

    public d() {
        this.f2942b = 0;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2942b = 0;
    }

    public final int a() {
        e eVar = this.f2941a;
        if (eVar != null) {
            return eVar.f2946d;
        }
        return 0;
    }

    public void b(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v4, int i5) {
        coordinatorLayout.onLayoutChild(v4, i5);
    }

    public final boolean c(int i5) {
        e eVar = this.f2941a;
        if (eVar == null) {
            this.f2942b = i5;
            return false;
        }
        if (eVar.f2946d == i5) {
            return false;
        }
        eVar.f2946d = i5;
        eVar.a();
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v4, int i5) {
        b(coordinatorLayout, v4, i5);
        if (this.f2941a == null) {
            this.f2941a = new e(v4);
        }
        e eVar = this.f2941a;
        eVar.f2944b = eVar.f2943a.getTop();
        eVar.f2945c = eVar.f2943a.getLeft();
        this.f2941a.a();
        int i6 = this.f2942b;
        if (i6 == 0) {
            return true;
        }
        e eVar2 = this.f2941a;
        if (eVar2.f2946d != i6) {
            eVar2.f2946d = i6;
            eVar2.a();
        }
        this.f2942b = 0;
        return true;
    }
}
