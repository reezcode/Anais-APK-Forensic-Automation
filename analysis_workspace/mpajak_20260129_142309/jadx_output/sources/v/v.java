package v;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.InputStream;
import v.o;

/* loaded from: classes20.dex */
public final class v<Data> implements o<String, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final o<Uri, Data> f5544a;

    /* loaded from: classes12.dex */
    public static final class a implements p<String, AssetFileDescriptor> {
        @Override // v.p
        public final o<String, AssetFileDescriptor> b(@NonNull s sVar) {
            return new v(sVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* loaded from: classes4.dex */
    public static class b implements p<String, ParcelFileDescriptor> {
        @Override // v.p
        @NonNull
        public final o<String, ParcelFileDescriptor> b(@NonNull s sVar) {
            return new v(sVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* loaded from: classes15.dex */
    public static class c implements p<String, InputStream> {
        @Override // v.p
        @NonNull
        public final o<String, InputStream> b(@NonNull s sVar) {
            return new v(sVar.b(Uri.class, InputStream.class));
        }
    }

    public v(o<Uri, Data> oVar) {
        this.f5544a = oVar;
    }

    @Override // v.o
    public final o.a a(@NonNull String str, int i5, int i6, @NonNull p.h hVar) {
        Uri parse;
        File file;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            parse = null;
        } else {
            if (str2.charAt(0) == '/') {
                file = new File(str2);
            } else {
                parse = Uri.parse(str2);
                if (parse.getScheme() == null) {
                    file = new File(str2);
                }
            }
            parse = Uri.fromFile(file);
        }
        if (parse == null || !this.f5544a.b(parse)) {
            return null;
        }
        return this.f5544a.a(parse, i5, i6, hVar);
    }

    @Override // v.o
    public final /* bridge */ /* synthetic */ boolean b(@NonNull String str) {
        return true;
    }
}
