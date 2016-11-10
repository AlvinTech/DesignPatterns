package util;

/**
 * Created by Alvin on 16/11/10.
 */
public class PropertyBean {
    private String name;

    private String address;

    private String phone;

    public PropertyBean(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return  this.name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void showInfo(){
        System.out.println(this.getClass().getSimpleName());
        System.out.println("name: " + name);
        System.out.println("address: " + address);
        System.out.println("phone: " + phone);
    }
}
