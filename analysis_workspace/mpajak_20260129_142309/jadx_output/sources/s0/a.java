package s0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import comeliest.metempsychosis.pokelogan.R;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes21.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @GuardedBy("sCache")
    public static final SimpleArrayMap<String, String> f5119a = new SimpleArrayMap<>();

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            x0.a a5 = x0.b.a(context);
            return a5.f5906a.getPackageManager().getApplicationLabel(a5.f5906a.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    @NonNull
    public static String b(Context context, int i5) {
        Resources resources = context.getResources();
        String a5 = a(context);
        if (i5 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, a5);
        }
        if (i5 == 2) {
            return v0.a.b(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, a5);
        }
        if (i5 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, a5);
        }
        if (i5 == 5) {
            return e(context, "common_google_play_services_invalid_account_text", a5);
        }
        if (i5 == 7) {
            return e(context, "common_google_play_services_network_error_text", a5);
        }
        if (i5 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, a5);
        }
        if (i5 == 20) {
            return e(context, "common_google_play_services_restricted_profile_text", a5);
        }
        switch (i5) {
            case 16:
                return e(context, "common_google_play_services_api_unavailable_text", a5);
            case 17:
                return e(context, "common_google_play_services_sign_in_failed_text", a5);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, a5);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, a5);
        }
    }

    @Nullable
    public static String c(Context context, int i5) {
        String str;
        Resources resources = context.getResources();
        switch (i5) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return d(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return d(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i5);
                str = sb.toString();
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return d(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return d(context, "common_google_play_services_restricted_profile_title");
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    @Nullable
    public static String d(Context context, String str) {
        Resources resources;
        SimpleArrayMap<String, String> simpleArrayMap = f5119a;
        synchronized (simpleArrayMap) {
            String str2 = simpleArrayMap.get(str);
            if (str2 != null) {
                return str2;
            }
            int i5 = p0.e.f4635c;
            try {
                resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resources = null;
            }
            if (resources == null) {
                return null;
            }
            int identifier = resources.getIdentifier(str, TypedValues.Custom.S_STRING, "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                return null;
            }
            String string = resources.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                return null;
            }
            f5119a.put(str, string);
            return string;
        }
    }

    public static String e(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String d5 = d(context, str);
        if (d5 == null) {
            d5 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, d5, str2);
    }
}
