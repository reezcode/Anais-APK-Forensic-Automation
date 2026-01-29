package d1;

import java.io.PrintStream;

/* loaded from: classes19.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final f f2480a;

    /* loaded from: classes22.dex */
    public static final class a extends f {
        @Override // d1.f
        public final void L(Throwable th, Throwable th2) {
        }
    }

    static {
        f aVar;
        Integer num = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e5) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e5.printStackTrace(System.err);
            }
            aVar = (num == null || num.intValue() < 19) ? Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ^ true ? new i() : new a() : new j();
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            String name = a.class.getName();
            StringBuilder sb = new StringBuilder(name.length() + 133);
            sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb.append(name);
            sb.append("will be used. The error is: ");
            printStream.println(sb.toString());
            th.printStackTrace(System.err);
            aVar = new a();
        }
        f2480a = aVar;
        if (num == null) {
            return;
        }
        num.intValue();
    }
}
