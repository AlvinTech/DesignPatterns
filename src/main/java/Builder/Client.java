package Builder;

/**
 * Created by Alvin on 16/10/12.
 */
public class Client {
    public static void main(String[] args) {
        AbstractBuilder builder = new ConcreteBuilderA();
        Director director = new Director(builder);
        director.contruct();
        AbstractProduct product = builder.getProduct();
        product.print();
    }
}
