package facade;

import org.apache.log4j.Logger;

/**
 * Created by Alvin on 16/11/9.
 */
public class Computer {

    Logger logger  = Logger.getLogger(this.getClass());

    Cpu cpu;
    Memory memory;
    Disk disk;

    public Computer() {
        this.cpu = new Cpu();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    public void start(){
        logger.info("start computer");
        cpu.cpuStart();
        disk.diskStart();
        memory.read();
        memory.write();

    }

    public void shutDown(){
        memory.read();
        memory.write();
        disk.diskClose();
        cpu.cpuClose();
        logger.info("shut dowm computer");
    }
}
