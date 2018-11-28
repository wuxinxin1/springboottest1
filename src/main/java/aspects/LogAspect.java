package aspects;

import anno.Action;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by wuxinxin on 2018/11/26.
 */
@Aspect
@Component
@EnableAspectJAutoProxy
public class LogAspect {
    @Pointcut("execution(* service.DemoAnnotationService.*(..))")
    public void annotationPointCut(){}

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();

        Method method = signature.getMethod();

        Action annotation = method.getAnnotation(Action.class);

        System.out.println("拦截:"+annotation.name());

    }


    @Before("execution(* service.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();

        Method method = signature.getMethod();

        System.out.println("拦截:"+method.getName());
    }
}
