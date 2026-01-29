package r;

import android.util.Log;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class r extends Exception {

    /* renamed from: g, reason: collision with root package name */
    public static final StackTraceElement[] f4968g = new StackTraceElement[0];

    /* renamed from: b, reason: collision with root package name */
    public final List<Throwable> f4969b;

    /* renamed from: c, reason: collision with root package name */
    public p.f f4970c;

    /* renamed from: d, reason: collision with root package name */
    public p.a f4971d;

    /* renamed from: e, reason: collision with root package name */
    public Class<?> f4972e;

    /* renamed from: f, reason: collision with root package name */
    public String f4973f;

    /* loaded from: classes22.dex */
    public static final class a implements Appendable {

        /* renamed from: b, reason: collision with root package name */
        public final Appendable f4974b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f4975c = true;

        public a(Appendable appendable) {
            this.f4974b = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c5) {
            if (this.f4975c) {
                this.f4975c = false;
                this.f4974b.append("  ");
            }
            this.f4975c = c5 == '\n';
            this.f4974b.append(c5);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(@Nullable CharSequence charSequence) {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(@Nullable CharSequence charSequence, int i5, int i6) {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z4 = false;
            if (this.f4975c) {
                this.f4975c = false;
                this.f4974b.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i6 - 1) == '\n') {
                z4 = true;
            }
            this.f4975c = z4;
            this.f4974b.append(charSequence, i5, i6);
            return this;
        }
    }

    public r(String str) {
        this(str, Collections.emptyList());
    }

    public r(String str, List<Throwable> list) {
        this.f4973f = str;
        setStackTrace(f4968g);
        this.f4969b = list;
    }

    public static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }

    public static void c(List<Throwable> list, Appendable appendable) {
        int size = list.size();
        int i5 = 0;
        while (i5 < size) {
            a aVar = (a) appendable;
            aVar.append("Cause (");
            int i6 = i5 + 1;
            aVar.append(String.valueOf(i6));
            aVar.append(" of ");
            aVar.append(String.valueOf(size));
            aVar.append("): ");
            Throwable th = list.get(i5);
            if (th instanceof r) {
                ((r) th).f(appendable);
            } else {
                d(th, appendable);
            }
            i5 = i6;
        }
    }

    public static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void a(Throwable th, List<Throwable> list) {
        if (!(th instanceof r)) {
            list.add(th);
            return;
        }
        Iterator<Throwable> it = ((r) th).f4969b.iterator();
        while (it.hasNext()) {
            a(it.next(), list);
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            StringBuilder g5 = androidx.activity.d.g("Root cause (");
            int i6 = i5 + 1;
            g5.append(i6);
            g5.append(" of ");
            g5.append(size);
            g5.append(")");
            Log.i("Glide", g5.toString(), (Throwable) arrayList.get(i5));
            i5 = i6;
        }
    }

    public final void f(Appendable appendable) {
        d(this, appendable);
        b(this.f4969b, new a(appendable));
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f4973f);
        String str4 = "";
        if (this.f4972e != null) {
            StringBuilder g5 = androidx.activity.d.g(", ");
            g5.append(this.f4972e);
            str = g5.toString();
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f4971d != null) {
            StringBuilder g6 = androidx.activity.d.g(", ");
            g6.append(this.f4971d);
            str2 = g6.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (this.f4970c != null) {
            StringBuilder g7 = androidx.activity.d.g(", ");
            g7.append(this.f4970c);
            str4 = g7.toString();
        }
        sb.append(str4);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            str3 = "\nThere was 1 root cause:";
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            str3 = " root causes:";
        }
        sb.append(str3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        f(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        f(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        f(printWriter);
    }
}
