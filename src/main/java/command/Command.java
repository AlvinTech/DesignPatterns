package command;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by Alvin on 16/11/3.
 */
public interface Command {
    Receiver  receiver = new Receiver();
    void excute();
}
