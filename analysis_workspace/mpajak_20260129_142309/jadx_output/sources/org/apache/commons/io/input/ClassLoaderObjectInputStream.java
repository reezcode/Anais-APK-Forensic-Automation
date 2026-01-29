package org.apache.commons.io.input;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Proxy;

/* loaded from: classes6.dex */
public class ClassLoaderObjectInputStream extends ObjectInputStream {
    private final ClassLoader classLoader;

    public ClassLoaderObjectInputStream(ClassLoader classLoader, InputStream inputStream) {
        super(inputStream);
        this.classLoader = classLoader;
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
        try {
            return Class.forName(objectStreamClass.getName(), false, this.classLoader);
        } catch (ClassNotFoundException unused) {
            return super.resolveClass(objectStreamClass);
        }
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveProxyClass(String[] strArr) {
        Class[] clsArr = new Class[strArr.length];
        for (int i5 = 0; i5 < strArr.length; i5++) {
            clsArr[i5] = Class.forName(strArr[i5], false, this.classLoader);
        }
        try {
            return Proxy.getProxyClass(this.classLoader, clsArr);
        } catch (IllegalArgumentException unused) {
            return super.resolveProxyClass(strArr);
        }
    }
}
