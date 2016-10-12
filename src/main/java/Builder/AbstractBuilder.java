package Builder;

/**
 * Created by Alvin on 16/10/12.
 */
public abstract class AbstractBuilder {
    abstract protected  void setPartA();
    abstract protected  void setPartB();
    abstract  public AbstractProduct getProduct();
}
