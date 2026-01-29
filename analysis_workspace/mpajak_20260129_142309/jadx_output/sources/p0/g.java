package p0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
/* loaded from: classes15.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static g f4638a;

    public g(Context context) {
        context.getApplicationContext();
    }

    public static l a(PackageInfo packageInfo, l... lVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        m mVar = new m(packageInfo.signatures[0].toByteArray());
        for (int i5 = 0; i5 < lVarArr.length; i5++) {
            if (lVarArr[i5].equals(mVar)) {
                return lVarArr[i5];
            }
        }
        return null;
    }

    public static boolean b(PackageInfo packageInfo) {
        return (packageInfo == null || packageInfo.signatures == null || a(packageInfo, o.f4646a) == null) ? false : true;
    }
}
