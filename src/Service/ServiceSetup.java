/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Service;

import LCD.LCDservice;
import Scanner.ScannerService;
import Reader.ReadingService;
import java.awt.event.KeyEvent;
/**
 *
 * @author Karol
 */
public class ServiceSetup {
    private LCDservice LCD;
    private ScannerService scanner;
    
    public ServiceSetup()
    {
        LCD = new LCDservice();
        scanner = new ScannerService();
    }
    
    
    
    public void ESCPressed(KeyEvent e)
    {
     int key = e.getKeyCode();   
     
     if (key == KeyEvent.VK_ESCAPE) {
        
        }
    }
}
