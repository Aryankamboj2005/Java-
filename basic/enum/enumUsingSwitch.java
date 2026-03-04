
enum status{
    running , start ,stop ,exit ,done , vlalla;
    // these are the name constant 
    // these have by default value start from the  0  to n-1
}
public class enumUsingSwitch {
    public static void main(String[] args) {
        status s2 =status.running;
        System.out.println(s2);
        System.out.println(s2.ordinal()); // print the no. of the status
        status[] s1 = status.values(); // to get all the values in the status
         // this method values() give you an array
         System.out.println(s1[2]);
         for(status s:s1){ // for printing all the values
            System.out.println(s +" : " +s.ordinal());
           switch (s) {
            case running:
                System.out.println("code running");
                
                break;
            case stop:
                System.out.println("program stops ");
                break;
            default:
                System.out.println("code goes to the default state");
                break;
           }
         }
         
    }
}
