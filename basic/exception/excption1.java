class myOwnCreatedException extends Exception{
    public myOwnCreatedException(String string){
        super(string);
    }

}
public class excption1 {
    public static void main(String[] args) {
        int i =0;
        int a  =10;
        int arr[]= new int[5];
        try{
            //  System.out.println(a/i);
            //System.out.println(arr[6]);
            if(i==0)
                throw  new myOwnCreatedException("please change the value form the zero to any thing else");
            int j = a/i;
        }
        catch(ArithmeticException e){
            System.out.println("there is some error in the code "+ e);
        }
        catch(ArrayIndexOutOfBoundsException r){
            System.out.println("be in your limit " +r);
        }
        catch(myOwnCreatedException e){
            System.out.println("there is some errorin the code " +e);
        }
        catch(Exception e){
            System.out.println("there is some errorin the code " +e);
        }
        System.out.println("code after try and catch block");
        System.out.println();
    }    
}
