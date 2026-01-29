package e2;

import android.content.Context;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes8.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public TextInputLayout f2545a;

    /* renamed from: b, reason: collision with root package name */
    public Context f2546b;

    /* renamed from: c, reason: collision with root package name */
    public CheckableImageButton f2547c;

    /* renamed from: d, reason: collision with root package name */
    @DrawableRes
    public final int f2548d;

    public i(@NonNull TextInputLayout textInputLayout, @DrawableRes int i5) {
        this.f2545a = textInputLayout;
        this.f2546b = textInputLayout.getContext();
        this.f2547c = textInputLayout.getEndIconView();
        this.f2548d = i5;
    }

    public abstract void a();

    public boolean b(int i5) {
        return true;
    }

    public void c(boolean z4) {
    }
}
