package memento;

import lombok.Data;
import util.BeanUtils;

import java.util.HashMap;

/**
 * Created by Alvin on 16/11/10.
 */
@Data
public class Originator {

    private int id;

    private String name;

    private String email;

    public Originator(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }


    public IMemento createMemonto(){
        return new Memento(BeanUtils.buckupProp(this));
    }

    public void restoreMemonto(IMemento memento){
        BeanUtils.restoreProp(this,((Memento)memento).getStatus());
    }

    @Override
    public String toString(){
        return "id: " + id +" name:" +name + " email:" +email;
    }


    @Data
    private class Memento implements IMemento{
        HashMap<String, Object> status = new HashMap<String, Object>();

        public Memento(HashMap<String, Object> values) {
            this.status = values;
        }

        public void setStatus(HashMap status){
            this.status = status;
        }

        public HashMap getStatus(){
            return this.status;
        }
    }
}
