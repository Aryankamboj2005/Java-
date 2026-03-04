abstract class a{
    abstract void show();
    void call(){
        System.out.println("you are inside the abstract class");
    }
}
class b extends a{
    void show(){
        System.out.println("show is difined in the b class");
    }
}
public class abstract_class {
    public static void main(String[] args) {
        a A =new b();
        A.call();
        A.show();
    }
}
