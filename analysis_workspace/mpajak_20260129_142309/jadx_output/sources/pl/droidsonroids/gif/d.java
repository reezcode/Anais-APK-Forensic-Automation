package pl.droidsonroids.gif;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import k.j0;

/* loaded from: classes23.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final List<String> f4702a = Arrays.asList("raw", "drawable", "mipmap");

    /* loaded from: classes18.dex */
    public static class a extends b {

        /* renamed from: c, reason: collision with root package name */
        public final int f4703c;

        /* renamed from: d, reason: collision with root package name */
        public final int f4704d;

        public a() {
            this.f4703c = 0;
            this.f4704d = 0;
        }

        public a(ImageView imageView, AttributeSet attributeSet) {
            super(imageView, attributeSet);
            this.f4703c = a(imageView, attributeSet, true);
            this.f4704d = a(imageView, attributeSet, false);
        }

        public static int a(ImageView imageView, AttributeSet attributeSet, boolean z4) {
            int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", z4 ? "src" : "background", 0);
            if (attributeResourceValue > 0) {
                if (d.f4702a.contains(imageView.getResources().getResourceTypeName(attributeResourceValue)) && !d.a(imageView, z4, attributeResourceValue)) {
                    return attributeResourceValue;
                }
            }
            return 0;
        }
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f4705a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4706b;

        public b() {
            this.f4705a = false;
            this.f4706b = -1;
        }

        public b(View view, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, j0.f3722v, 0, 0);
            this.f4705a = obtainStyledAttributes.getBoolean(0, false);
            this.f4706b = obtainStyledAttributes.getInt(1, -1);
            obtainStyledAttributes.recycle();
        }
    }

    public static boolean a(ImageView imageView, boolean z4, int i5) {
        Resources resources = imageView.getResources();
        if (resources != null) {
            try {
                if (!f4702a.contains(resources.getResourceTypeName(i5))) {
                    return false;
                }
                pl.droidsonroids.gif.b bVar = new pl.droidsonroids.gif.b(resources, i5);
                if (z4) {
                    imageView.setImageDrawable(bVar);
                    return true;
                }
                imageView.setBackground(bVar);
                return true;
            } catch (Resources.NotFoundException | IOException unused) {
            }
        }
        return false;
    }
}
