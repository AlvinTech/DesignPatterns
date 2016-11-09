package facade;

/**
 * Created by Alvin on 16/11/9.
 */

/*
* 每个Computer都有CPU、Memory、Disk。在Computer开启和关闭的时候，相应的部件也会开启和关闭，
* 使用外观模式后使用户和部件之间解耦。
* */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();

        System.out.println("======================");


        computer.shutDown();
    }
}
