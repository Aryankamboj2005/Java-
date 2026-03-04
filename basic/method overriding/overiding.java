class a{
    int  add(int a ,int b){
        System.out.println("this is the a part");
        return a+b;
    }
}
class b extends a{
    int add(int a,int b){
        System.out.println("this is the b part");
        return a+b;
    }
}
public class overiding {
    public static void main(String[] args){
        b b= new b();
        b.add(2, 05);
        a a =new b();
        a.add(122,45);
    }
}
