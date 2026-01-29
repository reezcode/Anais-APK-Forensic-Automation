package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.appcompat.resources.Compatibility;
import androidx.appcompat.resources.R;
import androidx.collection.LongSparseArray;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes22.dex */
public final class ResourceManagerInternal {
    private static final boolean DEBUG = false;
    private static ResourceManagerInternal INSTANCE = null;
    private static final String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
    private static final String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
    private static final String TAG = "ResourceManagerInternal";
    private SimpleArrayMap<String, InflateDelegate> mDelegates;
    private final WeakHashMap<Context, LongSparseArray<WeakReference<Drawable.ConstantState>>> mDrawableCaches = new WeakHashMap<>(0);
    private boolean mHasCheckedVectorDrawableSetup;
    private ResourceManagerHooks mHooks;
    private SparseArrayCompat<String> mKnownDrawableIdTags;
    private WeakHashMap<Context, SparseArrayCompat<ColorStateList>> mTintLists;
    private TypedValue mTypedValue;
    private static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    private static final ColorFilterLruCache COLOR_FILTER_CACHE = new ColorFilterLruCache(6);

    /* loaded from: classes2.dex */
    public static class AsldcInflateDelegate implements InflateDelegate {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public Drawable createFromXmlInner(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return AnimatedStateListDrawableCompat.createFromXmlInner(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e5) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e5);
                return null;
            }
        }
    }

    /* loaded from: classes10.dex */
    public static class AvdcInflateDelegate implements InflateDelegate {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public Drawable createFromXmlInner(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return AnimatedVectorDrawableCompat.createFromXmlInner(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e5) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e5);
                return null;
            }
        }
    }

    /* loaded from: classes16.dex */
    public static class ColorFilterLruCache extends LruCache<Integer, PorterDuffColorFilter> {
        public ColorFilterLruCache(int i5) {
            super(i5);
        }

        private static int generateCacheKey(int i5, PorterDuff.Mode mode) {
            return mode.hashCode() + ((i5 + 31) * 31);
        }

        public PorterDuffColorFilter get(int i5, PorterDuff.Mode mode) {
            return get(Integer.valueOf(generateCacheKey(i5, mode)));
        }

        public PorterDuffColorFilter put(int i5, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(generateCacheKey(i5, mode)), porterDuffColorFilter);
        }
    }

    /* loaded from: classes16.dex */
    public static class DrawableDelegate implements InflateDelegate {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public Drawable createFromXmlInner(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) DrawableDelegate.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    Compatibility.Api21Impl.inflate(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e5) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e5);
                }
            }
            return null;
        }
    }

    /* loaded from: classes15.dex */
    public interface InflateDelegate {
        Drawable createFromXmlInner(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes12.dex */
    public interface ResourceManagerHooks {
        @Nullable
        Drawable createDrawableFor(@NonNull ResourceManagerInternal resourceManagerInternal, @NonNull Context context, @DrawableRes int i5);

        @Nullable
        ColorStateList getTintListForDrawableRes(@NonNull Context context, @DrawableRes int i5);

        @Nullable
        PorterDuff.Mode getTintModeForDrawableRes(int i5);

        boolean tintDrawable(@NonNull Context context, @DrawableRes int i5, @NonNull Drawable drawable);

        boolean tintDrawableUsingColorFilter(@NonNull Context context, @DrawableRes int i5, @NonNull Drawable drawable);
    }

    /* loaded from: classes18.dex */
    public static class VdcInflateDelegate implements InflateDelegate {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public Drawable createFromXmlInner(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return VectorDrawableCompat.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e5) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e5);
                return null;
            }
        }
    }

    private void addDelegate(@NonNull String str, @NonNull InflateDelegate inflateDelegate) {
        if (this.mDelegates == null) {
            this.mDelegates = new SimpleArrayMap<>();
        }
        this.mDelegates.put(str, inflateDelegate);
    }

    private synchronized boolean addDrawableToCache(@NonNull Context context, long j5, @NonNull Drawable drawable) {
        boolean z4;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.mDrawableCaches.get(context);
            if (longSparseArray == null) {
                longSparseArray = new LongSparseArray<>();
                this.mDrawableCaches.put(context, longSparseArray);
            }
            longSparseArray.put(j5, new WeakReference<>(constantState));
            z4 = true;
        } else {
            z4 = false;
        }
        return z4;
    }

    private void addTintListToCache(@NonNull Context context, @DrawableRes int i5, @NonNull ColorStateList colorStateList) {
        if (this.mTintLists == null) {
            this.mTintLists = new WeakHashMap<>();
        }
        SparseArrayCompat<ColorStateList> sparseArrayCompat = this.mTintLists.get(context);
        if (sparseArrayCompat == null) {
            sparseArrayCompat = new SparseArrayCompat<>();
            this.mTintLists.put(context, sparseArrayCompat);
        }
        sparseArrayCompat.append(i5, colorStateList);
    }

    private void checkVectorDrawableSetup(@NonNull Context context) {
        if (this.mHasCheckedVectorDrawableSetup) {
            return;
        }
        this.mHasCheckedVectorDrawableSetup = true;
        Drawable drawable = getDrawable(context, R.drawable.abc_vector_test);
        if (drawable == null || !isVectorDrawable(drawable)) {
            this.mHasCheckedVectorDrawableSetup = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long createCacheKey(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable createDrawableIfNeeded(@NonNull Context context, @DrawableRes int i5) {
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        context.getResources().getValue(i5, typedValue, true);
        long createCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, createCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        ResourceManagerHooks resourceManagerHooks = this.mHooks;
        Drawable createDrawableFor = resourceManagerHooks == null ? null : resourceManagerHooks.createDrawableFor(this, context, i5);
        if (createDrawableFor != null) {
            createDrawableFor.setChangingConfigurations(typedValue.changingConfigurations);
            addDrawableToCache(context, createCacheKey, createDrawableFor);
        }
        return createDrawableFor;
    }

    private static PorterDuffColorFilter createTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return getPorterDuffColorFilter(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized ResourceManagerInternal get() {
        ResourceManagerInternal resourceManagerInternal;
        synchronized (ResourceManagerInternal.class) {
            if (INSTANCE == null) {
                ResourceManagerInternal resourceManagerInternal2 = new ResourceManagerInternal();
                INSTANCE = resourceManagerInternal2;
                installDefaultInflateDelegates(resourceManagerInternal2);
            }
            resourceManagerInternal = INSTANCE;
        }
        return resourceManagerInternal;
    }

    private synchronized Drawable getCachedDrawable(@NonNull Context context, long j5) {
        LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.mDrawableCaches.get(context);
        if (longSparseArray == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReference = longSparseArray.get(j5);
        if (weakReference != null) {
            Drawable.ConstantState constantState = weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            longSparseArray.remove(j5);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i5, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (ResourceManagerInternal.class) {
            ColorFilterLruCache colorFilterLruCache = COLOR_FILTER_CACHE;
            porterDuffColorFilter = colorFilterLruCache.get(i5, mode);
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i5, mode);
                colorFilterLruCache.put(i5, mode, porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    private ColorStateList getTintListFromCache(@NonNull Context context, @DrawableRes int i5) {
        SparseArrayCompat<ColorStateList> sparseArrayCompat;
        WeakHashMap<Context, SparseArrayCompat<ColorStateList>> weakHashMap = this.mTintLists;
        if (weakHashMap == null || (sparseArrayCompat = weakHashMap.get(context)) == null) {
            return null;
        }
        return sparseArrayCompat.get(i5);
    }

    private static void installDefaultInflateDelegates(@NonNull ResourceManagerInternal resourceManagerInternal) {
        if (Build.VERSION.SDK_INT < 24) {
            resourceManagerInternal.addDelegate("vector", new VdcInflateDelegate());
            resourceManagerInternal.addDelegate("animated-vector", new AvdcInflateDelegate());
            resourceManagerInternal.addDelegate("animated-selector", new AsldcInflateDelegate());
            resourceManagerInternal.addDelegate("drawable", new DrawableDelegate());
        }
    }

    private static boolean isVectorDrawable(@NonNull Drawable drawable) {
        return (drawable instanceof VectorDrawableCompat) || PLATFORM_VD_CLAZZ.equals(drawable.getClass().getName());
    }

    private Drawable loadDrawableFromDelegates(@NonNull Context context, @DrawableRes int i5) {
        int next;
        SimpleArrayMap<String, InflateDelegate> simpleArrayMap = this.mDelegates;
        if (simpleArrayMap == null || simpleArrayMap.isEmpty()) {
            return null;
        }
        SparseArrayCompat<String> sparseArrayCompat = this.mKnownDrawableIdTags;
        if (sparseArrayCompat != null) {
            String str = sparseArrayCompat.get(i5);
            if (SKIP_DRAWABLE_TAG.equals(str) || (str != null && this.mDelegates.get(str) == null)) {
                return null;
            }
        } else {
            this.mKnownDrawableIdTags = new SparseArrayCompat<>();
        }
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        Resources resources = context.getResources();
        resources.getValue(i5, typedValue, true);
        long createCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, createCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i5);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.mKnownDrawableIdTags.append(i5, name);
                InflateDelegate inflateDelegate = this.mDelegates.get(name);
                if (inflateDelegate != null) {
                    cachedDrawable = inflateDelegate.createFromXmlInner(context, xml, asAttributeSet, context.getTheme());
                }
                if (cachedDrawable != null) {
                    cachedDrawable.setChangingConfigurations(typedValue.changingConfigurations);
                    addDrawableToCache(context, createCacheKey, cachedDrawable);
                }
            } catch (Exception e5) {
                Log.e(TAG, "Exception while inflating drawable", e5);
            }
        }
        if (cachedDrawable == null) {
            this.mKnownDrawableIdTags.append(i5, SKIP_DRAWABLE_TAG);
        }
        return cachedDrawable;
    }

    private Drawable tintDrawable(@NonNull Context context, @DrawableRes int i5, boolean z4, @NonNull Drawable drawable) {
        ColorStateList tintList = getTintList(context, i5);
        if (tintList == null) {
            ResourceManagerHooks resourceManagerHooks = this.mHooks;
            if ((resourceManagerHooks == null || !resourceManagerHooks.tintDrawable(context, i5, drawable)) && !tintDrawableUsingColorFilter(context, i5, drawable) && z4) {
                return null;
            }
            return drawable;
        }
        if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable wrap = DrawableCompat.wrap(drawable);
        DrawableCompat.setTintList(wrap, tintList);
        PorterDuff.Mode tintMode = getTintMode(i5);
        if (tintMode == null) {
            return wrap;
        }
        DrawableCompat.setTintMode(wrap, tintMode);
        return wrap;
    }

    public static void tintDrawable(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        int[] state = drawable.getState();
        if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
            if (!(drawable.mutate() == drawable)) {
                Log.d(TAG, "Mutated drawable is not the same instance as the input.");
                return;
            }
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z4 = tintInfo.mHasTintList;
        if (z4 || tintInfo.mHasTintMode) {
            drawable.setColorFilter(createTintFilter(z4 ? tintInfo.mTintList : null, tintInfo.mHasTintMode ? tintInfo.mTintMode : DEFAULT_MODE, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized Drawable getDrawable(@NonNull Context context, @DrawableRes int i5) {
        return getDrawable(context, i5, false);
    }

    public synchronized Drawable getDrawable(@NonNull Context context, @DrawableRes int i5, boolean z4) {
        Drawable loadDrawableFromDelegates;
        checkVectorDrawableSetup(context);
        loadDrawableFromDelegates = loadDrawableFromDelegates(context, i5);
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = createDrawableIfNeeded(context, i5);
        }
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = ContextCompat.getDrawable(context, i5);
        }
        if (loadDrawableFromDelegates != null) {
            loadDrawableFromDelegates = tintDrawable(context, i5, z4, loadDrawableFromDelegates);
        }
        if (loadDrawableFromDelegates != null) {
            DrawableUtils.fixDrawable(loadDrawableFromDelegates);
        }
        return loadDrawableFromDelegates;
    }

    public synchronized ColorStateList getTintList(@NonNull Context context, @DrawableRes int i5) {
        ColorStateList tintListFromCache;
        tintListFromCache = getTintListFromCache(context, i5);
        if (tintListFromCache == null) {
            ResourceManagerHooks resourceManagerHooks = this.mHooks;
            tintListFromCache = resourceManagerHooks == null ? null : resourceManagerHooks.getTintListForDrawableRes(context, i5);
            if (tintListFromCache != null) {
                addTintListToCache(context, i5, tintListFromCache);
            }
        }
        return tintListFromCache;
    }

    public PorterDuff.Mode getTintMode(int i5) {
        ResourceManagerHooks resourceManagerHooks = this.mHooks;
        if (resourceManagerHooks == null) {
            return null;
        }
        return resourceManagerHooks.getTintModeForDrawableRes(i5);
    }

    public synchronized void onConfigurationChanged(@NonNull Context context) {
        LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.mDrawableCaches.get(context);
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public synchronized Drawable onDrawableLoadedFromResources(@NonNull Context context, @NonNull VectorEnabledTintResources vectorEnabledTintResources, @DrawableRes int i5) {
        Drawable loadDrawableFromDelegates = loadDrawableFromDelegates(context, i5);
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = vectorEnabledTintResources.getDrawableCanonical(i5);
        }
        if (loadDrawableFromDelegates == null) {
            return null;
        }
        return tintDrawable(context, i5, false, loadDrawableFromDelegates);
    }

    public synchronized void setHooks(ResourceManagerHooks resourceManagerHooks) {
        this.mHooks = resourceManagerHooks;
    }

    public boolean tintDrawableUsingColorFilter(@NonNull Context context, @DrawableRes int i5, @NonNull Drawable drawable) {
        ResourceManagerHooks resourceManagerHooks = this.mHooks;
        return resourceManagerHooks != null && resourceManagerHooks.tintDrawableUsingColorFilter(context, i5, drawable);
    }
}
