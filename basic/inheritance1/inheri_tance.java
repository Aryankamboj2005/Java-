class a{
    a(){
        System.out.println("inside the a");
    }
    a(int n){
        System.out.println("yopu are inside a with no");
    }
}
class b extends a{
    b(){
        System.out.println("inside the b");
    }
    b(int n){
        // super(n);
        this(); // this will call the b class means the simple constructor of the class
        System.out.println("we get the no.");
    }
    void show(){
        System.out.println("you are inside the b class");
    }
}
public class inheri_tance {
    public static void main(String[] args) {
        b a1= new b(5);
        new b().show();; // ananomous object - cannot reuse it 
    }

}
