package class8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("World");
        stringList.add("from");
        stringList.add("List");

        System.out.println("List contents:");
        for (String str : stringList) {
            System.out.println(str);
        }

        stringList.remove(1);
        stringList.add(1, "Java");
        stringList.add("Selenium");
        List<String> anotherList = Arrays.asList("with", "Generics");
        stringList.addAll(anotherList);

     stringList.removeAll(anotherList);






    }
}
