package AbstractFactory;

/**
 * Created by Alvin on 16/10/11.
 */
public class HRPrintDriver extends PrintDriver {
    private  String resolution = "HIGH Resolution";
    @Override
    public void print() {
        System.out.println(text.replace("${resolution}",resolution));
    }
}
