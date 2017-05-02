/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Karol
 */
public class ESCListener implements KeyListener {
 ServiceSetup sup;
    public ESCListener(ServiceSetup sup) {
        this.sup=sup;
        }

    @Override
    public void keyTyped(KeyEvent e) {

}
    
    @Override
    public void keyPressed(KeyEvent e) {
       if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
        sup.timeToStop();
    }   }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
