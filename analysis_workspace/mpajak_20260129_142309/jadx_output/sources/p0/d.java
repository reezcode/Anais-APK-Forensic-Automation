package p0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4634a;

    static {
        AtomicBoolean atomicBoolean = f.f4636a;
        f4634a = 12451000;
    }

    @Nullable
    public Intent a(Context context, int i5, @Nullable String str) {
        if (i5 != 1 && i5 != 2) {
            if (i5 != 3) {
                return null;
            }
            int i6 = s0.g.f5126a;
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && v0.a.b(context)) {
            int i7 = s0.g.f5126a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder g5 = androidx.activity.d.g("gcore_");
        g5.append(f4634a);
        g5.append("-");
        if (!TextUtils.isEmpty(str)) {
            g5.append(str);
        }
        g5.append("-");
        if (context != null) {
            g5.append(context.getPackageName());
        }
        g5.append("-");
        if (context != null) {
            try {
                x0.a a5 = x0.b.a(context);
                g5.append(a5.f5906a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb = g5.toString();
        int i8 = s0.g.f5126a;
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:2|3)|4|(4:8|2b|15|(2:17|(2:19|20))(2:22|23))|38|(4:40|(3:42|(1:48)(1:46)|47)|49|(14:51|(1:53)(1:136)|54|(2:132|133)|56|57|58|fd|76|(1:78)(1:(7:107|(1:109)(1:126)|(1:111)|(1:113)(4:114|(2:120|121)|116|(1:118)(1:119))|80|(2:(5:83|84|85|86|(2:87|(2:89|(1:91)(1:92))(2:93|94)))|97)(0)|(1:99)(1:100))(1:106))|79|80|(0)(0)|(0)(0)))|137|(0)(0)|54|(0)|56|57|58|fd) */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01a0, code lost:
    
        android.util.Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
     */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e8 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int b(android.content.Context r11, int r12) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.d.b(android.content.Context, int):int");
    }
}
