package AbstractFactory;

/**
 * Created by Alvin on 16/10/11.
 */
public class LRDisplayDriver extends DisplayDriver {
    private  String resolution = "LOW Resolution";
    @Override
    public void display() {
        System.out.println(text.replace("${resolution}",resolution));
    }
}
