package TemplateMethod;

/**
 * Created by Alvin on 16/10/12.
 */
public abstract  class AbstractClass {
    abstract protected void step1();

    abstract protected void step2();

    abstract protected void step3();

    protected boolean isNeedStep2(){
        return true;
    }

    public void templateMethod(){
        step1();
        if(isNeedStep2()) {
            step2();
        }
        step3();
    }
}
