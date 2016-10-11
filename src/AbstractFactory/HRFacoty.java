package AbstractFactory;

/**
 * Created by Alvin on 16/10/11.
 */
public class HRFacoty extends AbstractFactory {

    public HRFacoty(){
        System.out.println("================= User HIGH Resolution Factory=================== ");
    }

    @Override
    public DisplayDriver getDisplayDriver() {
        return  new HRDisplayDriver();
    }

    @Override
    public PrintDriver getPrintDriver() {
        return new HRPrintDriver();
    }
}
