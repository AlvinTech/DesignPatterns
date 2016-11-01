package mediator;

import lombok.Data;

/**
 * Created by Alvin on 16/11/1.
 */
@Data
public class StockColleague extends AbstractColleague {

    private static int COMPUTER_NUMBER = 0;

    public StockColleague(AbstractMediator mediator) {
        super(mediator);
    }

    public void increase(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
    }

    public void decrease(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
    }

    public void cleanStock(){
        mediator.execute(MediatorOperator.CLEAN);
    }

    public int getComputerNumber(){
        return COMPUTER_NUMBER;
    }

}
