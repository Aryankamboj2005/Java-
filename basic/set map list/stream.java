import java.util.*;
import java.util.stream.*;
public class stream {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(12);
        li.add(4);
        li.add(2354);
        li.add(3);
        // li.sort(Comparator.reverseOrder());
        // System.out.println(li);
        li.forEach(n -> System.out.println(n));
        Stream<Integer> s1 = li.stream(); // make a copy of the data
        //you can only use stream only one time
        Stream<Integer> s2 = s1.filter(n->n%2==0);
        s2.forEach(n-> System.out.println(n));
        int result = li.stream()
                      .filter( n -> n%2==0)
                      .map(n->n*2)
                      .reduce(0, (c,e)->c+e);
        System.out.println(result);
        };
    }