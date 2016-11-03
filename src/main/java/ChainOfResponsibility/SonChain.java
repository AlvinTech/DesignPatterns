package ChainOfResponsibility;

import ChainOfResponsibility.traditional.IWomen;

/**
 * Created by Alvin on 16/11/3.
 */
public class SonChain extends IHandlerChain {

    public SonChain() {
        super.level = Son_Level;
    }

    public void HandlerRequest(IWomen women) {
        System.out.println("this is Son: women type:" + women.getType() );
        System.out.println("The request is :" + women.getRequest());
        System.out.println("Agree");
    }
}
