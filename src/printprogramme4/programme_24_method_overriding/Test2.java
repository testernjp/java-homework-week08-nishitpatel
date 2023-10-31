package printprogramme4.programme_24_method_overriding;

/**
 * Java Program to demonstrate the real scenario of Java Method Overriding
 * where three classes are overriding the method of a parent class.
 * Test class to create objects and call the methods
 */
public class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
    }
}