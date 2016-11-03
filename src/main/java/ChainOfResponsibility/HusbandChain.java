package ChainOfResponsibility;

import ChainOfResponsibility.traditional.IWomen;

/**
 * Created by Alvin on 16/11/3.
 */
public class HusbandChain extends IHandlerChain {

    public HusbandChain() {
        level = Husband_Level;
    }

    public void HandlerRequest(IWomen women) {
        System.out.println("this is hasband: women type:" + women.getType() );
        System.out.println("The request is :" + women.getRequest());
        System.out.println("Agree");
    }
}
