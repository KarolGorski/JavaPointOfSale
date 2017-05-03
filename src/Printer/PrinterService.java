
package Printer;

import java.util.List;

/**
 *
 * @author Karol
 */
public class PrinterService {
    PrinterSwing printer;
    
    public PrinterService(){
        printer
                =new PrinterSwing();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
            printer
                    .setVisible(true);}
    });  
}
    public void PrintAll(List<Database.SingleRecord> list,double price){
        
    printer
            .getBill()
            .append("Official Karol Górski's \nshop for IMPAQ\n\n");
    
    for(int i=0;i<list.size();i++)
    printer
            .getBill()
            .append(list.get(i)
                    .getNameOfProduct()
                    +"\n               "
                    +list
                            .get(i)
                            .getPrice()
                    +"\n");
    
    printer
            .getBill()
            .append("SUMA:"
                    +" "+price
                    +"\n");
    }
    
}
