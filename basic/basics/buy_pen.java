import java.util.*;
class pen{
    public String pencost(int x){
        if(x>=10){
            return "pen purchased";
        }
        else{
            return "kuch nee mila ga 10 se neecha";}}
    public String piono(){
            return "playing piyono";}
    }

    
public class buy_pen {
    public static void main(String[] args){
    pen p = new pen();
    System.out.println(p.pencost(10));
    System.out.println(p.piono());
    }
}
