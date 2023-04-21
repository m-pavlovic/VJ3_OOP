public class TestRobot {

    public static void main(String[] args) {
        long sumN = AUXCLS.calSumFirstNInt(3);
        System.out.println("Sum of the first N numbers is: "+sumN);
        long reSumN = AUXCLS.recursiveSumFirstNInt(4);
        System.out.println("Recursive sum: " + reSumN);
        long res = AUXCLS.powerOf(5, 2);
        System.out.println(res);
        long recursivePot = AUXCLS.recursivePowerOf(10, 3);
        System.out.println("Result: " +recursivePot);
        long recfact = AUXCLS.recursiveNFact(3);
        System.out.println(recfact);

        Robot robi = new Robot("Robi");
        robi.speak();
        robi.walk();
        // boolean flag = false;
        while (robi.getCntFillingArray() < Robot.RWMX*Robot.CLMX) {
            robi.fillArr();
        }
        robi.print2DArraySecond();
        robi.print2DArray();
    }
}
