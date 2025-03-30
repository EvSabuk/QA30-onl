package Homework_9.Documents;
import java.util.Date;

public class ProductContract extends Contract {
    private final String productType;
    private final int productQuantity;
    public ProductContract(String docNumber, Date docDate, String productType, int productQuantity) {
        super(docNumber, docDate);
        this.productType = productType;
        this.productQuantity = productQuantity;
    }

    public ProductContract() {
        super(null,null);
        this.productType = null;
        this.productQuantity = 0;
    }

    @Override
    public String toString() {
        return "Product Contract" +
                "\nDocument Id= " + super.docNumber() +
                "\nDate Created = " + super.docDate() +
                "\nProduct Type = " + productType +
                "\nProduct Quantity = " + productQuantity;
    }
}
