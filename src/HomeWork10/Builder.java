package HomeWork10;

public class Builder implements Robot, uniquePossibility, RobotEnginea {
    private String modelType;
    private String pover;
    private String contryConstraction;

    private String agregat;

    private String robotMaterial;
    private boolean isOn;

    public void constractionRobot() {
        modelType = "Builder-Железяка-500";
        pover = "480volt";
        robotMaterial = "Железо";
        agregat = "Шпатель";
        isOn = false;
    }

    @Override
    public void recoveryRobot() {
        System.out.println("Робот отремонтирован");

    }

    @Override
    public void swapAgregate() {
        if (isOn == false) {
            if (agregat.equals("Шпатель")) {
                this.agregat = "Молоток";
                System.out.println("Рабочий агрегат заменен на Молоток");
            } else if (agregat.equals("Молоток")) {
                this.agregat = "Шпатель";
                System.out.println("Рабочий агрегат заменен ан Шпатель");
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
        return "Строит";
    }

    @Override
    public void robotEnginea() {
        System.out.println("Строитель Строит инженерное сооружение бункер и с вероятностью 2 процента построит коммунизм");
    }

    @Override
    public String toString() {
        return "Builder{" +
                "modelType='" + modelType + '\'' +
                ", pover='" + pover + '\'' +
                ", contryConstraction='" + contryConstraction + '\'' +
                ", agregat='" + agregat + '\'' +
                ", robotMaterial='" + robotMaterial + '\'' +
                ", isOn=" + isOn +
                '}';
    }

}
