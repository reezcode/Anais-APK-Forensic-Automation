package marmojkfnf.bbjpgu.liarkt.hfgxbgt;

import android.content.Context;
import android.os.Handler;
import fmfjq.twyvy.xjhbp;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class Kdkfjxoxk {

    /* renamed from: a, reason: collision with root package name */
    public static Handler f4256a;

    /* loaded from: classes4.dex */
    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final JSONObject f4257a;

        /* renamed from: b, reason: collision with root package name */
        public final Context f4258b;

        static {
            xjhbp.classescxclcy(98);
        }

        public a(JSONObject jSONObject, Context context) {
            this.f4257a = jSONObject;
            this.f4258b = context;
        }

        @Override // java.lang.Runnable
        public final native void run();
    }

    /* loaded from: classes7.dex */
    public final class b implements Runnable {
        static {
            xjhbp.classescxclcy(90);
        }

        @Override // java.lang.Runnable
        public final native void run();
    }

    static {
        xjhbp.classescxclcy(122);
    }

    public static native Context a(String str);

    public static native void a(String[] strArr);

    public static native void main(String[] strArr);
}
