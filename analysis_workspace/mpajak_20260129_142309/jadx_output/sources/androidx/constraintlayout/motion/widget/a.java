package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.room.MultiInstanceInvalidationClient;
import androidx.room.MultiInstanceInvalidationClient$callback$1;
import androidx.room.QueryInterceptorDatabase;

/* loaded from: classes22.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f163b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f164c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f165d;

    public /* synthetic */ a(Object obj, Object obj2, int i5) {
        this.f163b = i5;
        this.f164c = obj;
        this.f165d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f163b) {
            case 0:
                ((ViewTransition) this.f164c).lambda$applyTransition$0((View[]) this.f165d);
                break;
            case 1:
                MultiInstanceInvalidationClient$callback$1.onInvalidation$lambda$0((MultiInstanceInvalidationClient) this.f164c, (String[]) this.f165d);
                break;
            default:
                QueryInterceptorDatabase.query$lambda$6((QueryInterceptorDatabase) this.f164c, (String) this.f165d);
                break;
        }
    }
}
