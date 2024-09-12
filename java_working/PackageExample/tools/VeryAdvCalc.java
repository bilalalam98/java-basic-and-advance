package tools;

//example of multiLevel Inheritance in veryAdvanc calculator we will get all the functions of calc and advCalc and veryAdvCalc
public class VeryAdvCalc extends AdvCalc {

    public int power (int a, int b) {
        return (int) Math.pow(a, b);
    }
}
