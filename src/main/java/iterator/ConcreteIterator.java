package iterator;

import java.util.Vector;

/**
 * Created by Alvin on 16/11/7.
 */
public class ConcreteIterator implements Iterator {

    private Vector vector ;

    private int cursor = 0;

    public ConcreteIterator(Vector vector) {
        this.vector = vector;
    }

    public Object getFirst() {
        if(vector != null && vector.size() >0)
            return vector.get(0);
        else
            return null;
    }

    public boolean hasNext() {
        if(vector == null)
            return false;
        return cursor < vector.size();
    }

    public Object next() {
        if(cursor < vector.size()){
            return vector.get(cursor++);
        }
        else
            return null;
    }
}
