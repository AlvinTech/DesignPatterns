package FactoryMethod;

import java.util.Random;

/**
 * Created by Alvin on 16/10/10.
 */
public class ApplePizze implements Pizze {
    int random = new Random().nextInt(1000);

    @Override
    public String teast() {
        return "Apple Pizze" + random;
    }
}
