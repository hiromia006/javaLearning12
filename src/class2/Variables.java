package class2;

public class Variables {
    int age = 30;  //4
    String name; //2
    static double salary; //8

    public void method1() {
        int localVariable = 5; // Local variable
        age = 60;
        System.out.println("Local Variable: " + localVariable);
        System.out.println("Instance Variable - Name: " + name + ", Age: " + age);
        System.out.println("Static Variable - Salary: " + salary);

//        System.out.println("Local Static Variable: " + localStaticVariable);
    }

    public void method2() {
        age = 40;
        double localStaticVariable = 10.5; // Local static variable
        System.out.println("Local Static Variable: " + localStaticVariable);
        System.out.println("Static Variable - Salary: " + salary);
        System.out.println("Instance Variable - Name: " + name + ", Age: " + age);

//        System.out.println("Local Variable: " + localVariable);


    }
}
