package visitor;

import lombok.Data;

/**
 * Created by Alvin on 16/11/14.
 */
@Data
public abstract class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public abstract void accept(Visitor visitor);
}
