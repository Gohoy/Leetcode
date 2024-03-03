package test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DebugInvocationHandler implements InvocationHandler {
    private final Object target;

    public DebugInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("before Method"+ method.getName());
        Object result = method.invoke(target, objects);
        System.out.println("after Method"+ method.getName());
        return result;
    }
}
