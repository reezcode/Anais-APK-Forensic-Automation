package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.d;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes22.dex */
public class IconCompat extends CustomVersionedParcelable {
    private static final float ADAPTIVE_ICON_INSET_FACTOR = 0.25f;
    private static final int AMBIENT_SHADOW_ALPHA = 30;
    private static final float BLUR_FACTOR = 0.010416667f;
    public static final PorterDuff.Mode DEFAULT_TINT_MODE = PorterDuff.Mode.SRC_IN;
    private static final float DEFAULT_VIEW_PORT_SCALE = 0.6666667f;

    @VisibleForTesting
    public static final String EXTRA_INT1 = "int1";

    @VisibleForTesting
    public static final String EXTRA_INT2 = "int2";

    @VisibleForTesting
    public static final String EXTRA_OBJ = "obj";

    @VisibleForTesting
    public static final String EXTRA_STRING1 = "string1";

    @VisibleForTesting
    public static final String EXTRA_TINT_LIST = "tint_list";

    @VisibleForTesting
    public static final String EXTRA_TINT_MODE = "tint_mode";

    @VisibleForTesting
    public static final String EXTRA_TYPE = "type";
    private static final float ICON_DIAMETER_FACTOR = 0.9166667f;
    private static final int KEY_SHADOW_ALPHA = 61;
    private static final float KEY_SHADOW_OFFSET_FACTOR = 0.020833334f;
    private static final String TAG = "IconCompat";
    public static final int TYPE_ADAPTIVE_BITMAP = 5;
    public static final int TYPE_BITMAP = 1;
    public static final int TYPE_DATA = 3;
    public static final int TYPE_RESOURCE = 2;
    public static final int TYPE_UNKNOWN = -1;
    public static final int TYPE_URI = 4;
    public static final int TYPE_URI_ADAPTIVE_BITMAP = 6;

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public byte[] mData;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int mInt1;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int mInt2;
    public Object mObj1;

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Parcelable mParcelable;

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String mString1;

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ColorStateList mTintList;
    public PorterDuff.Mode mTintMode;

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String mTintModeStr;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int mType;

