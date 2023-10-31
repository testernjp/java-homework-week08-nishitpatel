package printprogramme4.programme_19_cylinder;

/**
 * Write a class with the name Main that have main method
 * TEST EXAMPLE
 * → TEST CODE: Write below code into main method
 * Circle circle = new Circle(3.75);
 * System.out.println("circle.radius= " + circle.getRadius());
 * System.out.println("circle.area= " + circle.getArea());
 * Cylinder cylinder = new Cylinder(5.55, 7.25);
 * System.out.println("cylinder.radius= " + cylinder.getRadius());
 * System.out.println("cylinder.height= " + cylinder.getHeight());
 * System.out.println("cylinder.area= " + cylinder.getArea());
 * System.out.println("cylinder.volume= " + cylinder.getVolume());
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 3 classes.
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("cirlce.radius = " + circle.getRadius());
        System.out.println("cicle.area = " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius = " + cylinder.getRadius());
        System.out.println("cylinder.height = " + cylinder.getHeight());
        System.out.println("cylinder.area = " + cylinder.getArea());
        System.out.println("cylinder.volme = " + cylinder.getVolume());
    }
}
