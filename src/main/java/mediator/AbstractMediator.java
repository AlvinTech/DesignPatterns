package mediator;

import lombok.Data;

/**
 * Created by Alvin on 16/11/1.
 */
@Data
abstract class AbstractMediator {

    protected PurchaseColleague purchase;

    protected StockColleague stock;

    protected SaleColleague sale;

    public AbstractMediator(){
        this.purchase = new PurchaseColleague(this);
        this.stock = new StockColleague(this);
        this.sale = new SaleColleague(this);
    }

    abstract void execute(MediatorOperator operator , Object ... objects);
}
