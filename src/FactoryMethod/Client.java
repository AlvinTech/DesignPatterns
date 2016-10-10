package FactoryMethod;

/**
 * Created by Alvin on 16/10/10.
 */
public class Client {
    public static void main(String[] args) {
        Creator factory = new ConcreteCreator();
        Pizze applePizze = factory.getPizze(ApplePizze.class);
        System.out.println(applePizze.teast());

        Pizze pearPizze = factory.getPizze(PearPizze.class);
        System.out.println(pearPizze.teast());
    }
}
