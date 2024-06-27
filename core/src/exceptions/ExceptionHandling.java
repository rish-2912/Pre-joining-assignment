package exceptions;

public class ExceptionHandling {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is below 18, it must be atleast 18");
        } else {
            System.out.println("Ok valid");
        }
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            // Handling checked exception
            validateAge(10);
        } catch (InvalidAgeException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        try {
            // Handling unchecked exception (ArithmeticException)
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
    }
}
