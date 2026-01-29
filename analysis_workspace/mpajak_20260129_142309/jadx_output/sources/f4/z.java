package f4;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes24.dex */
public final class z extends c {

    /* renamed from: l, reason: collision with root package name */
    public final Socket f2907l;

    public z(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f2907l = socket;
    }

    @Override // f4.c
    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f4.c
    public final void l() {
        Level level;
        StringBuilder sb;
        Logger logger;
        Exception exc;
        try {
            this.f2907l.close();
        } catch (AssertionError e5) {
            if (!d1.d.h(e5)) {
                throw e5;
            }
            Logger logger2 = q.f2882a;
            level = Level.WARNING;
            sb = new StringBuilder();
            exc = e5;
            logger = logger2;
            sb.append("Failed to close timed out socket ");
            sb.append(this.f2907l);
            logger.log(level, sb.toString(), (Throwable) exc);
        } catch (Exception e6) {
            Logger logger3 = q.f2882a;
            level = Level.WARNING;
            sb = new StringBuilder();
            exc = e6;
            logger = logger3;
            sb.append("Failed to close timed out socket ");
            sb.append(this.f2907l);
            logger.log(level, sb.toString(), (Throwable) exc);
        }
    }
}
