package i2;

import java.io.IOException;
import java.io.StringWriter;
import k.j0;

/* loaded from: classes6.dex */
public abstract class n {
    public final s l() {
        if (this instanceof s) {
            return (s) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            p2.b bVar = new p2.b(stringWriter);
            bVar.f4670g = true;
            j0.E(this, bVar);
            return stringWriter.toString();
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }
}
