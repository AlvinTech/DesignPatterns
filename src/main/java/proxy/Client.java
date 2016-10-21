package proxy;

/**
 * Created by Alvin on 16/10/13.
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxy = new Proxy(subject);
        proxy.login();
    }
}
