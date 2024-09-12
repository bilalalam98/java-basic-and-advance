package PackageExample2;
import PackageExample2.tools.*;

class C extends A {

    public void abc(){
        System.out.println(marks2);
        //
    }
}
public class Demo {
    public static void main(String args[]) {
        A obj = new A();
        // System.out.println(obj.marks); hese objects are not accessible because of default modifier as i have not written public there
        System.out.println(obj.roundoff); 
        //but roundoff is present as it is public 
        B obj2 = new B();
        System.out.println(obj2.marks);
        // meanwhile marks of B is present as its in same package as my Demo where as A was in child package
        //so public is accessable everywhere 


        // System.out.println(obj2.roundoff); now private modifier is only strictly available in same class



        //System.out.println(obj.marks2);now protected is available in same class or its extented 
        //class so mark2 is not avaialable here but in Child class C
    }
}
