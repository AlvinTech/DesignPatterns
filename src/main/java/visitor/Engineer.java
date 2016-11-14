package visitor;

import lombok.Data;

/**
 * Created by Alvin on 16/11/14.
 */
@Data
public class Engineer extends Employee{

    private String work ;

    public Engineer(String name, int age ,String work, double salary){
        super(name,age,salary);
        this.work = work;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
