
package Database;

/**
 *
 * @author Karol
 */
public class SingleRecord {
    private String barcode;
    private String nameOfProduct;
    private double price;

    public SingleRecord(String barcode, String nameOfProduct, double price)
    {
        this.barcode
                =barcode;
        this.nameOfProduct
                =nameOfProduct;
        this.price
                =price;
    }
    
    public double getPrice(){
        return price;
    }
    public String getBarcode(){
        return barcode;
    }
    public String getNameOfProduct() {
        return nameOfProduct;
    }
    
    public String toString(){
        return nameOfProduct
                +" "
                +price;
    }
    public void setValues(SingleRecord swap)
    {
        this.barcode
                =swap.getBarcode();
        this.nameOfProduct
                =swap.getNameOfProduct();
        this.price
                =swap.getPrice();
    }
}
