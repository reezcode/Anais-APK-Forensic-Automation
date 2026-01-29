package com.tencent.smtt.sdk;

import android.os.Bundle;

/* loaded from: classes6.dex */
public interface TbsVideoCacheListener {
    void onVideoDownloadCompletion(TbsVideoCacheTask tbsVideoCacheTask, long j5, long j6, Bundle bundle);

    void onVideoDownloadError(TbsVideoCacheTask tbsVideoCacheTask, int i5, String str, Bundle bundle);

    void onVideoDownloadInit(TbsVideoCacheTask tbsVideoCacheTask, int i5, String str, Bundle bundle);

    void onVideoDownloadProgress(TbsVideoCacheTask tbsVideoCacheTask, int i5, long j5, int i6, Bundle bundle);

    void onVideoDownloadStart(TbsVideoCacheTask tbsVideoCacheTask, Bundle bundle);
}
