@FunctionalInterface
interface A{
  //functional interface only carries one abstract method and this interface can be called through reference variable so we dont have to create object of it
  void display();
}
public class FunctionalInterfaceExample {
    public static void main(String[] args) {
      A a = new A(){
        public void display(){
            System.out.println("Hello, world!");
        }
      };
      a.display();
      // this is great but java 8 decreased the verbose and introduced lambda functions which can only be use by functional interface
    }
}
