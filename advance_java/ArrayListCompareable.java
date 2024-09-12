import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

//"following point compareto" now using implement compareable
class Student implements Comparable<Student> {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", marks=" + marks + "]";
    }

    //"following point compareto"
    @Override
    public int compareTo(Student that) {
        return that.marks>this.marks?1:-1;
    }

    
}
public class ArrayListCompareable {
    public static void main(String[] args) {
        
        // Comparator<Student> condition = (Student i, Student j)-> {
        //        return i.marks>j.marks?1:-1;
        // };
        List<Student> nums = new ArrayList<Student>();
        nums.add(new Student("Bilal", 90));
        nums.add(new Student("Asif", 60));
        nums.add(new Student("Zaira", 40));
        nums.add(new Student("Umair", 100));
        nums.add(new Student("Zameer", 76));

        System.out.println(nums);
        // Collections.sort(nums, condition);
        //"Point compareto"  //here we have to pass the condition unlike the integer which ran on Collections.sort(nums); also now 
        //the reason it worked is because Integer class have already Comparable implemented what if we use Student class and we want to sort it
        //here we have to make changes in order to sort it without passing condition
        //now after the changes of 'point compare to '

        Collections.sort(nums);
        System.out.println(nums);
    }
}
