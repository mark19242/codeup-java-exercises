//import java.util.Scanner;
//public class ConsoleExercises {
//    public static void main(String[] args) {
////        double pi = 3.14159;
////        System.out.format("The value of pi is approximately %.2f.%n", pi);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter an integer: ");
//        int userNum = sc.nextInt();
//
//        System.out.println("You entered: " + userNum);
//    }
//}

//import java.util.Scanner;
//
//public class ConsoleExercises {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter the first word: ");
//        String firstWord = sc.next();
//
//        System.out.print("Enter the second word: ");
//        String secondWord = sc.next();
//
//        System.out.print("Enter the third word: ");
//        String thirdWord = sc.next();
//
//        System.out.println("You entered:");
//        System.out.println(firstWord);
//        System.out.println(secondWord);
//        System.out.println(thirdWord);
//    }
//}

//import java.util.Scanner;
//
//public class ConsoleExercises {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a sentence: ");
//        String userSentence = sc.next();
//
//        System.out.println("You entered: " + userSentence);
//    }
//}

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the classroom: ");
        double length = Double.parseDouble(sc.nextLine());

        System.out.print("Enter the width of the classroom: ");
        double width = Double.parseDouble(sc.nextLine());

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area of the classroom: " + area);
        System.out.println("Perimeter of the classroom: " + perimeter);
    }
}









