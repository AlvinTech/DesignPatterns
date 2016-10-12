package AbstractFactory;

/**
 * Created by Alvin on 16/10/11.
 */
public class LRFactory extends AbstractFactory {
    public LRFactory(){
        System.out.println("=================== User LOW Resolution Factory =================");
    }
    @Override
    public DisplayDriver getDisplayDriver() {
        return new LRDisplayDriver();
    }

    @Override
    public PrintDriver getPrintDriver() {
        return new LRPrintDriver();
    }
}
