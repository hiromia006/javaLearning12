package class3;

public class LogicalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Logical Operators in Java
        System.out.println("a < b && a != b: " + (a < b && a != b)); // Logical AND
        System.out.println("a < b || a == b: " + (a < b || a == b)); // Logical OR

        System.out.println("a < b && a != b: " + ((a < b && a != b) && (a > b || a == b))); // Logical AND
        System.out.println("a < b || a == b: " + ((a < b && a != b) || (a < b || a == b)) ); // Logical OR
    }
}
