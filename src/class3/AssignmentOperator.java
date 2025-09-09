package class3;

public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 100;
        int b = 20;

        // Assignment Operators in Java
        System.out.println("Initial value of a: " + a);
        System.out.println("Initial value of b: " + b);

        // Simple Assignment
        a = b;
        System.out.println("After simple assignment, value of a: " + a);

        // Add and Assign
        a += b; // equivalent to a = a + b
        System.out.println("After add and assign, value of a: " + a);

        // Subtract and Assign
        a -= b; // equivalent to a = a - b
        System.out.println("After subtract and assign, value of a: " + a);

        // Multiply and Assign
        a *= b; // equivalent to a = a * b
        System.out.println("After multiply and assign, value of a: " + a);


    }
}
