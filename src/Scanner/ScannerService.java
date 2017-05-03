
package Scanner;

/**
 *
 * @author Karol
 */
public class ScannerService {
    Reader.ReadingService theReader;
    ScannerSwing scanner;
    
    
    public ScannerService(Reader.ReadingService reader){
        theReader
                =reader;
        scanner
                =new ScannerSwing(this);
        
        runScanner();
    }
    
    void sendBarCodeToReader(String barcode){
        theReader
                .checkTheBarcode(barcode);
    }
    
    private void runScanner(){
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
            scanner
                    .setVisible(true);}
    });
    
    }
}
