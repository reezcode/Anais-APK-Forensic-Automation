package com.tencent.smtt.utils;

import android.os.Build;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes22.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private b f2450a = null;

    /* renamed from: b, reason: collision with root package name */
    private b f2451b = null;

    /* loaded from: classes11.dex */
    public class a {

        /* renamed from: b, reason: collision with root package name */
        private String f2453b;

        /* renamed from: c, reason: collision with root package name */
        private long f2454c;

        /* renamed from: d, reason: collision with root package name */
        private long f2455d;

        public a(String str, long j5, long j6) {
            this.f2453b = str;
            this.f2454c = j5;
            this.f2455d = j6;
        }

        public long a() {
            return this.f2454c;
        }

        public long b() {
            return this.f2455d;
        }
    }

    public class b {

        /* renamed from: b, reason: collision with root package name */
        private Map<String, a> f2457b;

        public b(File file) {
            HashMap hashMap = new HashMap();
            this.f2457b = hashMap;
            hashMap.clear();
            a(file);
        }

        private void a(File file) {
            if (!file.isDirectory()) {
                if (file.isFile()) {
                    a(file.getName(), file.length(), file.lastModified());
                    return;
                }
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null || Build.VERSION.SDK_INT < 26) {
                for (File file2 : listFiles) {
                    a(file2);
                }
            }
        }

        private void a(String str, long j5, long j6) {
            if (str == null || str.length() <= 0 || j5 <= 0 || j6 <= 0) {
                return;
            }
            a aVar = q.this.new a(str, j5, j6);
            if (this.f2457b.containsKey(str)) {
                return;
            }
            this.f2457b.put(str, aVar);
        }

        public Map<String, a> a() {
            return this.f2457b;
        }
    }

    private boolean a(b bVar, b bVar2) {
        if (bVar == null || bVar.a() == null || bVar2 == null || bVar2.a() == null) {
            return false;
        }
        Map<String, a> a5 = bVar.a();
        Map<String, a> a6 = bVar2.a();
        for (Map.Entry<String, a> entry : a5.entrySet()) {
            String key = entry.getKey();
            a value = entry.getValue();
            if (a6.containsKey(key)) {
                a aVar = a6.get(key);
                if (value.a() == aVar.a() && value.b() == aVar.b()) {
                }
            }
            return false;
        }
        return true;
    }

    public void a(File file) {
        this.f2450a = new b(file);
    }

    public boolean a() {
        b bVar = this.f2451b;
        return bVar != null && this.f2450a != null && bVar.a().size() == this.f2450a.a().size() && a(this.f2450a, this.f2451b);
    }

    public void b(File file) {
        this.f2451b = new b(file);
    }
}
