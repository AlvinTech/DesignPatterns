package visitor;

/**
 * Created by Alvin on 16/11/14.
 */
public interface Visitor {

    void visit(Engineer engineer);

    void visit(Manager manager);

}
