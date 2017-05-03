
package Service;

import LCD.LCDservice;
import Reader.ReadingService;
import Database.DatabaseService;

/**
 *
 * @author Karol
 */
public class ServiceSetup{
    private LCDservice LCD;
    private ReadingService reader;
    private DatabaseService database;

   
    private RunningServiceDataAndMethods Run;

    public ServiceSetup()
    {
        database
                =new DatabaseService();
        LCD 
                = new LCDservice(this);
        Run
                =new RunningServiceDataAndMethods(this);
        reader 
                = new ReadingService(this);
        

    }

    public void timeToStop(){
        new ServiceFinish(this);
    }
    
      public LCDservice getLCD() {
        return LCD;
    }
      public DatabaseService getDatabase() {
        return database;
    }
    public RunningServiceDataAndMethods getRun() {
        return Run;
    }
   
}
