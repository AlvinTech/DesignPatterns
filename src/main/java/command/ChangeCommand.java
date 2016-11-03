package command;

/**
 * Created by Alvin on 16/11/3.
 */
public class ChangeCommand implements  Command{
    private int chanel ;

    public ChangeCommand(int chanel) {
        this.chanel = chanel;
    }

    public void excute() {
        receiver.change(chanel);
    }
}
