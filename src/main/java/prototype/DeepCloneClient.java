package prototype;

import java.util.Date;

/**
 * Created by Alvin on 16/11/1.
 */
public class DeepCloneClient {
    public static void main(String[] args) {
        FirstObject instance1 = new FirstObject();
        instance1.setFirstName("firstname");
        instance1.setBirthday(new Date());
        instance1.setSecondObject(new SecondObject("secondname"));
        FirstObject instance2 = instance1.clone();
        System.out.println(instance1.getBirthday() == instance2.getBirthday());
        System.out.println(instance1.getSecondObject() == instance2.getSecondObject());

        instance2 = instance1.deepClone();
        System.out.println(instance1.getBirthday() == instance2.getBirthday());
        System.out.println(instance1.getSecondObject() == instance2.getSecondObject());

    }
}
