
package Reader;

import Database.SingleRecord;

/**
 *
 * @author Karol
 */
public class ReadingService {
    Scanner.ScannerService scanner;
    Database.DatabaseService database;
    LCD.LCDservice LCD;
    Service.RunningServiceDataAndMethods Run;
    Service.ServiceSetup sup;
    
    public ReadingService(Service.ServiceSetup sup)
    {
        this.sup
                =sup;
        this.LCD
                =sup
                        .getLCD();
        database
                =sup
                        .getDatabase();
        this.Run
                =sup
                        .getRun();
        scanner
                =new Scanner
                        .ScannerService(this);
        
    }
    
    public void checkTheBarcode(String barcode)
    {
    SingleRecord product 
            = new SingleRecord(null,null,0);
    
    if(barcode.equals("exit")) 
        sup.timeToStop();
    
    else if(barcode.isEmpty()) 
        LCD.InvalidCode();
    
    else if(database.checkInDatabase(barcode, product))
        Run.AddToList(product);
    
    else 
        LCD.NoSuchCodeInDatabase();
    
    }
    
}
