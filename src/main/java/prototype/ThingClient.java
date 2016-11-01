package prototype;

/**
 * Created by Alvin on 16/10/30.
 */
public class ThingClient {
    public static void main(String[] args) {
        Thing instance = new Thing();
        // clone will not run the construction function.
        Thing instance2 = instance.clone();


        long start = System.currentTimeMillis();
        for (int i =0 ; i < 100000; i++){
            instance2 = new Thing();
        }
        long end = System.currentTimeMillis();
        System.out.println("time " + (end-start));

        start = System.currentTimeMillis();
        for (int i =0 ; i < 100000; i++){
            instance2 = instance.clone();
        }
         end = System.currentTimeMillis();
        System.out.println("time " + (end-start));

    }
}
