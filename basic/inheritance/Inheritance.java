import java.util.*;
class cal{
    public double add(double a,double b){
        return (a+b);
    }
    public double sub(double a,double b){
        return (a+b);
    }
}
class adv extends cal{
    public double mul(double a, double b){
        return (a*b);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        adv c1  =new adv();
        System.out.println(c1.add(1, 2));
    }
}
