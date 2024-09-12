import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class ArrayListExtented {
    public static void main(String[] args) {
        

        // now collections class contains some methods lets use its sort method now what it takes is first the list itself and second a comperator object inside which we h
        //we have to implement compare method based on which 
        //you cant to sort it in reverse order
        // Comparator<Integer> condition = new Comparator<Integer>() {
        //     public int compare(Integer i, Integer j){
        //         if(i<j){
        //             return 1;
        //         }else{
        //            return -1;
        //         }
        //     }
        // };

        // optimized approach
        Comparator<Integer> condition = (Integer i, Integer j)-> {
               return i<j?1:-1;
        };
        List<Integer> nums = new ArrayList<>();
        nums.add(52);
        nums.add(33);
        nums.add(54);
        nums.add(85);
        nums.add(74);
        nums.add(65);
        // Collections.sort(nums); this works too because of the compareable
        Collections.sort(nums, condition);
        
        System.out.println(nums);
    }
}
