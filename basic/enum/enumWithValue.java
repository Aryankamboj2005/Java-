enum laptop{
    mackbook(4000) , realme ,honor(3000) , samsung(3000), min(2000);
    int price;
    

    private laptop() {
        price = 500;
    }

    private laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class enumWithValue {
    public static void main(String[] args) {
       for(laptop lp : laptop.values()){
        System.out.println(lp + " : " + lp.getPrice() );
       }  
    }
    
}
