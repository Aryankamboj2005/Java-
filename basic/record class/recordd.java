record server(int id , String name){ };
public class recordd {
    public static void main(String[] args) {
        server s1= new server(1, "Aryan");
        server s2 = new server(2, "Kamboj");
        System.out.println(s1.equals(s2));
    } 
}
