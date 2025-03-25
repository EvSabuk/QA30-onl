package Homework_6.Homework.Computer;

public class HDD {
    private final String hddName;
    private final int hddVolume;
    private final String hddType;

    public HDD() {
        this.hddName = "Samsung";
        this.hddVolume = 500;
        this.hddType = "Internal";
    }

    public HDD(String hddName, int hddVolume, String hddType) {
        this.hddName = hddName;
        this.hddVolume = hddVolume;
        this.hddType = hddType;
    }

    @Override
    public String toString() {
        return "HDD:" +
                "Name='" + hddName + '\'' +
                ", Volume=" + hddVolume +
                ", Type='" + hddType + '\'';
    }
}
