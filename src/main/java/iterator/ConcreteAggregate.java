package iterator;

import java.util.Vector;

/**
 * Created by Alvin on 16/11/7.
 */
public class ConcreteAggregate implements Aggregate {

    private Vector vector = new Vector();

    public ConcreteAggregate(Object object) {
        vector.add(object);
    }

    public void add(Object object) {
        vector.add(object);
    }

    public void remove(Object object) {
        vector.remove(object);
    }

    public Iterator iterator() {
        return new ConcreteIterator(vector);
    }

}
