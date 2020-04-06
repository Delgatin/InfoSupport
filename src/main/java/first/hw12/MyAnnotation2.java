package first.hw12;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({TYPE, METHOD, FIELD})
@Retention(CLASS)
public @interface MyAnnotation2 {
    String value() default "Hello2";
}