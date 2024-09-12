import tools.*;
// just like this we have predefined package like 
import java.util.ArrayList;
//also system is also predefined in package but you dont have to call it thats java.lang.* which imports java.lang.System
public class Demo {
  public static void main (String args[]){
    Cal obj = new Cal();
    AdvCalc obj2 = new AdvCalc();
    ArrayList arr = new ArrayList<>();
    VeryAdvCalc obj3 = new VeryAdvCalc();
    int powerAnswer = obj3.power(3, 50);
    System.out.println(powerAnswer);
  }
}
