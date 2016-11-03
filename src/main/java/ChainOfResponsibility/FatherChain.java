package ChainOfResponsibility;

import ChainOfResponsibility.traditional.IWomen;

/**
 * Created by Alvin on 16/11/3.
 */
public class FatherChain extends IHandlerChain {

    public FatherChain() {
        super.level = Father_Level;
    }

    public void HandlerRequest(IWomen women) {
            System.out.println("this is father: women type:" + women.getType() );
            System.out.println("The request is :" + women.getRequest());
            System.out.println("Agree");
    }
}
