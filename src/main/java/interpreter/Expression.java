package interpreter;

import java.util.HashMap;

/**
 * Created by Alvin on 16/11/18.
 */
public abstract class Expression {
    public abstract int interpreter(HashMap<String,Integer> var);
}
