import java.util.Scanner;

public class ControlStatementsLoops {
    public static void main(String[] args) {
//        double discountPercent = 2.3;
//        boolean is2point3 = discountPercent == 2.3;
//        System.out.println(is2point3);
//        boolean isLoggedIn = true;
//        boolean isAdmin = true;
//
//        if (isLoggedIn && isAdmin) {
//            System.out.println("Yay! Welcome back admin!");
//        }

//        String myName = "Mark";
//        String ceoName = "Mark";
//        if (myName.equals(ceoName)) {
//            System.out.println("We have the same name");
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [y/N] ");
//        String userInput = sc.next();
//
//// Don't do this!
//        boolean confirmation = userInput == "y";

//        String myName = "Mark";
//        if (myName != null) {
//            System.out.println("myName had value");
//        }
//        int caseSwitch = 1;
//        switch (caseSwitch) {
//            case 1:
//                System.out.println("Case 1");
//            case 2:
//                System.out.println("Case 2");
//                break;
//            default:
//                System.out.println("Default case");
//                break;
//        }
//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
//        }
//        do {
//            System.out.println("i is" + i);
//            i++;
//        };
//        for(int i = 0; i < 10; i += 1) {
//            System.out.println("i is " + i);
//        }
        // print the numbers 1 through 5

        for(int i = 1; i < 100; i++) {
            System.out.println(i);
            if (i == 5) {
                break; // --------------+
            } //                        |
        } //                            |
// <----------------------------+

    }
}
