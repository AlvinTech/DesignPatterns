package interpreter;

/**
 * Created by Alvin on 16/11/18.
 */
public abstract class SymbolExpression extends  Expression{
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
