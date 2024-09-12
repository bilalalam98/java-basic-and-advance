enum Laptop{
    //to give price to alkl laptops
    HP(1000),DELL(1000),LENOVO, MACBOOK(1000);

    //for that i will have to creaete its constructor and pass the price also the variable

    private int price;
    private Laptop(int price){
        this.price = price;
    }
    //for lenovo as i havent mentioned price there and it will conflict with the prameterize constructor
    private Laptop(){
        this.price = 3000;
    }

    //now its private so i cant directly acess it so i have to make getter and setter
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
public class EnumClass {
    public static void main(String[] args) {
        Laptop lap = Laptop.DELL;
        System.out.println(lap+": "+lap.getPrice());

        // to get all the laptops 

        for(Laptop l : Laptop.values()){
            System.out.println(l+": "+l.getPrice());
        }
    }
}
