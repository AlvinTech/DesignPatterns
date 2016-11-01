package mediator;

import java.util.Random;

/**
 * Created by Alvin on 16/11/1.
 */
public class SaleColleague extends AbstractColleague {
    public SaleColleague(AbstractMediator mediator) {
        super(mediator);
    }

    public void sellComputer(int number) {
        mediator.execute(MediatorOperator.SELL, number);
    }

    public int getSellStatus(){
        Random radom = new Random();
        int score = radom.nextInt(100);
        System.out.println("score : " + score);
        return score;
    }

    public void offSale(int number) {
        System.out.println(this.getClass().getSimpleName() + " sale " + number+" computers.");
    }
}
