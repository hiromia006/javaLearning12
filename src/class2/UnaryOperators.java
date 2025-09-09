package class2;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Initial value of a: " + a);
        // Unary Operators in Java
        // Unary Plus
        System.out.println("Unary Plus: " + ++a); // a=a+1
        System.out.println("Unary Plus: " + a++); // a=a+1
        System.out.println("Value of a after Unary Plus: " + a);

        System.out.println("=============================");
        // Unary Minus
        System.out.println("Unary Minus: " + a--); //
        System.out.println("Value of a after Unary Minus: " + --a); //10
        System.out.println("Value of a after Unary Minus: " + a); //

    }
}
