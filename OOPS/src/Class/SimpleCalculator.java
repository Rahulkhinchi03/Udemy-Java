package Class;

public class SimpleCalculator {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());

    }


    // Variables
    private double firstNumber;
    private double secondNumber;

    // Get
    public double getFirstNumber() {
        return firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }

    // Set

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    // Add - Sub - Multiply - Divide

    public double getAdditionResult() {
        double result = getFirstNumber() + getSecondNumber();
        return result;
    }
    public double getSubtractionResult() {
        return  getFirstNumber() - getSecondNumber();
    }
    public double getMultiplicationResult(){
        return getFirstNumber() * getSecondNumber();
    }
    public double getDivisionResult(){
        if(firstNumber == 0 || secondNumber == 0) {
            return 0;
        }
            return getFirstNumber() / getSecondNumber();

    }


}
