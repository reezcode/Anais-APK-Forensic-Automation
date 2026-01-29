package z0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static c f6101d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f6102a;

    /* renamed from: b, reason: collision with root package name */
    public String f6103b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f6104c = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public c(Context context) {
        this.f6102a = context.getApplicationContext();
    }

    public static String a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    public final String b(Bundle bundle, String str) {
        String a5 = a(bundle, str);
        if (!TextUtils.isEmpty(a5)) {
            return a5;
        }
        String a6 = a(bundle, str.concat("_loc_key"));
        if (TextUtils.isEmpty(a6)) {
            return null;
        }
        Resources resources = this.f6102a.getResources();
        int identifier = resources.getIdentifier(a6, TypedValues.Custom.S_STRING, this.f6102a.getPackageName());
        if (identifier == 0) {
            String substring = str.concat("_loc_key").substring(6);
            StringBuilder sb = new StringBuilder(androidx.activity.d.b(a6, androidx.activity.d.b(substring, 49)));
            sb.append(substring);
            sb.append(" resource not found: ");
            sb.append(a6);
            sb.append(" Default value will be used.");
            Log.w("GcmNotification", sb.toString());
            return null;
        }
        String a7 = a(bundle, str.concat("_loc_args"));
        if (TextUtils.isEmpty(a7)) {
            return resources.getString(identifier);
        }
        try {
            JSONArray jSONArray = new JSONArray(a7);
            int length = jSONArray.length();
            Object[] objArr = new String[length];
            for (int i5 = 0; i5 < length; i5++) {
                objArr[i5] = jSONArray.opt(i5);
            }
            return resources.getString(identifier, objArr);
        } catch (MissingFormatArgumentException e5) {
            StringBuilder sb2 = new StringBuilder(androidx.activity.d.b(a7, androidx.activity.d.b(a6, 58)));
            sb2.append("Missing format argument for ");
            sb2.append(a6);
            sb2.append(": ");
            sb2.append(a7);
            sb2.append(" Default value will be used.");
            Log.w("GcmNotification", sb2.toString(), e5);
            return null;
        } catch (JSONException unused) {
            String substring2 = str.concat("_loc_args").substring(6);
            StringBuilder sb3 = new StringBuilder(androidx.activity.d.b(a7, androidx.activity.d.b(substring2, 41)));
            sb3.append("Malformed ");
            sb3.append(substring2);
            sb3.append(": ");
            sb3.append(a7);
            sb3.append("  Default value will be used.");
            Log.w("GcmNotification", sb3.toString());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.c.c(android.os.Bundle):void");
    }
}
