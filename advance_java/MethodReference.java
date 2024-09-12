import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("bilal", "asif", "zameer");
        List<String> uNames =  names.stream().map(name->name.toUpperCase()).toList();

        //now by reference we can use it
        List<String> uNamesThroughRef =  names.stream().map(String::toUpperCase).toList();

        // now foreach
        uNames.forEach(System.out::println);

    }
}
