abstract class a{
    abstract void show();
    void helo(){
        System.out.println("hello");
    }
}

public class anamnomous_AbstrcatClass {
    public static void main(String[] args) {
        a absCl = new a(){
            void show(){
                System.out.println("using abstract class");
            }
        };
        absCl.show();
        absCl.helo();
    }
}
