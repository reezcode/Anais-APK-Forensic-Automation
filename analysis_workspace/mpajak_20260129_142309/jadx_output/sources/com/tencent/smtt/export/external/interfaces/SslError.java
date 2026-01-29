package com.tencent.smtt.export.external.interfaces;

import android.net.http.SslCertificate;

/* loaded from: classes7.dex */
public interface SslError {
    boolean addError(int i5);

    SslCertificate getCertificate();

    int getPrimaryError();

    String getUrl();

    boolean hasError(int i5);
}
