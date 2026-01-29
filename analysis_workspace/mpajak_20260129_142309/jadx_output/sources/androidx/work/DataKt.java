package androidx.work;

import androidx.exifinterface.media.ExifInterface;
import androidx.work.Data;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes22.dex */
public final class DataKt {
    public static final /* synthetic */ <T> boolean hasKeyWithValueOfType(Data data, String key) {
        Intrinsics.checkNotNullParameter(data, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return data.hasKeyWithValueOfType(key, Object.class);
    }

    public static final Data workDataOf(Pair<String, ? extends Object>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Data.Builder builder = new Data.Builder();
        for (Pair<String, ? extends Object> pair : pairs) {
            builder.put(pair.getFirst(), pair.getSecond());
        }
        Data build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "dataBuilder.build()");
        return build;
    }
}
