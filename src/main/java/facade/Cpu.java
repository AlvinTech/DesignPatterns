package facade;

import org.apache.log4j.Logger;

/**
 * Created by Alvin on 16/11/9.
 */
public class Cpu {

    Logger logger = Logger.getLogger(this.getClass());
    public void cpuStart(){
        logger.info("cup start.");
    }

    public void cpuClose(){
        logger.info("cpu shut down.");
    }
}
