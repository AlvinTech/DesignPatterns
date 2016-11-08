package observer;

/**
 * Created by Alvin on 16/11/8.
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer ob1 = new ConcreteObserver("SMS","+86 158-5817-8699");
        Observer ob2 = new ConcreteObserver("EMAIL","alvalp@live.com");
        subject.addObserver(ob1);
        subject.addObserver(ob2);

        subject.setContent("observer demo!");
        subject.removeObserver(ob1);
        subject.setContent("observer test!");
    }
}
