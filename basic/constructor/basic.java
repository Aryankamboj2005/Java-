class cons{
    int a , b;
    cons(){ //  default constructer
        System.out.println("this is a default constructor");
    }
     cons(int a,int b){ // paramaterized constructor
        this.a = a;
        this.b = b;
    }
    void show(){
        System.out.println(a + b);
    }

}

public class basic {
    public static void main(String[] args) {
        cons c =new cons(1,2);
        c.show();
        
    }
}
