package interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by Alvin on 16/11/18.
 */
public class Caculator {
    private Expression expression;
    public Caculator(String exp) {
        Stack<Expression> stack = new Stack<>();
        char[] chars = exp.toCharArray();
        Expression left = null;
        Expression right= null;
        for(int i =0 ; i < chars.length ;i++){
            if(chars[i] == '+'){
                left = stack.pop();
                right = new VarExpression(String.valueOf(chars[++i]));
                stack.push(new AddSymbolExpression(left,right));

            }else if(chars[i] == '-'){
                left= stack.pop();
                right = new VarExpression(String.valueOf(chars[++i]));
                stack.push(new SubSymbolExpression(left,right));

            }else {
                stack.push(new VarExpression(String.valueOf(chars[i])));
            }
        }
        this.expression = stack.pop();

    }
    public int run(HashMap<String, Integer> var){
        return expression.interpreter(var);
    }
}
