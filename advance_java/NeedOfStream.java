import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;

public class NeedOfStream {

    public static void main(String[] args) {
        // List<Integer> nums = new ArrayList<Integer>();
        // nums.add(2);
        // nums.add(3);
        // nums.add(4);
        // nums.add(5);

        //now rather then inserting values 1 by one i can use Arrays.asList like below

        List<Integer> nums = Arrays.asList(2, 3, 4, 5,11);

        int sum=0;


        //lets use forEach to print all the vlaues
          //or we can use foreach like
             //or here also we can use foreach like as what lambda is expressing is consumer interface which is a functional interface
          //so we can use it like
          Consumer<Integer> con = new Consumer<Integer>(){
            public void accept(Integer i){
                System.out.println(i);
            }
          };
          nums.forEach(con);
        //   or through lambda expression
          nums.forEach(num-> System.out.println(num));

        // now suppose i want to perform some operation on it 
        for(int num: nums){
            if(num%2==0){
                num=num*2;
                sum+=num;
            }
        }
    

        System.out.println(sum+" "+nums);

        //there is a better and optimized approach for it we can use stream api stream is an interface it was introduces in java 8 also this always returns 
        //the new data thats why its good to be safe from mutation

        //so basically stream in java is a sequence of values
        //we can also perform many operations on it
        // i can use it like this too

        Stream<Integer> s1 = nums.stream();
        //the lambda function is representing predicate class  bool function test
        Stream<Integer> s2 = s1.filter(i->i%2==0);
        Stream<Integer> s3 = s2.map(i->i*2);
        int result = s3.reduce(0, (c,e)->c+e);

        //now optimized manner to use stream
        int result2 = nums.stream().map(n->n*2).filter(n->n%2==0).reduce(0, (c,e)->c+e);
        Stream<Integer> result3 = nums.stream().map(n->n*2);
        // return result2;
        System.out.println(result2+" "+result3);

        // NOW WHAT if want it to run streams parallelly
        


    }
}
