package Week3.invoice;


public class InvoiceTest {

    public static void main(String[] args) {

        Invoice invoice = new Invoice(
            "A123",
            "Hammer",
            3,
            10.50
        );

        System.out.println(invoice.getPartNumber());
        System.out.println(invoice.getPartDescription());
        System.out.println(invoice.getQuantity());
        System.out.println(invoice.getPricePerItem());

    }
}

