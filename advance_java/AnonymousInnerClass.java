class A{
    public void display(){
        System.out.println("Outer");
    } 
}
// now suppose i want to change the implementation of display function 1 way is to extend it and in child and overide it but just for overriding the method 
//i have to make another class and create object for it the good approach is anonymoud inner class 
public class AnonymousInnerClass {

    public static void main(String[] args) {
        A a = new A(){
        public void display(){
            System.out.println("Inner anonymous");
        }
    };
    a.display();
    }
}
