package mediator.traditional;

/**
 * Created by Alvin on 16/11/1.
 */
public class Purchase {

    public int buyComputer(int number){
        Sale sale = new Sale();
        Stock stock = new Stock();
        int count = number;
        if(sale.getSaleStatus() < 80){
            count = number / 2;
        }
        stock.increase(count);
        return count;
    }

    public void refuseComputer(){
        System.out.println("do not buy computer any more.....");
    }
}
