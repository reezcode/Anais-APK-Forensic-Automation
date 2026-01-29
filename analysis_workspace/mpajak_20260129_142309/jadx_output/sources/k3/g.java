package k3;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.superbock.bean.EInfo;
import java.io.IOException;
import s3.b0;

/* loaded from: classes9.dex */
public final class g implements s3.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EInfo f3899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3900b;

    public g(EInfo eInfo, Context context) {
        this.f3899a = eInfo;
        this.f3900b = context;
    }

    @Override // s3.e
    public final void a(@NonNull s3.d dVar, @NonNull b0 b0Var) {
        f.e u4;
        try {
            if (b0Var.b() && (u4 = f.a.u(b0Var.f5160h.e())) != null && u4.z(NotificationCompat.CATEGORY_STATUS) == 200) {
                f.e A = u4.A("data");
                this.f3899a.setMe(A.B("media"));
                this.f3899a.setTh(A.B("thumb"));
                g3.f.a().d(this.f3899a);
                f.v(this.f3899a, this.f3900b);
            } else {
                f.f3879j = false;
            }
        } catch (Throwable unused) {
            f.f3879j = false;
        }
    }

    @Override // s3.e
    public final void b(@NonNull s3.d dVar, @NonNull IOException iOException) {
        f.f3879j = false;
    }
}
