package HomeWork10;

public class RobotEkspo {

    private Robot[] ekspo1 = new Robot[10];
    private Robot[] ekspo2 = new Robot[10];
    private Robot[] ekspo3 = new Robot[10];

    //    public void uniquePossibility(){
//}
    public void addInEkspo1(Robot robot) {
        for (int i = 0; i < ekspo1.length; i++) {
            if (ekspo1[i] == null) {
                ekspo1[i] = robot;
                break;
            }
        }
    }

    public void addInEkspo2(Robot robot) {
        for (int i = 0; i < ekspo2.length; i++) {
            if (ekspo2[i] == null) {
                ekspo2[i] = robot;
                break;
            }
        }
    }

    public String informationEkspo(Robot[] ekspo) {
        String word = "";
        for (Robot a : ekspo) {
            if (a != null) {
                word = word + " " + a + " " + a.uniquePossibility() + " " + "\n";
            }
        }
        return word;

    }

    public Robot[] getEkspo2() {
        return ekspo2;
    }

    public Robot[] getEkspo1() {
        return ekspo1;
    }

    public Robot[] getEkspo3() {
        return ekspo3;
    }

    public void addInEkspo3(Robot robot) {
        for (int i = 0; i < ekspo3.length; i++) {
            if (ekspo3[i] == null) {
                ekspo3[i] = robot;
                break;
            }
        }
    }
}




