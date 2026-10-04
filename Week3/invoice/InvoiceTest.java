package Week3.invoice;

public class InvoiceTest {

    public static void main(String[] args) {

        Invoice invoice = new Invoice(
                "A123",
                "Hammer",
                3,
                10.50
        );


        System.out.println("Part Number: "
                + invoice.getPartNumber());

        System.out.println("Description: "
                + invoice.getPartDescription());

        System.out.println("Quantity: "
                + invoice.getQuantity());

        System.out.println("Price: "
                + invoice.getPricePerItem());

        System.out.println("Invoice Amount: "
                + invoice.getInvoiceAmount());
    }
}