class a{
    void show(){
        System.out.println("show the method");
    }
}
public class anonomusClass {
    public static void main(String[] args) {
        a temp = new a(){ // creating ananomous class
            void show(){
                System.out.println("ananomous class created");
            }
        };
        temp.show();
    }
}
