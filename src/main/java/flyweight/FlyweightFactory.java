package flyweight;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

import java.util.HashMap;

/**
 * Created by Alvin on 16/11/21.
 */
public class FlyweightFactory {

    private static HashMap<String, Flyweight> pool = new HashMap<>();

    private static final Logger logger = Logger.getLogger(FlyweightFactory.class);

    public static Flyweight getFlyweight(String key){
        Flyweight object = pool.get(key);
        if(object == null){
            logger.info("create new object Key: "+ key);
            object = new ConcreteFlyweight(key);
            pool.put(key, object);
        }
        return object;
    }

}
