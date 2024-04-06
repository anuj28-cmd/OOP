package OOP.Lab_Exp;
class ExceptionHandler {
    public void handleDivideByZero() {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("You shouldn’t divide a number by zero");
        }
    }

    public void handleArrayIndexOutOfBounds() {
        try {
            int[] array = {1, 2, 3, 4, 5, 6};
            int index = 7; 
            int value = array[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("OOPs!!!Array Index 7 out of bounds for length 6.\r");
        }
    }
    
    
    public void handleNullPointerException() {
        try {
            String str = null;
            int length = str.length();
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception arises!!");
        }
    }
}

public class Lab_exp4 { 
    public static void main(String[] args) {
        ExceptionHandler handler = new ExceptionHandler();

        handler.handleDivideByZero();

        handler.handleArrayIndexOutOfBounds();

        handler.handleNullPointerException();
    }
}
