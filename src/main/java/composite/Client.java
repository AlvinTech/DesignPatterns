package composite;

import java.util.List;

/**
 * Created by Alvin on 16/11/7.
 */
/*
* 输出一个公司组织架构图 树型图
*
* */
public class Client {
    public static void main(String[] args) {
        Component root = init();
        display(root);
    }

    private static void display(Component component) {
        if(component == null)
            return;
        System.out.println(component.getInfo());

        if(component instanceof Composite){
            for (Component child : ((Composite)component).getChild()){
               display(child);
            }
        }
    }

    private static Component init() {
        Composite root = new Composite("Alvin","CEO");
        Component secretary = new Leaf("julie","secretary");
        Composite manager = new Composite("jack", "Manager");
        Component develop = new Leaf("tom", "Develop");
        Component ui = new Leaf("Shine","UI");
        root.add(manager);
        root.add(secretary);
        manager.add(develop);
        manager.add(ui);
        return root;
    }
}
