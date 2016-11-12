package memento;

import java.util.HashMap;

/**
 * Created by Alvin on 16/11/12.
 */
public class Caretaker {

    private HashMap<Long, IMemento> mementos = new HashMap<Long, IMemento>();

    private final static int SIZE = 3;

    public void createMemento(long time, IMemento memento){
        if(mementos.size()> SIZE){
            System.out.println("Capacity Limit.");
            return;
        }
        mementos.put(time, memento);
    }

    public IMemento restoreMemento(long time){
        return mementos.get(time);
    }


    public IMemento restoreMemento(){
        IMemento memento = null;
        long last = 0;
        boolean isFirst = true;
        for (long key : mementos.keySet()){
            if(isFirst){
                memento = mementos.get(key);
                last = key;
                isFirst = false;
            }else{
                if(key > last){
                    memento = mementos.get(key);
                    last = key;
                }
            }
        }
        return memento;
    }
}
