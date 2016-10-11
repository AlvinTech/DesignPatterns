package FactoryMethod;

import java.util.Random;

/**
 * Created by Alvin on 16/10/10.
 */
public class PearPizze implements Pizze {

    int random = new Random().nextInt(1000);
    @Override
    public String teast() {
        return "Pear Pizze" + random;
    }
}
