package ChainOfResponsibility;

import ChainOfResponsibility.traditional.IWomen;

/**
 * Created by Alvin on 16/11/3.
 */
public abstract class IHandlerChain {

    protected int Father_Level = 0;
    protected int Husband_Level = 1;
    protected int Son_Level = 2;


    protected  int level ;

    protected IHandlerChain next;

    protected boolean haveNext = false;

    public void handler(IWomen women){
        if(women.getType() == this.level){
            this.HandlerRequest(women);
        }else if(haveNext){
            this.next.handler(women);
        }else{
            System.out.println(women.getType());
            System.out.println("nobody can handler this request......");
        }
    }
    public abstract void HandlerRequest(IWomen women);

    public void setNext(IHandlerChain next){
        this.next = next;
        haveNext = true;
    }

}
