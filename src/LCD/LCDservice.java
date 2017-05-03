
package LCD;

import Service.ESCListener;



/**
 *
 * @author Karol
 */
public class LCDservice {
private LCDscreenSwing LCD;

    public LCDservice(Service.ServiceSetup sup){
        LCD
                =new LCDscreenSwing(sup);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
            LCD
                    .setVisible(true);}
    });
        
}
    public void InvalidCode()
    {
    LCD
            .getErrorsField()
            .setText("Invalid barcode");
    }
    
    public void addToOrder(Database.SingleRecord product)
    {
    LCD
            .getOrderList()
            .append(product.toString()+"\n");
    LCD
            .getErrorsField()
            .setText(null);
    }
    
    public void setPrice(double price)
    {
    LCD
            .getPriceArea()
            .setText(Double
                    .toString(price));
    }
    
    public void NoSuchCodeInDatabase()
    {
    LCD
            .getErrorsField()
            .setText("Product Not Found");
   
    }

}
