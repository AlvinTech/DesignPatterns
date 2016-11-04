package decorator;

/**
 * Created by Alvin on 16/11/4.
 */
public class WordComponent  implements  Component{
    private String context ;

    public WordComponent(String context) {
        this.context = context;
    }


    public void print() {
        for (int i = 0; i < 6; i++) {
            System.out.println(context);
        }
    }
}
