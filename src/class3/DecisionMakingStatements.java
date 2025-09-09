package class3;

public class DecisionMakingStatements {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;

        // Using if statement
        System.out.println("Using if statement ==========");
        if (a < b) {
            System.out.println("a is less than b");
        }

        System.out.println("Using if-else statement ==========");
        // Using if-else statement
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is not greater than b");
        }

        // Using if-else-if ladder
        System.out.println("Using if-else-if ladder ==========");
        int mark = 80;
        if (mark > 90 && mark <= 100) {
            System.out.println("A+");
        } else if (mark >= 80 && mark <= 90) {
            System.out.println("A");
        } else if (mark > 70 && mark <= 80){
            System.out.println("B+");
        } else if (mark >= 60 && mark <= 70) {
            System.out.println("B");
        }else {
            System.out.println("Fail");
        }

        // Using nested if statements
        System.out.println("Using nested if statements ==========");
        if (a != b) {
            if (a < b) {
                System.out.println("Nested: a is less than b");
            } else {
                System.out.println("Nested: a is greater than b");
            }
        } else {
            System.out.println("Nested: a is equal to b");
        }
    }
}
