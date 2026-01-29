package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.data.e;
import java.io.IOException;

/* loaded from: classes13.dex */
public final class ParcelFileDescriptorRewinder implements e<ParcelFileDescriptor> {

    /* renamed from: a, reason: collision with root package name */
    public final InternalRewinder f602a;

    @RequiresApi(21)
    /* loaded from: classes17.dex */
    public static final class InternalRewinder {

        /* renamed from: a, reason: collision with root package name */
        public final ParcelFileDescriptor f603a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f603a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() {
            try {
                Os.lseek(this.f603a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f603a;
            } catch (ErrnoException e5) {
                throw new IOException(e5);
            }
        }
    }

    @RequiresApi(21)
    public static final class a implements e.a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public final Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public final e<ParcelFileDescriptor> b(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    @RequiresApi(21)
    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f602a = new InternalRewinder(parcelFileDescriptor);
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
    }

    @Override // com.bumptech.glide.load.data.e
    @NonNull
    @RequiresApi(21)
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ParcelFileDescriptor a() {
        return this.f602a.rewind();
    }
}
