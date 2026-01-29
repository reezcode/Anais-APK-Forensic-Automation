package g;

import f.m;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import k.b1;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes22.dex */
public @interface d {
    boolean alphabetic() default true;

    boolean asm() default true;

    Class<?> builder() default Void.class;

    Class<?> deserializer() default Void.class;

    String[] ignores() default {};

    String[] includes() default {};

    Class<?> mappingTo() default Void.class;

    m naming() default m.CamelCase;

    String[] orders() default {};

    i.b[] parseFeatures() default {};

    Class<?>[] seeAlso() default {};

    boolean serializeEnumAsJavaBean() default false;

    Class<?> serializer() default Void.class;

    b1[] serialzeFeatures() default {};

    String typeKey() default "";

    String typeName() default "";
}
