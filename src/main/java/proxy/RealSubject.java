package proxy;

/**
 * Created by Alvin on 16/10/13.
 */
public class RealSubject implements Subject{
    private  Subject proxy;
    @Override
    public void login() {
//        if(!isProxy()){
//            System.out.println("Need Proxy....");
//            return ;
//        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("login to the system.");
    }

    @Override
    public Subject getProxy() {
        if(proxy == null){
            this.proxy = new Proxy(this);
        }
        return this.proxy;
    }

    private boolean isProxy(){
        if(this.proxy == null)
            return false;
        else
            return true;
    }
}
