package androidx.core.location;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes11.dex */
public final /* synthetic */ class a {
    public static void a(LocationListenerCompat locationListenerCompat, int i5) {
    }

    public static void b(LocationListenerCompat locationListenerCompat, @NonNull List list) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            locationListenerCompat.onLocationChanged((Location) list.get(i5));
        }
    }

    public static void c(LocationListenerCompat locationListenerCompat, @NonNull String str) {
    }

    public static void d(LocationListenerCompat locationListenerCompat, @NonNull String str) {
    }

    public static void e(LocationListenerCompat locationListenerCompat, @NonNull String str, int i5, @Nullable Bundle bundle) {
    }
}
