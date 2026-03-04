 class mobile{
    String brand;
    int price;
    String model;
    public void show(){
        System.out.println(brand +" "+" "+price+" "+model);
    }
}
public class di {
    public static void main(String[] args) {
    mobile a = new mobile();
    a.brand = "brand";
    a.price = 500;
    a.model="j2";
    a.show();
}}
