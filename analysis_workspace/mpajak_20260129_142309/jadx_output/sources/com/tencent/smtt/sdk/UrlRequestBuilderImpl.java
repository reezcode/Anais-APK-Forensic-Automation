package com.tencent.smtt.sdk;

import android.util.Pair;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.export.external.interfaces.UrlRequest;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
public class UrlRequestBuilderImpl extends UrlRequest.Builder {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2008a = "UrlRequestBuilderImpl";

    /* renamed from: b, reason: collision with root package name */
    private final String f2009b;

    /* renamed from: c, reason: collision with root package name */
    private final UrlRequest.Callback f2010c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f2011d;

    /* renamed from: e, reason: collision with root package name */
    private String f2012e;

    /* renamed from: g, reason: collision with root package name */
    private boolean f2014g;

    /* renamed from: i, reason: collision with root package name */
    private String f2016i;

    /* renamed from: j, reason: collision with root package name */
    private byte[] f2017j;

    /* renamed from: k, reason: collision with root package name */
    private String f2018k;

    /* renamed from: l, reason: collision with root package name */
    private String f2019l;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList<Pair<String, String>> f2013f = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private int f2015h = 3;

    public UrlRequestBuilderImpl(String str, UrlRequest.Callback callback, Executor executor) {
        Objects.requireNonNull(str, "URL is required.");
        Objects.requireNonNull(callback, "Callback is required.");
        Objects.requireNonNull(executor, "Executor is required.");
        this.f2009b = str;
        this.f2010c = callback;
        this.f2011d = executor;
    }

    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public UrlRequestBuilderImpl addHeader(String str, String str2) {
        Objects.requireNonNull(str, "Invalid header name.");
        Objects.requireNonNull(str2, "Invalid header value.");
        if ("Accept-Encoding".equalsIgnoreCase(str)) {
            return this;
        }
        this.f2013f.add(Pair.create(str, str2));
        return this;
    }

    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public UrlRequest build() {
        int i5;
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            return null;
        }
        DexLoader b5 = a5.c().b();
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Boolean.TYPE;
        UrlRequest urlRequest = (UrlRequest) b5.invokeStaticMethod("com.tencent.smtt.net.X5UrlRequestProvider", "GetX5UrlRequestProvider", new Class[]{String.class, cls, UrlRequest.Callback.class, Executor.class, cls2, String.class, ArrayList.class, String.class, byte[].class, String.class, String.class}, this.f2009b, Integer.valueOf(this.f2015h), this.f2010c, this.f2011d, Boolean.valueOf(this.f2014g), this.f2012e, this.f2013f, this.f2016i, this.f2017j, this.f2018k, this.f2019l);
        if (urlRequest == null) {
            i5 = 7;
            urlRequest = (UrlRequest) b5.invokeStaticMethod("com.tencent.smtt.net.X5UrlRequestProvider", "GetX5UrlRequestProvider", new Class[]{String.class, cls, UrlRequest.Callback.class, Executor.class, cls2, String.class, ArrayList.class, String.class}, this.f2009b, Integer.valueOf(this.f2015h), this.f2010c, this.f2011d, Boolean.valueOf(this.f2014g), this.f2012e, this.f2013f, this.f2016i);
        } else {
            i5 = 7;
        }
        if (urlRequest == null) {
            Class<?>[] clsArr = new Class[i5];
            clsArr[0] = String.class;
            clsArr[1] = cls;
            clsArr[2] = UrlRequest.Callback.class;
            clsArr[3] = Executor.class;
            clsArr[4] = cls2;
            clsArr[5] = String.class;
            clsArr[6] = ArrayList.class;
            Object[] objArr = new Object[i5];
            objArr[0] = this.f2009b;
            objArr[1] = Integer.valueOf(this.f2015h);
            objArr[2] = this.f2010c;
            objArr[3] = this.f2011d;
            objArr[4] = Boolean.valueOf(this.f2014g);
            objArr[5] = this.f2012e;
            objArr[6] = this.f2013f;
            urlRequest = (UrlRequest) b5.invokeStaticMethod("com.tencent.smtt.net.X5UrlRequestProvider", "GetX5UrlRequestProvider", clsArr, objArr);
        }
        if (urlRequest == null) {
            urlRequest = (UrlRequest) b5.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "UrlRequest_getX5UrlRequestProvider", new Class[]{String.class, cls, UrlRequest.Callback.class, Executor.class, cls2, String.class, ArrayList.class, String.class, byte[].class, String.class, String.class}, this.f2009b, Integer.valueOf(this.f2015h), this.f2010c, this.f2011d, Boolean.valueOf(this.f2014g), this.f2012e, this.f2013f, this.f2016i, this.f2017j, this.f2018k, this.f2019l);
        }
        Objects.requireNonNull(urlRequest, "UrlRequest build fail");
        return urlRequest;
    }

    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public UrlRequestBuilderImpl disableCache() {
        this.f2014g = true;
        return this;
    }

    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public UrlRequestBuilderImpl setDns(String str, String str2) {
        if (str == null || str2 == null) {
            throw new NullPointerException("host and address are required.");
        }
        this.f2018k = str;
        this.f2019l = str2;
        try {
            u a5 = u.a();
            if (a5 != null && a5.b()) {
                a5.c().b().invokeStaticMethod("com.tencent.smtt.net.X5UrlRequestProvider", "setDns", new Class[]{String.class, String.class}, this.f2018k, this.f2019l);
            }
        } catch (Exception unused) {
        }
        return this;
    }

    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public UrlRequest.Builder setHttpMethod(String str) {
        Objects.requireNonNull(str, "Method is required.");
        this.f2012e = str;
        return this;
    }

    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public UrlRequestBuilderImpl setPriority(int i5) {
        this.f2015h = i5;
        return this;
    }

    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public UrlRequest.Builder setRequestBody(String str) {
        Objects.requireNonNull(str, "Body is required.");
        this.f2016i = str;
        return this;
    }

    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public UrlRequest.Builder setRequestBodyBytes(byte[] bArr) {
        Objects.requireNonNull(bArr, "Body is required.");
        this.f2017j = bArr;
        return this;
    }
}
