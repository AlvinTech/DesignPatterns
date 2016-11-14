package visitor;

/**
 * Created by Alvin on 16/11/13.
 */
public class Client {
    public static void main(String[] args) {
        Visitor visitor = new InfoVisitor();
        for (Employee employee : ObjectStructure.init()){
            employee.accept(visitor);
        }

        System.out.println("=================");
        visitor = new SalaryVisitor();
        for (Employee employee : ObjectStructure.init()){
            employee.accept(visitor);
        }
    }
}
