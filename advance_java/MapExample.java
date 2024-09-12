import java.util.HashMap;
import java.util.Map;

public class MapExample {
    //its a key value pair 
    // like  a=>23,b=>22,c=>21
    // key can be anything
    // value can be anything

    //keys are set and values are set key can not repeat value can repeat

    public static void main(String[] args) {  
       Map<String, Integer> students = new HashMap<>();
        students.put("a", 23);
        students.put("b", 22);
        students.put("c", 21);
        students.put("a", 24);

        //to get keys

        System.out.println(students.keySet());
        //to get values
        System.out.println(students.values());
        //to get key value pair
        System.out.println(students.entrySet());
        
        // also you can get value like
        for(String key: students.keySet()){
            System.out.println(students.get(key));
        }

        //also when you are working with sycronized manner like working with multiple threads then use HashTable
        
    }
}
