// these are the special symbols that tells the compliler what we exactly doing
class a {
    void show(){
        System.out.println("you are insdie the a ");
    }
} 
class b extends a{
    @Override // tells complier that we are overriding the function
    void show(){
        System.out.println("You are inside the class b");
    }
}
public class anotationBasics1 {
    
}
