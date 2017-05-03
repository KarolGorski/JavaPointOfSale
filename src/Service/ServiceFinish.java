
package Service;


import Printer.PrinterService;

/**
 *
 * @author Karol
 */
public class ServiceFinish {
    
    PrinterService printer;
    RunningServiceDataAndMethods Run;
    
    public ServiceFinish(ServiceSetup sup){
        
    this.Run
            =sup.getRun();
    printer
            =new PrinterService();

    printer
            .PrintAll(
                    Run.getList(),
                    Run.getPrice());
    }
    
}
