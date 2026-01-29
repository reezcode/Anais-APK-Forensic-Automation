package j;

import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public abstract class e implements s {
    @Override // j.s
    public <T> T c(i.a aVar, Type type, Object obj) {
        return (T) f(aVar, type, obj, null);
    }

    public abstract Object f(i.a aVar, Type type, Object obj, String str);
}
