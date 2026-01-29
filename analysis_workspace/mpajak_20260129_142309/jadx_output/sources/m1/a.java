package m1;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import com.google.android.material.chip.Chip;

/* loaded from: classes15.dex */
public final class a extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Chip f4153a;

    public a(Chip chip) {
        this.f4153a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(21)
    public final void getOutline(View view, @NonNull Outline outline) {
        com.google.android.material.chip.a aVar = this.f4153a.f857b;
        if (aVar != null) {
            aVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
