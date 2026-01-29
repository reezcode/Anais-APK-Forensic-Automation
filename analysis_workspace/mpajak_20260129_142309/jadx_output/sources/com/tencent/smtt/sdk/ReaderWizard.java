package com.tencent.smtt.sdk;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.sdk.TbsReaderView;

/* loaded from: classes9.dex */
class ReaderWizard {

    /* renamed from: a, reason: collision with root package name */
    private DexLoader f1843a;

    /* renamed from: b, reason: collision with root package name */
    private TbsReaderView.ReaderCallback f1844b;

    public ReaderWizard(TbsReaderView.ReaderCallback readerCallback) {
        this.f1843a = null;
        this.f1844b = null;
        this.f1843a = a();
        this.f1844b = readerCallback;
    }

    private static DexLoader a() {
        s c5 = f.a(true).c();
        if (c5 != null) {
            return c5.c();
        }
        return null;
    }

    public static Drawable getResDrawable(int i5) {
        DexLoader a5 = a();
        if (a5 != null) {
            Object invokeStaticMethod = a5.invokeStaticMethod("com.tencent.tbs.reader.TbsReader", "getResDrawable", new Class[]{Integer.class}, Integer.valueOf(i5));
            if (invokeStaticMethod instanceof Drawable) {
                return (Drawable) invokeStaticMethod;
            }
        }
        return null;
    }

    public static String getResString(int i5) {
        DexLoader a5 = a();
        if (a5 != null) {
            Object invokeStaticMethod = a5.invokeStaticMethod("com.tencent.tbs.reader.TbsReader", "getResString", new Class[]{Integer.class}, Integer.valueOf(i5));
            if (invokeStaticMethod instanceof String) {
                return (String) invokeStaticMethod;
            }
        }
        return "";
    }

    public static boolean isSupportCurrentPlatform(Context context) {
        DexLoader a5 = a();
        if (a5 == null) {
            return false;
        }
        Object invokeStaticMethod = a5.invokeStaticMethod("com.tencent.tbs.reader.TbsReader", "isSupportCurrentPlatform", new Class[]{Context.class}, context);
        if (invokeStaticMethod instanceof Boolean) {
            return ((Boolean) invokeStaticMethod).booleanValue();
        }
        return false;
    }

    public static boolean isSupportExt(String str) {
        DexLoader a5 = a();
        if (a5 == null) {
            return false;
        }
        Object invokeStaticMethod = a5.invokeStaticMethod("com.tencent.tbs.reader.TbsReader", "isSupportExt", new Class[]{String.class}, str);
        if (invokeStaticMethod instanceof Boolean) {
            return ((Boolean) invokeStaticMethod).booleanValue();
        }
        return false;
    }

    public boolean checkPlugin(Object obj, Context context, String str, boolean z4) {
        String str2;
        DexLoader dexLoader = this.f1843a;
        if (dexLoader == null) {
            str2 = "checkPlugin:Unexpect null object!";
        } else {
            Object invokeMethod = dexLoader.invokeMethod(obj, "com.tencent.tbs.reader.TbsReader", "checkPlugin", new Class[]{Context.class, String.class, Boolean.class}, context, str, Boolean.valueOf(z4));
            if (invokeMethod instanceof Boolean) {
                return ((Boolean) invokeMethod).booleanValue();
            }
            str2 = "Unexpect return value type of call checkPlugin!";
        }
        Log.e("ReaderWizard", str2);
        return false;
    }

    public void destroy(Object obj) {
        this.f1844b = null;
        DexLoader dexLoader = this.f1843a;
        if (dexLoader == null || obj == null) {
            Log.e("ReaderWizard", "destroy:Unexpect null object!");
        } else {
            dexLoader.invokeMethod(obj, "com.tencent.tbs.reader.TbsReader", "destroy", new Class[0], new Object[0]);
        }
    }

    public void doCommand(Object obj, Integer num, Object obj2, Object obj3) {
        DexLoader dexLoader = this.f1843a;
        if (dexLoader == null) {
            Log.e("ReaderWizard", "doCommand:Unexpect null object!");
        } else {
            dexLoader.invokeMethod(obj, "com.tencent.tbs.reader.TbsReader", "doCommand", new Class[]{Integer.class, Object.class, Object.class}, new Integer(num.intValue()), obj2, obj3);
        }
    }

    public Object getTbsReader() {
        return this.f1843a.newInstance("com.tencent.tbs.reader.TbsReader", new Class[0], new Object[0]);
    }

    public boolean initTbsReader(Object obj, Context context) {
        String str;
        DexLoader dexLoader = this.f1843a;
        if (dexLoader == null || obj == null) {
            str = "initTbsReader:Unexpect null object!";
        } else {
            Object invokeMethod = dexLoader.invokeMethod(obj, "com.tencent.tbs.reader.TbsReader", "init", new Class[]{Context.class, DexLoader.class, Object.class}, context, dexLoader, this);
            if (invokeMethod instanceof Boolean) {
                return ((Boolean) invokeMethod).booleanValue();
            }
            str = "Unexpect return value type of call initTbsReader!";
        }
        Log.e("ReaderWizard", str);
        return false;
    }

    public void onCallBackAction(Integer num, Object obj, Object obj2) {
        TbsReaderView.ReaderCallback readerCallback = this.f1844b;
        if (readerCallback != null) {
            readerCallback.onCallBackAction(num, obj, obj2);
        }
    }

    public void onSizeChanged(Object obj, int i5, int i6) {
        DexLoader dexLoader = this.f1843a;
        if (dexLoader == null) {
            Log.e("ReaderWizard", "onSizeChanged:Unexpect null object!");
        } else {
            dexLoader.invokeMethod(obj, "com.tencent.tbs.reader.TbsReader", "onSizeChanged", new Class[]{Integer.class, Integer.class}, new Integer(i5), new Integer(i6));
        }
    }

    public boolean openFile(Object obj, Context context, Bundle bundle, FrameLayout frameLayout) {
        String str;
        DexLoader dexLoader = this.f1843a;
        if (dexLoader == null) {
            str = "openFile:Unexpect null object!";
        } else {
            Object invokeMethod = dexLoader.invokeMethod(obj, "com.tencent.tbs.reader.TbsReader", "openFile", new Class[]{Context.class, Bundle.class, FrameLayout.class}, context, bundle, frameLayout);
            if (invokeMethod instanceof Boolean) {
                return ((Boolean) invokeMethod).booleanValue();
            }
            str = "Unexpect return value type of call openFile!";
        }
        Log.e("ReaderWizard", str);
        return false;
    }

    public void userStatistics(Object obj, String str) {
        DexLoader dexLoader = this.f1843a;
        if (dexLoader == null) {
            Log.e("ReaderWizard", "userStatistics:Unexpect null object!");
        } else {
            dexLoader.invokeMethod(obj, "com.tencent.tbs.reader.TbsReader", "userStatistics", new Class[]{String.class}, str);
        }
    }
}
