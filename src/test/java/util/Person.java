package util;

import lombok.Data;

import java.util.Date;

/**
 * Created by Alvin on 16/11/10.
 */
@Data
public class Person {

    private long id;

    private String name;

    private String address;

    private String phone;

    private int age;

    private Date birthday;

    public Person() {
    }

    public Person(long id, String name, String address, String phone, int age, Date birthday) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.age = age;
        this.birthday = birthday;
    }

    public void showInfo(){
        System.out.println(this.getClass().getSimpleName());
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("address: " + address);
        System.out.println("phone: " + phone);
        System.out.println("age: " + age);
        System.out.println("birthday: " + birthday);
    }
}
