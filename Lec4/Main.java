
package Lec4;

public class Main {

    // Example 1: Generate random numbers
    public static void generateRandomNumbers() {

        int number;

        for (int i = 1; i <= 6; i++) {

            number = (int) (Math.random() * 49) + 1;

            System.out.println("Number " + i + ": " + number);
        }
    }

    // Example 2: Method without parameters
    public static void sayHello() {

        System.out.println("Hello");
    }

    // Example 3: Parameterized method
    public static void area(int a, int b) {

        System.out.println("Multiplication: " + (a * b));
        System.out.println("Addition: " + (a + b));
    }

    public static void main(String[] args) {

        // Calling the random numbers method
        generateRandomNumbers();

        System.out.println("--------------------");

        // Calling sayHello method
        sayHello();
        sayHello();

        System.out.println("--------------------");

        // Calling area method with different arguments
        area(5, 10);
        area(7, 3);
        area(3, 3);
    }
}
