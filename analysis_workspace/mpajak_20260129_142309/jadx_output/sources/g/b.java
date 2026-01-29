package g;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import k.b1;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes13.dex */
public @interface b {
    String[] alternateNames() default {};

    boolean deserialize() default true;

    Class<?> deserializeUsing() default Void.class;

    String format() default "";

    boolean jsonDirect() default false;

    String label() default "";

    String name() default "";

    int ordinal() default 0;

    i.b[] parseFeatures() default {};

    boolean serialize() default true;

    Class<?> serializeUsing() default Void.class;

    b1[] serialzeFeatures() default {};

    boolean unwrapped() default false;
}
