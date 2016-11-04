package decorator;

/**
 * Created by Alvin on 16/11/4.
 */

/***
 *  we have use the word as the concreate component
 *  use decorator pattern to add the header and footer for the word
 */
public class Client {
    public static void main(String[] args) {
        Component word = new WordComponent("This is word context......!");
        word = new HeaderDecorator(word);
        word = new FooterDecorator(word);
        word.print();
    }

}
