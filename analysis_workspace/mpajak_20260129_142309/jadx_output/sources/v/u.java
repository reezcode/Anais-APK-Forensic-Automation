package v;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes16.dex */
public final class u implements p.d<InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final s.b f5543a;

    public u(s.b bVar) {
        this.f5543a = bVar;
    }

    @Override // p.d
    public final boolean a(@NonNull InputStream inputStream, @NonNull File file, @NonNull p.h hVar) {
        FileOutputStream fileOutputStream;
        InputStream inputStream2 = inputStream;
        byte[] bArr = (byte[]) this.f5543a.b(65536, byte[].class);
        boolean z4 = false;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    while (true) {
                        try {
                            int read = inputStream2.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        } catch (IOException e5) {
                            e = e5;
                            fileOutputStream2 = fileOutputStream;
                            if (Log.isLoggable("StreamEncoder", 3)) {
                                Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                            }
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            this.f5543a.put(bArr);
                            return z4;
                        } catch (Throwable th) {
                            th = th;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            this.f5543a.put(bArr);
                            throw th;
                        }
                    }
                    fileOutputStream.close();
                    z4 = true;
                    fileOutputStream.close();
                } catch (IOException unused2) {
                }
            } catch (IOException e6) {
                e = e6;
            }
            this.f5543a.put(bArr);
            return z4;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }
}
