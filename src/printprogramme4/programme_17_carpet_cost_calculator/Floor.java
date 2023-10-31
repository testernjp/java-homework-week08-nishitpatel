package printprogramme4.programme_17_carpet_cost_calculator;

/**
 * Write a class with the name Floor. The class needs two fields (instance variables) with name width
 * and length of type double.
 * PRIME TESTING
 * The class needs to have one constructor with parameters width and length of type double and it
 * needs to initialize the fields.
 * In case the width parameter is less than 0 it needs to set the width field value to 0, in case the length
 * parameter is less than 0 it needs to set the length field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getArea without any parameters, it needs to return the calculated area (width
 * * length).
 */
public class Floor {
    // Variables
    double width;
    double length;

    // Constructor
    public Floor(double width, double length) {
        // Initialise variables and ensure non-negativity
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    // Method to calculate the area
    public double getArea() {
        return width * length;
    }
}
