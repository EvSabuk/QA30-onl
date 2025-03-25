package Homework_6.Homework.Computer;

public class Computer {
    private final double computerCost;
    private final String computerModel;
    private final HDD computerHdd;
    private final RAM computerRam;

    public Computer(double computerCost, String computerModel,HDD computerHdd, RAM computerRam ) {
        this.computerCost = computerCost;
        this.computerModel = computerModel;
        this.computerHdd = computerHdd;
        this.computerRam = computerRam;

    }

    public Computer(double computerCost, String computerModel) {
        this.computerCost = computerCost;
        this.computerModel = computerModel;
        this.computerHdd = new HDD();
        this.computerRam = new RAM();

    }

    @Override
    public String toString() {
        return "Computer:" +
                "\n \tCost=" + this.computerCost +
                ",\n \tModel='" + this.computerModel + '\'' +
                ", \n \t" + this.computerHdd +
                ",\n \t" + this.computerRam;
    }
}
