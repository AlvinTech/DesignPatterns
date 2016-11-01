package mediator.traditional;

import java.io.PushbackInputStream;
import java.util.Random;

/**
 * Created by Alvin on 16/11/1.
 */
public class Sale {

    public void sellComputer(int number){
        Stock stock = new Stock();
        Purchase purchase = new Purchase();
        while(stock.getStockNumber() < number){
            purchase.buyComputer(number);
        }
        System.out.println("sell "+ number +" computers.");
        stock.decrease(number);
    }

    public int getSaleStatus(){
        Random random = new Random();
        int score = random.nextInt(100);
        System.out.println("the score of the sell is " + score);
        return  score;
    }

    public void offSale(){
        Stock stock = new Stock();
        System.out.println("sell "+ stock.getStockNumber()/2 + "computers in 20% discount.");
    }

}
