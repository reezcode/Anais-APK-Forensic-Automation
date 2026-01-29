package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Deprecated;
import kotlin.annotation.AnnotationRetention;

@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
/* loaded from: classes8.dex */
public @interface OnConflictStrategy {
    public static final int ABORT = 3;
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int FAIL = 4;
    public static final int IGNORE = 5;
    public static final int NONE = 0;
    public static final int REPLACE = 1;
    public static final int ROLLBACK = 2;

    /* loaded from: classes21.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int ABORT = 3;
        public static final int FAIL = 4;
        public static final int IGNORE = 5;
        public static final int NONE = 0;
        public static final int REPLACE = 1;
        public static final int ROLLBACK = 2;

        private Companion() {
        }

        @Deprecated(message = "Use ABORT instead.")
        public static /* synthetic */ void getFAIL$annotations() {
        }

        @Deprecated(message = "Use ABORT instead.")
        public static /* synthetic */ void getROLLBACK$annotations() {
        }
    }
}
