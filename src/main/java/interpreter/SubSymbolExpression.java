package interpreter;

import java.util.HashMap;

/**
 * Created by Alvin on 16/11/18.
 */
public class SubSymbolExpression extends SymbolExpression {
    public SubSymbolExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
