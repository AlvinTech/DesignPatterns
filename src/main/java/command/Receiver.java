package command;

/**
 * Created by Alvin on 16/11/3.
 */
public class Receiver {
    private static int chanel = 0;
    public void turnOn(){
        System.out.println("turn on TV ,on chanel " + this.chanel);
    }

    public void turnOff(){
        System.out.println("turn on TV, on chanel "+ this.chanel);
    }


    public void change(int chanel){
        System.out.println("Change chanel from "+ this.chanel +" to "+ chanel);
        this.chanel = chanel;
    }
}
