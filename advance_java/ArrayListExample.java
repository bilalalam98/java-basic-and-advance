import java.util.ArrayList;
import java.util.Collection;
public class ArrayListExample {
    // the simple java array is not dynamic its of fixed size  int num[] = new int[5]; and dsa lifa functionality working like push and pop methods are not present in it 
    //the solution was colleciton api by which we can deal with these sort of issue with array linked list and all its functionalities

    // so here we are going to look at the arralist in java part of colleciton api

    // Collection nums = new ArrayList(); i can use new as its interface also we can not implement too as its api and api are not meant to be implemented
    //so there are inbuilt classes we can use
    // like  Collection ->List-> arrayList, linkedlist, Queue-> Deque , Set-> hashset, linkedhashset
    //also One more thing is Map
    // lets start with ArrayList

    public static void main(String[] args) { 
        //<Integer> this is generics we have to provide it or we will get error in for
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        // it contains many methods too like add, remove, clear, contains, etc.
        // no need to use for loop to print it will print the whole list 
        
        System.out.println(nums);
        // through forloop
        for(int item: nums){
            System.out.println(nums);
        }
    }
    
}
