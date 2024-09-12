abstract class A{
    abstract void display();
}
// same as anonymous class we can create anonymous class for abstract class too but you must be thiking that previous we learnt that we can not create object of 
//abstract class then how are we creating object of this anonymous class its because we are not creating the object of a we are creating object of this 
//anonymous inner class
public class AbstractAnonymousInnerClass {

    public static void main(String[] args) {
        A a = new A(){
        public void display(){
            System.out.println("Inner anonymous");
        }
    };
    a.display();
    }
}