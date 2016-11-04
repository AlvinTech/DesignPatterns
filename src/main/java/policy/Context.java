package policy;

/**
 * Created by Alvin on 16/11/4.
 */
public class Context {
    private Strategy strategy;

    public Context(PayType payType) {
        strategy =  StrategyFactory.getStrategy(payType);
    }

    public double calculatePrice(double price){
        return strategy.calculate(price);
    }
}
