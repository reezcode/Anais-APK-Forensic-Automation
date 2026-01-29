package l4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes9.dex */
public final class a implements c {

    /* renamed from: l4.a$a, reason: collision with other inner class name */
    /* loaded from: classes13.dex */
    public static class C0047a {

        /* renamed from: a, reason: collision with root package name */
        public ZipFile f4052a;

        /* renamed from: b, reason: collision with root package name */
        public ZipEntry f4053b;

        public C0047a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f4052a = zipFile;
            this.f4053b = zipEntry;
        }
    }

    public final void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public final C0047a b(Context context, String[] strArr, String str, f fVar) {
        String[] strArr2;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr3 = applicationInfo.splitSourceDirs;
        char c5 = 0;
        int i5 = 1;
        if (strArr3 == null || strArr3.length == 0) {
            strArr2 = new String[]{applicationInfo.sourceDir};
        } else {
            strArr2 = new String[strArr3.length + 1];
            strArr2[0] = applicationInfo.sourceDir;
            System.arraycopy(strArr3, 0, strArr2, 1, strArr3.length);
        }
        int length = strArr2.length;
        int i6 = 0;
        ZipFile zipFile = null;
        while (i6 < length) {
            String str2 = strArr2[i6];
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                if (i7 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), i5);
                    break;
                } catch (IOException unused) {
                    i7 = i8;
                }
            }
            if (zipFile != null) {
                int i9 = 0;
                while (true) {
                    int i10 = i9 + 1;
                    if (i9 < 5) {
                        int length2 = strArr.length;
                        int i11 = 0;
                        while (i11 < length2) {
                            String str3 = strArr[i11];
                            StringBuilder g5 = androidx.activity.d.g("lib");
                            g5.append(File.separatorChar);
                            g5.append(str3);
                            g5.append(File.separatorChar);
                            g5.append(str);
                            String sb = g5.toString();
                            Object[] objArr = new Object[2];
                            objArr[c5] = sb;
                            objArr[i5] = str2;
                            fVar.d("Looking for %s in APK %s...", objArr);
                            ZipEntry entry = zipFile.getEntry(sb);
                            if (entry != null) {
                                return new C0047a(zipFile, entry);
                            }
                            i11++;
                            c5 = 0;
                            i5 = 1;
                        }
                        i9 = i10;
                        i5 = 1;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i6++;
            c5 = 0;
            i5 = 1;
        }
        return null;
    }
}
