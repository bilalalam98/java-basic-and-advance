//Mutation premitive type and object type variables are mutable liek int i =5; i++; i=6;
//now there are string that strings are immutable but through some concepts we make it mutable

// now threads are good to run task parallelly but the issue is when we use mutable variables with thread they can cause issue like you have an account with 10$ and 
//some how got two atm card with it now imagine you and your friend both went to atm and try to widral 8$ now what will happen so 
// to get safe from this kind of issue there is a concept of thread safety make an example for it


class Counter {
    int val;

    //syncronized reson is written in the end on the main function ignore it now untill complete understanding
    public synchronized void increment() {
        val++;
    }
}

// lets try to 
public class RaceConditions {
  public static void main(String[] args) throws InterruptedException {
    Counter c = new Counter();
    Runnable obj1 = ()->
    {
        for(int i=0; i<=10000; i++){
            c.increment();
        } 
    };
    Runnable obj2 = ()->
    {
        for(int i=0; i<=10000; i++){
            c.increment();
        } 
    };

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);

    t1.start();
    t2.start();

    // System.out.println(c.val);

    // here we thought out will be 20000 but getting 105 or 133 or random number why is that because whats happening that the t1 and t1 start running and during there 
    //running main function excutes the System.out/.println(c.val) due to which it doesnt work properly so first lets fix it so we will use join
    //method to wait for the t1 and t2 to finish and then print val

    t1.join();
    t2.join();
    System.out.println(c.val);

    //even after doing this we observe that val is not properly updated like it should be 20000 by now but it doesnt why because of the race condition
    //so what happens is that suppose first t1 go and finds the val in state 0++ means 0=0+1 then t2 go to it and finds the val state is 1++ means 1=1+1
    //then t1 and t2 both go and find the value state is 2++ means 2=2+1 but then t1 and t2 both go and find the value state is 3++ means 3=3+1
    // no in this condition there will be two iterations occured but both for 3+1 resulting 4 so handle this we are going to use synchronized keyword at our increment function at the top


  }
}
