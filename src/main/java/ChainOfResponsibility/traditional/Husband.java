package ChainOfResponsibility.traditional;

/**
 * Created by Alvin on 16/11/3.
 */
public class Husband implements IHandler {
    public void handleRequest(IWomen women) {
        System.out.println("this is hasband: women type:" + women.getType() );
        System.out.println("The request is :" + women.getRequest());
        System.out.println("Agree");
    }
}
