package interpreter;

import java.util.HashMap;

/**
 * Created by Alvin on 16/11/18.
 */
public class VarExpression extends Expression {
    private String key ;
    public VarExpression(String key) {
        this.key = key;
    }

    @Override public int interpreter(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
