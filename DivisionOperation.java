public class DivisionOperation {

    @FunctionalInterface
    interface ExceptionHandler {
        void handle(Exception e);
    }

    public static void main(String[] args) {
        // Define the lambda expression to handle other exceptions
        ExceptionHandler otherExceptionHandler = e -> {
            System.out.println("An exception occurred: " + e.getMessage());
        };

        // Define the method to perform division
        performDivision(10, 0, 
            new ExceptionHandler() {
                @Override
                public void handle(Exception e) {
                    if (e instanceof ArithmeticException) {
                        System.out.println("Cannot divide by zero!");
                    } else {
                        otherExceptionHandler.handle(e);
                    }
                }
            },
            otherExceptionHandler
        );
    }

    // Method to perform division
    public static void performDivision(int numerator, int denominator, 
                                       ExceptionHandler arithmeticExceptionHandler, 
                                       ExceptionHandler otherExceptionHandler) {
        try {
            // Perform the division
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            // Handle exceptions using the appropriate handler
            arithmeticExceptionHandler.handle(e);
        }
    }
}
