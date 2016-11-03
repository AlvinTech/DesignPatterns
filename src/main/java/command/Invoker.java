package command;

/**
 * Created by Alvin on 16/11/3.
 */
public class Invoker {
    private  Command command ;

    public Invoker(Command command) {
        this.command = command;
    }

    public void excuteCommand(){
        command.excute();
    }
}
