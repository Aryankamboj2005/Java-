import java.util.*;
public class collection1 {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();

        //<Interger> tells that it can contain only the 
        // integer value ;
        nums.add(1);
        nums.add(4);
        nums.add(7);
        nums.add(38);
        nums.add(79);
        System.out.println(nums);
         List<Integer> number = new ArrayList<Integer>();
         // from this we can acces the elements using theri index
         // numbers
         number.add(1);
        number.add(4);
        number.add(7);
        number.add(38);
        number.add(79);
        System.out.println(number.get(2)); // to acess the 
                              // elemnt of the 2nd imdex
        System.out.println(number.indexOf(79));
         // can klnow the index of the particular number    
    }
}
