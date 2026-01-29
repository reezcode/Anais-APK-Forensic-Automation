package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Bundle;
import com.tencent.smtt.export.external.DexLoader;

/* loaded from: classes8.dex */
public class TbsVideoCacheTask {
    public static final String KEY_VIDEO_CACHE_PARAM_FILENAME = "filename";
    public static final String KEY_VIDEO_CACHE_PARAM_FOLDERPATH = "folderPath";
    public static final String KEY_VIDEO_CACHE_PARAM_HEADER = "header";
    public static final String KEY_VIDEO_CACHE_PARAM_URL = "url";

    /* renamed from: a, reason: collision with root package name */
    public Context f1994a;

    /* renamed from: b, reason: collision with root package name */
    public TbsVideoCacheListener f1995b;

    /* renamed from: e, reason: collision with root package name */
    private String f1998e;

    /* renamed from: f, reason: collision with root package name */
    private String f1999f;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1996c = false;

    /* renamed from: d, reason: collision with root package name */
    private o f1997d = null;

    /* renamed from: g, reason: collision with root package name */
    private Object f2000g = null;

    public TbsVideoCacheTask(Context context, Bundle bundle, TbsVideoCacheListener tbsVideoCacheListener) {
        this.f1994a = context;
        this.f1995b = tbsVideoCacheListener;
        if (bundle != null) {
            this.f1998e = bundle.getString("taskId");
            this.f1999f = bundle.getString(KEY_VIDEO_CACHE_PARAM_URL);
        }
        a(bundle);
    }

    private void a(Bundle bundle) {
        TbsVideoCacheListener tbsVideoCacheListener;
        String str;
        DexLoader dexLoader;
        if (this.f1997d == null) {
            f.a(true).a(this.f1994a, false, false);
            s a5 = f.a(true).a();
            if (a5 != null) {
                dexLoader = a5.c();
            } else {
                this.f1995b.onVideoDownloadError(this, -1, "init engine error!", null);
                dexLoader = null;
            }
            if (dexLoader != null) {
                this.f1997d = new o(dexLoader);
            } else {
                this.f1995b.onVideoDownloadError(this, -1, "Java dexloader invalid!", null);
            }
        }
        o oVar = this.f1997d;
        if (oVar != null) {
            Object a6 = oVar.a(this.f1994a, this, bundle);
            this.f2000g = a6;
            if (a6 != null) {
                return;
            }
            tbsVideoCacheListener = this.f1995b;
            str = "init task error!";
        } else {
            tbsVideoCacheListener = this.f1995b;
            if (tbsVideoCacheListener == null) {
                return;
            } else {
                str = "init error!";
            }
        }
        tbsVideoCacheListener.onVideoDownloadError(this, -1, str, null);
    }

    public long getContentLength() {
        o oVar = this.f1997d;
        if (oVar != null && this.f2000g != null) {
            return oVar.d();
        }
        TbsVideoCacheListener tbsVideoCacheListener = this.f1995b;
        if (tbsVideoCacheListener == null) {
            return 0L;
        }
        tbsVideoCacheListener.onVideoDownloadError(this, -1, "getContentLength failed, init uncompleted!", null);
        return 0L;
    }

    public int getDownloadedSize() {
        o oVar = this.f1997d;
        if (oVar != null && this.f2000g != null) {
            return oVar.e();
        }
        TbsVideoCacheListener tbsVideoCacheListener = this.f1995b;
        if (tbsVideoCacheListener == null) {
            return 0;
        }
        tbsVideoCacheListener.onVideoDownloadError(this, -1, "getDownloadedSize failed, init uncompleted!", null);
        return 0;
    }

    public int getProgress() {
        o oVar = this.f1997d;
        if (oVar != null && this.f2000g != null) {
            return oVar.f();
        }
        TbsVideoCacheListener tbsVideoCacheListener = this.f1995b;
        if (tbsVideoCacheListener == null) {
            return 0;
        }
        tbsVideoCacheListener.onVideoDownloadError(this, -1, "getProgress failed, init uncompleted!", null);
        return 0;
    }

    public String getTaskID() {
        return this.f1998e;
    }

    public String getTaskUrl() {
        return this.f1999f;
    }

    public void pauseTask() {
        o oVar = this.f1997d;
        if (oVar != null && this.f2000g != null) {
            oVar.a();
            return;
        }
        TbsVideoCacheListener tbsVideoCacheListener = this.f1995b;
        if (tbsVideoCacheListener != null) {
            tbsVideoCacheListener.onVideoDownloadError(this, -1, "pauseTask failed, init uncompleted!", null);
        }
    }

    public void removeTask(boolean z4) {
        o oVar = this.f1997d;
        if (oVar != null && this.f2000g != null) {
            oVar.a(z4);
            return;
        }
        TbsVideoCacheListener tbsVideoCacheListener = this.f1995b;
        if (tbsVideoCacheListener != null) {
            tbsVideoCacheListener.onVideoDownloadError(this, -1, "removeTask failed, init uncompleted!", null);
        }
    }

    public void resumeTask() {
        o oVar = this.f1997d;
        if (oVar != null && this.f2000g != null) {
            oVar.b();
            return;
        }
        TbsVideoCacheListener tbsVideoCacheListener = this.f1995b;
        if (tbsVideoCacheListener != null) {
            tbsVideoCacheListener.onVideoDownloadError(this, -1, "resumeTask failed, init uncompleted!", null);
        }
    }

    public void stopTask() {
        o oVar = this.f1997d;
        if (oVar != null && this.f2000g != null) {
            oVar.c();
            return;
        }
        TbsVideoCacheListener tbsVideoCacheListener = this.f1995b;
        if (tbsVideoCacheListener != null) {
            tbsVideoCacheListener.onVideoDownloadError(this, -1, "stopTask failed, init uncompleted!", null);
        }
    }
}
