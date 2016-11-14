package visitor;

/**
 * Created by Alvin on 16/11/14.
 */
public class SalaryVisitor implements Visitor{

    @Override
    public void visit(Engineer engineer) {
        System.out.println("name:"+ engineer.getName() + " age:" + engineer.getAge());
        System.out.println("Salary: "+ engineer.getSalary());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("name:"+ manager.getName() + " age:" + manager.getAge());
        System.out.println("Base Salary: "+ manager.getSalary() + " Bonus : " + manager.getSalary()* 1.5 * manager.getSchedule()/100);
    }
}
