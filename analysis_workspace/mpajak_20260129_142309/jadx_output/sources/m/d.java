package m;

import java.io.InputStream;
import java.security.PrivilegedAction;

/* loaded from: classes23.dex */
public final class d implements PrivilegedAction<InputStream> {
    @Override // java.security.PrivilegedAction
    public final InputStream run() {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader != null ? contextClassLoader.getResourceAsStream("fastjson.properties") : ClassLoader.getSystemResourceAsStream("fastjson.properties");
    }
}
