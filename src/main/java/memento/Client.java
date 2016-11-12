package memento;

/**
 * Created by Alvin on 16/11/10.
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        Originator originator = new Originator(1,"alvin","alvalp@live.com");
        Caretaker caretaker = new Caretaker();
        long time1 = System.currentTimeMillis();
        caretaker.createMemento(time1,originator.createMemonto());

        System.out.println("========================");
        System.out.println(time1);
        System.out.println(originator);

        Thread.sleep(1000);
        originator.setEmail("alvalp@live.cn");
        long time2 = System.currentTimeMillis();
        caretaker.createMemento(time2, originator.createMemonto());

        System.out.println("========================");
        System.out.println(time2);
        System.out.println(originator);

        Thread.sleep(1000);
        originator.setName("pengli");
        long time3 = System.currentTimeMillis();
        caretaker.createMemento(time3, originator.createMemonto());
        System.out.println("========================");
        System.out.println(time3);
        System.out.println(originator);

        Thread.sleep(1000);
        originator.setId(101);
        long time4 = System.currentTimeMillis();
        caretaker.createMemento(time4, originator.createMemonto());
        System.out.println("========================");
        System.out.println(time4);
        System.out.println(originator);

        Thread.sleep(1000);
        originator.setId(109);
        long time5 = System.currentTimeMillis();
        caretaker.createMemento(time5, originator.createMemonto());
        System.out.println("========================");
        System.out.println(time5);
        System.out.println(originator);

        originator.restoreMemonto(caretaker.restoreMemento(time1));
        System.out.println("===========  reset to record 1===========");
        System.out.println(time1);
        System.out.println(originator);

        originator.restoreMemonto(caretaker.restoreMemento());
        System.out.println("============= reset to last record ===========");
        System.out.println(originator);


    }
}
