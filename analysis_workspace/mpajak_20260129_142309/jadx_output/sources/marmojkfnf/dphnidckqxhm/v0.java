package marmojkfnf.dphnidckqxhm;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.blankj.utilcode.util.TimeUtils;
import fmfjq.twyvy.xjhbp;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import org.apache.commons.io.FileUtils;

/* loaded from: classes9.dex */
public final class v0 {

    /* renamed from: d, reason: collision with root package name */
    public static volatile v0 f4408d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f4409e;

    /* renamed from: f, reason: collision with root package name */
    public static long f4410f;

    /* renamed from: a, reason: collision with root package name */
    public Handler f4411a;

    /* renamed from: b, reason: collision with root package name */
    public Context f4412b;

    /* renamed from: c, reason: collision with root package name */
    public FileOutputStream f4413c;

    static {
        xjhbp.classescxclcy(77);
        f4409e = System.currentTimeMillis();
        f4410f = 0L;
    }

    public v0(Context context) {
        try {
            HandlerThread handlerThread = new HandlerThread(i0.a("cmVjX2xvZw=="));
            handlerThread.start();
            this.f4411a = new Handler(handlerThread.getLooper());
            this.f4412b = context;
            String replace = p.f4375a.a().replace(i0.a("Lg=="), i0.a("Xw==")).replace(i0.a("Og=="), i0.a("Xw=="));
            this.f4413c = FileUtils.openOutputStream(new File(context.getFilesDir().getAbsolutePath() + i0.a("L0ZHTE9HLw==") + TimeUtils.date2String(new Date(), i0.a("eXl5eS1NTS1kZA==")), replace + i0.a("LmxvZw==")), true);
            a(i0.a("LS0tLS0tLS0tLS0tLS0tLS0t5paw5ZCv5YqoLS0tLS0tLS0tLS0tLS0tLS0="));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static native v0 a(Context context);

    public final native void a(Object... objArr);
}
