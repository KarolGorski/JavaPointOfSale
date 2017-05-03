
package Database;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Karol
 */
public class DatabaseMock {
    private List <SingleRecord> listOfProducts;

    public DatabaseMock() {
        listOfProducts  
                = new ArrayList<SingleRecord>();
        //Few hardcoded products for test purposes
        listOfProducts
                .add(new SingleRecord("1","Butter",5.0));
        listOfProducts
                .add(new SingleRecord("12312","Bread",3.5));
        listOfProducts
                .add(new SingleRecord("2135","Orange Juice",6.0));
        listOfProducts
                .add(new SingleRecord("5321","Sausage",6.0));
        
    }
    public boolean searchForData(String code, SingleRecord record)
    {
        for(int i=0;i<listOfProducts.size();i++)
            if(listOfProducts.get(i)
                    .getBarcode()
                    .equals(code))
                {
                record.setValues(listOfProducts.get(i));
                
                return true;
                }
        return false;             
    }
}
