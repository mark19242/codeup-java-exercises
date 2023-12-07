///***A***///
//public class ControlFlowExercises {
//    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//    }
//}


///***B***///
//public class ControlFlowExercises {
//    public static void main(String[] args) {
//        // Do-While Loop (count by 2's)
//        int start = 0;
//        do {
//            System.out.println(start);
//            start += 2;
//        } while (start <= 100);
//
//
//        int k = 100;
//        do {
//            System.out.println(k);
//            k -= 5;
//        } while (k >= -10);
//
//
//        long num = 2;
//        do {
//            System.out.println(num);
//            num *= num;
//        } while (num < 1_000_000);
//    }
//}

///***C***///
//public class ControlFlowExercises {
//    public static void main(String[] args) {
//
//        for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }
//
//        for (int j = 100; j >= -10; j -= 5) {
//            System.out.println(j);
//        }
//
//        for (long num = 2; num < 1_000_000; num *= num) {
//            System.out.println(num);
//        }
//    }
//}

//public class ControlFlowExercises {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
//    }
//}
//import java.util.Scanner;
//
//public class ControlFlowExercises {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Display a table of powers
//        System.out.print("What number would you like to go up to? ");
//        int userInput = sc.nextInt();
//
//        System.out.println("Here is your table!");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//        for (int i = 1; i <= userInput; i++) {
//            System.out.printf("%-6d | %-7d | %-5d%n", i, i * i, i * i * i);
//        }
//    }
//}

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Convert grades into letter grades
        char continueProgram;
        do {
            System.out.print("Enter a numerical grade (0-100): ");
            int numericGrade = scanner.nextInt();

            char letterGrade;
            if (numericGrade >= 88 && numericGrade <= 100) {
                letterGrade = 'A';
            } else if (numericGrade >= 80) {
                letterGrade = 'B';
            } else if (numericGrade >= 67) {
                letterGrade = 'C';
            } else if (numericGrade >= 60) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }

            System.out.println("Letter Grade: " + letterGrade);

            System.out.print("Do you want to continue? (y/n): ");
            continueProgram = scanner.next().charAt(0);
        } while (continueProgram == 'y' || continueProgram == 'Y');
    }
}



