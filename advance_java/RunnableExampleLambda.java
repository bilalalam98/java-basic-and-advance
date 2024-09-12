// class A implements Runnable {
//     public void run(){
//         for(int i=0; i<=100; i++){
//             System.out.println("A task");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e){ e.printStackTrace();}
//         }
//     }
// }
// class B implements Runnable {
//     public void run(){
//         for(int i=0; i<=100; i++){
//             System.out.println("B task");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e){ e.printStackTrace();}
//         }
//     }
// }
public class RunnableExampleLambda {
    public static void main(String[] args) {    
        // A obj1 = new A();
        Runnable obj1 = ()->
        {
            for(int i=0; i<=100; i++){
                System.out.println("B task");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e){ e.printStackTrace();}
            } 
        };
        // B obj2 = new B();
        Runnable obj2 = ()->
        {
            for(int i=0; i<=100; i++){
                System.out.println("B task");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e){ e.printStackTrace();}
            } 
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}
