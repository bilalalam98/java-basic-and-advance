class Mobile{
    String brand;
    String model;
    int price;
    String Name;
    static String MadeIn = "Japan";

    //now lets suppose we wants to work with the constructor now it make sense that we wrote non static var in constructor 
    //but we know contructor is called everytime we intensiated an object so static var calling in constructor is useless
    // so to deal with that we use static block as the static block is called only once in the begining of the class
    //this means static block runs after the class loads in memory and then object is intensiated 

    // so does this means if we dont create an object the static block run by it self no for that we use the Class.forName('Mobile') by this 
    //the static block of the class MObile will be executed on the class load without creating an object but have to 
    //throws ClassNotFoundException in case if we dont create an object
    static {
        MadeIn = "USA";
        System.out.println(MadeIn);
    }

    public Mobile(){
       brand = "Apple";
       model = "abc";
       price = 1000;
    //    MadeIn = "USA";   lets call it in static block
    }
    public void show(){
        System.out.println(brand + " " + model + " " + price + " " + Name + " " + MadeIn);
    }

}
public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
        // Mobile obj = new Mobile();
        // obj.show();

        //now to call the static block without creating its object 
        Class.forName("Mobile");


        // also following is anonymous object
        //new Mobile().show();   this works this is known as anonomous object
    }
}
