
package Service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Karol
 */
public class RunningServiceDataAndMethods{
    private List<Database.SingleRecord> myList;
    private double sumPrice;
    private ServiceSetup sup;
    
    public RunningServiceDataAndMethods(ServiceSetup service){
        
     this.sup
             =service;
     myList
             =new ArrayList<Database.SingleRecord>();
     sumPrice
             =0;
    }
    public void AddToList(Database.SingleRecord record){
        
        myList
                .add(record);
        sup
                .getLCD()
                .addToOrder(record);
        sup
                .getLCD()
                .setPrice(sumPrice
                            =sumPrice
                                +record.getPrice());
    }
    public List<Database.SingleRecord> getList()
    {
        return myList;
    }
    public double getPrice()
    {
        return sumPrice;
    }
}
