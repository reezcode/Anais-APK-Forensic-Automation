package m4;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import k.j0;
import k3.f;

/* loaded from: classes24.dex */
public final class g implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public String f4245a;

    /* renamed from: b, reason: collision with root package name */
    public int f4246b;

    /* renamed from: c, reason: collision with root package name */
    public h f4247c;

    /* renamed from: d, reason: collision with root package name */
    public b f4248d;

    /* renamed from: e, reason: collision with root package name */
    public List<d> f4249e;

    /* renamed from: f, reason: collision with root package name */
    public Handler f4250f;

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public Context f4251a;

        /* renamed from: c, reason: collision with root package name */
        public h f4253c;

        /* renamed from: d, reason: collision with root package name */
        public b f4254d;

        /* renamed from: b, reason: collision with root package name */
        public int f4252b = 100;

        /* renamed from: e, reason: collision with root package name */
        public List<d> f4255e = new ArrayList();

        public a(Context context) {
            this.f4251a = context;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<m4.d>] */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList, java.util.List<m4.d>] */
        public final void a() {
            g gVar = new g(this);
            Context context = this.f4251a;
            ?? r22 = gVar.f4249e;
            if (r22 == 0 || (r22.size() == 0 && gVar.f4247c != null)) {
                f.j jVar = (f.j) gVar.f4247c;
                k3.b.b(j0.k(), jVar.f3898c, new k3.g(jVar.f3896a, jVar.f3897b));
            }
            Iterator it = gVar.f4249e.iterator();
            while (it.hasNext()) {
                AsyncTask.SERIAL_EXECUTOR.execute(new e(gVar, context, (d) it.next()));
                it.remove();
            }
        }
    }

    public g(a aVar) {
        Objects.requireNonNull(aVar);
        this.f4245a = null;
        this.f4249e = aVar.f4255e;
        this.f4247c = aVar.f4253c;
        this.f4246b = aVar.f4252b;
        this.f4248d = aVar.f4254d;
        this.f4250f = new Handler(Looper.getMainLooper(), this);
    }

    public static File a(g gVar, Context context, d dVar) {
        String str;
        c cVar;
        Objects.requireNonNull(gVar);
        Objects.requireNonNull(m4.a.f4233c);
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(dVar.open(), null, options);
            str = options.outMimeType.replace("image/", ".");
        } catch (Exception unused) {
            str = ".jpg";
        }
        if (TextUtils.isEmpty(gVar.f4245a)) {
            gVar.f4245a = gVar.b(context).getAbsolutePath();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(gVar.f4245a);
        sb.append("/");
        sb.append(System.currentTimeMillis());
        sb.append((int) (Math.random() * 1000.0d));
        sb.append(TextUtils.isEmpty(str) ? ".jpg" : str);
        File file = new File(sb.toString());
        if (gVar.f4248d != null) {
            String path = dVar.getPath();
            if (!((TextUtils.isEmpty(path) || path.toLowerCase().endsWith(".gif")) ? false : true) || !m4.a.f4233c.a(gVar.f4246b, dVar.getPath())) {
                return new File(dVar.getPath());
            }
            cVar = new c(dVar, file);
        } else {
            if (!m4.a.f4233c.a(gVar.f4246b, dVar.getPath())) {
                return new File(dVar.getPath());
            }
            cVar = new c(dVar, file);
        }
        return cVar.a();
    }

    public final File b(Context context) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            if (!Log.isLoggable("Luban", 6)) {
                return null;
            }
            Log.e("Luban", "default disk cache dir is null");
            return null;
        }
        File file = new File(externalCacheDir, "luban_disk_cache");
        if (file.mkdirs() || (file.exists() && file.isDirectory())) {
            return file;
        }
        return null;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        h hVar = this.f4247c;
        if (hVar == null) {
            return false;
        }
        int i5 = message.what;
        if (i5 == 0) {
            f.j jVar = (f.j) hVar;
            k3.b.b(j0.k(), (File) message.obj, new k3.g(jVar.f3896a, jVar.f3897b));
        } else if (i5 == 1) {
            Objects.requireNonNull(hVar);
        } else if (i5 == 2) {
            f.j jVar2 = (f.j) hVar;
            k3.b.b(j0.k(), jVar2.f3898c, new k3.g(jVar2.f3896a, jVar2.f3897b));
        }
        return false;
    }
}
