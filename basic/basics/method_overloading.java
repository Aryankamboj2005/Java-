class overloading{
    public int calculation(int x, int y, int z){
        return x+y+z;
    }
    public int calculation(int x,int y){
        return x-y;
    }
}
public class method_overloading {
    public static void main(String[] args){
        overloading o = new overloading();
        System.out.println(o.calculation(1,2,3));
        System.out.println(o.calculation(1,2));

    }
    
}
