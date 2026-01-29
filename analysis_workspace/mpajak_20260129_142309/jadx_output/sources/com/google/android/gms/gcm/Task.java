package com.google.android.gms.gcm;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import z0.i;

/* loaded from: classes6.dex */
public class Task implements ReflectedParcelable {

    /* renamed from: b, reason: collision with root package name */
    public final String f665b;

    /* renamed from: c, reason: collision with root package name */
    public final String f666c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f667d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f668e;

    /* renamed from: f, reason: collision with root package name */
    public final int f669f;

    /* renamed from: g, reason: collision with root package name */
    public final Set<Uri> f670g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f671h;

    /* renamed from: i, reason: collision with root package name */
    public final i f672i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f673j;

    /* loaded from: classes21.dex */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public int f674a;

        /* renamed from: b, reason: collision with root package name */
        public String f675b;

        /* renamed from: c, reason: collision with root package name */
        public String f676c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f677d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f678e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f679f;

        /* renamed from: g, reason: collision with root package name */
        public Set<Uri> f680g = Collections.emptySet();

        /* renamed from: h, reason: collision with root package name */
        public i f681h = i.f6107b;

        /* renamed from: i, reason: collision with root package name */
        public Bundle f682i;
    }

    @Deprecated
    public Task(Parcel parcel) {
        Log.e("Task", "Constructing a Task object using a parcel.");
        this.f665b = parcel.readString();
        this.f666c = parcel.readString();
        this.f667d = parcel.readInt() == 1;
        this.f668e = parcel.readInt() == 1;
        this.f669f = 2;
        this.f670g = Collections.emptySet();
        this.f671h = false;
        this.f672i = i.f6107b;
        this.f673j = null;
    }

    public Task(a aVar) {
        this.f665b = aVar.f675b;
        this.f666c = aVar.f676c;
        this.f667d = aVar.f677d;
        this.f668e = aVar.f678e;
        this.f669f = aVar.f674a;
        this.f670g = aVar.f680g;
        this.f671h = aVar.f679f;
        this.f673j = aVar.f682i;
        i iVar = aVar.f681h;
        this.f672i = iVar == null ? i.f6107b : iVar;
    }

    public static void j(Bundle bundle) {
        if (bundle != null) {
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            if (dataSize > 10240) {
                StringBuilder sb = new StringBuilder(55);
                sb.append("Extras exceeding maximum size(10240 bytes): ");
                sb.append(dataSize);
                throw new IllegalArgumentException(sb.toString());
            }
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                if (!((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof String) || (obj instanceof Boolean))) {
                    if (!(obj instanceof Bundle)) {
                        throw new IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, Boolean, and nested Bundles with the same restrictions.");
                    }
                    j((Bundle) obj);
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f665b);
        parcel.writeString(this.f666c);
        parcel.writeInt(this.f667d ? 1 : 0);
        parcel.writeInt(this.f668e ? 1 : 0);
    }
}
