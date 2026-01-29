package androidx.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;

@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
/* loaded from: classes2.dex */
public @interface VisibleForTesting {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int NONE = 5;
    public static final int PACKAGE_PRIVATE = 3;
    public static final int PRIVATE = 2;
    public static final int PROTECTED = 4;

    /* loaded from: classes7.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int NONE = 5;
        public static final int PACKAGE_PRIVATE = 3;
        public static final int PRIVATE = 2;
        public static final int PROTECTED = 4;

        private Companion() {
        }
    }

    int otherwise() default 2;
}
