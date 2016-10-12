package Builder;

import java.util.Random;

/**
 * Created by Alvin on 16/10/12.
 */
public class Director {
    private  AbstractBuilder builder;

    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }

    public void contruct(){
        for (int i = 0; i < new Random().nextInt(5); i++) {
            builder.setPartA();
        }
        for (int i = 0; i < new Random().nextInt(5); i++) {
            builder.setPartB();
        }
    }
}
