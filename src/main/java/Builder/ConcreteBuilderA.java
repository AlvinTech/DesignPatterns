package Builder;

/**
 * Created by Alvin on 16/10/12.
 */
public class ConcreteBuilderA  extends AbstractBuilder {
    private ConcreteProductA productA = new ConcreteProductA();


    @Override
    protected void setPartA() {
        productA.setCountA(productA.getCountA()+1);
        System.out.println("add part A, count: " + productA.getCountA() );
    }

    @Override
    protected void setPartB() {
        productA.setCountB(productA.getCountB()+1);
        System.out.println("add part B, count: " + productA.getCountB());
    }

    @Override
    public AbstractProduct getProduct() {
        return productA;
    }
}
