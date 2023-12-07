
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bob: Hello, I'm Bob. What do you need?");
        String userInput;

        do {
            System.out.print("You: ");
            userInput = sc.nextLine();
            String bobResponse = getBobResponse(userInput);
            System.out.println("Bob: " + bobResponse);
        } while (!userInput.equalsIgnoreCase("bye"));

        System.out.println("Bob: Bye! Have a great day.");
    }

    private static String getBobResponse(String input) {
        if (input.trim().isEmpty()) {
            return "Fine. Be that way!";
        } else if (input.endsWith("?")) {
            return "Sure.";
        } else if (input.endsWith("!")) {
            return "Whoa, chill out!";
        } else {
            return "Whatever.";
        }
    }
}

