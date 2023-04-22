package HomeWork10;

public class Main {
    public static void main(String[] args) {
        Povar povar1 = new Povar();
        Povar povar2 = new Povar();
        Povar povar3 = new Povar();
        Saper saper1 = new Saper();
        Saper saper2 = new Saper();
        Saper saper3 = new Saper();
        Builder builder1 = new Builder();
        Builder builder2 = new Builder();
        Builder builder3 = new Builder();
        RobotEkspo robotEkspo = new RobotEkspo();
        povar1.constractionRobot();
        povar2.constractionRobot();
        povar3.constractionRobot();
        saper1.constractionRobot();
        saper2.constractionRobot();
        saper3.constractionRobot();
        builder1.constractionRobot();
        builder2.constractionRobot();
        builder3.constractionRobot();
        robotEkspo.addInEkspo1(povar1);
        robotEkspo.addInEkspo1(povar2);
        robotEkspo.addInEkspo1(povar3);
        robotEkspo.addInEkspo1(builder3);
        robotEkspo.addInEkspo1(builder2);
        robotEkspo.addInEkspo1(builder1);
        robotEkspo.addInEkspo1(saper1);
        robotEkspo.addInEkspo1(saper2);
        robotEkspo.addInEkspo1(saper3);
        System.out.println(robotEkspo.informationEkspo(robotEkspo.getEkspo1()));
        robotEkspo.addInEkspo2(builder1);
        robotEkspo.addInEkspo2(builder2);
        robotEkspo.addInEkspo2(builder3);
        robotEkspo.addInEkspo2(saper1);
        robotEkspo.addInEkspo2(saper2);
        robotEkspo.addInEkspo2(saper3);
        System.out.println(robotEkspo.informationEkspo(robotEkspo.getEkspo2()));
        robotEkspo.addInEkspo3(saper1);
        robotEkspo.addInEkspo3(saper2);
        robotEkspo.addInEkspo3(saper3);
        System.out.println(robotEkspo.informationEkspo(robotEkspo.getEkspo3()));
        saper1.uniquePossibility();
        saper1.swapAgregate();
        System.out.println(saper1.toString());
        saper1.robotEnginea();
        builder3.robotEnginea();


    }
}
