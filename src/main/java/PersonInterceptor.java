package springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PersonInterceptor {

    @Before("execution(* springaop.Person.getName())")
    public void before(JoinPoint joinpoint) {
        System.out.println("Person.getName() Invoked!");
    }
}
