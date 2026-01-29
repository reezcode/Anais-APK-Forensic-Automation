package q;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.f;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class a implements d<InputStream> {

    /* renamed from: b, reason: collision with root package name */
    public final Uri f4708b;

    /* renamed from: c, reason: collision with root package name */
    public final c f4709c;

    /* renamed from: d, reason: collision with root package name */
    public InputStream f4710d;

    /* renamed from: q.a$a, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    public static class C0060a implements q.b {

        /* renamed from: b, reason: collision with root package name */
        public static final String[] f4711b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f4712a;

        public C0060a(ContentResolver contentResolver) {
            this.f4712a = contentResolver;
        }

        @Override // q.b
        public final Cursor a(Uri uri) {
            return this.f4712a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f4711b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* loaded from: classes4.dex */
    public static class b implements q.b {

        /* renamed from: b, reason: collision with root package name */
        public static final String[] f4713b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f4714a;

        public b(ContentResolver contentResolver) {
            this.f4714a = contentResolver;
        }

        @Override // q.b
        public final Cursor a(Uri uri) {
            return this.f4714a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f4713b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    @VisibleForTesting
    public a(Uri uri, c cVar) {
        this.f4708b = uri;
        this.f4709c = cVar;
    }

    public static a c(Context context, Uri uri, q.b bVar) {
        return new a(uri, new c(com.bumptech.glide.b.b(context).f532e.e(), bVar, com.bumptech.glide.b.b(context).f533f, context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        InputStream inputStream = this.f4710d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x004d, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
    
        if (r6 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x004b, code lost:
    
        if (r6 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0050, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0023: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:70:0x0023 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9  */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.NullPointerException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.InputStream d() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.a.d():java.io.InputStream");
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public final p.a e() {
        return p.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(@NonNull f fVar, @NonNull d.a<? super InputStream> aVar) {
        try {
            InputStream d5 = d();
            this.f4710d = d5;
            aVar.d(d5);
        } catch (FileNotFoundException e5) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e5);
            }
            aVar.c(e5);
        }
    }
}
