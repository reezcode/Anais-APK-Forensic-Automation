package n;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FilenameUtils;

/* loaded from: classes24.dex */
public final class a implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final File f4463b;

    /* renamed from: c, reason: collision with root package name */
    public final File f4464c;

    /* renamed from: d, reason: collision with root package name */
    public final File f4465d;

    /* renamed from: e, reason: collision with root package name */
    public final File f4466e;

    /* renamed from: g, reason: collision with root package name */
    public long f4468g;

    /* renamed from: j, reason: collision with root package name */
    public BufferedWriter f4471j;

    /* renamed from: l, reason: collision with root package name */
    public int f4473l;

    /* renamed from: i, reason: collision with root package name */
    public long f4470i = 0;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap<String, d> f4472k = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: m, reason: collision with root package name */
    public long f4474m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final ThreadPoolExecutor f4475n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());

    /* renamed from: o, reason: collision with root package name */
    public final Callable<Void> f4476o = new CallableC0055a();

    /* renamed from: f, reason: collision with root package name */
    public final int f4467f = 1;

    /* renamed from: h, reason: collision with root package name */
    public final int f4469h = 1;

    /* renamed from: n.a$a, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class CallableC0055a implements Callable<Void> {
        public CallableC0055a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() {
            synchronized (a.this) {
                a aVar = a.this;
                if (aVar.f4471j != null) {
                    aVar.z();
                    if (a.this.p()) {
                        a.this.x();
                        a.this.f4473l = 0;
                    }
                }
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* loaded from: classes4.dex */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        public final d f4478a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f4479b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f4480c;

        public c(d dVar) {
            this.f4478a = dVar;
            this.f4479b = dVar.f4486e ? null : new boolean[a.this.f4469h];
        }

        public final void a() {
            a.a(a.this, this, false);
        }

        public final File b() {
            File file;
            synchronized (a.this) {
                d dVar = this.f4478a;
                if (dVar.f4487f != this) {
                    throw new IllegalStateException();
                }
                if (!dVar.f4486e) {
                    this.f4479b[0] = true;
                }
                file = dVar.f4485d[0];
                a.this.f4463b.mkdirs();
            }
            return file;
        }
    }

    /* loaded from: classes12.dex */
    public final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f4482a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f4483b;

        /* renamed from: c, reason: collision with root package name */
        public File[] f4484c;

        /* renamed from: d, reason: collision with root package name */
        public File[] f4485d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f4486e;

        /* renamed from: f, reason: collision with root package name */
        public c f4487f;

        /* renamed from: g, reason: collision with root package name */
        public long f4488g;

        public d(String str) {
            this.f4482a = str;
            int i5 = a.this.f4469h;
            this.f4483b = new long[i5];
            this.f4484c = new File[i5];
            this.f4485d = new File[i5];
            StringBuilder sb = new StringBuilder(str);
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            int length = sb.length();
            for (int i6 = 0; i6 < a.this.f4469h; i6++) {
                sb.append(i6);
                this.f4484c[i6] = new File(a.this.f4463b, sb.toString());
                sb.append(".tmp");
                this.f4485d[i6] = new File(a.this.f4463b, sb.toString());
                sb.setLength(length);
            }
        }

        public final String a() {
            StringBuilder sb = new StringBuilder();
            for (long j5 : this.f4483b) {
                sb.append(' ');
                sb.append(j5);
            }
            return sb.toString();
        }

        public final IOException b(String[] strArr) {
            StringBuilder g5 = androidx.activity.d.g("unexpected journal line: ");
            g5.append(Arrays.toString(strArr));
            throw new IOException(g5.toString());
        }
    }

    /* loaded from: classes16.dex */
    public final class e {

        /* renamed from: a, reason: collision with root package name */
        public final File[] f4490a;

        public e(File[] fileArr) {
            this.f4490a = fileArr;
        }
    }

    public a(File file, long j5) {
        this.f4463b = file;
        this.f4464c = new File(file, "journal");
        this.f4465d = new File(file, "journal.tmp");
        this.f4466e = new File(file, "journal.bkp");
        this.f4468g = j5;
    }

    public static void a(a aVar, c cVar, boolean z4) {
        synchronized (aVar) {
            d dVar = cVar.f4478a;
            if (dVar.f4487f != cVar) {
                throw new IllegalStateException();
            }
            if (z4 && !dVar.f4486e) {
                for (int i5 = 0; i5 < aVar.f4469h; i5++) {
                    if (!cVar.f4479b[i5]) {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i5);
                    }
                    if (!dVar.f4485d[i5].exists()) {
                        cVar.a();
                        break;
                    }
                }
            }
            for (int i6 = 0; i6 < aVar.f4469h; i6++) {
                File file = dVar.f4485d[i6];
                if (!z4) {
                    e(file);
                } else if (file.exists()) {
                    File file2 = dVar.f4484c[i6];
                    file.renameTo(file2);
                    long j5 = dVar.f4483b[i6];
                    long length = file2.length();
                    dVar.f4483b[i6] = length;
                    aVar.f4470i = (aVar.f4470i - j5) + length;
                }
            }
            aVar.f4473l++;
            dVar.f4487f = null;
            if (dVar.f4486e || z4) {
                dVar.f4486e = true;
                aVar.f4471j.append((CharSequence) "CLEAN");
                aVar.f4471j.append(' ');
                aVar.f4471j.append((CharSequence) dVar.f4482a);
                aVar.f4471j.append((CharSequence) dVar.a());
                aVar.f4471j.append('\n');
                if (z4) {
                    long j6 = aVar.f4474m;
                    aVar.f4474m = 1 + j6;
                    dVar.f4488g = j6;
                }
            } else {
                aVar.f4472k.remove(dVar.f4482a);
                aVar.f4471j.append((CharSequence) "REMOVE");
                aVar.f4471j.append(' ');
                aVar.f4471j.append((CharSequence) dVar.f4482a);
                aVar.f4471j.append('\n');
            }
            l(aVar.f4471j);
            if (aVar.f4470i > aVar.f4468g || aVar.p()) {
                aVar.f4475n.submit(aVar.f4476o);
            }
        }
    }

    @TargetApi(26)
    public static void c(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void e(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void l(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static a q(File file, long j5) {
        if (j5 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                y(file2, file3, false);
            }
        }
        a aVar = new a(file, j5);
        if (aVar.f4464c.exists()) {
            try {
                aVar.s();
                aVar.r();
                return aVar;
            } catch (IOException e5) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e5.getMessage() + ", removing");
                aVar.close();
                n.c.a(aVar.f4463b);
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, j5);
        aVar2.x();
        return aVar2;
    }

    public static void y(File file, File file2, boolean z4) {
        if (z4) {
            e(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final void b() {
        if (this.f4471j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f4471j == null) {
            return;
        }
        Iterator it = new ArrayList(this.f4472k.values()).iterator();
        while (it.hasNext()) {
            c cVar = ((d) it.next()).f4487f;
            if (cVar != null) {
                cVar.a();
            }
        }
        z();
        c(this.f4471j);
        this.f4471j = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        if (r0.f4487f != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final n.a.c f(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.b()     // Catch: java.lang.Throwable -> L48
            java.util.LinkedHashMap<java.lang.String, n.a$d> r0 = r3.f4472k     // Catch: java.lang.Throwable -> L48
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L48
            n.a$d r0 = (n.a.d) r0     // Catch: java.lang.Throwable -> L48
            r1 = 0
            if (r0 != 0) goto L1a
            n.a$d r0 = new n.a$d     // Catch: java.lang.Throwable -> L48
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L48
            java.util.LinkedHashMap<java.lang.String, n.a$d> r1 = r3.f4472k     // Catch: java.lang.Throwable -> L48
            r1.put(r4, r0)     // Catch: java.lang.Throwable -> L48
            goto L20
        L1a:
            n.a$c r2 = r0.f4487f     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L20
        L1e:
            monitor-exit(r3)
            goto L47
        L20:
            n.a$c r1 = new n.a$c     // Catch: java.lang.Throwable -> L48
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L48
            r0.f4487f = r1     // Catch: java.lang.Throwable -> L48
            java.io.BufferedWriter r0 = r3.f4471j     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = "DIRTY"
            r0.append(r2)     // Catch: java.lang.Throwable -> L48
            java.io.BufferedWriter r0 = r3.f4471j     // Catch: java.lang.Throwable -> L48
            r2 = 32
            r0.append(r2)     // Catch: java.lang.Throwable -> L48
            java.io.BufferedWriter r0 = r3.f4471j     // Catch: java.lang.Throwable -> L48
            r0.append(r4)     // Catch: java.lang.Throwable -> L48
            java.io.BufferedWriter r4 = r3.f4471j     // Catch: java.lang.Throwable -> L48
            r0 = 10
            r4.append(r0)     // Catch: java.lang.Throwable -> L48
            java.io.BufferedWriter r4 = r3.f4471j     // Catch: java.lang.Throwable -> L48
            l(r4)     // Catch: java.lang.Throwable -> L48
            goto L1e
        L47:
            return r1
        L48:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n.a.f(java.lang.String):n.a$c");
    }

    public final synchronized e n(String str) {
        b();
        d dVar = this.f4472k.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f4486e) {
            return null;
        }
        for (File file : dVar.f4484c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f4473l++;
        this.f4471j.append((CharSequence) "READ");
        this.f4471j.append(' ');
        this.f4471j.append((CharSequence) str);
        this.f4471j.append('\n');
        if (p()) {
            this.f4475n.submit(this.f4476o);
        }
        return new e(dVar.f4484c);
    }

    public final boolean p() {
        int i5 = this.f4473l;
        return i5 >= 2000 && i5 >= this.f4472k.size();
    }

    public final void r() {
        e(this.f4465d);
        Iterator<d> it = this.f4472k.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i5 = 0;
            if (next.f4487f == null) {
                while (i5 < this.f4469h) {
                    this.f4470i += next.f4483b[i5];
                    i5++;
                }
            } else {
                next.f4487f = null;
                while (i5 < this.f4469h) {
                    e(next.f4484c[i5]);
                    e(next.f4485d[i5]);
                    i5++;
                }
                it.remove();
            }
        }
    }

    public final void s() {
        n.b bVar = new n.b(new FileInputStream(this.f4464c), n.c.f4497a);
        try {
            String b5 = bVar.b();
            String b6 = bVar.b();
            String b7 = bVar.b();
            String b8 = bVar.b();
            String b9 = bVar.b();
            if (!"libcore.io.DiskLruCache".equals(b5) || !"1".equals(b6) || !Integer.toString(this.f4467f).equals(b7) || !Integer.toString(this.f4469h).equals(b8) || !"".equals(b9)) {
                throw new IOException("unexpected journal header: [" + b5 + ", " + b6 + ", " + b8 + ", " + b9 + "]");
            }
            int i5 = 0;
            while (true) {
                try {
                    w(bVar.b());
                    i5++;
                } catch (EOFException unused) {
                    this.f4473l = i5 - this.f4472k.size();
                    if (bVar.f4495f == -1) {
                        x();
                    } else {
                        this.f4471j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4464c, true), n.c.f4497a));
                    }
                    try {
                        bVar.close();
                        return;
                    } catch (RuntimeException e5) {
                        throw e5;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (RuntimeException e6) {
                throw e6;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void w(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException(androidx.activity.d.f("unexpected journal line: ", str));
        }
        int i5 = indexOf + 1;
        int indexOf2 = str.indexOf(32, i5);
        if (indexOf2 == -1) {
            substring = str.substring(i5);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                this.f4472k.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i5, indexOf2);
        }
        d dVar = this.f4472k.get(substring);
        if (dVar == null) {
            dVar = new d(substring);
            this.f4472k.put(substring, dVar);
        }
        if (indexOf2 == -1 || indexOf != 5 || !str.startsWith("CLEAN")) {
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f4487f = new c(dVar);
                return;
            } else {
                if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException(androidx.activity.d.f("unexpected journal line: ", str));
                }
                return;
            }
        }
        String[] split = str.substring(indexOf2 + 1).split(" ");
        dVar.f4486e = true;
        dVar.f4487f = null;
        if (split.length != a.this.f4469h) {
            dVar.b(split);
            throw null;
        }
        for (int i6 = 0; i6 < split.length; i6++) {
            try {
                dVar.f4483b[i6] = Long.parseLong(split[i6]);
            } catch (NumberFormatException unused) {
                dVar.b(split);
                throw null;
            }
        }
    }

    public final synchronized void x() {
        StringBuilder sb;
        BufferedWriter bufferedWriter = this.f4471j;
        if (bufferedWriter != null) {
            c(bufferedWriter);
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4465d), n.c.f4497a));
        try {
            bufferedWriter2.write("libcore.io.DiskLruCache");
            bufferedWriter2.write("\n");
            bufferedWriter2.write("1");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f4467f));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f4469h));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (d dVar : this.f4472k.values()) {
                if (dVar.f4487f != null) {
                    sb = new StringBuilder();
                    sb.append("DIRTY ");
                    sb.append(dVar.f4482a);
                    sb.append('\n');
                } else {
                    sb = new StringBuilder();
                    sb.append("CLEAN ");
                    sb.append(dVar.f4482a);
                    sb.append(dVar.a());
                    sb.append('\n');
                }
                bufferedWriter2.write(sb.toString());
            }
            c(bufferedWriter2);
            if (this.f4464c.exists()) {
                y(this.f4464c, this.f4466e, true);
            }
            y(this.f4465d, this.f4464c, false);
            this.f4466e.delete();
            this.f4471j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4464c, true), n.c.f4497a));
        } catch (Throwable th) {
            c(bufferedWriter2);
            throw th;
        }
    }

    public final void z() {
        while (this.f4470i > this.f4468g) {
            String key = this.f4472k.entrySet().iterator().next().getKey();
            synchronized (this) {
                b();
                d dVar = this.f4472k.get(key);
                if (dVar != null && dVar.f4487f == null) {
                    for (int i5 = 0; i5 < this.f4469h; i5++) {
                        File file = dVar.f4484c[i5];
                        if (file.exists() && !file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                        long j5 = this.f4470i;
                        long[] jArr = dVar.f4483b;
                        this.f4470i = j5 - jArr[i5];
                        jArr[i5] = 0;
                    }
                    this.f4473l++;
                    this.f4471j.append((CharSequence) "REMOVE");
                    this.f4471j.append(' ');
                    this.f4471j.append((CharSequence) key);
                    this.f4471j.append('\n');
                    this.f4472k.remove(key);
                    if (p()) {
                        this.f4475n.submit(this.f4476o);
                    }
                }
            }
        }
    }
}
