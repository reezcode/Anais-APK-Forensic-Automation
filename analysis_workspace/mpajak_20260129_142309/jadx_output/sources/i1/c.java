package i1;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes7.dex */
public final class c implements AccessibilityViewCommand {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f3261b;

    public c(BottomSheetBehavior bottomSheetBehavior, int i5) {
        this.f3261b = bottomSheetBehavior;
        this.f3260a = i5;
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
        this.f3261b.j(this.f3260a);
        return true;
    }
}
