package class8;

import class2.ClassTest;

public class GenericTest {
    public static void main(String[] args) {
        System.out.println("Generic Integer Test");
        Generic<Integer> intGeneric = new Generic<>(10);
        System.out.println("Generic Integer value: " + intGeneric.getValue());

        System.out.println("\nGeneric String Test");
        Generic<String> stringGeneric = new Generic<>("Hello Generics");
        System.out.println("Generic String value: " + stringGeneric.getValue());

        System.out.println("\nGeneric Double Test");
        Generic<Double> doubleGeneric = new Generic<>(10.5);
        System.out.println("Generic Double value: " + doubleGeneric.getValue());

        System.out.println("\nGeneric Boolean Test");
        Generic<Boolean> booleanGeneric = new Generic<>(true);
        System.out.println("Generic Boolean value: " + booleanGeneric.getValue());

        System.out.println("\nGeneric Long Test");
        Generic<Long> longGeneric = new Generic<>(100000L);
        System.out.println("Generic Long value: " + longGeneric.getValue());

        System.out.println("\nGeneric Float Test");
        Generic<Float> floatGeneric = new Generic<>(10.5f);
        System.out.println("Generic Float value: " + floatGeneric.getValue());

        System.out.println("\nGeneric ClassTest Test");
        Generic<ClassTest> classGeneric = new Generic<>(new ClassTest());
        System.out.println("Generic ClassTest value: " + classGeneric.getValue());
    }
}
