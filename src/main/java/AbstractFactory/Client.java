package AbstractFactory;

/**
 * Created by Alvin on 16/10/11.
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = null;
        DisplayDriver displayDriver = null;
        PrintDriver printDriver = null;
        factory = new LRFactory();
        displayDriver = factory.getDisplayDriver();
        printDriver = factory.getPrintDriver();
        displayDriver.display();
        printDriver.print();

        factory = new HRFacoty();
        displayDriver = factory.getDisplayDriver();
        printDriver = factory.getPrintDriver();
        displayDriver.display();
        printDriver.print();
    }
}
