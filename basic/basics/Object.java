class calculator {
    public int add(int n,int n2){
        int result = n+n2;
        return result;
    }

}
public class Object {
    public static void main(String[] args){
        calculator cl = new calculator();

        System.out.println(cl.add(1,2));
    }
    
}
