package command;

/**
 * Created by Alvin on 16/11/3.
 */
public class OnCommand implements Command {
    public void excute() {
        receiver.turnOn();
    }
}
