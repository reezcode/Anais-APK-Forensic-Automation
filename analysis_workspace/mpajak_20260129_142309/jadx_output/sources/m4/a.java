package m4;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f4233c;

    /* renamed from: d, reason: collision with root package name */
    public static List<String> f4234d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f4235e;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4236b = {-1, -40, -1};

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    static {
        a aVar = new a();
        f4233c = aVar;
        f4235e = new a[]{aVar};
        ArrayList arrayList = new ArrayList();
        f4234d = arrayList;
        arrayList.add(".jpg");
        f4234d.add(".jpeg");
        f4234d.add(".png");
        f4234d.add(".webp");
        f4234d.add(".gif");
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f4235e.clone();
    }

    public final boolean a(int i5, String str) {
        if (i5 <= 0) {
            return true;
        }
        File file = new File(str);
        return file.exists() && file.length() > ((long) (i5 << 10));
    }

    public final int b(byte[] bArr, int i5, int i6, boolean z4) {
        int i7;
        if (z4) {
            i5 += i6 - 1;
            i7 = -1;
        } else {
            i7 = 1;
        }
        int i8 = 0;
        while (true) {
            int i9 = i6 - 1;
            if (i6 <= 0) {
                return i8;
            }
            i8 = (bArr[i5] & 255) | (i8 << 8);
            i5 += i7;
            i6 = i9;
        }
    }

    public final byte[] c(InputStream inputStream) {
        if (inputStream == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                try {
                    int read = inputStream.read(bArr, 0, 4096);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    }
                } finally {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (Exception unused3) {
                byte[] bArr2 = new byte[0];
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused4) {
                }
                return bArr2;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}
