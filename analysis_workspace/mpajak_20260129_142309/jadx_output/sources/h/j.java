package h;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final Map<String, String> f3050d = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f3051a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<?>[] f3052b;

    /* renamed from: c, reason: collision with root package name */
    public g f3053c = null;

    /* loaded from: classes2.dex */
    public static class a extends HashMap<String, String> {
        public a() {
            put("int", "I");
            put(TypedValues.Custom.S_BOOLEAN, "Z");
            put("byte", "B");
            put("char", "C");
            put("short", ExifInterface.LATITUDE_SOUTH);
            put(TypedValues.Custom.S_FLOAT, "F");
            put("long", "J");
            put("double", "D");
        }
    }

    public j(String str, Class<?>[] clsArr) {
        this.f3051a = str;
        this.f3052b = clsArr;
    }
}