    @RequiresApi(23)
    /* loaded from: classes6.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        @Nullable
        public static IconCompat createFromIcon(@NonNull Context context, @NonNull Icon icon) {
            int type = getType(icon);
            if (type == 2) {
                String resPackage = getResPackage(icon);
                try {
                    return IconCompat.createWithResource(IconCompat.getResources(context, resPackage), resPackage, getResId(icon));
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            }
            if (type == 4) {
                return IconCompat.createWithContentUri(getUri(icon));
            }
            if (type == 6) {
                return IconCompat.createWithAdaptiveBitmapContentUri(getUri(icon));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.mObj1 = icon;
            return iconCompat;
        }

        public static IconCompat createFromIconInner(@NonNull Object obj) {
            Preconditions.checkNotNull(obj);
            int type = getType(obj);
            if (type == 2) {
                return IconCompat.createWithResource(null, getResPackage(obj), getResId(obj));
            }
            if (type == 4) {
                return IconCompat.createWithContentUri(getUri(obj));
            }
            if (type == 6) {
                return IconCompat.createWithAdaptiveBitmapContentUri(getUri(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.mObj1 = obj;
            return iconCompat;
        }

        @DrawableRes
        @IdRes
        public static int getResId(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.getResId(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e5) {
                Log.e(IconCompat.TAG, "Unable to get icon resource", e5);
                return 0;
            } catch (NoSuchMethodException e6) {
                Log.e(IconCompat.TAG, "Unable to get icon resource", e6);
                return 0;
            } catch (InvocationTargetException e7) {
                Log.e(IconCompat.TAG, "Unable to get icon resource", e7);
                return 0;
            }
        }

        @Nullable
        public static String getResPackage(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.getResPackage(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e5) {
                Log.e(IconCompat.TAG, "Unable to get icon package", e5);
                return null;
            } catch (NoSuchMethodException e6) {
                Log.e(IconCompat.TAG, "Unable to get icon package", e6);
                return null;
            } catch (InvocationTargetException e7) {
                Log.e(IconCompat.TAG, "Unable to get icon package", e7);
                return null;
            }
        }

        public static int getType(@NonNull Object obj) {
            StringBuilder sb;
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.getType(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e5) {
                e = e5;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e(IconCompat.TAG, sb.toString(), e);
                return -1;
            } catch (NoSuchMethodException e6) {
                e = e6;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e(IconCompat.TAG, sb.toString(), e);
                return -1;
            } catch (InvocationTargetException e7) {
                e = e7;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e(IconCompat.TAG, sb.toString(), e);
                return -1;
            }
        }

        @Nullable
        @DoNotInline
        public static Uri getUri(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.getUri(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e5) {
                Log.e(IconCompat.TAG, "Unable to get icon uri", e5);
                return null;
            } catch (NoSuchMethodException e6) {
                Log.e(IconCompat.TAG, "Unable to get icon uri", e6);
                return null;
            } catch (InvocationTargetException e7) {
                Log.e(IconCompat.TAG, "Unable to get icon uri", e7);
                return null;
            }
        }

        @DoNotInline
        public static Drawable loadDrawable(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
        
            if (r0 >= 26) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00a9  */
        @androidx.annotation.DoNotInline
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static android.graphics.drawable.Icon toIcon(androidx.core.graphics.drawable.IconCompat r4, android.content.Context r5) {
            /*
                int r0 = r4.mType
                r1 = 0
                r2 = 26
                switch(r0) {
                    case -1: goto Lad;
                    case 0: goto L8;
                    case 1: goto L94;
                    case 2: goto L89;
                    case 3: goto L7c;
                    case 4: goto L73;
                    case 5: goto L5d;
                    case 6: goto L10;
                    default: goto L8;
                }
            L8:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Unknown type"
                r4.<init>(r5)
                throw r4
            L10:
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 30
                if (r0 < r3) goto L20
                android.net.Uri r5 = r4.getUri()
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.Api30Impl.createWithAdaptiveBitmapContentUri(r5)
                goto L9c
            L20:
                if (r5 == 0) goto L46
                java.io.InputStream r5 = r4.getUriInputStream(r5)
                if (r5 == 0) goto L2f
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
                if (r0 < r2) goto L6e
                goto L65
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "Cannot load adaptive icon from uri: "
                java.lang.StringBuilder r0 = androidx.activity.d.g(r0)
                android.net.Uri r4 = r4.getUri()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L46:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Context is required to resolve the file uri of the icon: "
                java.lang.StringBuilder r0 = androidx.activity.d.g(r0)
                android.net.Uri r4 = r4.getUri()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L5d:
                int r5 = android.os.Build.VERSION.SDK_INT
                if (r5 < r2) goto L6a
                java.lang.Object r5 = r4.mObj1
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            L65:
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.Api26Impl.createWithAdaptiveBitmap(r5)
                goto L9c
            L6a:
                java.lang.Object r5 = r4.mObj1
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            L6e:
                android.graphics.Bitmap r5 = androidx.core.graphics.drawable.IconCompat.createLegacyIconFromAdaptiveIcon(r5, r1)
                goto L98
            L73:
                java.lang.Object r5 = r4.mObj1
                java.lang.String r5 = (java.lang.String) r5
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithContentUri(r5)
                goto L9c
            L7c:
                java.lang.Object r5 = r4.mObj1
                byte[] r5 = (byte[]) r5
                int r0 = r4.mInt1
                int r1 = r4.mInt2
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithData(r5, r0, r1)
                goto L9c
            L89:
                java.lang.String r5 = r4.getResPackage()
                int r0 = r4.mInt1
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r5, r0)
                goto L9c
            L94:
                java.lang.Object r5 = r4.mObj1
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            L98:
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
            L9c:
                android.content.res.ColorStateList r0 = r4.mTintList
                if (r0 == 0) goto La3
                r5.setTintList(r0)
            La3:
                android.graphics.PorterDuff$Mode r4 = r4.mTintMode
                android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE
                if (r4 == r0) goto Lac
                r5.setTintMode(r4)
            Lac:
                return r5
            Lad:
                java.lang.Object r4 = r4.mObj1
                android.graphics.drawable.Icon r4 = (android.graphics.drawable.Icon) r4
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.Api23Impl.toIcon(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }
    }

    @RequiresApi(26)
    /* loaded from: classes14.dex */
    public static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        public static Drawable createAdaptiveIconDrawable(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        @DoNotInline
        public static Icon createWithAdaptiveBitmap(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    @RequiresApi(28)
    /* loaded from: classes7.dex */
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        public static int getResId(Object obj) {
            return ((Icon) obj).getResId();
        }

        @DoNotInline
        public static String getResPackage(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        @DoNotInline
        public static int getType(Object obj) {
            return ((Icon) obj).getType();
        }

        @DoNotInline
        public static Uri getUri(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    @RequiresApi(30)
    /* loaded from: classes5.dex */
    public static class Api30Impl {
        private Api30Impl() {
        }

        @DoNotInline
        public static Icon createWithAdaptiveBitmapContentUri(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes23.dex */
    public @interface IconType {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public IconCompat() {
        this.mType = -1;
        this.mData = null;
        this.mParcelable = null;
        this.mInt1 = 0;
        this.mInt2 = 0;
        this.mTintList = null;
        this.mTintMode = DEFAULT_TINT_MODE;
        this.mTintModeStr = null;
    }

    public IconCompat(int i5) {
        this.mData = null;
        this.mParcelable = null;
        this.mInt1 = 0;
        this.mInt2 = 0;
        this.mTintList = null;
        this.mTintMode = DEFAULT_TINT_MODE;
        this.mTintModeStr = null;
        this.mType = i5;
    }

    @Nullable
    public static IconCompat createFromBundle(@NonNull Bundle bundle) {
        Object parcelable;
        int i5 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i5);
        iconCompat.mInt1 = bundle.getInt(EXTRA_INT1);
        iconCompat.mInt2 = bundle.getInt(EXTRA_INT2);
        iconCompat.mString1 = bundle.getString(EXTRA_STRING1);
        if (bundle.containsKey(EXTRA_TINT_LIST)) {
            iconCompat.mTintList = (ColorStateList) bundle.getParcelable(EXTRA_TINT_LIST);
        }
        if (bundle.containsKey(EXTRA_TINT_MODE)) {
            iconCompat.mTintMode = PorterDuff.Mode.valueOf(bundle.getString(EXTRA_TINT_MODE));
        }
        switch (i5) {
            case -1:
            case 1:
            case 5:
                parcelable = bundle.getParcelable(EXTRA_OBJ);
                iconCompat.mObj1 = parcelable;
                return iconCompat;
            case 0:
            default:
                Log.w(TAG, "Unknown type " + i5);
                return null;
            case 2:
            case 4:
            case 6:
                parcelable = bundle.getString(EXTRA_OBJ);
                iconCompat.mObj1 = parcelable;
                return iconCompat;
            case 3:
                iconCompat.mObj1 = bundle.getByteArray(EXTRA_OBJ);
                return iconCompat;
        }
    }

    @Nullable
    @RequiresApi(23)
    public static IconCompat createFromIcon(@NonNull Context context, @NonNull Icon icon) {
        Preconditions.checkNotNull(icon);
        return Api23Impl.createFromIcon(context, icon);
    }

    @Nullable
    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static IconCompat createFromIcon(@NonNull Icon icon) {
        return Api23Impl.createFromIconInner(icon);
    }

    @Nullable
    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static IconCompat createFromIconOrNullIfZeroResId(@NonNull Icon icon) {
        if (Api23Impl.getType(icon) == 2 && Api23Impl.getResId(icon) == 0) {
            return null;
        }
        return Api23Impl.createFromIconInner(icon);
    }

    @VisibleForTesting
    public static Bitmap createLegacyIconFromAdaptiveIcon(Bitmap bitmap, boolean z4) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * DEFAULT_VIEW_PORT_SCALE);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f5 = min;
        float f6 = 0.5f * f5;
        float f7 = ICON_DIAMETER_FACTOR * f6;
        if (z4) {
            float f8 = BLUR_FACTOR * f5;
            paint.setColor(0);
            paint.setShadowLayer(f8, 0.0f, f5 * KEY_SHADOW_OFFSET_FACTOR, 1023410176);
            canvas.drawCircle(f6, f6, f7, paint);
            paint.setShadowLayer(f8, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f6, f6, f7, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f6, f6, f7, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    @NonNull
    public static IconCompat createWithAdaptiveBitmap(@NonNull Bitmap bitmap) {
        ObjectsCompat.requireNonNull(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.mObj1 = bitmap;
        return iconCompat;
    }

    @NonNull
    public static IconCompat createWithAdaptiveBitmapContentUri(@NonNull Uri uri) {
        ObjectsCompat.requireNonNull(uri);
        return createWithAdaptiveBitmapContentUri(uri.toString());
    }

    @NonNull
    public static IconCompat createWithAdaptiveBitmapContentUri(@NonNull String str) {
        ObjectsCompat.requireNonNull(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.mObj1 = str;
        return iconCompat;
    }

    @NonNull
    public static IconCompat createWithBitmap(@NonNull Bitmap bitmap) {
        ObjectsCompat.requireNonNull(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.mObj1 = bitmap;
        return iconCompat;
    }

    @NonNull
    public static IconCompat createWithContentUri(@NonNull Uri uri) {
        ObjectsCompat.requireNonNull(uri);
        return createWithContentUri(uri.toString());
    }

    @NonNull
    public static IconCompat createWithContentUri(@NonNull String str) {
        ObjectsCompat.requireNonNull(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.mObj1 = str;
        return iconCompat;
    }

    @NonNull
    public static IconCompat createWithData(@NonNull byte[] bArr, int i5, int i6) {
        ObjectsCompat.requireNonNull(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.mObj1 = bArr;
        iconCompat.mInt1 = i5;
        iconCompat.mInt2 = i6;
        return iconCompat;
    }

    @NonNull
    public static IconCompat createWithResource(@NonNull Context context, @DrawableRes int i5) {
        ObjectsCompat.requireNonNull(context);
        return createWithResource(context.getResources(), context.getPackageName(), i5);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static IconCompat createWithResource(@Nullable Resources resources, @NonNull String str, @DrawableRes int i5) {
        ObjectsCompat.requireNonNull(str);
        if (i5 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.mInt1 = i5;
        if (resources != null) {
            try {
                iconCompat.mObj1 = resources.getResourceName(i5);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.mObj1 = str;
        }
        iconCompat.mString1 = str;
        return iconCompat;
    }

    public static Resources getResources(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e5) {
            Log.e(TAG, String.format("Unable to find pkg=%s for icon", str), e5);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private Drawable loadDrawableInner(Context context) {
        switch (this.mType) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.mObj1);
            case 2:
                String resPackage = getResPackage();
                if (TextUtils.isEmpty(resPackage)) {
                    resPackage = context.getPackageName();
                }
                try {
                    return ResourcesCompat.getDrawable(getResources(context, resPackage), this.mInt1, context.getTheme());
                } catch (RuntimeException e5) {
                    Log.e(TAG, String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.mInt1), this.mObj1), e5);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.mObj1, this.mInt1, this.mInt2));
            case 4:
                InputStream uriInputStream = getUriInputStream(context);
                if (uriInputStream != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(uriInputStream));
                }
                return null;
            case 5:
                return new BitmapDrawable(context.getResources(), createLegacyIconFromAdaptiveIcon((Bitmap) this.mObj1, false));
            case 6:
                InputStream uriInputStream2 = getUriInputStream(context);
                if (uriInputStream2 != null) {
                    return Build.VERSION.SDK_INT >= 26 ? Api26Impl.createAdaptiveIconDrawable(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(uriInputStream2))) : new BitmapDrawable(context.getResources(), createLegacyIconFromAdaptiveIcon(BitmapFactory.decodeStream(uriInputStream2), false));
                }
                return null;
            default:
                return null;
        }
    }

    private static String typeToString(int i5) {
        switch (i5) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void addToShortcutIntent(@NonNull Intent intent, @Nullable Drawable drawable, @NonNull Context context) {
        Bitmap bitmap;
        checkResource(context);
        int i5 = this.mType;
        if (i5 == 1) {
            bitmap = (Bitmap) this.mObj1;
            if (drawable != null) {
                bitmap = bitmap.copy(bitmap.getConfig(), true);
            }
        } else if (i5 == 2) {
            try {
                Context createPackageContext = context.createPackageContext(getResPackage(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(createPackageContext, this.mInt1));
                    return;
                }
                Drawable drawable2 = ContextCompat.getDrawable(createPackageContext, this.mInt1);
                if (drawable2.getIntrinsicWidth() > 0 && drawable2.getIntrinsicHeight() > 0) {
                    bitmap = Bitmap.createBitmap(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    drawable2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    drawable2.draw(new Canvas(bitmap));
                }
                int launcherLargeIconSize = ((ActivityManager) createPackageContext.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getLauncherLargeIconSize();
                bitmap = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                drawable2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                drawable2.draw(new Canvas(bitmap));
            } catch (PackageManager.NameNotFoundException e5) {
                StringBuilder g5 = d.g("Can't find package ");
                g5.append(this.mObj1);
                throw new IllegalArgumentException(g5.toString(), e5);
            }
        } else {
            if (i5 != 5) {
                throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
            }
            bitmap = createLegacyIconFromAdaptiveIcon((Bitmap) this.mObj1, true);
        }
        if (drawable != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmap));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void checkResource(@NonNull Context context) {
        Object obj;
        if (this.mType != 2 || (obj = this.mObj1) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                Log.i(TAG, "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            String resPackage = getResPackage();
            int identifier = getResources(context, resPackage).getIdentifier(str4, str3, str5);
            if (this.mInt1 != identifier) {
                Log.i(TAG, "Id has changed for " + resPackage + " " + str);
                this.mInt1 = identifier;
            }
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Bitmap getBitmap() {
        int i5 = this.mType;
        if (i5 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.mObj1;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i5 == 1) {
            return (Bitmap) this.mObj1;
        }
        if (i5 == 5) {
            return createLegacyIconFromAdaptiveIcon((Bitmap) this.mObj1, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    @DrawableRes
    public int getResId() {
        int i5 = this.mType;
        if (i5 == -1 && Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.getResId(this.mObj1);
        }
        if (i5 == 2) {
            return this.mInt1;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    @NonNull
    public String getResPackage() {
        int i5 = this.mType;
        if (i5 == -1 && Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.getResPackage(this.mObj1);
        }
        if (i5 == 2) {
            String str = this.mString1;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.mObj1).split(":", -1)[0] : this.mString1;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int getType() {
        int i5 = this.mType;
        return (i5 != -1 || Build.VERSION.SDK_INT < 23) ? i5 : Api23Impl.getType(this.mObj1);
    }

    @NonNull
    public Uri getUri() {
        int i5 = this.mType;
        if (i5 == -1 && Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.getUri(this.mObj1);
        }
        if (i5 == 4 || i5 == 6) {
            return Uri.parse((String) this.mObj1);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public InputStream getUriInputStream(@NonNull Context context) {
        StringBuilder sb;
        String str;
        Uri uri = getUri();
        String scheme = uri.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uri);
            } catch (Exception e5) {
                e = e5;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.mObj1));
            } catch (FileNotFoundException e6) {
                e = e6;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb.append(str);
        sb.append(uri);
        Log.w(TAG, sb.toString(), e);
        return null;
    }

    @Nullable
    public Drawable loadDrawable(@NonNull Context context) {
        checkResource(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.loadDrawable(toIcon(context), context);
        }
        Drawable loadDrawableInner = loadDrawableInner(context);
        if (loadDrawableInner != null && (this.mTintList != null || this.mTintMode != DEFAULT_TINT_MODE)) {
            loadDrawableInner.mutate();
            DrawableCompat.setTintList(loadDrawableInner, this.mTintList);
            DrawableCompat.setTintMode(loadDrawableInner, this.mTintMode);
        }
        return loadDrawableInner;
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPostParceling() {
        Parcelable parcelable;
        this.mTintMode = PorterDuff.Mode.valueOf(this.mTintModeStr);
        switch (this.mType) {
            case -1:
                parcelable = this.mParcelable;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.mParcelable;
                if (parcelable == null) {
                    byte[] bArr = this.mData;
                    this.mObj1 = bArr;
                    this.mType = 3;
                    this.mInt1 = 0;
                    this.mInt2 = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.mData, Charset.forName("UTF-16"));
                this.mObj1 = str;
                if (this.mType == 2 && this.mString1 == null) {
                    this.mString1 = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.mObj1 = this.mData;
                return;
        }
        this.mObj1 = parcelable;
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPreParceling(boolean z4) {
        this.mTintModeStr = this.mTintMode.name();
        switch (this.mType) {
            case -1:
                if (z4) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z4) {
                    Bitmap bitmap = (Bitmap) this.mObj1;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.mData = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.mData = ((String) this.mObj1).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.mData = (byte[]) this.mObj1;
                return;
            case 4:
            case 6:
                this.mData = this.mObj1.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.mParcelable = (Parcelable) this.mObj1;
    }

    @NonNull
    public IconCompat setTint(@ColorInt int i5) {
        return setTintList(ColorStateList.valueOf(i5));
    }

    @NonNull
    public IconCompat setTintList(@Nullable ColorStateList colorStateList) {
        this.mTintList = colorStateList;
        return this;
    }

    @NonNull
    public IconCompat setTintMode(@Nullable PorterDuff.Mode mode) {
        this.mTintMode = mode;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0050  */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle toBundle() {
        /*
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            int r1 = r3.mType
            java.lang.String r2 = "obj"
            switch(r1) {
                case -1: goto L29;
                case 0: goto Lc;
                case 1: goto L24;
                case 2: goto L1c;
                case 3: goto L14;
                case 4: goto L1c;
                case 5: goto L24;
                case 6: goto L1c;
                default: goto Lc;
            }
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid icon"
            r0.<init>(r1)
            throw r0
        L14:
            java.lang.Object r1 = r3.mObj1
            byte[] r1 = (byte[]) r1
            r0.putByteArray(r2, r1)
            goto L30
        L1c:
            java.lang.Object r1 = r3.mObj1
            java.lang.String r1 = (java.lang.String) r1
            r0.putString(r2, r1)
            goto L30
        L24:
            java.lang.Object r1 = r3.mObj1
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            goto L2d
        L29:
            java.lang.Object r1 = r3.mObj1
            android.os.Parcelable r1 = (android.os.Parcelable) r1
        L2d:
            r0.putParcelable(r2, r1)
        L30:
            int r1 = r3.mType
            java.lang.String r2 = "type"
            r0.putInt(r2, r1)
            int r1 = r3.mInt1
            java.lang.String r2 = "int1"
            r0.putInt(r2, r1)
            int r1 = r3.mInt2
            java.lang.String r2 = "int2"
            r0.putInt(r2, r1)
            java.lang.String r1 = r3.mString1
            java.lang.String r2 = "string1"
            r0.putString(r2, r1)
            android.content.res.ColorStateList r1 = r3.mTintList
            if (r1 == 0) goto L55
            java.lang.String r2 = "tint_list"
            r0.putParcelable(r2, r1)
        L55:
            android.graphics.PorterDuff$Mode r1 = r3.mTintMode
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.DEFAULT_TINT_MODE
            if (r1 == r2) goto L64
            java.lang.String r1 = r1.name()
            java.lang.String r2 = "tint_mode"
            r0.putString(r2, r1)
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toBundle():android.os.Bundle");
    }

    @NonNull
    @RequiresApi(23)
    @Deprecated
    public Icon toIcon() {
        return toIcon(null);
    }

    @NonNull
    @RequiresApi(23)
    public Icon toIcon(@Nullable Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.toIcon(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    @NonNull
    public String toString() {
        int height;
        if (this.mType == -1) {
            return String.valueOf(this.mObj1);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(typeToString(this.mType));
        switch (this.mType) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.mObj1).getWidth());
                sb.append("x");
                height = ((Bitmap) this.mObj1).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.mString1);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(getResId())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.mInt1);
                if (this.mInt2 != 0) {
                    sb.append(" off=");
                    height = this.mInt2;
                    sb.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.mObj1);
                break;
        }
        if (this.mTintList != null) {
            sb.append(" tint=");
            sb.append(this.mTintList);
        }
        if (this.mTintMode != DEFAULT_TINT_MODE) {
            sb.append(" mode=");
            sb.append(this.mTintMode);
        }
        sb.append(")");
        return sb.toString();
    }
}
