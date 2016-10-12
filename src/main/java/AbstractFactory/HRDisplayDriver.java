package AbstractFactory;

/**
 * Created by Alvin on 16/10/11.
 */
public class HRDisplayDriver extends DisplayDriver {
    private String resolution = "HIGH Resolution";
    @Override
    public void display() {
        System.out.println(text.replace("${resolution}",resolution));
    }
}
