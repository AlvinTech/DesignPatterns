package AbstractFactory;

/**
 * Created by Alvin on 16/10/11.
 */
public class LRPrintDriver extends PrintDriver {
    private  String resolution ="LOW Resolution";
    @Override
    public void print() {
        System.out.println(text.replace("${resolution}",resolution));
    }
}
