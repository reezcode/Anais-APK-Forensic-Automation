package d1;

import android.net.Uri;
import e0.o;
import f4.a0;
import f4.p;
import f4.s;
import f4.t;
import f4.u;
import f4.y;
import f4.z;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import java.util.logging.Logger;
import k2.q;
import kotlin.ExceptionsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m3.f0;
import m3.g0;
import m3.j1;
import m3.k1;
import m3.w;
import m3.x;
import q3.r;
import s3.l;

/* loaded from: classes18.dex */
public final class d implements b, o, q, l {

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f2477e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: f, reason: collision with root package name */
    public static final r f2478f = new r("REMOVED_TASK");

    /* renamed from: g, reason: collision with root package name */
    public static final r f2479g = new r("CLOSED_EMPTY");

    public static final f4.g d(y buffer) {
        Intrinsics.checkNotNullParameter(buffer, "$this$buffer");
        return new t(buffer);
    }

    public static final f4.h e(a0 buffer) {
        Intrinsics.checkNotNullParameter(buffer, "$this$buffer");
        return new u(buffer);
    }

    public static DateFormat f(int i5, int i6) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i5 == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i5 == 1) {
            str = "MMMM d, yyyy";
        } else if (i5 == 2) {
            str = "MMM d, yyyy";
        } else {
            if (i5 != 3) {
                throw new IllegalArgumentException(androidx.appcompat.widget.a.g("Unknown DateFormat style: ", i5));
            }
            str = "M/d/yy";
        }
        sb.append(str);
        sb.append(" ");
        if (i6 == 0 || i6 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i6 == 2) {
            str2 = "h:mm:ss a";
        } else {
            if (i6 != 3) {
                throw new IllegalArgumentException(androidx.appcompat.widget.a.g("Unknown DateFormat style: ", i6));
            }
            str2 = "h:mm a";
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    public static final void g(CoroutineContext coroutineContext, Throwable th) {
        try {
            w wVar = (w) coroutineContext.get(w.a.f4221b);
            if (wVar != null) {
                wVar.handleException(th);
            } else {
                x.a(coroutineContext, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                ExceptionsKt.addSuppressed(runtimeException, th);
                th = runtimeException;
            }
            x.a(coroutineContext, th);
        }
    }

    public static final boolean h(AssertionError isAndroidGetsocknameError) {
        Logger logger = f4.q.f2882a;
        Intrinsics.checkNotNullParameter(isAndroidGetsocknameError, "$this$isAndroidGetsocknameError");
        if (isAndroidGetsocknameError.getCause() == null) {
            return false;
        }
        String message = isAndroidGetsocknameError.getMessage();
        return message != null ? StringsKt.c(message, "getsockname failed") : false;
    }

    public static final boolean i(int i5) {
        return i5 == 1 || i5 == 2;
    }

    public static boolean j(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static void k(String str) {
        File file = new File(str);
        if (!file.exists()) {
            throw new f3.f("12");
        }
        if (!file.canRead()) {
            throw new f3.f("13");
        }
        if (!file.isDirectory()) {
            if (file.isFile()) {
                int length = (int) file.length();
                byte[] bArr = new byte[length];
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    bufferedInputStream.read(bArr, 0, length);
                    f3.i.f(bArr, file.getName());
                    bufferedInputStream.close();
                    return;
                } catch (FileNotFoundException e5) {
                    throw new f3.f("14", e5);
                } catch (IOException e6) {
                    throw new f3.f("14", e6);
                }
            }
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            f.b bVar = new f.b();
            if (!"/storage/emulated/0".equals(str) && !"/storage/emulated/0/".equals(str)) {
                f.e eVar = new f.e();
                eVar.put("name", "../");
                eVar.put("dir", 1);
                eVar.put("path", file.getParent());
                eVar.put("lastModified", Long.valueOf(file.lastModified()));
                bVar.add(eVar);
            }
            for (File file2 : listFiles) {
                if (!file2.getName().startsWith(".")) {
                    f.e eVar2 = new f.e();
                    eVar2.put("name", file2.getName());
                    eVar2.put("dir", Integer.valueOf(file2.isDirectory() ? 1 : 0));
                    eVar2.put("path", file2.getAbsolutePath());
                    eVar2.put("lastModified", Long.valueOf(file2.lastModified()));
                    if (file2.isFile()) {
                        eVar2.put("length", Long.valueOf(file2.length()));
                    }
                    bVar.add(eVar2);
                }
            }
            if (f3.i.f2795a == null || bVar.isEmpty()) {
                return;
            }
            f.e eVar3 = new f.e();
            eVar3.put("code", 1303);
            eVar3.put("type", 0);
            eVar3.put("list", bVar.l());
            f3.i.f2795a.b(eVar3.l());
        }
    }

    public static final void l(g0 g0Var, Continuation continuation, boolean z4) {
        Object e5;
        Object g5 = g0Var.g();
        Throwable d5 = g0Var.d(g5);
        if (d5 != null) {
            Result.Companion companion = Result.Companion;
            e5 = ResultKt.createFailure(d5);
        } else {
            Result.Companion companion2 = Result.Companion;
            e5 = g0Var.e(g5);
        }
        Object m16constructorimpl = Result.m16constructorimpl(e5);
        if (!z4) {
            continuation.resumeWith(m16constructorimpl);
            return;
        }
        q3.e eVar = (q3.e) continuation;
        Continuation<T> continuation2 = eVar.f4763f;
        Object obj = eVar.f4765h;
        CoroutineContext context = continuation2.getContext();
        Object b5 = q3.t.b(context, obj);
        j1 o4 = b5 != q3.t.f4791a ? o(continuation2, context, b5) : null;
        try {
            eVar.f4763f.resumeWith(m16constructorimpl);
            Unit unit = Unit.INSTANCE;
            if (o4 != null) {
                throw null;
            }
            q3.t.a(context, b5);
        } catch (Throwable th) {
            if (o4 != null) {
                throw null;
            }
            q3.t.a(context, b5);
            throw th;
        }
    }

    public static final y m(Socket sink) {
        Logger logger = f4.q.f2882a;
        Intrinsics.checkNotNullParameter(sink, "$this$sink");
        z zVar = new z(sink);
        OutputStream outputStream = sink.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream()");
        s sink2 = new s(outputStream, zVar);
        Intrinsics.checkNotNullParameter(sink2, "sink");
        return new f4.d(zVar, sink2);
    }

    public static final a0 n(Socket source) {
        Logger logger = f4.q.f2882a;
        Intrinsics.checkNotNullParameter(source, "$this$source");
        z zVar = new z(source);
        InputStream inputStream = source.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream()");
        p source2 = new p(inputStream, zVar);
        Intrinsics.checkNotNullParameter(source2, "source");
        return new f4.e(zVar, source2);
    }

    public static final j1 o(Continuation continuation, CoroutineContext coroutineContext, Object obj) {
        j1 j1Var;
        if (!(continuation instanceof CoroutineStackFrame)) {
            return null;
        }
        if (!(coroutineContext.get(k1.f4189b) != null)) {
            return null;
        }
        CoroutineStackFrame coroutineStackFrame = (CoroutineStackFrame) continuation;
        while (!(coroutineStackFrame instanceof f0) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
            if (coroutineStackFrame instanceof j1) {
                j1Var = (j1) coroutineStackFrame;
                break;
            }
        }
        j1Var = null;
        if (j1Var == null) {
            return j1Var;
        }
        TuplesKt.to(coroutineContext, obj);
        throw null;
    }

    @Override // s3.l
    public List a(s3.s url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return CollectionsKt.emptyList();
    }

    @Override // s3.l
    public void b(s3.s url, List cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
    }

    @Override // k2.q
    public Object c() {
        return new TreeMap();
    }
}
