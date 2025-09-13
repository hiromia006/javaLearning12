package class8;

public class NonGenericTest {
    public static void main(String[] args) {

        System.out.println("Non-Generic Double Test");
        DoubleTest doubleTest = new DoubleTest(10.5);
        System.out.println("Double value: " + doubleTest.getValue());

        System.out.println("\nNon-Generic Integer ");
        IntegerTest integerTest = new IntegerTest(20);
        System.out.println("Integer value: " + integerTest.getValue());

        System.out.println("\nNon-Generic String Test");
        StringTest stringTest = new StringTest("Hello");
        System.out.println("String value: " + stringTest.getValue());

        System.out.println("\nNon-Generic Long Test");
        LongTest longTest = new LongTest(100L);
        System.out.println("Long value: " + longTest.getValue());

        System.out.println("\nNon-Generic Boolean Test");
        BooleanTest booleanTest = new BooleanTest(true);
        System.out.println("Boolean value: " + booleanTest.getValue());
    }
}
