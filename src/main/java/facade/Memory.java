package facade;

import org.apache.log4j.Logger;

/**
 * Created by Alvin on 16/11/9.
 */
public class Memory {

    Logger logger = Logger.getLogger(this.getClass());

    public void read(){
        logger.info("memory read data.......");
    }

    public void write(){
        logger.info("memory write date.......");
    }
}
