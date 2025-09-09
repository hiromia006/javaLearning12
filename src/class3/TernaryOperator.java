package class3;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int score = 30;

        // Ternary Operator in Java
        int max = (a > b) ? a : b; // If a is greater than b, assign a to max, otherwise assign b to max
        System.out.println("Maximum value: " + max);

        int min = (a < b) ? a : b; // If a is less than b, assign a to min, otherwise assign b to min
        System.out.println("Minimum value: " + min);

        String result = (score >= 90 && score <= 100) ? "A++"
                : (score >= 80 && score < 90) ? "A"
                : (score >= 70 && score < 80) ? "B+"
                : (score >= 70 && score < 80) ? "B"
                : (score >= 60 && score < 70) ? "C"
                : (score >= 50 && score < 60) ? "D"
                : (score >= 40 && score < 50) ? "E"
                : "F"; // If score is between 90 and 100, assign "A
        System.out.println("Grade: " + result);

    }
}
