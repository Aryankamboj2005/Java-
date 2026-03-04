
class count {
    int count = 0;
    public synchronized void  showCount(){
        count++;

    }
}
public class join1 {
    public static void main(String[] args) {
        count c = new count();
        Runnable r1 = ()-> {
            for(int i = 0 ;i<100000;i++){
                    c.showCount();   }
        };
        Runnable r2= ()->{
             for(int i = 0 ;i<100000;i++){
                    c.showCount();   }
        };
            Thread t1 = new Thread(r1);
            Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
        try{t1.join();}
        catch(Exception e){
            System.out.println("there is some error " +e);
        }
        try{t2.join();}
        catch(Exception e){
            System.out.println("there is some error " +e);
        }
        System.out.println(c.count);
    }
}
