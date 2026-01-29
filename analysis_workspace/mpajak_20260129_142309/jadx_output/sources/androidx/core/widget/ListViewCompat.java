package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes3.dex */
public final class ListViewCompat {

    @RequiresApi(19)
    public static class Api19Impl {
        private Api19Impl() {
        }

        @DoNotInline
        public static boolean canScrollList(ListView listView, int i5) {
            return listView.canScrollList(i5);
        }

        @DoNotInline
        public static void scrollListBy(ListView listView, int i5) {
            listView.scrollListBy(i5);
        }
    }

    private ListViewCompat() {
    }

    public static boolean canScrollList(@NonNull ListView listView, int i5) {
        return Api19Impl.canScrollList(listView, i5);
    }

    public static void scrollListBy(@NonNull ListView listView, int i5) {
        Api19Impl.scrollListBy(listView, i5);
    }
}
