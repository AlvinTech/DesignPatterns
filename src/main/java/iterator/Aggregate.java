package iterator;

/**
 * Created by Alvin on 16/11/7.
 */
public interface Aggregate {

    void add(Object object);

    void remove(Object object);

    Iterator iterator();
}
