package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes21.dex */
public final class j implements d<InputStream> {

    /* renamed from: g, reason: collision with root package name */
    @VisibleForTesting
    public static final a f618g = new a();

    /* renamed from: b, reason: collision with root package name */
    public final v.g f619b;

    /* renamed from: c, reason: collision with root package name */
    public final int f620c;

    /* renamed from: d, reason: collision with root package name */
    public HttpURLConnection f621d;

    /* renamed from: e, reason: collision with root package name */
    public InputStream f622e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f623f;

    /* loaded from: classes18.dex */
    public static class a {
    }

    public j(v.g gVar, int i5) {
        this.f619b = gVar;
        this.f620c = i5;
    }

    public static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e5) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e5);
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        InputStream inputStream = this.f622e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f621d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f621d = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.f623f = true;
    }

    public final InputStream d(URL url, int i5, URL url2, Map<String, String> map) {
        InputStream inputStream;
        if (i5 >= 5) {
            throw new p.e("Too many (> 5) redirects!", -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new p.e("In re-direct loop", -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnection.setConnectTimeout(this.f620c);
            httpURLConnection.setReadTimeout(this.f620c);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f621d = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f622e = this.f621d.getInputStream();
                if (this.f623f) {
                    return null;
                }
                int c5 = c(this.f621d);
                int i6 = c5 / 100;
                if (i6 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f621d;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            inputStream = new l0.c(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            inputStream = httpURLConnection2.getInputStream();
                        }
                        this.f622e = inputStream;
                        return inputStream;
                    } catch (IOException e5) {
                        throw new p.e("Failed to obtain InputStream", c(httpURLConnection2), e5);
                    }
                }
                if (!(i6 == 3)) {
                    if (c5 == -1) {
                        throw new p.e("Http request failed", c5, null);
                    }
                    try {
                        throw new p.e(this.f621d.getResponseMessage(), c5, null);
                    } catch (IOException e6) {
                        throw new p.e("Failed to get a response message", c5, e6);
                    }
                }
                String headerField = this.f621d.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new p.e("Received empty or null redirect url", c5, null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    b();
                    return d(url3, i5 + 1, url, map);
                } catch (MalformedURLException e7) {
                    throw new p.e(androidx.activity.d.f("Bad redirect url: ", headerField), c5, e7);
                }
            } catch (IOException e8) {
                throw new p.e("Failed to connect or obtain data", c(this.f621d), e8);
            }
        } catch (IOException e9) {
            throw new p.e("URL.openConnection threw", 0, e9);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public final p.a e() {
        return p.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(@NonNull com.bumptech.glide.f fVar, @NonNull d.a<? super InputStream> aVar) {
        StringBuilder sb;
        int i5 = l0.f.f3932b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                aVar.d(d(this.f619b.d(), 0, null, this.f619b.f5489b.a()));
            } catch (IOException e5) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e5);
                }
                aVar.c(e5);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                } else {
                    sb = new StringBuilder();
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(l0.f.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder g5 = androidx.activity.d.g("Finished http url fetcher fetch in ");
                g5.append(l0.f.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", g5.toString());
            }
            throw th;
        }
    }
}
