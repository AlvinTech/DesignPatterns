package ChainOfResponsibility.traditional;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Alvin on 16/11/3.
 */
public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> womens = new ArrayList<IWomen>();
        for (int i = 0; i < 4; i++) {
            womens.add(new Women(random.nextInt(3),"Go shopping....."));
        }
        IHandler father = new Father();
        IHandler son = new Son();
        IHandler husband = new Husband();

        for (IWomen women : womens) {
            switch (women.getType()){
            case 0:
                father.handleRequest(women);
                break;
            case 1:
                husband.handleRequest(women);
                break;
            case 2:
                son.handleRequest(women);
                break;
            default:
                System.out.println(women.getType());
            }
        }
    }
}
