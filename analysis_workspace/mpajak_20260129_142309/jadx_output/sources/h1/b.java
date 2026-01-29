package h1;

import androidx.annotation.NonNull;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.Objects;

/* loaded from: classes21.dex */
public final class b extends FloatingActionButton.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f3120b;

    /* loaded from: classes12.dex */
    public class a extends FloatingActionButton.a {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public final void b() {
            BottomAppBar bottomAppBar = b.this.f3120b;
            int i5 = BottomAppBar.f761k;
            Objects.requireNonNull(bottomAppBar);
        }
    }

    public b(BottomAppBar bottomAppBar, int i5) {
        this.f3120b = bottomAppBar;
        this.f3119a = i5;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public final void a(@NonNull FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f3120b.d(this.f3119a));
        floatingActionButton.m(new a(), true);
    }
}
