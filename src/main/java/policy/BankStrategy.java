package policy;

/**
 * Created by Alvin on 16/11/4.
 */
public class BankStrategy implements Strategy {

    public double calculate(double price) {
        return price * 0.85;
    }
}
