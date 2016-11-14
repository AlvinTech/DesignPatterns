package visitor;

import lombok.Data;

/**
 * Created by Alvin on 16/11/14.
 */
@Data
public class Manager extends Employee{

    //the schedule of the plan
    private int schedule;

    public Manager(String name, int age, int schedule, double salary) {
        super(name,age,salary);
        this.schedule = schedule;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
