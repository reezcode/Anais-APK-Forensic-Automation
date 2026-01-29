package androidx.core.os;

import android.os.Build;
import android.os.UserHandle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(17)
/* loaded from: classes17.dex */
public class UserHandleCompat {

    @Nullable
    private static Method sGetUserIdMethod;

    @Nullable
    private static Constructor<UserHandle> sUserHandleConstructor;

    @RequiresApi(24)
    /* loaded from: classes22.dex */
    public static class Api24Impl {
        private Api24Impl() {
        }

        @NonNull
        public static UserHandle getUserHandleForUid(int i5) {
            return UserHandle.getUserHandleForUid(i5);
        }
    }

    private UserHandleCompat() {
    }

    private static Method getGetUserIdMethod() {
        if (sGetUserIdMethod == null) {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("getUserId", Integer.TYPE);
            sGetUserIdMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return sGetUserIdMethod;
    }

    private static Constructor<UserHandle> getUserHandleConstructor() {
        if (sUserHandleConstructor == null) {
            Constructor<UserHandle> declaredConstructor = UserHandle.class.getDeclaredConstructor(Integer.TYPE);
            sUserHandleConstructor = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
        return sUserHandleConstructor;
    }

    @NonNull
    public static UserHandle getUserHandleForUid(int i5) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.getUserHandleForUid(i5);
        }
        try {
            return getUserHandleConstructor().newInstance((Integer) getGetUserIdMethod().invoke(null, Integer.valueOf(i5)));
        } catch (IllegalAccessException e5) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e5);
            throw illegalAccessError;
        } catch (InstantiationException e6) {
            InstantiationError instantiationError = new InstantiationError();
            instantiationError.initCause(e6);
            throw instantiationError;
        } catch (NoSuchMethodException e7) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e7);
            throw noSuchMethodError;
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }
}
