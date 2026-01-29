package a0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import p.h;
import p.j;

/* loaded from: classes9.dex */
public final class d implements j<Uri, Drawable> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23a;

    public d(Context context) {
        this.f23a = context.getApplicationContext();
    }

    @Override // p.j
    public final boolean a(@NonNull Uri uri, @NonNull h hVar) {
        return uri.getScheme().equals("android.resource");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0034  */
    @Override // p.j
    @androidx.annotation.Nullable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r.w<android.graphics.drawable.Drawable> b(@androidx.annotation.NonNull android.net.Uri r4, int r5, int r6, @androidx.annotation.NonNull p.h r7) {
        /*
            r3 = this;
            java.lang.String r5 = r4.getAuthority()
            android.content.Context r6 = r3.f23a
            java.lang.String r6 = r6.getPackageName()
            boolean r6 = r5.equals(r6)
            r7 = 0
            if (r6 == 0) goto L12
            goto L26
        L12:
            android.content.Context r6 = r3.f23a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            android.content.Context r5 = r6.createPackageContext(r5, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            goto L28
        L19:
            r6 = move-exception
            android.content.Context r0 = r3.f23a
            java.lang.String r0 = r0.getPackageName()
            boolean r5 = r5.contains(r0)
            if (r5 == 0) goto Lc6
        L26:
            android.content.Context r5 = r3.f23a
        L28:
            java.util.List r6 = r4.getPathSegments()
            int r0 = r6.size()
            r1 = 1
            r2 = 2
            if (r0 != r2) goto L76
            java.util.List r6 = r4.getPathSegments()
            java.lang.String r0 = r4.getAuthority()
            java.lang.Object r7 = r6.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.get(r1)
            java.lang.String r6 = (java.lang.String) r6
            android.content.res.Resources r1 = r5.getResources()
            int r0 = r1.getIdentifier(r6, r7, r0)
            if (r0 != 0) goto L5c
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            java.lang.String r1 = "android"
            int r0 = r0.getIdentifier(r6, r7, r1)
        L5c:
            if (r0 == 0) goto L5f
            goto L8c
        L5f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Failed to find resource id for: "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
        L76:
            int r6 = r6.size()
            java.lang.String r0 = "Unrecognized Uri format: "
            if (r6 != r1) goto Lb1
            java.util.List r6 = r4.getPathSegments()
            java.lang.Object r6 = r6.get(r7)     // Catch: java.lang.NumberFormatException -> L9b
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.NumberFormatException -> L9b
            int r0 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L9b
        L8c:
            android.content.Context r4 = r3.f23a
            r6 = 0
            android.graphics.drawable.Drawable r4 = a0.a.a(r4, r5, r0, r6)
            if (r4 == 0) goto L9a
            a0.c r6 = new a0.c
            r6.<init>(r4)
        L9a:
            return r6
        L9b:
            r5 = move-exception
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r6.<init>(r4, r5)
            throw r6
        Lb1:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
        Lc6:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Failed to obtain context or unrecognized Uri format for: "
            r7.append(r0)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r5.<init>(r4, r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.d.b(android.net.Uri, int, int, p.h):r.w");
    }
}
