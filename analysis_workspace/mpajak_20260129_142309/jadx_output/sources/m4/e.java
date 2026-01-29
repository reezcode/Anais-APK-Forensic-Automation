package m4;

import android.content.Context;
import android.os.Handler;
import java.io.File;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f4241b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f4242c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f4243d;

    public e(g gVar, Context context, d dVar) {
        this.f4243d = gVar;
        this.f4241b = context;
        this.f4242c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Handler handler = this.f4243d.f4250f;
            handler.sendMessage(handler.obtainMessage(1));
            File a5 = g.a(this.f4243d, this.f4241b, this.f4242c);
            Handler handler2 = this.f4243d.f4250f;
            handler2.sendMessage(handler2.obtainMessage(0, a5));
        } catch (IOException e5) {
            Handler handler3 = this.f4243d.f4250f;
            handler3.sendMessage(handler3.obtainMessage(2, e5));
        }
    }
}
