class A  {
  public A(){
    System.out.println("B");
  }
  public A(int a){
    this();
    System.out.println("B int b");
  }
}

class B extends A{
  public B(){
    super();
    System.out.println("B");
  }

  public B(int b){
    super(b); // this will call the constructor of A with parameter b
    System.out.println("B int b");
  }
}
public class ThisAndSuper {

    public static void main (String args[]){
        B obj = new B(5);
        System.out.println(obj);
    }
}
