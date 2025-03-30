package Homework_9.Documents;
import java.util.Date;

public class FinancialContract extends Contract{
    private final double totalCost;
    private final int DepartmentCode;

    public FinancialContract(String docNumber, Date docDate, double totalCost, int departmentCode) {
        super(docNumber, docDate);
        this.totalCost = totalCost;
        DepartmentCode = departmentCode;
    }

    public FinancialContract() {
        super(null,null);
        this.totalCost = 0;
        this.DepartmentCode = 0;
    }

    @Override
    public String toString() {
        return "Financial Contract" +
                "\nNumber of document = " + super.docNumber() +
                "\nDate Created = " + super.docDate() +
                "\n Total Cost = " + this.totalCost + "$" +
                "\n Department Code = " + this.DepartmentCode
                ;
    }
}
