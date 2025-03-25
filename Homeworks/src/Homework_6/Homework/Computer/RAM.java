package Homework_6.Homework.Computer;

public class RAM {
    private final String ramName;
    private final int ramVolume;

    public RAM() {
        this.ramName = "ASUS";
        this.ramVolume = 4;
    }

    public RAM(String ramName, int ramVolume) {
        this.ramName = ramName;
        this.ramVolume = ramVolume;
    }

    @Override
    public String toString() {
        return "RAM:" +
                "Name='" + ramName + '\'' +
                ", Volume=" + ramVolume;
    }
}

