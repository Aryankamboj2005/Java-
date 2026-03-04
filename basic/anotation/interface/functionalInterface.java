@FunctionalInterface
interface a {
    void show();

}
@FunctionalInterface
interface b {
    int  show(int i ,int j);

}
public class functionalInterface {
    public static void main(String[] args) {
        
    a temp =()-> System.out.println("this is called using the lemda expression");
    // -> this is a lamda expression 
        // its meaning is  a temp = new temp(){
//}
    temp.show();
     b temp2 = (int i,int j)-> i+j; // by default become the return
     System.out.println(temp2.show(12, 03232));
}}
