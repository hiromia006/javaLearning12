package class1;

public class Identifiers {
    public static void main(String[] args) {
        // Rule 1: Identifiers must start with a letter, underscore (_), or dollar sign ($)
        int myVariable = 10;
        String _myString = "Hello";
        double $myDouble = 20.5;
        int myVariable123 = 30;

        // Rule 2:  Cannot start with a digit
         // int 1stVariable = 40;

        // Rule 3: Identifiers should not contain spaces in their name.
        // double my variable = 50.5; // Spaces are not allowed

        // Rule 4: Identifiers should not use reserved keywords.
        int amount = 100; // 'amount' is not a reserved keyword, so it's valid
        int Amount = 200; // Case-sensitive, valid as well

        // Rule 5: Reserve Keywords cannot be used as Identifiers. Java defines a total of 53 reserved keywords that are predefined.

        // int class = 300; // 'class' is a reserved keyword, so this would be invalid
        //int public = 400; // 'public' is a reserved keyword, so this would be invalid

        System.out.println("Valid identifiers:");
        System.out.println("myVariable: " + myVariable);
        System.out.println("_myString: " + _myString);
        System.out.println("$myDouble: " + $myDouble);
        System.out.println("myVariable123: " + myVariable123);
        System.out.println("amount: " + amount);
        System.out.println("Amount: " + Amount);
    }
}
