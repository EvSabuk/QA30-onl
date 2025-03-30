package Homework_9;
import Homework_9.Documents.*;
import Homework_9.Execptions.*;

import java.util.Date;

public class Start {
    public static void main(String[] args) throws finish1a2b, abcSequence, Start555 {
       Register register = new Register();


            FinancialContract finContract = new FinancialContract("5i55qw qd qwdqwdqwd",
                    new Date(), 12.2, 2);
            ProductContract prodContract = new ProductContract("12eabcf12f12f",
                    new Date(),"Apple", 1244 );
            WorkerContract workContract = new WorkerContract("3a2b1a2b",
                    new Date(), new Date(1798761600000L),
                    "Vasya");

        validateAndHandle(finContract.docNumber());
        validateAndHandle(prodContract.docNumber());
        validateAndHandle(workContract.docNumber());


            register.saveDocument(finContract, prodContract, workContract);
            register.getInformation(finContract, prodContract, workContract);


    }

    public static void validateAndHandle(String docNumber) {
        try {
            validateDocumentName(docNumber);
        } catch (finish1a2b | abcSequence | Start555 e) {
            System.err.println(e.getMessage());
        }
    }



    public static void validateDocumentName(String docNumber) throws finish1a2b,abcSequence,Start555 {
        if (docNumber.contains("abc")) {
            throw new abcSequence();
        }
        if (docNumber.startsWith("555")) {
            throw new Start555();
        }
        if (docNumber.endsWith("1a2b")) {
            throw new finish1a2b();
        }
        System.out.println("The document has valid name: " + docNumber);
    }
}
