class Mobile{
    String brand;
    String model;
    int price;
    String Name;
//note a non static variable can not be used in static method
   
    static String MadeIn = "Japan";

    public void show(){
        System.out.println(brand + " " + model + " " + price + " " + Name + " " + MadeIn);
    }

    // now lets make a static function\

    public static void show2(){
        //here we can not use non static variable in static method its because when we call them with obj.show() or obj2.show()
        //we know which object its refering to but when we call it with class namwe like Mobile.show2 how will it know which 
        //object its refering to thats why .
        // also the reason why we use static in main mehtod is because that the begining of the function in class and if its not static 
        //we will have to make object of that class but when its the beginning of class how it make object of it 
        //thjats why we user static method there
        System.out.println(MadeIn);
    }

    // now lets find the indirect manner to call the non static vlaues in static method
    public static void show3(Mobile obj){
        System.out.println(obj.brand + " " + obj.model + " " + obj.price + " " + obj.Name + " " + MadeIn);
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
    obj.brand = "Apple";
    obj.model = "Iphone 12";
    obj.price = 1000;
    obj.Name = "Bilal";
    Mobile.MadeIn = "Pakistan";

    Mobile obj2 = new Mobile();
    obj2.brand = "Samsung";
    obj2.model = "S22";
    obj2.price = 1000;
    obj2.Name = "Bilal";
    
    Mobile.MadeIn = "Pakistan";

    obj.show();
    obj2.show();

    Mobile.show2();

    Mobile.show3(obj);
    }
}
