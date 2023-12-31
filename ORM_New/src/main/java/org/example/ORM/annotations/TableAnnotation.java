package org.example.ORM.annotations;
import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TableAnnotation {
    String name() default "";
}
