/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LCD;

import Service.ESCListener;



/**
 *
 * @author Karol
 */
public class LCDservice {
private LCDscreenSwing LCD;

    public LCDservice(Service.ServiceSetup sup){
        LCD =new LCDscreenSwing();
            LCD.addKeyListener(new ESCListener(sup));
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
            LCD.setVisible(true);}
    });
        
}
    public void InvalidCode()
    {
        LCD.getErrorsField().setText("Invalid barcode");
    }
    public void addToOrder(Database.SingleRecord product)
    {
    LCD.getOrderList().append(product.toString());
    LCD.getErrorsField().setText(null);
    }
    public void setPrice(double price)
    {
    LCD.getPriceArea().setText(Double.toString(price));
    }
    public void NoSuchCodeInDatabase()
    {
    LCD.getErrorsField().setText("Product Not Found");
   
    }
}
