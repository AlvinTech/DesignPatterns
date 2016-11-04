package decorator;

/**
 * Created by Alvin on 16/11/4.
 */
public class HeaderDecorator extends Decorator{

    public HeaderDecorator(Component component) {
        super(component);
    }

    public void printHeader(){

        System.out.println("                    Alvin");
        System.out.println("==========================");
    }

    public void print() {
        printHeader();
        super.component.print();
    }
}
