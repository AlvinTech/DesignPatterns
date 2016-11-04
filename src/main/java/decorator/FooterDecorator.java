package decorator;

import java.util.Date;

/**
 * Created by Alvin on 16/11/4.
 */
public class FooterDecorator  extends Decorator{


    public FooterDecorator(Component component) {
        super(component);
    }

    public void printFooter(){
        Date date = new Date();
        System.out.println("==========================");
        System.out.println(date);
    }


    public void print() {
        super.component.print();
        printFooter();
    }
}
