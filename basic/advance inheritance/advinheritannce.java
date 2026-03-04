sealed class a permits b,c {
// only permitted class have permission to extend the following class
}
final class b extends a {

}
sealed class c extends a permits d {

}
non-sealed class d extends c{

}
class e extends d{
    
}
public class advinheritannce {
   public static void main(String[] args) {
    
   } 
}
