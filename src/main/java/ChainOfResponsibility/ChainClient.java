package ChainOfResponsibility;

import ChainOfResponsibility.traditional.IHandler;
import ChainOfResponsibility.traditional.IWomen;
import ChainOfResponsibility.traditional.Women;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Alvin on 16/11/3.
 */
public class ChainClient {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> womens = new ArrayList<IWomen>();
        for (int i = 0; i < 4; i++) {
            womens.add(new Women(random.nextInt(3), "Go shopping....."));
        }

        IHandlerChain father = new FatherChain();
        IHandlerChain husband = new HusbandChain();
        IHandlerChain son = new SonChain();
        husband.setNext(son);
        father.setNext(husband);

        for (IWomen women : womens){
            father.handler(women);
        }
    }
}
