package bridge;

/**
 * Created by Alvin on 16/11/22.
 */
public class Client {
    public static void main(String[] args) {
        Transport object = new Guest();
        Vehicle train = new Train(object);
        train.transport();

        object = new Goods();
        train = new Train(object);
        train.transport();
    }
}
