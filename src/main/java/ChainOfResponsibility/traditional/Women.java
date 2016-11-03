package ChainOfResponsibility.traditional;

/**
 * Created by Alvin on 16/11/3.
 */
public class Women implements IWomen {

    //1 未嫁， 2 出嫁，3 父死
    int type;

    private String request ;

    public Women(int type , String request) {
        this.type = type;
        this.request = request;
    }

    public int getType() {
        return type;
    }

    public String getRequest() {
        return request;
    }
}
