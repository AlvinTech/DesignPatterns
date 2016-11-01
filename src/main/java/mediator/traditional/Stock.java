package mediator.traditional;

/**
 * Created by Alvin on 16/11/1.
 */
public class Stock {

    // we have 100 computers already.
    private static int COMPUTER_NUMBER = 100;

    //put new computer to storehouse
    public void increase(int number){
        COMPUTER_NUMBER += number;
    }

    //remove some computer from the storehouse
    public void decrease(int number){
        COMPUTER_NUMBER -= number;
    }

    // return the number of computer in the storehouse
    public int getStockNumber(){
        return COMPUTER_NUMBER;
    }

    // need to sale more computer in discount price
    public void clearStock(){
        Purchase  purchase = new Purchase();
        Sale sale = new Sale();
        System.out.println("need to sale " + COMPUTER_NUMBER/2 + " computers in discount price....");
        sale.offSale();
        purchase.refuseComputer();
    }
}
