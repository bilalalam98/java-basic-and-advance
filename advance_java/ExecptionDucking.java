class A {
 
    // public void show(){
    // try{
    // Class.forName("Demo");
    // }catch(Exception e){
    // System.out.println("Error");
    // }
    // }

    // now lets do it we mentioned the example below
    
    public void show() throws ClassNotFoundException{
    Class.forName("Demo");
    }
    // now we have tpo apply try  catch boundary on the method calling of this funciton
}
public class ExecptionDucking {
    //supppose you have a method inside which two methods are calling and the have critical situation then we have to do something that i have to make the whole method the critical method and will place the try and catch in and wrap the whole method in it 
    //through try catch so in those child methods we will have to place try catch block on the parent and in child i wil write like 
    //like this 

    // try{
    //     b():
    // }catch (Exception e){
        
    // }

    // and in public void b(){
    // d() throw exception
    //e() throw exception 
    // }




    // now rememeber what we done in our static block code in the main method thats worng because we applied the thore exception on our main method that means
    //we are asking jvm to handle it which means it will terminate the class so better way is below 



    public static void main(String[] args) {
        A obj = new A();
        try{
        obj.show();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
