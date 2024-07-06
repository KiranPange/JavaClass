package kkk;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;

        try {
            int result = dividend / divisor; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error because of division by 0");
            e.printStackTrace();
        }

        System.out.println("Program continues");
    }
}

