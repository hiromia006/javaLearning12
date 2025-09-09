package class2;

public class ClassTest {

    int age=40 ;  // Instance variable
    String name; // Instance variable
    static double salary; // Static variable

    public ClassTest() {

    }

    public void method1() {
        int localVariable = 5; // Local variable
        age = 60;
        System.out.println("Local Variable: " + localVariable);
        System.out.println("Instance Variable - Name: " + name + ", Age: " + age);
        System.out.println("Static Variable - Salary: " + salary);
    }

    public void method2() {
        age = 45;
        double localStaticVariable = 10.5; // Local static variable
        System.out.println("Local Static Variable: " + localStaticVariable);
        System.out.println("Static Variable - Salary: " + salary);
        System.out.println("Instance Variable - Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Initializing static variable
        ClassTest.salary = 50000.0;

        ClassTest abcd = new ClassTest();
        // Initializing instance variable
        System.out.println("Age: " + abcd.age); // Default value of instance variable
        System.out.println("Name: " + abcd.name); // Default value of instance variable


        abcd.name = "John Doe";
        abcd.age=70;

        System.out.println("After initialization: ================================");
        System.out.println("Age: " + abcd.age); // Updated value of instance variable
        System.out.println("Name: " + abcd.name); // Updated value of instance variable


        abcd.method1(); // method call

        System.out.println("After initialization: ================================");
        abcd.method2();
    }

}
