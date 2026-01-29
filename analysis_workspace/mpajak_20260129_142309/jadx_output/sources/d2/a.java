package d2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes8.dex */
public final class a extends AbsSavedState {
    public static final Parcelable.Creator<a> CREATOR = new C0029a();

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final SimpleArrayMap<String, Bundle> f2486b;

    /* renamed from: d2.a$a, reason: collision with other inner class name */
    public class C0029a implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        @Nullable
        public final Object createFromParcel(@NonNull Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        @NonNull
        public final a createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final Object[] newArray(int i5) {
            return new a[i5];
        }
    }

    public a(@NonNull Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f2486b = new SimpleArrayMap<>(readInt);
        for (int i5 = 0; i5 < readInt; i5++) {
            this.f2486b.put(strArr[i5], bundleArr[i5]);
        }
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f2486b = new SimpleArrayMap<>();
    }

    @NonNull
    public final String toString() {
        StringBuilder g5 = d.g("ExtendableSavedState{");
        g5.append(Integer.toHexString(System.identityHashCode(this)));
        g5.append(" states=");
        g5.append(this.f2486b);
        g5.append("}");
        return g5.toString();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        int size = this.f2486b.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i6 = 0; i6 < size; i6++) {
            strArr[i6] = this.f2486b.keyAt(i6);
            bundleArr[i6] = this.f2486b.valueAt(i6);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
