package Service;

/*
 * @author Karol
 */

/*
Exiting program is possible through hitting 
ESC button on LCDscreen as well as typing "exit" into scanner
*/

/*List of hardcoded products into database. To test put barcodes into scanner:
Legend:
barcode, name, price
"1","Butter",5.0
"12312","Bread",3.5
"2135","Orange Juice",6.0
"5321","Sausage",6.0

You can add some in Database.DatabaseMock ;) 
*/

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        new ServiceSetup();
       
    }
    
}
