package b2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.AttrRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public d f369a;

    /* renamed from: b, reason: collision with root package name */
    public d f370b;

    /* renamed from: c, reason: collision with root package name */
    public d f371c;

    /* renamed from: d, reason: collision with root package name */
    public d f372d;

    /* renamed from: e, reason: collision with root package name */
    public c f373e;

    /* renamed from: f, reason: collision with root package name */
    public c f374f;

    /* renamed from: g, reason: collision with root package name */
    public c f375g;

    /* renamed from: h, reason: collision with root package name */
    public c f376h;

    /* renamed from: i, reason: collision with root package name */
    public f f377i;

    /* renamed from: j, reason: collision with root package name */
    public f f378j;

    /* renamed from: k, reason: collision with root package name */
    public f f379k;

    /* renamed from: l, reason: collision with root package name */
    public f f380l;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public d f381a;

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        public d f382b;

        /* renamed from: c, reason: collision with root package name */
        @NonNull
        public d f383c;

        /* renamed from: d, reason: collision with root package name */
        @NonNull
        public d f384d;

        /* renamed from: e, reason: collision with root package name */
        @NonNull
        public c f385e;

        /* renamed from: f, reason: collision with root package name */
        @NonNull
        public c f386f;

        /* renamed from: g, reason: collision with root package name */
        @NonNull
        public c f387g;

        /* renamed from: h, reason: collision with root package name */
        @NonNull
        public c f388h;

        /* renamed from: i, reason: collision with root package name */
        @NonNull
        public f f389i;

        /* renamed from: j, reason: collision with root package name */
        @NonNull
        public f f390j;

        /* renamed from: k, reason: collision with root package name */
        @NonNull
        public f f391k;

        /* renamed from: l, reason: collision with root package name */
        @NonNull
        public f f392l;

        public a() {
            this.f381a = new j();
            this.f382b = new j();
            this.f383c = new j();
            this.f384d = new j();
            this.f385e = new b2.a(0.0f);
            this.f386f = new b2.a(0.0f);
            this.f387g = new b2.a(0.0f);
            this.f388h = new b2.a(0.0f);
            this.f389i = new f();
            this.f390j = new f();
            this.f391k = new f();
            this.f392l = new f();
        }

        public a(@NonNull k kVar) {
            this.f381a = new j();
            this.f382b = new j();
            this.f383c = new j();
            this.f384d = new j();
            this.f385e = new b2.a(0.0f);
            this.f386f = new b2.a(0.0f);
            this.f387g = new b2.a(0.0f);
            this.f388h = new b2.a(0.0f);
            this.f389i = new f();
            this.f390j = new f();
            this.f391k = new f();
            this.f392l = new f();
            this.f381a = kVar.f369a;
            this.f382b = kVar.f370b;
            this.f383c = kVar.f371c;
            this.f384d = kVar.f372d;
            this.f385e = kVar.f373e;
            this.f386f = kVar.f374f;
            this.f387g = kVar.f375g;
            this.f388h = kVar.f376h;
            this.f389i = kVar.f377i;
            this.f390j = kVar.f378j;
            this.f391k = kVar.f379k;
            this.f392l = kVar.f380l;
        }

        public static void b(d dVar) {
            if (dVar instanceof j) {
            } else if (dVar instanceof e) {
            }
        }

        @NonNull
        public final k a() {
            return new k(this);
        }

        @NonNull
        public final a c(@Dimension float f5) {
            this.f388h = new b2.a(f5);
            return this;
        }

        @NonNull
        public final a d(@Dimension float f5) {
            this.f387g = new b2.a(f5);
            return this;
        }

        @NonNull
        public final a e(@Dimension float f5) {
            this.f385e = new b2.a(f5);
            return this;
        }

        @NonNull
        public final a f(@Dimension float f5) {
            this.f386f = new b2.a(f5);
            return this;
        }
    }

    public k() {
        this.f369a = new j();
        this.f370b = new j();
        this.f371c = new j();
        this.f372d = new j();
        this.f373e = new b2.a(0.0f);
        this.f374f = new b2.a(0.0f);
        this.f375g = new b2.a(0.0f);
        this.f376h = new b2.a(0.0f);
        this.f377i = new f();
        this.f378j = new f();
        this.f379k = new f();
        this.f380l = new f();
    }

    public k(a aVar) {
        this.f369a = aVar.f381a;
        this.f370b = aVar.f382b;
        this.f371c = aVar.f383c;
        this.f372d = aVar.f384d;
        this.f373e = aVar.f385e;
        this.f374f = aVar.f386f;
        this.f375g = aVar.f387g;
        this.f376h = aVar.f388h;
        this.f377i = aVar.f389i;
        this.f378j = aVar.f390j;
        this.f379k = aVar.f391k;
        this.f380l = aVar.f392l;
    }

    @NonNull
    public static a a(Context context, @StyleRes int i5, @StyleRes int i6, @NonNull c cVar) {
        if (i6 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i5);
            i5 = i6;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i5, i.g.B);
        try {
            int i7 = obtainStyledAttributes.getInt(0, 0);
            int i8 = obtainStyledAttributes.getInt(3, i7);
            int i9 = obtainStyledAttributes.getInt(4, i7);
            int i10 = obtainStyledAttributes.getInt(2, i7);
            int i11 = obtainStyledAttributes.getInt(1, i7);
            c c5 = c(obtainStyledAttributes, 5, cVar);
            c c6 = c(obtainStyledAttributes, 8, c5);
            c c7 = c(obtainStyledAttributes, 9, c5);
            c c8 = c(obtainStyledAttributes, 7, c5);
            c c9 = c(obtainStyledAttributes, 6, c5);
            a aVar = new a();
            d a5 = h.a(i8);
            aVar.f381a = a5;
            a.b(a5);
            aVar.f385e = c6;
            d a6 = h.a(i9);
            aVar.f382b = a6;
            a.b(a6);
            aVar.f386f = c7;
            d a7 = h.a(i10);
            aVar.f383c = a7;
            a.b(a7);
            aVar.f387g = c8;
            d a8 = h.a(i11);
            aVar.f384d = a8;
            a.b(a8);
            aVar.f388h = c9;
            return aVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public static a b(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i5, @StyleRes int i6) {
        b2.a aVar = new b2.a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.g.f3216v, i5, i6);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    @NonNull
    public static c c(TypedArray typedArray, int i5, @NonNull c cVar) {
        TypedValue peekValue = typedArray.peekValue(i5);
        if (peekValue == null) {
            return cVar;
        }
        int i6 = peekValue.type;
        return i6 == 5 ? new b2.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i6 == 6 ? new i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean d(@NonNull RectF rectF) {
        boolean z4 = this.f380l.getClass().equals(f.class) && this.f378j.getClass().equals(f.class) && this.f377i.getClass().equals(f.class) && this.f379k.getClass().equals(f.class);
        float a5 = this.f373e.a(rectF);
        return z4 && ((this.f374f.a(rectF) > a5 ? 1 : (this.f374f.a(rectF) == a5 ? 0 : -1)) == 0 && (this.f376h.a(rectF) > a5 ? 1 : (this.f376h.a(rectF) == a5 ? 0 : -1)) == 0 && (this.f375g.a(rectF) > a5 ? 1 : (this.f375g.a(rectF) == a5 ? 0 : -1)) == 0) && ((this.f370b instanceof j) && (this.f369a instanceof j) && (this.f371c instanceof j) && (this.f372d instanceof j));
    }

    @NonNull
    public final k e(float f5) {
        a aVar = new a(this);
        aVar.e(f5);
        aVar.f(f5);
        aVar.d(f5);
        aVar.c(f5);
        return aVar.a();
    }
}
