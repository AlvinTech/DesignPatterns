package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Alvin on 16/10/13.
 */
public class ProxyClient {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        InvocationHandler handler = new LoginProxy(subject);
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Subject proxy = (Subject) Proxy.newProxyInstance(classLoader,new Class[]{Subject.class},handler);
        proxy.login();
    }
}
