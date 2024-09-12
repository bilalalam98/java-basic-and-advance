@FunctionalInterface
interface A{
  void display(int i);
}
@FunctionalInterface
interface B{
  int add(int i, int j);
}
public class LambdaExpression {
    public static void main(String[] args) {
          // A a = new A(){
          //   public void display(){
          //       System.out.println("Hello, world!");
          //   }
          // };
          // a.display();
      // now lets do it throough lambda expression

      // A a = (int i)-> {System.out.println("Hello, world!"+""+i)};

      // if there is only one line then you can do it like 
      // A a = (int i)-> System.out.println("Hello, world!"+""+i);

      // if there is only one expression you can write it like 
      A a = i-> System.out.println("Hello, world!"+""+i);
      a.display(3);

      // lets do it for B i want to return sum of two numbers
      B b = (int i, int j) -> i+j;
      int result = b.add(4,3);
    }
}

