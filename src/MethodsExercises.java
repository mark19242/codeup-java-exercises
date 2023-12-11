//import java.util.Scanner;
//
//public class MethodsExercises {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Test the methods
//        int num1 = 10;
//        int num2 = 5;
//
//        System.out.println("Addition: " + add(num1, num2));
//        System.out.println("Subtraction: " + subtract(num1, num2));
//        System.out.println("Multiplication: " + multiply(num1, num2));
//
//        // Handle division by zero
//        System.out.print("Enter the divisor for division: ");
//        int divisor = sc.nextInt();
//        if (divisor != 0) {
//            System.out.println("Division: " + divide(num1, divisor));
//        } else {
//            System.out.println("Cannot divide by zero.");
//        }
//
//        System.out.println("Modulus: " + modulus(num1, num2));
//    }
//
//    // Addition method
//    public static int add(int a, int b) {
//        return a + b;
//    }
//
//    // Subtraction method
//    public static int subtract(int a, int b) {
//        return a - b;
//    }
//
//    // Multiplication method
//    public static int multiply(int a, int b) {
//        return a * b;
//    }
//
//    // Division method with handling for division by zero
//    public static double divide(int a, int b) {
//        if (b != 0) {
//            return (double) a / b;
//        } else {
//            throw new IllegalArgumentException("Cannot divide by zero.");
//        }
//    }
//
//    // Modulus method
//    public static int modulus(int a, int b) {
//        return a % b;
//    }
//}


//import java.util.Scanner;
//
//public class MethodsExercises {
//
//    public static void main(String[] args) {
//        // Test the getInteger method
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        System.out.println("You entered: " + userInput);
//    }
//
//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number between " + min + " and " + max + ": ");
//        int input = sc.nextInt();
//
//        if (input < min || input > max) {
//            System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
//            return getInteger(min, max); // Recursively call the method until a valid input is provided.
//        } else {
//            return input;
//        }
//    }
//}

//import java.util.Scanner;
//
//public class MethodsExercises {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        do {
//            System.out.print("Enter an integer between 1 and 10: ");
//            int userNumber = getInteger(1, 10);
//            long factorialResult = calculateFactorial(userNumber);
//
//            System.out.println(userNumber + "! = " + factorialResult);
//
//            System.out.print("Do you want to continue? (y/n): ");
//        } while (sc.next().equalsIgnoreCase("y"));
//    }
//
//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//
//        int input;
//        do {
//            System.out.print("Enter a number between " + min + " and " + max + ": ");
//            input = sc.nextInt();
//        } while (input < min || input > max);
//
//        return input;
//    }
//
//    public static long calculateFactorial(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//
//        long factorial = 1;
//        for (int i = 2; i <= n; i++) {
//            factorial *= i;
//        }
//
//        return factorial;
//    }
//}

//import java.util.Scanner;
//
//public class MethodsExercises {
//
//    public static void main(String[] args) {
//        diceRollingApp();
//    }
//
//    public static void diceRollingApp() {
//        Scanner sc = new Scanner(System.in);
//
//        do {
//            System.out.print("Enter the number of sides for a pair of dice: ");
//            int numSides = getInteger(1, Integer.MAX_VALUE);
//
//            int result1 = rollDice(numSides);
//            int result2 = rollDice(numSides);
//
//            System.out.println("Rolling the dice...");
//            System.out.println("Result of Die 1: " + result1);
//            System.out.println("Result of Die 2: " + result2);
//
//            System.out.print("Do you want to roll the dice again? (y/n): ");
//        } while (sc.next().equalsIgnoreCase("y"));
//    }
//
//    // Method to simulate rolling a die with a given number of sides
//    public static int rollDice(int numSides) {
//        return (int) (Math.random() * numSides) + 1;
//    }
//
//    // Method to get an integer from the user within a specified range
//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//
//        int input;
//        do {
//            System.out.print("Enter a number between " + min + " and " + max + ": ");
//            input = sc.nextInt();
//        } while (input < min || input > max);
//
//        return input;
//    }
//}

import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        highLowGuessingGame();
    }

    public static void highLowGuessingGame() {
        Scanner sc = new Scanner(System.in);
        int randomNumber = generateRandomNumber();

        System.out.println("Welcome to the High-Low guessing game!");
        System.out.println("Guess the number between 1 and 100.");

        int userGuess;
        do {
            userGuess = getUserGuess();

            if (userGuess < randomNumber) {
                System.out.println("HIGHER");
            } else if (userGuess > randomNumber) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS! You got it!");
            }
        } while (userGuess != randomNumber);

        sc.close();
    }

    private static int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }

    private static int getUserGuess() {
        Scanner sc = new Scanner(System.in);

        int userGuess;
        do {
            System.out.print("Enter your guess: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next(); // consume the invalid input
            }
            userGuess = sc.nextInt();

            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            }
        } while (userGuess < 1 || userGuess > 100);

        return userGuess;
    }
}


