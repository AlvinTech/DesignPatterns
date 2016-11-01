package mediator;

/**
 * Created by Alvin on 16/11/1.
 */
public class PurchaseColleague extends AbstractColleague{
    public PurchaseColleague(AbstractMediator mediator) {
        super(mediator);
    }

    public void buyComputer(int number) {
        mediator.execute(MediatorOperator.BUY, number);
    }

    public void refuseComputer(){
        System.out.println("do not buy computer any more.....");
    }
}
