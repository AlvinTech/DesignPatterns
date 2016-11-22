package flyweight;

/**
 * Created by Alvin on 16/11/21.
 */
public class Client {
    public static void main(String[] args) {
        for (int i = 0 ; i < 4; i++){
            for (int j = 0 ; j < 30 ; j++){
                String key = "subject_"+ i+ ":location_" + j;
                Flyweight object = FlyweightFactory.getFlyweight(key);
            }
        }
        System.out.println("========================");
        System.out.println("get object form pool");
        String key = "subject_2:location_20";
        Flyweight object = FlyweightFactory.getFlyweight(key);
        System.out.println(object.getSubject()+":" + object.getLocation());
    }
}
