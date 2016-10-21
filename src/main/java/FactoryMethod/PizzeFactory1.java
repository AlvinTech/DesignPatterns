package FactoryMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alvin on 16/10/13.
 */
public class PizzeFactory1 {
    private  static final Map<String,Pizze> pMap = new HashMap<String,Pizze>();
    public static synchronized Pizze  createPizze(Class clazz) throws Exception {
        if(pMap.containsKey(clazz.getSimpleName())){
            return pMap.get(clazz.getSimpleName());
        }else{
            Pizze pizze = (Pizze) Class.forName(clazz.getName()).newInstance();
            pMap.put(clazz.getSimpleName(),pizze);
            return pizze;
        }
    }
}
