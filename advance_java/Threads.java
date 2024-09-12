
// now as we know that working with about classes are running syncronously currently that will first make A object run and then b object aftert that
// now lets take threads example so how thread works
// now as we know that in order to worki in async method we will use thread so we first have to extend our classes from thread 
//and also thread class should contain a run object in orderto work so we will change display to run 

// class A{
//     public void display(){
//         for(int i=0; i<=10; i++){
//             System.out.println("A task");
//         }
//     }
// }
// class B{
//     public void display(){
//         for(int i=0; i<=10; i++){
//             System.out.println("B task");
//         }
//     }
// }


// converted to
class A extends Thread{
    public void run(){
        for(int i=0; i<=100; i++){
            System.out.println("A task");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0; i<=100; i++){
            System.out.println("B task");
        }
    }
}


//now afther we got our thread classes in order to run the thread we will run start method to tell the thread to run 

public class Threads {
 public static void main(String[] args) {
     A a = new A();
     B b = new B();

    //  before
    //  a.display();
    //  b.display();

    // after
    a.start();
    b.start();

    // now we will observe that a and b are running simultaniously but they are not in order like there should print a then b then a then b and so on 
    //so why its not doing that because scheduler which handles threads so now we have multicore cpu so we have 4 core we can run 4 threads 
    //so scheduler allows to run multiple threads so suppose we have 8 threads and 2 cores available so scheduler will allow only 2 threads to run at a time 

 }   
}
