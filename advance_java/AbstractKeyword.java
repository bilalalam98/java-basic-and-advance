abstract class Car{
 public abstract void start();
 public void stop(){
    System.out.println("Car stopped");
}
}
class Vehicle extends Car{
    // public void start(); suppose i have a function to start the car which i dont want to implement here but in the child classfor that we have to
    // make the function abstract but one more issue is abstract function can only be called in abstract class but is the class is abstract we can write the 
    //non abstract function in it and it will nmmot generate error if it doesnt have abstract functions in it also you have to implement the abstract function 
    // in the child class or it weill generate error also you can never create a OBJECT of a abstract class

    public void start(){
        System.out.println("Car started");
    }
}

 
public class AbstractKeyword {
    public static void main(String[] args) {
        Car c = new Vehicle();
        System.out.println("Hello, world!");
    }
}