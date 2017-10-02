public class Calculator {
    public int doComplexCalculation(int x) throws InterruptedException {

        System.out.println("Expensive calculation: Started for value x = " + x);
        Thread.sleep(1000);
        System.out.println("Expensive calculation: Done");
        return x * 2;
    }
}
