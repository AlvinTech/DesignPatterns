package observer;

import java.util.Date;
import java.util.Random;
import java.util.Vector;

/**
 * Created by Alvin on 16/11/8.
 */
public abstract class Subject {

    protected Vector<Observer> observers = new Vector<Observer>();

    private String content;

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    protected void publish(){
        Message message = new Message(new Random().nextInt(100),content,new Date());
        for (Observer observer:observers) {
            observer.update(message);
        }
    }

    protected void setContent(String content){
        this.content = content;
        publish();
    }

}
