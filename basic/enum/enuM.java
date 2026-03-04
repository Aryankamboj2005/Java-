enum status{
    running , start ,stop ,exit ,done , vlalla;
    // these are the name constant 
    // these have by default value start from the  0  to n-1
    // we cannot extend the enum class
}
public class enuM {
    public static void main(String[] args) {
        status s2 =status.running;
        System.out.println(s2);
        System.out.println(s2.ordinal()); // print the no. of the status
        status[] s1 = status.values(); // to get all the values in the status
         // this method values() give you an array
         System.out.println(s1[2]);
         for(status s:s1){ // for printing all the values
            System.out.println(s +" : " +s.ordinal());
            if(s == status.running){
            System.out.println("program is running");
         }
         else if(s ==status.start){
            System.out.println("PROGRAM BEGINS TOI START");
         }
         else if(s ==status.stop){
            System.out.println("program stops ");
         }
         else if(s==status.exit){
            System.out.println("program exit");
         }
         else if(s==status.done){
            System.out.println("program exected successfully");
         }
         else{
            System.out.println("something wrong happen");
         }
         }
         
    }
}
