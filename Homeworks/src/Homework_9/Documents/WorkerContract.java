package Homework_9.Documents;
import java.util.Date;

public class WorkerContract extends Contract {
    private final Date docFinishDate;
    private final String WorkerName;
    public WorkerContract(String docNumber, Date docDate, Date docFinishDate, String workerName) {
        super(docNumber, docDate);
        this.docFinishDate = docFinishDate;
        this.WorkerName = workerName;
    }

    public WorkerContract() {
        super(null,null);
        this.docFinishDate = null;
        this.WorkerName = null;
    }

    @Override
    public String toString() {
        return "Worker Contract" +
                "\nNumber of document = " + super.docNumber() +
                "\nDate Created = " + super.docDate() +
                "\nDocument Finish Date = " + docFinishDate  +
                "\nWorker Name = " + WorkerName;
    }
}
