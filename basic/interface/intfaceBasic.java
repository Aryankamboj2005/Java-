// class -> class  extends
// interface to class implements
// interface to interface extends
 interface a {
    void start();
    
} 
interface b {
    void stop();
}
interface c extends b{

}
class  d implements a,c{
   public void start(){
        System.out.println("implementtation started");
    }
    public void stop(){
        System.out.println("stop the work");
    }
}
public class intfaceBasic {
    public static void main(String[] args) {
        d d1= new d();
        d1.start();
        d1.stop();
    }
    
}
