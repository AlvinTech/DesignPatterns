package TemplateMethod;

/**
 * Created by Alvin on 16/10/12.
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass abstractClass = null;
        abstractClass = new ConcreteClassA();
        abstractClass.templateMethod();
        abstractClass = new ConcreteClassB();
        abstractClass.templateMethod();
    }
}
