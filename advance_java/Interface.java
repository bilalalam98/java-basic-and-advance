interface A{
    // abstract void display();    we dont need to write abstract in interface because it by default abstract and you can make non abstract method in it 
    void display();
    //all the variable in interface is final and static so you have to define them in the interface but it can not be change interface dont have memory on heap
    int a = 10;
    //interface allows to implement multiple inheritance in class
}
interface C{
    void run();
}

interface D extends A{
   
}
class B implements A,C{

    public void display(){
        System.out.println("Hello, world!");
    }

    public void run() {
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
}
public class Interface {

    public static void main(String[] args) {
        A a;
        //here you can tell the roadmap and wqe can not create object of it 
        a = new B();
        // to get value of a we have to use
        int value = A.a;


        //now to get run we have to create and object of the interface
        C c = new B();
        c.run();

        
    
    }
}