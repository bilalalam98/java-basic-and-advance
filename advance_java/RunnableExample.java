//now as thread we can also use runnable the use case for using it is suppose there is a situation like below
// class A extends Thread{
//     public void run(){
//         for(int i=0; i<=100; i++){
//             System.out.println("A task");
//         }
//     }
// }
// class B {
//     public void display(){
//             System.out.println("B task");
//     }
// }

// class C extends B,A{}

// now what to do in above situation where we wants to extend both B and A in C but we know multiple inheritance is not allowed in java so for this we can use Runnable which is implemented not extended
class A implements Runnable {
    public void run(){
        for(int i=0; i<=100; i++){
            System.out.println("A task");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e){ e.printStackTrace();}
        }
    }
}
class B implements Runnable {
    public void run(){
        for(int i=0; i<=100; i++){
            System.out.println("B task");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e){ e.printStackTrace();}
        }
    }
}
public class RunnableExample {
    public static void main(String[] args) {    
        A obj1 = new A();
        B obj2 = new B();

        //now we found that there is no start method in it because A is a Runnable class and B is a Runnable class so we have to create two threads first
        // and pass obj1 and obj2 to it as its one constructor takes runnable object which is obj1 and obj2

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();


        // also now move on to the optimized method ewhich is 



    }
}
