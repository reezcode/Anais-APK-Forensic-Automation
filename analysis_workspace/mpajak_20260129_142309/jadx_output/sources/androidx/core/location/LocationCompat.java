package androidx.core.location;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class LocationCompat {
    public static final String EXTRA_BEARING_ACCURACY = "bearingAccuracy";
    public static final String EXTRA_IS_MOCK = "mockLocation";
    public static final String EXTRA_SPEED_ACCURACY = "speedAccuracy";
    public static final String EXTRA_VERTICAL_ACCURACY = "verticalAccuracy";

    @Nullable
    private static Method sSetIsFromMockProviderMethod;

    @RequiresApi(17)
    /* loaded from: classes8.dex */
    public static class Api17Impl {
        private Api17Impl() {
        }

        @DoNotInline
        public static long getElapsedRealtimeNanos(Location location) {
            return location.getElapsedRealtimeNanos();
        }
    }

    @RequiresApi(18)
    /* loaded from: classes18.dex */
    public static class Api18Impl {
        private Api18Impl() {
        }

        @DoNotInline
        public static boolean isMock(Location location) {
            return location.isFromMockProvider();
        }
    }

    @RequiresApi(26)
    /* loaded from: classes11.dex */
    public static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        public static float getBearingAccuracyDegrees(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        @DoNotInline
        public static float getSpeedAccuracyMetersPerSecond(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        @DoNotInline
        public static float getVerticalAccuracyMeters(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        @DoNotInline
        public static boolean hasBearingAccuracy(Location location) {
            return location.hasBearingAccuracy();
        }

        @DoNotInline
        public static boolean hasSpeedAccuracy(Location location) {
            return location.hasSpeedAccuracy();
        }

        @DoNotInline
        public static boolean hasVerticalAccuracy(Location location) {
            return location.hasVerticalAccuracy();
        }

        @DoNotInline
        public static void setBearingAccuracyDegrees(Location location, float f5) {
            location.setBearingAccuracyDegrees(f5);
        }

        @DoNotInline
        public static void setSpeedAccuracyMetersPerSecond(Location location, float f5) {
            location.setSpeedAccuracyMetersPerSecond(f5);
        }

        @DoNotInline
        public static void setVerticalAccuracyMeters(Location location, float f5) {
            location.setVerticalAccuracyMeters(f5);
        }
    }

    private LocationCompat() {
    }

    public static float getBearingAccuracyDegrees(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getBearingAccuracyDegrees(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(EXTRA_BEARING_ACCURACY, 0.0f);
    }

    public static long getElapsedRealtimeMillis(@NonNull Location location) {
        return TimeUnit.NANOSECONDS.toMillis(Api17Impl.getElapsedRealtimeNanos(location));
    }

    public static long getElapsedRealtimeNanos(@NonNull Location location) {
        return Api17Impl.getElapsedRealtimeNanos(location);
    }

    private static Method getSetIsFromMockProviderMethod() {
        if (sSetIsFromMockProviderMethod == null) {
            Method declaredMethod = Location.class.getDeclaredMethod("setIsFromMockProvider", Boolean.TYPE);
            sSetIsFromMockProviderMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return sSetIsFromMockProviderMethod;
    }

    public static float getSpeedAccuracyMetersPerSecond(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getSpeedAccuracyMetersPerSecond(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(EXTRA_SPEED_ACCURACY, 0.0f);
    }

    public static float getVerticalAccuracyMeters(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getVerticalAccuracyMeters(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(EXTRA_VERTICAL_ACCURACY, 0.0f);
    }

    public static boolean hasBearingAccuracy(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.hasBearingAccuracy(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return false;
        }
        return extras.containsKey(EXTRA_BEARING_ACCURACY);
    }

    public static boolean hasSpeedAccuracy(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.hasSpeedAccuracy(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return false;
        }
        return extras.containsKey(EXTRA_SPEED_ACCURACY);
    }

    public static boolean hasVerticalAccuracy(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.hasVerticalAccuracy(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return false;
        }
        return extras.containsKey(EXTRA_VERTICAL_ACCURACY);
    }

    public static boolean isMock(@NonNull Location location) {
        return Api18Impl.isMock(location);
    }

    public static void setBearingAccuracyDegrees(@NonNull Location location, float f5) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setBearingAccuracyDegrees(location, f5);
            return;
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            location.setExtras(new Bundle());
            extras = location.getExtras();
        }
        extras.putFloat(EXTRA_BEARING_ACCURACY, f5);
    }

    public static void setMock(@NonNull Location location, boolean z4) {
        try {
            getSetIsFromMockProviderMethod().invoke(location, Boolean.valueOf(z4));
        } catch (IllegalAccessException e5) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e5);
            throw illegalAccessError;
        } catch (NoSuchMethodException e6) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e6);
            throw noSuchMethodError;
        } catch (InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static void setSpeedAccuracyMetersPerSecond(@NonNull Location location, float f5) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setSpeedAccuracyMetersPerSecond(location, f5);
            return;
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            location.setExtras(new Bundle());
            extras = location.getExtras();
        }
        extras.putFloat(EXTRA_SPEED_ACCURACY, f5);
    }

    public static void setVerticalAccuracyMeters(@NonNull Location location, float f5) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setVerticalAccuracyMeters(location, f5);
            return;
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            location.setExtras(new Bundle());
            extras = location.getExtras();
        }
        extras.putFloat(EXTRA_VERTICAL_ACCURACY, f5);
    }
}
