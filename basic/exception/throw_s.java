class a{
    void show() throws Exception{
        Class.forName("terminate");
    }
}
public class throw_s {
    static{
        System.out.println("throw_s class is running ");
    }
    public static void main(String[] args) {
        a ai = new a();
        try{
        ai.show(); }
        catch(Exception e){
            System.out.println("error cartched " + e);
        }
        System.out.println("code ended");
    }
    
}
