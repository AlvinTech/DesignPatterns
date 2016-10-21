package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Alvin on 16/10/13.
 */
public class DynamicProxy{
    public static<T> T newProxyInstance(T object){
        ClassLoader classLoader = object.getClass().getClassLoader();
        Class<?>[] classes = object.getClass().getInterfaces();
        InvocationHandler handler = new LoginProxy(object);
        return (T) Proxy.newProxyInstance(classLoader,classes,handler);
    }

}
