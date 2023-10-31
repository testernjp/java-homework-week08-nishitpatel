package printprogramme4.programme_19_cylinder;

/**
 * Write a class with the name Circle. The class needs one field (instance variable) with name radius of
 * type double.
 * The class needs to have one constructor with parameter radius of type double and it needs to initialize
 * the fields.
 * In case the radius parameter is less than 0 it needs to set the radius field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getRadius without any parameters, it needs to return the value of the radius
 * field.
 * PRIME TESTING
 * ● Method named getArea without any parameters, it needs to return the calculated area
 * (radius * radius * PI). For PI use Math.PI constant.
 */
public class Circle {
    // Field
    double radius;

    // Constructor
    public Circle(double radius) {
        // Initialize the field and ensure non-negativity
        this.radius = (radius < 0) ? 0 : radius;
    }

    // Method to get the radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate and return the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
