package Homework_9.Documents;

public class Register implements ContractInterface{

    private final Contract[] docArray = new Contract[10];

    public void saveDocument(Contract... contracts) {
        for (Contract document : contracts) {
            for (int i = 0; i < contracts.length; i++) {
                if (this.docArray[i] == null) {
                    this.docArray[i] = document;
                    break;
                }
            }
        }
    }

    public void getInformation(Contract... contracts) {
        for (Contract contract : contracts) {
            System.out.println(contract);
        }
    }


    @Override
    public void saveDocument() {

    }

    @Override
    public void getInformation() {

    }
}
