package Service;
import LCD.LCDscreen;



/*
 * @author Karol
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
            new LCDscreen().setVisible(true);
            }
            
        });
    }
    
    
}
