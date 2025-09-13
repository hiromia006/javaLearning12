package class8;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
//        map.put("name", "John Doe");
        map.put("age", 30);
//        map.put("isEmployed", true);
        map.put("salary", 75000);

//        System.out.println("map contents: " + map);
        System.out.println("Name: " + map.get("name"));
        System.out.println("Age: " + map.get("age"));
        System.out.println("Is Employed: " + map.get("isEmployed"));
        System.out.println("Salary: " + map.get("salary"));

    }
}
