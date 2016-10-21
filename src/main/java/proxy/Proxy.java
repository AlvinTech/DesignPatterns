package proxy;

/**
 * Created by Alvin on 16/10/13.
 */
public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void login() {
        checkPermission();
        subject.login();
        log();
    }

    @Override
    public Subject getProxy() {
        return this;
    }

    private void checkPermission(){
        System.out.println("Proxy Check Access Permission");
    }

    private void log(){
        System.out.println("Proxy Save Login Log ");
    }
}
