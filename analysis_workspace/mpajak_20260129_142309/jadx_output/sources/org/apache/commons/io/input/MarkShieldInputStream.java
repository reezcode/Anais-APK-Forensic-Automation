package org.apache.commons.io.input;

import java.io.InputStream;

/* loaded from: classes4.dex */
public class MarkShieldInputStream extends ProxyInputStream {
    public MarkShieldInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public void mark(int i5) {
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw UnsupportedOperationExceptions.reset();
    }
}
