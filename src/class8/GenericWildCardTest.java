package class8;

public class GenericWildCardTest {
    public static void main(String[] args) {
        System.out.println("GenericWildCard Integer Test");
        GenericWildCard<Integer> intGeneric = new GenericWildCard<>(10);
        System.out.println("GenericWildCard Integer value: " + intGeneric.getValue());

        System.out.println("\nGenericWildCard Double Test");
        GenericWildCard<Double> doubleGeneric = new GenericWildCard<>(10.5);
        System.out.println("GenericWildCard Double value: " + doubleGeneric.getValue());

        System.out.println("\nGenericWildCard Float Test");
        GenericWildCard<Float> floatGeneric = new GenericWildCard<>(10.5f);
        System.out.println("GenericWildCard Float value: " + floatGeneric.getValue());

        System.out.println("\nGenericWildCard Long Test");
        GenericWildCard<Long> longGeneric = new GenericWildCard<>(100000L);
        System.out.println("GenericWildCard Long value: " + longGeneric.getValue());

        // The following lines would cause compile-time errors
//         GenericWildCard<String> stringGeneric = new GenericWildCard<>("Hello Generics");
        // GenericWildCard<Boolean> booleanGeneric = new GenericWildCard<>(true);
        // GenericWildCard<ClassTest> classGeneric = new GenericWildCard<>(new ClassTest
    }
}
