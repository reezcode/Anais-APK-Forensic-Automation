package androidx.core.content.res;

import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import androidx.room.TransactionExecutor;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f169b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f170c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f171d;

    public /* synthetic */ a(Object obj, Object obj2, int i5) {
        this.f169b = i5;
        this.f170c = obj;
        this.f171d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f169b) {
            case 0:
                ((ResourcesCompat.FontCallback) this.f170c).lambda$callbackSuccessAsync$0((Typeface) this.f171d);
                break;
            default:
                TransactionExecutor.execute$lambda$1$lambda$0((Runnable) this.f170c, (TransactionExecutor) this.f171d);
                break;
        }
    }
}
