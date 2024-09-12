class BilalException extends Exception{
    public BilalException(String s){
        // using super to call the constructor of parent class and pass the exceptions message inside it
        super(s);
    }
}
public class TryCatch {
    public static void main(String[] args) {
        //airthmatic exception
        int j= 0;
        int i= 0;
    
    //     try{
    //         j=10/i;
    //     }catch(Exception e){
    //         System.out.println(e);
    //     }
    // }
    
    // array out of bound exception
    int nums[] = new int[5];
    String str = null;

    // try{
    //     j=10/i;
    //     System.out.println(str.length());
    //     System.out.println(nums[10]);
    //     // now in this case i want to  write multiple catch block so that i can get each exception in its own catch block and to handle them garcefully like 
    //     //i want to say if you get airthmatic exception print airthmatic exception error
    //     //if you get array out of bound exception print that
    //     //or in the end print exception note the heirarchy of exceptions are 
    //     //Throwable
    //     //Exception extends Throwable
    //     //ArrayOutOfBound extends Exception
    //     //AirthmaticException extends Exceptions
    // // so you can not please Exceptions tyoe catch block on the top of its child exceptions catch 
    // }
    // catch(ArithmeticException e){
    //     System.out.println("zero can not divide to zero"+e);
    // }
    // catch(NullPointerException e){
    //     System.out.println("nums is of only 5 length"+e);
    // }
    // catch(Exception e){
    //     System.out.println("Something went wrong"+e);
    // }


    //to throw you own excetion
    // try{
    //     if(j==0){
    //         throw new ArithmeticException("zero can not divide to zero");
    //     }
    // }
    // catch(ArithmeticException e){
    //     System.out.println(str);
    // }


    //also lets make my own exception class and use it
   try{
        if(j==0){
            throw new BilalException("zero can not divide to zero");
        }
    }
    catch(BilalException e){
        System.out.println(e);
    }
}
}
