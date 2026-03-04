interface company{
    void show();
}
class computer implements company{
    public void show(){
        System.out.println("you have given the computer which is faster");
    }
}
class laptop implements company{
    public void show(){
        System.out.println("give the laptop first");
    }
}
class code{
    void show(company c){
        c.show();
    }
}
public class interf {
    public static void main(String[] args) {
        code c = new code();
        company lp = new laptop();
        company lp1 = new computer();
        c.show(lp1);
    }
}
