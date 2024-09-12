class Outer{
    class Inner{
       public void display(){
           System.out.println("Hello, world!");
       } 
    }
    static class Innerabs{
        public void display(){
            System.out.println("Hello, world!");
        } 
     }
}
public class InnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        //Inner i = o.new Inner();// we cant do this as its defined inside the class so we have to create an object like
        //also o.new because we have to get object of outer class as its non static class
        Outer .Inner i = o.new Inner();
        i.display();

        //now for static inner class we dont need the object of the outer class
        Outer.Innerabs iabs = new Outer.Innerabs();

    }
}
