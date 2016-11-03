package command;

/**
 * Created by Alvin on 16/11/3.
 */
public class Client {
    public static void main(String[] args) {
        Command command = new OnCommand();
        Invoker invoker = new Invoker(command);
        invoker.excuteCommand();

        invoker = new Invoker(new ChangeCommand(10));
        invoker.excuteCommand();

        invoker = new Invoker(new OffCommand());
        invoker.excuteCommand();
    }
}
