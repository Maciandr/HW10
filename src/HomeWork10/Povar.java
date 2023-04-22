package HomeWork10;

public class Povar extends RobotEkspo implements Robot, uniquePossibility {
    private String modelType;
    private String pover;
    private String contryConstraction;

    private String agregat;

    private boolean isOn;


    @Override
    public void constractionRobot() {
        modelType = "Povar3000";
        pover = "240volt";
        contryConstraction = "Belarus";
        agregat = "Ложка";
        isOn = false;
    }

    @Override
    public void recoveryRobot() {
        System.out.println("Робот отремонтирован");

    }

    @Override
    public void swapAgregate() {
        if (isOn == false) {
            if (agregat.equals("Ложка")) {
                this.agregat = "Вилка";
            } else if (agregat.equals("Вилка")) {
                this.agregat = "ложка";
            }
        } else {
            System.out.println("Для замены агрегата, сначала выключите робота");
        }

    }

    @Override
    public void robotOn() {
        this.isOn = true;
        System.out.println("Робот Включен");
    }

    @Override
    public void robotOff() {
        this.isOn = false;
        System.out.println("Робот Вылючен");
    }

    @Override
    public String uniquePossibility() {
        return "готовит кушать";
    }

    @Override
    public String toString() {
        return "Povar{" +
                "modelType='" + modelType + '\'' +
                ", pover='" + pover + '\'' +
                ", contryConstraction='" + contryConstraction + '\'' +
                ", agregat='" + agregat + '\'' +
                ", isOn=" + isOn +
                '}';

    }


}
