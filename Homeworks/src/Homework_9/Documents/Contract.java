package Homework_9.Documents;
import java.util.Date;

public abstract class Contract {
    private final String docNumber;
    private final Date docDate;

    public Contract(String docNumber, Date docDate) {
        this.docNumber = docNumber;
        this.docDate = new Date();;
    }

    public Date docDate() {
        return docDate;
    }

    public String docNumber() {
        return docNumber;
    }

}
