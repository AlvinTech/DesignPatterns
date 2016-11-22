package flyweight;

/**
 * Created by Alvin on 16/11/21.
 */
public class ClientThread {
    final static  String  key = "subject_2:location_20";

    public static void main(String[] args) {
        Flyweight object = FlyweightFactory.getFlyweight(key);
        while (true){
            Flyweight object1 = FlyweightFactory.getFlyweight(key);
            object1.setId(1);
            object1.setAge(1);
            new MultiThread(object1).start();
            Flyweight object2 = FlyweightFactory.getFlyweight(key);
            object1.setId(100);
            object1.setAge(100);
            new MultiThread(object2).start();
        }


    }

    static class MultiThread extends Thread{
        private Flyweight flyweight;

        public MultiThread(Flyweight flyweight){
            this.flyweight = flyweight;
        }

        public void run(){
            if(flyweight.getAge() != flyweight.getId()){
                System.out.println("=== Thread not safe =====");
                System.out.println(flyweight.getId() +"==" + flyweight.getAge());
            }
        }
    }
}
