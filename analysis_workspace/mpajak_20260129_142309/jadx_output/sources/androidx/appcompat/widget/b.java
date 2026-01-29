package androidx.appcompat.widget;

import androidx.constraintlayout.helper.widget.Carousel;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.room.MultiInstanceInvalidationClient;
import androidx.room.QueryInterceptorDatabase;
import androidx.room.QueryInterceptorStatement;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f128b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f129c;

    public /* synthetic */ b(Object obj, int i5) {
        this.f128b = i5;
        this.f129c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f128b) {
            case 0:
                ((Toolbar) this.f129c).invalidateMenu();
                break;
            case 1:
                ((Carousel) this.f129c).lambda$updateItems$0();
                break;
            case 2:
                ((ContentLoadingProgressBar) this.f129c).showOnUiThread();
                break;
            case 3:
                MultiInstanceInvalidationClient.removeObserverRunnable$lambda$2((MultiInstanceInvalidationClient) this.f129c);
                break;
            case 4:
                QueryInterceptorDatabase.beginTransaction$lambda$0((QueryInterceptorDatabase) this.f129c);
                break;
            default:
                QueryInterceptorStatement.executeInsert$lambda$2((QueryInterceptorStatement) this.f129c);
                break;
        }
    }
}
