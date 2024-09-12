import java.util.Arrays;
import java.util.List;

class Student{

    private String name;
    public Student(){
    }
    public Student(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //without toString()
//Student@3d4eac69
// Student@42a57993
// Student@75b84c92
// Student@232204a1
// Student@4aa298b7
// Student@7d4991ad

    @Override
    public String toString() {
        return "Student [name=" + name + "]";
    }

 
}
public class ConstructorReference {
    public static void main(String[] args) {
         List<String> names = Arrays.asList("bilal", "asif", "zameer");
        List<Student>students =  names.stream().map(
        name->new Student(name)).toList();

        //optimized method is 

        List<Student> studentsThroughRef =  names.stream().map(Student::new).toList();
        // now foreach
        students.forEach(System.out::println);
        studentsThroughRef.forEach(System.out::println);
    }
}
