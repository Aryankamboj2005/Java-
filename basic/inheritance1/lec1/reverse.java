import java.util.*;
public class reverse {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        char arr[] = st.toCharArray();
        for(int i = arr.length -1;i>=0;i--){
            if(arr[i]==' ') continue;
            System.out.println(arr[i]);
        }

    }
}
