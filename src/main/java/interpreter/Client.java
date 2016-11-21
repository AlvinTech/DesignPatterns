package interpreter;

import java.util.HashMap;

/**
 * Created by Alvin on 16/11/18.
 */
public class Client {
    public static void main(String[] args) {
        String exp = "a+b+c";
        HashMap<String, Integer> var = initMap();
        Caculator caculator = new Caculator(exp);
        System.out.println(caculator.run(var));
    }

    private static HashMap<String,Integer> initMap() {
        HashMap<String, Integer> var = new HashMap<>();
        var.put("a",10);
        var.put("b",20);
        var.put("c",30);
        return var;
    }
}
