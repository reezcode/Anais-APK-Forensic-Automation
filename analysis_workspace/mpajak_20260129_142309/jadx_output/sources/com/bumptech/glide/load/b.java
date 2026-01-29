package com.bumptech.glide.load;

import com.bumptech.glide.load.c;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import y.w;

/* loaded from: classes2.dex */
public final class b implements c.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ParcelFileDescriptorRewinder f600a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s.b f601b;

    public b(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, s.b bVar) {
        this.f600a = parcelFileDescriptorRewinder;
        this.f601b = bVar;
    }

    public final int a(ImageHeaderParser imageHeaderParser) {
        w wVar = null;
        try {
            w wVar2 = new w(new FileInputStream(this.f600a.a().getFileDescriptor()), this.f601b);
            try {
                int b5 = imageHeaderParser.b(wVar2, this.f601b);
                try {
                    wVar2.close();
                } catch (IOException unused) {
                }
                this.f600a.a();
                return b5;
            } catch (Throwable th) {
                th = th;
                wVar = wVar2;
                if (wVar != null) {
                    try {
                        wVar.close();
                    } catch (IOException unused2) {
                    }
                }
                this.f600a.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
