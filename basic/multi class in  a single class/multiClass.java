class a{
    void show(){
        System.out.println("this is the a class");
    }
    class b {
        void show1(){
            System.out.println("you are inside the b class which is again insidee the a class");
        }
    }
}
public class multiClass {
    public static void main(String[] args) {
        a a = new a();
        a.b b = a.new b(); // b is inside the a class and we also give tthe object if the a class to acces the b class
        b.show1();
    }
    
}
