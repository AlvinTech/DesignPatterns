package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alvin on 16/11/7.
 */
public class Composite extends Component{

    private List<Component> list = new ArrayList<Component>();

    public Composite(String name, String postion) {
        super(name, postion);
    }

    public void add(Component component){
        list.add(component);
    }

    public void remove(Component component){
        list.remove(component);
    }

    public List<Component> getChild(){
        return list;
    }
}
