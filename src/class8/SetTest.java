package class8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<>();
        intSet.add(10);
        intSet.add(20);
        intSet.add(30);
        intSet.add(20);

        intSet.remove(20);
        intSet.add(50);
        intSet.add(100);


        Set<Integer> anotherSet = new HashSet<>();
        anotherSet.addAll(Arrays.asList(100, 200, 300));
        intSet.addAll(anotherSet);

        for (Integer i : intSet) {
            System.out.println(i);
        }


    }
}
