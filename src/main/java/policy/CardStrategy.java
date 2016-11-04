package policy;

/**
 * Created by Alvin on 16/11/4.
 */
public class CardStrategy  implements Strategy{
    public double calculate(double price) {
        return price + price * 0.1;
    }
}
