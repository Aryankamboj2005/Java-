import java.util.*;
import java.util.stream.*;
public class listt {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(12);
        li.add(4);
        li.add(2354);
        // li.sort(Comparator.reverseOrder());
        // System.out.println(li);
        li.forEach(n -> System.out.println(n));
        Stream<Integer> s1 = li.stream(); // make a copy of the data
        };
    }
