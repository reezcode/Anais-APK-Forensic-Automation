package k4;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes5.dex */
public final class c extends ScheduledThreadPoolExecutor {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3907b = 0;

    /* loaded from: classes24.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f3908a = new c();
    }

    public c() {
        super(1, new ThreadPoolExecutor.DiscardPolicy());
    }
}
