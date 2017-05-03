
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
       if (e.getKeyCode() 
               == KeyEvent.VK_ESCAPE) {
        sup.timeToStop();
    }   }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
