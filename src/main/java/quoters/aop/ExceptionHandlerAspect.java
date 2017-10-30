package quoters.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import quoters.DBRuntimeException;

@Component
@Aspect
public class ExceptionHandlerAspect {

    @Pointcut("execution(* quoters..*.*(..))")
    public void allBusinessMethods(){}



    @AfterThrowing(value = "allBusinessMethods()",throwing = "ex")
    public void handleDBExc(DBRuntimeException ex) {
        System.out.println("sending mails...");
    }

    @Around("allBusinessMethods()")
    public Object handleDBExceptions(ProceedingJoinPoint pjp) throws Throwable {
        try {
            return pjp.proceed();
        } catch (DBRuntimeException ex) {
            System.out.println("sending mails");
            throw ex;

        }
    }
}
