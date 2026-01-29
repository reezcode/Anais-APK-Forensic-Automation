package v2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes9.dex */
public @interface h {
    String columnName() default "";

    boolean eager() default false;

    @Deprecated
    String foreignColumnName() default "";

    String foreignFieldName() default "";

    @Deprecated
    int maxEagerForeignCollectionLevel() default 1;

    int maxEagerLevel() default 1;

    boolean orderAscending() default true;

    String orderColumnName() default "";
}
