
class a extends Thread{
    public void run(){
        for(int i =0 ;i<100;i++){
            System.out.println("hello");
            try{
            Thread.sleep(10);
        }
        catch(Exception e){
            System.out.println("there is some error in the sleep function " +e);

        }
    }
    }
}
class b extends Thread{
    public void run(){
        for(int i =0 ;i<100;i++){
            System.out.println("hi");
        }
    }
}
public class threaddd {
    public static void main(String[] args) {
        a a1 =new a();
        b b1 = new b();
        a1.setPriority(10);
        a1.start();
        b1.start();
    }
    
}
