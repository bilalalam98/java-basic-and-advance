class Mobile{
    String brand;
    String model;
    int price;
    String Name;

    // now to make a class variable rathe then obj variable we can use static
    // so basically above we created instance variable which will be create in side heap in its allocated object but madein is same 
    // in our case so we wants it to become part of the class and on updating it will be reflected in all the object
    static String MadeIn = "Japan";

    public void show(){
        System.out.println(brand + " " + model + " " + price + " " + Name + " " + MadeIn);
    }
}
public class StaticVariable {
   public static void main(String[] args) {
    Mobile obj = new Mobile();
    obj.brand = "Apple";
    obj.model = "Iphone 12";
    obj.price = 1000;
    obj.Name = "Bilal";
    //example for static variable
    // obj.MadeIn = "USA";
    Mobile.MadeIn = "Pakistan";

    // System.out.println(obj.brand + " " + obj.model + " " + obj.price + " " + obj.Name);

    Mobile obj2 = new Mobile();
    obj2.brand = "Samsung";
    obj2.model = "S22";
    obj2.price = 1000;
    obj2.Name = "Bilal";
    //example for static variable
    // obj.MadeIn = "Pakistan";
    //here youll observe that the in output i will get Pakistan in both objs it because of static variable also its not
    //right to envoke static variable like obj.MadeIn in fect we should call them with its class directly like below
    Mobile.MadeIn = "Pakistan";


    // System.out.println(obj2.brand + " " + obj2.model + " " + obj2.price + " " + obj2.Name);

    obj.show();
    obj2.show();
   } 
}
