//now lets try to run A and B one after other 
//we can not cotrol thread working but we can set thread priority by this we mean that we suggest scheduler to give priority to that thread

class A extends Thread{
    public void run(){
        for(int i=0; i<=100; i++){
            System.out.println("A task");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e){ e.printStackTrace();}
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0; i<=100; i++){
            System.out.println("B task");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e){ e.printStackTrace();}
        }
      
    }
}

public class ThreadsPriority {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        //now we can set thread priority to tells cheduler hey you know what this thread is really important even after that its up to scheduler algortihm how it deal it
        //you can set priority and getPriority too but to set it yoiu can either give it number form 1 to 10. min === 1 and 5=== average and 10=== highest
        //or what you can do is that you can give it like below
        a.setPriority(Thread.MAX_PRIORITY);

        a.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e){ e.printStackTrace();}
        b.start();

        // now even after applying the priority we still dont get what we wanted its because what we did is we said run second thread aftersome seco but what happens machine is so fast 
        //even in that fraction of time it can run 6 to 7 iteraction to deal with it we can call sleep and pass time in it like
        // so even after this there is a change we get 2 hello at same time still thats may be there was some time in between the execution so we can only optimise it thats all
    }
}
