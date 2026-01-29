package i0;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import comeliest.metempsychosis.pokelogan.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Deprecated
/* loaded from: classes18.dex */
public abstract class i<T extends View, Z> extends i0.a<Z> {

    /* renamed from: b, reason: collision with root package name */
    public final T f3250b;

    /* renamed from: c, reason: collision with root package name */
    public final a f3251c;

    @VisibleForTesting
    /* loaded from: classes10.dex */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        @VisibleForTesting
        public static Integer f3252d;

        /* renamed from: a, reason: collision with root package name */
        public final View f3253a;

        /* renamed from: b, reason: collision with root package name */
        public final List<g> f3254b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        public ViewTreeObserverOnPreDrawListenerC0036a f3255c;

        /* renamed from: i0.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes25.dex */
        public static final class ViewTreeObserverOnPreDrawListenerC0036a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: b, reason: collision with root package name */
            public final WeakReference<a> f3256b;

            public ViewTreeObserverOnPreDrawListenerC0036a(@NonNull a aVar) {
                this.f3256b = new WeakReference<>(aVar);
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<i0.g>] */
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f3256b.get();
                if (aVar == null || aVar.f3254b.isEmpty()) {
                    return true;
                }
                int d5 = aVar.d();
                int c5 = aVar.c();
                if (!aVar.e(d5, c5)) {
                    return true;
                }
                Iterator it = new ArrayList(aVar.f3254b).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).b(d5, c5);
                }
                aVar.a();
                return true;
            }
        }

        public a(@NonNull View view) {
            this.f3253a = view;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<i0.g>] */
        public final void a() {
            ViewTreeObserver viewTreeObserver = this.f3253a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f3255c);
            }
            this.f3255c = null;
            this.f3254b.clear();
        }

        public final int b(int i5, int i6, int i7) {
            int i8 = i6 - i7;
            if (i8 > 0) {
                return i8;
            }
            int i9 = i5 - i7;
            if (i9 > 0) {
                return i9;
            }
            if (this.f3253a.isLayoutRequested() || i6 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = this.f3253a.getContext();
            if (f3252d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                Objects.requireNonNull(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f3252d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f3252d.intValue();
        }

        public final int c() {
            int paddingBottom = this.f3253a.getPaddingBottom() + this.f3253a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.f3253a.getLayoutParams();
            return b(this.f3253a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        public final int d() {
            int paddingRight = this.f3253a.getPaddingRight() + this.f3253a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.f3253a.getLayoutParams();
            return b(this.f3253a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }

        public final boolean e(int i5, int i6) {
            if (i5 > 0 || i5 == Integer.MIN_VALUE) {
                return i6 > 0 || i6 == Integer.MIN_VALUE;
            }
            return false;
        }
    }

    public i(@NonNull T t4) {
        Objects.requireNonNull(t4, "Argument must not be null");
        this.f3250b = t4;
        this.f3251c = new a(t4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<i0.g>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList, java.util.List<i0.g>] */
    @Override // i0.h
    @CallSuper
    public final void a(@NonNull g gVar) {
        a aVar = this.f3251c;
        int d5 = aVar.d();
        int c5 = aVar.c();
        if (aVar.e(d5, c5)) {
            gVar.b(d5, c5);
            return;
        }
        if (!aVar.f3254b.contains(gVar)) {
            aVar.f3254b.add(gVar);
        }
        if (aVar.f3255c == null) {
            ViewTreeObserver viewTreeObserver = aVar.f3253a.getViewTreeObserver();
            a.ViewTreeObserverOnPreDrawListenerC0036a viewTreeObserverOnPreDrawListenerC0036a = new a.ViewTreeObserverOnPreDrawListenerC0036a(aVar);
            aVar.f3255c = viewTreeObserverOnPreDrawListenerC0036a;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0036a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<i0.g>] */
    @Override // i0.h
    @CallSuper
    public final void b(@NonNull g gVar) {
        this.f3251c.f3254b.remove(gVar);
    }

    @Override // i0.h
    public final void e(@Nullable h0.c cVar) {
        this.f3250b.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    @Override // i0.h
    @Nullable
    public final h0.c g() {
        Object tag = this.f3250b.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof h0.c) {
            return (h0.c) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("Target for: ");
        g5.append(this.f3250b);
        return g5.toString();
    }
}
