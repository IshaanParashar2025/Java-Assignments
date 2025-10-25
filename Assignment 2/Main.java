
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInterface u = new UserInterface();
        u.mainMenu();
    }
}

class Calculator {
    
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a+b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }

    int subtract(int a, int b) {
        return a-b;
    }

    double multiply(double a, double b) {
        return a*b;
    }

    float divide(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Cannot Divide by zero");

            }        
            float c = (float) a / b;
            return c;

        
    }

}

class UserInterface {
    Scanner scanner;
    Calculator calculator;

    public UserInterface() {
        scanner = new Scanner(System.in);
        calculator = new Calculator();
    }

    void performAddition() {
        System.out.print("Enter number of values to add (2 or 3): ");
        int count = scanner.nextInt();

        if (count == 2) {
            scanner.nextLine();
            System.out.print("Add Integers or Doubles(I/D): ");
            String d = scanner.nextLine();
            
            if (d.equals("I" )) {
                System.out.print("Enter first number: ");
                int a = scanner.nextInt();
                System.out.print("Enter second number: ");
                int b = scanner.nextInt(); 
                System.out.println("Result: " + calculator.add(a, b));
            }
            else if (d.equals("D")) {
                System.out.print("Enter first number: ");
                double a = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double b = scanner.nextDouble(); 
                System.out.println("Result: " + calculator.add(a, b));
            }

            
        } 
        else if (count == 3) {
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter second number: ");
            int b = scanner.nextInt();
            System.out.print("Enter third number: ");
            int c = scanner.nextInt();
            System.out.println("Result: " + calculator.add(a, b, c));
        } 
        else {
            System.out.println("Invalid choice. Only 2 or 3 numbers allowed.");
        }
    }

    void performSubtraction() {
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();     
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Result: " + calculator.subtract(a, b));
    }
        
    void performMultiplication() {
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.println("Result: " + calculator.multiply(a, b));
    }

    void performDivision() {
        try {
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();     
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Result: " + calculator.divide(a, b));
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot Divide by zero");
        }
    }

    void mainMenu() {

        while (true) {    System.out.println("Welcome to the Calculator Application!");
            System.out.println("1. Add Numbers");
            System.out.println("2. Subtract Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performAddition();
                    break;
                case 2:
                    performSubtraction();
                    break;
                case 3:
                    performMultiplication();
                    break;
                case 4:
                    performDivision();
                case 5:
                    return;
                default:
                    System.out.println("Invlid Input");}
        }
    }

    
}
