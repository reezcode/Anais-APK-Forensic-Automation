package kotlin;

import androidx.appcompat.widget.a;
import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;

/* loaded from: classes18.dex */
public final class CharCodeKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final char Char(int i5) {
        if (i5 < 0 || i5 > 65535) {
            throw new IllegalArgumentException(a.g("Invalid Char code: ", i5));
        }
        return (char) i5;
    }

    private static final int getCode(char c5) {
        return c5;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @IntrinsicConstEvaluation
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static /* synthetic */ void getCode$annotations(char c5) {
    }
}
