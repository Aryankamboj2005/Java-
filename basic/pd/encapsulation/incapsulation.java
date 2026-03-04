import java.util.Scanner;
import java.util.concurrent.*;
class detail{
    public detail(){
        System.out.println("you have called the details");
    }
    private int age;
    private String name;
    public void personage(int a){
        age = a;
    }
    public int name(){
        return age;
    }
}

public class incapsulation {
    public static void main(String[] args) {
        detail d1= new detail();
            Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        d1.personage(a);
        System.out.println(d1.name());

    }
}
