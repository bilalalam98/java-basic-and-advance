import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class SetExample {

    public static void main(String[] args) {

        Collection<Integer> set = new HashSet<Integer>();
        //for unique values we prefer set instead of array list 
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(3);
        set.add(7);
        set.add(5);
        //one drop back is it doesnt have index value and also its not sorted
        
        // so if you want a sorted set you can go for TreeSet instead of HashSet
       
        for(int i: set){
            System.out.println(i);
        }

        // in all colection api childs we can use method iterator so we dont need to use forloop
        //how to use it 
        
        Iterator<Integer> values = set.iterator();
        // now through its hasNext method we can use while loop
        while(values.hasNext()){
            System.out.println(values.next());
        }
    }
}