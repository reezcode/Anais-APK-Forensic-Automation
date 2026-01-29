package com.blankj.utilcode.util;

import android.util.Log;
import androidx.activity.d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.graphics.drawable.a;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class BusUtils {
    private static final Object NULL = "nULl";
    private static final String TAG = "BusUtils";
    private final Map<String, Set<Object>> mClassName_BusesMap;
    private final Map<String, Map<String, Object>> mClassName_Tag_Arg4StickyMap;
    private final Map<String, List<String>> mClassName_TagsMap;
    private final Map<String, List<BusInfo>> mTag_BusInfoListMap;

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes16.dex */
    public @interface Bus {
        int priority() default 0;

        boolean sticky() default false;

        String tag();

        ThreadMode threadMode() default ThreadMode.POSTING;
    }

    /* loaded from: classes6.dex */
    public static final class BusInfo {
        public String className;
        public String funName;
        public Method method;
        public String paramName;
        public String paramType;
        public int priority;
        public boolean sticky;
        public List<String> subClassNames = new CopyOnWriteArrayList();
        public String tag;
        public String threadMode;

        public BusInfo(String str, String str2, String str3, String str4, String str5, boolean z4, String str6, int i5) {
            this.tag = str;
            this.className = str2;
            this.funName = str3;
            this.paramType = str4;
            this.paramName = str5;
            this.sticky = z4;
            this.threadMode = str6;
            this.priority = i5;
        }

        private String getDesc() {
            String c5;
            StringBuilder sb = new StringBuilder();
            sb.append(this.className);
            sb.append("#");
            sb.append(this.funName);
            if ("".equals(this.paramType)) {
                c5 = "()";
            } else {
                StringBuilder g5 = d.g("(");
                g5.append(this.paramType);
                g5.append(" ");
                c5 = a.c(g5, this.paramName, ")");
            }
            sb.append(c5);
            return sb.toString();
        }

        public String toString() {
            StringBuilder g5 = d.g("BusInfo { tag : ");
            g5.append(this.tag);
            g5.append(", desc: ");
            g5.append(getDesc());
            g5.append(", sticky: ");
            g5.append(this.sticky);
            g5.append(", threadMode: ");
            g5.append(this.threadMode);
            g5.append(", method: ");
            g5.append(this.method);
            g5.append(", priority: ");
            return androidx.appcompat.view.a.h(g5, this.priority, " }");
        }
    }

    /* loaded from: classes17.dex */
    public static class LazyHolder {
        private static final BusUtils INSTANCE = new BusUtils();

        private LazyHolder() {
        }
    }

    /* loaded from: classes3.dex */
    public enum ThreadMode {
        MAIN,
        IO,
        CPU,
        CACHED,
        SINGLE,
        POSTING
    }

    private BusUtils() {
        this.mTag_BusInfoListMap = new ConcurrentHashMap();
        this.mClassName_BusesMap = new ConcurrentHashMap();
        this.mClassName_TagsMap = new ConcurrentHashMap();
        this.mClassName_Tag_Arg4StickyMap = new ConcurrentHashMap();
        init();
    }

    private void consumeSticky(Object obj, String str, Object obj2) {
        List<BusInfo> list = this.mTag_BusInfoListMap.get(str);
        if (list == null) {
            Log.e(TAG, "The bus of tag <" + str + "> is not exists.");
            return;
        }
        for (BusInfo busInfo : list) {
            if (busInfo.subClassNames.contains(obj.getClass().getName()) && busInfo.sticky) {
                synchronized (this.mClassName_Tag_Arg4StickyMap) {
                    Map<String, Object> map = this.mClassName_Tag_Arg4StickyMap.get(busInfo.className);
                    if (map != null && map.containsKey(str)) {
                        invokeBus(obj, obj2, busInfo, true);
                    }
                }
            }
        }
    }

    private void consumeStickyIfExist(Object obj) {
        Map<String, Object> map = this.mClassName_Tag_Arg4StickyMap.get(obj.getClass().getName());
        if (map == null) {
            return;
        }
        synchronized (this.mClassName_Tag_Arg4StickyMap) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                consumeSticky(obj, entry.getKey(), entry.getValue());
            }
        }
    }

    private Class getClassName(String str) {
        Objects.requireNonNull(str);
        switch (str) {
            case "double":
                return Double.TYPE;
            case "int":
                return Integer.TYPE;
            case "byte":
                return Byte.TYPE;
            case "char":
                return Character.TYPE;
            case "long":
                return Long.TYPE;
            case "boolean":
                return Boolean.TYPE;
            case "float":
                return Float.TYPE;
            case "short":
                return Short.TYPE;
            default:
                return Class.forName(str);
        }
    }

    private static BusUtils getInstance() {
        return LazyHolder.INSTANCE;
    }

    private Method getMethodByBusInfo(BusInfo busInfo) {
        try {
            return "".equals(busInfo.paramType) ? Class.forName(busInfo.className).getDeclaredMethod(busInfo.funName, new Class[0]) : Class.forName(busInfo.className).getDeclaredMethod(busInfo.funName, getClassName(busInfo.paramType));
        } catch (ClassNotFoundException | NoSuchMethodException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private void init() {
    }

    private void invokeBus(Object obj, BusInfo busInfo, boolean z4) {
        invokeBus(null, obj, busInfo, z4);
    }

    private void invokeBus(Object obj, Object obj2, BusInfo busInfo, boolean z4) {
        if (busInfo.method == null) {
            Method methodByBusInfo = getMethodByBusInfo(busInfo);
            if (methodByBusInfo == null) {
                return;
            } else {
                busInfo.method = methodByBusInfo;
            }
        }
        invokeMethod(obj, obj2, busInfo, z4);
    }

    private void invokeBuses(Object obj, BusInfo busInfo, Set<Object> set) {
        try {
            if (obj == NULL) {
                Iterator<Object> it = set.iterator();
                while (it.hasNext()) {
                    busInfo.method.invoke(it.next(), new Object[0]);
                }
            } else {
                Iterator<Object> it2 = set.iterator();
                while (it2.hasNext()) {
                    busInfo.method.invoke(it2.next(), obj);
                }
            }
        } catch (IllegalAccessException | InvocationTargetException e5) {
            e5.printStackTrace();
        }
    }

    private void invokeMethod(Object obj, BusInfo busInfo, boolean z4) {
        invokeMethod(null, obj, busInfo, z4);
    }

    private void invokeMethod(final Object obj, final Object obj2, final BusInfo busInfo, final boolean z4) {
        Runnable runnable;
        ExecutorService singlePool;
        runnable = new Runnable() { // from class: com.blankj.utilcode.util.BusUtils.1
            @Override // java.lang.Runnable
            public void run() {
                BusUtils.this.realInvokeMethod(obj, obj2, busInfo, z4);
            }
        };
        String str = busInfo.threadMode;
        Objects.requireNonNull(str);
        switch (str) {
            case "SINGLE":
                singlePool = ThreadUtils.getSinglePool();
                break;
            case "IO":
                singlePool = ThreadUtils.getIoPool();
                break;
            case "CPU":
                singlePool = ThreadUtils.getCpuPool();
                break;
            case "MAIN":
                ThreadUtils.runOnUiThread(runnable);
                return;
            case "CACHED":
                singlePool = ThreadUtils.getCachedPool();
                break;
            default:
                runnable.run();
                return;
        }
        singlePool.execute(runnable);
    }

    public static void post(@NonNull String str) {
        post(str, NULL);
    }

    public static void post(@NonNull String str, @NonNull Object obj) {
        getInstance().postInner(str, obj);
    }

    private void postInner(String str, Object obj) {
        postInner(str, obj, false);
    }

    private void postInner(String str, Object obj, boolean z4) {
        List<BusInfo> list = this.mTag_BusInfoListMap.get(str);
        if (list != null) {
            Iterator<BusInfo> it = list.iterator();
            while (it.hasNext()) {
                invokeBus(obj, it.next(), z4);
            }
            return;
        }
        Log.e(TAG, "The bus of tag <" + str + "> is not exists.");
        if (this.mTag_BusInfoListMap.isEmpty()) {
            Log.e(TAG, "Please check whether the bus plugin is applied.");
        }
    }

    public static void postSticky(@NonNull String str) {
        postSticky(str, NULL);
    }

    public static void postSticky(@NonNull String str, Object obj) {
        getInstance().postStickyInner(str, obj);
    }

    private void postStickyInner(String str, Object obj) {
        boolean z4;
        List<BusInfo> list = this.mTag_BusInfoListMap.get(str);
        if (list == null) {
            Log.e(TAG, "The bus of tag <" + str + "> is not exists.");
            return;
        }
        for (BusInfo busInfo : list) {
            if (busInfo.sticky) {
                synchronized (this.mClassName_Tag_Arg4StickyMap) {
                    Map<String, Object> map = this.mClassName_Tag_Arg4StickyMap.get(busInfo.className);
                    if (map == null) {
                        map = new ConcurrentHashMap<>();
                        this.mClassName_Tag_Arg4StickyMap.put(busInfo.className, map);
                    }
                    map.put(str, obj);
                }
                z4 = true;
            } else {
                z4 = false;
            }
            invokeBus(obj, busInfo, z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void realInvokeMethod(Object obj, Object obj2, BusInfo busInfo, boolean z4) {
        HashSet hashSet = new HashSet();
        if (obj == null) {
            Iterator<String> it = busInfo.subClassNames.iterator();
            while (it.hasNext()) {
                Set<Object> set = this.mClassName_BusesMap.get(it.next());
                if (set != null && !set.isEmpty()) {
                    hashSet.addAll(set);
                }
            }
            if (hashSet.size() == 0) {
                if (z4) {
                    return;
                }
                Log.e(TAG, "The " + busInfo + " was not registered before.");
                return;
            }
        } else {
            hashSet.add(obj);
        }
        invokeBuses(obj2, busInfo, hashSet);
    }

    private void recordTags(Class<?> cls, String str) {
        if (this.mClassName_TagsMap.get(str) == null) {
            synchronized (this.mClassName_TagsMap) {
                if (this.mClassName_TagsMap.get(str) == null) {
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    for (Map.Entry<String, List<BusInfo>> entry : this.mTag_BusInfoListMap.entrySet()) {
                        for (BusInfo busInfo : entry.getValue()) {
                            try {
                                if (Class.forName(busInfo.className).isAssignableFrom(cls)) {
                                    copyOnWriteArrayList.add(entry.getKey());
                                    busInfo.subClassNames.add(str);
                                }
                            } catch (ClassNotFoundException e5) {
                                e5.printStackTrace();
                            }
                        }
                    }
                    this.mClassName_TagsMap.put(str, copyOnWriteArrayList);
                }
            }
        }
    }

    public static void register(@Nullable Object obj) {
        getInstance().registerInner(obj);
    }

    private void registerBus(String str, String str2, String str3, String str4, String str5, boolean z4, String str6) {
        registerBus(str, str2, str3, str4, str5, z4, str6, 0);
    }

    private void registerBus(String str, String str2, String str3, String str4, String str5, boolean z4, String str6, int i5) {
        List<BusInfo> list = this.mTag_BusInfoListMap.get(str);
        if (list == null) {
            list = new CopyOnWriteArrayList<>();
            this.mTag_BusInfoListMap.put(str, list);
        }
        list.add(new BusInfo(str, str2, str3, str4, str5, z4, str6, i5));
    }

    public static void registerBus4Test(String str, String str2, String str3, String str4, String str5, boolean z4, String str6, int i5) {
        getInstance().registerBus(str, str2, str3, str4, str5, z4, str6, i5);
    }

    private void registerInner(@Nullable Object obj) {
        if (obj == null) {
            return;
        }
        Class<?> cls = obj.getClass();
        String name = cls.getName();
        boolean z4 = false;
        synchronized (this.mClassName_BusesMap) {
            Set<Object> set = this.mClassName_BusesMap.get(name);
            if (set == null) {
                set = new CopyOnWriteArraySet<>();
                this.mClassName_BusesMap.put(name, set);
                z4 = true;
            }
            if (!set.contains(obj)) {
                set.add(obj);
                if (z4) {
                    recordTags(cls, name);
                }
                consumeStickyIfExist(obj);
                return;
            }
            Log.w(TAG, "The bus of <" + obj + "> already registered.");
        }
    }

    public static void removeSticky(String str) {
        getInstance().removeStickyInner(str);
    }

    private void removeStickyInner(String str) {
        List<BusInfo> list = this.mTag_BusInfoListMap.get(str);
        if (list == null) {
            Log.e(TAG, "The bus of tag <" + str + "> is not exists.");
            return;
        }
        for (BusInfo busInfo : list) {
            if (busInfo.sticky) {
                synchronized (this.mClassName_Tag_Arg4StickyMap) {
                    Map<String, Object> map = this.mClassName_Tag_Arg4StickyMap.get(busInfo.className);
                    if (map != null && map.containsKey(str)) {
                        map.remove(str);
                    }
                    return;
                }
            }
        }
    }

    public static String toString_() {
        return getInstance().toString();
    }

    public static void unregister(@Nullable Object obj) {
        getInstance().unregisterInner(obj);
    }

    private void unregisterInner(Object obj) {
        if (obj == null) {
            return;
        }
        String name = obj.getClass().getName();
        synchronized (this.mClassName_BusesMap) {
            Set<Object> set = this.mClassName_BusesMap.get(name);
            if (set != null && set.contains(obj)) {
                set.remove(obj);
                return;
            }
            Log.e(TAG, "The bus of <" + obj + "> was not registered before.");
        }
    }

    public String toString() {
        StringBuilder g5 = d.g("BusUtils: ");
        g5.append(this.mTag_BusInfoListMap);
        return g5.toString();
    }
}
