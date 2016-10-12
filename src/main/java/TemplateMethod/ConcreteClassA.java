package TemplateMethod;

/**
 * Created by Alvin on 16/10/12.
 */
public class ConcreteClassA extends AbstractClass {
    @Override
    protected void step1() {
        System.out.println(this.getClass().getName() + " step1");
    }

    @Override
    protected void step2() {
        System.out.println(this.getClass().getName() + " step2");
    }

    @Override
    protected void step3() {
        System.out.println(this.getClass().getName() + " step3");
    }

    public ConcreteClassA() {
        System.out.println("============ " + this.getClass().getSimpleName() +" ===========");
    }
}
