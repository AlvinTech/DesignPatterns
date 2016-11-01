package mediator;

import mediator.traditional.Purchase;
import mediator.traditional.Sale;

/**
 * Created by Alvin on 16/11/1.
 */
public class MediatorClient {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        PurchaseColleague purchaseColleague = new PurchaseColleague(mediator);
        StockColleague stockColleague = new StockColleague(mediator);
        SaleColleague saleColleague = new SaleColleague(mediator);

        purchaseColleague.buyComputer(6);
        saleColleague.sellComputer(101);
        stockColleague.cleanStock();
    }
}
