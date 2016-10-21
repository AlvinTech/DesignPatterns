package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Alvin on 16/10/13.
 */
public class LoginProxy implements InvocationHandler {

    private Object obj = null;

    public LoginProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Proxy....");
        Object result = method.invoke(this.obj,args);
        return result;
    }
}
