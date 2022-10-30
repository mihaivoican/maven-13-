import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)     //ca sa fie valida si la runtime ac adnotare
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})      //pe ce se poate folosi adnotarea
public @interface MyFirstAnnotation {
    boolean flag() default false;
}
