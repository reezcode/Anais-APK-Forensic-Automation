package androidx.core.location;

import android.location.Location;
import java.io.IOException;
import java.util.function.Consumer;

/* loaded from: classes6.dex */
public final /* synthetic */ class e implements Consumer {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f180b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f181c;

    public /* synthetic */ e(Object obj, int i5) {
        this.f180b = i5;
        this.f181c = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f180b) {
            case 0:
                ((androidx.core.util.Consumer) this.f181c).accept((Location) obj);
                break;
            case 1:
                ((Exception) this.f181c).addSuppressed((IOException) obj);
                break;
            default:
                ((IOException) this.f181c).addSuppressed((IOException) obj);
                break;
        }
    }
}
