package prototype;

/**
 * Created by Alvin on 16/10/31.
 */
public class ArrayThingClient {
    public static void main(String[] args) {
        ArrayThing instance = new ArrayThing();
        ArrayThing instance2 = instance.clone();
        instance.add("value1");
        instance2.add("value2");
        instance.println();
        instance2.println();
    }
}
