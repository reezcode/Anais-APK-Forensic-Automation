package androidx.room;

import androidx.annotation.RequiresOptIn;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.TYPE, ElementType.METHOD})
@RequiresOptIn
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes21.dex */
public @interface ExperimentalRoomApi {
}
