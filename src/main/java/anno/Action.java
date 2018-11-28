package anno;

import java.lang.annotation.*;

/**
 * Created by wuxinxin on 2018/11/26.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
