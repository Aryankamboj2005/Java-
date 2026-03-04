import java.util.*;
public class setMap {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<Integer>();
        // it cannot contain the dupliate values 
        // it does not sort the element 
        s1.add(1);
        s1.add(13);
        s1.add(23);
        s1.add(12);
        System.out.println("this is the set for the HashMap which ciontain value " + s1);

        // for the sorted set 
        Set<Integer> s2 = new TreeSet<Integer>();
        s2.add(1);
        s2.add(13);
        s2.add(23);
        s2.add(12);
        System.out.println("This is the set  contain the value sof the TreeMap which is in th esorted formt and contain values " +s2);
    }
}
