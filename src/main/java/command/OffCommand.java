package command;

/**
 * Created by Alvin on 16/11/3.
 */
public class OffCommand implements Command {
    public void excute() {
        receiver.turnOff();
    }
}
