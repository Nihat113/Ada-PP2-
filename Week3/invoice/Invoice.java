package Week3.invoice;

public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;


    //Constructor 
    public Invoice(String partNumber,
               String partDescription,
               int quantity,
               double pricePerItem) {

        this.partNumber = partNumber;
        this.partDescription = partDescription;

        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

//--------------------------------------------------------------------
// minus checker SET  → change/write
    public void setQuantity(int quantity) {

        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }


    public void setPricePerItem(double pricePerItem) {

        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }
//----------------------------------------------------------------------
// our getter   GET  → take/read

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
//----------------------------------------------------------------------


    




}

