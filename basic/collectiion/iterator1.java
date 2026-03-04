import java.util.*;
public class iterator1 {
    public static void main(String[] args) {
        Collection<Integer> number = new TreeSet<Integer>();
        number.add(12);
        number.add(123);
        number.add(132);
        number.add(12); // this cannot be prionted as the value there is same as the first value  
        Iterator<Integer> value = number.iterator(); // give the next value 
        while (value.hasNext()) // this whill check is the value contain the next value or not
        {
            System.out.println(value.next());
        }
    }
}
