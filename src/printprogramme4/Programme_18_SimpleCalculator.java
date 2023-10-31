package printprogramme4;

/**
 * Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
 * names firstNumber and secondNumber both of type double.
 * Write the following methods (instance methods):
 * ● Method named getFirstNumber without any parameters, it needs to return the value of the
 * firstNumber field.
 * ● Method named getSecondNumber without any parameters, it needs to return the value of
 * the secondNumber field.
 * ● Method named setFirstNumber with one parameter of type double, it needs to set the value
 * of the firstNumber field.
 * ● *Method named setSecondNumber with one parameter of type double, it needs to set the
 * value of the secondNumber field.
 * ● Method named getAdditionResult without any parameters, it needs to return the result of
 * adding the field values of firstNumber and secondNumber.
 * ● Method named getSubtractionResult without any parameters, it needs to return the result of
 * subtracting the field values of the secondNumber from the firstNumber.
 * ● Method named getMultiplicationResult without any parameters, it needs to return the result
 * of multiplying the field values of firstNumber and secondNumber.
 * ● Method named getDivisionResult without any parameters, it needs to return the result of
 * dividing the field values of firstNumber by the secondNumber. In case the value of
 * secondNumber is 0 then return 0.
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 8 methods
 */
public class Programme_18_SimpleCalculator {
    // Variables
    double firstNumber;
    double secondNumber;

    // Method to get the value of the firstNumber field
    public double getFirstNumber() {
        return firstNumber;
    }

    // Method to get the value of the secondNumber field
    public double getSecondNumber() {
        return secondNumber;
    }

    // Method to set the value of the firstNumber field
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    // Method to set the value of the secondNumber field
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    // Method to calculate and return the addition result
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    // Method to calculate and return the subtraction result
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    // Method to calculate and return the multiplication result
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    // Method to calculate and return the division result, handling division by zero
    public double getDivisionResult() {
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        // Test cases
        Programme_18_SimpleCalculator calculator = new Programme_18_SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("Add = " + calculator.getAdditionResult());
        System.out.println("Subtract = " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("Multiply = " + calculator.getMultiplicationResult());
        System.out.println("Divide = " + calculator.getDivisionResult());
    }
}
