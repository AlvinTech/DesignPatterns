package mediator;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.awt.peer.SystemTrayPeer;

import static mediator.MediatorOperator.*;

/**
 * Created by Alvin on 16/11/1.
 */
public class Mediator extends AbstractMediator {
    void execute(MediatorOperator value, Object... objects) {
        switch (value) {
        case CLEAN:
            cleanStock();
            break;
        case SELL:
            sellComputer((Integer)objects[0]);
            break;
        case BUY:
            buyComputer((Integer)objects[0]);
            break;
        }

    }

    private void buyComputer(int number){
        System.out.println("=====================");
        int count = number;
        if(sale.getSellStatus() < 80)
            count = number/2;
        stock.increase(count);
        System.out.println("Stock: " + stock.getComputerNumber());
    }

    private void cleanStock(){
        System.out.println("=====================");
        sale.offSale(stock.getComputerNumber());
        purchase.refuseComputer();
    }

    private void sellComputer(int number){
        System.out.println("=====================");
        while(number > stock.getComputerNumber()){
            purchase.buyComputer(number);
        }
        stock.decrease(number);
    }
}
