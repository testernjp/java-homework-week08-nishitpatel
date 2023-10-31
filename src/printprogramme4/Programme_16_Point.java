package printprogramme4;

/**
 *You have to represent a point in 2D space. Write a class with the name Point. The class needs two
 * fields (instance variables) with name x and y of type int. The class needs to have two constructors.
 * The first constructor does not have any parameters (no-arg constructor). The second constructor has
 * parameters x and y of type int and it needs to initialize the fields.
 * Write the following methods (instance methods):
 * Method named getX without any parameters, it needs to return the value of x field.
 * Method named getY without any parameters, it needs to return the value of y field.
 * Method named setX with one parameter of type int, it needs to set the value of the x field.
 * Method named setY with one parameter of type int, it needs to set the value of the y field.
 * Method named distance without any parameters, it needs to return the distance between this Point
 * and Point 0,0 as double. Method named distance with two parameters x, y both of type int, it needs to
 * return the distance between this Point and Point x,y as double. Method named distance with parameter another
 * of type Point, it needs to return the distance between this Point and another Point as double. How to find the
 * distance between two points? To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
 * d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA) Where √ represents square root.
 */

public class Programme_16_Point {
    // Fields
    int x;
    int y;

    // Constructors
    // No-arg constructor
    public Programme_16_Point() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor with parameters
    public Programme_16_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to get the x value
    public int getX() {
        return x;
    }

    // Method to get the y value
    public int getY() {
        return y;
    }

    // Method to set the y value
    public void setX(int x) {
        this.x = x;
    }

    // Method to set the y value
    public void setY(int y) {
        this.y = y;
    }

    // Method to calculate distance from this Point to Point (0,0)
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    // Method to calculate distance from this point to a specific (x,y) coordinate
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Method to calculate distance from this Point to another Point object
    public double distance(Programme_16_Point another) {
        int xDiff = this.x - another.getX();
        int yDiff = this.y - another.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public static void main(String[] args) {
        Programme_16_Point first = new Programme_16_Point(6, 5);
        Programme_16_Point second = new Programme_16_Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Programme_16_Point point = new Programme_16_Point();
        System.out.println("distance()= " + point.distance());

    }
}
