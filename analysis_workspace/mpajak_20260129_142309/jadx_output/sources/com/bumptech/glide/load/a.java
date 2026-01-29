package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import y.w;

/* loaded from: classes9.dex */
public final class a implements c.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ParcelFileDescriptorRewinder f598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s.b f599b;

    public a(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, s.b bVar) {
        this.f598a = parcelFileDescriptorRewinder;
        this.f599b = bVar;
    }

    public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
        w wVar = null;
        try {
            w wVar2 = new w(new FileInputStream(this.f598a.a().getFileDescriptor()), this.f599b);
            try {
                ImageHeaderParser.ImageType c5 = imageHeaderParser.c(wVar2);
                try {
                    wVar2.close();
                } catch (IOException unused) {
                }
                this.f598a.a();
                return c5;
            } catch (Throwable th) {
                th = th;
                wVar = wVar2;
                if (wVar != null) {
                    try {
                        wVar.close();
                    } catch (IOException unused2) {
                    }
                }
                this.f598a.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
