import java.util.*;
public class delbyspace {
    public static void main(String[] args){
        String name = new String("Aryan kamboj");
        for(int a =0;a<name.length();a++){
            if(name.charAt(a)==' '){
                System.out.println("");
            }
            System.out.print(name.charAt(a));
        }

    }
    
}
