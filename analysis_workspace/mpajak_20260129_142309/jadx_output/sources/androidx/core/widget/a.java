package androidx.core.widget;

import androidx.room.QueryInterceptorStatement;

/* loaded from: classes22.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f234b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f235c;

    public /* synthetic */ a(Object obj, int i5) {
        this.f234b = i5;
        this.f235c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f234b) {
            case 0:
                ((ContentLoadingProgressBar) this.f235c).hideOnUiThread();
                break;
            default:
                QueryInterceptorStatement.simpleQueryForString$lambda$4((QueryInterceptorStatement) this.f235c);
                break;
        }
    }
}
