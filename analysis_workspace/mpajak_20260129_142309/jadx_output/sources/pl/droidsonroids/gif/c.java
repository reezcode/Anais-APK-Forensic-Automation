package pl.droidsonroids.gif;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes14.dex */
public final class c extends View.BaseSavedState {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long[][] f4701b;

    /* loaded from: classes3.dex */
    public static class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i5) {
            return new c[i5];
        }
    }

    public c(Parcel parcel) {
        super(parcel);
        this.f4701b = new long[parcel.readInt()][];
        int i5 = 0;
        while (true) {
            long[][] jArr = this.f4701b;
            if (i5 >= jArr.length) {
                return;
            }
            jArr[i5] = parcel.createLongArray();
            i5++;
        }
    }

    public c(Parcelable parcelable, Drawable... drawableArr) {
        super(parcelable);
        this.f4701b = new long[drawableArr.length][];
        for (int i5 = 0; i5 < drawableArr.length; i5++) {
            Drawable drawable = drawableArr[i5];
            if (drawable instanceof b) {
                this.f4701b[i5] = ((b) drawable).f4687h.i();
            } else {
                this.f4701b[i5] = null;
            }
        }
    }

    public final void j(Drawable drawable, int i5) {
        if (this.f4701b[i5] == null || !(drawable instanceof b)) {
            return;
        }
        ((b) drawable).a(r3.f4687h.o(r0[i5], r3.f4686g));
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeInt(this.f4701b.length);
        for (long[] jArr : this.f4701b) {
            parcel.writeLongArray(jArr);
        }
    }
}
