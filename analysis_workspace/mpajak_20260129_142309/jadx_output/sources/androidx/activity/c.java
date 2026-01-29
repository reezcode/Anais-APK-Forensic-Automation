package androidx.activity;

import android.app.Activity;
import androidx.core.app.ActivityCompat;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.room.QueryInterceptorStatement;
import androidx.work.multiprocess.RemoteCoroutineWorker;

/* loaded from: classes22.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f120b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f121c;

    public /* synthetic */ c(Object obj, int i5) {
        this.f120b = i5;
        this.f121c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f120b) {
            case 0:
                ((ComponentActivity) this.f121c).invalidateMenu();
                break;
            case 1:
                ActivityCompat.lambda$recreate$0((Activity) this.f121c);
                break;
            case 2:
                ((ContentLoadingProgressBar) this.f121c).lambda$new$0();
                break;
            case 3:
                QueryInterceptorStatement.simpleQueryForLong$lambda$3((QueryInterceptorStatement) this.f121c);
                break;
            default:
                RemoteCoroutineWorker._init_$lambda$0((RemoteCoroutineWorker) this.f121c);
                break;
        }
    }
}
