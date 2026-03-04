public class finnaly1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            int c = a/b;
        }
        catch(Exception e){
            System.out.println("there is some error which is caught == " + e);
        }
        finally{ // this block run even there is no error in the code
            System.out.println("code executed sucessfully ");
        }
    }
    
}
