class a implements Runnable{
    public void run(){
        System.out.println("running class a ");
    }
}
class b implements Runnable{
    public void run(){
        System.out.println("running class b ");
    }
}
public class runnableInterface {
    public static void main(String[] args) {
        Runnable obj1= new a();
        Runnable obj2 = new b();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
