package FactoryMethod;


import singleton.SingletonLazy;

/**
 * Created by Alvin on 16/10/10.
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Creator factory = new ConcreteCreator();
        Pizze applePizze = factory.getPizze(ApplePizze.class);
        System.out.println(applePizze.teast());

        Pizze pearPizze = factory.getPizze(PearPizze.class);
        System.out.println(pearPizze.teast());

        SingletonLazy instance =  SingletonFactory.getInstance();
        System.out.println(instance.getSingletonDate());

        Pizze pizze1 = PizzeFactory1.createPizze(ApplePizze.class);
        System.out.println(pizze1.teast());
        Pizze pizze2 = PizzeFactory1.createPizze(PearPizze.class);
        System.out.println(pizze2.teast());
        for (int i = 0; i <10 ; i++) {
            pizze1 = PizzeFactory1.createPizze(ApplePizze.class);
            System.out.println(pizze1.teast());
        }
    }
}
