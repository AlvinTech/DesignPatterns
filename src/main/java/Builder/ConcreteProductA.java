package Builder;

import lombok.Data;

/**
 * Created by Alvin on 16/10/12.
 */
@Data
public class ConcreteProductA extends AbstractProduct {
    private  int countA , countB;

    @Override
    protected void print() {
        System.out.println("ConcreteProductA has partA: " + countA+" has partB:" + countB);
    }
}
