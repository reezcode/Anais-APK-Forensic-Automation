package androidx.room.util;

import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@JvmName(name = "StringUtil")
/* loaded from: classes3.dex */
public final class StringUtil {

    @JvmField
    public static final String[] EMPTY_STRING_ARRAY = new String[0];

    public static final void appendPlaceholders(StringBuilder builder, int i5) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        for (int i6 = 0; i6 < i5; i6++) {
            builder.append("?");
            if (i6 < i5 - 1) {
                builder.append(",");
            }
        }
    }

    public static /* synthetic */ void getEMPTY_STRING_ARRAY$annotations() {
    }

    public static final String joinIntoString(List<Integer> list) {
        String joinToString$default;
        if (list == null) {
            return null;
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null);
        return joinToString$default;
    }

    public static final StringBuilder newStringBuilder() {
        return new StringBuilder();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0003, code lost:
    
        r5 = kotlin.text.StringsKt__StringsKt.split$default(r5, new char[]{','}, false, 0, 6, (java.lang.Object) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<java.lang.Integer> splitToIntList(java.lang.String r5) {
        /*
            r0 = 0
            if (r5 == 0) goto L3f
            r1 = 1
            char[] r1 = new char[r1]
            r2 = 0
            r3 = 44
            r1[r2] = r3
            java.util.List r5 = kotlin.text.StringsKt.q(r5, r1)
            if (r5 == 0) goto L3f
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L1a:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L2f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L2f
            goto L38
        L2f:
            r2 = move-exception
            java.lang.String r3 = "ROOM"
            java.lang.String r4 = "Malformed integer list"
            android.util.Log.e(r3, r4, r2)
            r2 = r0
        L38:
            if (r2 == 0) goto L1a
            r1.add(r2)
            goto L1a
        L3e:
            r0 = r1
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.StringUtil.splitToIntList(java.lang.String):java.util.List");
    }
}
