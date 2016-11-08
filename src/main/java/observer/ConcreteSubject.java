package observer;

/**
 * Created by Alvin on 16/11/8.
 */
public class ConcreteSubject extends Subject {

    @Override
    public void setContent(String content){
        System.out.println("=======  new message need to be send ======");
        super.setContent(content);
        System.out.println("======  have published to all observers ========");
    }
}
