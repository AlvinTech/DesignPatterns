package policy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alvin on 16/11/4.
 */
public final class StrategyFactory {


    private static Map<PayType,Strategy> factory  = new HashMap<PayType, Strategy>();

   static {
       factory.put(PayType.BANK, new BankStrategy());
       factory.put(PayType.CARD, new CardStrategy());
       factory.put(PayType.MOBILE,new MobileStrategy());
    }

    public static Strategy getStrategy(PayType payType){
        return factory.get(payType);
    }
}
