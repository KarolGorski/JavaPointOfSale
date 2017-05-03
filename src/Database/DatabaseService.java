
package Database;

/**
 *
 * @author Karol
 */
public class DatabaseService {
    private DatabaseMock TheDatabase;
    
    public DatabaseService()
    {
        TheDatabase
                =new DatabaseMock();
        
    }
    
    public boolean checkInDatabase(String barcode, SingleRecord sth)
    {
        if(TheDatabase
                .searchForData(barcode, sth))
            return true;
        else 
            return false;
    }
}
