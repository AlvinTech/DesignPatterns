package proxy;

/**
 * Created by Alvin on 16/10/13.
 */
public class DynamicClient {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxy = DynamicProxy.newProxyInstance(subject);
        proxy.login();
    }
}
