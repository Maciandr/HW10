package HomeWork10;

public class Saper extends RobotEkspo implements Robot, uniquePossibility, RobotEnginea {
    private String modelType;
    private String pover;

    private String agregat;

    private String robotMaterial;
    private boolean isOn;


    public void constractionRobot() {
        modelType = "Saper-Vasa5";
        pover = "380volt";
        robotMaterial = "Пластик";
        agregat = "Лопата";
        isOn = false;
    }

    @Override
    public void recoveryRobot() {
        System.out.println("Робот отремонтирован");

    }

    @Override
    public void swapAgregate() {
        if (isOn == false) {
            if (agregat.equals("Лопата")) {
                this.agregat = "Метало искатель";
                System.out.println("Рабочий агрегат заменен на Метало искатель");
            } else if (agregat.equals("Метало искатель")) {
                this.agregat = "Лопата";
                System.out.println("Рабочий Агрегат заменен на лопата");
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
        return "Робот Сапер Копает окопы и ищет мины";
    }

    @Override
    public void robotEnginea() {
        System.out.println("Сапер Строит инженерное сооружение бункер");
    }

    @Override
    public String toString() {
        return "Saper{" +
                "modelType='" + modelType + '\'' +
                ", pover='" + pover + '\'' +
                ", agregat='" + agregat + '\'' +
                ", robotMaterial='" + robotMaterial + '\'' +
                ", isOn=" + isOn +
                '}';
    }

}
