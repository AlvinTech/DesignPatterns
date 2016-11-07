package iterator;

/**
 * Created by Alvin on 16/11/7.
 */
/*
迭代器模式目前已经是一个没落的模式，基本上没有人会单独写一个迭代器。因为java 提供的
Iterator一般已经能够满足你的需求了。
 */
public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate("First");
        aggregate.add("Second");
        aggregate.add("Third");

        Iterator iterator = aggregate.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}
