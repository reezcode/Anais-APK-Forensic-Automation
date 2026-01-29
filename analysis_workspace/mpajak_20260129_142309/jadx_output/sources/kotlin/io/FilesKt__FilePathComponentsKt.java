package kotlin.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes3.dex */
class FilesKt__FilePathComponentsKt {
    public static final File getRoot(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new File(getRootName(file));
    }

    private static final int getRootLength$FilesKt__FilePathComponentsKt(String str) {
        boolean endsWith$default;
        int h5;
        int h6 = StringsKt.h(str, File.separatorChar, 0, 4);
        if (h6 == 0) {
            if (str.length() > 1) {
                char charAt = str.charAt(1);
                char c5 = File.separatorChar;
                if (charAt == c5 && (h5 = StringsKt.h(str, c5, 2, 4)) >= 0) {
                    int h7 = StringsKt.h(str, File.separatorChar, h5 + 1, 4);
                    return h7 >= 0 ? h7 + 1 : str.length();
                }
            }
            return 1;
        }
        if (h6 > 0 && str.charAt(h6 - 1) == ':') {
            return h6 + 1;
        }
        if (h6 == -1) {
            endsWith$default = StringsKt__StringsKt.endsWith$default((CharSequence) str, ':', false, 2, (Object) null);
            if (endsWith$default) {
                return str.length();
            }
        }
        return 0;
    }

    public static final String getRootName(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "path");
        String path2 = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path2, "path");
        String substring = path.substring(0, getRootLength$FilesKt__FilePathComponentsKt(path2));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final boolean isRooted(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "path");
        return getRootLength$FilesKt__FilePathComponentsKt(path) > 0;
    }

    public static final File subPath(File file, int i5, int i6) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return toComponents(file).subPath(i5, i6);
    }

    public static final FilePathComponents toComponents(File file) {
        List split$default;
        int collectionSizeOrDefault;
        List list;
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "path");
        int rootLength$FilesKt__FilePathComponentsKt = getRootLength$FilesKt__FilePathComponentsKt(path);
        String substring = path.substring(0, rootLength$FilesKt__FilePathComponentsKt);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = path.substring(rootLength$FilesKt__FilePathComponentsKt);
        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
        if (substring2.length() == 0) {
            list = CollectionsKt.emptyList();
        } else {
            split$default = StringsKt__StringsKt.split$default(substring2, new char[]{File.separatorChar}, false, 0, 6, (Object) null);
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(split$default, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator it = split$default.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new FilePathComponents(new File(substring), list);
    }
}
