package com.tencent.smtt.export.external.interfaces;

/* loaded from: classes20.dex */
public interface DownloadListener {
    void onDownloadStart(String str, String str2, String str3, String str4, long j5);

    void onDownloadStart(String str, String str2, byte[] bArr, String str3, String str4, String str5, long j5, String str6, String str7);

    void onDownloadVideo(String str, long j5, int i5);
}
