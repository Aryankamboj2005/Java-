final class a{
    final void  show(){
        System.out.println("you  are insidde the final class a ");
    }
}
class b extends a{ // cannot entend a as a is the fina class
    void show(){ // cannot definae shoe again as show is availablei the a class with the final keyword
        System.out.println("you are inside the b method");
    }
}
public class final_keyword{
    public static void main(String[] args) {
        b b1=new b();
        b1.show();
    }
}
