public class JavaMethods {
    public static void main(String[] args) {
        String myFirstName = "Mark";
        String myLastName = "Smith";
        String  fullName = putNamesTogether(myFirstName,myLastName);
        System.out.println(fullName);
    }
    public static String putNamesTogether(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        return fullName;
    }
}
