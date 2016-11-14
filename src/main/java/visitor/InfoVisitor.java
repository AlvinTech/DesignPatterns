package visitor;

/**
 * Created by Alvin on 16/11/14.
 */
public class InfoVisitor implements Visitor{

    @Override public void visit(Engineer engineer) {
        System.out.println("name:"+ engineer.getName() + " age:" + engineer.getAge());
        System.out.println("work: " + engineer.getWork());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("name:"+ manager.getName() + " age:" + manager.getAge());
        System.out.println("schedule: " + manager.getSchedule());
    }
}
