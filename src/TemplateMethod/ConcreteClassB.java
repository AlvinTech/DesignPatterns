package TemplateMethod;

/**
 * Created by Alvin on 16/10/12.
 */
public class ConcreteClassB  extends AbstractClass{
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

    @Override
    protected boolean isNeedStep2(){
        return false;
    }

    public ConcreteClassB() {
        System.out.println("============ " + this.getClass().getSimpleName() +" do not need step2 ===========");
    }
}
