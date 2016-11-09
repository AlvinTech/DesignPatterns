package facade;

import org.apache.log4j.Logger;

/**
 * Created by Alvin on 16/11/9.
 */
public class Disk {

    Logger logger = Logger.getLogger(this.getClass());

    public void diskStart(){
        logger.info("disk start");
    }

    public void diskClose(){
        logger.info("disk close");
    }
}
