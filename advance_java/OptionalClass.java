import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String args[]){
        //its used to avoid null pointer exception
        List<String> names = Arrays.asList("bilal", "asif", "zameer");
        Optional<String> name = names.stream().filter(str->str.contains("x")).findFirst();
        // System.out.println(name); now if the element is not found it will give exception of no element found and not not found exception 
        System.out.println(name.orElse("not found"));// but now it will print not found if the element is not found
        // also you can remove Optional and write orElse() directly after the streams(). ... methods in the end
    }
}
