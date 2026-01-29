package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.a;
import androidx.work.Data;
import java.util.HashMap;
import java.util.Map;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes16.dex */
public class ParcelableData implements Parcelable {
    public static final Parcelable.Creator<ParcelableData> CREATOR = new Parcelable.Creator<ParcelableData>() { // from class: androidx.work.multiprocess.parcelable.ParcelableData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableData createFromParcel(@NonNull Parcel parcel) {
            return new ParcelableData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableData[] newArray(int i5) {
            return new ParcelableData[i5];
        }
    };
    private static final byte TYPE_BOOLEAN = 1;
    private static final byte TYPE_BOOLEAN_ARRAY = 8;
    private static final byte TYPE_BYTE = 2;
    private static final byte TYPE_BYTE_ARRAY = 9;
    private static final byte TYPE_DOUBLE = 6;
    private static final byte TYPE_DOUBLE_ARRAY = 13;
    private static final byte TYPE_FLOAT = 5;
    private static final byte TYPE_FLOAT_ARRAY = 12;
    private static final byte TYPE_INTEGER = 3;
    private static final byte TYPE_INTEGER_ARRAY = 10;
    private static final byte TYPE_LONG = 4;
    private static final byte TYPE_LONG_ARRAY = 11;
    private static final byte TYPE_NULL = 0;
    private static final byte TYPE_STRING = 7;
    private static final byte TYPE_STRING_ARRAY = 14;
    private final Data mData;

    public ParcelableData(@NonNull Parcel parcel) {
        HashMap hashMap = new HashMap();
        int readInt = parcel.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            addEntry(parcel, hashMap);
        }
        this.mData = new Data(hashMap);
    }

    public ParcelableData(@NonNull Data data) {
        this.mData = data;
    }

    private void addEntry(@NonNull Parcel parcel, @NonNull Map<String, Object> map) {
        Object obj;
        byte readByte = parcel.readByte();
        switch (readByte) {
            case 0:
                obj = null;
                break;
            case 1:
                obj = Boolean.valueOf(ParcelUtils.readBooleanValue(parcel));
                break;
            case 2:
                obj = Byte.valueOf(parcel.readByte());
                break;
            case 3:
                obj = Integer.valueOf(parcel.readInt());
                break;
            case 4:
                obj = Long.valueOf(parcel.readLong());
                break;
            case 5:
                obj = Float.valueOf(parcel.readFloat());
                break;
            case 6:
                obj = Double.valueOf(parcel.readDouble());
                break;
            case 7:
                obj = parcel.readString();
                break;
            case 8:
                obj = Data.convertPrimitiveBooleanArray(parcel.createBooleanArray());
                break;
            case 9:
                obj = Data.convertPrimitiveByteArray(parcel.createByteArray());
                break;
            case 10:
                obj = Data.convertPrimitiveIntArray(parcel.createIntArray());
                break;
            case 11:
                obj = Data.convertPrimitiveLongArray(parcel.createLongArray());
                break;
            case 12:
                obj = Data.convertPrimitiveFloatArray(parcel.createFloatArray());
                break;
            case 13:
                obj = Data.convertPrimitiveDoubleArray(parcel.createDoubleArray());
                break;
            case 14:
                obj = parcel.createStringArray();
                break;
            default:
                throw new IllegalStateException(a.g("Unsupported type ", readByte));
        }
        map.put(parcel.readString(), obj);
    }

    private void writeToParcel(@NonNull Parcel parcel, @NonNull String str, @Nullable Object obj) {
        byte byteValue;
        if (obj != null) {
            Class<?> cls = obj.getClass();
            if (cls == Boolean.class) {
                parcel.writeByte(TYPE_BOOLEAN);
                ParcelUtils.writeBooleanValue(parcel, ((Boolean) obj).booleanValue());
            } else if (cls == Byte.class) {
                parcel.writeByte(TYPE_BYTE);
                byteValue = ((Byte) obj).byteValue();
            } else if (cls == Integer.class) {
                parcel.writeByte(TYPE_INTEGER);
                parcel.writeInt(((Integer) obj).intValue());
            } else if (cls == Long.class) {
                parcel.writeByte(TYPE_LONG);
                parcel.writeLong(((Long) obj).longValue());
            } else if (cls == Float.class) {
                parcel.writeByte(TYPE_FLOAT);
                parcel.writeFloat(((Float) obj).floatValue());
            } else if (cls == Double.class) {
                parcel.writeByte(TYPE_DOUBLE);
                parcel.writeDouble(((Double) obj).doubleValue());
            } else if (cls == String.class) {
                parcel.writeByte(TYPE_STRING);
                parcel.writeString((String) obj);
            } else if (cls == Boolean[].class) {
                parcel.writeByte(TYPE_BOOLEAN_ARRAY);
                parcel.writeBooleanArray(Data.convertToPrimitiveArray((Boolean[]) obj));
            } else if (cls == Byte[].class) {
                parcel.writeByte(TYPE_BYTE_ARRAY);
                parcel.writeByteArray(Data.convertToPrimitiveArray((Byte[]) obj));
            } else if (cls == Integer[].class) {
                parcel.writeByte(TYPE_INTEGER_ARRAY);
                parcel.writeIntArray(Data.convertToPrimitiveArray((Integer[]) obj));
            } else if (cls == Long[].class) {
                parcel.writeByte(TYPE_LONG_ARRAY);
                parcel.writeLongArray(Data.convertToPrimitiveArray((Long[]) obj));
            } else if (cls == Float[].class) {
                parcel.writeByte(TYPE_FLOAT_ARRAY);
                parcel.writeFloatArray(Data.convertToPrimitiveArray((Float[]) obj));
            } else if (cls == Double[].class) {
                parcel.writeByte(TYPE_DOUBLE_ARRAY);
                parcel.writeDoubleArray(Data.convertToPrimitiveArray((Double[]) obj));
            } else {
                if (cls != String[].class) {
                    throw new IllegalArgumentException(androidx.appcompat.view.a.g(cls, d.g("Unsupported value type ")));
                }
                parcel.writeByte(TYPE_STRING_ARRAY);
                parcel.writeStringArray((String[]) obj);
            }
            parcel.writeString(str);
        }
        byteValue = 0;
        parcel.writeByte(byteValue);
        parcel.writeString(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public Data getData() {
        return this.mData;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i5) {
        Map<String, Object> keyValueMap = this.mData.getKeyValueMap();
        parcel.writeInt(keyValueMap.size());
        for (Map.Entry<String, Object> entry : keyValueMap.entrySet()) {
            writeToParcel(parcel, entry.getKey(), entry.getValue());
        }
    }
}
