import java.util.*;;
public class mapp {
   public static void main(String[] args) {
    Map<String,Integer> student = new HashMap<>();
    student.put("Aryan", 500);
    student.put("A", 600);
    student.put("null", 0);
    System.out.println(student);
    System.out.println(student.get("Aryan"));
    System.out.println(student.keySet());// we got all the keys
   } 
}
