package androidx.core.os;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;
import kotlin.ULong;

/* loaded from: classes17.dex */
interface LocaleListInterface {
    Locale get(int i5);

    @Nullable
    Locale getFirstMatch(@NonNull String[] strArr);

    Object getLocaleList();

    @IntRange(from = -1)
    int indexOf(Locale locale);

    boolean isEmpty();

    @IntRange(from = ULong.MIN_VALUE)
    int size();

    String toLanguageTags();
}
